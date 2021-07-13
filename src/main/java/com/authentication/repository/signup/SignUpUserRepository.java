package com.authentication.repository.signup;

import com.authentication.model.signup.Signuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SignUpUserRepository extends JpaRepository<Signuser, Long> {
    Optional<Signuser> findByEmail(String email);

    Optional<Signuser> findByToken(String token);
}
