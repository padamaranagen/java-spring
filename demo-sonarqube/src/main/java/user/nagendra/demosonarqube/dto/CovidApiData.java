package user.nagendra.demosonarqube.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CovidApiData {
    private boolean success;

    private CountryData data;

    private ZonedDateTime lastRefreshed;

    private ZonedDateTime lastOriginUpdate;
}
