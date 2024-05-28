package com.example.Springmogodp.Repositary;

import com.example.Springmogodp.Model.Frutis;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface FruitsRepositar extends MongoRepository<Frutis,String> {

}
