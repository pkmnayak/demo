
import java.util.Map;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class JavaJSONToMapWithout3rdLib {
    public static void main(String[] args) throws ScriptException {
        

         ScriptEngine engine;
          String jsonSample = """
        {
          "user": {
            "id": 123,
            "name": "John Doe",
            "email": "john.doe@example.com",
            "address": {
              "street": "123 Main St",
              "city": "Anytown",
              "state": "CA",
              "zip": "12345"
            }
          },
          "todos": [
            {
              "id": 1,
              "title": "Buy groceries",
              "completed": false
            },
            {
              "id": 2,
              "title": "Call mom",
              "completed": true
            },
            {
              "id": 3,
              "title": "Finish project",
              "completed": false
            }
          ]
        }
        """;

        ScriptEngineManager sem = new ScriptEngineManager();
        engine = sem.getEngineByName("javascript");
        String json = jsonSample;
        String script = "Java.asJSONCompatible(" + json + ")";
        Object result = engine.eval(script);
        Map contents = (Map) result;
        contents.forEach((t, u) -> {
            System.out.println(t + ": " + u);
        });

    }
    
}