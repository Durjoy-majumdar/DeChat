package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.CheckIsSupportSoterFingerprintEvent;
import com.tencent.p014mm.autogen.events.RequestStartFaceManageEvent;
import com.tencent.p014mm.p136ui.C6752a3;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.base.preference.IconPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.PluginTextPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.account.p024ui.RegByMobileSetPwdUI;
import com.tencent.p014mm.protocal.GeneralControlWrapper;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.sdk.storage.MStorageEx;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import ke3.C88144b;
import l20.C21388a;
import lc3.C10485b;
import nj3.C76912y0;
import p327ct.C30914c;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI */
public class SettingsAccountInfoUI extends MMPreference implements MStorageEx.IOnStorageChange {

    /* renamed from: g */
    public static final String f205674g = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fmp) + "/cgi-bin/readtemplate?check=false&t=weixin_faq_verifyaccount&platform=android&lang=%s");

    /* renamed from: d */
    public C47511g f205675d;

    /* renamed from: e */
    public View f205676e;

    /* renamed from: f */
    public SparseIntArray f205677f;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAccountInfoUI$a */
    public class C71059a implements MenuItem.OnMenuItemClickListener {
        public C71059a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsAccountInfoUI.this.hideVKB();
            SettingsAccountInfoUI.this.finish();
            return true;
        }
    }

    public SettingsAccountInfoUI() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        this.f205677f = sparseIntArray;
        sparseIntArray.put(0, C0966R.string.irb);
        this.f205677f.put(-82, C0966R.string.ion);
        this.f205677f.put(-83, C0966R.string.iok);
        this.f205677f.put(-84, C0966R.string.iol);
        this.f205677f.put(-85, C0966R.string.ioe);
        this.f205677f.put(-86, C0966R.string.iop);
    }

    /* renamed from: H7 */
    public final void mo97727H7() {
        CheckIsSupportSoterFingerprintEvent checkIsSupportSoterFingerprintEvent = new CheckIsSupportSoterFingerprintEvent();
        checkIsSupportSoterFingerprintEvent.publish();
        checkIsSupportSoterFingerprintEvent.f193523d.getClass();
        checkIsSupportSoterFingerprintEvent.f193523d.getClass();
        Boolean bool = Boolean.FALSE;
        checkIsSupportSoterFingerprintEvent.f193523d.getClass();
        checkIsSupportSoterFingerprintEvent.f193523d.getClass();
        Log.m105925i("MicroMsg.SettingsAccountInfoUI", "check is support soter, isSupportSoter: %b, isSupportFP: %b, isSystemHasFPEnrolled: %b", bool, bool, bool);
        this.f205675d.mo72529n("settings_fingerprint_title", true);
    }

    /* renamed from: I7 */
    public final void mo97728I7() {
        if (this.f205675d.mo72519a("settings_manage_login_device") == null) {
            Log.m105920e("MicroMsg.SettingsAccountInfoUI", "safedevicesate preference is null");
            return;
        }
        this.f205675d.mo72529n("settings_manage_login_device", false);
        if (C75592q0.m90775e() != 1) {
            this.f205675d.mo72529n("settings_manage_login_device", true);
        }
    }

    /* renamed from: J7 */
    public final void mo97729J7() {
        Preference a = this.f205675d.mo72519a("settings_mobile");
        if (a == null) {
            Log.m105920e("MicroMsg.SettingsAccountInfoUI", "updateMobile Preference null");
            return;
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        Log.m105918d("MicroMsg.SettingsAccountInfoUI", "mobile :" + str);
        if (str == null || str.length() <= 0) {
            a.mo7741E(getString(C0966R.string.iqw));
        } else {
            a.mo7741E(C6752a3.m7023a(str));
        }
    }

    /* renamed from: K7 */
    public final void mo97730K7() {
        Class cls = C10485b.class;
        Preference a = this.f205675d.mo72519a("settings_username");
        String s = C75592q0.m90789s();
        String c = C75592q0.m90773c();
        if (Util.isNullOrNil(c)) {
            if (C72996z1.m85802I4(s)) {
                a.mo7741E(getString(C0966R.string.iw5));
            } else {
                a.mo7741E(s);
            }
            if (!C72996z1.m85814Q4(C75592q0.m90789s()) && ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) == 0) {
                a.mo69921C(8);
                return;
            }
            return;
        }
        a.mo7741E(c);
        if (((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) == 0) {
            a.mo69921C(8);
        }
    }

    public boolean autoRefresh() {
        return true;
    }

    public int getResourceId() {
        return C0966R.xml.f8952c9;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.ips);
        this.f205675d = getPreferenceScreen();
        View inflate = View.inflate(this, C0966R.C0971layout.bwo, (ViewGroup) null);
        this.f205676e = inflate;
        ((TextView) inflate.findViewById(C0966R.C0970id.jc8)).setText(getString(C0966R.string.iss));
        ((EditText) this.f205676e.findViewById(C0966R.C0970id.jc7)).setInputType(129);
        if (WeChatBrands.Business.Entries.MeSetSecurityVoicePrint.banned() || Util.getInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("VoiceprintEntry"), 0) != 1) {
            this.f205675d.mo72529n("settings_voiceprint_title", true);
        } else if (!C86709a0.m107522a()) {
            Log.m105920e("MicroMsg.SettingsAccountInfoUI", "update voiceprint dot, account not ready!");
            return;
        } else {
            IconPreference iconPreference = (IconPreference) this.f205675d.mo72519a("settings_voiceprint_title");
            if (((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, Boolean.FALSE)).booleanValue() && (C86709a0.m107535s().mo121142i().mo119688i(40, 0) & 131072) == 0) {
                iconPreference.f215054P = getString(C0966R.string.f360088a12);
                iconPreference.f215055Q = C0966R.C0969drawable.ake;
                iconPreference.mo101936T(0);
                Log.m105924i("MicroMsg.SettingsAccountInfoUI", "show voiceprint dot");
                this.f205675d.notifyDataSetChanged();
            }
        }
        if (C75592q0.m90775e() != 1) {
            this.f205675d.mo72529n("settings_manage_login_device", true);
        }
        setBackBtn(new C71059a());
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
        C86709a0.m107535s().mo121142i().add(this);
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107535s().mo121142i().remove(this);
    }

    public void onNotifyChange(int i, MStorageEx mStorageEx, Object obj) {
        mo97730K7();
        mo97729J7();
        mo97728I7();
        mo97727H7();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class cls = C10485b.class;
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.SettingsAccountInfoUI", str + " item has been clicked!");
        C75592q0.m90789s();
        if (Util.isNullOrNil(str)) {
            return false;
        }
        if (str.equals("settings_username")) {
            if (Util.isNullOrNil(C75592q0.m90773c()) && C72996z1.m85814Q4(C75592q0.m90789s()) && ((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) == 0) {
                startActivity(SettingsCreateAliasUI.class);
                return true;
            } else if (((C10485b) C86709a0.m107533q(cls)).vh0().mo107404b("EnableModAlias", 0) != 0) {
                Intent intent = new Intent(this, SettingsAliasUI.class);
                intent.putExtra("WizardRootClass", SettingsAccountInfoUI.class.getCanonicalName());
                MMWizardActivity.m7017L7(this, intent);
            }
        }
        if (str.equals("settings_mobile")) {
            Intent intent2 = new Intent(this, BindMContactIntroUI.class);
            intent2.putExtra("key_upload_scene", 4);
            MMWizardActivity.m7017L7(this, intent2);
            return true;
        }
        if (str.equals("settings_about_vuser_about")) {
            Util.jump(getContext(), String.format(f205674g, new Object[]{LocaleUtil.getApplicationLanguage()}));
        } else if (str.equals("settings_independent_password")) {
            Intent intent3 = new Intent();
            intent3.putExtra("kintent_hint", getString(C0966R.string.iul));
            startActivity(RegByMobileSetPwdUI.class, intent3);
        } else if (str.equals("settings_manage_login_device")) {
            C88144b.m109789g(this, "account", ".security.ui.MySafeDeviceListUI");
        } else if (str.equals("settings_security_center")) {
            String c = ((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("WeChatSafeCenterUrl");
            Log.m105925i("MicroMsg.SettingsAccountInfoUI", "safe center url %s", c);
            if (Util.isNullOrNil(c)) {
                c = getString(C0966R.string.lit) + LocaleUtil.getApplicationLanguage();
            }
            AppCompatActivity context = getContext();
            Intent intent4 = new Intent();
            intent4.putExtra("rawUrl", c);
            intent4.putExtra("showShare", true);
            intent4.putExtra("show_bottom", false);
            intent4.putExtra("needRedirect", false);
            intent4.putExtra("hardcode_jspermission", JsapiPermissionWrapper.f121047h);
            intent4.putExtra("hardcode_general_ctrl", GeneralControlWrapper.f121044e);
            C88144b.m109791i(context, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent4, (Bundle) null);
        } else if (str.equals("settings_voiceprint_title")) {
            if (Util.getInt(((C10485b) C86709a0.m107533q(cls)).vh0().mo107405c("VoiceprintEntry"), 0) == 1 && (C86709a0.m107535s().mo121142i().mo119688i(40, 0) & 131072) == 0) {
                C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_NEW_SHOW_BOOLEAN, Boolean.FALSE);
                ((IconPreference) this.f205675d.mo72519a("settings_voiceprint_title")).mo101936T(8);
                this.f205675d.notifyDataSetChanged();
                Log.m105924i("MicroMsg.SettingsAccountInfoUI", "unset setting account info new show");
            }
            C88144b.m109789g(getContext(), "voiceprint", "com.tencent.mm.plugin.voiceprint.ui.VoicePrintStateSettingUI");
        } else if (str.equals("settings_facedect_title")) {
            RequestStartFaceManageEvent requestStartFaceManageEvent = new RequestStartFaceManageEvent();
            requestStartFaceManageEvent.f193913d.f193915a = this;
            requestStartFaceManageEvent.publish();
            boolean z = requestStartFaceManageEvent.f193914e.f193916a;
            Log.m105925i("MicroMsg.SettingsAccountInfoUI", "hy: is start to face settings succ: %b", Boolean.valueOf(z));
            if (!z) {
                C76912y0.makeText((Context) getContext(), (CharSequence) getString(C0966R.string.ckk), 0).show();
            }
        } else if (str.equals("settings_trust_friend")) {
            startActivity(SettingsTrustFriendUI.class);
        } else if (str.equals("settings_more_safe")) {
            ((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33501j(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTINGS_MORE_SAFE_STRING_SYNC);
            startActivity(SettingsMoreSafeUI.class);
        }
        return false;
    }

    public void onResume() {
        mo97730K7();
        mo97729J7();
        IconPreference iconPreference = (IconPreference) this.f205675d.mo72519a("settings_more_safe");
        if (((C21388a) ((C30914c) C86312j.m106911c(C30914c.class)).mo17862sM()).mo33496d(C72994y1.C72995a.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, C72994y1.C72995a.NEW_BANDAGE_WATCHER_SETTINGS_MORE_SAFE_STRING_SYNC)) {
            iconPreference.mo96250V(0);
        } else {
            iconPreference.mo96250V(8);
        }
        mo97728I7();
        mo97727H7();
        this.f205675d.mo72529n("settings_facedect_title", true);
        PluginTextPreference pluginTextPreference = (PluginTextPreference) this.f205675d.mo72519a("settings_about_vusertitle");
        SelfVuserPreference selfVuserPreference = (SelfVuserPreference) this.f205675d.mo72519a("settings_about_vuserinfo");
        Preference a = this.f205675d.mo72519a("settings_about_vuser_about");
        if (Util.nullAsNil((Integer) C86709a0.m107535s().mo121142i().mo119684e(66049, (Object) null)) != 0) {
            pluginTextPreference.f121264P = 8;
            pluginTextPreference.f121262M = pluginTextPreference.f121274d.getString(C0966R.string.f360314bt2);
            selfVuserPreference.f20789J = new BitmapDrawable(getResources(), (Bitmap) null);
            selfVuserPreference.f20790K = (String) C86709a0.m107535s().mo121142i().mo119684e(66050, (Object) null);
        } else {
            this.f205675d.mo72526j(pluginTextPreference);
            this.f205675d.mo72526j(selfVuserPreference);
            this.f205675d.mo72526j(a);
        }
        super.onResume();
    }
}
