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

  private ArrayList<Pet> pets;

  //CONSTRUCTOR

  public Room(boolean availability, int days, double prize, double total){

    this.availability = availability;
    this.days = days;
    this.prize = prize;
    this.total = total;
    pets = new ArrayList<Pet>();
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

  //AÑADIR MASCOTAS

  public boolean animalRoom(Pet pet){
     return pets.add(pet);
  }
}
