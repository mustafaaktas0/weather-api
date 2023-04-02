package com.mustafa.weather.repository;

import com.mustafa.weather.model.WeatherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity,String> {

    //Select * from entity where requestedcityName order by updateTime desc limit 1
    Optional<WeatherEntity> findFirstByRequestedCityNameOrderByUpdatedTimeDesc(String city);
}
