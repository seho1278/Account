package com.example.accountproject.repository;

import com.example.accountproject.domain.Account;
import com.example.accountproject.domain.AccountUser;
import com.example.accountproject.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TransactionRepository
        extends JpaRepository<Transaction, Long> {

    Optional<Transaction> findByTransactionId(String transactionId);
}
