package com.crts.app.sme.main.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crts.app.sme.main.model.LedgerUpdationDetails;

@Repository
public interface LedgerUpdationDetailsRepository extends CrudRepository<LedgerUpdationDetails,Integer>
{

}
