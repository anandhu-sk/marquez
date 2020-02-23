/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package marquez.common.models;

import com.google.common.base.Enums;

public enum JobType {
  BATCH("BATCH"),
  SERVICE("SERVICE"),
  STREAM("STREAM");

  private String value;
  private static final String DEFAULT_VALUE = "BATCH";

  public static JobType getDefault() {
    return JobType.valueOf(DEFAULT_VALUE);
  }

  public static JobType fromString(String input) {
    if (input == null || input.equals("")) {
      return getDefault();
    }
    return JobType.valueOf(input);
  }

  JobType(String type) {
    this.value = type;
  }

  public static boolean isValid(String input) {
    if (input == null) {
      return false;
    }
    return Enums.getIfPresent(JobType.class, input).isPresent();
  }
}
