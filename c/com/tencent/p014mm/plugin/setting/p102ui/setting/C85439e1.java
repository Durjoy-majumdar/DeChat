package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1302b0;
import com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.e1 */
public class C85439e1 implements C11385n {

    /* renamed from: d */
    public final /* synthetic */ SettingsAboutMicroMsgUI f249022d;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.e1$a */
    public class C85440a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C117747y f249023d;

        /* renamed from: e */
        public final /* synthetic */ int f249024e;

        /* renamed from: f */
        public final /* synthetic */ int f249025f;

        public C85440a(C117747y yVar, int i, int i2) {
            this.f249023d = yVar;
            this.f249024e = i;
            this.f249025f = i2;
        }

        public void run() {
            C86709a0.m107524d().mo123470p(255, C85439e1.this.f249022d.f248977r);
            SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = C85439e1.this.f249022d;
            settingsAboutMicroMsgUI.f248977r = null;
            MTimerHandler mTimerHandler = settingsAboutMicroMsgUI.f248976q;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                C85439e1.this.f249022d.f248976q = null;
            }
            ProgressDialog progressDialog = C85439e1.this.f249022d.f248975p;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            if (this.f249023d.getType() != 255 || ((C1302b0) this.f249023d).f10416f != 1) {
                return;
            }
            if (this.f249024e == -3 && this.f249025f == 4) {
                Intent intent = new Intent(C85439e1.this.f249022d.getContext(), RegByMobileSetPwdUI.class);
                intent.putExtra("kintent_hint", C85439e1.this.f249022d.getString(C0966R.string.hxz));
                C85439e1.this.f249022d.startActivityForResult(intent, 0);
                return;
            }
            SettingsAboutMicroMsgUI.m105430I7(C85439e1.this.f249022d);
        }
    }

    public C85439e1(SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f249022d = settingsAboutMicroMsgUI;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105918d("MicroMsg.SettingsAboutMicroMsgUI", "onSceneEnd " + i + " errCode " + i2 + " errMsg " + str + "  " + yVar.getType());
        MMHandlerThread.postToMainThread(new C85440a(yVar, i2, i));
    }
}
