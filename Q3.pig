app = load 'h1b.csv' using org.apache.pig.piggybank.storage.CSVExcelStorage() as (s_no:int, case_status:chararray, employer_name:chararray, soc_name:chararray, job_title:chararray, full_time_position:chararray,prevailing_wage:int,year:int, worksite:chararray, longitute:double, latitute:double);
data = filter app by job_title MATCHES '.*DATA SCIENTIST.*';
dataf = filter data by case_status MATCHES 'CERTIFIED';
datag = group dataf by soc_name;
datagc = foreach datag generate group,COUNT_STAR(dataf) as count;
result = order datagc by count desc;
res = limit result 5;
STORE res INTO './Answers/pig/q3/temp';
--dump res;

