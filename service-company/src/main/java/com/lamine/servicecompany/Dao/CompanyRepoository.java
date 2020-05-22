package com.lamine.servicecompany.Dao;

import com.lamine.servicecompany.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompanyRepoository extends JpaRepository<Company,Long> {

}
