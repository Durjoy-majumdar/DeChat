package com.tencent.p014mm.plugin.setting.p102ui.setting;

import androidx.lifecycle.C39622i0;
import bl3.C39818r;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import hn2.C20974j;
import in2.C21121f;
import in2.C9208d;
import in2.C9212e;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.q0 */
public final class C19191q0 implements C20974j.C20986j {

    /* renamed from: a */
    public final /* synthetic */ SettingManageFindMoreDetailUI f53998a;

    /* renamed from: b */
    public final /* synthetic */ boolean f53999b;

    public C19191q0(SettingManageFindMoreDetailUI settingManageFindMoreDetailUI, boolean z) {
        this.f53998a = settingManageFindMoreDetailUI;
        this.f53999b = z;
    }

    /* renamed from: a */
    public boolean mo24605a() {
        return this.f53999b;
    }

    /* renamed from: b */
    public void mo24606b(boolean z) {
        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f53998a;
        C87412m.m108594g(settingManageFindMoreDetailUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(settingManageFindMoreDetailUI).mo75002a(C9208d.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…stControlUIC::class.java)");
        C9212e i3 = ((C9208d) a).mo10015i3("ITEM_KEY_IS_SHOW");
        C21121f fVar = i3 instanceof C21121f ? (C21121f) i3 : null;
        if (fVar != null) {
            fVar.mo32902d(z);
        }
    }
}
