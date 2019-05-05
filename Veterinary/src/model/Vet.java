package model;
import java.util.ArrayList;

public class Vet{

  //CONSTANTE

  public static final int NUMBEROFROOMS = 8;

  //ATRIBUTOS

  private String name;
  private double totalEarnings;

  //RELACIONES

  private final ArrayList<Client> clients;
  private final Room [] rooms;

  //CONSTRUCTOR

  public Vet(String name, double totalEarnings){

    this.name = name;
    clients = new ArrayList<>();
    rooms = new Room [NUMBEROFROOMS];
    rooms[0]= new Room(1, true, null);
    rooms[1]= new Room(2, true, null);
    rooms[2]= new Room(3, true, null);
    rooms[3]= new Room(4, true, null);
    rooms[4]= new Room(5, true, null);
    rooms[5]= new Room(6, true, null);
    rooms[6]= new Room(7, true, null);
    rooms[7]= new Room(8, true, null);

  }

  //NAME

  public String getName(){

    return name;
  }

  public void setName(String name){

    this.name = name;
  }

  //TOTALEARNINGS

  public double getTotalEarnings(){

    return totalEarnings;
  }

  public void setTotalEarnings(double totalEarnings){

    this.totalEarnings = totalEarnings;
  }

  //AÑADIR CLIENTES

    /**
     * this method add a client<br>
     * <b> post:</b> the client is added
     * @param client
     * @return if the client was added or not
     */

  public boolean addClients(Client client){

     return clients.add(client);
  }

  //ELIMINAR CLIENTES

    /**
     * this method delate clients<br>
     * <b> post: delate clients </b>
     * @param ids
     * @return a boolean if the client was eliminated or not
     */

  public boolean delateClients(long ids){

    int position = 0;
    String msj = " ";
    boolean delated= false;

    for (int i= 0; i < clients.size(); i++) {

      if (ids == clients.get(i).getId()) {

        position = i;
        clients.remove(position);
        delated = true;
      }

      else {

        msj += "El id no existe.";
      }
    }
    return delated;
  }

  //Mostrar Clientes

    /**
     * this method show a data sheet of the client <br>
     * @param ids
     * @return the data sheet of the client
     */

  public String showClients(long ids){

    String msj = "-----------------------------";

    for(int i = 0; i< clients.size(); i++){

      if(ids == clients.get(i).getId()){

        msj += clients.get(i).showClients();
      }
    }
    return msj;
  }

  //Agregar mascotasa cuartos

    /**
     * this method find a pet<br>
     * @param ids
     * @param petName
     * @return the pet
     */

  public Pet foundClientpet (long ids, String petName){

    Pet p = null;
    String msj =" ";

    for(int i = 0; i < clients.size()&& p==null; i++){

      if (ids == clients.get(i).getId()) {

          p = clients.get(i).foundPet(petName);
      }else {

        msj += "El cliente no existe";
      }
    }
    return p;
  }

    /**
     * this method assign a room to the pet <br>
     * <b> post: assign the pet to the room</b> 
     * @param ids
     * @param petName
     * @return a message if the pet was assignated or not
     */
    public String roomAssignment(long ids, String petName){

    String msj = "";

      System.out.println("prueba1");
      boolean full = false;

        for (int i = 0; rooms.length > i  && !full; i++){

        System.out.println("prueba2");
        if (rooms[i].getPet() == null) {
          System.out.println("prueba3");

          rooms[i].setPet(foundClientpet(ids, petName));
          rooms[i].setAvailability(false);
          msj = " Se Hospitalizo la mascota";
          full = true;
        }else {

          msj += "No se encontró espacio para hospitalizar la mascota";
        }
      }
    return msj;
  }

  //ELIMINAR MASCOTA DE CUARTO

    /**
     * this method eliminate a pet to the room <br>
     * <b> post: delate the pet </b>
     * @param numberofroom
     * @param day
     * @return a message if the pet was delated or not
     */

  public String delatePetToRoom (int numberofroom, int day){

  String msj = " ";
  boolean ya = false;

  for (int i = 0; i < rooms.length && !ya; i++) {

    if (numberofroom == rooms[i].getNumberofroom() && rooms[i].getPet() != null) {

      rooms[i].setPet(null);
      msj += "El total a pagar es: " + rooms[i].totalP();
      msj += "Se eliminó la mascota";
      ya = true;
      rooms[i].setAvailability(true);

    }else {

      msj += "No se pudo eliminar la mascota";

    }
  }

  return msj;
}

  //MOSTRAR CUARTO

    /**
     *this method show all the information of the room<br>
     * @return  a data sheet of the room
     */

  public String showRoom (){

    String msj = "";

    for (int i = 0; rooms.length > i; i++) {

      if (rooms[i] != null) {

          msj += rooms[i].showRoom() + "\n";

      }
    }
    return msj;
  }

  //AGREGAR MASCOTAS

    /**
     * this method add a pet<br>
     * <b> post:  add a pet </b>
     * @param ids
     * @param pet
     * @return if the pet was added or not
     */

  public String addPets(long ids, Pet pet){

    String msj = "";
    boolean find = false;

    for (int i = 0; i < clients.size() && !find; i++) {

      if (ids == clients.get(i).getId()) {

        clients.get(i).animalClient(pet);
        find = true;
        msj += "Se creo la mascota";
      }else {

        msj += "No se ha creado la mascota";
      }
    }

    return msj;
  }

    /**
     * this method change the client's information<br>
     * <b> post: </b> change the information
     * @param name
     * @param id
     * @param nAdress
     * @param nPhone
     * @return a message if the information is changed or not
     */
    public String changeCI(String name, long  id, String nAdress, long nPhone){
      
      String msj = "";
      
      for(int i = 0; i < clients.size(); i++){
          
          if(clients.get(i).getName().equals(name) && clients.get(i).getId() == id){
              
              clients.get(i).setAdress(nAdress);
              clients.get(i).setPhone(nPhone);
              msj += "Los datos se han cambiado sastifactoriamente.";
          }         
      }
      return msj;
  }
  
  public String addSymptoms(long id, String name, String diagnosys){
      
      String msj = "";
      
      for(int i = 0; i < clients.size(); i++){
          
          if(clients.get(i).getId() == id){
              
              clients.get(i).addSymptoms(name, diagnosys);
              msj += "Se creo el sintoma";
            }
        }
      return msj;
    }
  
  	public double feeServicesPeople(int userInput){
		double fee = 0.0;
		for (int i = 0; i<clients.size() ; i++ ) {
			fee += clients.get(i).petsFeeServices(userInput);	
		}
		return fee;

	}
        
        	public double feeServicesVeterinary(int userInput){
		double fee = 0.0;
		switch (userInput) {
			case 0:
				fee += feeServicesPeople(1);
				fee += feeServicesPeople(2);
				fee += feeServicesPeople(3);
				fee += feeServicesPeople(4);
				fee += feeServicesPeople(5);
				break;
			default:
				fee = feeServicesPeople(userInput);	
				break;
		}
		return fee;
	}
}
