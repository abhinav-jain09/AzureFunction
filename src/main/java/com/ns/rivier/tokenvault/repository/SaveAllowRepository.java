package com.ns.rivier.tokenvault.repository;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import com.ns.rivier.tokenvault.Entity.AllowList;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveAllowRepository extends CosmosRepository<AllowList, String> {

}
