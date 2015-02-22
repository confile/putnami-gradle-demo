package java2;

import com.google.gwt.core.client.GWT;

import test.core.shared.helper.json.BJSONObject;

public class BJSONObjectJavaImpl implements BJSONObject {

  public BJSONObjectJavaImpl() {
    // TODO Auto-generated constructor stub
  }
  
  
  @Override
  public void put(String key, String value) {
    GWT.log("super class2 errer");
  }
  
}
