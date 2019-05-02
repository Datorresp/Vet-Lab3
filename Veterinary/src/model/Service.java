
package model;

public class Service {
    
    public final static double BP = 20000.0 ;
	public final static double BHDOMP = 30000.0;
	public final static double TP = 12000.0;
	public final static double NP = 8000.0;
	public final static double SP = 45000.0;

	public final static char BATH = 'b';
	public final static char BATHDOM = 'd';
	public final static char TEETH = 't';
	public final static char NAILS = 'n';
	public final static char SHOT = 's';


	//ATTRIBUTES
	private char type;
	private double cost;
	private  String clientId;
	private  String petName;


	//RELATIONSHIPS
	private Pet clientPet;
	private  Date d1;



	//METHODS

	public Service(char type, String ownerId, String petId, Pet clientPet, Date dateJob){
		this.type = type;
		this.clientId = ownerId;
		this.petName = petId;
		this.clientPet = clientPet;
		this.d1 = dateJob;
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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet getClientPet() {
        return clientPet;
    }

    public void setClientPet(Pet clientPet) {
        this.clientPet = clientPet;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

        
        

    


        



	public String serviceInfo(){
		String msj = "";
			   msj += "\n";
			   msj += "+-----------------------------------------------------------------------------+\n";
			   msj += " Service: "+typeToString(type)+"\n";
			   msj += " Price: "+cost+" \n";
			   msj += " Owner ID: "+clientId+"\n";
			   msj += " Pet's name: " +petName+ "\n";
			   msj += " Date of the service: " +d1.DateInfo()+"\n";
			   msj += "+-----------------------------------------------------------------------------+\n";
		
                           return msj;

	}

	public String typeToString(char type){
		
            String msj = "";
	
            switch (type) {
	
                case BATH:
		
                    msj = "Bath";
		
                    break;
		
                case BATHDOM:
		
                    msj = "Bath to go";
		
                    break;
		
                case TEETH:
		
                    msj = "Dental prophylaxis";
		
                    break;
		
                case NAILS:
		
                    msj = "Cutting nails";
		
                    break;
		
                case SHOT:
		
                    msj = "Vaccination";
		
                    break;	
		}
            
	
            return msj;
	}
        
}
