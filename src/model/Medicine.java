package model;
import java.util.ArrayList;

public class Medicine{

  //CONSTANTES

  public static final char ONCE_A_DAY = 'A';
  public static final char TWICE_A_DAY = 'B';
  public static final char THREE_TIMES_A_DAY = 'C';
  public static final char FOUR_TIMES_A_DAY = 'D';

  //ATRIBUTOS

  private String name;
  private double dose;
  private double dosePrize;
  private char frequency;

  //RELACIONES

  //CONSTRUCTOR

  public Medicine (String name, double dose, double dosePrize, char frequency){

    this.name = name;
    this.dose = dose;
    this.dosePrize = dosePrize;
    this.frequency = frequency;
  }

  //NAME

  public String getName(){

    return  name;
  }

  public void setName(String name){

    this.name = name;
  }

  //DOSE

  public double getDose(){

    return  dose;
  }

  public void setDose(double dose){

    this.dose = dose;
  }

  //DOSE PRIZE

  public double getDosePrize(){

    return  dosePrize;
  }

  public void setDosePrize(double dosePrize){

    this.dosePrize = dosePrize;
  }

  //FREQUENCY

  public char getFrequency(){

    return  frequency;
  }

  public void setFrequency(char frequency){

    this.frequency = frequency;
  }

  //MEDICADA

  public String getInfo(){

    String msj ="                                        Medicamento: "  + name + "\n";
    msj += "                                        Dosis: " + dose +"\n";
    msj += "                                        Precio por dosis: "+ dosePrize + "\n";
    msj += "                                        Frecuencia de la dosis: "+ frequency +"\n";

    return msj;
  }
}
