package com.tencent.p014mm.plugin.nearby.p083ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.base.preference.ChoicePreference;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.sdk.platformtools.Util;
import d62.C75339i;
import di3.C86312j;
import eb0.C75590o4;
import f40.C86709a0;
import f62.C75700k0;
import g62.C32330n;
import ke3.C88144b;
import nj3.C76879j;
import p214om.C11502f;
import p629ny.C76979h;
import pj3.C47511g;
import tc0.C77885p;
import uc3.C78146a;

/* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI */
public class NearbyPersonalInfoUI extends MMPreference {

    /* renamed from: d */
    public C47511g f201676d;

    /* renamed from: e */
    public int f201677e = -1;

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI$a */
    public class C69899a implements MenuItem.OnMenuItemClickListener {
        public C69899a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            NearbyPersonalInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI$b */
    public class C69900b implements MenuItem.OnMenuItemClickListener {
        public C69900b() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (NearbyPersonalInfoUI.this.f201677e != -1) {
                C75590o4 a = C75590o4.m90740a();
                a.f222065b = NearbyPersonalInfoUI.this.f201677e;
                C75590o4.m90742e(a);
            }
            C75590o4 b = C75590o4.m90741b();
            if (b == null) {
                NearbyPersonalInfoUI nearbyPersonalInfoUI = NearbyPersonalInfoUI.this;
                C76879j.m92742m(nearbyPersonalInfoUI.getContext(), C0966R.string.h6u, C0966R.string.a3h, new C69934j(nearbyPersonalInfoUI));
            } else {
                String nullAsNil = Util.nullAsNil(b.mo105937d());
                Util.nullAsNil(b.mo105936c());
                int i = b.f222065b;
                if (Util.isNullOrNil(nullAsNil) || i == 0) {
                    NearbyPersonalInfoUI nearbyPersonalInfoUI2 = NearbyPersonalInfoUI.this;
                    C76879j.m92742m(nearbyPersonalInfoUI2.getContext(), C0966R.string.h6u, C0966R.string.a3h, new C69934j(nearbyPersonalInfoUI2));
                } else {
                    C78146a.m94352a(NearbyPersonalInfoUI.this.getContext(), new Intent());
                    C75590o4 a2 = C75590o4.m90740a();
                    if (i != -1) {
                        a2.f222065b = i;
                    }
                    ((C77885p) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96100XW()).mo107993q(new C32330n(1, C75590o4.m90742e(a2)));
                    NearbyPersonalInfoUI.this.finish();
                }
            }
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI$c */
    public class C69901c implements Preference.C6763a {
        public C69901c() {
        }

        /* renamed from: a */
        public boolean mo7744a(Preference preference, Object obj) {
            String str = (String) obj;
            if ("male".equalsIgnoreCase(str)) {
                NearbyPersonalInfoUI.this.f201677e = 1;
                return false;
            } else if (!"female".equalsIgnoreCase(str)) {
                return false;
            } else {
                NearbyPersonalInfoUI.this.f201677e = 2;
                return false;
            }
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8919bd;
    }

    public void initView() {
        setMMTitle((int) C0966R.string.h6t);
        C47511g preferenceScreen = getPreferenceScreen();
        this.f201676d = preferenceScreen;
        ((KeyValuePreference) preferenceScreen.mo72519a("settings_signature")).f121240L = false;
        setBackBtn(new C69899a());
        addTextOptionMenu(0, getString(C0966R.string.f360089a13), new C69900b());
        ((ChoicePreference) this.f201676d.mo72519a("settings_sex")).f215035Q = new C69901c();
        int nullAs = Util.nullAs((Integer) C86709a0.m107535s().mo121142i().mo119684e(12290, (Object) null), 0);
        ChoicePreference choicePreference = (ChoicePreference) this.f201676d.mo72519a("settings_sex");
        choicePreference.mo69924H(Html.fromHtml(getString(C0966R.string.iyk) + "<font color='red'>*</font>"));
        if (nullAs == 1) {
            choicePreference.mo101919I("male");
        } else if (nullAs != 2) {
            choicePreference.mo101919I("unknown");
        } else {
            choicePreference.mo101919I("female");
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initView();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        Class cls = C11502f.class;
        String str = preference.f121285r;
        if ("settings_district".equals(str)) {
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).getClass();
            C88144b.m109801s(this, ".ui.tools.MultiStageCitySelectUI", new Intent(), (Bundle) null);
            return true;
        } else if (!"settings_signature".equals(str)) {
            return false;
        } else {
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).getClass();
            C88144b.m109791i(this, "setting", ".ui.setting.EditSignatureUI", new Intent(), (Bundle) null);
            overridePendingTransition(C0966R.C0968anim.f2471dv, C0966R.C0968anim.f2470du);
            return true;
        }
    }

    public void onResume() {
        C75590o4 a = C75590o4.m90740a();
        String d = a.mo105937d();
        String c = a.mo105936c();
        Preference a2 = this.f201676d.mo72519a("settings_district");
        a2.mo7741E(((C75339i) C86312j.m106911c(C75339i.class)).K90(d) + " " + c);
        StringBuilder sb = new StringBuilder();
        sb.append(getString(C0966R.string.irg));
        sb.append("<font color='red'>*</font>");
        a2.mo69924H(Html.fromHtml(sb.toString()));
        Preference a3 = this.f201676d.mo72519a("settings_signature");
        String nullAsNil = Util.nullAsNil((String) C86709a0.m107535s().mo121142i().mo119684e(12291, (Object) null));
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        if (nullAsNil.length() <= 0) {
            nullAsNil = getString(C0966R.string.iyt);
        }
        a3.mo7741E(hVar.mo107057T1(this, nullAsNil));
        super.onResume();
    }
}
