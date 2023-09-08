package gq0;

import android.content.Context;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import iq0.C98783b;
import jq0.C108762a;
import jq0.C108768b;
import qo3.C77407n;

/* renamed from: gq0.n */
public abstract class C107894n implements C107885g0 {

    /* renamed from: d */
    public final Context f323055d;

    /* renamed from: e */
    public final C77407n f323056e;

    /* renamed from: f */
    public final AppBrandOpenMaterialCollection f323057f;

    /* renamed from: g */
    public C107879e0 f323058g;

    /* renamed from: h */
    public final C45944i0 f323059h;

    /* renamed from: i */
    public final C108762a f323060i;

    public C107894n(C98783b bVar, Context context, C77407n nVar, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection, C107879e0 e0Var, C45944i0 i0Var) {
        C87412m.m108594g(bVar, "openMaterialScene");
        C87412m.m108594g(context, "context");
        C87412m.m108594g(nVar, "bottomSheet");
        C87412m.m108594g(appBrandOpenMaterialCollection, "openMaterialCollection");
        C87412m.m108594g(i0Var, "launchAppBrandExecutor");
        this.f323055d = context;
        this.f323056e = nVar;
        this.f323057f = appBrandOpenMaterialCollection;
        this.f323058g = e0Var;
        this.f323059h = i0Var;
        this.f323060i = C108768b.m147579a(bVar, appBrandOpenMaterialCollection);
        if (context instanceof MMFragmentActivity) {
            ((MMFragmentActivity) context).keep(this);
        } else {
            Log.m105920e("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "<init>, context is not lifecycle keeper");
        }
    }

    public void dead() {
        Log.m105918d("MicroMsg.AppBrand.BottomSheetEnhanceLogic", "dead");
        C107879e0 e0Var = this.f323058g;
        if (e0Var != null) {
            e0Var.hide();
        }
        C107879e0 e0Var2 = this.f323058g;
        if (e0Var2 != null) {
            e0Var2.dead();
        }
    }
}
