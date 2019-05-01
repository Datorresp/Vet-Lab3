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

  //CONSTRUCTOR




    public Pet(String name, double weight, double height, char animalType, int age, Client client, Room room) {
        this.name = name;
        this.weight = weight;
        this.animalType = animalType;
        this.age = age;
        this.cH = cH;
        this.client = client;
        this.room = room;
    }



  //NAME

    /**
     *
     * @return
     */

  public String getName(){

    return  name;
  }

    /**
     *
     * @param name
     */
    public void setName(String name){

    this.name = name;
  }

  //WEIGHT

    /**
     *
     * @return
     */

  public double getWeight(){

    return  weight;
  }

    /**
     *
     * @param weight
     */
    public void setWeight(double weight){

    this.weight = weight;
  }

  //animalType

    /**
     *
     * @return
     */

  public char getAnimalType(){

    return animalType;
  }

    /**
     *
     * @param animalType
     */
    public void setAnimalType(char animalType){

    this.animalType = animalType;
  }

  //AGE

    /**
     *
     * @return
     */

  public int getAge(){

    return age;
  }

    /**
     *
     * @param age
     */
    public void setAge(int age){

    this.age = age;
  }

  //Client

    /**
     *
     * @return
     */

  public Client getClient(){

    return client;
  }

    /**
     *
     * @param client
     */
    public void setClient(Client client){

    this.client = client;
  }

  //ROOM

    /**
     *
     * @return
     */

  public Room getRoom(){

    return room;
  }

    /**
     *
     * @param room
     */
    public void setRoom(Room room){

    this.room = room;
  }

  //BORRAR HISTORIAS CLINICAS

    /**
     *
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
     *
     * @return
     */

  public String getInfo(){
    String msj = "";
    msj += "                                        El nombre es : "+ name + "\n";
    msj += "                                        El Peso es : "+ weight + "\n";
    msj += "                                        La Altura es: "+height + "\n";
    msj += "                                        El tipo es : "+ animalType + "\n";
    msj += record() + "\n";

    return msj;
  }

  //CLINIC HISTORY

    /**
     *
     * @return
     */

  public String record(){

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


  public String addMedicine(String medsName, double medsDose, double medsPrice, char medsFrecuency){

    Medicine med = new Medicine (medsName, medsDose, medsPrice, medsFrecuency);

    ClinicHistory cH1 = cH.get(cH.size()-1);

    cH1.addMedicine(med);

    return "Prescribed medication successfully added!";
	}
}
