package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceFooterCategory;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import com.tencent.p014mm.sdk.vendor.MIUI;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72976h2;
import com.tencent.p014mm.storage.C72994y1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C75583h3;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import h81.C32735h;
import ht1.C60200t1;
import j20.C117292a;
import java.util.HashMap;
import java.util.Map;
import k20.C9556a;
import nd3.C88931f;
import nj3.C76879j;
import p145dx.C58457w;
import p145dx.C7526s;
import p145dx.C75462x;
import p156gj.C87203t;
import p206nj.C11171e;
import p447aw.C103918d;
import p645pj.C77091b;
import p645pj.C77095h;
import p918s2.C77604h;
import pj3.C47511g;
import qo3.C77426q;
import tc0.C77885p;
import te3.C64266br1;
import vc3.C78382a;
import wj2.C66132f;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI */
public class SettingsNotificationUI extends MMPreference {

    /* renamed from: g */
    public static final /* synthetic */ int f205758g = 0;

    /* renamed from: d */
    public C47511g f205759d;

    /* renamed from: e */
    public int f205760e;

    /* renamed from: f */
    public HashMap<Integer, Integer> f205761f = new HashMap<>();

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI$a */
    public class C71078a implements MenuItem.OnMenuItemClickListener {
        public C71078a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsNotificationUI.this.hideVKB();
            SettingsNotificationUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI$b */
    public class C71079b implements DialogInterface.OnClickListener {
        public C71079b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SettingsNotificationUI settingsNotificationUI = SettingsNotificationUI.this;
            int i2 = SettingsNotificationUI.f205758g;
            settingsNotificationUI.mo97754H7(false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI$c */
    public class C71080c implements DialogInterface.OnClickListener {
        public C71080c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((CheckBoxPreference) SettingsNotificationUI.this.f205759d.mo72519a("settings_finder_app_push_notification")).mo6805K(true);
            SettingsNotificationUI.this.mo97754H7(true);
            SettingsNotificationUI.this.initView();
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI$d */
    public class C71081d implements DialogInterface.OnClickListener {
        public C71081d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Class cls = C75700k0.class;
            C77095h.m93070n(false);
            C72963f4 f4Var = new C72963f4();
            f4Var.mo108740T2(2);
            f4Var.mo108733M2(System.currentTimeMillis());
            f4Var.setType(1);
            f4Var.mo108749c3("weixin");
            f4Var.mo108732L2(SettingsNotificationUI.this.getContext().getString(C0966R.string.ivm, new Object[]{C87203t.m108275k()}));
            C75604z3.m90852x(f4Var);
            C72976h2 j = ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69771j("weixin");
            if (j != null) {
                j.mo108792M2(SettingsNotificationUI.this.getContext().getString(C0966R.string.ivm, new Object[]{C87203t.m108275k()}));
                j.mo108812g3(j.mo108786G2() + 1);
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69773k0(j, "weixin");
            } else {
                C72976h2 h2Var = new C72976h2();
                h2Var.mo108792M2(SettingsNotificationUI.this.getContext().getString(C0966R.string.ivm, new Object[]{C87203t.m108275k()}));
                h2Var.setUsername("weixin");
                h2Var.mo108812g3(1);
                ((C44660i2) ((C75700k0) C86709a0.m107533q(cls)).mo96094Ku()).mo69751W(h2Var);
            }
            SettingsNotificationUI.this.initView();
            C115669n.INSTANCE.idkeyStat(500, 3, 1, false);
            C75583h3.m90715b(false, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI$e */
    public class C71082e implements DialogInterface.OnClickListener {
        public C71082e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C77095h.m93070n(true);
            ((CheckBoxPreference) SettingsNotificationUI.this.f205759d.mo72519a("settings_new_voip_msg_invite_notification")).mo6805K(true);
            SettingsNotificationUI.this.initView();
            C75583h3.m90715b(false, true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI$f */
    public class C71083f implements C88931f {
        public C71083f() {
        }

        /* renamed from: a */
        public void mo62503a(int i, int i2, Intent intent) {
            if (!C77091b.m93036r()) {
                SettingsNotificationUI.this.initView();
                return;
            }
            C77095h.m93069m(true);
            SettingsNotificationUI.this.initView();
            C115669n.INSTANCE.idkeyStat(500, 0, 1, false);
            C75583h3.m90715b(true, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI$g */
    public class C71084g implements C88931f {
        public C71084g() {
        }

        /* renamed from: a */
        public void mo62503a(int i, int i2, Intent intent) {
            if (!C77091b.m93036r()) {
                SettingsNotificationUI.this.initView();
                return;
            }
            C77095h.m93069m(true);
            SettingsNotificationUI.this.initView();
            C115669n.INSTANCE.idkeyStat(500, 0, 1, false);
            C75583h3.m90715b(true, false);
        }
    }

    /* renamed from: H7 */
    public final void mo97754H7(boolean z) {
        long k = C75592q0.m90781k();
        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(z ? k & -2305843009213693953L : k | 2305843009213693952L));
        C64266br1 br12 = new C64266br1();
        br12.f182324d = 70;
        br12.f182325e = z ? 1 : 2;
        ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
    }

    /* renamed from: I7 */
    public final void mo97755I7(C88931f fVar, String str) {
        Class cls = C103918d.class;
        Intent intent = new Intent();
        if (!C11171e.m11046c(26)) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", getPackageName());
            intent.putExtra("app_uid", getApplicationInfo().uid);
            intent.addFlags(268435456);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "openSysSetting", "(Lcom/tencent/mm/pluginsdk/permission/SettingsListener;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else if (!MIUI.ifMIUI() || (MIUI.isMIUI10() && (!MIUI.isMIUI10() || MIUI.ifNotificationChannelSupportNativeActionJump()))) {
            Log.m105924i("MicroMsg.SettingsNotificationUI", "openSysSetting() native notificationchannel jump");
            if (new C77604h(getContext()).mo107781a()) {
                intent.setAction("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.CHANNEL_ID", str);
            } else {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            }
            intent.putExtra("android.provider.extra.APP_PACKAGE", getPackageName());
            ((C103918d) C86312j.m106911c(cls)).mo125789zL(intent, fVar);
        } else {
            Log.m105924i("MicroMsg.SettingsNotificationUI", "openSysSetting() ifNotificationChannelSupportNativeActionJump = false");
            Intent intent2 = new Intent("android.intent.action.MAIN");
            intent2.setClassName("com.android.settings", "com.android.settings.Settings$NotificationFilterActivity");
            intent2.putExtra("appName", MMApplicationContext.getContext().getResources().getString(C0966R.string.a0u));
            intent2.putExtra("packageName", getPackageName());
            ((C103918d) C86312j.m106911c(cls)).mo125789zL(intent2, fVar);
        }
    }

    /* renamed from: J7 */
    public final void mo97756J7(String str) {
        Preference a = this.f205759d.mo72519a(str);
        int l = C77091b.m93030l();
        String string = getString(C0966R.string.f8037zz);
        switch (l) {
            case -1:
            case 0:
                string = getString(C0966R.string.f8037zz);
                break;
            case 1:
                string = getString(C0966R.string.in9);
                break;
            case 2:
                string = getString(C0966R.string.ine);
                break;
            case 3:
                string = getString(C0966R.string.ind);
                break;
            case 4:
                string = getString(C0966R.string.inb);
                break;
            case 5:
                string = getString(C0966R.string.in_);
                break;
            case 6:
                string = getString(C0966R.string.ina);
                break;
            case 7:
                string = getString(C0966R.string.inc);
                break;
        }
        a.mo7741E(string);
    }

    /* renamed from: K7 */
    public final void mo97757K7(boolean z, long j, int i) {
        Log.m105918d("MicroMsg.SettingsNotificationUI", "switch change : open = " + z + " item value = " + j + " functionId = " + i);
        if (z) {
            this.f205760e = (int) (j | ((long) this.f205760e));
        } else {
            this.f205760e = (int) ((~j) & ((long) this.f205760e));
        }
        this.f205761f.put(Integer.valueOf(i), Integer.valueOf(z ? 1 : 2));
    }

    public int getResourceId() {
        return C0966R.xml.f8963ch;
    }

    public void initView() {
        Class cls = C75462x.class;
        C47511g preferenceScreen = getPreferenceScreen();
        this.f205759d = preferenceScreen;
        preferenceScreen.removeAll();
        this.f205759d.mo72520b(getResourceId());
        boolean z = false;
        this.f205759d.mo72529n("settings_new_msg_show_detail", false);
        if (C11171e.m11046c(26)) {
            this.f205759d.mo72529n("settings_new_msg_title", true);
            this.f205759d.mo72529n("settings_new_msg_notification_sound", true);
            this.f205759d.mo72529n("settings_new_msg_notification_ringtone", true);
            this.f205759d.mo72529n("settings_new_msg_notification_shake", true);
            this.f205759d.mo72529n("setting_news_notification", false);
            this.f205759d.mo72529n("settings_special_scene_notification_sound_and_shake", false);
            this.f205759d.mo72529n("settings_new_msg_notification_channel_sound", false);
        } else {
            this.f205759d.mo72529n("settings_new_msg_title", false);
            this.f205759d.mo72529n("settings_new_msg_notification_sound", false);
            this.f205759d.mo72529n("settings_new_msg_notification_ringtone", false);
            this.f205759d.mo72529n("settings_new_msg_notification_shake", false);
            this.f205759d.mo72529n("setting_news_notification", true);
            this.f205759d.mo72529n("settings_special_scene_notification_sound_and_shake", true);
            this.f205759d.mo72529n("settings_new_msg_notification_channel_sound", true);
        }
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f205759d.mo72519a("settings_new_msg_notification_switch");
        if (C11171e.m11046c(26)) {
            checkBoxPreference.mo6805K(C77091b.m93034p() && C77091b.m93036r());
        } else {
            checkBoxPreference.mo6805K(C77091b.m93034p());
        }
        if (checkBoxPreference.mo6804J()) {
            if (C11171e.m11046c(26)) {
                this.f205759d.mo72529n("setting_news_notification", false);
                Log.m105925i("MicroMsg.SettingsNotificationUI", "initView() mSpecialSceneSwitchEnable:%s", Integer.valueOf(C77091b.f225180a));
                this.f205759d.mo72529n("settings_special_scene_notification_sound_and_shake", C77091b.f225180a != 1);
                if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_android_new_msg_ringtone_setting_sw, 1) == 1) {
                    mo97756J7("settings_new_msg_notification_channel_sound");
                } else {
                    this.f205759d.mo72529n("settings_new_msg_notification_channel_sound", true);
                }
            } else {
                CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f205759d.mo72519a("settings_new_msg_notification_sound");
                checkBoxPreference2.mo6805K(C77091b.m93020b());
                if (checkBoxPreference2.mo6804J()) {
                    this.f205759d.mo72529n("settings_new_msg_notification_ringtone", false);
                    mo97756J7("settings_new_msg_notification_ringtone");
                } else {
                    this.f205759d.mo72529n("settings_new_msg_notification_ringtone", true);
                }
                ((CheckBoxPreference) this.f205759d.mo72519a("settings_new_msg_notification_shake")).mo6805K(C77091b.m93026h());
            }
            ((CheckBoxPreference) this.f205759d.mo72519a("settings_new_msg_show_detail")).mo6805K(C77091b.m93019a());
        } else {
            this.f205759d.mo72529n("settings_new_msg_show_detail", true);
            this.f205759d.mo72529n("settings_new_msg_title", true);
            this.f205759d.mo72529n("settings_new_msg_notification_sound", true);
            this.f205759d.mo72529n("settings_new_msg_notification_ringtone", true);
            this.f205759d.mo72529n("settings_new_msg_notification_shake", true);
            this.f205759d.mo72529n("setting_news_notification", true);
            this.f205759d.mo72529n("settings_special_scene_notification_sound_and_shake", true);
            this.f205759d.mo72529n("settings_new_msg_notification_channel_sound", true);
        }
        if (C11171e.m11044a(26)) {
            this.f205759d.mo72519a("settings_ringtone_title").mo69923G(C0966R.string.f361284io2);
            this.f205759d.mo72529n("settings_voip_notification_both_shake_and_sound", true);
            this.f205759d.mo72529n("setting_voip_notification", true);
            ((CheckBoxPreference) this.f205759d.mo72519a("settings_voip_sound")).mo6805K(C77091b.m93021c());
            ((CheckBoxPreference) this.f205759d.mo72519a("settings_voip_shake")).mo6805K(C77091b.m93027i());
        } else {
            if (C11171e.m11044a(29)) {
                this.f205759d.mo72529n("setting_voip_notification", true);
                ((CheckBoxPreference) this.f205759d.mo72519a("settings_voip_notification_both_shake_and_sound")).mo6805K(C77091b.m93021c());
            } else {
                this.f205759d.mo72529n("settings_voip_notification_both_shake_and_sound", true);
            }
            this.f205759d.mo72529n("settings_voip_shake", true);
            this.f205759d.mo72529n("settings_voip_sound", true);
        }
        ((CheckBoxPreference) this.f205759d.mo72519a("settings_notification_hear_ringtone_when_call_me")).mo6805K(C77091b.m93037s().getBoolean("settings_ringtone_allow_hear", true));
        if (((C75462x) C86312j.m106911c(cls)).mo82797CS() || ((C75462x) C86312j.m106911c(cls)).mo82798MX() || ((C75462x) C86312j.m106911c(cls)).gs0()) {
            this.f205759d.mo72529n("settings_notification_hear_ringtone_when_call_me", false);
        } else {
            this.f205759d.mo72529n("settings_notification_hear_ringtone_when_call_me", true);
        }
        Preference a = this.f205759d.mo72519a("settings_notification_ringtone");
        String str = "";
        C66132f Hi0 = ((C7526s) C86312j.m106911c(C7526s.class)).Hi0(str);
        if (Hi0 != null) {
            str = Util.nullAsNil(Hi0.f190086i);
        }
        a.mo7741E(str);
        ((CheckBoxPreference) this.f205759d.mo72519a("settings_new_voip_msg_invite_notification")).mo6805K(C77091b.m93035q());
        if (!C77091b.m93035q()) {
            this.f205759d.mo72529n("settings_voip_shake", true);
            this.f205759d.mo72529n("settings_voip_sound", true);
            this.f205759d.mo72529n("settings_voip_notification_both_shake_and_sound", true);
            this.f205759d.mo72529n("setting_voip_notification", true);
            if (!checkBoxPreference.mo6804J()) {
                this.f205759d.mo72529n("settings_notification_sound_shake", true);
                this.f205759d.mo72529n("settings_ringtone_title", true);
            }
        }
        this.f205759d.mo72529n("settings_finder_app_push_notification", !((C60200t1) C86312j.m106911c(C60200t1.class)).mo76873sF() || !((((34359738368L & C75592q0.m90781k()) > 0 ? 1 : ((34359738368L & C75592q0.m90781k()) == 0 ? 0 : -1)) != 0) ^ true) || !C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_APP_PUSH_SETTING_SHOW_BOOLEAN, false));
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.f205759d.mo72519a("settings_finder_app_push_notification");
        checkBoxPreference3.f121290w = false;
        checkBoxPreference3.mo6805K((C75592q0.m90781k() & 2305843009213693952L) == 0);
        this.f205759d.mo72529n("settings_notification_finder", true);
        this.f205759d.mo72529n("settings_notification_finder_nearby", true);
        this.f205759d.mo72529n("settings_notification_finder_live", true);
        if (WeChatBrands.Business.Entries.MeSetNewMsgChannels.banned()) {
            this.f205759d.mo72531o("settings_notification_finder");
        }
        setBackBtn(new C71078a());
        this.f205759d.mo72529n("settings_sns_notify", true);
        if (this.f205759d.mo72522f("settings_sns_notify") || this.f205759d.mo72522f("settings_notification_finder_nearby") || this.f205759d.mo72522f("settings_notification_finder") || this.f205759d.mo72522f("settings_notification_finder_live")) {
            z = true;
        }
        boolean z2 = !z;
        this.f205759d.mo72529n("settings_update_notify_title", z2);
        this.f205759d.mo72529n("settings_notification_tips", z2);
        ((PreferenceFooterCategory) this.f205759d.mo72519a("settings_notification_tips")).f24276K = true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f205760e = C75592q0.m90787q();
        C75592q0.m90785o();
        C77091b.m93031m();
        setMMTitle((int) C0966R.string.ivr);
    }

    public void onDestroy() {
        super.onDestroy();
        C75583h3.m90714a(3);
    }

    public void onPause() {
        super.onPause();
        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(this.f205760e));
        for (Map.Entry next : this.f205761f.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            C64266br1 br12 = new C64266br1();
            br12.f182324d = intValue;
            br12.f182325e = intValue2;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
            Log.m105918d("MicroMsg.SettingsNotificationUI", "switch  " + intValue + " " + intValue2);
        }
        this.f205761f.clear();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Preference preference2 = preference;
        Class cls = C60200t1.class;
        String str = preference2.f121285r;
        if (str.equals("settings_sns_notify")) {
            this.f205759d.mo72529n("settings_sns_notify", true);
            return true;
        }
        if (str.equals("settings_notification_finder")) {
            boolean J = ((CheckBoxPreference) preference2).mo6804J();
            Log.m105925i("MicroMsg.SettingsNotificationUI", "settings_notification_finder isEnable=%s", Boolean.valueOf(J));
            ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77251W5(J);
        } else if (str.equals("settings_notification_finder_live")) {
            boolean J2 = ((CheckBoxPreference) preference2).mo6804J();
            Log.m105925i("MicroMsg.SettingsNotificationUI", "settings_notification_finder_live isEnable=%s", Boolean.valueOf(J2));
            ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77260c6(J2);
        } else if (str.equals("settings_finder_app_push_notification")) {
            boolean J3 = ((CheckBoxPreference) preference2).mo6804J();
            Log.m105925i("MicroMsg.SettingsNotificationUI", "settings_finder_app_push_notification isEnable=%s", Boolean.valueOf(J3));
            if (!J3) {
                C76879j.m92717K(getContext(), false, getContext().getString(C0966R.string.ish), "", getContext().getString(C0966R.string.ivi), getContext().getString(C0966R.string.itc), new C71079b(), new C71080c());
            } else {
                mo97754H7(true);
            }
        } else if (str.equals("settings_notification_finder_nearby")) {
            boolean J4 = ((CheckBoxPreference) preference2).mo6804J();
            Log.m105925i("MicroMsg.SettingsNotificationUI", "settings_notification_finder_nearby isEnable=%s", Boolean.valueOf(J4));
            ((C60200t1) C86312j.m106911c(cls)).Nt0().mo77249U5(J4);
            if (J4) {
                C115669n.INSTANCE.mo160131h(22479, Long.valueOf(C31543z5.m39453c()), 1);
            } else {
                C115669n.INSTANCE.mo160131h(22479, Long.valueOf(C31543z5.m39453c()), 0);
            }
        } else if (str.equals("settings_voip_notification_both_shake_and_sound")) {
            CheckBoxPreference checkBoxPreference = (CheckBoxPreference) preference2;
            boolean J5 = checkBoxPreference.mo6804J();
            C77095h.m93066i(J5);
            C77095h.m93068l(J5);
            initView();
            Util.shake(this, checkBoxPreference.mo6804J());
            return true;
        } else if (str.equals("settings_voip_shake")) {
            CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) preference2;
            C77095h.m93066i(checkBoxPreference2.mo6804J());
            initView();
            Util.shake(this, checkBoxPreference2.mo6804J());
            return true;
        } else if (str.equals("settings_voip_sound")) {
            C77095h.m93068l(((CheckBoxPreference) preference2).mo6804J());
            initView();
            return true;
        }
        if (str.equals("settings_sound")) {
            CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) preference2;
            C77095h.m93067k(checkBoxPreference3.mo6804J());
            initView();
            if (checkBoxPreference3.mo6804J()) {
                C115669n.INSTANCE.idkeyStat(500, 10, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(500, 11, 1, false);
            }
            return true;
        } else if (str.equals("settings_shake")) {
            CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) preference2;
            C77095h.m93065h(checkBoxPreference4.mo6804J());
            initView();
            if (checkBoxPreference4.mo6804J()) {
                C115669n.INSTANCE.idkeyStat(500, 16, 1, false);
            } else {
                C115669n.INSTANCE.idkeyStat(500, 17, 1, false);
            }
            Util.shake(this, checkBoxPreference4.mo6804J());
            return true;
        } else if (str.equals("settings_special_scene_notification_sound_and_shake")) {
            Intent intent = new Intent();
            intent.setClass(this, SettingsSpecialSceneNotificationUI.class);
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            C117292a.m165358d(this, aVar.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingsSpecialSceneNotificationUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingsSpecialSceneNotificationUI", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } else if (str.equals("settings_new_msg_notification_switch")) {
            if (!C11171e.m11046c(26) || C77091b.m93036r()) {
                CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) preference2;
                C77095h.m93069m(checkBoxPreference5.mo6804J());
                initView();
                if (checkBoxPreference5.mo6804J()) {
                    C115669n.INSTANCE.idkeyStat(500, 0, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(500, 1, 1, false);
                }
                C75583h3.m90715b(true, false);
            } else {
                C77426q qVar = new C77426q(getContext());
                qVar.mo107595g(getString(C0966R.string.inh));
                qVar.mo107589a(false);
                qVar.mo107590b(new C71157u2(this));
                qVar.mo107603o();
            }
            return true;
        } else if (str.equals("settings_new_voip_msg_invite_notification")) {
            if (!((CheckBoxPreference) preference2).mo6804J()) {
                C76879j.m92718L(getContext(), false, getContext().getString(C0966R.string.ivj), "", getContext().getString(C0966R.string.ivi), getContext().getString(C0966R.string.itc), new C71081d(), new C71082e(), C0966R.color.f3041d1, 0);
            } else {
                C77095h.m93070n(true);
                C115669n.INSTANCE.idkeyStat(500, 2, 1, false);
                C75583h3.m90715b(false, true);
                initView();
            }
            return true;
        } else if (str.equals("settings_new_msg_show_detail")) {
            boolean J6 = ((CheckBoxPreference) preference2).mo6804J();
            C77091b.m93037s().edit().putBoolean("settings_show_detail", J6).commit();
            Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : saveIsShowDetail: %B", Boolean.valueOf(J6));
            mo97757K7(!J6, 2048, 10);
            return true;
        } else {
            if (str.equals("setting_news_notification")) {
                mo97755I7(new C71083f(), C78382a.m94650b());
            }
            if (str.equals("setting_voip_notification")) {
                mo97755I7(new C71084g(), ((C7526s) C86312j.m106911c(C7526s.class)).mo8655Ul(""));
            }
            if (str.equals("settings_new_msg_notification_channel_sound") || str.equals("settings_new_msg_notification_ringtone")) {
                Intent intent2 = new Intent(getContext(), SettingMessageRingtoneUI.class);
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(intent2);
                C117292a.m165358d(this, aVar2.mo10232b(), "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingWechatRingtone", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                startActivity((Intent) aVar2.mo10231a(0));
                C117292a.m165359e(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsNotificationUI", "goSettingWechatRingtone", "()Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return true;
            }
            if (str.equals("settings_notification_ringtone")) {
                ((C58457w) C86312j.m106911c(C58457w.class)).mo82791Pu(this, 1);
            }
            if (str.equals("settings_notification_hear_ringtone_when_call_me")) {
                boolean J7 = ((CheckBoxPreference) preference2).mo6804J();
                C77091b.m93037s().edit().putBoolean("settings_ringtone_allow_hear", J7).commit();
                Log.m105925i("MicroMsg.NotificationConfig", "[NOTIFICATION SETTINGS]double write : KEY_RINGTONE_CAN_HEAR: %B", Boolean.valueOf(J7));
                mo97757K7(J7, 1073741824, 71);
            }
            if (str.equals("settings_new_msg_notification_sound")) {
                CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) preference2;
                C77095h.m93067k(checkBoxPreference6.mo6804J());
                initView();
                if (checkBoxPreference6.mo6804J()) {
                    C115669n.INSTANCE.idkeyStat(500, 10, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(500, 11, 1, false);
                }
                return true;
            } else if (!str.equals("settings_new_msg_notification_shake")) {
                return false;
            } else {
                CheckBoxPreference checkBoxPreference7 = (CheckBoxPreference) preference2;
                C77095h.m93065h(checkBoxPreference7.mo6804J());
                initView();
                if (checkBoxPreference7.mo6804J()) {
                    C115669n.INSTANCE.idkeyStat(500, 16, 1, false);
                } else {
                    C115669n.INSTANCE.idkeyStat(500, 17, 1, false);
                }
                Util.shake(this, checkBoxPreference7.mo6804J());
                return true;
            }
        }
    }

    public void onResume() {
        super.onResume();
        initView();
    }
}
