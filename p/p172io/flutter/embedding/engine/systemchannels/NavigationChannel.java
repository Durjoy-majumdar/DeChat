package p172io.flutter.embedding.engine.systemchannels;

import p172io.flutter.Log;
import p172io.flutter.embedding.engine.dart.DartExecutor;
import p172io.flutter.plugin.common.JSONMethodCodec;
import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: io.flutter.embedding.engine.systemchannels.NavigationChannel */
public class NavigationChannel {
    private static final String TAG = "NavigationChannel";
    public final MethodChannel channel;
    private final MethodChannel.MethodCallHandler defaultHandler;

    public NavigationChannel(DartExecutor dartExecutor) {
        C1172451 r0 = new MethodChannel.MethodCallHandler() {
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                result.success((Object) null);
            }
        };
        this.defaultHandler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/navigation", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    public void popRoute() {
        Log.m165290v(TAG, "Sending message to pop route.");
        this.channel.invokeMethod("popRoute", (Object) null);
    }

    public void pushRoute(String str) {
        Log.m165290v(TAG, "Sending message to push route '" + str + "'");
        this.channel.invokeMethod("pushRoute", str);
    }

    public void setInitialRoute(String str) {
        Log.m165290v(TAG, "Sending message to set initial route to '" + str + "'");
        this.channel.invokeMethod("setInitialRoute", str);
    }

    public void setMethodCallHandler(MethodChannel.MethodCallHandler methodCallHandler) {
        this.channel.setMethodCallHandler(methodCallHandler);
    }
}
