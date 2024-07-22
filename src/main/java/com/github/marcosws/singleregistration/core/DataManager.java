package com.github.marcosws.singleregistration.core;

import com.github.marcosws.singleregistration.model.SingleRegistration;

public class DataManager {
	
	public static void loadData(String context, String idCaseTest) {
		
		Object object = null;
		if(context.replace("@", "").equals("CadastroUnico"))
			object = SingleRegistration.getInstance();
		else
			throw new RuntimeException("Erro ao Intanciar classe da Massa!, parâmentro do context é: " + context + " valores aceitos: CadastroUnico.");
		
		String path = Utils.getFullPathResource("/data/" + idCaseTest.replace("@", "") + ".json");
		String json = Utils.readFile(path);
		Utils.dataJsonToObject(object, json); 
		
		System.out.println(json);
		
	}

}
