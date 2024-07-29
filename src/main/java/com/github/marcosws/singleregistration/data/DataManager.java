package com.github.marcosws.singleregistration.data;

import com.github.marcosws.singleregistration.core.Utils;

public class DataManager {
	
	public static void loadData(String context, String idCaseTest) {
		
		SingleRegistration singleRegistration = new SingleRegistration();
		
		System.out.println("ID: " + idCaseTest);
		
		String path = "";
		String json = "";
		try {
			path = Utils.getFullPathResource("/data/" + idCaseTest.replace("@", "") + ".json");
			json = Utils.readFile(path);
		}
		catch(NullPointerException e) {
			new AssertionError("Erro ao selecionar o json(Massa) verifique as Tags na Feature se está no Padrão ou se o nome da Tags no inice corresponde ao nome do Arquivo.\n" + e.getMessage());
		}
		
		if(context.replace("@", "").equals("CadastroUnico")) {
			try {
				Utils.dataJsonToObject(singleRegistration, json);
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			SingleRegistrationSingleton.setInstance(singleRegistration);
		} 
		else if(context.replace("@", "").equals("TecladoVirtual")) {
		
		}
		else
			throw new RuntimeException("Erro ao Intanciar classe da Massa!, parâmentro do context é: " + context + " valores aceitos: CadastroUnico.");
		
		System.out.println("json: " + json + "Thread: " + singleRegistration.getName());
		System.out.println(" - Nome [" + singleRegistration.getName() + "]");
		System.out.println(" - CPF  [" + singleRegistration.getCpf() + "]");
		System.out.println(json);
		
	}

}
