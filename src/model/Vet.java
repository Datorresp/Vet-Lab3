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

  public Vet(String name){

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

  public boolean addClients(Client client){

    return clients.add(client);
  }

  //ELIMINAR CLIENTES

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


  public String changeCI(String name, long  id, String nAdress, String nPhone){

      String msj = "";

      for(int i = 0; i < clients.size(); i++){

          if(clients.get(i).getName().equals(name) && clients.get(i).getId() == id){

              clients.get(i).setAdress(nAdress);
              clients.get(i).setId(id);
              msj += "Los datos se han cambiado sastifactoriamente.";
          }
      }
      return msj;
  }

}
