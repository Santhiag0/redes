package builder.Adapter;
import org.json.JSONML;
import org.json.JSONObject;
import org.json.XML;

public class Adapter implements ILibreriaAnalisis {

    private OrigenData origenData;
    
    public Adapter(OrigenData origenData) {
        this.origenData = origenData;
    }

    @Override
    public void analizar() {
        String xml = origenData.getData();
        String convertidoJson = convertirXmlToJson(xml);
        System.out.println("Se han analizado los datos "+convertidoJson);
    }
    
    private String convertirXmlToJson(String xml) {
        JSONObject xmlJSONObj = XML.toJSONObject(xml);
        String jsonTransformado = xmlJSONObj.toString(4);
        return jsonTransformado;
    }
}
