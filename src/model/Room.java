package model;
import java.util.ArrayList;

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
    this.days = days;
    this.prize = prize;
    this.total = total;
    this.pet = pet;
  }

  //NUMBER OF ROOM

  public int getNumberofroom(){

    return numberofroom;
  }

  public void setNumberofroom(int numberofroom){

    this.numberofroom = numberofroom;
  }

  //AVAILABILITY

  public boolean getAvailability(){

    return availability;
  }

  public void setAvailability(boolean availability){

    this.availability = availability;
  }

  //DAYS

  public int getDays(){

    return days;
  }

  public void setDays(int days){

    this.days = days;
  }

  //PRIZE

  public double getPrize(){

    return prize;
  }

  public void setPrize(double prize){

    this.prize = prize;
  }

  //TOTAL

  public double getTotal(){

    return total;
  }

  public void setTotal(double total){

    this.total = total;
  }

  //Pet

  public Pet getPet(){

    return pet;
  }

  public void setPet(Pet pet){

    this.pet = pet;
  }

  //PRECIO POR DIA DE LA MASCOTA

  public double prizeForDay(){

    double total = 0.0;

    if (pet.getAnimalType() == pet.DOG) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        total = 15000.0;

      }

      else if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        total = 17000.0;

      }

      else if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        total = 20000.0;

      }
      else {

        total = 25000.0;
      }
    }

    else if (pet.getAnimalType() == pet.CAT) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        total = 10000.0;

      }

      else if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        total = 12000.0;

      }

      else if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        total = 15000.0;

      }
      else {

        total = 20000.0;
      }
    }

    else if (pet.getAnimalType() == pet.BIRD) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        total = 10000.0;

      }

      else if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        total = 12000.0;

      }

      else if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        total = 20000.0;

      }
      else {

        total = 25000.0;
      }
    }

    else if (pet.getAnimalType() == pet.OTHER) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        total = 10000.0;

      }

      else if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        total = 17000.0;

      }

      else if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        total = 30000.0;

      }
      else {

        total = 30000.0;
      }
    }

    return total;
  }

  //MOSTRAR DISPONIBILIDAD DE cuartos

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
  public double totalP (){

    double totalPr = 0.0;

    if (days > 0) {

      totalPr = ( prizeForDay()* days);
    }

    return totalPr;
  }

  //CREAR HISTORIA CLINICA

  public String hC(String petName, ClinicHistory ch){

    String msj = "";

    if (pet != null) {

      if (petName.equals(pet.getName())) {

        pet.hC(ch);
        msj += "Se crea la historia de la mascota";
      }
    }

    return msj;
  }
}
