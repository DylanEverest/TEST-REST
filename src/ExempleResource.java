import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/exemple")
public class ExempleResource 
{
    @GET

    @Produces(MediaType.TEXT_PLAIN)

    @Path("/getexemple")

    public String getExemple() 
    {
        return "Ceci est un exemple de service web JAX-RS !";
    }
}
