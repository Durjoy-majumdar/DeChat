package p172io.flutter.plugins.pathprovider;

import java.util.concurrent.Callable;
import p1167z8.C119084g;
import p172io.flutter.plugins.pathprovider.PathProviderPlugin;

/* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$PathProviderPlatformThread$$e */
public final /* synthetic */ class PathProviderPlugin$PathProviderPlatformThread$$e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C119084g f351120d;

    /* renamed from: e */
    public final /* synthetic */ Callable f351121e;

    public /* synthetic */ PathProviderPlugin$PathProviderPlatformThread$$e(C119084g gVar, Callable callable) {
        this.f351120d = gVar;
        this.f351121e = callable;
    }

    public final void run() {
        PathProviderPlugin.PathProviderPlatformThread.lambda$executeInBackground$6(this.f351120d, this.f351121e);
    }
}
