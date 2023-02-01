public class Assigned {
    
    private String EmpName;
    private String Institute;
    private String Program;
    private int Code;
    private String Name;
    private String Peripheral;

    public Assigned(String EmpName, String Institute, String Program, int Code, String Name, String Peripheral) {
        this.EmpName = EmpName;
        this.Institute = Institute;
        this.Program = Program;
        this.Code = Code;
        this.Name = Name;
        this.Peripheral = Peripheral;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String EmpName) {
        this.EmpName = EmpName;
    }

    public String getInstitute() {
        return Institute;
    }

    public void setInstitute(String Institute) {
        this.Institute = Institute;
    }

    public String getProgram() {
        return Program;
    }

    public void setProgram(String Program) {
        this.Program = Program;
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
        return "Assigned{" + "EmpName=" + EmpName + ", Institute=" + Institute + ", Program=" + Program + ", Code=" + Code + ", Name=" + Name + ", Peripheral=" + Peripheral + '}';
    }
    
    
    
}
