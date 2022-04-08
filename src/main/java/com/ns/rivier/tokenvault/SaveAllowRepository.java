package com.ns.rivier.tokenvault;

import com.azure.spring.data.cosmos.repository.CosmosRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface SaveAllowRepository extends CosmosRepository<AllowList, String> {

}
