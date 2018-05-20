app = load 'h1b.csv' using org.apache.pig.piggybank.storage.CSVExcelStorage() as (s_no:int, case_status:chararray, employer_name:chararray, soc_name:chararray, job_title:chararray, full_time_position:chararray,prevailing_wage:int,year:int, worksite:chararray, longitute:double, latitute:double);
dataf = filter app by case_status MATCHES '.*CERTIFIED.*';
datag = group dataf by (year,worksite);
datagc = foreach datag generate group,COUNT(dataf.worksite) as coun;
datagcf = foreach datagc generate $0.$0,$0.$1,$1;
datagcfg = group datagcf by year;

datagcfgr = foreach datagcfg {
            y = order datagcf by coun desc;
            z = limit y 1;
             generate flatten(z);
            };

dump datagcfgr;



