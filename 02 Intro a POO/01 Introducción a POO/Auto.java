public class Auto {
    String marca;
    String modelo;
    Integer ano;

    // Constructor sin parametros
    public Auto() {}

    // Constructor que inicializa todo
    public Auto(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public Auto( String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public void imprimirDatos() {
        if (marca != null ) {
            System.out.println("Marca: "+ marca);
        } else {
            System.out.println("Marca: No especificada");
        }

        if (modelo != null) {
            System.out.println("Modelo:" + modelo);
        } else {
            System.out.println("Modelo: No especificado"  );
        }

        if ( ano != null) {
            System.out.println("Año: " + ano);
        } else {
            System.out.println("Año: No especificado");
        }
    }
}
