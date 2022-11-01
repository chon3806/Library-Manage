package com.heman.demo.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heman.demo.entities.Notification;

@Repository
public interface NotificationRepository extends CrudRepository<Notification, Long> {

}
