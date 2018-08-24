package com.reactlibrary;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.mockito.Mockito.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import android.content.Context;
import android.content.SharedPreferences;

import com.facebook.react.bridge.ReactApplicationContext;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class LeaderboardModuleTest {

    @Test
    public void getNameShouldReturnStringLeaderboardTest() {
        ReactApplicationContext context = mock(ReactApplicationContext.class);
        LeaderboardModule instance = new LeaderboardModule(context);

        assertThat(instance.getName(), is("Leaderboard"));
    }

    @Test
    public void showLeaderboardShouldOpenLeaderboardTest() {
        ReactApplicationContext context = mock(ReactApplicationContext.class);
        LeaderboardModule instance = new LeaderboardModule(context);
//        instance.show("pepe");
    }
}