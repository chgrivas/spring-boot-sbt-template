package com.$organization;format="package"$.$name$.api.monitoring;

import com.$organization;format="package"$.$name$.api.monitoring.dto.HealthResponseDto;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
public interface MonitoringApi {

  @RequestMapping("/health")
  HealthResponseDto getHealth();

}
