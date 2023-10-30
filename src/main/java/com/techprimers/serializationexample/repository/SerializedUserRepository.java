package com.techprimers.serializationexample.repository;

import com.techprimers.serializationexample.model.SerializedUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SerializedUserRepository extends JpaRepository<SerializedUser, Integer> {
}
