package com.configuration.configuration.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Info {

  private long heapSize;
  private long maxHeapSize;
  private long freeHeapSize;
  
}
