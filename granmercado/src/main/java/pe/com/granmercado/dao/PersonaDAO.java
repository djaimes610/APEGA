package pe.com.granmercado.dao;

import java.util.List;

import pe.com.granmercado.model.Persona;

public interface PersonaDAO {

	
	public void addPerson(Persona p);
    public void updatePerson(Persona p);
    public List<Persona> listPersons();
    public Persona getPersonById(int id);
    public void removePerson(int id);
}
