package Brewery.Application.sahilbrewery.Services;

import Brewery.Application.sahilbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
   BeerDto getBeerById(UUID beerId);
}
