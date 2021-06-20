## Data Structure

&nbsp;&nbsp;&nbsp;&nbsp;The artifact I have enhanced this time is for the algorithm/data structure artifact. Adding a hash tree and sorting its contents by the first name of entered contacts will be the purpose of this enhancement. The Contact Service project has again been used but several changes have been made to accommodate the enhancement. First the JUnit tests have been removed and it only focuses on the Contact.java and ContactService.java. Second, hard coded values will no longer be used since the JUnit tests have been removed. The application will now prompt the user and ask for the number of contacts being entered followed by all of the contact information for each.

&nbsp;&nbsp;&nbsp;&nbsp;To prompt the user for input, scanners have been used. This is first used in my prepareContactCreation() method. This will prompt the user for an integer that will tell the application how many contacts are about to be entered. The number entered in this prompt will determine how many times the createContact method will loop.

&nbsp;&nbsp;&nbsp;&nbsp;For each loop of createContact the user will be given five prompts in a row. These prompts will ask for the contact ID, first name, last name, phone number, and address. It will give the prompt to the user on every loop as each loop represents a different contact. Once all of the contacts have been entered they are populated into the treemap.

&nbsp;&nbsp;&nbsp;&nbsp;The treemap places every contact entered into the createContact method into itself. It sends the user a message showing all of the contact information when this happens. Once the treemap has been populated it automatically displays all of the contacts in alphabetical order by first name. This occurs because the first name of each contact was set to be the key for the key/value pair parameters. This sorting is done automatically by default.

&nbsp;&nbsp;&nbsp;&nbsp;Overall all of my objectives were met by the enhancement as it combines a little of both algorithms and data structures. When first starting work on this enhancement I attempted to use a regular hashmap over a treemap. This proved to be more trouble sorting than I originally thought. After some research I realized that treemaps were more easily sorted and it even sorted them alphabetically by default! This is because hashmaps are meant to be unordered sets while treemaps allow the developer to order the contents more easily. While the enhancement was met for this artifact the application still does not yet have persistent storage. In the third database enhancement I plan to resolve by implementing mySQL into the application so the contact will be able to be stored locally.
 
  
[Artifact Two Code](https://github.com/kennethpeterson1/kennethpeterson1.github.io/tree/main/ScannerProject/ScannerProject)  
[To the first artifact](SOFTWAREENGINEERINGARTIFACT.md)    
[To the third artifact](DATABASEARTIFACT.md)  
[Original Contact Service Code](https://github.com/kennethpeterson1/kennethpeterson1.github.io/tree/main/ContactService%5BOriginal%5D)  
[To the code review](CODEREVIEW.md)  
[Home](README.md)

