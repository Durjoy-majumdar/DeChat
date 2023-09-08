package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import jr2.C99019x;
import ke3.C88144b;
import lc3.C10485b;
import os2.C100399d0;
import pj3.C47511g;
import tc0.C77885p;
import te3.a94;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutTimelineUI */
public class SettingsAboutTimelineUI extends MMPreference {

    /* renamed from: d */
    public String f205668d = "";

    /* renamed from: e */
    public C47511g f205669e;

    /* renamed from: f */
    public boolean f205670f = false;

    /* renamed from: g */
    public boolean f205671g = false;

    /* renamed from: h */
    public boolean f205672h = true;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingsAboutTimelineUI$a */
    public class C71058a implements MenuItem.OnMenuItemClickListener {
        public C71058a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingsAboutTimelineUI.this.hideVKB();
            SettingsAboutTimelineUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8944c0;
    }

    public void initView() {
        this.f205669e = getPreferenceScreen();
        setMMTitle((int) C0966R.string.iwj);
        setBackBtn(new C71058a());
        this.f205668d = C75592q0.m90789s();
        boolean z = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("ForbidSnsStranger", 0) == 0;
        this.f205672h = z;
        Log.m105925i("MicroMsg.SettingsAboutTimelineUI", "showStranger:%s", Boolean.valueOf(z));
        if (this.f205672h) {
            this.f205669e.mo72529n("timeline_stranger_show", false);
        } else {
            this.f205669e.mo72529n("timeline_stranger_show", true);
        }
        this.f205669e.notifyDataSetChanged();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        a94 bD;
        super.onDestroy();
        if (this.f205670f && C99019x.m128971c() != null && (bD = ((C100399d0) C99019x.m128971c()).mo139783bD(this.f205668d, this.f205671g)) != null) {
            Log.m105918d("MicroMsg.SettingsAboutTimelineUI", "userinfo " + bD.toString());
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(51, bD));
        }
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (str.equals("timline_outside_permiss")) {
            Intent intent = new Intent();
            intent.putExtra("k_sns_tag_id", 4);
            intent.putExtra("k_sns_from_settings_about_sns", 1);
            C88144b.m109791i(this, "sns", ".ui.SnsBlackDetailUI", intent, (Bundle) null);
        }
        if (str.equals("timeline_black_permiss")) {
            Intent intent2 = new Intent();
            intent2.putExtra("k_sns_tag_id", 5);
            intent2.putExtra("k_sns_from_settings_about_sns", 2);
            C88144b.m109791i(this, "sns", ".ui.SnsTagDetailUI", intent2, (Bundle) null);
        }
        if (!str.equals("timeline_stranger_show")) {
            return false;
        }
        this.f205671g = !this.f205671g;
        if (C99019x.m128971c() != null) {
            ((C100399d0) C99019x.m128971c()).mo139793vP(this.f205668d, this.f205671g);
        }
        this.f205670f = true;
        return false;
    }

    public void onResume() {
        CheckBoxPreference checkBoxPreference;
        super.onResume();
        a94 a94 = new a94();
        if (C99019x.m128971c() != null) {
            a94 = ((C100399d0) C99019x.m128971c()).mo139779SE(this.f205668d);
        }
        if (a94 == null) {
            Log.m105920e("MicroMsg.SettingsAboutTimelineUI", "userinfo is null");
        } else {
            int i = a94.f130395g;
            if (this.f205672h && (checkBoxPreference = (CheckBoxPreference) this.f205669e.mo72519a("timeline_stranger_show")) != null) {
                this.f205671g = (i & 1) > 0;
                SharedPreferences sharedPreferences = getSharedPreferences(getPackageName() + "_preferences", 0);
                if (!this.f205671g) {
                    checkBoxPreference.mo6805K(true);
                    sharedPreferences.edit().putBoolean("timeline_stranger_show", true).commit();
                } else {
                    checkBoxPreference.mo6805K(false);
                    sharedPreferences.edit().putBoolean("timeline_stranger_show", false).commit();
                }
            }
        }
        this.f205669e.notifyDataSetChanged();
    }
}
