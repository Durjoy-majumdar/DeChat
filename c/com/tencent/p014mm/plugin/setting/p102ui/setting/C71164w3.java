package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import ob0.C117747y;
import p154fy.C45844i;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.w3 */
public class C71164w3 implements DialogInterface.OnCancelListener {

    /* renamed from: d */
    public final /* synthetic */ C45844i f205964d;

    /* renamed from: e */
    public final /* synthetic */ SettingsUI f205965e;

    public C71164w3(SettingsUI settingsUI, C45844i iVar) {
        this.f205965e = settingsUI;
        this.f205964d = iVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C86709a0.m107524d().mo123458d((C117747y) this.f205964d);
        C86709a0.m107524d().mo123470p(281, this.f205965e.f205820g);
        C86709a0.m107524d().mo123470p(282, this.f205965e.f205821h);
        SettingsUI settingsUI = this.f205965e;
        settingsUI.f205820g = null;
        settingsUI.f205821h = null;
        MTimerHandler mTimerHandler = settingsUI.f205822i;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f205965e.f205822i = null;
        }
        ProgressDialog progressDialog = this.f205965e.f205818e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
