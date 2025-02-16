package com.github.marcosws.singleregistration.data;

import com.github.marcosws.singleregistration.core.Utils;

@Deprecated
public class SingleRegistrationSingleton {
	
	private static ThreadLocal<SingleRegistration> instance = new ThreadLocal<>();
	
	@Deprecated
	public static synchronized SingleRegistration getInstance() {
		if(instance == null) {
			SingleRegistration singleRegistration = new SingleRegistration();
			Utils.setEmptyIfStringFieldIsNull(instance);
			instance.set(singleRegistration);
		}
		return instance.get();
	}

	@Deprecated
	public static void setInstance(SingleRegistration instance) {
		SingleRegistrationSingleton.instance.set(instance);
	}
	

}
