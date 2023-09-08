package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.g1 */
public class C85442g1 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C1302b0 f249029d;

    /* renamed from: e */
    public final /* synthetic */ SettingsAboutMicroMsgUI f249030e;

    public C85442g1(SettingsAboutMicroMsgUI settingsAboutMicroMsgUI, C1302b0 b0Var) {
        this.f249030e = settingsAboutMicroMsgUI;
        this.f249029d = b0Var;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d(this.f249029d);
        C86709a0.m107524d().mo123470p(255, this.f249030e.f248977r);
        SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f249030e;
        settingsAboutMicroMsgUI.f248977r = null;
        MTimerHandler mTimerHandler = settingsAboutMicroMsgUI.f248976q;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f249030e.f248976q = null;
        }
        ProgressDialog progressDialog = this.f249030e.f248975p;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
