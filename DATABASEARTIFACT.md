## Database Artifact

&nbsp;&nbsp;&nbsp;&nbsp;In this enhancement mySQL functionality was added to to give the entered contacts persistence between sessions of the program running. The first task was to install mySQL and get the local server and database created using the mySQL Workbench tool. Once these were set up I created a try-catch block to test the connection to the new database in IntelliJ. Was the connection was confirmed the process of adding data to the database could begin.

&nbsp;&nbsp;&nbsp;&nbsp;The application is adding the same data that is being put in tree map, which is input by the user. The process begins by using a mapper to pull the contacts from the contactList (the same one that the tree map uses). It writes the data to a file which is then used by a JSON parser to convert the contact into JSON format. From there the contact(s) are added to the mySQL database and can be queried.

&nbsp;&nbsp;&nbsp;&nbsp;Setting up mySQL was the most informative enhancement of all of the artifacts done so far. Learning how to set up user accounts and databases was very informative. I learned a simple “create” command in Terminal was enough to get the database created, while the local host and username are easily visible on the workbench dashboard. These were easy references when setting up the connection through code. Parsing to JSON was also a learning experience as getting it formatted correctly required careful use of variable names and strings. Otherwise the contact parameters may be listed under incorrect columns when queried.

&nbsp;&nbsp;&nbsp;&nbsp;The columns mentioned above are how the mySQL server was set up using the mySQL workbench. When the database was created the table created has a column for the, contact ID, first name, last name, phone number, and address. The primary key for the database was also set the first to better reference any of the stored contacts.

&nbsp;&nbsp;&nbsp;&nbsp;Once all of the pieces were assembled the application started to keep any contacts entered by a user in the mySQL database locally. This gave the Contact Service the last necessary feature to be fully fledged contact service in itself.

[Artifact Three Code](https://github.com/kennethpeterson1/kennethpeterson1.github.io/tree/main/ScannerProjectSQL/ScannerProject)   
[To the first artifact](SOFTWAREENGINEERINGARTIFACT.md)    
[To the second artifact](DATASTRUCTUREARTIFACT.md)  
[To the code review](CODEREVIEW.md)  
[Home](README.md)

