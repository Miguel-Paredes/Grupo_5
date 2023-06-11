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

//Constructores



//setter and getter


    private float getLado_cub() {
        return lado_cub;
    }

    private void setLado_cub(float lado_cub) {this.lado_cub = lado_cub;}

    private float getRadio_cil() {
        return radio_cil;
    }

    private void setRadio_cil(float radio_cil) {
        this.radio_cil = radio_cil;
    }

    private float getAltura_cil() {
        return altura_cil;
    }

    private void setAltura_cil(float altura_cil) {
        this.altura_cil = altura_cil;
    }

    private double getPi() {
        return pi;
    }

    private void setPi(double pi) {
        this.pi = pi;
    }

    private float getLado_pir() {
        return lado_pir;
    }

    private void setLado_pir(float lado_pir) {
        this.lado_pir = lado_pir;
    }

    private float getAltu_pir() {
        return altu_pir;
    }

    private void setAltu_pir(float altu_pir) {
        this.altu_pir = altu_pir;
    }

    private float getRadio_esf() {
        return radio_esf;
    }

    private void setRadio_esf(float radio_esf) {
        this.radio_esf = radio_esf;
    }

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
        return this.lado_pir * (this.lado_pir + (Math.sqrt((4 * Math.pow(this.altu_pir,2)) + Math.pow(this.lado_pir,2))));}
    //Esfera
    private double area_esfera(){
        return 4 * this.pi * Math.pow(radio_esf,2);
    }

    //Metodos para calcular el volumen de las figuras tridimensionales
    //Cubo
    private double volumen_cubo(){
        return Math.pow(this.lado_cub,3);
    }
    //Cilindro
    private double volumen_cilindro(){
        return this.pi*Math.pow(this.radio_cil,2);
    }
    //Piramide
    private double volumen_piramide(){
        return ((Math.pow(this.lado_pir,3))*this.altu_pir/3);
    }
    //Esfera
    private double volumen_esfera(){
        return (4/3)*this.pi*Math.pow(this.radio_esf,3);
    }

    //Funciones para imprimir los resultados
    //Cubo
    public void imprimir_Cubo(){
        System.out.printf("El area del cubo es: ");
        System.out.print(area_cubo());
        System.out.println();
        System.out.printf("El volumen del cubo es:");
        System.out.print(volumen_cubo());
        System.out.println();}
    //Cilindro
    public void imprimir_Cilindro(){
        System.out.printf("El area del cilindro es: ");
        System.out.print(area_cilindro());
        System.out.println();
        System.out.printf("El volumen del cilindro es:");
        System.out.println(volumen_cilindro());
        System.out.println();}
    //Piramide
    public void imprimir_Piramide(){
        System.out.printf("El area de la piramide es: ");
        System.out.print(area_piramide());
        System.out.println();
        System.out.printf("El volumen de la piramide es:");
        System.out.println(volumen_piramide());
        System.out.println();}
    //Esfera
    public void imprimir_Esfera(){
        System.out.printf("El area de la esfera es: ");
        System.out.print(area_esfera());
        System.out.println();
        System.out.printf("El volumen de la esfera es:");
        System.out.print(volumen_esfera());
        System.out.println();}
}
