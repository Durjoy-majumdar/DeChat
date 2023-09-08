package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.y3 */
public class C71168y3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ SettingsUI f205970d;

    public C71168y3(SettingsUI settingsUI) {
        this.f205970d = settingsUI;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123470p(281, this.f205970d.f205820g);
        C86709a0.m107524d().mo123470p(282, this.f205970d.f205821h);
        SettingsUI settingsUI = this.f205970d;
        settingsUI.f205820g = null;
        settingsUI.f205821h = null;
        MTimerHandler mTimerHandler = settingsUI.f205822i;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f205970d.f205822i = null;
        }
        ProgressDialog progressDialog = this.f205970d.f205818e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
