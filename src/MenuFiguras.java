public class MenuFiguras {
    public static void main(String[] args) {
        Figuras_Tridimensionales Cubo = new Figuras_Tridimensionales(5,1,2,3,4,5);
        Figuras_Tridimensionales Cilindro = new Figuras_Tridimensionales(4, 10,1,2,3,4);
        Figuras_Tridimensionales Piramide = new Figuras_Tridimensionales(3, 8,1,2,3,4);
        Figuras_Tridimensionales Esfera = new Figuras_Tridimensionales(6,1,2,3,4,5);
        Cubo.imprimir_Cubo();
        Cilindro.imprimir_Cilindro();
        Piramide.imprimir_Piramide();
        Esfera.imprimir_Esfera();
    }
}
