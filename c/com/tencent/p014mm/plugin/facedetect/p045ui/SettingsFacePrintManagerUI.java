package com.tencent.p014mm.plugin.facedetect.p045ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.facedetect.model.C85191v;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75592q0;
import eb0.C7624i3;
import eb1.C7631s;
import f40.C86709a0;
import ib1.C8877j;
import j20.C117292a;
import k20.C9556a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI */
public class SettingsFacePrintManagerUI extends MMPreference implements C11385n {

    /* renamed from: i */
    public static final /* synthetic */ int f12400i = 0;

    /* renamed from: d */
    public C47511g f12401d;

    /* renamed from: e */
    public ProgressDialog f12402e = null;

    /* renamed from: f */
    public FaceHeaderPreference f12403f;

    /* renamed from: g */
    public View f12404g;

    /* renamed from: h */
    public boolean f12405h = false;

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI$a */
    public class C2283a implements DialogInterface.OnCancelListener {
        public C2283a(SettingsFacePrintManagerUI settingsFacePrintManagerUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI$b */
    public class C2284b implements DialogInterface.OnCancelListener {
        public C2284b(SettingsFacePrintManagerUI settingsFacePrintManagerUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI$c */
    public class C2285c implements MenuItem.OnMenuItemClickListener {
        public C2285c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsFacePrintManagerUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.facedetect.ui.SettingsFacePrintManagerUI$d */
    public class C2286d implements DialogInterface.OnCancelListener {
        public C2286d(SettingsFacePrintManagerUI settingsFacePrintManagerUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8948c4;
    }

    public void initView() {
        int nullAsInt = Util.nullAsInt(C86709a0.m107535s().mo121142i().mo119684e(40, 0), 0);
        Log.m105924i("MicroMsg.FaceSettingsManagerUI", "plugSwitch " + nullAsInt + " " + (nullAsInt & 4194304));
        C47511g preferenceScreen = getPreferenceScreen();
        this.f12401d = preferenceScreen;
        this.f12403f = (FaceHeaderPreference) preferenceScreen.mo72519a("settings_faceprint_header");
        ((CheckBoxPreference) this.f12401d.mo72519a("settings_faceprint_title")).mo6808N(true);
        this.f12401d.notifyDataSetChanged();
        ProgressDialog progressDialog = this.f12402e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f12402e.dismiss();
        }
        this.f12402e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C2284b(this));
        C86709a0.m107524d().mo123460f(new C7631s(3));
        this.f12401d.mo72529n("settings_faceprint_create", true);
        this.f12401d.mo72529n("settings_faceeprint_reset", true);
        this.f12401d.mo72529n("settings_faceprint_unlock", true);
        setBackBtn(new C2285c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (intent != null && intent.getIntExtra("err_code", 10) == 0) {
                this.f12405h = true;
            }
            Log.m105925i("MicroMsg.FaceSettingsManagerUI", "hy: is reg ok: %b", Boolean.valueOf(this.f12405h));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.cjw);
        C86709a0.m107524d().mo123455a(938, this);
        this.f12404g = findViewById(C0966R.C0970id.gv4);
        initView();
        this.f12404g.setBackgroundResource(C0966R.color.al6);
        C85191v.m105063b(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107524d().mo123470p(938, this);
        ProgressDialog progressDialog = this.f12402e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class<FaceDetectUI> cls = FaceDetectUI.class;
        String str = preference.f121285r;
        Intent intent = new Intent();
        if (str.equals("settings_faceprint_title")) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) gVar.mo72519a("settings_faceprint_title");
            Log.m105918d("MicroMsg.FaceSettingsManagerUI", "hy: checkPref.isChecked() " + checkBoxPreference.mo6804J());
            ProgressDialog progressDialog = this.f12402e;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f12402e.dismiss();
            }
            this.f12402e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C2286d(this));
            if (checkBoxPreference.mo6804J()) {
                C86709a0.m107524d().mo123460f(new C7631s(1));
            } else {
                C86709a0.m107524d().mo123460f(new C7631s(2));
            }
            return true;
        } else if (str.equals("settings_faceprint_unlock")) {
            intent.setClass(this, cls);
            intent.putExtra("k_need_signature", true);
            intent.putExtra("k_user_name", C75592q0.m90772b());
            intent.putExtra("k_purpose", 2);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/facedetect/ui/SettingsFacePrintManagerUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (!str.equals("settings_faceeprint_reset")) {
            return false;
        } else {
            intent.setClass(this, cls);
            intent.putExtra("k_need_signature", true);
            intent.putExtra("k_user_name", C75592q0.m90772b());
            intent.putExtra("k_purpose", 1);
            startActivityForResult(intent, 1);
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.FaceSettingsManagerUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.FaceSettingsManagerUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 23) {
            if (iArr[0] != 0 || iArr[1] != 0) {
                Log.m105928w("MicroMsg.FaceSettingsManagerUI", "hy: permission not granted");
                finish();
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f12405h) {
            this.f12405h = false;
            ProgressDialog progressDialog = this.f12402e;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f12402e.dismiss();
            }
            this.f12402e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C2283a(this));
            Log.m105918d("MicroMsg.FaceSettingsManagerUI", "hy: resume after create face, get switch status");
            C86709a0.m107524d().mo123460f(new C7631s(1));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        Log.m105919d("MicroMsg.FaceSettingsManagerUI", "hy: onSceneEnd, errType:%d, errCode:%d, sceneType:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(yVar.getType()));
        if (i == 0 || i2 == 0) {
            if (yVar.getType() == 938) {
                C7631s sVar = (C7631s) yVar;
                if (sVar.f25935f) {
                    Log.m105918d("MicroMsg.FaceSettingsManagerUI", "faceprint exist");
                    this.f12401d.mo72529n("settings_faceprint_unlock", false);
                    this.f12401d.notifyDataSetChanged();
                    int p = C75592q0.m90786p();
                    CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f12401d.mo72519a("settings_faceprint_title");
                    Log.m105919d("MicroMsg.FaceSettingsManagerUI", "opScene.isOpenSwitch:%b", Boolean.valueOf(sVar.f25936g));
                    if (sVar.f25936g) {
                        Log.m105918d("MicroMsg.FaceSettingsManagerUI", "hy: faceprint open");
                        checkBoxPreference.mo6808N(true);
                        this.f12401d.mo72529n("settings_faceeprint_reset", false);
                        this.f12401d.mo72529n("settings_faceprint_unlock", false);
                        i3 = p | 4194304;
                        this.f12403f.mo2176J(getString(C0966R.string.is5), "");
                    } else {
                        Log.m105918d("MicroMsg.FaceSettingsManagerUI", "hy: faceprint close");
                        checkBoxPreference.mo6808N(false);
                        this.f12401d.mo72529n("settings_faceeprint_reset", true);
                        this.f12401d.mo72529n("settings_faceprint_unlock", true);
                        i3 = p & -4194305;
                        this.f12403f.mo2176J(getString(C0966R.string.is4), "");
                    }
                    Log.m105925i("MicroMsg.FaceSettingsManagerUI", "scene end plugSwitch %d", Integer.valueOf(i3));
                    C7624i3 i3Var = C7624i3.f25910c;
                    i3Var.mo8756d("last_login_use_voice", i3 + "");
                    C86709a0.m107535s().mo121142i().mo119676J(40, Integer.valueOf(i3));
                    this.f12401d.mo72529n("settings_faceprint_create", true);
                    this.f12401d.mo72529n("settings_faceprint_title", false);
                    this.f12403f.mo2175I((View.OnClickListener) null);
                    this.f12401d.notifyDataSetChanged();
                } else {
                    Log.m105918d("MicroMsg.FaceSettingsManagerUI", "faceprint not exist");
                    C115669n.INSTANCE.mo160131h(11390, 2);
                    this.f12401d.mo72529n("settings_faceprint_create", true);
                    this.f12401d.mo72529n("settings_faceprint_title", true);
                    this.f12401d.mo72529n("settings_faceprint_unlock", true);
                    this.f12401d.mo72529n("settings_faceeprint_reset", true);
                    this.f12403f.mo69924H(getString(C0966R.string.f361296is0));
                    this.f12403f.mo2175I(new C8877j(this));
                    this.f12401d.notifyDataSetChanged();
                }
            }
            ProgressDialog progressDialog = this.f12402e;
            if (progressDialog != null) {
                progressDialog.dismiss();
                return;
            }
            return;
        }
        this.f12401d.mo72529n("settings_faceprint_create", true);
        this.f12401d.mo72529n("settings_faceprint_unlock", true);
        this.f12401d.mo72529n("settings_faceeprint_reset", true);
        ((CheckBoxPreference) this.f12401d.mo72519a("settings_faceprint_title")).mo6808N(false);
        this.f12403f.mo69924H(getString(C0966R.string.is4));
        this.f12401d.notifyDataSetChanged();
        ProgressDialog progressDialog2 = this.f12402e;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
    }
}
