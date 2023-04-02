package com.mustafa.weather.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

//getter ve constractor oluşturan sınıf
public record Location(String name,
                       String country,
                       String region,
                       Double lat,
                       Double lon,
                       @JsonProperty("timezone_id")
                       String timezoneId,
                       String localtime,
                       @JsonProperty("localtime_epoch")
                       String localtimeEpoch,
                       @JsonProperty("utc_offset")
                       String utcOffset) {
}
