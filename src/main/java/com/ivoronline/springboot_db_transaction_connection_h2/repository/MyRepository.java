package com.ivoronline.springboot_db_transaction_connection_h2.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

  //PROPERTIES
  @Autowired private JdbcTemplate jdbcTemplate;

  //=========================================================================================================
  // INSERT
  //=========================================================================================================
  public int insert(String name, int age) {
    return jdbcTemplate.update(
      " INSERT INTO PERSON (NAME, AGE) VALUES (?, ?)"
      , new Object[] { name, age }
    );
  }

}

