package model;

public class Room{

  //CONSTANTES

  //ATRIBUTOS

  private int numberofroom;
  private boolean availability;
  private int days;
  private double prize;
  private double total;



  //RELACIONES

  private Pet pet;

  //CONSTRUCTOR


  public Room(int numberofroom, boolean availability, Pet pet){

    this.numberofroom = numberofroom;
    this.availability = availability;
    this.pet = pet;
  }

  //NUMBER OF ROOM
    
        /**
	* Allows to get the number of room. <br>
	* <b>post:</b> The number of the room is given.
	* @return numberofroom
	*/

  public int getNumberofroom(){

    return numberofroom;
  }

    /**
     * Allows to set the number of room. <br>
     * <b>post:</b> The number of the room is changed.
     * @param numberofroom
     */
  
    public void setNumberofroom(int numberofroom){

    this.numberofroom = numberofroom;
  }

  //AVAILABILITY

    /**
     *Allows to get the availability of the room. <br>
     * <b>post:</b> The availability of the room is given.
     * @return availability
     */

  public boolean getAvailability(){

    return availability;
  }

    /**
     *Allows to set the availability of the room. <br>
     * <b>post:</b> The availability of the room is changed.
     * @param availability
     */
    public void setAvailability(boolean availability){

    this.availability = availability;
  }

  //DAYS

    /**
     * Allows to get the days of the room. <br>
     * <b>post:</b> the days of the room is given.
     * @return days
     */

  public int getDays(){

    return days;
  }

    /**
     * Allows to set the days of the room. <br>
     * <b>post:</b> the days of the room is changed.
     * @param days
     */
    public void setDays(int days){

    this.days = days;
  }

  //PRIZE

    /**
     * Allows to get the prize of the room. <br>
     * <b>post:</b> the prize of the room is given.
     * @return
     */

  public double getPrize(){

    return prize;
  }

    /**
     * Allows to set the prize of the room. <br>
     * <b>post:</b> the prize of the room is changed.
     * @param prize
     */
    public void setPrize(double prize){

    this.prize = prize;
  }

  //TOTAL

    /**
     * Allows to get the totalPrize of the room. <br>
     * <b>post:</b> the totalPrize of the room is given.
     * @return
     */

  public double getTotal(){

    return total;
  }

    /**
     * Allows to set the totalPrize of the room. <br>
     * <b>post:</b> the totalPrize of the room is changed.
     * @param total
     */
    public void setTotal(double total){

    this.total = total;
  }

  //Pet

    /**
     * Allows to get the pet of the room. <br>
     * <b>post:</b> the pet of the room is given.
     * @return
     */

  public Pet getPet(){

    return pet;
  }

    /**
     * Allows to set the pet of the room. <br>
     * <b>post:</b> the pet of the room is changed.
     * @param pet
     */
    public void setPet(Pet pet){

    this.pet = pet;
  }

  //PRECIO POR DIA DE LA MASCOTA

    /**
     * Calculate the price per day of the room <br>
     * <b> pre: </b> the room is occupate for someone
     * <b> post </b> calculate the price
     * @return finalPrice
     */

  public double prizeForDay(){

    double finalPrice = 0.0;

    if (pet.getAnimalType() == Pet.DOG) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        finalPrice = 15000.0;

      }

      else if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        finalPrice = 17000.0;

      }

      else if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        finalPrice = 20000.0;

      }
      else {

        finalPrice = 25000.0;
      }
    }

    else if (pet.getAnimalType() == Pet.CAT) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        finalPrice = 10000.0;

      }

      else if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        finalPrice = 12000.0;

      }

      else if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        finalPrice = 15000.0;

      }
      else {

        finalPrice = 20000.0;
      }
    }

    else if (pet.getAnimalType() == Pet.BIRD) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        finalPrice = 10000.0;

      }

      else if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        finalPrice = 12000.0;

      }

      else if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        finalPrice = 20000.0;

      }
      else {

        finalPrice = 25000.0;
      }
    }

    else if (pet.getAnimalType() == Pet.OTHER) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        finalPrice = 10000.0;

      }

      else if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        finalPrice = 17000.0;

      }

      else if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        finalPrice = 30000.0;

      }
      else {

        finalPrice = 30000.0;
      }
    }

    return finalPrice;
  }

  //MOSTRAR DISPONIBILIDAD DE cuartos

    /**
     * this method allow to the information of the room <br>
     * <b> post </b> show all the atributes of the room
     * @return a message like a data sheet of the room
     */

  public String showRoom(){

    String msj = "";

    msj += "                                   La disponibilidad del cuarto numero: " + numberofroom + " es: "+ aval() +"\n";
    msj += "\n";

    if (availability == false) {

      msj += "                                   El precio de la habitacion por dias es: "+ prizeForDay() + "\n";
      msj += "\n";
    }

    return msj;
  }

  //DISPONIBILIDAD

    /**
     * this method allow th the availability of the room <br>
     * @return calculate if the availability is true or false
     */

  public String aval(){

    String msj = "";

    if (availability == true) {

      msj += "Disponible";

    }else {

      msj += "No Disponible";

    }
    return msj;
  }

  //PRECIO TOTAL

    /**
     * this method calculate the final price of the room <br>
     * @return total price
     */
  public double totalP (){

    double totalPr = 0.0;

    if (days > 0) {

      totalPr = ( prizeForDay()* days);
    }

    return totalPr;
  }
  
}