package Ejercicio1;


public class Semana3 { 

    
    // metodos main
     public static void main(String[] args){
         int  numero = 12;
             double edad = 18;
             boolean estado = true;
             // es un tipo ded dato que es primitivo
         String nombre = "luis"; 
         String apellido ="villarevia";
         
         System.out.println(nombre);
         
         System.out.println(nombre.length());
         System.out.println(apellido.length());
         System.out.println("la letra esa en la posicion" + nombre.indexOf("l"));
         if (!nombre.isEmpty()){
         System.out.println("si hay nombre");
         
         }else { 
             System.out.println("no hay nombre");
         //.trim quita los espacios vasidos 
         }
    
    if (nombre.isBlank()){
     System.out.println("Esta vasido");
    } 
     
    System.out.println(nombre.trim());
    
    String ejemplo = "texto";
    String ejemplo2 = "texto ";

     
    
}
}