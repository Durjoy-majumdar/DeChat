package p172io.flutter.plugins.pathprovider;

import java.util.concurrent.Callable;
import p172io.flutter.plugins.pathprovider.PathProviderPlugin;

/* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderPlatformThread$$c */
public final /* synthetic */ class PathProviderPlugin$PathProviderPlatformThread$$c implements Callable {

    /* renamed from: d */
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread f351117d;

    public /* synthetic */ PathProviderPlugin$PathProviderPlatformThread$$c(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread) {
        this.f351117d = pathProviderPlatformThread;
    }

    public final Object call() {
        return this.f351117d.lambda$getApplicationSupportDirectory$5();
    }
}
