package p172io.flutter.plugins.pathprovider;

import java.util.concurrent.Callable;
import p172io.flutter.plugins.pathprovider.PathProviderPlugin;

/* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderPlatformThread$$d */
public final /* synthetic */ class PathProviderPlugin$PathProviderPlatformThread$$d implements Callable {

    /* renamed from: d */
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread f351118d;

    /* renamed from: e */
    public final /* synthetic */ String f351119e;

    public /* synthetic */ PathProviderPlugin$PathProviderPlatformThread$$d(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread, String str) {
        this.f351118d = pathProviderPlatformThread;
        this.f351119e = str;
    }

    public final Object call() {
        return this.f351118d.lambda$getExternalStorageDirectories$4(this.f351119e);
    }
}
