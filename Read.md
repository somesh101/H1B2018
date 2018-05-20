1. data_d contains data file as splits
  to reconstruct use
  cat * >> h1b.csv
2. Mapreduce uses /project folder for data and output 
  hadoop fs -mkdir /project
3. Put all the jars in /project before running them
4. Need to create and load data in hive seprately check h1b project file for it.
5 pig runs in local mode
 use pig -x local <pig file>
6. use projectMenu.sh
