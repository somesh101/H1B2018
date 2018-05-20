app = load 'h1b.csv' using org.apache.pig.piggybank.storage.CSVExcelStorage() as (s_no:int, case_status:chararray, employer_name:chararray, soc_name:chararray, job_title:chararray, full_time_position:chararray,prevailing_wage:int,year:int, worksite:chararray, longitute:double, latitute:double);
datag = group app by (year,employer_name);
datagc = foreach datag generate group,COUNT_STAR(app) as count;
datagcf = foreach datagc generate $0.$0,$0.$1,$1;
datagcfg = group datagcf by year;

datagcfgr = foreach datagcfg {
            y = order datagcf by count desc;
            z = limit y 5;
             generate flatten(z);
            };
STORE datagcfgr INTO './Answers/pig/q4/temp';
--dump datagcfgr;



