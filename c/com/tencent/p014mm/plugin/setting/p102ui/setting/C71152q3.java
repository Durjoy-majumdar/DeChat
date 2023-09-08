package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.q3 */
public class C71152q3 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ SettingsUI f205948d;

    public C71152q3(SettingsUI settingsUI) {
        this.f205948d = settingsUI;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C86709a0.m107524d().mo123470p(281, this.f205948d.f205831u);
        SettingsUI settingsUI = this.f205948d;
        settingsUI.f205831u = null;
        MTimerHandler mTimerHandler = settingsUI.f205830t;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f205948d.f205830t = null;
        }
        ProgressDialog progressDialog = this.f205948d.f205818e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
        this.f205948d.mo97788R7();
    }
}
