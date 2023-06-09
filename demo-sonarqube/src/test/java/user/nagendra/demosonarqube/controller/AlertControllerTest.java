package user.nagendra.demosonarqube.controller;

import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import user.nagendra.demosonarqube.dto.AlertStatus;
import user.nagendra.demosonarqube.dto.SummaryData;
import user.nagendra.demosonarqube.service.AlertService;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class AlertControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AlertService alertService;


    @Test
    void getAlertAboutStateTest() throws Exception {

        AlertStatus alertStatus = new AlertStatus();
        alertStatus.setAlertLevel("GREEN");
        Mockito.when(alertService.getAlertAboutState(ArgumentMatchers.anyString())).thenReturn(alertStatus);

        mockMvc.perform(get("/india/maharashtra"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"alertLevel\":\"GREEN\",\"measuresToBeTaken\":null,\"summaryData\":null}"));
    }

    @Test
    void getSummaryTest() throws Exception {

        SummaryData sd  = new SummaryData();

        Mockito.when(alertService.getOverAllSummary()).thenReturn(sd);

        mockMvc.perform(get("/india/summary"))
                .andExpect(status().isOk())
                .andExpect(content().json("{\"total\":0,\"confirmedCasesIndian\":0,\"confirmedCasesForeign\":0,\"discharged\":0,\"deaths\":0,\"confirmedButLocationUnidentified\":0,\"updateTime\":null}"));
    }

    @Test
    void invalidEndpoint() throws Exception {

        mockMvc.perform(get("/india123"))
                .andExpect(status().isNotFound());
    }
}