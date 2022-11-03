package TestaLoja;

import Cadastros.model.Barraca;

public class TestaLoja {
    public static void main(String[] args) {

        Barraca p1 = new Barraca("Caldo", 10.0,1);
        Barraca p2 = new Barraca("Pipoca", 5.0,1);
        Barraca p3 = new Barraca("Quentao", 10,1);
        Barraca p4 = new Barraca("Brincadeira", 2,1);
        Barraca p5= new Barraca("Canjica", 10,1);
        Barraca p6 = new Barraca("Refrigerante", 5,1);
        Barraca p7 = new Barraca("Cachorro-Quente", 5,1);
        Barraca p8 = new Barraca("Churrasquinho", 12,1);
        Barraca p9 = new Barraca("Cerveja", 10,1);
        Barraca p10 = new Barraca("Agua", 4,1);


        p1.visualizar();
        p2.visualizar();
        p3.visualizar();
        p4.visualizar();
        p5.visualizar();
        p6.visualizar();
        p7.visualizar();
        p8.visualizar();
        p9.visualizar();
        p10.visualizar();


    }
}
