package jpabook.jpashop.domain;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import lombok.Getter;

@Embeddable
@Getter
public class Address {

    @Column(length = 10)
    private String city;
    private String street;
    private String zipcode;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(getCity(), address.getCity()) && Objects.equals(
                getStreet(), address.getStreet()) && Objects.equals(getZipcode(),
                address.getZipcode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCity(), getStreet(), getZipcode());
    }
}
