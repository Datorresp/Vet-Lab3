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
  private Date date1;

  //CONSTRUCTOR



  public Client(String name, long id, String adress, long phone, Date date1){

    this.name = name;
    this.id = id;
    this.adress = adress;
    this.phone = phone;
    this.date1 = date1;
    pets = new ArrayList<Pet>();
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

  //DATE1

    /**
     *
     * @return
     */

  public Date getDate1(){

    return date1;
  }

    /**
     *
     * @param date1
     */
    public void setDate1(Date date1){
    this.date1 = date1;
  }

  //SHOW CLIENT

    /**
     *
     * @return
     */

  public String showClients(){

    String message ="---------------------------------------------------------------------------------------------------------------------"+ "\n";
    message += "                                        Nombre: " + name +           "\n";
    message += "                                        Numero de identificacion: " + id + "\n";
    message += "                                        Direccion: " + adress + "\n";
    message += "                                        Telefono: " + phone + "\n";
    message += "                                        Fecha de ingreso: " + fecha() + "\n";
    message += "\n";
    message += "\n";
    message += "\n";
    message += showPets();
    message += "---------------------------------------------------------------------------------------------------------------------";

    return message;
  }

  //Fecha

    /**
     *
     * @return
     */

  public String fecha(){

    String message = " ";

    message += date1.getDay() +"/"+ date1.getMonth() +"/"+ date1.getYear();

    return message;
  }

  //AÑADIR MASCOTAS

    /**
     *
     * @param pet
     * @return
     */

  public boolean animalClient(Pet pet){

     return pets.add(pet);
  }

  //MOSTRAR MASCOTAS

    /**
     *
     * @return
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

    for(int i = 0; i< pets.size(); i++){

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
        
          	public String finalAddPet(long ClientId, String petName, int userImput, String symptom, String diagnosys, String medName, double medDose, double medPrice, char medFrecuency){
		String msj = "";
                boolean encontrado = false;

                for(int i = 0; i < pets.size() && !encontrado; i++){
                    
                    if(id == ClientId ){
                        
                        if(pets.get(i).getName().equals(petName)){
                            
                            encontrado = true;
                            
                            switch (userImput) {
                                case 1: pets.get(i).addSymptoms(symptom);
                                msj += "Se ha creado correctamente los sintomas";
				break;
                                case 2: pets.get(i).addDiagnosys(diagnosys);
                                msj += "se ha creado correctamente el diagnostico";
				break;
                                case 3: pets.get(i).addMedicine(medName, medDose, medPrice, medFrecuency);
                                msj += "se ha añadido correctamente la medicina";
                                break;
			
                            }
                        }
                    }
                }

		return msj;
	}
  
}

