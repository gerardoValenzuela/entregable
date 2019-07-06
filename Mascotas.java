//Mascotas.java
public class Mascotas{
	public static void main(String[]args){
		System.out.println("Mis Mascotas");
		
		//¿Qué línea hace falta aquí para que funcione este programa?
		Mascota miMascota;
                
		miMascota = new Gato();
		miMascota.come("ratones"); //despliega: El gato come ratones
		miMascota.come("whiskas"); //despliega: El gato come whiskas
				
		miMascota = new Perro();
		miMascota.come("huesos"); //despliega: El perro come huesos	
		miMascota.come("carne"); //despliega: El perro come carne	
		
		miMascota = new Conejo();
		miMascota.come("alfalfa"); //despliega: El conejo come alfalfa	
		miMascota.come("zanahorias"); //despliega: El conejo come zanahorias	
	}
}
//�Qu� c�digo hace falta agregar para que funcione este programa?
class Mascota{
    public void come(String alimento){
        System.out.println("La mascota come " + alimento);
    }
}
class Gato extends Mascota{
    public void come(String alimento){
        System.out.println("El gato come " + alimento);
    }
}
class Perro extends Mascota{
    public void come(String alimento){
        System.out.println("El perro come " + alimento);
    }
}
class Conejo extends Mascota{
    public void come(String alimento){
        System.out.println("El conejo come " + alimento);
    }
}
 