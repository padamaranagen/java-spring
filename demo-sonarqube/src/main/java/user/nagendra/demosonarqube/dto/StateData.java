package user.nagendra.demosonarqube.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StateData  extends BaseData{
    private String loc;
    private int totalConfirmed;

}
