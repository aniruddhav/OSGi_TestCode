package osgitest;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class FirstISGiBundle implements BundleActivator {

	public void start(BundleContext context) throws Exception {
		System.out.println("Hello world.");
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye world.");
		
	}

}
