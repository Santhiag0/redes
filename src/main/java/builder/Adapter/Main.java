package builder.Adapter;

public class Main {
    public static void main(String[] args) {

        String texto = ("\t\t\t<?xml version=\"1.0\"?>\n" + //
        "\t\t\t<Company>\n" + //
        "\t\t\t\t  <FirstName>EDDEL</FirstName>\n" + //
        "\t\t\t\t  <LastName>CHAN</LastName>\n" + //
        "\t\t\t\t  <IsPro>CHI</IsPro>\n" + //
        "\t\t\t</Company>\n" + //
        "\t\t\t");
        
        ILibreriaAnalisis analisisnormal = new AnalizarJson("Holitas xD");

        analisisnormal.analizar();

        ILibreriaAnalisis adapatado = new Adapter(new OrigenData(texto));
        adapatado.analizar();

    }
}
