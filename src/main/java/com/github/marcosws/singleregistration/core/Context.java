package com.github.marcosws.singleregistration.core;

public class Context {
	
	public static final String APP_SINGLE_REGISTRATION = pathAppResources() + "/prototipo-cadastro-unico.html";
	public static final String APP_VIRTUAL_KEY = pathAppResources() + "/prototipo-teclado-virtual-v2.html";
	
	
	private static String pathAppResources() {
		return "file://" + Context.class.getClassLoader().getResource("app").getPath();
	}
	
}
