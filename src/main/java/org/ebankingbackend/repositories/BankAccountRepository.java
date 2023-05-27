package org.ebankingbackend.repositories;

import org.ebankingbackend.entities.BankAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {

    @Query("SELECT c FROM BankAccount c WHERE c.id LIKE %:kw%")
    List<BankAccount> searchAccount(@Param("kw") String keyword);
}
