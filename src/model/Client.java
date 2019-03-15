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

  private ArrayList<Pet> pets;
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

  public String getName(){

    return name;
  }

  public void setName(String name){

    this.name = name;
  }

  //ID

  public long getId(){

    return id;
  }

  public void setId(long id){

    this.id = id;
  }

  //ADRESS

  public String getAdress(){

    return adress;
  }

  public void setAdress(String adress){

    this.adress = adress;
  }

  //PHONE

  public long getPhone(){

    return phone;
  }

  public void setPhone(long phone){

    this.phone = phone;
  }

  //DATE1

  public Date getDate1(){

    return date1;
  }

  public void setDate1(Date date1){
    this.date1 = date1;
  }

  //SHOW CLIENT

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

  public String fecha(){

    String message = " ";

    message += date1.getDay() +"/"+ date1.getMonth() +"/"+ date1.getYear();

    return message;
  }

  //AÑADIR MASCOTAS

  public boolean animalClient(Pet pet){

     return pets.add(pet);
  }

  //MOSTRAR MASCOTAS

  public String showPets(){

    String msj = "Las mascotas son: \n";

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
}
