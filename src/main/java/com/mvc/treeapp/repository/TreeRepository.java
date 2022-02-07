package com.mvc.treeapp.repository;

import com.mvc.treeapp.model.entity.Tree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface TreeRepository extends JpaRepository<Tree,Long> {
}
