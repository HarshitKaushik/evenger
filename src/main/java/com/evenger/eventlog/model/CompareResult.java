package com.evenger.eventlog.model;

/**
 * Model class for Comparison result JSON strings
 * Created by harshit on 1/11/17.
 */
public class CompareResult {
  private String oldObjectJson;
  private String newObjectJson;

  /**
   * @return oldObjectJson
   */
  public String getOldObjectJson() {
    return oldObjectJson;
  }

  /**
   * @param oldObjectJson
   *     the oldObjectJson to set
   */
  public void setOldObjectJson(String oldObjectJson) {
    this.oldObjectJson = oldObjectJson;
  }

  /**
   * @return newObjectJson
   */
  public String getNewObjectJson() {
    return newObjectJson;
  }

  /**
   * @param newObjectJson
   *     the newObjectJson to set
   */
  public void setNewObjectJson(String newObjectJson) {
    this.newObjectJson = newObjectJson;
  }
}
