package model;
import java.util.ArrayList;

public class Client{

  //CONSTANTES

  //ATRIBUTOS

  private String name;
  private long id;
  private String adress;
  private long phone;

  //RELACIONES

  private final ArrayList<Pet> pets;

  //CONSTRUCTOR



  public Client(String name, long id, String adress, long phone){

    this.name = name;
    this.id = id;
    this.adress = adress;
    this.phone = phone;
    pets = new ArrayList<>();
  }


  //NAME

    /**
     * Description This method get the name
     * post: Get the name   
     * @return The name of the client
     */

  public String getName(){

    return name;
  }

    /**
     * Description This method set the name
     * post: Set the name
     * @param name of the client
     */
    public void setName(String name){

    this.name = name;
  }

  //ID

    /**
     * Description This method get the id of the client
     * post: Get the client id
     * @return client's id
     */

  public long getId(){

    return id;
  }

    /**
     * Description This method set the  clients's id
     * post set id of the client
     * @param id of the client
     */
    public void setId(long id){

    this.id = id;
  }

  //ADRESS

    /**
     * Description This method get the client's adress
     * post: get the adress of the client
     * @return clients adress
     */

  public String getAdress(){

    return adress;
  }

    /**
     * Description This method set the client's adress
     * post: set the adress of the client
     * @param adress of the client
     */
    public void setAdress(String adress){

    this.adress = adress;
  }

  //PHONE

    /**
     * Description This method get
     * @return
     */

  public long getPhone(){

    return phone;
  }

    /**
     *
     * @param phone
     */
    public void setPhone(long phone){

    this.phone = phone;
  }

  //SHOW CLIENT

    /**
     * this method show a data sheet of the client <br>
     * 
     * @return the list with the  client's data
     */

  public String showClients(){

    String message ="---------------------------------------------------------------------------------------------------------------------"+ "\n";
    message += "                                        Nombre: " + name +           "\n";
    message += "                                        Numero de identificacion: " + id + "\n";
    message += "                                        Direccion: " + adress + "\n";
    message += "                                        Telefono: " + phone + "\n";
    message += "\n";
    message += "\n";
    message += "\n";
    message += showPets();
    message += "---------------------------------------------------------------------------------------------------------------------";

    return message;
  }

  //AÑADIR MASCOTAS

    /**
     * this method add a pet <br>
     * @param pet
     * @return  a boolean if the pet was added or not
     */

  public boolean animalClient(Pet pet){

      return pets.add(pet);
  }

  //MOSTRAR MASCOTAS

    /**
     * this method show all the pets of the client <br>
     * @return pet's information
     */

  public String showPets(){

    String msj = "Las mascotas son: \n";
    msj += "_____________________________________          '',_o  _____________________________________" + "\n";
    msj += "_____________________________________!       ( (  _)  _____________________________________" + "\n";
    msj += "_____________________________________`| ,,,,_'),)=~  _____________________________________" + "\n";
    msj += "_____________________________________ (          )  _____________________________________" + "\n";
    msj += "_____________________________________  ,   ,,,,  ,  _____________________________________" + "\n";
    msj += "_____________________________________  ) ,)   < (  _____________________________________" + "\n";
    msj += "_____________________________________ < <      ',| _____________________________________" + "\n";
    msj += "_____________________________________  ',)      '_)  _____________________________________" + "\n";
    msj += "\n";
    msj += "\n";

    for(int i = 0; i < pets.size(); i++){
        msj += pets.get(i).getInfo();
    }

    return msj;
  }

  public Pet foundPet(String petName){

    Pet p = null;

    for (int i = 0; i < pets.size() && p == null; i++) {

      if (petName.equals( pets.get(i).getName())){

        p = pets.get(i);
      }
    }

    return p;
  }
  
  	/**
	*Description This method allows to update the basic data of a veterinary client, these data include, address and phone number.
	*pre: The client was created before.
	*post: The address and /or phone number of the client is updated.
	*@param nAdress
	*@param nPhone
	*/

	public void modifyAdressPhone(String nAdress, long nPhone){

		if(nAdress.equalsIgnoreCase("")){
			phone = nPhone;

		} else{
                    
                    adress = nAdress;
                }
	}
   
        public void addSymptoms(String name, String symptomps){
            
            String msj = "";
            boolean encontrado = false;
            
            for(int i = 0; i < pets.size() && !encontrado; i++){
                
                if (pets.get(i).getName().equals(name)){
                    
                    pets.get(i).addSymptoms(symptomps);
           
                }
            }
        }
        
        public double petsFeeServices(int userInput){
		double fee = 0.0;
		for (int i = 0; i < pets.size() ; i++) {
			fee += pets.get(i).servicesFees(userInput);	
		}
		return fee;
	}
        
        public double PetsServicesFees(int userInput){
            double fee = 0.0;
            switch (userInput) {
		case 0:
                	fee += petsFeeServices(1);
			fee += petsFeeServices(2);
			fee += petsFeeServices(3);
			fee += petsFeeServices(4);
			fee += petsFeeServices(5);
                        
			break;

                default:
			fee = petsFeeServices(userInput);
                        
			break;	
		}
		return fee;
	}

}

