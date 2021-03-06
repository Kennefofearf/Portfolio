## Software Engineering Artifact

&nbsp;&nbsp;&nbsp;&nbsp;The software engineering artifact that has been chosen is a contact service application that was designed to implement JUnit testing. The application tests a series of methods using hard coded string values as arguments. This application was originally created in a class on the subject of software automation and testing.

&nbsp;&nbsp;&nbsp;&nbsp;The artifact will have a place in my ePortfolio due to how it showcases my current skills using JUnit. I chose this particular artifact due to a personal interest in Unit Testing. I admire how these tests can help developers ensure that any changes made to a program will not affect any previously added features. This displays skill in Unit Testing as an enhancement that was made was the inclusion of a logger using Logback. This improves the artifact by displaying a list of log messages after a test finishes running. These messages display when a test begins and ends and can also display any steps in between. This can help with debugging as it will show where exactly a test is running into issues. AN example of a log message would be: “Creating a contact...” and “Finished creating the contact.”

&nbsp;&nbsp;&nbsp;&nbsp;This is made possible by first creating a ListAppender to store the log messages that will come up when the unit test is run. Then using log.info(), log messages were placed in each function in ContactServiceTest.java stating when the function has started and when it has finished. The call: log.info(), allows the application to display log messages where the call is placed. In addition to this each time the testCreate() test is run it will also display all of the entered contact info along with the rest of the logger's output.

&nbsp;&nbsp;&nbsp;&nbsp;The enhancement for the first artifact was completed successfully and the application runs as planned. This enhancement has educated me on configuring IDEs, as I had to add Logback to the list of dependencies in the project. This showed how different parts of the project communicate with each other and helped me to better understand how IDEs work and compile code. Another factor in the implementation of Logback is how they are formatted using an XML file. It shows how the log message will be formatted and can even be edited through the XML file itself.  
 

[Artifact One Code](https://github.com/kennethpeterson1/kennethpeterson1.github.io/tree/main/ContactServiceEnhanced/ContactService)  
[To the second artifact](DATASTRUCTUREARTIFACT.md)    
[To the third artifact](DATABASEARTIFACT.md)  
[Original Contact Service Code](https://github.com/kennethpeterson1/kennethpeterson1.github.io/tree/main/ContactService%5BOriginal%5D)  
[To the code review](CODEREVIEW.md)  
[Home](README.md)
