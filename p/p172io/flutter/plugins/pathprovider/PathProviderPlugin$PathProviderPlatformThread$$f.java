package p172io.flutter.plugins.pathprovider;

import java.util.concurrent.Callable;
import p172io.flutter.plugins.pathprovider.PathProviderPlugin;

/* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderPlatformThread$$f */
public final /* synthetic */ class PathProviderPlugin$PathProviderPlatformThread$$f implements Callable {

    /* renamed from: d */
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread f351122d;

    public /* synthetic */ PathProviderPlugin$PathProviderPlatformThread$$f(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread) {
        this.f351122d = pathProviderPlatformThread;
    }

    public final Object call() {
        return this.f351122d.lambda$getExternalCacheDirectories$3();
    }
}
