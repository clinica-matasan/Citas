package model;

public class Consultorio {

    private int numConsultorio;
    private int pisoConsultorio;
    private String estado;

    public Consultorio(){

    }

    public Consultorio(int numConsultorio, int pisoConsultorio, String estado) {
        this.numConsultorio = numConsultorio;
        this.pisoConsultorio = pisoConsultorio;
        this.estado = estado;
    }

    public int getNumConsultorio() {
        return numConsultorio;
    }

    public void setNumConsultorio(int numConsultorio) {
        if ( numConsultorio > 0 && numConsultorio <= 10){
             this.numConsultorio = numConsultorio;
             this.estado = "Disponible";
        }else{
            System.out.println("Solo tenemos 10 consultorios en toda el area Metropolitana");
        }
    }

    public int getPisoConsultorio() {
        return pisoConsultorio;
    }

    public void setPisoConsultorio(int pisoConsultorio) {
        this.pisoConsultorio = pisoConsultorio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Consultorio [numConsultorio=" + numConsultorio + ", pisoConsultorio=" + pisoConsultorio + ", estado="
                + estado + "]";
    }

    
    
}
