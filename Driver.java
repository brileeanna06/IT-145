import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Driver {
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>(); //Created arraylist for monkey
    // Instance variables (if needed)

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
		String userInput;

		initializeDogList();
		initializeMonkeyList();
		
		System.out.println("To Display Menu Options, press d"); //Prompts user to request menu options
		userInput = scanner.nextLine();
		if (userInput.equals("d")) {
			displayMenu();
			userInput = scanner.nextLine();
			while (!userInput.equals("q")) { //while loop, continues loop until user inputs 'q'
				if (userInput.equals("1")) { //chose decision branching because I'm more comfortable with it, may change for a switch case option
					intakeNewDog(scanner); //prompts the ability to input new dog information
					displayMenu();
					userInput = scanner.nextLine();
				}
				else if (userInput.equals("2")) {
					intakeNewMonkey(scanner); //prompts ability to input new monkey information
					displayMenu();
					userInput = scanner.nextLine();
				}
				else if (userInput.equals("3")) {
					reserveAnimal(scanner); //prompts ability to reserve an animal that is available
					displayMenu();
					userInput = scanner.nextLine();
				}
				else if (userInput.equals("4")) {
					printAnimals("Dog"); //prints list of Dogs
					displayMenu();
					userInput = scanner.nextLine();
				}
				else if (userInput.equals("5")) {
					printAnimals("Monkey"); //Prints list of Monkeys
					displayMenu();
					userInput = scanner.nextLine();
				}
				else if (userInput.equals("6")) {
					printAnimals("Available"); //Prints list of all animals available and in service
					displayMenu();
					userInput = scanner.nextLine();
				}
				else {
					System.out.println("Incorrect entry"); //encourages user to only enter valid menu options
					displayMenu();
					userInput = scanner.nextLine();
				}
			}
		}
			// Add a loop that displays the menu, accepts the users input
			// and takes the appropriate action.
// For the project submission you must also include input validation
			// and appropriate feedback to the user.
			// Hint: create a Scanner and pass it to the necessary
			// methods 
// Hint: Menu options 4, 5, and 6 should all connect to the printAnimals() method.    
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    //Optional for testing
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("Ji", "Capuchin", "22", "22", "22", "Male", "2", "12", "2/2/22", "United States", "In Service", false, "USA");
    	
    	monkeyList.add(monkey1);
    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
        }
        //User prompted input below
        System.out.println("Enter the dog breed: ");
        String breed = scanner.nextLine();
        System.out.println("Enter the dog gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the dog age: ");
        String age = scanner.nextLine();
        System.out.println("Enter the dog weight: ");
        String weight = scanner.nextLine();
        System.out.println("Enter the acquisition date: ");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter the acquisition location: ");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Enter the Training Status: ");
        String trainingStatus = scanner.nextLine();
        System.out.println("Dog is reserved? True or false: ");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("In which country is the dog in service?");
        String inServiceCountry = scanner.nextLine();
        //uses the constructor to add the inputted information to the current dog intake
        Dog dog4 = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        dogList.add(dog4); //adds new dog info to the dog list
        System.out.println("Your entry has been recorded in the dog list");
        return; //returns to menu options
    }

        // Complete intakeNewMonkey
	//Instantiate and add the new monkey to the appropriate list
        // For the project submission you must also  validate the input
	// to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
    	System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for(Monkey monkey: monkeyList) { //input validation to see if monkey already exists in the list
            if(monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; //returns to menu
            }
        }
        //Input validation for monkey species
        System.out.println("Enter the monkey species: ");
        String species = scanner.nextLine();
        //Input validation to make sure an appropriate species is chosen
        while (!(Arrays.asList("Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamarin").contains(species))) {
        	System.out.println("You entered an invalid monkey species. Valid Monkey Species includes: Capuchin, Guenon, Macaque, Marmoset, Squirrel monkey, or Tamarin");
        	System.out.println("Enter a valid monkey species: ");
        	species = scanner.nextLine();
        }
        //User prompted input below
        System.out.println("Enter the monkey tail length: ");
        String tailLength = scanner.nextLine();
        System.out.println("Enter the monkey height: ");
        String height = scanner.nextLine();
        System.out.println("Enter the monkey body length: ");
        String bodyLength = scanner.nextLine();
        System.out.println("Enter the monkey gender: ");
        String gender = scanner.nextLine();
        System.out.println("Enter the monkey age: ");
        String age = scanner.nextLine();
        System.out.println("Enter the monkey weight: ");
        String weight = scanner.nextLine();
        System.out.println("Enter the acquisition date: ");
        String acquisitionDate = scanner.nextLine();
        System.out.println("Enter the acquisition location: ");
        String acquisitionCountry = scanner.nextLine();
        System.out.println("Enter the Training Status: ");
        String trainingStatus = scanner.nextLine();
        System.out.println("Monkey is reserved? True or false: ");
        boolean reserved = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("In which country is the monkey in service?");
        String inServiceCountry = scanner.nextLine();
		//Uses monkey constructor to combine monkey information to current input
        Monkey monkey4 = new Monkey(name, species, tailLength, height, bodyLength, gender, age, weight, acquisitionDate, acquisitionCountry, trainingStatus, reserved, inServiceCountry);
        monkeyList.add(monkey4); //adds user input to monkey list
        System.out.println("Your entry has been recorded in the monkey list");
        return; //returns to menu options
    }    

        // Reserves available animal by animal type and in service country
        public static void reserveAnimal(Scanner scanner) {
            System.out.println("What animal type are you trying to reserve? Monkey or Dog?");
            String animalType = scanner.nextLine();
            System.out.println("In which country are they in service?");
            String inServiceCountry = scanner.nextLine();
            if(animalType.equalsIgnoreCase("Monkey")) {
            	for(Monkey monkey: monkeyList) {
            		if(monkey.getInServiceLocation().equalsIgnoreCase(inServiceCountry) && monkey.getReserved() == false) {
            			monkey.setReserved(true);
            			System.out.println("You have reserved " + monkey.toString());
            		}
            		else {
            			System.out.println("No monkeys available in that service location.");
            		}
            	}
            }
            else { 
            	for(Dog dog: dogList) {
            		if(dog.getInServiceLocation().equalsIgnoreCase(inServiceCountry) & dog.getReserved() == false) {
            			dog.setReserved(true);
            		}
            		else {
            			System.out.println("No dogs available in that service location.");
            		}
            	}
            }
            }

        // Complete printAnimals
        // Include the animal name, status, acquisition country and if the animal is reserved.
	// Remember that this method connects to three different menu items.
        // The printAnimals() method has three different outputs
        // based on the listType parameter
        // dog - prints the list of dogs
        // monkey - prints the list of monkeys
        // available - prints a combined list of all animals that are
        // fully trained ("in service") but not reserved 
	// Remember that you only have to fully implement ONE of these lists. 
	// The other lists can have a print statement saying "This option needs to be implemented".
	// To score "exemplary" you must correctly implement the "available" list.
        public static void printAnimals(String Type) {
            if(Type.equals("Dog")) {
            	System.out.println("List of all dogs");
            	for(Dog dog: dogList) {
            		System.out.println(dog.toString());
            	}
            }
            if(Type.equals("Monkey")) {
            	for(Monkey monkey: monkeyList) {
            		System.out.println(monkey.toString());
            	}
            }
            if(Type.equals("Available")) {
            	System.out.println("List of all animals available and in service");
            	for(Dog dog: dogList) {
            		if(dog.getTrainingStatus().equalsIgnoreCase("in service") && !dog.getReserved()) {
            			System.out.println(dog.toString());
            		}
            	}
            	for(Monkey monkey: monkeyList) {
            		if(monkey.getTrainingStatus().equalsIgnoreCase("in service") && !monkey.getReserved()) {
            			System.out.println(monkey.toString());
            		}
            	}
            }
        }
}


