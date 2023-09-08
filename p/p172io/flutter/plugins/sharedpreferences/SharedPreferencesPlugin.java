package p172io.flutter.plugins.sharedpreferences;

import android.content.Context;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.plugin.common.PluginRegistry;

/* renamed from: io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin */
public class SharedPreferencesPlugin implements FlutterPlugin {
    private static final String CHANNEL_NAME = "plugins.flutter.io/shared_preferences_android";
    private MethodChannel channel;
    private MethodCallHandlerImpl handler;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new SharedPreferencesPlugin().setupChannel(registrar.messenger(), registrar.context());
    }

    private void setupChannel(BinaryMessenger binaryMessenger, Context context) {
        this.channel = new MethodChannel(binaryMessenger, CHANNEL_NAME);
        MethodCallHandlerImpl methodCallHandlerImpl = new MethodCallHandlerImpl(context);
        this.handler = methodCallHandlerImpl;
        this.channel.setMethodCallHandler(methodCallHandlerImpl);
    }

    private void teardownChannel() {
        this.handler.teardown();
        this.handler = null;
        this.channel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.channel = null;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setupChannel(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        teardownChannel();
    }
}
