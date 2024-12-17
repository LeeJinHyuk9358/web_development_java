package c18_static.travelplan;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString

public class TravelPlan {
    // 필드 선언
    private String destination;
    private String departureDate;
    private String returnDate;
    private int numberOfTravelers;
    private String hotelName;
    private String flightNumber;
}
