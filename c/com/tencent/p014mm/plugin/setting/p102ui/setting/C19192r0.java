package com.tencent.p014mm.plugin.setting.p102ui.setting;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import eb0.C75592q0;
import gy3.C87412m;
import in2.C21121f;
import in2.C9208d;
import in2.C9212e;
import p274xx.C15907f;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.r0 */
public final class C19192r0 implements C15907f.C15909b {

    /* renamed from: a */
    public final /* synthetic */ boolean f54000a;

    /* renamed from: b */
    public final /* synthetic */ SettingManageFindMoreDetailUI f54001b;

    public C19192r0(boolean z, SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
        this.f54000a = z;
        this.f54001b = settingManageFindMoreDetailUI;
    }

    /* renamed from: a */
    public void mo6380a() {
        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f54001b;
        C87412m.m108594g(settingManageFindMoreDetailUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(settingManageFindMoreDetailUI).mo75002a(C9208d.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…stControlUIC::class.java)");
        C9212e i3 = ((C9208d) a).mo10015i3("ITEM_KEY_IS_SHOW");
        C21121f fVar = i3 instanceof C21121f ? (C21121f) i3 : null;
        if (fVar != null) {
            fVar.mo32902d(!this.f54000a);
        }
    }

    public void onSuccess() {
        Log.m105918d("MicroMsg.SettingManageFindMoreDetailUI", "switchDiscoveryLooks checkPref.isChecked() = " + this.f54000a + ", extStatus = " + C75592q0.m90781k());
        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f54001b;
        boolean z = this.f54000a;
        int i = SettingManageFindMoreDetailUI.f53904w;
        settingManageFindMoreDetailUI.mo24555K7(z);
        this.f54001b.f53913o.put(10, Integer.valueOf(this.f54000a ? 1 : 0));
    }
}
