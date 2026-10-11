package login.ep;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import login.bss.LoginBss;
import login.domain.LoginDomain;

@Path("/login")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RequestScoped
public class LoginEp {

	@Inject
	LoginBss loginBss;

	@GET
	public String teste() {
		return "Login funcionando";
	}

	@POST
	public void salvar(LoginDomain login) {
		loginBss.salvar(login);
	}
}