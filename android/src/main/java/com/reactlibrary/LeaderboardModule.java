
package com.reactlibrary;

import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.games.Games;
import com.google.android.gms.tasks.OnSuccessListener;

public class LeaderboardModule extends ReactContextBaseJavaModule {

  private static final int RC_LEADERBOARD_UI = 9004;

  private final ReactApplicationContext reactContext;

  public LeaderboardModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "Leaderboard";
  }

  @ReactMethod
  public void show(String LeaderboardId) {
    Games.getLeaderboardsClient(this.reactContext, GoogleSignIn.getLastSignedInAccount(this.reactContext))
            .getLeaderboardIntent(LeaderboardId)
            .addOnSuccessListener(new OnSuccessListener<Intent>() {
              @Override
              public void onSuccess(Intent intent) {
//                startActivityForResult(intent, RC_LEADERBOARD_UI);
              }
            });

  }
}