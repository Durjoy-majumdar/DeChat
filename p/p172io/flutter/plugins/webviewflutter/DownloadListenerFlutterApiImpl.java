package p172io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import p172io.flutter.plugin.common.BinaryMessenger;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.DownloadListenerFlutterApiImpl */
public class DownloadListenerFlutterApiImpl extends GeneratedAndroidWebView.DownloadListenerFlutterApi {
    private final InstanceManager instanceManager;

    public DownloadListenerFlutterApiImpl(BinaryMessenger binaryMessenger, InstanceManager instanceManager2) {
        super(binaryMessenger);
        this.instanceManager = instanceManager2;
    }

    public void dispose(DownloadListener downloadListener, GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply<Void> reply) {
        Long removeInstance = this.instanceManager.removeInstance(downloadListener);
        if (removeInstance != null) {
            dispose(removeInstance, reply);
        } else {
            reply.reply(null);
        }
    }

    public void onDownloadStart(DownloadListener downloadListener, String str, String str2, String str3, String str4, long j, GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply<Void> reply) {
        DownloadListener downloadListener2 = downloadListener;
        onDownloadStart(this.instanceManager.getInstanceId(downloadListener), str, str2, str3, str4, Long.valueOf(j), reply);
    }
}
