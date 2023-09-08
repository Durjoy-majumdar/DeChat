package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import ob0.C117747y;
import p154fy.C45844i;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.s3 */
public class C71154s3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C45844i f205951d;

    /* renamed from: e */
    public final /* synthetic */ SettingsUI f205952e;

    public C71154s3(SettingsUI settingsUI, C45844i iVar) {
        this.f205952e = settingsUI;
        this.f205951d = iVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d((C117747y) this.f205951d);
        C86709a0.m107524d().mo123470p(281, this.f205952e.f205831u);
        SettingsUI settingsUI = this.f205952e;
        settingsUI.f205831u = null;
        MTimerHandler mTimerHandler = settingsUI.f205830t;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f205952e.f205830t = null;
        }
        ProgressDialog progressDialog = this.f205952e.f205818e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
