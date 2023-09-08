package p172io.flutter.plugins.webviewflutter;

import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.JavaScriptChannelFlutterApiImpl */
public class JavaScriptChannelFlutterApiImpl extends GeneratedAndroidWebView.JavaScriptChannelFlutterApi {
    private final InstanceManager instanceManager;

    public JavaScriptChannelFlutterApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager2) {
        super(binaryMessenger);
        this.instanceManager = instanceManager2;
    }

    public void dispose(JavaScriptChannel javaScriptChannel, GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply<Void> reply) {
        Long removeInstance = this.instanceManager.removeInstance(javaScriptChannel);
        if (removeInstance != null) {
            dispose(removeInstance, reply);
        } else {
            reply.reply(null);
        }
    }

    public void postMessage(JavaScriptChannel javaScriptChannel, String str, GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply<Void> reply) {
        super.postMessage(this.instanceManager.getInstanceId(javaScriptChannel), str, reply);
    }
}
