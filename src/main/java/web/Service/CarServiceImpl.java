package web.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private CarDao car;
    @Override
    public List<Car> getCarList(List<Car> carList, Integer count) {
        return car.getCarList(carList, count);
    }
}