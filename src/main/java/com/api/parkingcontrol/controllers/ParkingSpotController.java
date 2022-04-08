package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.services.ParkingSpotService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController<T> {

    final ParkingSpotService parkingSpotService;

    public ParkingSpotController(ParkingSpotService parkingSpotService) {
        this.parkingSpotService = parkingSpotService;
    }


    @PostMapping
    void guardaVaga(@RequestBody ParkingSpotModel carro) throws Exception {
        parkingSpotService.salvaCarro(carro);
    }

    @GetMapping
    List<ParkingSpotModel> pegaTudo() {
       return parkingSpotService.listaTodasAsVagas();
    }

}
