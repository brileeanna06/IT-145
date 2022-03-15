
public class Monkey extends RescueAnimal { //Inherits from RescueAnimal Class
	
	//Instance variable
	private String tailLength;
	private String height;
	private String bodyLength;
	private String species;
	
	//Constructor
	public Monkey(String name, String species, String tailLength, String height, String bodyLength, String gender, String age,
	String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        setName(name);
        setSpecies(species);
        setTailLength(tailLength);
        setHeight(height);
        setBodyLength(bodyLength);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
	}

	public String toString() { //Override toString method
		return "[" + getName() + "," + species + "," + tailLength + "," + height + "," + bodyLength + "," + getGender() + "," + getAge() + "," + getWeight() + "," + getAcquisitionDate() + "," + getAcquisitionLocation() + "," + getTrainingStatus() + "," + getReserved() + "," + getInServiceLocation() + "]";	
	}
	
	//Accessor method
	public String getSpecies() {
		return species;
	}
	
	//Mutator Method
	public void setSpecies(String monkeySpecies) {
		species = monkeySpecies;
	}
	
	//Accessor
	public String getTailLength() {
		return tailLength;
	}
	
	//Mutator
	public void setTailLength(String monkeyTailLength) {
		tailLength = monkeyTailLength;
	}
	
	//Accessor
	public String getHeight() {
		return height;
	}
	
	//Mutator
	public void setHeight(String monkeyHeight) {
		height = monkeyHeight;
	}
	
	//Accessor
	public String getBodyLength() {
		return bodyLength;
	}
	
	//Mutator
	public void setBodyLength(String monkeyBodyLength) {
		bodyLength = monkeyBodyLength;
	}
		
}
