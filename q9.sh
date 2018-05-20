hadoop fs -rm -r /project/ProjectQ10.jar
hadoop fs -rm -r /project/q10
hadoop fs -put ProjectQ10.jar /project 
hadoop jar ProjectQ10.jar Test2 /project/h1b.csv /project/q10
hadoop fs -cat /project/q10/*
