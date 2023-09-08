package gq0;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import di0.C86299o;
import gy3.C8480h;
import gy3.C87412m;
import hq0.C108255a;
import hq0.C60069g;
import iq0.C87791a;
import kr0.C76630x0;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: gq0.j */
public final class C107890j implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C76630x0 f323048d;

    /* renamed from: e */
    public final /* synthetic */ C107869a f323049e;

    /* renamed from: f */
    public final /* synthetic */ String f323050f;

    /* renamed from: g */
    public final /* synthetic */ int f323051g;

    /* renamed from: h */
    public final /* synthetic */ String f323052h;

    public C107890j(C76630x0 x0Var, C107869a aVar, String str, int i, String str2) {
        this.f323048d = x0Var;
        this.f323049e = aVar;
        this.f323050f = str;
        this.f323051g = i;
        this.f323052h = str2;
    }

    public final void run() {
        Log.m105924i("MicroMsg.AppBrand.AppBrandOpenMaterialBottomSheet", "tryLaunchAppBrand, launch appBrand");
        C76630x0 x0Var = this.f323048d;
        Context context = this.f323049e.f323010d;
        C86299o oVar = new C86299o();
        String str = this.f323050f;
        int i = this.f323051g;
        String str2 = this.f323052h;
        C107869a aVar = this.f323049e;
        oVar.f250930b = str;
        oVar.f250931c = i;
        oVar.f250934f = str2;
        oVar.f250939k = JsApiShareFinderProduct.CTRL_INDEX;
        String str3 = aVar.f323012f.f311215d.f267604d;
        C87412m.m108593f(str3, "openMaterialCollection.materialModel.mimeType");
        String str4 = aVar.f323012f.f311215d.f267606f;
        C87412m.m108593f(str4, "openMaterialCollection.materialModel.materialPath");
        oVar.f250937i = new C87791a(str3, str4, (String) null, 0, 12, (C8480h) null);
        C13598b0 b0Var = C13598b0.f38549a;
        x0Var.mo106898tv(context, oVar);
        int i2 = C108255a.f324137a;
        Log.m105918d("MicroMsg.AppBrand.OpenMaterialDataSource", "create OpenMaterialDataSource, use WeChatOpenMaterialDataSourceAnyProcess");
        MaterialModel materialModel = this.f323049e.f323012f.f311215d;
        C87412m.m108593f(materialModel, "openMaterialCollection.materialModel");
        ((C119157j) C119157j.f356862d).mo183878i(new C60069g(materialModel), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }
}
