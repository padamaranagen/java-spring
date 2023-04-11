package user.nagendra.demosonarqube.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SummaryData extends BaseData{

    private int total;
    private int confirmedButLocationUnidentified;

    private ZonedDateTime updateTime;
}
