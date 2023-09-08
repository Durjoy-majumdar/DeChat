package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import com.tencent.p014mm.sdk.platformtools.Log;
import te3.C52238za0;
import xm2.C23109g;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.l2 */
public class C19185l2 implements C23109g {

    /* renamed from: a */
    public final /* synthetic */ SettingsManageFindOtherServiceUI f53990a;

    public C19185l2(SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI) {
        this.f53990a = settingsManageFindOtherServiceUI;
    }

    /* renamed from: a */
    public void mo24594a(Context context, boolean z, C52238za0 za02) {
        if (za02 == null || !z) {
            Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = no");
            this.f53990a.finish();
            return;
        }
        Log.m105924i("MicroMsg.SettingsManageFindMoreUI", "doSave. response = yes");
        SettingsManageFindOtherServiceUI settingsManageFindOtherServiceUI = this.f53990a;
        settingsManageFindOtherServiceUI.f53968t.postDelayed(new C19187m2(settingsManageFindOtherServiceUI), 1000);
    }
}
