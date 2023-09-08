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

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.m0 */
public final class C19186m0 implements C15907f.C15909b {

    /* renamed from: a */
    public final /* synthetic */ boolean f53991a;

    /* renamed from: b */
    public final /* synthetic */ SettingManageFindMoreDetailUI f53992b;

    public C19186m0(boolean z, SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
        this.f53991a = z;
        this.f53992b = settingManageFindMoreDetailUI;
    }

    /* renamed from: a */
    public void mo6380a() {
        SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f53992b;
        C87412m.m108594g(settingManageFindMoreDetailUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62444c(settingManageFindMoreDetailUI).mo75002a(C9208d.class);
        C87412m.m108593f(a, "UICProvider.of(activity)…stControlUIC::class.java)");
        C9212e i3 = ((C9208d) a).mo10015i3("ITEM_KEY_IS_SHOW");
        C21121f fVar = i3 instanceof C21121f ? (C21121f) i3 : null;
        if (fVar != null) {
            fVar.mo32902d(!this.f53991a);
        }
    }

    public void onSuccess() {
        Log.m105918d("MicroMsg.SettingManageFindMoreDetailUI", "switchSosData checkPref.isChecked() = " + this.f53991a + ", extStatus = " + C75592q0.m90781k());
        this.f53992b.mo24557M7(this.f53991a, 2097152, 50);
        this.f53992b.f53913o.put(3, Integer.valueOf(this.f53991a ? 1 : 0));
    }
}
