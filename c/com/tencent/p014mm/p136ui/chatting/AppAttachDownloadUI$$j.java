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

/* renamed from: com.tencent.mm.ui.chatting.AppAttachDownloadUI$$j */
public class AppAttachDownloadUI$$j implements C59603h0 {

    /* renamed from: a */
    public final WeakReference<AppAttachDownloadUI> f318830a;

    /* renamed from: b */
    public final MaterialModel f318831b;

    /* renamed from: c */
    public final C109033l0 f318832c;

    public AppAttachDownloadUI$$j(AppAttachDownloadUI appAttachDownloadUI, MaterialModel materialModel, C109033l0 l0Var) {
        this.f318830a = new WeakReference<>(appAttachDownloadUI);
        this.f318831b = materialModel;
        this.f318832c = l0Var;
    }

    /* renamed from: a */
    public void mo25342a(boolean z, AppBrandOpenMaterialCollection appBrandOpenMaterialCollection) {
        C98783b bVar = C98783b.ATTACH;
        Log.m105918d("MicroMsg.AppAttachDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot");
        AppAttachDownloadUI appAttachDownloadUI = this.f318830a.get();
        if (appAttachDownloadUI == null) {
            Log.m105924i("MicroMsg.AppAttachDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, ui is null");
        } else if (!z) {
            Log.m105924i("MicroMsg.AppAttachDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, fail");
        } else {
            appAttachDownloadUI.f55927W = this.f318831b.f267606f;
            appAttachDownloadUI.f55928X = appBrandOpenMaterialCollection;
            if (!appAttachDownloadUI.f55912K) {
                Log.m105924i("MicroMsg.AppAttachDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, download not finish");
                return;
            }
            if (this.f318832c.mo158327vX().mo158297c(appBrandOpenMaterialCollection)) {
                C107879e0 e0Var = appAttachDownloadUI.f55929Y;
                if (e0Var != null) {
                    e0Var.dead();
                }
                appAttachDownloadUI.f55929Y = this.f318832c.mo158327vX().mo158295a(bVar).mo158296b(appAttachDownloadUI, appAttachDownloadUI.f55941p0, appAttachDownloadUI.f55928X, (C45944i0) null, (C107884f0) null);
                Log.m105918d("MicroMsg.AppAttachDownloadUI", "show moreOpenWaysArea");
                appAttachDownloadUI.f55926V.setVisibility(0);
            } else {
                Log.m105924i("MicroMsg.AppAttachDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, can not create");
            }
            C77407n nVar = appAttachDownloadUI.f55941p0;
            if (nVar == null) {
                return;
            }
            if (this.f318832c.mo158325ic(nVar, appBrandOpenMaterialCollection)) {
                C107885g0 g0Var = appAttachDownloadUI.f55930Z;
                if (g0Var != null) {
                    g0Var.dead();
                }
                appAttachDownloadUI.f55930Z = this.f318832c.mo158322RD(bVar, appAttachDownloadUI, appAttachDownloadUI.f55941p0, appAttachDownloadUI.f55928X, appAttachDownloadUI.f55929Y, (C45944i0) null);
                return;
            }
            Log.m105924i("MicroMsg.AppAttachDownloadUI", "loadOpenMaterials#onMyOpenMaterialsGot, not need enhance");
        }
    }
}
