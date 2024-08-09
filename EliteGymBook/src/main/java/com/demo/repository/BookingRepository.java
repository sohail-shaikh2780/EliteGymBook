package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.beans.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
}
