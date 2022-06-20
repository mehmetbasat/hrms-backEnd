package com.basat.hrms.dataAccess.abstracts;

import com.basat.hrms.entities.concretes.Image;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ImageDao extends JpaRepository<Image,Integer> {
    List<Image> findByOrderById();
    Image findByCvId(int id);
}
