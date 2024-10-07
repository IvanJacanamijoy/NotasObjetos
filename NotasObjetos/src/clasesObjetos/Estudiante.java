package clasesObjetos;

public class Estudiante {
    private String nombre;
    private float notaParcial1, notaParcial2, notaFinal;

    //Constructores
    public Estudiante(String nombreEstudiante){
        this.nombre = nombreEstudiante;
    }

    public Estudiante(String nombreEstudiante,float np1, float np2){
        this.nombre = nombreEstudiante;
        this.notaParcial1 = np1;
        this.notaParcial2 = np2;
    }

    //  --------------metodos-------------
    public void calcularNotaFinal(){
        this.notaFinal = (notaParcial1 + notaParcial2)/3;
    }

    //setter
    public void setNotaParcial1(float np1){
        this.notaParcial1 = np1;
    }

    public void setNotaParcial2(float np2){
        this.notaParcial1 = np2;
    }

    //getter
    public float getNotaParcial1(){
        return notaParcial1;
    }

    public float getNotaParcial2(){
        return notaParcial2;
    }

    public void getNotaFinal(){
        this.notaFinal = (notaParcial1 + notaParcial2)/3;
    }

    public String getMensaje(){
        if (notaFinal <= 3.0) {
            return "Reprobo";
        }else{
            return "Aprobo";
        }
    }
}
