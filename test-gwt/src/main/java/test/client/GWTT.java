package test.client;

import test.core.shared.helper.Starter;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;




public class GWTT implements EntryPoint {

  @Override
	public void onModuleLoad() {

    GWT.log("Start test-gwt");
    
    Starter.test();

	}
}
