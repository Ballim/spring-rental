package co.za.crystalleafdecor.CLD.persistance.repository;

import co.za.crystalleafdecor.CLD.domain.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item,Long> {
    List<Item> findAllByCategoryCategoryId(Long categoryId);
}
