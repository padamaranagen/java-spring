package user.nagendra.demosonarqube.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseData {
    private int confirmedCasesIndian;
    private int confirmedCasesForeign;
    private int discharged;
    private int deaths;
}
