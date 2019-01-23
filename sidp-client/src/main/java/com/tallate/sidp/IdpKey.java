package com.tallate.sidp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author tallate
 * @date 1/19/19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class IdpKey {

  private String id;

  private KeyState keyState;

  @Override
  public String toString() {
    return "IdpKey{" +
        "id='" + id + '\'' +
        ", keyState=" + keyState +
        '}';
  }
}