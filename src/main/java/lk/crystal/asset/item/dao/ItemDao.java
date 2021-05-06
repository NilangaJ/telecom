package lk.crystal.asset.item.dao;


import lk.crystal.asset.category.entity.Category;
import lk.crystal.asset.item.entity.Item;
import lk.crystal.asset.item_color.entity.ItemColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public interface ItemDao extends JpaRepository<Item, Integer> {
    Item findFirstByOrderByIdDesc();

    List<Item> findByCategory(Category category);

    List<Item> findByItemColor(ItemColor itemColor);
}
