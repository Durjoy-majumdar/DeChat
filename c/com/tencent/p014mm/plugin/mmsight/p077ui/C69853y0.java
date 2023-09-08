package com.tencent.p014mm.plugin.mmsight.p077ui;

import com.tencent.p014mm.plugin.mmsight.p077ui.SightSettingsUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import nj3.C76879j;

/* renamed from: com.tencent.mm.plugin.mmsight.ui.y0 */
public class C69853y0 implements C76879j.C76888o {

    /* renamed from: a */
    public final /* synthetic */ SightSettingsUI.C69849d f201541a;

    public C69853y0(SightSettingsUI.C69849d dVar) {
        this.f201541a = dVar;
    }

    /* renamed from: a */
    public void mo5759a(int i, int i2) {
        try {
            SightSettingsUI.C69849d dVar = this.f201541a;
            SightSettingsUI.this.f201526f.set(dVar.f201536d, Integer.valueOf(dVar.f201535c[i]));
            SightSettingsUI.this.f201525e.notifyDataSetChanged();
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.SightSettingsUI", e, "", new Object[0]);
        }
    }
}
