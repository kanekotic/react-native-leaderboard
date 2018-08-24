
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class LeaderboardModule extends ReactContextBaseJavaModule {

  public LeaderboardModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "Leaderboard";
  }

  @ReactMethod
  public void show() {

  }
}