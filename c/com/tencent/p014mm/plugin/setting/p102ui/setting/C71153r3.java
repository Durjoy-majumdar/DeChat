package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import ob0.C117747y;
import p154fy.C45844i;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.r3 */
public class C71153r3 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C45844i f205949d;

    /* renamed from: e */
    public final /* synthetic */ SettingsUI f205950e;

    public C71153r3(SettingsUI settingsUI, C45844i iVar) {
        this.f205950e = settingsUI;
        this.f205949d = iVar;
    }

    public boolean onTimerExpired() {
        C86709a0.m107524d().mo123458d((C117747y) this.f205949d);
        C86709a0.m107524d().mo123470p(281, this.f205950e.f205831u);
        SettingsUI settingsUI = this.f205950e;
        settingsUI.f205831u = null;
        MTimerHandler mTimerHandler = settingsUI.f205830t;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f205950e.f205830t = null;
        }
        ProgressDialog progressDialog = this.f205950e.f205818e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f205950e.mo97788R7();
        return false;
    }
}
