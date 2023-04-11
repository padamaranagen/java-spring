package user.nagendra.demosonarqube.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlertStatus {

    private String alertLevel;//RED, GREEN, ORNAGE

    private List<String> measuresToBeTaken;

    private StateData summaryData;

    public StateData getSummaryData() {
        return summaryData;
    }

    public void setSummaryData(StateData summaryData) {
        this.summaryData = summaryData;
    }

    public String getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
    }

    public List<String> getMeasuresToBeTaken() {
        return measuresToBeTaken;
    }

    public void setMeasuresToBeTaken(List<String> measuresToBeTaken) {
        this.measuresToBeTaken = measuresToBeTaken;
    }
}
