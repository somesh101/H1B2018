hadoop fs -rm -r /project/ProjectQ9.jar
hadoop fs -rm -r /project/q9
hadoop fs -put ProjectQ9.jar /project 
hadoop jar ProjectQ9.jar Test2 /project/h1b.csv /project/q9
hadoop fs -cat /project/q9/*

