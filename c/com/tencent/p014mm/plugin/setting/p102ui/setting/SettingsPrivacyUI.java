package com.tencent.p014mm.plugin.setting.p102ui.setting;

import al3.C0086a;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.autogen.mmdata.rpt.UserPrivacySettingClientReportStruct;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C45607c2;
import eb0.C45608d2;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import h81.C32735h;
import ht1.C60200t1;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import jr2.C99019x;
import k20.C9556a;
import ke3.C88144b;
import ky2.C10432i;
import os2.C100399d0;
import pj3.C47510b;
import pj3.C47511g;
import qo3.C77389a;
import qo3.C77398g;
import tc0.C77885p;
import te3.C64266br1;
import te3.a94;
import te3.qc4;
import tm2.C14049d;
import xv2.C102775d;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI */
public class SettingsPrivacyUI extends MMPreference {

    /* renamed from: v */
    public static final /* synthetic */ int f205769v = 0;

    /* renamed from: d */
    public C47511g f205770d;

    /* renamed from: e */
    public int f205771e;

    /* renamed from: f */
    public long f205772f;

    /* renamed from: g */
    public long f205773g;

    /* renamed from: h */
    public HashMap<Integer, Integer> f205774h = new HashMap<>();

    /* renamed from: i */
    public String f205775i = "";

    /* renamed from: j */
    public boolean f205776j = true;

    /* renamed from: n */
    public boolean f205777n = false;

    /* renamed from: o */
    public boolean f205778o = false;

    /* renamed from: p */
    public boolean f205779p = false;

    /* renamed from: q */
    public boolean f205780q = false;

    /* renamed from: r */
    public boolean f205781r = true;

    /* renamed from: s */
    public qc4 f205782s = null;

    /* renamed from: t */
    public boolean f205783t = false;

    /* renamed from: u */
    public int f205784u = 0;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsPrivacyUI$a */
    public class C71085a implements MenuItem.OnMenuItemClickListener {
        public C71085a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsPrivacyUI.this.hideVKB();
            SettingsPrivacyUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo97763H7(LinearLayout linearLayout, int i, int i2, boolean z, View.OnClickListener onClickListener) {
        TextView textView = (TextView) View.inflate(getContext(), C0966R.C0971layout.bpg, (ViewGroup) null);
        textView.setText(i);
        textView.setTag(Integer.valueOf(i2));
        linearLayout.addView(textView);
        textView.setOnClickListener(onClickListener);
        if (z) {
            textView.setCompoundDrawablesWithIntrinsicBounds(C0966R.raw.radio_on, 0, 0, 0);
        }
    }

    /* renamed from: I7 */
    public final boolean mo97764I7(boolean z, int i, int i2) {
        Log.m105918d("MicroMsg.SettingPrivacy", "switch change : open = " + z + " item value = " + i + " functionId = " + i2);
        if (z) {
            this.f205771e = i | this.f205771e;
        } else {
            this.f205771e = (~i) & this.f205771e;
        }
        this.f205774h.put(Integer.valueOf(i2), Integer.valueOf(z ? 1 : 2));
        return true;
    }

    /* renamed from: J7 */
    public final void mo97765J7() {
        CheckBoxPreference checkBoxPreference;
        a94 a94 = new a94();
        qc4 ge02 = ((C102775d) C86312j.m106911c(C102775d.class)).ge0();
        if (C99019x.m128971c() != null) {
            a94 = ((C100399d0) C99019x.m128971c()).mo139779SE(this.f205775i);
        }
        if (a94 == null) {
            Log.m105920e("MicroMsg.SettingPrivacy", "userinfo is null");
            return;
        }
        this.f205776j = (C75592q0.m90785o() & 32768) == 0;
        StringBuilder sb = new StringBuilder();
        sb.append("isSnsOpenEntrance ");
        sb.append(this.f205776j);
        sb.append(", install true, flag ");
        sb.append((32768 & C75592q0.m90785o()) == 0);
        Log.m105924i("MicroMsg.SettingPrivacy", sb.toString());
        if (this.f205776j) {
            this.f205770d.mo72529n("settings_story_notify", false);
        } else {
            this.f205770d.mo72529n("settings_story_notify", true);
        }
        if (this.f205776j && (checkBoxPreference = (CheckBoxPreference) this.f205770d.mo72519a("settings_story_notify")) != null) {
            checkBoxPreference.f121290w = false;
            boolean z = ge02.f184996d == 0;
            this.f205781r = z;
            if (z) {
                checkBoxPreference.mo6805K(true);
            } else {
                checkBoxPreference.mo6805K(false);
            }
        }
        this.f205770d.notifyDataSetChanged();
    }

    public C73244a createAdapter(SharedPreferences sharedPreferences) {
        return new C47510b(this, getListView(), sharedPreferences);
    }

    public int getResourceId() {
        return C0966R.xml.f8942by;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.ipo);
        setBackBtn(new C71085a());
        Log.m105924i("MicroMsg.SettingPrivacy", "init function status: " + Integer.toBinaryString(this.f205771e) + "extStatus: " + Long.toBinaryString(this.f205772f) + " FinderSetting: " + Long.toBinaryString(this.f205773g));
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f205770d.mo72519a("settings_need_verify");
        boolean z = false;
        checkBoxPreference.f121290w = false;
        checkBoxPreference.mo6805K((this.f205771e & 32) != 0);
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f205770d.mo72519a("settings_recommend_mobilefriends_to_me");
        checkBoxPreference2.f121290w = false;
        if (str == null || str.length() <= 0) {
            this.f205770d.mo72526j(checkBoxPreference2);
        } else {
            checkBoxPreference2.mo6805K(!((256 & this.f205771e) != 0));
        }
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.f205770d.mo72519a("settings_find_google_contact");
        checkBoxPreference3.f121290w = false;
        if ((1048576 & this.f205771e) != 0) {
            z = true;
        }
        checkBoxPreference3.mo6805K(!z);
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(208903, (Object) null);
        if (!Util.isOverseasUser(this) || TextUtils.isEmpty(str2)) {
            this.f205770d.mo72526j(checkBoxPreference3);
        }
        this.f205770d.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        Class cls = C60200t1.class;
        super.onCreate(bundle);
        this.f205770d = getPreferenceScreen();
        this.f205771e = C75592q0.m90787q();
        this.f205772f = C75592q0.m90781k();
        this.f205773g = ((C60200t1) C86312j.m106911c(cls)).mo76885uf().mo8927f();
        this.f205775i = C75592q0.m90789s();
        qc4 ge02 = ((C102775d) C86312j.m106911c(C102775d.class)).ge0();
        this.f205782s = ge02;
        this.f205781r = ge02.f184996d == 0;
        this.f205784u = getIntent().getIntExtra("enter_scene", 0);
        Log.m105919d("MicroMsg.SettingPrivacy", "story Notify:%s", Boolean.valueOf(this.f205781r));
        initView();
        C115669n.INSTANCE.mo160131h(14098, 9);
        int i = this.f205784u;
        if (i == 1 || i == 2) {
            a94 a94 = new a94();
            if (C99019x.m128971c() != null) {
                a94 = ((C100399d0) C99019x.m128971c()).mo139779SE(this.f205775i);
            }
            if (a94 != null) {
                int i2 = a94.f130395g;
                int i3 = a94.f130396h;
                this.f205777n = i3 == 4320 && (i2 & 4096) > 0;
                this.f205778o = i3 == 72 && (i2 & 4096) > 0;
                this.f205780q = i3 == 720 && (i2 & 4096) > 0;
                this.f205779p = (i2 & 2048) > 0;
            }
            a94 a942 = new a94();
            if (C99019x.m128971c() != null) {
                a942 = ((C100399d0) C99019x.m128971c()).mo139779SE(this.f205775i);
            }
            if (a942 == null) {
                Log.m105920e("MicroMsg.SettingPrivacy", "userinfo is null");
            } else {
                int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_RECENT_RED_DOT_WILL_SHOW_ID_INT, 0)).intValue();
                C85801v1 i4 = C86709a0.m107535s().mo121142i();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_RECENT_RED_DOT_DID_SHOW_ID_INT;
                if (intValue > ((Integer) i4.mo119685f(aVar, 0)).intValue()) {
                    C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(intValue));
                    mo97765J7();
                }
                AppCompatActivity context = getContext();
                C77389a aVar2 = new C77389a();
                aVar2.f225664u = C0086a.m38a(context).getString(C0966R.string.f7926wf);
                aVar2.f225644a = C0086a.m38a(context).getString(C0966R.string.bmg);
                View inflate = View.inflate(getContext(), C0966R.C0971layout.bbz, (ViewGroup) null);
                LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0966R.C0970id.kbc);
                C71136b3 b3Var = new C71136b3(this, linearLayout);
                LinearLayout linearLayout2 = linearLayout;
                C71136b3 b3Var2 = b3Var;
                mo97763H7(linearLayout2, C0966R.string.bmi, 1, this.f205777n, b3Var);
                mo97763H7(linearLayout2, C0966R.string.bmj, 3, this.f205780q, b3Var);
                mo97763H7(linearLayout2, C0966R.string.bmk, 0, this.f205778o, b3Var);
                mo97763H7(linearLayout, C0966R.string.bmh, 2, !this.f205777n && !this.f205778o && !this.f205780q, b3Var2);
                aVar2.f225627J = inflate;
                C77398g gVar = new C77398g(context, C0966R.style.a66);
                gVar.mo107525e(aVar2);
                linearLayout.setTag(gVar);
                gVar.show();
                addDialog(gVar);
            }
        }
        Class cls2 = C10432i.class;
        boolean sF = ((C60200t1) C86312j.m106911c(cls)).mo76873sF();
        boolean z = !((C75592q0.m90781k() & 34359738368L) != 0);
        boolean z2 = ((C10432i) C86312j.m106911c(cls2)).mo10750e() && ((C10432i) C86312j.m106911c(cls2)).mo10740Mn() == 2;
        Log.m105925i("MicroMsg.SettingPrivacy", "[isShowFinderEntrance] show:%s open:%s, isTeenModeAndNothing:%s", Boolean.valueOf(sF), Boolean.valueOf(z), Boolean.valueOf(z2));
        if (sF && z && !z2) {
            this.f205770d.mo72529n("setting_privacy_video_item", false);
        } else {
            this.f205770d.mo72529n("setting_privacy_video_item", true);
        }
        UserPrivacySettingClientReportStruct userPrivacySettingClientReportStruct = new UserPrivacySettingClientReportStruct();
        userPrivacySettingClientReportStruct.f10079d = 1;
        userPrivacySettingClientReportStruct.mo86054n();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(this.f205771e));
        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(this.f205772f));
        ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8928g(this.f205773g);
        for (Map.Entry next : this.f205774h.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            C64266br1 br12 = new C64266br1();
            br12.f182324d = intValue;
            br12.f182325e = intValue2;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
            Log.m105918d("MicroMsg.SettingPrivacy", "switch  " + intValue + " " + intValue2);
        }
        this.f205774h.clear();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.SettingPrivacy", str + " item has been clicked!");
        getDefaultSharedPreferences();
        if (str.equals("settings_need_verify")) {
            mo97764I7(((CheckBoxPreference) gVar.mo72519a("settings_need_verify")).mo6804J(), 32, 4);
            return true;
        } else if (str.equals("settings_recommend_mobilefriends_to_me")) {
            mo97764I7(!((CheckBoxPreference) gVar.mo72519a("settings_recommend_mobilefriends_to_me")).mo6804J(), 256, 7);
            return true;
        } else if (str.equals("settings_about_blacklist")) {
            C45607c2 a = C45608d2.m50666a(getString(C0966R.string.f360860ff1));
            Intent intent = new Intent();
            intent.putExtra("filter_type", a.mo71122a());
            intent.putExtra("titile", getString(C0966R.string.ixd));
            intent.putExtra("list_attr", 32768);
            ((C67654r1) C14049d.m13403b()).getClass();
            intent.setClassName(this, "com.tencent.mm.ui.contact.SelectSpecialContactUI");
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/app/WorkerUICallbackImpl", "startSelectSpecialContactUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/app/WorkerUICallbackImpl", "startSelectSpecialContactUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("setting_privacy_chatting_item")) {
            Intent intent2 = new Intent();
            intent2.addFlags(268435456);
            intent2.putExtra("intent_status_show_bottom_tips", getString(C0966R.string.bu9));
            intent2.setClassName(this, "com.tencent.mm.ui.contact.privacy.ContactMgrOnlyChatUI");
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent2);
            C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("setting_privacy_sns_item")) {
            Intent intent3 = new Intent(this, SettingsSnsPrivacyUI.class);
            intent3.putExtra("need_matte_high_light_item", getIntent().getStringExtra("need_matte_high_light_item"));
            intent3.putExtra("enter_scene", getIntent().getIntExtra("enter_scene", 0));
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(intent3);
            C117292a.m165358d(this, aVar3.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar3.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("setting_privacy_video_item")) {
            Intent intent4 = new Intent();
            intent4.addFlags(268435456);
            intent4.putExtra("intent_status_from_privacy_to_video_setting", true);
            C88144b.m109791i(this, "finder", ".ui.FinderManagementUI", intent4, (Bundle) null);
            return true;
        } else if (str.equals("setting_privacy_watch_item")) {
            Intent intent5 = new Intent();
            intent5.putExtra("intent_status_from_privacy_to_tophistory_setting", true);
            C43471q.m46985i(this, ".ui.home.TopStorySettingUI", intent5);
            return true;
        } else if (str.equals("setting_privacy_wx_sport_item")) {
            Intent intent6 = new Intent();
            intent6.setClassName(this, "com.tencent.mm.ui.contact.privacy.SportBlackListUI");
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(intent6);
            C117292a.m165358d(this, aVar4.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar4.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_find_google_contact")) {
            mo97764I7(!((CheckBoxPreference) gVar.mo72519a("settings_find_google_contact")).mo6804J(), 1048576, 29);
            return true;
        } else if (str.equals("settings_add_me_way")) {
            Intent intent7 = new Intent(this, SettingsAddMeUI.class);
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(intent7);
            C117292a.m165358d(this, aVar5.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar5.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else {
            if (str.equals("settings_auth_manage")) {
                if (WeChatBrands.Business.Entries.MeSetPrivacyPermissions.checkAvailable(this)) {
                    Intent intent8 = new Intent(this, SettingsManageAuthUI.class);
                    C9556a aVar6 = new C9556a();
                    aVar6.mo10233c(intent8);
                    C117292a.m165358d(this, aVar6.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    startActivity((Intent) aVar6.mo10231a(0));
                    C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsPrivacyUI", "onPreferenceTreeClick", "(Lcom/tencent/mm/ui/base/preference/IPreferenceScreen;Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            } else if (str.equals("settings_story_notify")) {
                boolean z = !this.f205781r;
                this.f205781r = z;
                if (z) {
                    this.f205782s.f184996d = 0;
                } else {
                    this.f205782s.f184996d = 1;
                }
                ((C102775d) C86312j.m106911c(C102775d.class)).mo134164Po(this.f205775i, this.f205782s);
                ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(71, this.f205782s));
                mo97765J7();
                return true;
            } else if (str.equals("settings_ad_manage")) {
                String Y60 = ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_oversea_admanage_url_android, "");
                Intent intent9 = new Intent();
                intent9.putExtra("rawUrl", String.format(Y60, new Object[]{LocaleUtil.getCurrentLanguage(this), LocaleUtil.getCurrentCountryCode()}));
                intent9.putExtra("showShare", false);
                intent9.putExtra("show_bottom", false);
                C88144b.m109791i(getContext(), "webview", ".ui.tools.WebViewUI", intent9, (Bundle) null);
            }
            return false;
        }
    }

    public void onResume() {
        super.onResume();
        this.f205771e = C75592q0.m90787q();
        this.f205772f = C75592q0.m90781k();
        this.f205773g = ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76885uf().mo8927f();
        mo97765J7();
        if (!this.f205783t) {
            String stringExtra = getIntent().getStringExtra("need_matte_high_light_item");
            if (!Util.isNullOrNil(stringExtra)) {
                int g = this.f205770d.mo72523g(stringExtra);
                setSelection(g - 3);
                new MMHandler().postDelayed(new C42982a3(this, g), 10);
            }
            this.f205783t = true;
        }
    }
}
