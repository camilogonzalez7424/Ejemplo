import java.util.Scanner; // Estas dos lineas importan 
import java.lang.Math; 

public class Calendario {
	
	public static void main (String[] args) { 
		Scanner lector = new Scanner(System.in);
		
		System.out.println("Ingrese la fecha con los siguientes parametros incluyendo el / :\n DD/MM/AA");
	
		String fecha = lector.nextLine(); //Entrada para la fecha
		
		String[] fechas = fecha.split("/"); //Split separa por simbolos (/,?.¡)
		
		int day = Integer.parseInt(fechas[0]); //input
		  
		int month = Integer.parseInt(fechas[1]); //Pasar de un tipo de dato a otro
		
		int year = Integer.parseInt(fechas[2]); //input
		
		boolean bisiesto = true;
		
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 ==0)) {
				
			System.out.println("El año es bisiesto");

			bisiesto = true;
			
		}else {
			System.out.println("El año no es bisiesto");
			
			bisiesto = false;    //Evaluar si el año es bisiesto o no
		} 
		//El siguiente switch evalua cada mes y sus respectivos casos especiales
		switch (month) {
		
			case 1:
				if (day == 31){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					
					System.out.println("La fecha del dia siguiente es:\n" + (day-30)+"/"+(month+1)+"/"+(year));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+30)+"/"+(month+11)+"/"+(year-1));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				
				}
				
			break;
		
			case 2:
				if ((day == 28) && (bisiesto == true)) {
				 	System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} 
				else if((day ==28) && (bisiesto == false)){
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day-27)+"/"+(month+1)+"/"+(year));
				}
				else if(day == 29){
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-28)+"/"+(month+1)+"/"+(year));
				}
				else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+30)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				}
				else {
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
		
			break;

			case 3:
				if ((day == 1) && (bisiesto == true)) {
				 	System.out.println("La fecha del dia anterior es:\n"+(day+28)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				}
				else if (day == 31){
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-30)+"/"+(month+1)+"/"+(year));
				} else {
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}

			break;
				
			case 4:	
				if (day == 30){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-29)+"/"+(month+1)+"/"+(year));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+30)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
			break;
		
			case 5:
				if (day == 31){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-30)+"/"+(month+1)+"/"+(year));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+29)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
			break;
		
			case 6:
				if (day == 30){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-29)+"/"+(month+1)+"/"+(year));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+30)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
			break;
		
			case 7:
				if (day == 31){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-30)+"/"+(month+1)+"/"+(year));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+29)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
			break;
				
			case 8:
				if (day == 31){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-30)+"/"+(month+1)+"/"+(year));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+30)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
			break;
		
			case 9:
				if (day == 30){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-29)+"/"+(month+1)+"/"+(year));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+30)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
			break;
				
			case 10:
				if (day == 31){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-30)+"/"+(month+1)+"/"+(year));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+29)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
			break;
				
			case 11:
				if (day == 30){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-29)+"/"+(month+1)+"/"+(year));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+30)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
			break;	
			
			case 12:
				if (day == 31){
					System.out.println("La fecha del dia anterior es:\n" + (day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n" + (day-30)+"/"+(month-11)+"/"+(year+1));
				} else if (day ==1) {
					System.out.println("La fecha del dia anterior es:\n"+(day+29)+"/"+(month-1)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));
				} else { 
					System.out.println("La fecha del dia anterior es:\n"+(day-1)+"/"+(month)+"/"+(year));
					System.out.println("La fecha del dia siguiente es:\n"+(day+1)+"/"+(month)+"/"+(year));	
				}
			break;	
				
		}
				
		double dayT =0; //Variable de Dias totales		
		
		if(month==2){
			dayT =31; 
		}		
		else if(month==3){
			dayT=59;
		}
		else if(month==4){
			dayT=90;
		}
		else if(month==5){
			dayT=120;
		}
		else if(month==6){
			dayT=151;
		}
		else if(month==7){
			dayT=181;
		}
		else if(month==8){
			dayT=212;
		}
		else if(month==9){
			dayT=242;
		}
		else if(month==10){
			dayT=273;
		}
		else if(month==11){
			dayT=304;
		}
		else if(month==12){
			dayT=334;
		}
		
		double porcentaje = 0; // Variable para el procentaje, output
	
		if(bisiesto==true){
			
			porcentaje= Math.round(((day+dayT)/366)*100); //Math.round redondea el porcentaje
			System.out.println("Lleva del año un " + porcentaje + "%" + " Aproximadamente");
		}
		else if(bisiesto==false){
			porcentaje= Math.round(((day+dayT)/365)*100);
			System.out.println("Lleva del año un " + porcentaje + "%" + " Aproximadamente");

		}
}
}