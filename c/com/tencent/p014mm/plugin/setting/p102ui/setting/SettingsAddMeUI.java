package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.C73244a;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatBrands;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import java.util.HashMap;
import java.util.Map;
import pj3.C47510b;
import pj3.C47511g;
import tc0.C77885p;
import te3.C64266br1;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI */
public class SettingsAddMeUI extends MMPreference {

    /* renamed from: d */
    public C47511g f20798d;

    /* renamed from: e */
    public HashMap<Integer, Integer> f20799e = new HashMap<>();

    /* renamed from: f */
    public int f20800f;

    /* renamed from: g */
    public int f20801g;

    /* renamed from: h */
    public long f20802h;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAddMeUI$a */
    public class C5258a implements MenuItem.OnMenuItemClickListener {
        public C5258a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsAddMeUI.this.hideVKB();
            SettingsAddMeUI.this.finish();
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo6224H7(boolean z, int i, int i2) {
        Log.m105918d("MicroMsg.SettingsAddMeUI", "switch change : open = " + z + " item value = " + i + " functionId = " + i2);
        if (z) {
            this.f20800f = i | this.f20800f;
        } else {
            this.f20800f = (~i) & this.f20800f;
        }
        this.f20799e.put(Integer.valueOf(i2), Integer.valueOf(z ? 1 : 2));
    }

    /* renamed from: I7 */
    public final void mo6225I7(boolean z, int i, int i2) {
        Log.m105918d("MicroMsg.SettingsAddMeUI", "switch ext change : open = " + z + " item value = " + i + " functionId = " + i2);
        if (z) {
            this.f20802h |= (long) i;
        } else {
            this.f20802h &= (long) (~i);
        }
        this.f20799e.put(Integer.valueOf(i2), Integer.valueOf(z ? 1 : 2));
    }

    public C73244a createAdapter(SharedPreferences sharedPreferences) {
        return new C47510b(this, getListView(), sharedPreferences);
    }

    public int getResourceId() {
        return C0966R.xml.f8945c1;
    }

    public void initView() {
        boolean z;
        setMMTitle((int) C0966R.string.f361292iq3);
        setBackBtn(new C5258a());
        Log.m105918d("MicroMsg.SettingsAddMeUI", "plug:" + this.f20801g + ",status:" + this.f20800f + ",extstatus:" + this.f20802h);
        this.f20798d.removeAll();
        this.f20798d.mo72520b(getResourceId());
        Integer num = (Integer) C86709a0.m107535s().mo121142i().mo119684e(9, (Object) null);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f20798d.mo72519a("settings_find_me_by_QQ");
        checkBoxPreference.f121290w = false;
        if (WeChatBrands.Business.Entries.MeSetPrivacyAddByQQ.banned() || num == null || num.intValue() == 0) {
            this.f20798d.mo72526j(checkBoxPreference);
        } else {
            int i = this.f20800f;
            if ((8 & i) != 0) {
                if ((16 & i) != 0) {
                    z = false;
                    checkBoxPreference.mo6805K(z);
                }
            }
            z = true;
            checkBoxPreference.mo6805K(z);
        }
        String str = (String) C86709a0.m107535s().mo121142i().mo119684e(6, (Object) null);
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) this.f20798d.mo72519a("settings_find_me_by_mobile");
        checkBoxPreference2.f121290w = false;
        if (str == null || str.length() <= 0) {
            this.f20798d.mo72526j(checkBoxPreference2);
        } else {
            checkBoxPreference2.mo6805K(!((this.f20800f & 512) != 0));
        }
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) this.f20798d.mo72519a("settings_find_me_by_weixin");
        checkBoxPreference3.f121290w = false;
        if ((this.f20801g & 512) != 0) {
            checkBoxPreference3.mo6805K(false);
        } else {
            checkBoxPreference3.mo6805K(true);
        }
        CheckBoxPreference checkBoxPreference4 = (CheckBoxPreference) this.f20798d.mo72519a("settings_find_me_by_google");
        checkBoxPreference4.mo6805K(!((524288 & this.f20800f) != 0));
        checkBoxPreference4.f121290w = false;
        String str2 = (String) C86709a0.m107535s().mo121142i().mo119684e(208903, (Object) null);
        if (!Util.isOverseasUser(this) || TextUtils.isEmpty(str2)) {
            this.f20798d.mo72526j(checkBoxPreference4);
        }
        CheckBoxPreference checkBoxPreference5 = (CheckBoxPreference) this.f20798d.mo72519a("settings_add_me_by_chatroom");
        checkBoxPreference5.f121290w = false;
        if ((this.f20802h & 1) != 0) {
            checkBoxPreference5.mo6805K(false);
        } else {
            checkBoxPreference5.mo6805K(true);
        }
        CheckBoxPreference checkBoxPreference6 = (CheckBoxPreference) this.f20798d.mo72519a("settings_add_me_by_qrcode");
        checkBoxPreference6.f121290w = false;
        if ((this.f20802h & 2) != 0) {
            checkBoxPreference6.mo6805K(false);
        } else {
            checkBoxPreference6.mo6805K(true);
        }
        CheckBoxPreference checkBoxPreference7 = (CheckBoxPreference) this.f20798d.mo72519a("settings_add_me_by_namecard");
        checkBoxPreference7.f121290w = false;
        if ((this.f20802h & 4) != 0) {
            checkBoxPreference7.mo6805K(false);
        } else {
            checkBoxPreference7.mo6805K(true);
        }
        this.f20798d.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f20798d = getPreferenceScreen();
        this.f20801g = C75592q0.m90786p();
        this.f20800f = C75592q0.m90787q();
        this.f20802h = C75592q0.m90781k();
        initView();
    }

    public void onPause() {
        super.onPause();
        Log.m105918d("MicroMsg.SettingsAddMeUI", "plug:" + this.f20801g + ",status:" + this.f20800f + ",extstatus:" + this.f20802h);
        C86709a0.m107535s().mo121142i().mo119676J(7, Integer.valueOf(this.f20800f));
        C86709a0.m107535s().mo121142i().mo119676J(40, Integer.valueOf(this.f20801g));
        C86709a0.m107535s().mo121142i().mo119676J(147457, Long.valueOf(this.f20802h));
        for (Map.Entry next : this.f20799e.entrySet()) {
            int intValue = ((Integer) next.getKey()).intValue();
            int intValue2 = ((Integer) next.getValue()).intValue();
            C64266br1 br12 = new C64266br1();
            br12.f182324d = intValue;
            br12.f182325e = intValue2;
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(23, br12));
            Log.m105918d("MicroMsg.SettingsAddMeUI", "switch  " + intValue + " " + intValue2);
        }
        this.f20799e.clear();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        Log.m105924i("MicroMsg.SettingsAddMeUI", str + " item has been clicked!");
        int i = 2;
        if (str.equals("settings_find_me_by_QQ")) {
            boolean z = !((CheckBoxPreference) gVar.mo72519a("settings_find_me_by_QQ")).mo6804J();
            mo6224H7(z, 8, 2);
            mo6224H7(z, 16, 3);
            return true;
        } else if (str.equals("settings_find_me_by_weixin")) {
            boolean z2 = !((CheckBoxPreference) gVar.mo72519a("settings_find_me_by_weixin")).mo6804J();
            Log.m105918d("MicroMsg.SettingsAddMeUI", "switch plug change : open = " + z2 + " item value = " + 512 + " functionId = " + 25);
            if (z2) {
                this.f20801g |= 512;
            } else {
                this.f20801g &= -513;
            }
            if (z2) {
                i = 1;
            }
            this.f20799e.put(25, Integer.valueOf(i));
            return true;
        } else if (str.equals("settings_find_me_by_mobile")) {
            mo6224H7(!((CheckBoxPreference) gVar.mo72519a("settings_find_me_by_mobile")).mo6804J(), 512, 8);
            return true;
        } else if (str.equals("settings_find_me_by_google")) {
            mo6224H7(!((CheckBoxPreference) gVar.mo72519a("settings_find_me_by_google")).mo6804J(), 524288, 30);
            return true;
        } else if (str.equals("settings_add_me_by_chatroom")) {
            mo6225I7(!((CheckBoxPreference) gVar.mo72519a("settings_add_me_by_chatroom")).mo6804J(), 1, 38);
            return true;
        } else if (str.equals("settings_add_me_by_qrcode")) {
            mo6225I7(!((CheckBoxPreference) gVar.mo72519a("settings_add_me_by_qrcode")).mo6804J(), 2, 39);
            return true;
        } else if (!str.equals("settings_add_me_by_namecard")) {
            return false;
        } else {
            mo6225I7(!((CheckBoxPreference) gVar.mo72519a("settings_add_me_by_namecard")).mo6804J(), 4, 40);
            return true;
        }
    }
}
