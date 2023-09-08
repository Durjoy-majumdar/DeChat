package p172io.flutter.plugins.pathprovider;

import java.util.concurrent.Callable;
import p172io.flutter.plugins.pathprovider.PathProviderPlugin;

/* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderPlatformThread$$g */
public final /* synthetic */ class PathProviderPlugin$PathProviderPlatformThread$$g implements Callable {

    /* renamed from: d */
    public final /* synthetic */ PathProviderPlugin.PathProviderPlatformThread f351123d;

    public /* synthetic */ PathProviderPlugin$PathProviderPlatformThread$$g(PathProviderPlugin.PathProviderPlatformThread pathProviderPlatformThread) {
        this.f351123d = pathProviderPlatformThread;
    }

    public final Object call() {
        return this.f351123d.lambda$getApplicationDocumentsDirectory$1();
    }
}
