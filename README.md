### PROJECT TITLE 
APPIUM ANDROID TESTING ON AHB APPLICATION 

#### NAME:- AHBMobileAppium

### PROJECT DESCRIPTION
The project is based on testing AHB app using Appium that consist of multiple journey's.


### USED TOOLS AND FRAMEWORKS
1.Appium

2.Maven repository

3.TestNG

4.Cucumber

5.Emulator


##### Prerequisites

Different ways to run this project.

```
1.Command Prompt
2.Eclipse
3.Batch File
```

### GETTING STARTED to mobile automation to feature

##### To run all the test cases

**Option A: Import your project into Eclipse (recommended) **

In Eclipse, go to the File menu and choose:


   - File -> Import... -> Existing Maven Projects into Workspace
  
   - Select the directory containing this file.
  
   - Click Finish.
 

You can now browse the project in Eclipse.

   - Now, right click on the project and go to the Run As
   
   - Click maven clean and then maven install

**Option B: Import your project into Command Prompt **

In command prompt, go to the path where the project is located

   - enter maven clean
   
   - enter maven install
   
**Option C: Open the .bat file **
 
###NOTE

To Run the project using user emulator , then change the following capabilities accordingly:-.

**Steps**


```
Step 1.Go to the src/test/resources source folder
Step 2.Open the properties/congif.properties
Step 3.Change the desired capabilities accordingly
Step 4.Save it.
```

### src/main/java DESCRIPTION

**com.web.base**- Define the base class that includes the waits and files and appium server connection

**com.web.screens**- Defines the Page Object model of different screens.

**com.web.utils**-  Define the actions required to run the test cases.


### src/main/resources DESCRIPTION

**log4j.properties**- log4j file to run logs.

### src/test/java DESCRIPTION

**com.web.features**- Define all the features files i.e Onboarding, Marketplace, Save, Spend & Pay and Kids

**com.web.runner**- Define the class required to run the test using TestNg

**com.web.stepDefinitions**- Defines all the methods required to run the feature files.

### src/resources/java DESCRIPTION

**properties**- It provides the data and will help to change any input. To change desired capabilities go to config.properties

**App**- It consist of AHB APP apk..


### REPORTS FOLDER

Generate the extent reports for all the test cases including screenshots if scenario gets failed.

### LOG FOLDER

Stores all the logs

### RunProject Batch File

Use this to run the project through .bat file


#### AUTHOR NAME

Shekhar Kapil
