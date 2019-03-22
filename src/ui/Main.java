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
    int addClients = 0;
    int delateimput = 0;
    int showCli = 0;
    int addToRoom = 0;
    int addPet = 0;

    while(userImput !=11){

      userImput = reader.nextInt();
      reader.nextLine();

      switch (userImput) {


      case 1:

        System.out.println("Presione 1 para ingresar el ID");
        System.out.println("Presione 2 para volver al menu");

        showCli = reader.nextInt();
        reader.nextLine();

        switch (showCli) {

          case 1:

          System.out.println("\n");
          System.out.println("Digite el id");

          long id = reader.nextLong();
          reader.nextLine();

          System.out.println(vet.showClients(id));

          break;
        }

      break;

      case 2:

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

          System.out.println(vet.addClients(client ));

          break;
        }
        break;


      case 3:

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
        break;

        case 4:

        System.out.println("Presione 1 para ingresar los datos");
        System.out.println("Presione 2 para volver al menu");

        delateimput = reader.nextInt();
        reader.nextLine();
        switch (delateimput) {

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
        break;

        case 5:

        System.out.println(vet.showRoom());

        break;

        case 6:

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
        break;

        case 7:

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

          Pet pet = new Pet (name, weigth, type, age, null);

          System.out.println(vet.addPets(ids, pet));

          break;
        }
        break;

        default:
         System.out.println("Digita una opci�n v�lida");
         break;
      }

      try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {

			}
    }
  }

  public void init(){

    Medicine Acetaminofen = new Medicine("Acetaminofen", 10.0, 50000.0, 'A');
    ClinicHistory A1 = new ClinicHistory('O', "Pulgas", "tomar Acetaminofen.", new Date (01,12,2019), new Date (25,12,2019));
    A1.addMedicine(Acetaminofen);
    Client Diego = new Client("Diego", 1193254110, "Cl 14 # 83-50", 3399068, new Date (12,12,2015));
    Pet Sasha = new Pet("Sasha", 20.0, 'D', 4, A1);
    Diego.animalClient(Sasha);
    vet = new Veterinary("Mi pequeño animalito XD");
    vet.addClients(Diego);

  }

  public void message(){

  System.out.println("                                       Bienvenidos a la Veterinaria");
  System.out.println("\n");
  System.out.println("_____________________________________             .--~~,__  _____________________________________");
  System.out.println("_____________________________________:-....,-------`~~'._.'  _____________________________________");
  System.out.println("_____________________________________ `-,,,  ,_      ;'~U'  _____________________________________");
  System.out.println("_____________________________________  _,-' ,'`-__; '--.  _____________________________________" );
  System.out.println("_____________________________________ (_/'~~      ''''(;  _____________________________________");
  System.out.println("\n");
  System.out.println("Presione 1 para ver la informacion del cliente");
  System.out.println("Presione 2 para crear un cliente");
  System.out.println("presione 3 para borrar clientes");
  System.out.println("Presione 4 para hospitalizar");
  System.out.println("Presione 5 para mostrar disponibilidad");
  System.out.println("Presione 6. para dar de alta a una mascota");
  System.out.println("Presione 7 para crear una mascota");

  }
}
