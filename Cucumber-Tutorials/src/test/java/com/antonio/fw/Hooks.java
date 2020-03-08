package com.antonio.fw;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	//before importato con la libreria di cucumber
	//init e cleanup sono due metadati, i nomi devono essere quelli
@Before
public void init(){
	System.out.print("\nBefore hook invoked.\n");
}

@After
public void cleanup() {
	System.out.print("\nAfter hook invoked.");
}

}
