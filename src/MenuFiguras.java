public class MenuFiguras {
    public static void main(String[] args) {
        //Se crean objetos, en los parametros se colocan valores a los objetos
        Figuras_Tridimensionales Cubo = new Figuras_Tridimensionales(5);
        Figuras_Tridimensionales Cilindro = new Figuras_Tridimensionales(4, 10);
        Figuras_Tridimensionales Piramide = new Figuras_Tridimensionales(3, 8);
        Figuras_Tridimensionales Esfera = new Figuras_Tridimensionales(6);
        Cubo.imprimir_Cubo();
        Cilindro.imprimir_Cilindro();
        Piramide.imprimir_Piramide();
        Esfera.imprimir_Esfera();
    }
}