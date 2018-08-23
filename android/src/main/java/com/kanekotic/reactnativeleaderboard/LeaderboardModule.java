
package com.kanekotic.reactnativeleaderboard;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class LeaderboardModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public LeaderboardModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "Leaderboard";
  }
}