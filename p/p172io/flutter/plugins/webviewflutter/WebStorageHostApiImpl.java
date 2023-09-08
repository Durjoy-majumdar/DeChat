package p172io.flutter.plugins.webviewflutter;

import android.webkit.WebStorage;
import p172io.flutter.plugins.webviewflutter.GeneratedAndroidWebView;

/* renamed from: io.flutter.plugins.webviewflutter.WebStorageHostApiImpl */
public class WebStorageHostApiImpl implements GeneratedAndroidWebView.WebStorageHostApi {
    private final InstanceManager instanceManager;
    private final WebStorageCreator webStorageCreator;

    /* renamed from: io.flutter.plugins.webviewflutter.WebStorageHostApiImpl$WebStorageCreator */
    public static class WebStorageCreator {
        public WebStorage createWebStorage() {
            return WebStorage.getInstance();
        }
    }

    public WebStorageHostApiImpl(InstanceManager instanceManager2, WebStorageCreator webStorageCreator2) {
        this.instanceManager = instanceManager2;
        this.webStorageCreator = webStorageCreator2;
    }

    public void create(Long l) {
        this.instanceManager.addInstance(this.webStorageCreator.createWebStorage(), l.longValue());
    }

    public void deleteAllData(Long l) {
        ((WebStorage) this.instanceManager.getInstance(l.longValue())).deleteAllData();
    }
}
