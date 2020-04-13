/**
 *
 * @author ERICK
 */
public class CaracteresEspeciales {
    
    public static void main(String[] args) {
    
        String nombre = "Erick";
        String apellido = "Rangel";
    
        System.out.println(nombre + " " + apellido);
        //Nueva Linea con Caracter Especial: \n
        System.out.println("Nueva linea: \n" + nombre);
        //Tabulador con Caracter Especial: \t
        System.out.println("Tabulador: \t" + nombre);
        //Retroceso con Caracter Especial: \b
        System.out.println("Retroceso: \b" + nombre);
        /*Retorno de carro con Caracter Especial: \r
        * Depende de la plataforma del SO se puede utilizar el metodo
        * System.lineSeparator(); Este metodo regresara el caracter adecuado
        * (\n - \r) dependiendo del SO que se este trabajando.
        */
        System.out.println("Retorno de carro: \r" + nombre);
        //Comilla simple con Caracter Especial: \'
        System.out.println("Comilla simple: \'" + nombre + "\'");
        //Comilla doble con Caracter Especial: \"
        System.out.println("Comilla doble: \"" + nombre + "\"");
    } 
}
