package login.bss;

// Remova o import do jakarta.ejb.Stateless
import jakarta.enterprise.context.RequestScoped; // Ou @ApplicationScoped
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional; // Para gerir a transação da BD
import login.domain.LoginDomain;

@RequestScoped // Define como um Bean CDI gerenciável
@Transactional // Garante que o em.merge(login) roda dentro de uma transação ativa
public class LoginBss {

	@PersistenceContext(unitName = "MeuPu")
	private EntityManager em;

	public void salvar(LoginDomain login) {
		try {
			System.out.println(login);
			em.merge(login);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
