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

  //RELACIONES

  private ClinicHistory cH;

  //CONSTRUCTOR

  public Pet(String name, double weight, char animalType, int age, ClinicHistory cH){

    this.name = name;
    this.weight = weight;
    this.animalType = animalType;
    this.age = age;
    this.cH = cH;
  }

  //NAME

  public String getName(){

    return  name;
  }

  public void setName(String name){

    this.name = name;
  }

  //WEIGHT

  public double getWeight(){

    return  weight;
  }

  public void setWeight(double weight){

    this.weight = weight;
  }

  //animalType

  public char getAnimalType(){

    return animalType;
  }

  public void setAnimalType(char animalType){

    this.animalType = animalType;
  }

  //ClinicHistory

  public ClinicHistory getCH(){

    return cH;
  }

  public void setCH(ClinicHistory cH){

    this.cH = cH;
  }

  //AGE

  public int getAge(){

    return age;
  }

  public void setAge(int age){

    this.age = age;
  }

  //GET INFO

  public String getInfo(){
    String msj = "";
    msj += "                                        El nombre es : "+ name + "\n";
    msj += "                                        El Peso es : "+ weight + "\n";
    msj += "                                        El tipo es : "+ animalType + "\n";
    msj += record() + "\n";

    return msj;
  }

  //CLINIC HISTORY

  public String record(){

    String msj =" ";

    msj += "                                       Peso: " + weight + "\n";
    msj += "                                        Edad: " + age + "\n";
    msj += "\n";
    msj += "\n";
    msj += "\n";
    msj += "--------------------------------------- Historia Clinica --------------------------------------- " + "\n";
    msj += cH.record();

    return msj;
  }
}
