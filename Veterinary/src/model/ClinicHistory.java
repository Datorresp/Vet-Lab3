package model;
import java.util.ArrayList;

public class ClinicHistory{

  //CONSTANTES

  public static final char OPEN = 'O';
  public static final char CLOSE = 'C';

  //ATRIBUTOS

  private char state;
  private String symptom;
  private String diagnosis;

  //RELACIONES

  private ArrayList<Medicine> med;
  private Date date1;
  private Date date2;

  //CONSTRUCTOR


  public ClinicHistory(char state, String symptom, String diagnosis, Date date1, Date date2){

    this.state = state;
    this.symptom = symptom;
    this.diagnosis = diagnosis;
    this.date1 = date1;
    this.date2 = date2;
    med = new ArrayList<>();
  }

  //STATE

    /**
     *
     * @return
     */

  public char getState(){

    return  state;
  }

    /**
     *
     * @param state
     */
    public void setState(char state){

    this.state = state;
  }

  //SYMPTOM

    /**
     *
     * @return
     */

  public String getSymptom(){

    return  symptom;
  }

    /**
     *
     * @param symptom
     */
    public void setSymptom(String symptom){

    this.symptom = symptom;
  }

  //DIAGNOSIS

    /**
     *
     * @return
     */

  public String getDiagnosis(){

    return  diagnosis;
  }

    /**
     *
     * @param diagnosis
     */
    public void setDiagnosis(String diagnosis){

    this.diagnosis = diagnosis;
  }

  //DATE1

    /**
     *
     * @return
     */

  public Date getDate1(){

    return  date1;
  }

    /**
     *
     * @param date1
     */
    public void setDate1(Date date1){

    this.date1 = date1;
  }

  //DATE2

    /**
     *
     * @return
     */

  public Date getDate2(){

    return  date2;
  }

    /**
     *
     * @param date2
     */
    public void setDate2(Date date2){

    this.date2 = date2;
  }

  //MEDICAMENTOS

    /**
     *  this method create a medicine
     * @param medicine 
     */

  public void addMedicine(Medicine medicine){

     med.add(medicine);
  }

  //MOSTRAR MEDICADA

    /**
     * this method show the medicine <br>
     * @return the medicine 
     */

  public String showMed(){

    String msj = "La medicina es: \n";

    for(int i = 0; i< med.size(); i++){

        msj += med.get(i).getInfo();
    }

    return msj;
  }


  //HISTORIA CLINICA

    /**
     * this method show all the recors <br>
     * @return the list of all atributes of clincHistory
     */

  public String record(){

    String msj = " ";

    msj += "                                       Estado: "+ state + "\n";
    msj += "                                        Sintomas: "+ symptom + "\n";
    msj += "                                        Diagnostico: "+ diagnosis + "\n";
    msj += "                                        Medicamento: " + showMed() + "\n";
    msj += "                                        Fecha de ingreso: "+ date1.DateInfo()+ "\n";
    msj += "                                        Fecha de salida: "+ date2.DateInfo()+ "\n";

    return  msj;
  }
}
