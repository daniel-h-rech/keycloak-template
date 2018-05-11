package rech.haeser.daniel;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("api/" + RESTApplication.VERSION)
public class RESTApplication extends javax.ws.rs.core.Application {

    public static final String VERSION = "v1";
}
