hadoop fs -rm -r /project/ProjectQ1a.jar
hadoop fs -rm -r /project/q1a
hadoop fs -put ProjectQ1a.jar /project 
hadoop jar ProjectQ1a.jar Test2 /project/h1b.csv /project/q1a
hadoop fs -cat /project/q1a/*

