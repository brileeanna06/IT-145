# IT-145
Project coursework in IT-145. *If you are taking this course, please do not steal answers and information. I highly encourage you to do your best to learn and understand the information. Feel free to utilize my work for guidance if necessary. 

## Directions for project below
Your team lead has given you a specification document detailing Grazioso Salvare’s software needs. Other members of the Global Rain development team have already started creating the RescueAnimal.java, Dog.java, and Driver.java class files. Your team lead has asked you to modify the existing Driver.java class and create a Monkey.java class as your contribution to the team.

### Required Pre-work
To gain a clear understanding of the client’s requirements, review the Grazioso Salvare Specification Document at the bottom of these directions. As you read, pay close attention to the attributes and methods that you will need to implement into the program.

### Monkey.java Class
- Your team lead reminded you to demonstrate industry standard best practices in all of your code to ensure clarity, consistency, and efficiency among all software developers working on the program. In your code for each class, be sure to include the following:
- In-line comments that denote your changes and briefly describe the functionality of each method or element of the class
- Appropriate variable and method naming conventions
- In a new Java file, create the Monkey class, using the specification document as a guide. The Monkey class must do the following.
- Inherit from the RescueAnimal class
- Implement all attributes to meet the specifications
- Include a constructor. You may use a default constructor. To score “exemplary” on this criterion, you must include the more detailed constructor that initializes values for all attributes. Refer to the constructor in the Dog class for an example.
- Include accessors and mutators for all implemented attributes

## Driver.java Class
- In this class, you will modify and implement several different methods. You will need to refer back to the code from the other classes to properly implement these methods.
- As a reminder, you must demonstrate industry standard best practices, such as in-line comments to denote changes and describe functionality and appropriate naming conventions throughout the code that you create or modify for this class.
- First, you will modify the main() method. In main(), you must create a menu loop that does the following:
- Displays the menu by calling the displayMenu() method. This method is in the Driver.java class.
- Prompts the user for input
- Includes input validation. If the user inputs a value not on the menu, the program should print an error message.
- Takes the appropriate action based on the value that the user entered.
- Next, you will complete the intakeNewDog() method. Your completed method should do the following:
- Prompt the user for input
- Include input validation. 
- Set data for all attributes based on user input
- Add the newly instantiated dog to an ArrayList
- Next, you will implement the intakeNewMonkey() method. Before you do this, you will need to create a monkey ArrayList in the Driver.java class. Refer to the dog ArrayList for an example. Then, begin implementing the intakeNewMonkey() method. Your completed method should do the following:
- Prompt the user for input
- Include input validation for the monkey’s name and species type. If the user enters an invalid option, the program should print an error message.
- Set data for all attributes based on user input
- Add the newly instantiated monkey to an ArrayList
- Next, you will implement the reserveAnimal() method. Your completed method should do the following:
- Prompt the user for input. The user should enter their desired animal type and country.
- If there is an available animal which meets the user’s input criteria, the method should access an animal object from an ArrayList. If there are multiple animals that meet these criteria, the program should access the first animal in the ArrayList. The method should also update the “reserved” attribute of the accessed animal.
- If there is not an available animal which meets the user’s input criteria, the method should output feedback to the user letting them know that no animals of that type and location are available.
- Finally, you have been asked to implement a printAnimals() method that provides easy-to-read output displaying the details of objects in an ArrayList.
- To demonstrate this criterion in a “proficient” way, your implemented method must successfully print the ArrayList of dogs or the ArrayList of monkeys.
- To demonstrate this criterion in an “exemplary” way, your implemented method must successfully print a list of all animals that are “in service” and “available”.

# Grazioso Specification Document
## Overview
Grazioso Salvare currently uses dogs as search and rescue animals. They expect to begin training 
monkeys as search and rescue animals as well. In current operations, dogs are given the status 
of “intake” before training starts. Once in training, their status can change to one of five phases: 
Phase I, Phase II, Phase III, Phase IV, and Phase V. When a dog graduates from training, it is given 
the status of “in-service” and is considered a Rescue Animal. If a dog does not successfully make 
it through training, it is given the status of “farm,” indicating that it will live a life of leisure on a 
Grazioso Salvare farm.
## The Animals
Currently when Grazioso Salvare acquires a dog, they record the name, breed, gender, age, and 
weight. Grazioso Salvare also records the date and the location where they acquired the dog. 
Additionally, they track the training status of the dog, as described above. When a dog is “in service”, they record the country where the dog is in service and whether or not the dog is “reserved”.
## Special Note on Monkeys
As Grazioso Salvare explores the use of monkeys as search and rescue animals, they want their 
system to support monkey tracking as well as dog tracking. They have identified the following 
monkey species that are eligible for training:
- Capuchin
- Guenon
- Macaque
- Marmoset
- Squirrel monkey
- Tamarin
There are important data elements for monkeys in addition to what they use for dogs. These 
include tail length, height, body length, and species.
## Functionality
Work on this application has already been started. You must complete the following functionality:
- Create a Monkey Class that:
Inherits from the RescueAnimal class
Includes monkey-specific attributes
Includes mutator and accessor methods for each attribute
- Complete the Driver Class.
Add a menu loop that:
Displays the (included) menu
Prompts the user for input and validates the input
Takes the appropriate action based on the input
- Complete a method to intake a new dog that:
Prompts the user for input and validates the input
Sets data for all attributes
Adds the newly instantiated dog to an ArrayList
- Implement a method to intake a new monkey that:
Prompts the user for input and validates based on monkey name and 
species type
Sets data for all attributes
Adds the newly instantiated monkey to an ArrayList
- Implement a method to reserve an animal that:
Prompts the user for input
If animal matches input criteria: Accesses animal object from ArrayList
and updates the ‘reserved’ attribute of the animal
If no animal matches input criteria: Prints feedback to the user
- Implement a method to print (display) information about the animals that:
Prints a list of all dogs OR all monkeys OR all animals that are “in service” 
and available (not “reserved”)
