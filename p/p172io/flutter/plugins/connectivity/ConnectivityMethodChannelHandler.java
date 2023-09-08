package p172io.flutter.plugins.connectivity;

import p172io.flutter.plugin.common.MethodCall;
import p172io.flutter.plugin.common.MethodChannel;

/* renamed from: io.flutter.plugins.connectivity.ConnectivityMethodChannelHandler */
class ConnectivityMethodChannelHandler implements MethodChannel.MethodCallHandler {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    private Connectivity connectivity;

    public ConnectivityMethodChannelHandler(Connectivity connectivity2) {
        this.connectivity = connectivity2;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str = methodCall.method;
        str.getClass();
        if (!str.equals("check")) {
            result.notImplemented();
        } else {
            result.success(this.connectivity.getNetworkType());
        }
    }
}
