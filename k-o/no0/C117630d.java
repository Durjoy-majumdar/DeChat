package no0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: no0.d */
public class C117630d implements C82531i.C82535d {

    /* renamed from: d */
    public final /* synthetic */ C89045b f351879d;

    public C117630d(C89045b bVar) {
        this.f351879d = bVar;
    }

    /* renamed from: c */
    public void mo22090c() {
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onForeground");
        if (this.f351879d.f256689j != null) {
            this.f351879d.f256689j.onResume();
        }
    }
}
