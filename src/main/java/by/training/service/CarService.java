package by.training.service;

import by.training.dao.CarDao;
import by.training.dao.DaoException;
import by.training.dao.hiberImpl.CarDaoHibern;
import by.training.model.Car;

import java.util.List;

public class CarService {
    private static CarService instance = new CarService();
    private CarDao dao = CarDaoHibern.getInstance();

    private CarService(){}

    public static CarService getInstance() {
        return instance;
    }

    public void addCar(Car car) throws ServiceException{
        try {
            dao.addCar(car);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    public List<Car> getCars() throws ServiceException {
        try {
            return dao.getCars();
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    public void deleteCar(int id) throws ServiceException {
        try {
            dao.deleteCar(id);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }

    public Car getCarById(int id) throws ServiceException {
        try {
            return dao.getCarById(id);
        } catch (DaoException e) {
            throw new ServiceException(e);
        }
    }
}
