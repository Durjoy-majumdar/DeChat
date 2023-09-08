package p172io.flutter.plugins.connectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import p172io.flutter.embedding.engine.plugins.FlutterPlugin;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugin.common.EventChannel;
import p172io.flutter.plugin.common.MethodChannel;
import p172io.flutter.plugin.common.PluginRegistry;

/* renamed from: io.flutter.plugins.connectivity.ConnectivityPlugin */
public class ConnectivityPlugin implements FlutterPlugin {
    private EventChannel eventChannel;
    private MethodChannel methodChannel;

    public static void registerWith(PluginRegistry.Registrar registrar) {
        new ConnectivityPlugin().setupChannels(registrar.messenger(), registrar.context());
    }

    private void setupChannels(BinaryMessenger binaryMessenger, Context context) {
        this.methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/connectivity");
        this.eventChannel = new EventChannel(binaryMessenger, "plugins.flutter.io/connectivity_status");
        Connectivity connectivity = new Connectivity((ConnectivityManager) context.getSystemService("connectivity"));
        ConnectivityMethodChannelHandler connectivityMethodChannelHandler = new ConnectivityMethodChannelHandler(connectivity);
        ConnectivityBroadcastReceiver connectivityBroadcastReceiver = new ConnectivityBroadcastReceiver(context, connectivity);
        this.methodChannel.setMethodCallHandler(connectivityMethodChannelHandler);
        this.eventChannel.setStreamHandler(connectivityBroadcastReceiver);
    }

    private void teardownChannels() {
        this.methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.eventChannel.setStreamHandler((EventChannel.StreamHandler) null);
        this.methodChannel = null;
        this.eventChannel = null;
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setupChannels(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        teardownChannels();
    }
}
