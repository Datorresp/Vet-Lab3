package ui;

import model.*;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

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
    int anio = calendario.get(Calendar.YEAR);
    int MES = calendario.get(Calendar.MONTH);
    int DIA = calendario.get(Calendar.DAY_OF_MONTH);

    System.out.print(anio + "\n");
    System.out.print(MES + "\n");
    System.out.print(DIA + "\n");
  }

  public void showMenu(){

    int userImput = 0;
    int addClients = 0;
    int delateimput = 0;
    int showCli = 0;

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
      }
    }
  }

  public void init(){

    Medicine Acetaminofen = new Medicine("Acetaminofen", 10.0, 50000.0, 'A');
    ClinicHistory A1 = new ClinicHistory('O', "Pulgas", "tomar Acetaminofen.", new Date (01,12,2019), new Date (25,12,2019));
    A1.addMedicine(Acetaminofen);
    Pet Sasha = new Pet("Sasha", 20.0, 'D', 4, A1);
    Client Diego = new Client("Diego", 1193254110, "Cl 14 # 83-50", 3399068, new Date (12,12,2015));
    Diego.animalClient(Sasha);
    Room R1 = new Room(true, 5, 1000.0, 10000.0, null);
    vet = new Veterinary("Mi pequeño animalito XD");
    vet.addClients(Diego);

  }

  public void message(){

  System.out.println("                                       Bienvenidos a la Veterinaria");
  System.out.println("\n");
  System.out.println("\n");
  System.out.println("Presione 1 para ver la informacion del cliente");
  System.out.println("Presione 2 para crear un cliente");
  System.out.println("presione 3 para borrar clientes");

  }
}
