package model;

import java.util.ArrayList;

public class Pet{

  //CONSTANTE

  public static final char DOG = 'D';
  public static final char CAT = 'C';
  public static final char BIRD = 'B';
  public static final char OTHER = 'O';

  //ATRIBUTOS

  private String name;
  private double weight;
  private char animalType;
  private int age;
  private double height;
  private double bmi;

  //RELACIONES

  private ArrayList <ClinicHistory> cH;
  private Client client;
  private Room room;
  private ArrayList<Service> services;

  //CONSTRUCTOR
    
    


    public Pet(String name, double weight, double height, char animalType, int age, Client client, Room room) {
        this.name = name;
        this.weight = weight;
        this.animalType = animalType;
        this.age = age;
        this.client = client;
        this.room = room;
        cH = new ArrayList<>();
        ClinicHistory A1 = new ClinicHistory('O', "Pulgas", "tomar Acetaminofen.", new Date (01,12,2019), new Date (25,12,2019));
        Medicine Acetaminofen = new Medicine("Acetaminofen", 10.0, 50000.0, 'A');
        A1.addMedicine(Acetaminofen);
    }
  
  

  //NAME

    /**
     * Allows to get the name of the pet. <br>
     * <b>post:</b> The  name of the pet is given.
     * @return name of the pet
     */

  public String getName(){

    return  name;
  }

    /**
     * Allows to set the name of the pet. <br>
     * <b>post:</b> the name of the pet is changed.
     * @param name
     */
    public void setName(String name){

    this.name = name;
  }

  //WEIGHT

    /**
     * Allows to get the weight of the pet. <br>
     * <b>post:</b> The  weight of the pet is given.
     * @return weight
     */

  public double getWeight(){

    return  weight;
  }

    /**
     * Allows to set the weight of the pet. <br>
     * <b>post:</b> the weight of the pet is changed.
     * @param weight
     */
    public void setWeight(double weight){

    this.weight = weight;
  }

  //animalType

    /**
     * Allows to get the animal type of the pet. <br>
     * <b>post:</b> The  animal type of the pet is given.
     * @return animalType
     */

  public char getAnimalType(){

    return animalType;
  }

    /**
     * Allows to set the animaltype of the pet. <br>
     * <b>post:</b> the animal type of the pet is changed.
     * @param animalType
     */
    public void setAnimalType(char animalType){

    this.animalType = animalType;
  }

  //AGE

    /**
     * Allows to get the age of the pet. <br>
     * <b>post:</b> The  age of the pet is given. 
     * @return age
     */

  public int getAge(){

    return age;
  }

    /**
     * Allows to set the age of the pet. <br>
     * <b>post:</b> the age of the pet is changed.
     * @param age
     */
    public void setAge(int age){

    this.age = age;
  }

  //Client

    /**
     * Allows to get the owner of the pet. <br>
     * <b>post:</b> The  owner of the pet is given.
     * @return client
     */

  public Client getClient(){

    return client;
  }

    /**
     * Allows to set the owner of the pet. <br>
     * <b>post:</b> the owner of the pet is changed.
     * @param client
     */
    public void setClient(Client client){

    this.client = client;
  }

  //ROOM

    /**
     * Allows to get the room of the pet. <br>
     * <b>post:</b> The  room of the pet is given.
     * @return
     */

  public Room getRoom(){

    return room;
  }

    /**
     * Allows to set the room of the pet. <br>
     * <b>post:</b> the room of the pet is changed.
     * @param room
     */
    public void setRoom(Room room){

    this.room = room;
  }
    
            

  //BORRAR HISTORIAS CLINICAS

    /**
     * this method allow to delate th record of the pet<br>
     * <b> pre: </b>the record must be created 
     * <b> post: </b> 
     * @return
     */

  public String delateHC(){

    String msj = "";

    if (room == null) {
      cH = null;
      msj += "Se ha borraddo la historia clinica";
    }

    return msj;
  }

  //GET INFO

    /**
     * this method allow to the information of the pet<br>
     * <b> pre: the pet always exist</b>
     * <b> post: a data sheet of the pet</b>
     * @return message with the information of the pet
     */

  public String getInfo(){
    String msj = "";
    msj += "                                        El nombre es : "+ name + "\n";
    msj += "                                        El Peso es : "+ weight + "\n";
    msj += "                                        La Altura es: "+height + "\n";
    msj += "                                        El tipo es : "+ animalType + "\n";
    msj += inf() + "\n";

    return msj;
  }

  //CLINIC HISTORY

    /**
     * this method allow to the data sheet of his record
     * <b> pre: the pet always exist </b>
     * <b> post: a data sheer of the pet's record </b>
     * @return message with the animal's record
     */

  public String inf(){

    String msj =" ";

    if (cH != null) {

        msj += "                                       Peso: " + weight + "\n";
        msj += "                                        Edad: " + age + "\n";
        msj += "                                        La Altura es: "+height + "\n";
        msj += "                                        IMC: "+bmi + "\n";
        msj += "\n";
        msj += "\n";
        msj += "\n";
        msj += "--------------------------------------- Historia Clinica --------------------------------------- " + "\n";
        for(int i = 0; i < cH.size(); i++){

            if(cH.get(i) != null){
                
                msj += cH.get(i).record();
            }
        }

    }
        return msj;
  }

  
  /**
* This method allows to calculate the body mass index for a pet. <br>
* <b>pre:</b> The pet was created before and its attributes height and weight are not null neither height must be zero. <br>
* <b>post:</b> The BMI is calculated.
* @return The pet body mass index.
*/
  
  public  double calculateBmi(){
      
      
      String msj;
      
      if(height == 0.0){
      bmi = weight / (height * height);
      } else {
          msj = "No se puede calcular";
      }
      return bmi;

  }
  
 /**
*Description This method allows to add new medicines that were prescription during the hospitalization at the patient stories.
*pre: The patient clinic story must be not null.
*post: New medicines were added to the patient clinic story.
*@param medName. This param must be not null.
*@param medDose, this param refers to the amount of medicine supplied to the pet each time according the frequence assigned.
*@param medPrice. This param could be empty.
*@param medFrecuency. This param could be empty.
*@return A message that indiques if medicine was added to the patient clinic story
*/

  
  public String addMedicine(String medName, double medDose, double medPrice, char medFrecuency){
    
      String msj = "";
      Medicine medicine = new Medicine(medName, medDose, medPrice, medFrecuency);
      
      for (int i = 0; i < cH.size(); i++) {
          
          if (cH.get(i) != null) {
              
              cH.get(i).addMedicine(medicine);
              msj += "Se creo correctamente la medicina";
          }
      }
      
    
    return msj;
    }
  
  	/**
	* This method allows to add a new symptom presented during the hospitalization at the patient stories. <br>
	* <b>pre:</b> The patient clinic story must be not null. <br>
	* <b>post:</b> A new symptom were added to the patient clinic story. <br>
	* @param symptomPresented. This param must be not null.
	*/

	public void addSymptoms(String symptomPresented){
            
            
            for(int i = 0; i < cH.size(); i++){
                
            
                if(cH.get(i) != null){
                
                    cH.get(i).setSymptom(symptomPresented);
                
                }
            }
	}
        
        	/**
	* This method allows to add new notes to the possible diagnostic during the hospitalization at the patient stories. <br>
	* <b>pre:</b> The patient clinic story must be not null. <br>
	* <b>post:</b> New notes were added to the possible diagnostic in the patient clinic story.
	* @param notesOfPossibleDiagnostic. This param must be not null.
	*/

	public void addDiagnosys(String notesOfPossibleDiagnostic){

	}
        
        public void addService(Service newService){
            
            services.add(newService);
	}
        
        public double fee(char serviceType){
            double fee = 0.0;

            for (int i = 0; i<services.size() ; i++ ) {
               if(serviceType == services.get(i).getType()){
                    fee += services.get(i).getCost();
                }	
            }
            return fee;
	}
                
    /**
     * this method calculate de fee of the service
     * <b> post: </b> the fee ot each service
     * @param userInput
     * @return fee
     */
    public double servicesFees(int userInput){
		double fee = 0.0;
		switch (userInput) {
			case 1:
				fee += fee(Service.VACCINE);
				fee += fee(Service.TEETH);
				fee += fee(Service.BATHDOM);
				fee += fee(Service.NAILS);
				fee += fee(Service.BATH);
				break;
			case 2:
				fee = fee(Service.VACCINE);
				break;
			case 3:
				fee = fee(Service.TEETH);
				break;
			case 4:
				fee = fee(Service.BATHDOM);
				break;
			case 5:
				fee = fee(Service.NAILS);
				break;
			case 6:
				fee = fee(Service.BATH);
				break;	
		}
		return fee;
	}


}
