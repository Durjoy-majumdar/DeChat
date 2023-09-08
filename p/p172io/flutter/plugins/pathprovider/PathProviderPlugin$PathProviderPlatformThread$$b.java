package p172io.flutter.plugins.pathprovider;

import java.util.concurrent.Callable;
import p172io.flutter.plugins.pathprovider.PathProviderPlugin;

/* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderPlatformThread$$b */
public final /* synthetic */ class PathProviderPlugin$PathProviderPlatformThread$$b implements Callable {

    /* renamed from: d */
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread f351116d;

    public /* synthetic */ PathProviderPlugin$PathProviderPlatformThread$$b(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread) {
        this.f351116d = pathProviderPlatformThread;
    }

    public final Object call() {
        return this.f351116d.lambda$getTemporaryDirectory$0();
    }
}
