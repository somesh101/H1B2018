app = load 'h1b.csv' using org.apache.pig.piggybank.storage.CSVExcelStorage() as (s_no:int, case_status:chararray, employer_name:chararray, soc_name:chararray, job_title:chararray, full_time_position:chararray,prevailing_wage:int,year:int, worksite:chararray, longitute:double, latitute:double);
data = filter app by job_title MATCHES '.*DATA ENGINEER.*';
datag = group data by (year,worksite);
datagc = foreach datag generate group,COUNT(data.worksite) as count;
datagcf = foreach datagc generate $0.$0,$0.$1,$1;
datagcfg = group datagcf by year;

datagcfgr = foreach datagcfg {
            y = order datagcf by count desc;
            z = limit y 1;
             generate flatten(z);
            };

dump datagcfgr;



