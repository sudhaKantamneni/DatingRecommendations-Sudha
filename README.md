# DatingRecommendations-Sudha




# SystemDependencies-Sudha

Step1 :  In Eclipse we have to search for Git Repositories (Git) by typing Git on the right corner of Search Button
Step2 :  Use the below link of this Git project to add and clone the Project to local.
          URI: 
          https://git@github.com/sudhaKantamneni/DatingRecommendations-Sudha.git
          select protocol  -->  HTTP
        
Step3 : Create new Project in local Eclipse by using the below steps:
        Click on File --> Import --> Select  Projects from Git --> Click Next --> Select Existing Local Repository
        Select the local git repository which we added in the Step2
        Select import Using the New Project Wizard radio button
        Click on Finish
        It will open New Project Window and Select --> Java Project
        Click on Next
        Give Project Name ( different name from the Git. Dont use the same project Name)
        Uncheck Use default location
        Browse the git Project Location ( usually it is default C:\Users\userName\git\ ) and select the git project
        Click on Finish.
        It craetes Lcoal Project with Git Code
        
 Step4 : Local File is input.txt and if we want to add any data or remove we can in the input.
 
 Step 5 : Run the Java main Class  --->Right click on RecommendationApp.java and select Run as Java Application
 
 Step 6 : After running the Class we get the Output as below in the System outout:
 
 
         Output: [UserA, UserD]

Step7 : Run test case class RecommendationServiceTest.java




Problem Statement
Write code for a dating recommendation engine which would find the closest match for any
user. Each registered user is expected to have provided:
• Name
• Gender
• Age
• Interests
Recommendation engine applies following rules in given order while identifying the closest
matches:
• Gender Rule: Opposite gender is given a preference.
• Age rule: Closest match in terms of age is given a preference.
• Interest rule: Closest match in terms of interests is given a preference.
Example
Let us say the system has following registered users:
Name Gender Age Interest
UserA Female 25 Cricket
UserB Male 27 Cricket, Football, Movies
UserC Male 26 Movies, Tennis, Football, Cricket
UserD Female 24 Tennis, Football, Badminton
UserE Female 32 Cricket, Football, Movies, Badminton
If system is asked to fetch top 2 matches of UserB, the output should be the following list
having matches ordered by their closeness with UserB:
Output: [UserA, UserD]
