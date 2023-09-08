package com.tencent.kinda.framework.widget.base;

import com.tencent.p014mm.autogen.events.ProfessionSelectedEvent;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.wallet_core.id_verify.model.Profession;
import com.tencent.p014mm.plugin.wallet_core.p125ui.WalletSelectProfessionUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import pj3.C47511g;

public class KindaWrapProfessionActivity extends WalletSelectProfessionUI {
    public static final String ACTIVITY_CLOSE_FLAG = "flag_activity_close_WalletSelectProfessionUI";

    public void onPause() {
        super.onPause();
        if (isFinishing()) {
            ProfessionSelectedEvent professionSelectedEvent = new ProfessionSelectedEvent();
            professionSelectedEvent.f193831d.f193832a = ACTIVITY_CLOSE_FLAG;
            professionSelectedEvent.publish();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        if (preference.f121285r.startsWith("index_")) {
            String[] split = preference.f121285r.split("_");
            if (split.length == 2) {
                Profession profession = this.mProfessions[Util.getInt(split[1], 0)];
                ProfessionSelectedEvent professionSelectedEvent = new ProfessionSelectedEvent();
                ProfessionSelectedEvent.C67757a aVar = professionSelectedEvent.f193831d;
                aVar.f193832a = profession.f209290d;
                aVar.f193833b = profession.f209291e;
                professionSelectedEvent.publish();
                Log.m105924i("", "KindaWrapProfessionActivity.onPreferenceTreeClick，发送事件，当前线程：" + Thread.currentThread().getId());
            } else {
                Log.m105929w("", "KindaWrapProfessionActivity error key: %s, %s", preference.f121285r, preference.mo69928s());
            }
            finish();
        }
        return true;
    }
}
