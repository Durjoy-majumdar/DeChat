package no0;

import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: no0.a */
public class C89044a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C89045b f256685d;

    public C89044a(C89045b bVar) {
        this.f256685d = bVar;
    }

    public void run() {
        if (this.f256685d.f256689j == null) {
            Log.m105920e("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "mSameLayerMapView is null, may be not insert");
            return;
        }
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onSurfaceChange");
        this.f256685d.f256689j.mo182357o0(this.f256685d.f256688i);
    }
}
