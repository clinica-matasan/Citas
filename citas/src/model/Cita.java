package model;

public class Cita {
    
    private int idCita;
    private int idPaciente;
    private int idMedico;
    private String fechaHora;
    private String estado;

     public Cita (){
        
    }

	 public Cita(int idCita, int idPaciente, int idMedico, String fechaHora, String estado) {
		this.idCita = idCita;
		this.idPaciente = idPaciente;
		this.idMedico = idMedico;
		this.fechaHora = fechaHora;
		this.estado = estado;
	 }

	 public int getIdCita() {
		 return idCita;
	 }

	 public void setIdCita(int idCita) {
        if (idCita > 0) {
            this.idCita = idCita;
        }else{
            System.out.println("Ud es como mongólico, ponga ese id bien");
        }
		 
	 }

	 public int getIdPaciente() {
		 return idPaciente;
	 }

	 public void setIdPaciente(int idPaciente) {
        if (idPaciente > 0) {
            this.idPaciente = idPaciente;
        }else{
            System.out.println("Ud es como mongólico, ponga ese id paciente bien");
        }
		 
	 }

	 public int getIdMedico() {
		 return idMedico;
	 }

	 public void setIdMedico(int idMedico) {
         if (idMedico > 0) {
            this.idMedico = idMedico;
        }else{
            System.out.println("Ud es como mongólico, ponga el id del medico bien, que falta de respeto");
        }
		 
	 }

	 public String getFechaHora() {
		 return fechaHora;
	 }

	 public void setFechaHora(String fechaHora) {
		 if (fechaHora != null && !fechaHora.isEmpty()) {
        this.fechaHora = fechaHora;
    } else {
        System.out.println("Error: La fecha y hora no pueden estar vacías sapo");
    }
	 }

	 public String getEstado() {
		 return estado;
	 }

	 public void setEstado(String estado) {
        if (estado.equals("Pendiente") || 
           estado.equals("Asignada") || 
           estado.equals("Cancelada")) {
            this.estado = estado;
        }else{
            System.out.println("Error, no hay cita");
        }
		 
	 }

}


