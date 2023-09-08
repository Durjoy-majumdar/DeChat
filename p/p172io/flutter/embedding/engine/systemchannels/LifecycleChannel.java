package p172io.flutter.embedding.engine.systemchannels;

import p172io.flutter.Log;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.BasicMessageChannel;
import p172io.flutter.plugin.common.StringCodec;

/* renamed from: io.flutter.embedding.engine.systemchannels.LifecycleChannel */
public class LifecycleChannel {
    private static final String TAG = "LifecycleChannel";
    public final BasicMessageChannel<String> channel;

    public LifecycleChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<>(dartExecutor, "flutter/lifecycle", StringCodec.INSTANCE);
    }

    public void appIsDetached() {
        Log.m165290v(TAG, "Sending AppLifecycleState.detached message.");
        this.channel.send("AppLifecycleState.detached");
    }

    public void appIsInactive() {
        Log.m165290v(TAG, "Sending AppLifecycleState.inactive message.");
        this.channel.send("AppLifecycleState.inactive");
    }

    public void appIsPaused() {
        Log.m165290v(TAG, "Sending AppLifecycleState.paused message.");
        this.channel.send("AppLifecycleState.paused");
    }

    public void appIsResumed() {
        Log.m165290v(TAG, "Sending AppLifecycleState.resumed message.");
        this.channel.send("AppLifecycleState.resumed");
    }
}
