package pe.com.granmercado.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.com.granmercado.dao.PersonaDAO;
import pe.com.granmercado.model.Persona;

@Service
public class PersonaServiceImpl implements PersonaService {

	private PersonaDAO personaDAO;

	public void addPerson(Persona p) {
		this.personaDAO.addPerson(p);
	}

	@Transactional
	public void updatePerson(Persona p) {
		this.personaDAO.updatePerson(p);
	}

	@Transactional
	public List<Persona> listPersons() {
		return this.personaDAO.listPersons();
	}

	@Transactional
	public Persona getPersonById(int id) {
		return this.personaDAO.getPersonById(id);
	}

	@Transactional
	public void removePerson(int id) {
		this.personaDAO.removePerson(id);
	}

}
