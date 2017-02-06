package spark.gradle

class Person {
	int id
	String nom = ""
	String prenom = ""
}
	
class PersonService {
	PersonDAO dao

	def PersonService(PersonDAO dao) {
		this.dao = dao
	}


	def getPerson(id) {

		return dao.find(id)
	}

	def getPersons() {
		return dao.findAll()
	}

	def addPerson(nom, prenom) {
		dao.insertPerson(new Person(nom:nom, prenom:prenom))
	}
	
	def deletePerson(id) {
		dao.delete(id)
	}
}