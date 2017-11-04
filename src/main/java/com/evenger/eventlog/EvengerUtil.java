package com.evenger.eventlog;

import org.apache.commons.collections.CollectionUtils;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;

import com.evenger.eventlog.model.CompareResult;

/**
 * Main Util class for Event Logging
 * Created by harshit on 1/11/17.
 */
public class EvengerUtil {

  private EvengerUtil() {
  }

  /**
   * Method to compare old object and new object values for event logging
   * @param oldObject with values
   * @param newObject with values
   * @return {@link CompareResult with oldObjectJson, newObjectJson}
   */
  public static CompareResult compare(Object oldObject, Object newObject) {
    System.out.println("Inside here");
    Javers javers = JaversBuilder.javers().build();
    Diff diff = javers.compare(oldObject, newObject);
    System.out.println(diff);
    return null;
  }

  /**
   * Private method to generate compare result with oldObjectJson and newObjectJson
   * @param diff Javers Diff class object with list of changes after comparison of two objects
   * @return {@link CompareResult with oldObjectJson and newObjectJson}
   */
  private static CompareResult generateCompareResultFromDiff(Diff diff) {
    CompareResult compareResult = new CompareResult();
    if (diff == null || CollectionUtils.isEmpty(diff.getChanges())) {
      return compareResult;
    }
//    List<ValueChange> changes = diff.getChangesByType(ValueChange.class);
//    Map<String, Object> oldObjectMap = new LinkedTreeMap<String, Object>();
//    Map<String, Object> newObjectMap = new LinkedTreeMap<String, Object>();
//    Set<String> fieldNamesSet = new HashSet<String>();
//    Map<String, Object> stringObjectMap = new LinkedHashMap<String, Object>();
//    for (ValueChange change : changes) {
//      if (change.getAffectedGlobalId().par)
//    }
    return null;
  }
}
