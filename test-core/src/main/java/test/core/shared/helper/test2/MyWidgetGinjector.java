package test.core.shared.helper.test2;

import dagger.Component;




@Component(modules = MyWidgetClientModule.class)
public interface MyWidgetGinjector {

  SomeService getSomeService();
  
}
