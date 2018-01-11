package com.swisscom.iam.sit.repository;

import com.swisscom.iam.sit.domain.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting, Long>{
}
