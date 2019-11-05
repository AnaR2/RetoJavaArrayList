import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainD {

	public static void main(String[] args) {
		
		Scanner tomarDatos= new Scanner(System.in);
		System.out.println("Digite la cantidad de estudiantes de los que desea ingresar sus datos de matrícula: ");
		int N= tomarDatos.nextInt();
		List<Students> ListaDeDatos= new ArrayList<Students>();
		
		Students estudiantes= new Students();
		
		
		for(int i = 0; i < N; i++) {
        	
			System.out.println("Ingresa el nombre del estudiante");
			String nombre= tomarDatos.next();
            estudiantes.setNombre(nombre);
            System.out.println("Ingresa el número de carnet del estudiante");
			int carnet= tomarDatos.nextInt();
            estudiantes.setCarnet(carnet);
            System.out.println("Ingresa el número de créditos");
			int creditos= tomarDatos.nextInt();
            estudiantes.setCreditos(creditos);
            System.out.println("Ingresa el valor del crédito");
			int valorCredito= tomarDatos.nextInt();
            estudiantes.setValorCredito(valorCredito);
            System.out.println("Ingresa el porcentaje del descuento al que tiene derecho");
			float porcentajeDescuento= tomarDatos.nextFloat();
            estudiantes.setPorcentajeDescuento(porcentajeDescuento);
            
            Students infoAlumnos= new Students(nombre, carnet, creditos, valorCredito, porcentajeDescuento);
            ListaDeDatos.add(infoAlumnos);
            System.out.println(ListaDeDatos.get(i));
            
 
            System.out.println("Valor a pagar: $ " + estudiantes.TotalPago());
            
        }
		
		int MasCara= ListaDeDatos.get(0).TotalPago();
		
		for(int i=0; i<ListaDeDatos.size(); i++) {
			
			if(ListaDeDatos.get(i).TotalPago() > MasCara) {
				MasCara= ListaDeDatos.get(i).getCarnet();
			}

	}

		System.out.println("Numero de carnet del estudiante que más paga por concepto de matricula: " + MasCara);
}
}
