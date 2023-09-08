package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.f1 */
public class C85441f1 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C1302b0 f249027d;

    /* renamed from: e */
    public final /* synthetic */ SettingsAboutMicroMsgUI f249028e;

    public C85441f1(SettingsAboutMicroMsgUI settingsAboutMicroMsgUI, C1302b0 b0Var) {
        this.f249028e = settingsAboutMicroMsgUI;
        this.f249027d = b0Var;
    }

    public boolean onTimerExpired() {
        C86709a0.m107524d().mo123458d(this.f249027d);
        C86709a0.m107524d().mo123470p(255, this.f249028e.f248977r);
        SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f249028e;
        settingsAboutMicroMsgUI.f248977r = null;
        MTimerHandler mTimerHandler = settingsAboutMicroMsgUI.f248976q;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f249028e.f248976q = null;
        }
        ProgressDialog progressDialog = this.f249028e.f248975p;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
        SettingsAboutMicroMsgUI.m105430I7(this.f249028e);
        return false;
    }
}
