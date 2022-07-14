package restfulwebservice.restfulwebservice;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("/conversor")
public class Converter {
    
	@GET
	@Path("/km-mile/{km}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String ConvertKmToMile(@PathParam("km") double km){
		double mile = (km / 1.609);
        String result = Double.toString(mile);		
		return result;
	}
	@POST
	
	@Path("/mile-km/{mile}")
	@Produces(MediaType.APPLICATION_FORM_URLENCODED)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public Object ConvertMileToKm(@PathParam("mile") double mile){
		double km  = (mile / 1.852);
        Object result = km;
		return result;
	}
	
}