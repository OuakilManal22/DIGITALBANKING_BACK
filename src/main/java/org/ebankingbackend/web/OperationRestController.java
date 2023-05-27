package org.ebankingbackend.web;

import lombok.AllArgsConstructor;
import org.ebankingbackend.entities.AccountOperation;
import org.ebankingbackend.repositories.AccountOperationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
@CrossOrigin("*")
public class OperationRestController
{

    private AccountOperationRepository accountOperationRepository;
    @GetMapping("/operations")
    public List<AccountOperation> listOperations(){
        return accountOperationRepository.findAll();
    }

    @GetMapping("/operations/{id}")
    public Optional<AccountOperation> getOperation(@PathVariable("id") Long id) {
        return accountOperationRepository.findById(id);
    }





}
