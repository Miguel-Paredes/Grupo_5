public class Figuras_Tridimensionales {
    //Variables para el cubo
    private float lado_cub;
    //variables para el cilindro
    private float radio_cil, altura_cil;
    private double pi=3.1416;
    //variables para la piramide
    private float lado_pir, altu_pir;
    //variables para esfera
    private float radio_esf;




    //Métodos para calcular el area de figuras tridimensionales
    //Cubo
    private double area_cubo(){
        return 6 * Math.pow(this.lado_cub,2);
    }
    //Cilindro
    private double area_cilindro(){
        return 2 * this.radio_cil * this.pi * (this.radio_cil + this.altura_cil);
    }
    //Piramide
    private double area_piramide(){
        return this.lado_pir * (this.lado_pir + (Math.sqrt((4 * Math.pow(this.altu_pir,2)) + Math.pow(this.lado_pir,2))));
    }
    //Esfera
    private double area_esfera(){
        return 4 * this.pi * Math.pow(radio_esf,2);
    }

}
