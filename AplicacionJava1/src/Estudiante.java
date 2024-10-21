public class Estudiante {
    // Creacion de los atributos de la clase Estudiantes
    private String nombre;
    private float notaParcial1;
    private float notaParcial2;
    private float notaFinal;

    //Creacion del constructor de la clase Estudiante
    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    //Creacion del constructor de la clase Estudiante
    public Estudiante(String nombre, float np1, float np2){
        this.nombre = nombre;
        notaParcial1 = np1;
        notaParcial2 = np2;
    }

    //---------------------------Metodos---------------------------//

    //--------------------Declaracion metodos setter--------------------//
    //nota: Al definir un metodo publico void no retorna ningun valor

    public void setNotaParcial1(float np1){
        notaParcial1 = np1;
    }

    public void setNotaParcial2(float np2){
        notaParcial2 = np2;
    }

    //--------------------Declaracion metodos getter--------------------//

    public float getNotaParcial1(float np1){
        return notaParcial1;
    }

    public float getNotaParcial2(float np2){
        return notaParcial2;
    }

    //Definiendo metodo calcularNotaFinal
    public void calcularNotaFinal(){
        notaFinal = (notaParcial1 + notaParcial2) / 2;
    }

    //Definiendo metodo para obtener la nota final
    public float obtenerNotaFinal(){
        return notaFinal;
    }

    //Definiendo metodo que muestra si el estudiante esta aprobado o no
    public String obtenerCalificacion(){
        if (notaFinal < 3) {
            return "Reprobado";
        } else{
            return "Aprobado";
        }
    }

    public String obtenerMensaje(){
        return "El estudiante " + this.nombre + "\nObtuvo una nota final de " + this.obtenerNotaFinal() + "\n" + this.obtenerCalificacion();
    }

}
