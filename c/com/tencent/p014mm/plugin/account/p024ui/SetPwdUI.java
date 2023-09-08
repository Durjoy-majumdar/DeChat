package com.tencent.p014mm.plugin.account.p024ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.modelsimple.C1306g0;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p910lj.C76701a;
import pe3.C47465a;
import qe3.C89625d;
import qg0.C12215a;
import te3.C51018qv3;
import te3.C52207z24;

/* renamed from: com.tencent.mm.plugin.account.ui.SetPwdUI */
public abstract class SetPwdUI extends MMWizardActivity implements C11385n {

    /* renamed from: e */
    public String f10769e;

    /* renamed from: f */
    public String f10770f;

    /* renamed from: g */
    public ProgressDialog f10771g = null;

    /* renamed from: h */
    public boolean f10772h = true;

    /* renamed from: com.tencent.mm.plugin.account.ui.SetPwdUI$a */
    public class C1456a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ C117747y f10773d;

        public C1456a(SetPwdUI setPwdUI, C117747y yVar) {
            this.f10773d = yVar;
        }

        public void onCancel(DialogInterface dialogInterface) {
            C86709a0.m107524d().mo123458d(this.f10773d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.account.ui.SetPwdUI$b */
    public class C1457b implements DialogInterface.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f10774d;

        /* renamed from: e */
        public final /* synthetic */ int f10775e;

        /* renamed from: f */
        public final /* synthetic */ String f10776f;

        public C1457b(int i, int i2, String str) {
            this.f10774d = i;
            this.f10775e = i2;
            this.f10776f = str;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SetPwdUI.this.setResult(-1);
            SetPwdUI.this.mo1448S7(this.f10774d, this.f10775e, this.f10776f);
        }
    }

    /* renamed from: N7 */
    public int mo1444N7() {
        return 383;
    }

    /* renamed from: O7 */
    public abstract C117747y mo1445O7();

    /* renamed from: P7 */
    public void mo1454P7() {
        mo1459V7();
    }

    /* renamed from: Q7 */
    public abstract String mo1446Q7();

    /* renamed from: R7 */
    public abstract String mo1447R7();

    /* renamed from: S7 */
    public abstract boolean mo1448S7(int i, int i2, String str);

    /* renamed from: T7 */
    public abstract void mo1449T7(C12215a.C12216a aVar);

    /* renamed from: U7 */
    public ProgressDialog mo1450U7(Context context, String str, String str2, boolean z, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        return C76879j.m92723Q(context, str, str2, z, z2, onCancelListener);
    }

    /* renamed from: V7 */
    public void mo1459V7() {
        this.f10769e = mo1446Q7();
        this.f10770f = mo1447R7();
        if (!Util.isNullOrNil(this.f10769e)) {
            if (!this.f10769e.equals(this.f10770f)) {
                mo1449T7(C12215a.C12216a.TwoPasswordsNotMatch);
            } else if (this.f10769e.length() > 16) {
                mo1449T7(C12215a.C12216a.BeyondMaximumLength);
            } else if (Util.isChinese(this.f10769e)) {
                C76879j.m92738i(this, C0966R.string.hwn, C0966R.string.hxn);
            } else if (Util.isValidPassword(this.f10769e)) {
                hideVKB();
                C117747y O7 = mo1445O7();
                C86709a0.m107524d().mo123460f(O7);
                this.f10771g = mo1450U7(this, getString(C0966R.string.a3h), getString(C0966R.string.hvo), true, true, new C1456a(this, O7));
                if ((this instanceof RegByMobileSetPwdUI) && !this.f10772h) {
                    Log.m105918d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 0");
                    C115669n.INSTANCE.mo160131h(11868, 0);
                }
            } else if (this.f10769e.length() < 8 || this.f10769e.length() >= 16) {
                mo1449T7(C12215a.C12216a.NotReachMinimumLength);
            } else {
                mo1449T7(C12215a.C12216a.DisallowShortNumericPassword);
            }
        }
    }

    public void onBackPressed() {
        if (this.f10772h) {
            if (this instanceof RegByMobileSetPwdUI) {
                Log.m105918d("MicroMsg.SetPwdUI", "cpan settpassword cancel 11868 1");
                C115669n.INSTANCE.mo160131h(11868, 1);
            }
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        C86709a0.m107524d().mo123455a(mo1444N7(), this);
        super.onCreate(bundle);
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C1474c3(this), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
        setBackBtn(new C1475d3(this));
    }

    public void onDestroy() {
        C86709a0.m107524d().mo123470p(mo1444N7(), this);
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        String str2;
        C51018qv3 qv32;
        C47465a aVar;
        ProgressDialog progressDialog = this.f10771g;
        C52207z24 z242 = null;
        if (progressDialog != null) {
            progressDialog.dismiss();
            this.f10771g = null;
        }
        if (yVar.getType() == mo1444N7()) {
            if (yVar.getType() == 383) {
                if (i == 0 && i2 == 0) {
                    if (Util.isNullOrNil((String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null))) {
                        Log.m105924i("MicroMsg.SetPwdUI", "has not bind mobile");
                        str2 = getString(C0966R.string.h9u);
                    } else {
                        Log.m105924i("MicroMsg.SetPwdUI", "has bind mobile");
                        str2 = getString(C0966R.string.alr);
                    }
                    C47350c cVar = ((C1306g0) yVar).f10426e;
                    if (!(cVar == null || (aVar = cVar.f127056b.f127083a) == null)) {
                        z242 = (C52207z24) aVar;
                    }
                    if (!(z242 == null || (qv32 = z242.f145661d) == null)) {
                        byte[] f = qv32.f140574f.mo123703f();
                        SharedPreferences.Editor edit = MMApplicationContext.getContext().getSharedPreferences("auth_info_key_prefs", 4).edit();
                        edit.putBoolean("key_auth_info_prefs_created", true);
                        edit.putInt("key_auth_update_version", C89625d.f257841g);
                        edit.putString("_auth_key", Util.encodeHexString(f));
                        edit.putInt("_auth_uin", C86709a0.m107523b().mo121110g());
                        edit.commit();
                    }
                    C76879j.m92713G(this, str2, "", false, new C1457b(i, i2, str));
                }
            } else if (!mo1448S7(i, i2, str)) {
                C76701a.makeText((Context) this, (CharSequence) getString(C0966R.string.f0f, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}), 0).show();
            }
        }
    }
}
