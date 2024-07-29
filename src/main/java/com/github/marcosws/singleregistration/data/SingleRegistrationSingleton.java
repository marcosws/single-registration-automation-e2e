package com.github.marcosws.singleregistration.data;

import com.github.marcosws.singleregistration.core.Utils;

public class SingleRegistrationSingleton {
	
	private static ThreadLocal<SingleRegistration> instance = new ThreadLocal<>();
	
	public static synchronized SingleRegistration getInstance() {
		if(instance == null) {
			SingleRegistration singleRegistration = new SingleRegistration();
			Utils.setEmptyIfStringFieldIsNull(instance);
			instance.set(singleRegistration);
		}
		return instance.get();
	}

	public static void setInstance(SingleRegistration instance) {
		SingleRegistrationSingleton.instance.set(instance);
	}
	

}
