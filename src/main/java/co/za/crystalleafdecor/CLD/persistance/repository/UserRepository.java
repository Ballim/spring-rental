package co.za.crystalleafdecor.CLD.persistance.repository;

import co.za.crystalleafdecor.CLD.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}