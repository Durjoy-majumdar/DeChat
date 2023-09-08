package com.tencent.p014mm.plugin.voiceprint.p118ui;

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
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C7624i3;
import eb0.C97625j3;
import j20.C117292a;
import k20.C9556a;
import k33.C9561j;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p447aw.C103918d;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI */
public class SettingsVoicePrintUI extends MMPreference implements C11385n {

    /* renamed from: i */
    public static final /* synthetic */ int f21682i = 0;

    /* renamed from: d */
    public C47511g f21683d;

    /* renamed from: e */
    public ProgressDialog f21684e = null;

    /* renamed from: f */
    public VoiceHeaderPreference f21685f;

    /* renamed from: g */
    public View f21686g;

    /* renamed from: h */
    public boolean f21687h = false;

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI$a */
    public class C5693a implements DialogInterface.OnCancelListener {
        public C5693a(SettingsVoicePrintUI settingsVoicePrintUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI$b */
    public class C5694b implements DialogInterface.OnCancelListener {
        public C5694b(SettingsVoicePrintUI settingsVoicePrintUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI$c */
    public class C5695c implements MenuItem.OnMenuItemClickListener {
        public C5695c() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsVoicePrintUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI$d */
    public class C5696d implements DialogInterface.OnCancelListener {
        public C5696d(SettingsVoicePrintUI settingsVoicePrintUI) {
        }

        public void onCancel(DialogInterface dialogInterface) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI$e */
    public class C5697e implements DialogInterface.OnClickListener {
        public C5697e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            ((C103918d) C86312j.m106911c(C103918d.class)).mo125783j7(SettingsVoicePrintUI.this.getContext());
        }
    }

    /* renamed from: com.tencent.mm.plugin.voiceprint.ui.SettingsVoicePrintUI$f */
    public class C5698f implements DialogInterface.OnClickListener {
        public C5698f(SettingsVoicePrintUI settingsVoicePrintUI) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: H7 */
    public final void mo6721H7() {
        C115669n.INSTANCE.mo160131h(11390, 3);
        Intent intent = new Intent();
        intent.setClass(this, VoiceCreateUI.class);
        intent.putExtra("kscene_type", 71);
        intent.putExtra("createVoicePrint", true);
        startActivityForResult(intent, 1);
        this.f21687h = false;
    }

    public int getResourceId() {
        return C0966R.xml.f8971cs;
    }

    public void initView() {
        int nullAsInt = Util.nullAsInt(C97625j3.m125812b().mo105906u().mo119684e(40, 0), 0);
        Log.m105924i("MicroMsg.VoiceSettingsUI", "plugSwitch " + nullAsInt + " " + (nullAsInt & 131072));
        C47511g preferenceScreen = getPreferenceScreen();
        this.f21683d = preferenceScreen;
        this.f21685f = (VoiceHeaderPreference) preferenceScreen.mo72519a("settings_voiceprint_header");
        ((CheckBoxPreference) this.f21683d.mo72519a("settings_voiceprint_title")).mo6808N(true);
        this.f21683d.notifyDataSetChanged();
        ProgressDialog progressDialog = this.f21684e;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.f21684e.dismiss();
        }
        this.f21684e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C5694b(this));
        C97625j3.m125815e().mo123460f(new C9561j(0));
        this.f21683d.mo72529n("settings_voiceprint_title", true);
        this.f21683d.mo72529n("settings_voiceprint_unlock", true);
        this.f21683d.mo72529n("settings_voiceprint_reset", true);
        this.f21683d.mo72529n("settings_voiceprint_create", true);
        setBackBtn(new C5695c());
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && intent != null) {
            this.f21687h = intent.getBooleanExtra("KIsCreateSuccess", false);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle((int) C0966R.string.j1u);
        C97625j3.m125815e().mo123455a(615, this);
        this.f21686g = findViewById(C0966R.C0970id.gv4);
        initView();
        this.f21686g.setBackgroundResource(C0966R.color.al6);
        C85801v1 u = C97625j3.m125812b().mo105906u();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_VOICEPRINT_MORE_TAB_DOT_SHOW_BOOLEAN;
        Boolean bool = Boolean.FALSE;
        u.mo119677K(aVar, bool);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERFINO_VOICEPRINT_SETTING_DOT_SHOW_BOOLEAN, bool);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, bool);
        C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, bool);
        Log.m105924i("MicroMsg.VoiceSettingsUI", "unset all voiceprint config");
    }

    public void onDestroy() {
        super.onDestroy();
        C97625j3.m125815e().mo123470p(615, this);
        ProgressDialog progressDialog = this.f21684e;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Intent intent = new Intent();
        if (str.equals("settings_voiceprint_title")) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) gVar.mo72519a("settings_voiceprint_title");
            Log.m105918d("MicroMsg.VoiceSettingsUI", "checkPref.isChecked() " + checkBoxPreference.mo6804J());
            ProgressDialog progressDialog = this.f21684e;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f21684e.dismiss();
            }
            this.f21684e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C5696d(this));
            if (checkBoxPreference.mo6804J()) {
                C97625j3.m125815e().mo123460f(new C9561j(1));
            } else {
                C97625j3.m125815e().mo123460f(new C9561j(2));
            }
            return true;
        } else if (str.equals("settings_voiceprint_unlock")) {
            intent.setClass(this, VoiceUnLockUI.class);
            intent.putExtra("kscene_type", 73);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/voiceprint/ui/SettingsVoicePrintUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (!str.equals("settings_voiceprint_reset")) {
            return false;
        } else {
            intent.setClass(this, VoiceCreateUI.class);
            intent.putExtra("KvoicePrintReset", true);
            intent.putExtra("kscene_type", 73);
            startActivityForResult(intent, 1);
            return true;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            Log.m105925i("MicroMsg.VoiceSettingsUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", Integer.valueOf(i), Long.valueOf(Thread.currentThread().getId()));
            return;
        }
        Log.m105925i("MicroMsg.VoiceSettingsUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", Integer.valueOf(i), Integer.valueOf(iArr[0]), Long.valueOf(Thread.currentThread().getId()));
        if (i == 80) {
            if (iArr[0] == 0) {
                mo6721H7();
                return;
            }
            C76879j.m92709C(this, getString(C0966R.string.f361130hi2), getString(C0966R.string.hif), getString(C0966R.string.fyd), getString(C0966R.string.auj), false, new C5697e(), new C5698f(this));
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f21687h) {
            this.f21687h = false;
            ProgressDialog progressDialog = this.f21684e;
            if (progressDialog != null && progressDialog.isShowing()) {
                this.f21684e.dismiss();
            }
            this.f21684e = C76879j.m92723Q(getContext(), getString(C0966R.string.a3h), getString(C0966R.string.a4d), true, true, new C5693a(this));
            Log.m105918d("MicroMsg.VoiceSettingsUI", "resume after create voiceprint, get switch status");
            C97625j3.m125815e().mo123460f(new C9561j(1));
        }
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        int i3;
        Log.m105919d("MicroMsg.VoiceSettingsUI", "onSceneEnd, errType:%d, errCode:%d, sceneType:%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(yVar.getType()));
        if (i == 0 || i2 == 0) {
            if (yVar.getType() == 615) {
                C9561j jVar = (C9561j) yVar;
                if (jVar.f29788f == 1) {
                    Log.m105918d("MicroMsg.VoiceSettingsUI", "voiceprint exist");
                    this.f21683d.mo72529n("settings_voiceprint_unlock", false);
                    this.f21683d.notifyDataSetChanged();
                    int p = C75592q0.m90786p();
                    CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f21683d.mo72519a("settings_voiceprint_title");
                    Log.m105919d("MicroMsg.VoiceSettingsUI", "opScene.getSwitch:%d", Integer.valueOf(jVar.f29789g));
                    if (jVar.f29789g > 0) {
                        Log.m105918d("MicroMsg.VoiceSettingsUI", "voiceprint open");
                        checkBoxPreference.mo6808N(true);
                        this.f21683d.mo72529n("settings_voiceprint_reset", false);
                        this.f21683d.mo72529n("settings_voiceprint_unlock", false);
                        i3 = p | 131072;
                        this.f21685f.mo6729J(getString(C0966R.string.f361508ke3), "");
                    } else {
                        Log.m105918d("MicroMsg.VoiceSettingsUI", "voiceprint close");
                        checkBoxPreference.mo6808N(false);
                        this.f21683d.mo72529n("settings_voiceprint_reset", true);
                        this.f21683d.mo72529n("settings_voiceprint_unlock", true);
                        i3 = p & -131073;
                        this.f21685f.mo6729J(getString(C0966R.string.f361506ke1), "");
                    }
                    Log.m105925i("MicroMsg.VoiceSettingsUI", "scene end plugSwitch %d", Integer.valueOf(i3));
                    C7624i3 i3Var = C7624i3.f25910c;
                    i3Var.mo8756d("last_login_use_voice", i3 + "");
                    C97625j3.m125812b().mo105906u().mo119676J(40, Integer.valueOf(i3));
                    this.f21683d.mo72529n("settings_voiceprint_create", true);
                    this.f21683d.mo72529n("settings_voiceprint_title", false);
                    this.f21685f.mo6728I((View.OnClickListener) null);
                    this.f21683d.notifyDataSetChanged();
                } else {
                    Log.m105918d("MicroMsg.VoiceSettingsUI", "voiceprint not exist");
                    C115669n.INSTANCE.mo160131h(11390, 2);
                    this.f21683d.mo72529n("settings_voiceprint_unlock", true);
                    this.f21683d.mo72529n("settings_voiceprint_reset", true);
                    this.f21683d.mo72529n("settings_voiceprint_create", true);
                    this.f21683d.mo72529n("settings_voiceprint_title", true);
                    this.f21685f.mo6729J(getString(C0966R.string.ke5), getString(C0966R.string.ke4));
                    this.f21685f.mo6728I(new C5710b(this));
                    this.f21683d.notifyDataSetChanged();
                }
            }
            ProgressDialog progressDialog = this.f21684e;
            if (progressDialog != null) {
                progressDialog.dismiss();
                return;
            }
            return;
        }
        this.f21683d.mo72529n("settings_voiceprint_unlock", true);
        this.f21683d.mo72529n("settings_voiceprint_reset", true);
        this.f21683d.mo72529n("settings_voiceprint_create", true);
        this.f21683d.mo72529n("settings_voiceprint_title", false);
        ((CheckBoxPreference) this.f21683d.mo72519a("settings_voiceprint_title")).mo6808N(false);
        this.f21685f.mo6729J(getString(C0966R.string.f361506ke1), "");
        this.f21683d.notifyDataSetChanged();
        ProgressDialog progressDialog2 = this.f21684e;
        if (progressDialog2 != null) {
            progressDialog2.dismiss();
        }
    }
}
