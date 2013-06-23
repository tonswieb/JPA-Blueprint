package nl.finalist.esb.blueprint.jpa;

import nl.finalist.esb.blueprint.jpa.entities.Test;

public interface TestRepository extends Repository<Test> {
	
	//For easy testing with a camel route
	public boolean add(long key);
}
