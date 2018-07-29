package com.$organization;format="package"$.$name$.api.monitoring;

import com.$organization;format="package"$.$name$.api.monitoring.dto.HealthResponseDto;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitoringApiImpl implements MonitoringApi {

  @Override
  public HealthResponseDto getHealth() {
    return new HealthResponseDto("ok");
  }

}
