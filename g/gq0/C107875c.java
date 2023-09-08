package gq0;

import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialDetailModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32228q;
import gy3.C87412m;
import lq0.C109420e;

/* renamed from: gq0.c */
public final class C107875c implements C109420e {

    /* renamed from: a */
    public final /* synthetic */ C32228q<String, Integer, String, AppBrandOpenMaterialDetailModel> f323033a;

    /* renamed from: b */
    public final /* synthetic */ C107869a f323034b;

    public C107875c(C32228q<? super String, ? super Integer, ? super String, ? extends AppBrandOpenMaterialDetailModel> qVar, C107869a aVar) {
        this.f323033a = qVar;
        this.f323034b = aVar;
    }

    /* renamed from: a */
    public void mo158301a(String str, int i, String str2) {
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "enterPath");
        AppBrandOpenMaterialDetailModel invoke = this.f323033a.invoke(str, Integer.valueOf(i), str2);
        if (invoke == null) {
            Log.m105928w("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "onWeAppExposure#buildHybridBottomSheet, openMaterialModel is null");
        } else {
            this.f323034b.f323014h.mo158303a(invoke.f311218d);
        }
    }
}
