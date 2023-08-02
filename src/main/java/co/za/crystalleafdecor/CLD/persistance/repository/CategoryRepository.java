package co.za.crystalleafdecor.CLD.persistance.repository;

import co.za.crystalleafdecor.CLD.domain.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
}
