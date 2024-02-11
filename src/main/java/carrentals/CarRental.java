package carrentals;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="car_rental")
public class CarRental {

    @Id
    @GeneratedValue
    private Long id;
    private String carRentalCountry;
    private String carRentalCity;
    private String carModel;
    private String carModelConfig;

    public String getCarRentalCountry() {
        return carRentalCountry;
    }

    public void setCarRentalCountry(String carRentalCountry) {
        this.carRentalCountry = carRentalCountry;
    }

    public String getCarRentalCity() {
        return carRentalCity;
    }

    public void setCarRentalCity(String carRentalCity) {
        this.carRentalCity = carRentalCity;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModelConfig() {
        return carModelConfig;
    }

    public void setCarModelConfig(String carModelConfig) {
        this.carModelConfig = carModelConfig;
    }
}
