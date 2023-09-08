package no0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82531i;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: no0.c */
public class C117629c implements C82531i.C82533b {

    /* renamed from: d */
    public final /* synthetic */ C89045b f351878d;

    public C117629c(C89045b bVar) {
        this.f351878d = bVar;
    }

    /* renamed from: b */
    public void mo22089b() {
        Log.m105924i("MicroMsg.AppBrand.SameLayer.AppBrandMapPluginHandler", "onBackground");
        if (this.f351878d.f256689j != null) {
            this.f351878d.f256689j.onPause();
        }
    }
}
