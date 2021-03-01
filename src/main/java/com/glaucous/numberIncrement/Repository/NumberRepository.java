package com.glaucous.numberIncrement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.glaucous.numberIncrement.model.Number;

@Repository
public interface NumberRepository extends JpaRepository<Number, Integer>{


}
