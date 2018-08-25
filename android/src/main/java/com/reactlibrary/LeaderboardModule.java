
package com.reactlibrary;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
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
  public void show(final String leaderboardName) {
  try {
    final Activity activity = getCurrentActivity();

    Games.getLeaderboardsClient(activity, GoogleSignIn.getLastSignedInAccount(reactContext))
            .getLeaderboardIntent(leaderboardName)
            .addOnSuccessListener(new OnSuccessListener<Intent>() {
              @Override
              public void onSuccess(final Intent intent) {
                UiThreadUtil.runOnUiThread(new Runnable() {
                  @Override
                  public void run() {
                    activity.startActivityForResult(intent, RC_LEADERBOARD_UI);
                  }
                });
              }
            });
  }
  catch (Exception ex)
  {
    System.out.println(ex.toString());
  }


  }
}