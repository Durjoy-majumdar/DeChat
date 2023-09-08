package com.tencent.p014mm.plugin.setting.p102ui.setting;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivityController;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.SelectPreference;
import com.tencent.p014mm.plugin.report.service.C5139t;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C75590o4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import pj3.C47511g;
import tc0.C77885p;

/* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelectSexUI */
public class SelectSexUI extends MMPreference {

    /* renamed from: h */
    public static final /* synthetic */ int f20745h = 0;

    /* renamed from: d */
    public C47511g f20746d;

    /* renamed from: e */
    public SelectPreference f20747e;

    /* renamed from: f */
    public SelectPreference f20748f;

    /* renamed from: g */
    public int f20749g = -1;

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelectSexUI$a */
    public class C5243a implements MenuItem.OnMenuItemClickListener {
        public C5243a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectSexUI.this.hideVKB();
            SelectSexUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.setting.ui.setting.SelectSexUI$b */
    public class C5244b implements MenuItem.OnMenuItemClickListener {
        public C5244b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SelectSexUI selectSexUI = SelectSexUI.this;
            int i = SelectSexUI.f20745h;
            selectSexUI.getClass();
            C75590o4 a = C75590o4.m90740a();
            int i2 = selectSexUI.f20749g;
            if (i2 != -1) {
                a.f222065b = i2;
            }
            ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(1, C75590o4.m90742e(a)));
            C5139t.m5183e(4, 4);
            SelectSexUI.this.finish();
            return true;
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8939bv;
    }

    public void initView() {
        C47511g preferenceScreen = getPreferenceScreen();
        this.f20746d = preferenceScreen;
        this.f20747e = (SelectPreference) preferenceScreen.mo72519a("select_male");
        this.f20748f = (SelectPreference) this.f20746d.mo72519a("select_female");
        int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(12290, (Object) null), 0);
        if (nullAs == 1) {
            this.f20747e.f24291M = true;
        } else if (nullAs == 2) {
            this.f20748f.f24291M = true;
        }
        setMMTitle((int) C0966R.string.f361260ik2);
        setBackBtn(new C5243a());
        addTextOptionMenu(0, getString(C0966R.string.f8014z_), new C5244b(), (View.OnLongClickListener) null, MMActivityController.C73075r.GREEN);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        String str = preference.f121285r;
        if (str.equals("select_male")) {
            this.f20749g = 1;
            this.f20747e.f24291M = true;
            this.f20748f.f24291M = false;
            gVar.notifyDataSetChanged();
        } else if (str.equals("select_female")) {
            this.f20749g = 2;
            this.f20747e.f24291M = false;
            this.f20748f.f24291M = true;
            gVar.notifyDataSetChanged();
        }
        return false;
    }
}
