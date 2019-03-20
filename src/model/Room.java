package model;
import java.util.ArrayList;

public class Room{

  //CONSTANTES

  //ATRIBUTOS

  private boolean availability;
  private int days;
  private double prize;
  private double total;



  //RELACIONES

  private Pet pet;

  //CONSTRUCTOR

  public Room(boolean availability, int days, double prize, double total, Pet pet){

    this.availability = availability;
    this.days = days;
    this.prize = prize;
    this.total = total;
    this.pet = pet;
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
  }

  //MOSTRAR DISPONIBILIDAD DE cuartos

  public String showRoom (){

    String msj = "";

    msj += "                                   La disponibilidad del cuarto es: "+ availability +"\n";

    if (availability == false) {

      msj += "                                 Lleva ocupado: " + days + "dias" + "\n";
      msj += "                                 El precio de la habitacion por dias es: "+ prize + "\n";
      msj += "                                 El precio total es: "
    }
  }
}
