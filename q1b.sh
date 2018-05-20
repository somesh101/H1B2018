hadoop fs -rm -r /project/ProjectQ1b.jar
hadoop fs -rm -r /project/q1b
hadoop fs -put ProjectQ1b.jar /project 
hadoop jar ProjectQ1b.jar Test2 /project/h1b.csv /project/q1b
hadoop fs -cat /project/q1b/*

