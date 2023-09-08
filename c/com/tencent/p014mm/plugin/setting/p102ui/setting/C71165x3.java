package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.x3 */
public class C71165x3 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ SettingsUI f205966d;

    public C71165x3(SettingsUI settingsUI) {
        this.f205966d = settingsUI;
    }

    public boolean onTimerExpired() {
        C86709a0.m107524d().mo123470p(281, this.f205966d.f205820g);
        C86709a0.m107524d().mo123470p(282, this.f205966d.f205821h);
        SettingsUI settingsUI = this.f205966d;
        settingsUI.f205820g = null;
        settingsUI.f205821h = null;
        MTimerHandler mTimerHandler = settingsUI.f205823j;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        ProgressDialog progressDialog = this.f205966d.f205818e;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        this.f205966d.mo97786P7();
        return false;
    }
}
