package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import h81.C8496k;
import kr0.C34016t0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import p154fy.C45844i;
import p154fy.C87121j;
import p680ru.C77570i;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.d1 */
public class C85435d1 implements DialogInterface.OnClickListener {

    /* renamed from: d */
    public C11385n f249014d = null;

    /* renamed from: e */
    public MTimerHandler f249015e = null;

    /* renamed from: f */
    public final /* synthetic */ SettingsAboutMicroMsgUI f249016f;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.d1$a */
    public class C85436a implements C11385n {
        public C85436a() {
        }

        public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
            C86709a0.m107524d().mo123470p(281, C85435d1.this.f249014d);
            C85435d1 d1Var = C85435d1.this;
            d1Var.f249014d = null;
            MTimerHandler mTimerHandler = d1Var.f249015e;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                C85435d1.this.f249015e = null;
            }
            ProgressDialog progressDialog = C85435d1.this.f249016f.f248975p;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            SettingsAboutMicroMsgUI.m105429H7(C85435d1.this.f249016f);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.d1$b */
    public class C85437b implements MTimerHandler.CallBack {

        /* renamed from: d */
        public final /* synthetic */ C45844i f249018d;

        public C85437b(C45844i iVar) {
            this.f249018d = iVar;
        }

        public boolean onTimerExpired() {
            C86709a0.m107524d().mo123458d((C117747y) this.f249018d);
            C86709a0.m107524d().mo123470p(281, C85435d1.this.f249014d);
            C85435d1 d1Var = C85435d1.this;
            d1Var.f249014d = null;
            MTimerHandler mTimerHandler = d1Var.f249015e;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                C85435d1.this.f249015e = null;
            }
            ProgressDialog progressDialog = C85435d1.this.f249016f.f248975p;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
            SettingsAboutMicroMsgUI.m105429H7(C85435d1.this.f249016f);
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.d1$c */
    public class C85438c implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C45844i f249020d;

        public C85438c(C45844i iVar) {
            this.f249020d = iVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d((C117747y) this.f249020d);
            C86709a0.m107524d().mo123470p(281, C85435d1.this.f249014d);
            C85435d1 d1Var = C85435d1.this;
            d1Var.f249014d = null;
            MTimerHandler mTimerHandler = d1Var.f249015e;
            if (mTimerHandler != null) {
                mTimerHandler.stopTimer();
                C85435d1.this.f249015e = null;
            }
            ProgressDialog progressDialog = C85435d1.this.f249016f.f248975p;
            if (progressDialog != null) {
                progressDialog.dismiss();
            }
        }
    }

    public C85435d1(SettingsAboutMicroMsgUI settingsAboutMicroMsgUI) {
        this.f249016f = settingsAboutMicroMsgUI;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        ((C77570i) C86312j.m106911c(C77570i.class)).mo107724bH();
        ((C8496k) C86312j.m106911c(C8496k.class)).mo9419s1();
        C86709a0.m107528h();
        if (C86709a0.m107523b().mo121120t()) {
            C89137b0 d = C86709a0.m107524d();
            C85436a aVar = new C85436a();
            this.f249014d = aVar;
            d.mo123455a(281, aVar);
            C45844i iI = ((C87121j) C86312j.m106911c(C87121j.class)).mo71218iI(2);
            C86709a0.m107524d().mo123460f((C117747y) iI);
            MTimerHandler mTimerHandler = new MTimerHandler(new C85437b(iI), false);
            this.f249015e = mTimerHandler;
            mTimerHandler.startTimer(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            C34016t0 t0Var = (C34016t0) C86312j.m106911c(C34016t0.class);
            String string = this.f249016f.getString(C0966R.string.li7);
            if (!Util.isNullOrNil(t0Var.mo56396UW())) {
                string = t0Var.mo56396UW() + "...";
            }
            SettingsAboutMicroMsgUI settingsAboutMicroMsgUI = this.f249016f;
            settingsAboutMicroMsgUI.f248975p = C76879j.m92723Q(settingsAboutMicroMsgUI.getContext(), this.f249016f.getString(C0966R.string.a3h), string, true, true, new C85438c(iI));
            return;
        }
        SettingsAboutMicroMsgUI.m105429H7(this.f249016f);
    }
}
