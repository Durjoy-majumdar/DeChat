package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import ob0.C117747y;
import p154fy.C45844i;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.v3 */
public class C71162v3 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C45844i f205961d;

    /* renamed from: e */
    public final /* synthetic */ SettingsUI f205962e;

    public C71162v3(SettingsUI settingsUI, C45844i iVar) {
        this.f205962e = settingsUI;
        this.f205961d = iVar;
    }

    public boolean onTimerExpired() {
        C86709a0.m107524d().mo123458d((C117747y) this.f205961d);
        C86709a0.m107524d().mo123470p(281, this.f205962e.f205820g);
        C86709a0.m107524d().mo123470p(282, this.f205962e.f205821h);
        SettingsUI settingsUI = this.f205962e;
        settingsUI.f205820g = null;
        settingsUI.f205821h = null;
        MTimerHandler mTimerHandler = settingsUI.f205822i;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f205962e.f205822i = null;
        }
        ProgressDialog progressDialog = this.f205962e.f205818e;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        this.f205962e.mo97786P7();
        return false;
    }
}
