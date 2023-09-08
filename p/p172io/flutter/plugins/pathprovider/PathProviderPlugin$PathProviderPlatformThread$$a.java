package p172io.flutter.plugins.pathprovider;

import java.util.concurrent.Callable;
import p172io.flutter.plugins.pathprovider.PathProviderPlugin;

/* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderPlatformThread$$a */
public final /* synthetic */ class PathProviderPlugin$PathProviderPlatformThread$$a implements Callable {

    /* renamed from: d */
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread f351115d;

    public /* synthetic */ PathProviderPlugin$PathProviderPlatformThread$$a(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread) {
        this.f351115d = pathProviderPlatformThread;
    }

    public final Object call() {
        return this.f351115d.lambda$getStorageDirectory$2();
    }
}
