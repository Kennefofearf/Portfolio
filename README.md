## Welcome to Kenneth Peterson's ePortfolio!

# Intro

&nbsp;&nbsp;&nbsp;&nbsp;Throughout the Computer Science program at Southern New Hampshire University my technical knowledge has expanded exponentially. What I consider to be the most important lessons I have learned are contained inside of this ePortfolio. I have had valuable lessons in team environments, communicating to stakeholders, software engineering, data structures, algorithms, and databases. These skills have helped me grow as a professional and programmer.

&nbsp;&nbsp;&nbsp;&nbsp;I have learned about working in a team environment through code reviews from peers and source control. By taking valuable feedback from your peers, you can learn more efficient ways to code and break bad habits such as using too white space or not commenting enough. Source control helps as well with learning how your code will integrate in with your peer's on a master branch. Code reviews are what keeps faulty code from pushed to master branches, thus making the said reviews an important part of teamwork and due diligence.

&nbsp;&nbsp;&nbsp;&nbsp;Communicating to stakeholders is important as well. I have learned that it is very important to understand the goals of any project. This means knowing why the project exists and how the goal can be reached. Constant communication with clients is important as well as plenty of testing. Showing clients the plan for the program is also important as it can be easily represented through UML diagrams. These diagrams not only help developers visual the project they will be building but it also assists in the stakeholder's perception as well.

&nbsp;&nbsp;&nbsp;&nbsp;Through code my software engineering, data structures, algorithms, and databases were all implemented on a single Contact Service project that lets the user enter the contact ID, first name, last name, phone number, and address of a contact they want to add to the service. At first the project will just have Unit Testing and no persistent storage. This will be improved using the artifacts listed above and will become a real program for saving contact data.

&nbsp;&nbsp;&nbsp;&nbsp;For the software engineering artifact a logger was added to the Contact Service project's JUnit Tests. The logger was implemented using Logback and it adds logger messages to the JUnit Tests as they run. The messages will be displayed in the output on the console as well as showing all of the contact info that was entered by the user. This helps to show the flow of the application whenever it's executed and can also help with debugging by finding abnormalities in the log messages. For example: it may show the logger message that the createContact() function has started but no message that the function has stopped running. This would mean that there would be a memory leak or endless loop involved in the createContact() function.

&nbsp;&nbsp;&nbsp;&nbsp;Data Structures and Algorithms go together in this second artifact which uses the same functions as the software engineering artifact. This was the biggest overhaul to the program out of the three artifacts as it drops the Unit Tests but adds the entered contacts into a hash tree which sorts them in alphabetical order by first name. The choice to drop the Unit Tests has been decided because the program uses actual user input now instead of the hard coded values that the JUnit Tests originally used.

&nbsp;&nbsp;&nbsp;&nbsp;These changes helped me to learn why certain data structures are used over others when programming. When originally making the enhancement I was planning to use a regular hash map over a tree map. I quickly changed my mind once I figured out that hash maps are not meant to sort the data contained inside of them. A tree map was chosen as it meant to organize the data contained within and even sorts the elements inside in alphabetical order by default. Even though this sorted the data, the project still lacks any persistent storage. This is where the third enhancement comes in.

&nbsp;&nbsp;&nbsp;&nbsp;The final artifact, databases, implements mySQL into Contact Service and adds persistent storage for the entered contacts. Using a JSON parser the program will take the entered contact information and convert it into JSON format before adding the document to the database. Using the SQL workbench the entered contact information for all sessions of the program can then be queried.

&nbsp;&nbsp;&nbsp;&nbsp;With these changes, the program is given persistent storage and can actually function like a proper Contact Service. The biggest takeaway from this enhancement was the process of setting up a mySQL database locally. Using mySQL Workbench the database “contacts” was set up with the schema for each element of a contact. This means it will display a table with a column for contact ID, first name, last name, phone, and address. The primary key was also set to the first name so a contact can be easily found when querying. Once everything was set up it came down to just defining the local host, username, and password in code to link it to the Contact Service Application.

&nbsp;&nbsp;&nbsp;&nbsp;By implementing the above features into a program that originally started as a JUnit Test application, has been transformed into a real app for storing contact information. The knowledge from these artifacts has helped with a couple other projects involving my other interest which is developing iOS applications. By understanding how Unit Tests, data structures, and databases work, I can use this knowledge and apply it to any future programming projects that I may encounter.
 

[To the first artifact](SOFTWAREENGINEERINGARTIFACT.md)  
[To the second artifact](DATASTRUCTUREARTIFACT.md)    
[To the third artifact](DATABASEARTIFACT.md)   
[Original Contact Service Code](https://github.com/kennethpeterson1/kennethpeterson1.github.io/tree/main/ContactService%5BOriginal%5D)  
[To the code review](CODEREVIEW.md)  



