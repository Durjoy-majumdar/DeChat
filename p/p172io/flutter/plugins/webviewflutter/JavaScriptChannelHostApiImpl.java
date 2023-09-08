package p172io.flutter.plugins.webviewflutter;

import android.os.Handler;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl */
public class JavaScriptChannelHostApiImpl implements GeneratedAndroidWebView.JavaScriptChannelHostApi {
    private final JavaScriptChannelFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;
    private final JavaScriptChannelCreator javaScriptChannelCreator;
    private Handler platformThreadHandler;

    /* renamed from: io.flutter.plugins.webviewflutter.JavaScriptChannelHostApiImpl$JavaScriptChannelCreator */
    public static class JavaScriptChannelCreator {
        public JavaScriptChannel createJavaScriptChannel(JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, String str, Handler handler) {
            return new JavaScriptChannel(javaScriptChannelFlutterApiImpl, str, handler);
        }
    }

    public JavaScriptChannelHostApiImpl(InstanceManager instanceManager2, JavaScriptChannelCreator javaScriptChannelCreator2, JavaScriptChannelFlutterApiImpl javaScriptChannelFlutterApiImpl, Handler handler) {
        this.instanceManager = instanceManager2;
        this.javaScriptChannelCreator = javaScriptChannelCreator2;
        this.flutterApi = javaScriptChannelFlutterApiImpl;
        this.platformThreadHandler = handler;
    }

    public void create(Long l, String str) {
        this.instanceManager.addInstance(this.javaScriptChannelCreator.createJavaScriptChannel(this.flutterApi, str, this.platformThreadHandler), l.longValue());
    }

    public void setPlatformThreadHandler(Handler handler) {
        this.platformThreadHandler = handler;
    }
}
