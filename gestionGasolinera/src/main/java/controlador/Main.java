package controlador;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;

import dao.RepostajeFactura;
import dao.RepostajeGasolinera;
import dao.RepostajeGasolineraImpl;
import dao.RepostajeNormal;
import dto.AdaoServicio;
import dto.AdaoServicioIMPL;
import dto.AdtoServicio;
import dto.AdtoServicioIMPL;
import dto.RepostajeFacturaDTO;
import dto.RepostajeGasolineraDTO;
import dto.RepostajeNormalDTO;
import implementaciones.FacturaIMPL;
import implementaciones.NormalIMPL;
import implementaciones.RepostajeGasolineraIMPL;
@Controller
public class Main {

	public static void main(String[] args) {
	
		
		 
		ApplicationContext contexto = new ClassPathXmlApplicationContext("bean.xml");
		FacturaIMPL factura = (FacturaIMPL) contexto.getBean(FacturaIMPL.class);
		NormalIMPL normal = (NormalIMPL) contexto.getBean(NormalIMPL.class);
		RepostajeGasolineraIMPL repoGasolinera = (RepostajeGasolineraIMPL) contexto.getBean(RepostajeGasolineraIMPL.class);

		int menu;
		boolean salir = false;
		Calendar actual = Calendar.getInstance();
		
		RepostajeNormalDTO RepostajeNormalDTO;
		RepostajeNormal repostajeNormal;
		
		RepostajeFacturaDTO repostajeFacturaDTO;
		RepostajeFactura repostajeFactura;
		
		RepostajeGasolineraDTO repostajeGasolineraDTO;
		RepostajeGasolinera repostajeGasolinera;
		
		AdaoServicio Adao = new AdaoServicioIMPL();
		AdtoServicio Adto = new AdtoServicioIMPL();
		
		List<RepostajeNormal> listaNormal = new ArrayList<>();
		listaNormal=normal.mostrar();
		List<RepostajeFactura> listaFactura = new ArrayList<>();
		listaFactura=factura.mostrar();
		List<RepostajeGasolinera> listaGasolinera = new ArrayList<>();
		listaGasolinera=repoGasolinera.Mostrar();
		int ultimoElemento= listaGasolinera.size()-1;
		

		
		
		
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println(" Repostaje normal");
		System.out.println("Repostaje factura");
		System.out.println("Ver todos los repostajes");
		System.out.println("Importe total combustible vendido");
		System.out.println("Llenado de depósito");
		System.out.println("Eliminar último llenado de depósito");
		System.out.println("Ver todos los llenados de depósito");
		System.out.println("salir");
		
		
		do {
			
			System.out.println("Elija una de las opciones");
			menu= scan.nextInt();
			
			
		switch(menu) {
		case 1:
			System.out.println("A elegido usted repostaje normal");
			RepostajeNormalDTO = Adto.ARepostajeNormalDTO("jgc", actual, 4.5);
			repostajeNormal = Adao.RepostajeNormalDTOaDAO(RepostajeNormalDTO);
			normal.Insertar(repostajeNormal);
			break;
			
		case 2:
			System.out.println("A elegido usted repostaje factura");
			repostajeFacturaDTO = Adto.ARepostajeFacturaDTO("jgc", actual, 5.5, "232454F", "KJNN 54");
			repostajeFactura = Adao.RepostajeFacturaDTOaDAO(repostajeFacturaDTO);
			factura.Insertar(repostajeFactura);
			break;
			
		case 3:
			System.out.println("Lista de repostajes");
			factura.mostrar();
			normal.mostrar();
			break;
			
		case 4:
			double sumaNormal=0;
			double sumaFactura=0;
			System.out.println("total ventas: ");
			for(RepostajeNormal pagoNormal : listaNormal) {
				sumaNormal += pagoNormal.getImporte();
			}
			for (RepostajeFactura pagoFactura : listaFactura) {
				sumaFactura+=pagoFactura.getImporte();
			}
			System.out.println(sumaNormal+sumaFactura);

			
			break;
			
		case 5:
			System.out.println("A elegido usted llenado de depósito");
			repostajeGasolineraDTO = Adto.ARepostajeGasolineraDTO("af", 10.5, "gasoil", 50.0);
			repostajeGasolinera = Adao.RepostajeGasolineraDTOaDAO(repostajeGasolineraDTO);
			repoGasolinera.Insertar(repostajeGasolinera);
			System.out.println("LLenando depósito...");
			break;
			
		case 6:
			System.out.println("Se ha eliminado el ultimo llenado");
			//repoGasolinera.borrar(listaGasolinera);
			
			/*for(int i =0; i<listaGasolinera.size();i++) {
				listaGasolinera.remove(listaGasolinera.size()-1);
				listaGasolinera.r
			}
			*/
			listaGasolinera.remove(ultimoElemento);
			break;
			
		case 7:
			System.out.println("Lista de llenados");
			repoGasolinera.Mostrar();
			break;
			
		case 8:
			System.out.println("hasta pronto");
			
		
			break;
			
		}
		}while(menu!=8);
		
		

	}

}
