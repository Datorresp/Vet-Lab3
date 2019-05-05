package model;

public class Date{

  //ATRIBUTOS

  private int day;
  private int month;
  private int year;

  //CONSTRUCTOR

  public Date(int day, int month, int year){

    this.day = day;
    this.month = month;
    this. year = year;
  }

  //day

  	/**
	* Allows to get the number of the day of a date. <br>
	* @return The number of the day of a date.
	*/
  
  public int getDay(){

    return day;
  }

  	/**
	* Allows to change the number of the day of a date. <br>
	* <b>post:</b> The number of the day of a date is changed.
	* @param day The number of the day of a date. This param must be greater than zero.
	*/
  
  public void setDay(int day){

    this.day = day;
  }

  //month

  	/**
	* Allows to get the number of the month of a date. <br>
	* @return The number of the month of a date.
	*/

  public int getMonth(){

    return month;
  }
  
  	/**
	* Allows to change the number of the month of a date. <br>
	* <b>post:</b> The number of the month of a date is changed.
	* @param month The number of the month of a date. This param must be greater than zero.
	*/

  public void setMonth(int month){

    this.month = month;
  }

  //year

  	/**
	* Allows to get the number of the year of a date. <br>
	* @return The number of the year of a date.
	*/
  
  public int getYear(){

    return year;
  }

  public void setYear(int year){

    this.year = year;

  }
  
  	/**
	* Allows to get a date as a String in the format: DD/MM/YY. <br>
	* @return A date in the format: DD/MM/YY.
	*/

  
  public String DateInfo(){
      
      String msj = "";
      
      msj += day + month + year;
      return msj;
      
      
  }
}