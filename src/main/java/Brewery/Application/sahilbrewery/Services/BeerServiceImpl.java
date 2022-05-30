package Brewery.Application.sahilbrewery.Services;

import Brewery.Application.sahilbrewery.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .name("Budwiser")
                .build();
    }
}
