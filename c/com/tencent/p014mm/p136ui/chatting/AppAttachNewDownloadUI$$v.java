package com.tencent.p014mm.p136ui.chatting;

import com.tencent.p014mm.plugin.appbrand.openmaterial.model.AppBrandOpenMaterialCollection;
import com.tencent.p014mm.plugin.appbrand.openmaterial.model.MaterialModel;
import com.tencent.p014mm.sdk.platformtools.Log;
import gq0.C107879e0;
import gq0.C107884f0;
import gq0.C107885g0;
import gq0.C45944i0;
import gq0.C59603h0;
import iq0.C98783b;
import java.lang.ref.WeakReference;
import kr0.C109033l0;
import qo3.C77407n;

/* renamed from: com.tencent.mm.ui.chatting.AppAttachNewDownloadUI$$v */
public class AppAttachNewDownloadUI$$v implements C59603h0 {

    /* renamed from: a */
    public final WeakReference<AppAttachNewDownloadUI> f318834a;

    /* renamed from: b */
    public final MaterialModel f318835b;

    /* renamed from: c */
    public final C109033l0 f318836c;

    public AppAttachNewDownloadUI$$v(AppAttachNewDownloadUI appAttachNewDownloadUI, MaterialModel materialModel, C109033l0 l0Var) {
        this.f318834a = new WeakReference<>(appAttachNewDownloadUI);
        this.f318835b = materialModel;
        this.f318836c = l0Var;
    }

    /* renamed from: a */
    public void mo25342a(boolean z, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        C98783b bVar = C98783b.ATTACH;
        Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot");
        AppAttachNewDownloadUI appAttachNewDownloadUI = this.f318834a.get();
        if (appAttachNewDownloadUI == null) {
            Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, ui is null");
        } else if (!z) {
            Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, fail");
        } else {
            appAttachNewDownloadUI.f56005S0 = this.f318835b.f267606f;
            appAttachNewDownloadUI.f56007T0 = appBrandOpenMaterialCollection;
            if (!appAttachNewDownloadUI.f55995K) {
                Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, download not finish");
                return;
            }
            if (this.f318836c.mo158327vX().mo158297c(appBrandOpenMaterialCollection)) {
                C107879e0 e0Var = appAttachNewDownloadUI.f56009U0;
                if (e0Var != null) {
                    e0Var.dead();
                }
                appAttachNewDownloadUI.f56009U0 = this.f318836c.mo158327vX().mo158295a(bVar).mo158296b(appAttachNewDownloadUI, appAttachNewDownloadUI.f56013W0, appAttachNewDownloadUI.f56007T0, (C45944i0) null, (C107884f0) null);
                Log.m105918d("MicroMsg.AppAttachNewDownloadUI", "show moreOpenWaysArea");
                appAttachNewDownloadUI.f56034p0.setVisibility(0);
            } else {
                Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, can not create");
            }
            C77407n nVar = appAttachNewDownloadUI.f56013W0;
            if (nVar == null) {
                return;
            }
            if (this.f318836c.mo158325ic(nVar, appBrandOpenMaterialCollection)) {
                C107885g0 g0Var = appAttachNewDownloadUI.f56011V0;
                if (g0Var != null) {
                    g0Var.dead();
                }
                appAttachNewDownloadUI.f56011V0 = this.f318836c.mo158322RD(bVar, appAttachNewDownloadUI, appAttachNewDownloadUI.f56013W0, appAttachNewDownloadUI.f56007T0, appAttachNewDownloadUI.f56009U0, (C45944i0) null);
                return;
            }
            Log.m105924i("MicroMsg.AppAttachNewDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, not need enhance");
        }
    }
}
