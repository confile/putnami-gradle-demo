package test.core.shared.helper;

 
import test.core.shared.helper.test2.Dagger_MyWidgetGinjector;
import test.core.shared.helper.test2.MyWidgetGinjector;
import test.core.shared.helper.test2.SomeService;

import com.goodow.realtime.json.Json;
import com.goodow.realtime.json.JsonObject;
import com.google.gwt.core.client.GWT;

public class Starter {

  public static void test() {

    GWT.log("Hello Starter");
    
    
    MyWidgetGinjector injector = Dagger_MyWidgetGinjector.create();
    SomeService service = injector.getSomeService();

    service.test();
    
    String jsonString = "{test: 123}";
    JsonObject obj = Json.parse(jsonString);

  }
  
 
}
