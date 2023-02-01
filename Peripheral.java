package computerinventorysys;

/**
 *
 * @author Boinz
 */

// VINCE LUIGI R. HUERTAS || BSIT-2B

public class Peripheral {
    
    private int Code;
    private String Name;
    private String Peripheral;
    
    
    public Peripheral(int Code, String Name, String Peripheral) {
        this.Code = Code;
        this.Name = Name;
        this.Peripheral = Peripheral;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPeripheral() {
        return Peripheral;
    }

    public void setPeripheral(String Peripheral) {
        this.Peripheral = Peripheral;
    }

    @Override
    public String toString() {
        return "Peripherals{" + "Code=" + Code + ", Name=" + Name + ", Peripheral=" + Peripheral + '}';
    }

   
    
}
