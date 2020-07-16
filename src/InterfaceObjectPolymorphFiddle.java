
public class InterfaceObjectPolymorphFiddle {

	public static void main(String[] args) {
		
		Alpha a25 = new Alpha();
		Alpha a30 = new Beta(); // parent ref type and child object type is OKAY 
		// Beta b25 = new Alpha(); child ref type and parent object type NOT OKAY
		Beta b35 = new Beta();
		Alpha a45 = new Gamma();
		// Beta b45 = new Gamma(); this is ofcourse NOT OKAY
		
		// Now interfaces
		
		// Alpha a35 = new IA(); // dit mag niet, want Interface is abstract en mag je dus nooit instantiëren. class Alpha , implementing IA as ref type and interface IA as object type NOT OKAY; 
		//Beta b40 = new IA(); // IDEM
		IA eerst = new Alpha(); // Interface as ref type and class Alpha (implementing IA) as object type is OKAY;
		IA eerstB = new Beta(); // Interface as ref type and class Beta (which implements IA via extenstion of Alpha) as object type is OKAY;
		IC eerstC = new Gamma(); // Interface as ref type and class Gamma (implementing IC) as object type is OKAY;
		// IB tweeds = new Alpha(); // Interface which is not implemented by the class of the object type as ref type is NOT OKAY;
		// IB drieds = new Beta(); // Interface which is not implemented by the class of the object type as ref type is NOT OKAY;
		
		//Casting experiments
		
		Beta b30 = (Beta) new Alpha(); // child ref type and parent object type casted as child type OKAY, maar geeft een Runtime error -> Het object Dier is immers niet per se een konijn
        Alpha a51 = (Beta) b35;
        
        
        //leuk, nu dieper
        
        Beta b35 = new
        
		
		// Alpha a50 = (Alpha) new IA(); // interface as object type casted as ref type is still NOT OKAY;
		IB vierds = (IB) new Alpha();
		
		//Beta testLOS = (Alpha) new LOS();
		//Beta testLos = (Beta) new LOS();
		// TODO Auto-generated method stub

	}

}



class Alpha implements IA{}

class Beta extends Alpha implements IA{}

class Zeta extends Beta {}

class Gamma extends Alpha implements IC{}

class LOS{}

interface IA {}

interface IB extends IA{}

interface IC extends IA{}

