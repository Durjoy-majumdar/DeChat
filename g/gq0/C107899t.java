package gq0;

import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.autogen.mmdata.rpt.wechat_use_weapp_exposeStruct;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq0.C108762a;
import nj3.C76900r0;

/* renamed from: gq0.t */
public final class C107899t implements C76900r0 {

    /* renamed from: a */
    public final /* synthetic */ C107895q f323072a;

    /* renamed from: b */
    public final /* synthetic */ AppBrandOpenMaterialModel f323073b;

    public C107899t(C107895q qVar, AppBrandOpenMaterialModel appBrandOpenMaterialModel) {
        this.f323072a = qVar;
        this.f323073b = appBrandOpenMaterialModel;
    }

    /* renamed from: a */
    public final void mo107237a(MenuItem menuItem, View view) {
        C107895q qVar = this.f323072a;
        C87412m.m108593f(view, "menuView");
        if (C107895q.m146188a(qVar, view)) {
            C108762a aVar = this.f323072a.f323060i;
            AppBrandOpenMaterialModel appBrandOpenMaterialModel = this.f323073b;
            aVar.getClass();
            C87412m.m108594g(appBrandOpenMaterialModel, "openMaterialModel");
            Log.m105924i(aVar.f325670d, "onBottomSheetAppBrandExposure");
            if (!aVar.f325676j.contains(appBrandOpenMaterialModel)) {
                wechat_use_weapp_exposeStruct wechat_use_weapp_exposestruct = (wechat_use_weapp_exposeStruct) aVar.f325673g.getValue();
                wechat_use_weapp_exposestruct.f310563d = wechat_use_weapp_exposestruct.mo86045b("session", aVar.f325669c, true);
                wechat_use_weapp_exposestruct.f310564e = 1;
                wechat_use_weapp_exposestruct.f310565f = wechat_use_weapp_exposestruct.mo86045b("weapp_id", appBrandOpenMaterialModel.f311222d, true);
                String str = appBrandOpenMaterialModel.f311227i;
                if (str == null) {
                    str = "";
                }
                wechat_use_weapp_exposestruct.f310566g = wechat_use_weapp_exposestruct.mo86045b("weapp_name", str, true);
                wechat_use_weapp_exposestruct.mo86054n();
                aVar.f325676j.add(appBrandOpenMaterialModel);
            }
        }
    }
}
