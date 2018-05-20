#!/bin/bash
echo -e "${MENU}**********************Wait Starting Hadoop Services***********************${NORMAL}"
start-all.sh

show_menu()
{
    NORMAL=`echo "\033[m"`
    MENU=`echo "\033[36m"` #Blue
    NUMBER=`echo "\033[33m"` #yellow
    FGRED=`echo "\033[41m"`
    RED_TEXT=`echo "\033[31m"`
    ENTER_LINE=`echo "\033[33m"`
    echo -e "${MENU}**********************H1B APPLICATIONS***********************${NORMAL}"
    echo -e "${MENU}**${NUMBER} 1) ${MENU} Q 1a - Is the number of petitions with Data Engineer job title increasing over time?${NORMAL}"
    echo -e "${MENU}**${NUMBER} 2) ${MENU} Q 1b - Find top 5 job titles who are having highest avg growth in applications.[ALL]${NORMAL}"
    echo -e "${MENU}**${NUMBER} 3) ${MENU} Q 2a - Which part of the US has the most Data Engineer jobs for each year?${NORMAL}"
    echo -e "${MENU}**${NUMBER} 4) ${MENU} Q 2b - find top 5 locations in the US who have got certified visa for each year.[certified] ${NORMAL}"
    echo -e "${MENU}**${NUMBER} 5) ${MENU} Q 3 - Which industry(SOC_NAME) has the most number of Data Scientist positions?
[certified] ${NORMAL}"
    echo -e "${MENU}**${NUMBER} 6) ${MENU} Q 4 - Which top 5 employers file the most petitions each year? - Case Status - ALL${NORMAL}"
    echo -e "${MENU}**${NUMBER} 7) ${MENU} Q 5a - Find the most popular top 10 job positions for H1B visa applications for each year?
for all the applications${NORMAL}"
    echo -e "${MENU}**${NUMBER} 8) ${MENU} Q 5b - Find the most popular top 10 job positions for H1B visa applications for each year?
a) for certified applications${NORMAL}"
    echo -e "${MENU}**${NUMBER} 9) ${MENU} Q 6 - Find the percentage and the count of each case status on total applications for each year. Create a line graph depicting the pattern of All the cases over the period of time. ${NORMAL}"
    echo -e "${MENU}**${NUMBER} 10) ${MENU} Q 7 - Create a bar graph to depict the number of applications for each year${NORMAL}"
    echo -e "${MENU}**${NUMBER} 11) ${MENU} Q 8a - Find the average Prevailing Wage for each Job for each Year (full time separate) arrange output in descending order.${NORMAL}"
    echo -e "${MENU}**${NUMBER} 12) ${MENU} Q 8b - Find the average Prevailing Wage for each Job for each Year (take part time and full time separate) arrange output in descending order${NORMAL}"
    echo -e "${MENU}**${NUMBER} 13) ${MENU} Q 9 - Which are employers who have the highest success rate in petitions more than 70% in petitions and total petions filed more than 1000?${NORMAL}"
    echo -e "${MENU}**${NUMBER} 14) ${MENU} Q 10 - Which are the top 10 job positions which have the  success rate more than 70% in petitions and total petitions filed more than 1000? ${NORMAL}"
    echo -e "${MENU}**${NUMBER} 15) ${MENU} Q 11 - Export result for option no 12 to MySQL database.${NORMAL}"
    echo -e "${MENU}*********************************************${NORMAL}"
    echo -e "${ENTER_LINE}Please enter a menu option and enter or ${RED_TEXT}enter to exit. ${NORMAL}"
    read opt
}
function option_picked() 
{
    COLOR='\033[01;31m' # bold red
    RESET='\033[00;00m' # normal white
    MESSAGE="$1"  #modified to post the correct option selected
    echo -e "${COLOR}${MESSAGE}${RESET}"
}
clear
show_menu
	while [ opt != '' ]
    do
    if [[ $opt = "" ]]; then 
            exit;
    else
        case $opt in
        1) clear;
        option_picked "1 a) Is the number of petitions with Data Engineer job title increasing over time?";
		bash q1a.sh
        show_menu;
        ;;
        2) clear;
        option_picked "1 b) Find top 5 job titles who are having highest growth in applications. ";
        bash q1b.sh
        show_menu;
        ;;  
        3) clear;
        option_picked "2 a) Which part of the US has the most Data Engineer jobs for each year?";
		hive -f Q2a.hive;
        show_menu;
        ;;
	    4) clear;
        option_picked "2 b) find top 5 locations in the US who have got certified visa for each year.";
        hive -f Q2b.hive;
        show_menu;
        ;;  
	    5) clear;
        rm -r ./Answers/pig/q3/temp        
        option_picked "3) Which industry has the most number of Data Scientist positions?";
        pig -x local Q3.pig  >> /dev/null;
        clear;
        cat ./Answers/pig/q3/temp/*
        show_menu;
        ;;
        6) clear;
        rm -r ./Answers/pig/q4/temp
        option_picked "4)Which top 5 employers file the most petitions each year?";
		pig -x local Q4.pig  >> /dev/null;
        clear;
        cat ./Answers/pig/q4/temp/*
        show_menu;
        ;;
        7) clear;
        rm -r ./Answers/pig/q5a/temp
        option_picked "5a) Find the most popular top 10 job positions for H1B visa applications for each year?";
	    pig -x local Q5a.pig >> /dev/null;
        clear;
        cat ./Answers/pig/q5a/temp/*   
        show_menu;
        ;;
        8) clear;
        option_picked "5b) Find the most popular top 10 job positions for H1B visa applications for each year for certified applications?";
        rm -r ./Answers/pig/q5b/temp
	    pig -x local Q5b.pig >> /dev/null;
        clear;
        cat ./Answers/pig/q5b/temp/*
        show_menu;
        ;;
        9) clear;
        rm -r ./Answers/pig/q6/temp
		option_picked "6) Find the percentage and the count of each case status on total applications for each year. Create a graph depicting the pattern of All the cases over the period of time.";
		pig -x local Q6.pig  >> /dev/null;
        clear;
        cat ./Answers/pig/q6/temp/*
        show_menu;
        ;;
		10) clear;

		sleep 6
        option_picked "7) Create a bar graph to depict the number of applications for each year";
		hive -e "select year,round(count(*)) from utility.h1b_applications group by year order by year"
        show_menu;
        ;;
		11) clear;
        option_picked "8a) Find the average Prevailing Wage for each Job for each Year (for full time ) arrange output in descending order";
		hive -f Q8a.hive;
        show_menu;
        ;;
		12) clear;
		option_picked "8b) Find the average Prevailing Wage for each Job for each Year (for part time ) arrange output in descending order";
		hive -f Q8a.hive; 
        show_menu;
        ;;
		13) clear;
		option_picked "9) Which are the employers along with the number of petitions who have the success rate more than 70%  in petitions. (total petitions filed 1000 OR more than 1000) ?"
        bash q9.sh
        show_menu;
        ;;
		14) clear;

		option_picked "10) Which are the top 10 job positions which have the  success rate more than 70% in petitions and total petitions filed more than 1000?"
        bash q10.sh
        show_menu;
        ;;
		15) clear;
		option_picked "11) Export result for question no 10 to MySql database."
		sleep 10;
		sqoop export --connect jdbc:mysql://localhost/hadoop --username root --password 'myashish' --table q10 --update-mode  allowinsert --update-key employer   --export-dir /project/q9/part-r-00000 --input-fields-terminated-by '\t';
        sqoop eval --connect jdbc:mysql://localhost/hadoop --username root --password 'myashish' --query 'select * from q10';
        show_menu;
        ;;
        \n) clear;
        echo -e "${MENU}**********************Stopping Hadoop Services***********************${NORMAL}";
        stop-all.sh        
        exit;
		;;
        *) clear;
        stop-all.sh        
        option_picked "Pick an option from the menu";
        show_menu;
        ;;
    esac
fi
done
stop-all.sh
