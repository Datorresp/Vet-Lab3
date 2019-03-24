/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $A00359369$
 * Universidad Icesi (Cali - Colombia)
 * Departamento TIC - Algoritmos y programaci�n I
 * LAB3 - Veterinaria
 * @Author: Diego Torres <diegot145@hotmail.com.com>
 * @Date: Entrega 24 Marzo 2019
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */


package ui;

import model.*;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;


public class Main {

  private Veterinary vet;
  private Scanner reader;

  public Main (){

    init();
    reader = new Scanner(System.in);
  }

  public static void main(String[] args) {

    Main m = new Main();
    m.message();
    m.showMenu();
    Calendar calendario = new GregorianCalendar();
    int ANHO = calendario.get(Calendar.YEAR);
    int MES = calendario.get(Calendar.MONTH);
    int DIA = calendario.get(Calendar.DAY_OF_MONTH);
  }

  public void showMenu(){

    int userImput = 0;

    while(userImput !=11){

      userImput = reader.nextInt();
      reader.nextLine();

      switch (userImput) {

      case 1:
        infoClient();

        try {
  				Thread.sleep(3000);
  			} catch (InterruptedException e) {

  			}

        message();
        break;

      case 2:
        createClients();

        try {
  				Thread.sleep(3000);
  			} catch (InterruptedException e) {

  			}

        message();
        break;


      case 3:
        delateClients();

        try {
  				Thread.sleep(3000);
  			} catch (InterruptedException e) {

  			}

        message();
        break;

      case 4:
        hospitalize();

        try {
  				Thread.sleep(3000);
  			} catch (InterruptedException e) {

  			}

        message();
        break;

      case 5:
        availability();

        try {
  				Thread.sleep(3000);
  			} catch (InterruptedException e) {

  			}

        message();
        break;

      case 6:
        delatePetToRoom();

        try {
  				Thread.sleep(3000);
  			} catch (InterruptedException e) {

  			}

        message();
        break;

      case 7:
        addPet();

        try {
  				Thread.sleep(3000);
  			} catch (InterruptedException e) {

  			}

        message();
        break;

      case 8:
        addHC();

        try {
  				Thread.sleep(3000);
  			} catch (InterruptedException e) {

  			}

        message();
        break;

      default:
         System.out.println("Digita una opci�n v�lida");

         message();
         break;
      }

      try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {

			}
    }
  }

  public void infoClient(){

    int showCli = 0;

    System.out.println("Presione 1 para ingresar el ID");
    System.out.println("Presione 2 para volver al menu");

    showCli = reader.nextInt();
    reader.nextLine();

    switch (showCli) {

      case 1:

      System.out.println("\n");
      System.out.println("Digite el id");

      long id = reader.nextInt();
      reader.nextLine();

      System.out.println(vet.showClients(id));

      break;
    }
	}

  public void createClients(){

    int addClients = 0;

    System.out.println("Presione 1 para ingresar los datos del cliente.");
    System.out.println("Preione 2 para salir");

    addClients = reader.nextInt();
    reader.nextLine();

    switch (addClients) {

      case 1:
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("\n");
      System.out.println("Digite el nombre");

      String name = reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite el id");

      long id = reader.nextLong();
      reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite la direccion");

      String adress = reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite el telefono");

      long phone = reader.nextLong();
      reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite el dia de nacimiento: ");

      int day = reader.nextInt();
      reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite el mes de nacimiento");

      int month = reader.nextInt();
      reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite el año de nacimiento");

      int year = reader.nextInt();
      reader.nextLine();

      Date  fecha1 = new Date (day, month, year);

      Client client = new Client(name, id, adress, phone, fecha1);

      System.out.println(vet.addClients(client));

      break;
    }
  }

  public void delateClients(){

    int delateimput = 0;

    System.out.println("Presione 1 para ingresar el ID");
    System.out.println("Presione 2 para volver al menu");

      delateimput = reader.nextInt();
      reader.nextLine();
      switch (delateimput) {

        case 1:
        System.out.println("\n");
        System.out.println("Digite el id");

        long id = reader.nextLong();
        reader.nextLine();

        System.out.println(vet.delateClients(id));
        break;
      }
  }

  public void hospitalize(){

    int addToRoom = 0;

    System.out.println("Presione 1 para ingresar los datos");
    System.out.println("Presione 2 para volver al menu");

    addToRoom = reader.nextInt();
    reader.nextLine();
    switch (addToRoom) {

      case 1:
      System.out.println("\n");
      System.out.println("Digite el id");

      long id = reader.nextLong();
      reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite el nombre de la mascota");

      String name = reader.nextLine();

      System.out.println(vet.roomAssignment(id, name));

      break;
    }
  }

  public void availability(){

    System.out.println(vet.showRoom());
  }

  public void delatePetToRoom(){

    int delateimput = 0;

    System.out.println("Presione 1 para ingresar el numero de habitacion");
    System.out.println("Presione 2 para volver al menu");

    delateimput = reader.nextInt();
    reader.nextLine();
    switch (delateimput) {

      case 1:
      System.out.println("\n");
      System.out.println("Digite el numero de habitacion: ");

      int nRoom = reader.nextInt();
      reader.nextLine();

      System.out.println(vet.delatePetToRoom(nRoom));

      break;
    }
  }

  public void addPet(){

    int addPet = 0;

    System.out.println("Presione 1 para ingresar los datos");
    System.out.println("Presione 2 para volver al menu");

    addPet = reader.nextInt();
    reader.nextLine();

    switch (addPet) {

      case 1:
      System.out.println("\n");
      System.out.println("Ingrese el id del cliente");

      long ids = reader.nextInt();
      reader.nextLine();

      System.out.println(vet.showClients(ids));

      System.out.println("\n");
      System.out.println("Ingrese el nombre de la mascota");

      String name = reader.nextLine();

      System.out.println("\n");
      System.out.println("Ingrese el peso de la mascota");

      double weigth = reader.nextDouble();
      reader.nextLine();

      System.out.println("\n");
      System.out.println("Ingrese el tipo de animal (D, C, B, O)");

      char type = reader.nextLine().charAt(0);

      System.out.println("\n");
      System.out.println("Ingrese la edad de la mascota");

      int age = reader.nextInt();
      reader.nextLine();

      Pet pet = new Pet (name, weigth, type, age, null, null);

      System.out.println(vet.addPets(ids, pet));

      break;
    }
  }

  public void addHC(){

    int delateimput = 0;

    System.out.println("Presione 1 para ingresar los datos");
    System.out.println("Presione 2 para volver al menu");

    delateimput = reader.nextInt();
    reader.nextLine();
    switch (delateimput) {

      case 1:
      System.out.println("\n");
      System.out.println("Digite el numero de habitacion: ");

      int nRoom = reader.nextInt();
      reader.nextLine();

      System.out.println("\n");
      System.out.println("Ingrese el nombre de la mascota");

      String name = reader.nextLine();

      System.out.println("\n");
      System.out.println("Ingrese el Estado");

      char state = reader.nextLine().charAt(0);

      System.out.println("\n");
      System.out.println("Ingrese el Sintoma de la mascota");

      String symptom = reader.nextLine();

      System.out.println("\n");
      System.out.println("Ingrese el diagnostico de la mascota");

      String diagnosis = reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite el dia de entrada: ");

      int day = reader.nextInt();
      reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite el mes de entrada");

      int month = reader.nextInt();
      reader.nextLine();

      System.out.println("\n");
      System.out.println("Digite el año de entrada");

      int year = reader.nextInt();
      reader.nextLine();

      Date  fecha1 = new Date (day, month, year);

      ClinicHistory Ch = new ClinicHistory(state, symptom, diagnosis, fecha1, null);

    }
  }

  public void init(){

    Medicine Acetaminofen = new Medicine("Acetaminofen", 10.0, 50000.0, 'A');
    ClinicHistory A1 = new ClinicHistory('O', "Pulgas", "tomar Acetaminofen.", new Date (01,12,2019), new Date (25,12,2019));
    A1.addMedicine(Acetaminofen);
    Client Diego = new Client("Diego", 1193254110, "Cl 14 # 83-50", 3399068, new Date (12,12,2015));
    Pet Sasha = new Pet("Sasha", 20.0, 'D', 4, A1, null);
    Diego.animalClient(Sasha);
    vet = new Veterinary("Mi pequeño animalito XD");
    vet.addClients(Diego);

  }

  public void message(){

  System.out.println("\n");
  System.out.println("_______________________________________________________________________________________________________________________ ,_     _        ____________________________________________________________________");
  System.out.println("_______________________________________________________________________________________________________________________ |||_,-~/        ____________________________________________________________________");
  System.out.println("_______________________________________________________________________________________________________________________ / _  _ |    ,--.____________________________________________________________________");
  System.out.println("_______________________________________________________________________________________________________________________(  @  @ )   / ,-'____________________________________________________________________");
  System.out.println("_______________________________________________             .--~~,__   ________________________________________________ |  _T_/-._( (   ____________________________________________________________________");
  System.out.println("_______________________________________________:-....,-------`~~'._.'  ________________________________________________ /         `. |  ____________________________________________________________________");
  System.out.println("_______________________________________________ `-,,,  ,_      ;'~U'   __________Bienvenidos a la Veterinaria__________|         _  | | ____________________________________________________________________");
  System.out.println("_______________________________________________  _,-' ,'`-__; '--.     ________________________________________________ | | ,  /      | ____________________________________________________________________");
  System.out.println("_______________________________________________ (_/'~~      ''''(;     ________________________________________________  || |-___   /   ____________________________________________________________________");
  System.out.println("_______________________________________________________________________________________________________________________ ((_/`(____,-'   ____________________________________________________________________");
  System.out.println("\n");
  System.out.println("\n");
  System.out.println("\n");
  System.out.println("                                                                     _.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._");
  System.out.println("                                                                   ,'_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._`.");
  System.out.println("                                                                  ( (      Presione 1 para ver la informacion del cliente     ) )");
  System.out.println("                                                                   ) )     Presione 2 para crear un cliente                  ( (");
  System.out.println("                                                                  ( (      presione 3 para borrar clientes                    ) )");
  System.out.println("                                                                   ) )     Presione 4 para hospitalizar                      ( (");
  System.out.println("                                                                  ( (      Presione 5 para mostrar disponibilidad             ) )");
  System.out.println("                                                                   ) )     Presione 6. para dar de alta a una mascota        ( (");
  System.out.println("                                                                  ( (      Presione 7 para crear una mascota                  ) )");
  System.out.println("                                                                   ) )     Presione 8 para crear una historia clinica        ( (");
  System.out.println("                                                                  ( (_.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.- ) )");
  System.out.println("                                                                   `._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._.-._,'");

  }
}
