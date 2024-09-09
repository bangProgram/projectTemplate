package project_directory_temp.rest.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="init")
public class InitEntity {
    @Id
    private Long id;
}
