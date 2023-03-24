package com.spring.mongo.multitenant.mongo.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Singer {

  private String name;
  private VoiceType voiceType;

}
