package gq0;

import android.content.Context;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiShareFinderProduct;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel;
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

/* renamed from: gq0.a0 */
public final class C107871a0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C76630x0 f323018d;

    /* renamed from: e */
    public final /* synthetic */ Context f323019e;

    /* renamed from: f */
    public final /* synthetic */ AppBrandOpenMaterialCollection f323020f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandOpenMaterialModel f323021g;

    public C107871a0(C76630x0 x0Var, Context context, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, AppBrandOpenMaterialModel appBrandOpenMaterialModel) {
        this.f323018d = x0Var;
        this.f323019e = context;
        this.f323020f = appBrandOpenMaterialCollection;
        this.f323021g = appBrandOpenMaterialModel;
    }

    public final void run() {
        Log.m105924i("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "itemClickAction, launch appBrand");
        C76630x0 x0Var = this.f323018d;
        Context context = this.f323019e;
        C86299o oVar = new C86299o();
        AppBrandOpenMaterialModel appBrandOpenMaterialModel = this.f323021g;
        AppBrandOpenMaterialCollection appBrandOpenMaterialCollection = this.f323020f;
        oVar.f250930b = appBrandOpenMaterialModel.f311222d;
        oVar.f250931c = appBrandOpenMaterialModel.f311223e;
        oVar.f250934f = appBrandOpenMaterialModel.f311224f;
        oVar.f250939k = JsApiShareFinderProduct.CTRL_INDEX;
        String str = appBrandOpenMaterialCollection.f311215d.f267604d;
        C87412m.m108593f(str, "openMaterialCollection.materialModel.mimeType");
        String str2 = appBrandOpenMaterialCollection.f311215d.f267606f;
        C87412m.m108593f(str2, "openMaterialCollection.materialModel.materialPath");
        oVar.f250937i = new C87791a(str, str2, (String) null, 0, 12, (C8480h) null);
        C13598b0 b0Var = C13598b0.f38549a;
        x0Var.mo106898tv(context, oVar);
        int i = C108255a.f324137a;
        Log.m105918d("MicroMsg.AppBrand.OpenMaterialDataSource", "create OpenMaterialDataSource, use WeChatOpenMaterialDataSourceAnyProcess");
        MaterialModel materialModel = this.f323020f.f311215d;
        C87412m.m108593f(materialModel, "openMaterialCollection.materialModel");
        ((C119157j) C119157j.f356862d).mo183878i(new C60069g(materialModel), FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
    }
}
