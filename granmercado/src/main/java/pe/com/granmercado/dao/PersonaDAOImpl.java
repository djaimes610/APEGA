package pe.com.granmercado.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import pe.com.granmercado.model.Persona;

@Repository("personaDao")
public class PersonaDAOImpl extends AbstractDao implements PersonaDAO {

	public void addPerson(Persona p) {
		Session session = getSession();
		session.persist(p);
		// logger.info("Person saved successfully, Person Details="+p);

	}

	public void updatePerson(Persona p) {
		Session session = getSession();
		session.update(p);
	}

	@SuppressWarnings("unchecked")
	public List<Persona> listPersons() {
		Criteria criteria = getSession().createCriteria(Persona.class);
		try {
			return (List<Persona>) criteria.list();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("errorrr " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public Persona getPersonById(int id) {
		return (Persona) getSession().get(Persona.class, id);
	}

	public void removePerson(int id) {
		Session currentSession = getSession();

		Persona result = (Persona) currentSession.createCriteria(Persona.class).add(Restrictions.idEq(id))
				.uniqueResult();

		if (result != null) {
			currentSession.delete(result);
		}

	}

}
