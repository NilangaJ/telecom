package lk.crystal.asset.color.entity;

import com.fasterxml.jackson.annotation.JsonFilter;
import lk.crystal.asset.item.entity.Item;
import lk.crystal.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("ItemColor")
public class ItemColor extends AuditEntity {

    @NotNull
    @Size(min = 1, message = "This name length should be more than one character")
    private String name;

    @OneToMany(mappedBy = "itemColor")
    private List<Item> items;


}
