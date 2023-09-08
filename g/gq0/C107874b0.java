package gq0;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import kr0.C76630x0;
import qo3.C77407n;
import rx3.C13598b0;

/* renamed from: gq0.b0 */
public final class C107874b0 extends C87413o implements C32226l<AppBrandOpenMaterialModel, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C77407n f323029d;

    /* renamed from: e */
    public final /* synthetic */ C45944i0 f323030e;

    /* renamed from: f */
    public final /* synthetic */ Context f323031f;

    /* renamed from: g */
    public final /* synthetic */ AppBrandOpenMaterialCollection f323032g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107874b0(C77407n nVar, C45944i0 i0Var, Context context, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        super(1);
        this.f323029d = nVar;
        this.f323030e = i0Var;
        this.f323031f = context;
        this.f323032g = appBrandOpenMaterialCollection;
    }

    public Object invoke(Object obj) {
        AppBrandOpenMaterialModel appBrandOpenMaterialModel = (AppBrandOpenMaterialModel) obj;
        C87412m.m108594g(appBrandOpenMaterialModel, "openMaterialModel");
        this.f323029d.mo107572p();
        C76630x0 x0Var = (C76630x0) C86312j.m106911c(C76630x0.class);
        if (x0Var == null) {
            Log.m105928w("MicroMsg.AppBrand.GridBottomSheetEnhanceLogic", "itemClickAction, appBrandLauncher is null");
        } else {
            this.f323030e.mo71346a(new C107871a0(x0Var, this.f323031f, this.f323032g, appBrandOpenMaterialModel));
        }
        return C13598b0.f38549a;
    }
}
