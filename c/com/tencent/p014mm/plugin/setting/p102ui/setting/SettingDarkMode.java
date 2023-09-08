package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85811a5;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.C85930s4;
import com.tencent.p014mm.p136ui.C85985z2;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.SelectPreference;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.xweb.xwalk.plugin.XWalkReaderBasePlugin;
import pj3.C47511g;
import qo3.C77426q;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode */
public class SettingDarkMode extends MMPreference {

    /* renamed from: d */
    public C47511g f248951d;

    /* renamed from: e */
    public boolean f248952e;

    /* renamed from: f */
    public boolean f248953f;

    /* renamed from: g */
    public SelectPreference f248954g;

    /* renamed from: h */
    public SelectPreference f248955h;

    /* renamed from: i */
    public int f248956i = 0;

    /* renamed from: j */
    public int f248957j = 0;

    /* renamed from: n */
    public int f248958n = 0;

    /* renamed from: o */
    public boolean f248959o = false;

    /* renamed from: p */
    public boolean f248960p;

    /* renamed from: q */
    public boolean f248961q;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode$a */
    public class C85418a implements MenuItem.OnMenuItemClickListener {
        public C85418a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingDarkMode.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SettingDarkMode$b */
    public class C85419b implements MenuItem.OnMenuItemClickListener {
        public C85419b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SettingDarkMode settingDarkMode = SettingDarkMode.this;
            boolean z = settingDarkMode.f248961q;
            if ((!z || settingDarkMode.f248953f == z) && (z || settingDarkMode.f248952e == settingDarkMode.f248960p)) {
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_follow_system", settingDarkMode.f248961q);
                C85875k4.m106201p0();
                MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean(XWalkReaderBasePlugin.PARAM_KEY_DARK_MODE, settingDarkMode.f248960p);
                settingDarkMode.mo118771J7();
                settingDarkMode.mo118770I7();
                settingDarkMode.finish();
            } else {
                C77426q qVar = new C77426q(settingDarkMode.getContext());
                qVar.mo107595g(settingDarkMode.getContext().getResources().getString(C0966R.string.imq));
                qVar.mo107589a(true);
                qVar.mo107590b(new C85445j0(settingDarkMode));
                qVar.mo107603o();
            }
            return true;
        }
    }

    /* renamed from: H7 */
    public final void mo118769H7(boolean z) {
        if (!C85875k4.m106146C()) {
            this.f248951d.mo72529n("manual_title", true);
        } else {
            this.f248951d.mo72529n("manual_title", z);
        }
        this.f248951d.mo72529n(XWalkReaderBasePlugin.PARAM_KEY_DARK_MODE, z);
        this.f248951d.mo72529n("normal_mode", z);
    }

    /* renamed from: I7 */
    public final void mo118770I7() {
        if (!this.f248959o) {
            return;
        }
        if (C85875k4.m106149F()) {
            MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_follow_system_need_report", true);
            return;
        }
        if (this.f248961q != this.f248953f) {
            this.f248956i = 4;
        }
        C115669n.INSTANCE.mo160131h(18893, Integer.valueOf(this.f248956i), Integer.valueOf(this.f248957j), 2, Integer.valueOf(this.f248958n), Integer.valueOf(C85875k4.m106146C() ? 1 : 0));
        Log.m105925i(MMPreference.TAG, "dark mode kvReport logID:%s, action:%s, dark:%s, mode:%s", 18893, Integer.valueOf(this.f248956i), Integer.valueOf(this.f248957j), Integer.valueOf(this.f248958n));
    }

    /* renamed from: J7 */
    public final void mo118771J7() {
        if (this.f248961q) {
            if (C85875k4.m106160Q() || C85875k4.m106158O()) {
                C85811a5.m106030g(2);
            }
            if (C85875k4.m106164U() || C85875k4.m106165V()) {
                C85985z2.m106333e(2, getTaskId());
            }
            if (C85875k4.m106169Z() || C85875k4.m106171a0()) {
                C85930s4.m106244d(2);
                return;
            }
            return;
        }
        if (C85875k4.m106160Q() || C85875k4.m106158O()) {
            C85811a5.m106030g(this.f248960p ? 1 : 0);
        }
        if (C85875k4.m106164U() || C85875k4.m106165V()) {
            boolean z = this.f248960p;
            C85985z2.m106333e(z ? 1 : 0, getTaskId());
        }
        if (C85875k4.m106169Z() || C85875k4.m106171a0()) {
            C85930s4.m106244d(this.f248960p ? 1 : 0);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8941bx;
    }

    public void initView() {
        setMMTitle(getString(C0966R.string.irf));
        this.f248951d = getPreferenceScreen();
        if (!C85875k4.m106146C()) {
            MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_follow_system", false);
            C85875k4.m106201p0();
        }
        boolean z = C85875k4.m106211z();
        this.f248952e = z;
        this.f248960p = z;
        MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).putBoolean("dark_mode_follow_system_need_report", false);
        boolean z2 = MultiProcessMMKV.getMMKV(MMApplicationContext.getDefaultPreferencePath()).getBoolean("dark_mode_follow_system", false);
        this.f248953f = z2;
        this.f248961q = z2;
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) this.f248951d.mo72519a("follow_system");
        this.f248954g = (SelectPreference) this.f248951d.mo72519a(XWalkReaderBasePlugin.PARAM_KEY_DARK_MODE);
        this.f248955h = (SelectPreference) this.f248951d.mo72519a("normal_mode");
        if (!C85875k4.m106146C()) {
            this.f248951d.mo72529n("follow_system", true);
            this.f248951d.mo72529n("manual_title", true);
        } else if (checkBoxPreference != null) {
            checkBoxPreference.mo6805K(this.f248953f);
            checkBoxPreference.mo6808N(this.f248953f);
            checkBoxPreference.f121290w = false;
        }
        if (this.f248953f) {
            mo118769H7(true);
        } else {
            mo118769H7(false);
            if (this.f248952e) {
                this.f248954g.f24291M = true;
                this.f248955h.f24291M = false;
            } else {
                this.f248955h.f24291M = true;
                this.f248954g.f24291M = false;
            }
        }
        this.f248951d.notifyDataSetChanged();
        setBackBtn(new C85418a());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C85419b(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 0) {
            return super.onKeyDown(i, keyEvent);
        }
        finish();
        return true;
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        boolean z = true;
        this.f248959o = true;
        if (str.equals("follow_system")) {
            if (((CheckBoxPreference) preference).mo6804J()) {
                this.f248956i = 4;
                this.f248957j = C85875k4.m106145B(getResources()) ? 1 : 0;
                this.f248958n = 1;
                this.f248961q = true;
                mo118769H7(true);
            } else {
                this.f248956i = 4;
                this.f248957j = this.f248952e ? 1 : 0;
                this.f248958n = 2;
                this.f248961q = false;
                mo118769H7(false);
                if (this.f248952e) {
                    this.f248954g.f24291M = true;
                    this.f248955h.f24291M = false;
                } else {
                    this.f248955h.f24291M = true;
                    this.f248954g.f24291M = false;
                }
            }
            this.f248960p = this.f248952e;
            gVar.notifyDataSetChanged();
        } else {
            boolean z2 = this.f248952e;
            if (str.equals(XWalkReaderBasePlugin.PARAM_KEY_DARK_MODE)) {
                this.f248954g.f24291M = true;
                this.f248955h.f24291M = false;
                gVar.notifyDataSetChanged();
            } else if (str.equals("normal_mode")) {
                this.f248954g.f24291M = false;
                this.f248955h.f24291M = true;
                gVar.notifyDataSetChanged();
                z = false;
            } else {
                z = z2;
            }
            this.f248956i = 2;
            this.f248957j = z ? 1 : 0;
            this.f248958n = 2;
            this.f248960p = z;
        }
        return false;
    }
}
