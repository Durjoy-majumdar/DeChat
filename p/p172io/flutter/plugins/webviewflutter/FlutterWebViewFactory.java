package p172io.flutter.plugins.webviewflutter;

import android.content.Context;
import p172io.flutter.plugin.common.StandardMessageCodec;
import p172io.flutter.plugin.platform.PlatformView;
import p172io.flutter.plugin.platform.PlatformViewFactory;

/* renamed from: io.flutter.plugins.webviewflutter.FlutterWebViewFactory */
class FlutterWebViewFactory extends PlatformViewFactory {
    private final InstanceManager instanceManager;

    public FlutterWebViewFactory(InstanceManager instanceManager2) {
        super(StandardMessageCodec.INSTANCE);
        this.instanceManager = instanceManager2;
    }

    public PlatformView create(Context context, int i, Object obj) {
        PlatformView platformView = (PlatformView) this.instanceManager.getInstance((long) ((Integer) obj).intValue());
        if (platformView != null) {
            return platformView;
        }
        throw new IllegalStateException("Unable to find WebView instance: " + obj);
    }
}
