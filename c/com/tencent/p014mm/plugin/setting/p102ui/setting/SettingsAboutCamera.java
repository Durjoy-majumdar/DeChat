package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.SightAutoDownloadAndPlaySettingStruct;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import di3.C86312j;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import h81.C32735h;
import p156gj.C87203t;
import p248ug.C65347o0;
import p646pn.C110234e;
import pj3.C47511g;
import tc0.C77885p;
import te3.C64266br1;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera */
public class SettingsAboutCamera extends MMPreference {

    /* renamed from: d */
    public C47511g f205654d;

    /* renamed from: e */
    public long f205655e;

    /* renamed from: f */
    public int f205656f = 0;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutCamera$a */
    public class C71055a implements MenuItem.OnMenuItemClickListener {
        public C71055a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsAboutCamera.this.hideVKB();
            SettingsAboutCamera.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8954ca;
    }

    public void initView() {
        String str;
        boolean z;
        Class cls = C32735h.class;
        Class cls2 = C65347o0.class;
        this.f205654d = getPreferenceScreen();
        if (!SettingsAboutSystemUI.m83526I7()) {
            setMMTitle((int) C0966R.string.iwh);
        } else {
            setMMTitle((int) C0966R.string.iwi);
        }
        setBackBtn(new C71055a());
        C85801v1 i = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN;
        Boolean bool = Boolean.TRUE;
        boolean booleanValue = ((Boolean) i.mo119685f(aVar, bool)).booleanValue();
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f205654d.mo72519a("settings_auto_mul_terminal_sync");
        checkBoxPreference.f121290w = false;
        checkBoxPreference.mo6805K(booleanValue);
        boolean booleanValue2 = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, bool)).booleanValue();
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f205654d.mo72519a("settings_take_photo_auto_save_photo");
        checkBoxPreference2.f121290w = false;
        checkBoxPreference2.mo6805K(booleanValue2);
        boolean booleanValue3 = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, bool)).booleanValue();
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.f205654d.mo72519a("settings_take_photo_auto_save_video");
        checkBoxPreference3.mo6805K(booleanValue3);
        checkBoxPreference3.f121290w = false;
        boolean booleanValue4 = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, bool)).booleanValue();
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) this.f205654d.mo72519a("settings_sns_auto_play_switch");
        checkBoxPreference4.mo6805K(booleanValue4);
        checkBoxPreference4.f121290w = false;
        if (((C65347o0) C86312j.m106911c(cls2)).xr0()) {
            boolean z2 = (1 & C75592q0.m90780j()) != 0;
            CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) this.f205654d.mo72519a("setting_c2c_gallery_query");
            checkBoxPreference5.mo6805K(z2);
            checkBoxPreference5.f121290w = false;
        }
        if (SettingsAboutSystemUI.m83526I7()) {
            str = "settings_take_photo_auto_save_photo";
            boolean z3 = (this.f205655e & 137438953472L) != 0;
            CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) this.f205654d.mo72519a("settings_voip_audio_switch_mobile_net");
            checkBoxPreference6.mo6805K(!z3);
            checkBoxPreference6.f121290w = false;
        } else {
            str = "settings_take_photo_auto_save_photo";
        }
        this.f205654d.notifyDataSetChanged();
        if (this.f205656f == 1) {
            this.f205654d.mo72529n("settings_sns_auto_play_switch", true);
            this.f205654d.mo72529n("settings_sns_auto_play_tip", true);
            this.f205654d.mo72529n(str, true);
            this.f205654d.mo72529n("settings_take_photo_auto_save_video", true);
            this.f205654d.mo72529n("settings_auto_mul_terminal_sync", true);
            this.f205654d.mo72529n("settings_auto_mul_terminal_sync_tip", true);
            this.f205654d.mo72529n("settings_take_photo_auto_save_tip", true);
        } else {
            boolean z4 = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_sns_video_autoplay, 0) == 1;
            String lowerCase = C87203t.m108275k().toLowerCase();
            String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_sns_video_autoplay_disable_device, "");
            if (Util.isNullOrNil(Y60) || !Y60.contains(lowerCase)) {
                z = z4;
            } else {
                Log.m105925i("ui.settings.SettingsAboutCamera", "model %s is hit, expt:%s", lowerCase, Y60);
                z = false;
            }
            if (!z) {
                this.f205654d.mo72529n("settings_sns_auto_play_switch", true);
                this.f205654d.mo72529n("settings_sns_auto_play_tip", true);
            }
            if (!SettingsAboutSystemUI.m83526I7()) {
                this.f205654d.mo72529n("settings_voip_audio_switch_mobile_net", true);
                this.f205654d.mo72529n("settings_voip_audio_switch_mobile_net_tip", true);
            }
        }
        if (!((C65347o0) C86312j.m106911c(cls2)).xr0()) {
            this.f205654d.mo72529n("setting_c2c_gallery_query", true);
            this.f205654d.mo72529n("setting_c2c_gallery_query_tips", true);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f205655e = C75592q0.m90781k();
        this.f205656f = getIntent().getIntExtra("activity_caller_params", 0);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
        SightAutoDownloadAndPlaySettingStruct sightAutoDownloadAndPlaySettingStruct = new SightAutoDownloadAndPlaySettingStruct();
        int i = 2;
        sightAutoDownloadAndPlaySettingStruct.f194415d = 2;
        C85801v1 i2 = C86709a0.m107535s().mo121142i();
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN;
        Boolean bool = Boolean.TRUE;
        sightAutoDownloadAndPlaySettingStruct.f194416e = ((Boolean) i2.mo119685f(aVar, bool)).booleanValue() ? 1 : 2;
        sightAutoDownloadAndPlaySettingStruct.f194417f = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN, bool)).booleanValue() ? 1 : 2;
        sightAutoDownloadAndPlaySettingStruct.f194418g = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN, bool)).booleanValue() ? 1 : 2;
        sightAutoDownloadAndPlaySettingStruct.f194419h = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN, bool)).booleanValue() ? 1 : 2;
        if ((1 & C75592q0.m90780j()) != 0) {
            i = 1;
        }
        sightAutoDownloadAndPlaySettingStruct.f194420i = i;
        sightAutoDownloadAndPlaySettingStruct.mo86054n();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        C72994y1.C72995a aVar;
        C72994y1.C72995a aVar2;
        Preference preference2 = preference;
        Class cls = C65347o0.class;
        C72994y1.C72995a aVar3 = C72994y1.C72995a.USERINFO_WEIXIN_SNSAUTOPLAY_AUTOSYNC_BOOLEAN;
        C72994y1.C72995a aVar4 = C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEVIDEO_STATE_BOOLEAN;
        C72994y1.C72995a aVar5 = C72994y1.C72995a.USERINFO_WEIXIN_CAMERASAVEIMAGE_STATE_BOOLEAN;
        C72994y1.C72995a aVar6 = C72994y1.C72995a.USERINFO_WEIXIN_MUL_TERMINAL_AUTOSYNC_BOOLEAN;
        String str = preference2.f121285r;
        if (str.equals("settings_auto_mul_terminal_sync")) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar6, Boolean.valueOf(!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar6, Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_take_photo_auto_save_photo")) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar5, Boolean.valueOf(!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar5, Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_take_photo_auto_save_video")) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar4, Boolean.valueOf(!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar4, Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_sns_auto_play_switch")) {
            C86709a0.m107535s().mo121142i().mo119677K(aVar3, Boolean.valueOf(!((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar3, Boolean.TRUE)).booleanValue()));
        }
        if (str.equals("settings_voip_audio_switch_mobile_net")) {
            boolean J = ((CheckBoxPreference) preference2).mo6804J();
            StringBuilder sb = new StringBuilder();
            sb.append("switch ext change : open = ");
            sb.append(J);
            sb.append(" item value = ");
            aVar2 = aVar3;
            aVar = aVar4;
            sb.append(137438953472L);
            sb.append(" functionId = ");
            sb.append(58);
            Log.m105924i("ui.settings.SettingsAboutCamera", sb.toString());
            if (J) {
                this.f205655e &= -137438953473L;
            } else {
                this.f205655e = 137438953472L | this.f205655e;
            }
            int i = J ? 1 : 2;
            C64266br1 br12 = new C64266br1();
            br12.f182324d = 58;
            br12.f182325e = i;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
            C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(this.f205655e));
        } else {
            aVar2 = aVar3;
            aVar = aVar4;
        }
        if (str.equals("setting_c2c_gallery_query")) {
            ((C65347o0) C86312j.m106911c(cls)).mo89076QZ(((CheckBoxPreference) preference2).mo6804J());
            ((C65347o0) C86312j.m106911c(cls)).mo89083yd(3);
        }
        SightAutoDownloadAndPlaySettingStruct sightAutoDownloadAndPlaySettingStruct = new SightAutoDownloadAndPlaySettingStruct();
        sightAutoDownloadAndPlaySettingStruct.f194415d = 3;
        if (Util.isEqual(str, "settings_auto_mul_terminal_sync")) {
            sightAutoDownloadAndPlaySettingStruct.f194416e = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar6, Boolean.TRUE)).booleanValue() ? 1 : 2;
        } else if (Util.isEqual(str, "settings_take_photo_auto_save_photo")) {
            sightAutoDownloadAndPlaySettingStruct.f194417f = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar5, Boolean.TRUE)).booleanValue() ? 1 : 2;
        } else if (Util.isEqual(str, "settings_take_photo_auto_save_video")) {
            sightAutoDownloadAndPlaySettingStruct.f194418g = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar, Boolean.TRUE)).booleanValue() ? 1 : 2;
        } else if (Util.isEqual(str, "settings_sns_auto_play_switch")) {
            sightAutoDownloadAndPlaySettingStruct.f194419h = ((Boolean) C86709a0.m107535s().mo121142i().mo119685f(aVar2, Boolean.TRUE)).booleanValue() ? 1 : 2;
        } else if (Util.isEqual(str, "setting_c2c_gallery_query")) {
            sightAutoDownloadAndPlaySettingStruct.f194420i = ((1 & C75592q0.m90780j()) > 0 ? 1 : ((1 & C75592q0.m90780j()) == 0 ? 0 : -1)) != 0 ? 1 : 2;
        }
        sightAutoDownloadAndPlaySettingStruct.mo86054n();
        return false;
    }

    public void onResume() {
        super.onResume();
        if (this.f205656f == 1) {
            ((C110234e) C86312j.m106911c(C110234e.class)).mo161399pY().mo149141q(true);
            C103928o.m138641a(true, false, true);
        }
    }
}
