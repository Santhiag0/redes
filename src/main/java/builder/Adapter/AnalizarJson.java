package builder.Adapter;

public class AnalizarJson implements ILibreriaAnalisis{

    private String json;

    public AnalizarJson(String json) {
        this.json = json;
    }

    @Override
    public void analizar() {
        System.out.println("Analizando JSON: "+ json);
    }
    
}
