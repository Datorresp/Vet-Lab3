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

    /**
     *
     * @param state
     * @param symptom
     * @param diagnosis
     * @param date1
     * @param date2
     */

  public ClinicHistory(char state, String symptom, String diagnosis, Date date1, Date date2){

    this.state = state;
    this.symptom = symptom;
    this.diagnosis = diagnosis;
    this.date1 = date1;
    this.date2 = date2;
    med = new ArrayList<Medicine>();
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
     *
     * @param medicine
     * @return
     */

  public boolean addMedicine(Medicine medicine){

    return med.add(medicine);
  }

  //MOSTRAR MEDICADA

    /**
     *
     * @return
     */

  public String showMed(){

    String msj = "La medicina es: \n";

    for(int i = 0; i< med.size(); i++){

        msj += med.get(i).getInfo();
    }

    return msj;
  }

  //Fecha INGRESO

    /**
     *
     * @return
     */

  public String fecha1(){

    String message = " ";

    message += date1.getDay() +"/"+ date1.getMonth() +"/"+ date1.getYear();

    return message;
  }

  //Fecha Salida

    /**
     *
     * @return
     */

  public String fecha2(){

    String message = " ";

    message += date2.getDay() +"/"+ date2.getMonth() +"/"+ date2.getYear();

    return message;
  }

  //HISTORIA CLINICA

    /**
     *
     * @return
     */

  public String record(){

    String msj = " ";

    msj += "                                       Estado: "+ state + "\n";
    msj += "                                        Sintomas: "+ symptom + "\n";
    msj += "                                        Diagnostico: "+ diagnosis + "\n";
    msj += "                                        Medicamento: " + showMed() + "\n";
    msj += "                                        Fecha de ingreso: "+ fecha1() + "\n";
    msj += "                                        Fecha de salida: "+ fecha2() + "\n";

    return  msj;
  }
}
