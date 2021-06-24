package MENU_COOP;

public class PERSONAL_COOP {
    private String ID;
    private String NOMBRE;
    private String APELLIDO_P;
    private String APELLIDO_M;
    private int EDAD;
    private String CORREO;
    private String DIRECCION;
    private String TELEFONO;

    public PERSONAL_COOP(){

    }

    public PERSONAL_COOP(String ID, String NOMBRE, String APELLIDO_P, String APELLIDO_M, int EDAD, String CORREO, String DIRECCION, String TELEFONO) {
        this.ID = ID;
        this.NOMBRE = NOMBRE;
        this.APELLIDO_P = APELLIDO_P;
        this.APELLIDO_M = APELLIDO_M;
        this.EDAD = EDAD;
        this.CORREO = CORREO;
        this.DIRECCION = DIRECCION;
        this.TELEFONO = TELEFONO;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public void setNOMBRE(String NOMBRE) {
        this.NOMBRE = NOMBRE;
    }

    public String getAPELLIDO_P() {
        return APELLIDO_P;
    }

    public void setAPELLIDO_P(String APELLIDO_P) {
        this.APELLIDO_P = APELLIDO_P;
    }

    public String getAPELLIDO_M() {
        return APELLIDO_M;
    }

    public void setAPELLIDO_M(String APELLIDO_M) {
        this.APELLIDO_M = APELLIDO_M;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }

    public String getCORREO() {
        return CORREO;
    }

    public void setCORREO(String CORREO) {
        this.CORREO = CORREO;
    }

    public String getDIRECCION() {
        return DIRECCION;
    }

    public void setDIRECCION(String DIRECCION) {
        this.DIRECCION = DIRECCION;
    }

    public String getTELEFONO() {
        return TELEFONO;
    }

    public void setTELEFONO(String TELEFONO) {
        this.TELEFONO = TELEFONO;
    }

}
