
package model;

public class Service {
    
    public final static double BP = 20000.0 ;
	public final static double BHDOMP = 30000.0;
	public final static double TP = 12000.0;
	public final static double NP = 8000.0;
	public final static double SP = 45000.0;

	public final static char BATH = 'B';
	public final static char BATHDOM = 'D';
	public final static char TEETH = 'T';
	public final static char NAILS = 'N';
	public final static char VACCINE = 'V';


	//ATTRIBUTES
	private char type;
	private double cost;
	private  long clientId;
	private  String petName;


	//RELATIONSHIPS
	private Pet pet;
	private  Date date1;



	//METHODS

	public Service(char type, long clientId, String petId, Pet pet, Date date1){
		this.type = type;
		this.clientId = clientId;
		this.petName = petId;
		this.pet = pet;
		this.date1 = date1;
	}

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Date getD1() {
        return date1;
    }

    public void setD1(Date date1) {
        this.date1 = date1;
    }

    /**
     * this method allow to the list of the service
     * @return list of the service
     */
    public String serviceInfo(){
		String msj = "";
			   msj += "\n";
			   msj += "+-----------------------------------------------------------------------------+\n";
			   msj += " servicio: "+typeToString(type)+"\n";
			   msj += " precio: "+cost+" \n";
			   msj += " identificacion del cliente: "+clientId+"\n";
			   msj += " nombre de la mascota: " +petName+ "\n";
			   msj += " fecha: " +date1.DateInfo()+"\n";
			   msj += "+-----------------------------------------------------------------------------+\n";
		
                           return msj;

	}

    /**
     * this method let know wich is each service
     * @param type
     * @return service's name
     */
    public String typeToString(char type){
		
            String msj = "";
	
            switch (type) {
	
                case BATH:
		
                    msj = "BAÑO";
		
                    break;
		
                case BATHDOM:
		
                    msj = "BAÑO A DOMICILIO";
		
                    break;
		
                case TEETH:
		
                    msj = "PROFILAXIS DENTAL";
		
                    break;
		
                case NAILS:
		
                    msj = "CORTE DE UÑAS";
		
                    break;
		
                case VACCINE:
		
                    msj = "VACUNA";
		
                    break;	
		}
            
	
            return msj;
	}
        
}
