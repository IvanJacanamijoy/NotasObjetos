import javax.swing.JOptionPane;

public class AplicacionJava1 {
    public static void main(String[] args) throws Exception {
        Estudiante estudiante;
        for (int i = 1; i <= 3; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante");
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 1 del estudiante"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la nota 2 del estudiante"));
            estudiante = new Estudiante(nombre);
            estudiante.setNotaParcial1(nota1);
            estudiante.setNotaParcial2(nota2);
            estudiante.calcularNotaFinal();
            JOptionPane.showMessageDialog(null, estudiante.obtenerMensaje());
        }
    }
}
