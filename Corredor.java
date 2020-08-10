

public class Corredor {
	
	private int energia;
	
	public Corredor(int energia) {
		super();
		this.energia = energia;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	
	public void verificarEnergia(Corredor c1) {		
		if(energia > -1 && energia > 100) {
			System.out.println("LA ENERGIA NO ERA VALIDA");
			energia = 100;
			System.out.println("LA ENERGIA SE HA REINICIADO ES IGUAL A: "+energia);
			
		}else if(energia < 0) {
			System.out.println("LA ENERGIA NO ERA VALIDA");
			energia = 0;
			System.out.println("LA ENERGIA SE HA REINICIADO ES IGUAL A: "+energia);
		}else {
			System.out.println("LA ENERGIA ES CORRECTA: "+ energia);
		}
	}
	
	public void recargarEnergia (int energiamas) {
		int total = 0;
		total = energia+energiamas;
		if (total>100) {
			System.out.println("RECARGANDO ENERGIA");
			System.out.println("LA ENERGIA NO PUEDE SER MAYOR A 100");
			System.out.println("RESTABLECIENDO SU ENERGIA");
			energia = 100;
			System.out.println("SU ENERGIA ES DE: "+energia);
		}else {
			System.out.println("RECARGANDO ENERGIA");
			energia+=energiamas;
			System.out.println("SU ENERGIA ES DE: "+energia);
		}
	}
	
	public void correr() {
		System.out.println("CORRIENDO");
		energia -= 10;
		System.out.println("SU ENERGIA ES DE: "+ energia);
	}
	
	public void energiaAgotada(Corredor Correr) {
		if(energia<10) {
			energia = 0;
			System.out.println("SU ENERGIA HA LLEGADO AL MÍNIMO");
			System.out.println("ENERGIA = "+energia);
		}
	}
	
	public void entrenar() {
		System.out.println("ENTRENANDO");
		int aumento = 15;
		energia+=aumento;
		if(energia>100) {
			energia=100;
			System.out.println("SU ENERGIA NO PUEDE SER MAYOR A 100");
			System.out.println("RESTABLECIENDO SU ENERGIA");
			System.out.println("SU ENERGIA ES DE: "+ energia);
		}else {
			System.out.println("SU ENERGIA ES DE: "+ energia);
		}
	}
	
	

	
	
	
	
}
