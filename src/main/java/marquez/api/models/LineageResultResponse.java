package marquez.api.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class LineageResultResponse {
  private final String subject;
  private final String subjectType;
  private final String subjectNamespace;
  private final String predicate;
  private final String object;
  private final String objectType;
  private final String objectNamespace;
}
