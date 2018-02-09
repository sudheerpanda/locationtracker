package com.imaginea.locationtracker.repository;

import com.imaginea.locationtracker.document.DeviceHistory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class LocationHistoryScheduler {
    private Logger LOGGER= LoggerFactory.getLogger(LocationHistoryScheduler.class);

    private DeviceHistoryRepository deviceHistoryRepository;

    private ConfigParamsRepository configParamsRepository;

    public LocationHistoryScheduler(DeviceHistoryRepository deviceHistoryRepository, ConfigParamsRepository configParamsRepository) {
        this.deviceHistoryRepository = deviceHistoryRepository;
        this.configParamsRepository = configParamsRepository;
    }

    @Scheduled(cron="${cron.expression}")
    public void cronJob(){
        LOGGER.info("history saving started");
        DeviceHistory deviceHistory=new DeviceHistory();
        deviceHistory.setDeviceId("1234");
        deviceHistory.setLatitude("Test");
        deviceHistoryRepository.save(deviceHistory);
    }

    public long getTimeInterval(){
        return  configParamsRepository.findByParamName("timeInterval");
    }
}
