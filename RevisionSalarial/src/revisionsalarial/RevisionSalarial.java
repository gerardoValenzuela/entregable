/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisionsalarial;

/**
 *
 * @author Jose Luis
 */
public class RevisionSalarial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setClave(1001);
        empleado1.setNombre("James Margo");
        empleado1.setMonto(8000.0);
        
        Empleado empleado2 = new Empleado();
        empleado2.setClave(1002);
        empleado2.setNombre("Santana, Ulálume");
        empleado2.setMonto(10000.0);
        
        Empleado empleado3 = new Empleado();
        empleado3.setClave(1002);
        empleado3.setNombre("Zuleikan, Omar");
        empleado3.setMonto(15000.0);
       
        System.out.println("================================================================");
        System.out.print("Clave del Empleado: " + empleado1.getClave() );
        System.out.print("\t\t" );
        System.out.println("Nombre: " + empleado1.getNombre() );
        System.out.println("Honorarios: \t\t$" + empleado1.getMonto() );
        System.out.println("+ IVA (15%): \t\t$" + empleado1.calculaPercepcionIVA() );
        System.out.println("= Subtotal: \t\t$" + empleado1.calculaSubTotal() );
        System.out.println("- Ret. ISR (10%) \t$" + empleado1.calculaRetencionISR() );
        System.out.println("- Ret. IVA (10%) \t$" + empleado1.calculaRetencionIVA() );
        System.out.println("= Total: \t\t$" + empleado1.calculaTotal() );
        System.out.println();
        System.out.print("Clave del Empleado: " + empleado2.getClave() );
        System.out.print("\t\t" );
        System.out.println("Nombre: " + empleado2.getNombre() );
        System.out.println("Honorarios: \t\t$" + empleado2.getMonto() );
        System.out.println("+ IVA (15%): \t\t$" + empleado2.calculaPercepcionIVA() );
        System.out.println("= Subtotal: \t\t$" + empleado2.calculaSubTotal() );
        System.out.println("- Ret. ISR (10%) \t$" + empleado2.calculaRetencionISR() );
        System.out.println("- Ret. IVA (10%) \t$" + empleado2.calculaRetencionIVA() );
        System.out.println("= Total: \t\t$" + empleado2.calculaTotal() );
        System.out.println();
        System.out.print("Clave del Empleado: " + empleado3.getClave() );
        System.out.print("\t\t" );
        System.out.println("Nombre: " + empleado3.getNombre() );
        System.out.println("Honorarios: \t\t$" + empleado3.getMonto() );
        System.out.println("+ IVA (15%): \t\t$" + empleado3.calculaPercepcionIVA() );
        System.out.println("= Subtotal: \t\t$" + empleado3.calculaSubTotal() );
        System.out.println("- Ret. ISR (10%): \t$" + empleado3.calculaRetencionISR() );
        System.out.println("- Ret. IVA (10%): \t$" + empleado3.calculaRetencionIVA() );
        System.out.println("= Total: \t\t$" + empleado3.calculaTotal() );
        System.out.println("================================================================");
    }
    
}
