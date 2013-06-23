package nl.finalist.esb.blueprint.jpa.impl.repository;

import javax.persistence.EntityManager;

import nl.finalist.esb.blueprint.jpa.entities.Test;
import nl.finalist.esb.blueprint.jpa.impl.EntityManagerRepository;

public class TestRepository extends EntityManagerRepository<Test> implements nl.finalist.esb.blueprint.jpa.TestRepository {

	public TestRepository(EntityManager entityManager) {
		super(entityManager);
	}
	
	public boolean add(long key) {
		Test test = new Test();
		test.setKey(key);
		super.merge(test);
		return true;
	}
}
