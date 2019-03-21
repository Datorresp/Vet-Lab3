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

  public Room(int numberofroom, boolean availability, int days, double prize, double total, Pet pet){

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

  public void prizeForDay(){

    if (pet.getAnimalType() == pet.DOG) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        prize = 15000.0;

      }

      if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        prize = 17000.0;

      }

      if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        prize = 20000.0;

      }
      else {

        prize = 25000.0;
      }
    }

    if (pet.getAnimalType() == pet.CAT) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        prize = 10000.0;

      }

      if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        prize = 12000.0;

      }

      if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        prize = 15000.0;

      }
      else {

        prize = 20000.0;
      }
    }

    if (pet.getAnimalType() == pet.BIRD) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        prize = 10000.0;

      }

      if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        prize = 12000.0;

      }

      if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        prize = 20000.0;

      }
      else {

        prize = 25000.0;
      }
    }

    if (pet.getAnimalType() == pet.OTHER) {

      if (pet.getWeight() > 1.0 && pet.getWeight() < 3.0) {

        prize = 10000.0;

      }

      if (pet.getWeight() > 3.1 && pet.getWeight() < 10.0) {

        prize = 17000.0;

      }

      if (pet.getWeight() > 10.1 && pet.getWeight() < 20) {

        prize = 30000.0;

      }
      else {

        prize = 30000.0;
      }
    }
  }

  //MOSTRAR DISPONIBILIDAD DE cuartos

  public String showRoom(){

    String msj = "";

    msj += "                                   La disponibilidad del cuarto numero: " + numberofroom + " es: "+ aval() +"\n";
    msj += "\n";

    if (availability == false) {

      msj += "                                   Lleva ocupado: " + days + " dias" + "\n";
      msj += "\n";
      msj += "                                   El precio de la habitacion por dias es: "+ prize + "\n";
      msj += "\n";
      msj += "                                   El precio total es: "+ total + "\n";
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
  public void totalP (){

    if (days > 0) {

      total = (prize * days);
    }
  }
}
