package model;
import java.util.ArrayList;

public class Veterinary{

  //CONSTANTE

  public static final int NUMBEROFROOMS = 8;

  //ATRIBUTOS

  private String name;
  private double totalEarnings;

  //RELACIONES

  private ArrayList<Client> clients;
  private Room [] rooms;

  //CONSTRUCTOR

  public Veterinary(String name){

    this.name = name;
    clients = new ArrayList<Client>();
    rooms = new Room [NUMBEROFROOMS];
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

  public String showClients(long ids){

    String msj = "-----------------------------";

    for(int i = 0; i< clients.size(); i++){

      if(ids == clients.get(i).getId()){

        msj += clients.get(i).showClients();
      }
      else {

        msj += "El cliente no existe";
      }
    }
    return msj;
  }

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

  public String roomAssignment(boolean hospitalize, long ids, String petName){

    String msj = "";

    if (hospitalize == true) {

      int i = 0;
      boolean full = true;

      while(i < rooms.length && !full) {

        if (rooms[i].getPet() == null) {

          rooms[foundRoom()].setPet(foundClientpet(ids, petName));
          msj = " Se Hospitalizo la mascota";
          full = false;
        }
        else{

          msj += "No se encontró espacio para hozpitalizar la mascota"
        }
        i++;
      }
    }
  }
}
