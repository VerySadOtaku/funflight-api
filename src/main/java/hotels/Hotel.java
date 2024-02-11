package hotels;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {

    @Id
    @GeneratedValue
    private Long id;

    private String hotelCountry;
    private String hotelCity;
    private String hotelName;
    private String hotelStarsCount;
    private String hotelAddress;

    public String getHotelCountry() {
        return hotelCountry;
    }

    public void setHotelCountry(String hotelCountry) {
        this.hotelCountry = hotelCountry;
    }

    public String getHotelCity() {
        return hotelCity;
    }

    public void setHotelCity(String hotelCity) {
        this.hotelCity = hotelCity;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelStarsCount() {
        return hotelStarsCount;
    }

    public void setHotelStarsCount(String hotelStarsCount) {
        this.hotelStarsCount = hotelStarsCount;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
}
