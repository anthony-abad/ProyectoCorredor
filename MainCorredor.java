

public class MainCorredor {

	public static void main(String[] args) {
			
			Corredor c1 = new Corredor(10);
			Corredor c2 = new Corredor(50);
			Corredor c3 = new Corredor(30);
			Corredor c4 = new Corredor(27);
			
			
			c1.verificarEnergia(c1);
			c1.recargarEnergia(20);
			c1.correr();
			c1.energiaAgotada(c1);
			c1.entrenar();
			c1.entrenar();
			c1.entrenar();
			c1.entrenar();
			c1.entrenar();
			c1.entrenar();
			c1.entrenar();
			
			
			c2.verificarEnergia(c2);
			c2.recargarEnergia(30);
			c2.correr();
			c2.energiaAgotada(c1);
			c2.entrenar();
			c2.entrenar();
			c2.entrenar();
			c2.entrenar();
			
			c3.verificarEnergia(c3);
			c3.recargarEnergia(15);
			c3.correr();
			c3.energiaAgotada(c1);
			c3.entrenar();
			
			c4.verificarEnergia(c4);
			c4.recargarEnergia(25);
			c4.correr();
			c4.energiaAgotada(c1);
			c4.entrenar();
			c4.entrenar();
			c4.entrenar();
			c4.entrenar();
			c4.entrenar();
			c4.entrenar();
			c4.entrenar();
			
			
			
			
			
		

	}

}
