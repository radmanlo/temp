package com.lostObjects.webApp.repository;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.lostObjects.webApp.model.User;

public interface UserRepository extends CassandraRepository<User, Integer> {

}
