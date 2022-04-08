package com.api.parkingcontrol.services;

import com.api.parkingcontrol.model.ParkingSpotModel;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ParkingSpotService {

    final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }
    void teste(ParkingSpotModel model) {

        List<ParkingSpotModel> parkingSpotModels = new ArrayList<>();

        ParkingSpotModel carroNovo = new ParkingSpotModel();
        ParkingSpotModel carroNovo2 = new ParkingSpotModel();

        parkingSpotModels.add(carroNovo);
        parkingSpotModels.add(carroNovo2);

        parkingSpotRepository.save(model);

    }

    public void salvaCarro(ParkingSpotModel carro) throws Exception {

        parkingSpotRepository.save(carro);
    }

    public List<ParkingSpotModel> listaTodasAsVagas() {
        return parkingSpotRepository.findAll();
    }
}
