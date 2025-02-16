package com.github.marcosws.singleregistration.core;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FilenameUtils;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;


public class Utils {
	
	public static void setEmptyIfStringFieldIsNull(Object object) {
		List<Field> allFields = Arrays.asList(object.getClass().getDeclaredFields());
        for(Field f : allFields){
        	f.setAccessible(true);
        	try{
        		if(f.getType().isInstance(new String())){
        		//if(f.getType().getSimpleName().equals("String")){
        			if(f.get(object) == null){
        				f.setAccessible(true);
        				f.set(object, "");
        			}
        		}
        		
        	}
        	catch(Exception e){
        		e.printStackTrace();
        	}
        }
	}
	public static void dataJsonToObject(Object object, String json) throws Exception {
		
		if(json == null || json == "") 
			throw new Exception("parâmentro json não pode ser nulo ou vazio.");
		
		if(object == null) 
			throw new NullPointerException("parâmentro object não pode ser nulo.");
		
		JSONObject jsonObject = (JSONObject) JSONValue.parse(json);
        List<Field> allFields = Arrays.asList(object.getClass().getDeclaredFields());
        for(Field f : allFields){
        	f.setAccessible(true);
        	try {
        		if(jsonObject.containsKey(f.getName()))
        			f.set(object, jsonObject.get(f.getName()).toString());
			} 
        	catch (IllegalArgumentException e) {
        		e.printStackTrace();
        	}
        	catch (IllegalAccessException e) {
				e.printStackTrace();
			}
        } 
	}
	
	public static String getFullPathResource(String partialPathFile) {
		
		URL resource = null;
		URI uri = null;
		if(System.getProperty("os.name").equalsIgnoreCase("linux")) {
			resource = Utils.class.getResource(partialPathFile);
		}
		else {
			String path = FilenameUtils.separatorsToSystem(partialPathFile);
			resource = Utils.class.getClassLoader().getResource(path);
		}
		
		try {
			uri = resource.toURI();
		} 
		catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return new File(uri).toString();
	}
	
	public static String readFile(String filePath) {
		
		String line;
        String fileContent = "";
        String returnContent = "";
        BufferedReader in = null;

        try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));
		} 
        catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		} 
        catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		
		while(true){
			try {
				line = in.readLine();
				if(line == null)
					break;
				fileContent += line;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
        
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		byte ptext[] = fileContent.getBytes();
		try {
			returnContent = new String(ptext, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return returnContent;
	}
	
	public static Boolean stringToBoolean(String text) {
		return Arrays.asList("S","SIM","TRUE","Y","YES").contains(text.toUpperCase());
	} 
	
	public static String removeAccents(String text) {
		String lettersWithAccents = "ÁÃÂÀÄÅÉÊËÈÏÍÌÎÓÕÔÖÒÚÙÛÜÇÑÝŸŠáãâàäåéêëèïíìîóõôöòúùûüçñýÿš";
		String lettersWithoutAccents = "AAAAAAEEEEIIIIOOOOOUUUUCNYYSaaaaaaeeeeiiiiooooouuuucnyys";
		for(int i = 0; i < lettersWithAccents.length(); i++) 
			text = text.replace(lettersWithAccents.charAt(i), lettersWithoutAccents.charAt(i));
		return text;
	}
	
	public static String normalize(String text) {
		return removeAccents(text).replaceAll("[^A-Za-z0-9]","").toUpperCase();
	}
	
	public static String removeMask(String field) {
		
		field = field.replace(".", "");
		field = field.replace("-", "");
		field = field.replace("/", "");
		field = field.replace("(", "");
		field = field.replace(")", "");
		return field;
		
	}
	
}
