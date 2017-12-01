package be.occam.zoncolan.application.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.google.appengine.tools.development.testing.LocalAppIdentityServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalDatastoreServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalMailServiceTestConfig;
import com.google.appengine.tools.development.testing.LocalServiceTestHelper;
import com.google.apphosting.api.ApiProxy;

import be.occam.utils.spring.configuration.ConfigurationProfiles;
import be.occam.zoncolan.heat.web.util.DataGuard;
import be.occam.zoncolan.web.util.DevGuard;

@Configuration
@Profile({ConfigurationProfiles.DEV})
public class CasaZoncolanAppEngineConfigForDev {
	
	final static String JPA_PKG = "be.pirlewiet.registrations";
	
	@Configuration
	@Profile( ConfigurationProfiles.DEV )
	public static class LocalServiceConfig {
		
		@Bean
		public LocalServiceTestHelper helper() {
			
			LocalServiceTestHelper helper
				= new LocalServiceTestHelper( new LocalAppIdentityServiceTestConfig(), new LocalDatastoreServiceTestConfig().setApplyAllHighRepJobPolicy(), new LocalMailServiceTestConfig() );
			helper.setUp();
			
			return helper;
			
		}
		
		
	}
	
}