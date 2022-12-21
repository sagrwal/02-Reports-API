package com.primesoft.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.primesoft.entity.EligibilityDetails;
import com.primesoft.repo.EligibilityDetailsRepo;

@Component
public class AppRunner implements ApplicationRunner {

	@Autowired
	private EligibilityDetailsRepo repo;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		EligibilityDetails entity1= new EligibilityDetails();
		entity1.setEligId(1);
		entity1.setName("John");
		entity1.setMobile(1626672728l);
		entity1.setGender('M');
		entity1.setSsn(987766655567l);
        entity1.setPlanName("CCFD");
        entity1.setPlanStatus("Denied");
        repo.save(entity1);
        
        EligibilityDetails entity2= new EligibilityDetails();
		entity2.setEligId(2);
		entity2.setName("Marry");
		entity2.setMobile(1626882728l);
		entity2.setGender('F');
		entity2.setSsn(9875555567l);
        entity2.setPlanName("GHCFD");
        entity2.setPlanStatus("Approved");
        repo.save(entity2);
        
        EligibilityDetails entity3= new EligibilityDetails();
		entity3.setEligId(3);
		entity3.setName("Son");
		entity3.setMobile(16268892728l);
		entity3.setGender('M');
		entity3.setSsn(9877666567l);
        entity3.setPlanName("SSFD");
        entity3.setPlanStatus("Closed");
        repo.save(entity3);
	}

	
	
}
