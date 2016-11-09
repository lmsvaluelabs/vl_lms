package com.vl.lms.config;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.vl.lms.resource.EmployeeResource;

/**
 * @author hari.polnati
 *
 */
@ApplicationPath("/webapi")
public class LMSConfig extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> resourcesSet = new HashSet<Class<?>>();
		resourcesSet.add(EmployeeResource.class);
		return resourcesSet;
	}
}
