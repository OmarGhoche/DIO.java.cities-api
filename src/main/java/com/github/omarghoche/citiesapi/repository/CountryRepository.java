package com.github.omarghoche.citiesapi.repository;

import com.github.omarghoche.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
