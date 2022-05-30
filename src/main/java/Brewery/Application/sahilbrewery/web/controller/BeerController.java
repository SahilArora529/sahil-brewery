package Brewery.Application.sahilbrewery.web.controller;

import Brewery.Application.sahilbrewery.Services.BeerService;
import Brewery.Application.sahilbrewery.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;
@RequestMapping("/api/vi/beer")
@RestController
public class BeerController {
    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerid}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerid") UUID beerid)
    {
      return new ResponseEntity<>(beerService.getBeerById(beerid), HttpStatus.OK);
    }
}
