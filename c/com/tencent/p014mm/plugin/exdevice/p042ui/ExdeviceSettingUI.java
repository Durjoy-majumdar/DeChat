package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import ke3.C88144b;
import ob0.C11385n;
import ob0.C117747y;
import p910lj.C76701a;
import pj3.C47511g;
import t71.C48553o;
import tv2.C14096e;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceSettingUI */
public class ExdeviceSettingUI extends MMPreference implements C11385n {

    /* renamed from: d */
    public int f111269d = -1;

    /* renamed from: e */
    public boolean f111270e;

    /* renamed from: f */
    public ProgressDialog f111271f;

    /* renamed from: g */
    public CheckBoxPreference f111272g;

    /* renamed from: h */
    public CheckBoxPreference f111273h;

    /* renamed from: i */
    public CheckBoxPreference f111274i;

    /* renamed from: j */
    public boolean f111275j;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceSettingUI$a */
    public class C41308a implements Runnable {
        public C41308a() {
        }

        public void run() {
            ExdeviceSettingUI.this.f111271f.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceSettingUI$b */
    public class C41309b implements Runnable {
        public C41309b() {
        }

        public void run() {
            ExdeviceSettingUI.this.f111271f.dismiss();
        }
    }

    /* renamed from: H7 */
    public final void mo64397H7() {
        boolean z = true;
        this.f111272g.mo6805K((this.f111269d & 1) == 1);
        this.f111273h.mo6805K((this.f111269d & 2) == 2);
        CheckBoxPreference checkBoxPreference = this.f111274i;
        if ((this.f111269d & 8) != 8) {
            z = false;
        }
        checkBoxPreference.mo6805K(z);
        getPreferenceScreen().notifyDataSetChanged();
    }

    public int getResourceId() {
        return C0966R.xml.f8890ak;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C14096e.m13447a(38);
        C86709a0.m107529k().f251779b.mo123455a(1044, this);
        this.f111272g = (CheckBoxPreference) getPreferenceScreen().mo72519a("notify_rank");
        this.f111273h = (CheckBoxPreference) getPreferenceScreen().mo72519a("notify_like");
        this.f111274i = (CheckBoxPreference) getPreferenceScreen().mo72519a("join_rank");
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(397310, 0);
        Log.m105919d("MicroMsg.ExdeviceSettingUI", "hy: setting flag: %d", num);
        if (num == null || num.intValue() == 0) {
            this.f111270e = false;
            this.f111272g.mo6805K(true);
            this.f111273h.mo6805K(true);
            this.f111274i.mo6805K(true);
            getPreferenceScreen().notifyDataSetChanged();
            this.f111271f = ProgressDialog.show(this, "", "", true, false);
        } else {
            this.f111270e = true;
            this.f111269d = num.intValue();
            mo64397H7();
        }
        C86709a0.m107529k().f251779b.mo123460f(new C48553o(2, 0));
        setMMTitle((int) C0966R.string.hwu);
        setBackBtn(new C41336j1(this));
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(1044, this);
        ProgressDialog progressDialog = this.f111271f;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f111271f.dismiss();
        }
        if (this.f111270e) {
            if (this.f111272g.mo6804J()) {
                this.f111269d |= 1;
            } else {
                this.f111269d &= -2;
            }
            if (this.f111273h.mo6804J()) {
                this.f111269d |= 2;
            } else {
                this.f111269d &= -3;
            }
            if (this.f111274i.mo6804J()) {
                this.f111269d |= 8;
            } else {
                this.f111269d &= -9;
            }
            C86709a0.m107535s().mo121142i().mo119676J(397310, Integer.valueOf(this.f111269d));
            Log.m105919d("MicroMsg.ExdeviceSettingUI", "hy: doscene setting flag to %d", Integer.valueOf(this.f111269d));
            C86709a0.m107529k().f251779b.mo123460f(new C48553o(1, this.f111269d));
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Log.m105919d("MicroMsg.ExdeviceSettingUI", "onPreferenceTreeClick, key is %s.", preference.f121285r);
        if (preference.f121285r.equals("black_contact_list")) {
            C88144b.m109789g(this, "sport", ".ui.SportBlackListUI");
        } else {
            this.f111275j = true;
        }
        return false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (i == 0 && i2 == 0) {
            Log.m105918d("MicroMsg.ExdeviceSettingUI", "hy: scene end ok");
            C48553o oVar = (C48553o) yVar;
            int i3 = oVar.f129877f;
            if (i3 != 2) {
                Log.m105925i("MicroMsg.ExdeviceSettingUI", "It isn't a GET_FLAG opType(%d).", Integer.valueOf(i3));
                return;
            }
            ProgressDialog progressDialog = this.f111271f;
            if (progressDialog != null && progressDialog.isShowing()) {
                runOnUiThread(new C41308a());
            }
            this.f111270e = true;
            int i4 = this.f111269d;
            int i5 = oVar.f129879h;
            if (i4 == i5) {
                Log.m105925i("MicroMsg.ExdeviceSettingUI", "flag has not changed.(%s)", Integer.valueOf(i4));
                return;
            }
            this.f111269d = i5;
            Log.m105919d("MicroMsg.ExdeviceSettingUI", "hy: onSceneEnd setting flag to %d", Integer.valueOf(i5));
            C86709a0.m107535s().mo121142i().mo119676J(397310, Integer.valueOf(this.f111269d));
            if (!this.f111275j) {
                mo64397H7();
                return;
            }
            return;
        }
        ProgressDialog progressDialog2 = this.f111271f;
        if (progressDialog2 != null && progressDialog2.isShowing()) {
            runOnUiThread(new C41309b());
        }
        C76701a.makeText((Context) this, (CharSequence) "scene error", 0).show();
        finish();
    }
}
