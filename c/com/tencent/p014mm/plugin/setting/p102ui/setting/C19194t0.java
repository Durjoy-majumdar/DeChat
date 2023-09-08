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

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.t0 */
public final class C19194t0 implements C15907f.C15909b {

    /* renamed from: a */
    public final /* synthetic */ boolean f54004a;

    /* renamed from: b */
    public final /* synthetic */ SettingManageFindMoreDetailUI f54005b;

    public C19194t0(boolean z, SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
        this.f54004a = z;
        this.f54005b = settingManageFindMoreDetailUI;
    }

    /* renamed from: a */
    public void mo6380a() {
        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f54005b;
        C87412m.m108594g(settingManageFindMoreDetailUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(settingManageFindMoreDetailUI).mo75002a(C9208d.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…stControlUIC::class.java)");
        C9212e i3 = ((C9208d) a).mo10015i3("ITEM_KEY_IS_SHOW");
        C21121f fVar = i3 instanceof C21121f ? (C21121f) i3 : null;
        if (fVar != null) {
            fVar.mo32902d(!this.f54004a);
        }
    }

    public void onSuccess() {
        Log.m105918d("MicroMsg.SettingManageFindMoreDetailUI", "switchFinder checkPref.isChecked() = " + this.f54004a + ", extStatus = " + C75592q0.m90781k());
        this.f54005b.mo24557M7(this.f54004a, 34359738368L, 57);
        this.f54005b.f53913o.put(11, Integer.valueOf(this.f54004a ? 1 : 0));
    }
}
