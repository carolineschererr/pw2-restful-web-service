package restfulwebservice.restfulwebservice;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.auth.LoginConfig;

@ApplicationPath("/web_test")
@LoginConfig(authMethod = "MP-JWT", realmName = "jwt-jaspi")
public class WebService extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new HashSet<Class<?>>();

        resources.add(Converter.class);

        return resources;
    }
}