package p194lc;

import com.tencent.luggage.skyline.wxa.AppServiceSkylineExtensionImpl;
import com.tencent.skyline.IBootstrapDoneCallback;

/* renamed from: lc.f */
public final class C88445f implements IBootstrapDoneCallback {

    /* renamed from: a */
    public final /* synthetic */ AppServiceSkylineExtensionImpl f255466a;

    public C88445f(AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl) {
        this.f255466a = appServiceSkylineExtensionImpl;
    }

    public void onDone() {
        AppServiceSkylineExtensionImpl appServiceSkylineExtensionImpl = this.f255466a;
        synchronized (appServiceSkylineExtensionImpl) {
            while (!appServiceSkylineExtensionImpl.f235025b.isEmpty()) {
                Runnable pollFirst = appServiceSkylineExtensionImpl.f235025b.pollFirst();
                if (pollFirst != null) {
                    pollFirst.run();
                }
            }
        }
    }
}
