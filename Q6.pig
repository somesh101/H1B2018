app = load 'h1b.csv' using org.apache.pig.piggybank.storage.CSVExcelStorage() as (s_no:int, case_status:chararray, employer_name:chararray, soc_name:chararray, job_title:chararray, full_time_position:chararray,prevailing_wage:int,year:int, worksite:chararray, longitute:double, latitute:double);
datag = group app by (year,case_status);
datagc = foreach datag generate group,COUNT_STAR(app) as count;
datagcf = foreach datagc generate $0.$0,$0.$1,$1;
datagcfg = group datagcf by year;

datagcfgr = foreach datagcfg {
            y = order datagcf by count desc;
             generate flatten(y);
            };
datay = group datagcfgr by year; 
datayc = foreach datay generate group,SUM(datagcfgr.$2) as count;
dataycj = join datagcfgr by $0, datayc by $0;
result = foreach dataycj generate $0,$1,(($2*100)/$4);
STORE result INTO './Answers/pig/q6/temp';
--dump result;
