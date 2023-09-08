package p172io.flutter.plugins.webviewflutter;

import android.webkit.DownloadListener;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl */
public class DownloadListenerHostApiImpl implements GeneratedAndroidWebView.DownloadListenerHostApi {
    private final DownloadListenerCreator downloadListenerCreator;
    private final DownloadListenerFlutterApiImpl flutterApi;
    private final InstanceManager instanceManager;

    /* renamed from: io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl$DownloadListenerCreator */
    public static class DownloadListenerCreator {
        public DownloadListenerImpl createDownloadListener(DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            return new DownloadListenerImpl(downloadListenerFlutterApiImpl);
        }
    }

    /* renamed from: io.flutter.plugins.webviewflutter.DownloadListenerHostApiImpl$DownloadListenerImpl */
    public static class DownloadListenerImpl implements DownloadListener, Releasable {
        private DownloadListenerFlutterApiImpl flutterApi;

        public DownloadListenerImpl(DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
            this.flutterApi = downloadListenerFlutterApiImpl;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$onDownloadStart$0(Void voidR) {
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ void lambda$release$1(Void voidR) {
        }

        public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl = this.flutterApi;
            if (downloadListenerFlutterApiImpl != null) {
                downloadListenerFlutterApiImpl.onDownloadStart(this, str, str2, str3, str4, j, new DownloadListenerHostApiImpl$DownloadListenerImpl$$a());
            }
        }

        public void release() {
            DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl = this.flutterApi;
            if (downloadListenerFlutterApiImpl != null) {
                downloadListenerFlutterApiImpl.dispose(this, new DownloadListenerHostApiImpl$DownloadListenerImpl$$b());
            }
            this.flutterApi = null;
        }
    }

    public DownloadListenerHostApiImpl(InstanceManager instanceManager2, DownloadListenerCreator downloadListenerCreator2, DownloadListenerFlutterApiImpl downloadListenerFlutterApiImpl) {
        this.instanceManager = instanceManager2;
        this.downloadListenerCreator = downloadListenerCreator2;
        this.flutterApi = downloadListenerFlutterApiImpl;
    }

    public void create(Long l) {
        this.instanceManager.addInstance(this.downloadListenerCreator.createDownloadListener(this.flutterApi), l.longValue());
    }
}
