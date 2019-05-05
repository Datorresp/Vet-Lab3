package model;

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

    /**
     * Allows to get the name of the medicine. <br>
     * <b>post:</b> The  name of the medicine is given.
     * @return name of the medicince
     */

  public String getName(){

    return  name;
  }

   /**
     * Allows to set the name of the medicine. <br>
     * <b>post:</b> the name of the medicine is changed.
     * @param name
     */
  
    public void setName(String name){

    this.name = name;
  }

  //DOSE

    /**
     * Allows to get the dose of the medicine. <br>
     * <b>post:</b> The  dose of the medicine is given.
     * @return dose of the dedicine
     */

  public double getDose(){

    return  dose;
  }

    /**
     * Allows to set the dose of the medicine. <br>
     * <b>post:</b> the dose of the medicine is changed.
     * @param dose
     */
    public void setDose(double dose){

    this.dose = dose;
  }

  //DOSE PRIZE

    /**
     * Allows to get the dose price of the medicine. <br>
     * <b>post:</b> The  dose price of the medicine is given.
     * @return doseprice
     */

  public double getDosePrize(){

    return  dosePrize;
  }

    /**
     * Allows to set the dose price of the medicine. <br>
     * <b>post:</b> the dose price of the medicine is changed.
     * @param dosePrize
     */
    public void setDosePrize(double dosePrize){

    this.dosePrize = dosePrize;
  }

  //FREQUENCY

    /**
     * Allows to get the frequency of the medicine. <br>
     * <b>post:</b> The frequency of the medicine is given.
     * @return frequency of the dose
     */

  public char getFrequency(){

    return  frequency;
  }

    /**
     * Allows to set the frequency of the medicine. <br>
     * <b>post:</b> the dose price of the medicine is changed.
     * @param frequency
     */
    public void setFrequency(char frequency){

    this.frequency = frequency;
  }

  //MEDICADA

    /**
     * this method get all the info
     * @return listof the atributes of the medicine
     */

  public String getInfo(){

    String msj ="                                        Medicamento: "  + name + "\n";
    msj += "                                        Dosis: " + dose +"\n";
    msj += "                                        Precio por dosis: "+ dosePrize + "\n";
    msj += "                                        Frecuencia de la dosis: "+ frequency +"\n";

    return msj;
  }
}
