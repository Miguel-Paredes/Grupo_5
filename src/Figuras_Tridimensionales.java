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

//Constructoress
    public Figuras_Tridimensionales(float lado_cub, float radio_cil, float altura_cil, double pi, float lado_pir, float altu_pir, float radio_esf) {
        this.lado_cub = lado_cub;
        this.radio_cil = radio_cil;
        this.altura_cil = altura_cil;
        this.pi = pi;
        this.lado_pir = lado_pir;
        this.altu_pir = altu_pir;
        this.radio_esf = radio_esf;
    }

//setter and getter


    private float getLado_cub() {
        return lado_cub;
    }

    private void setLado_cub(float lado_cub) {
        this.lado_cub = lado_cub;
    }

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
        return this.lado_pir * (this.lado_pir + (Math.sqrt((4 * Math.pow(this.altu_pir,2)) + Math.pow(this.lado_pir,2))));
    }
    //Esfera
    private double area_esfera(){
        return 4 * this.pi * Math.pow(radio_esf,2);
    }

}
