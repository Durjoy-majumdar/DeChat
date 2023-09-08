package com.tencent.p014mm.plugin.sport.p107ui;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.MMPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.contact.C74560s1;
import com.tencent.p014mm.pluginsdk.p133ui.applet.C72741a;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.pluginsdk.platformtools.ContactBlackListHelper;
import com.tencent.p014mm.sdk.platformtools.Util;
import eb0.C45628s0;
import eb0.C97625j3;
import java.util.ArrayList;
import java.util.List;
import ke3.C88144b;
import p609mp.C76802a;
import p609mp.C76803c;
import pj3.C47511g;
import tv2.C14096e;
import uv2.C14386a;

/* renamed from: com.tencent.mm.plugin.sport.ui.SportBlackListUI */
public class SportBlackListUI extends MMPreference {

    /* renamed from: d */
    public ContactListExpandPreference f21271d;

    /* renamed from: e */
    public List<String> f21272e;

    /* renamed from: f */
    public ContactListExpandPreference.C72740a f21273f = new C5488a();

    /* renamed from: com.tencent.mm.plugin.sport.ui.SportBlackListUI$a */
    public class C5488a implements ContactListExpandPreference.C72740a {
        public C5488a() {
        }

        /* renamed from: a */
        public void mo5953a(ViewGroup viewGroup, View view, int i) {
            String c = C76802a.m92581c(SportBlackListUI.this.f21271d, i);
            if (!Util.isNullOrNil(c)) {
                ((ArrayList) SportBlackListUI.this.f21272e).remove(c);
                SportBlackListUI sportBlackListUI = SportBlackListUI.this;
                sportBlackListUI.f21271d.mo100301K((String) null, sportBlackListUI.f21272e);
                C76803c cVar = SportBlackListUI.this.f21271d.f211662K;
                if (cVar != null) {
                    ((C72741a) cVar).f211670g.mo108547f();
                }
                C45628s0.m50811y0(C97625j3.m125812b().mo105907v().get(c));
                C14096e.m13447a(40);
            }
        }

        /* renamed from: b */
        public void mo5954b(ViewGroup viewGroup, View view, int i) {
        }

        /* renamed from: c */
        public void mo5955c(ViewGroup viewGroup, View view, int i) {
            SportBlackListUI sportBlackListUI = SportBlackListUI.this;
            String listToString = Util.listToString(sportBlackListUI.f21272e, ",");
            Intent intent = new Intent();
            intent.putExtra("titile", sportBlackListUI.getString(C0966R.string.f7496hv));
            intent.putExtra("list_type", 1);
            C74560s1.m89276e();
            intent.putExtra("list_attr", C74560s1.m89278g(C74560s1.f219162c, 1024));
            intent.putExtra("always_select_contact", listToString);
            C88144b.m109802t(sportBlackListUI, ".ui.contact.SelectContactUI", intent, 0);
        }

        /* renamed from: d */
        public void mo5956d(ViewGroup viewGroup, View view, int i) {
            SportBlackListUI.this.f21271d.mo100300J();
        }

        /* renamed from: e */
        public void mo5957e(ViewGroup viewGroup, View view, int i) {
            String c = C76802a.m92581c(SportBlackListUI.this.f21271d, i);
            Intent intent = new Intent();
            intent.putExtra("Contact_User", c);
            C88144b.m109791i(SportBlackListUI.this, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    public int getResourceId() {
        return C0966R.xml.f8977cy;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringsToList;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && intent != null) {
            String stringExtra = intent.getStringExtra("Select_Contact");
            if (!Util.isNullOrNil(stringExtra) && (stringsToList = Util.stringsToList(stringExtra.split(","))) != null) {
                ((ArrayList) this.f21272e).addAll(stringsToList);
                this.f21271d.mo100301K((String) null, this.f21272e);
                C76803c cVar = this.f21271d.f211662K;
                if (cVar != null) {
                    ((C72741a) cVar).f211670g.mo108547f();
                }
                for (String str : stringsToList) {
                    C45628s0.m50793p0(C97625j3.m125812b().mo105907v().get(str));
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C14096e.m13447a(39);
        List<String> a = ContactBlackListHelper.m6942a();
        if (this.f21272e == null) {
            this.f21272e = new ArrayList();
        }
        Cursor b4 = C97625j3.m125812b().mo105907v().mo69687b4("@werun.black.android", "", (List<String>) null);
        while (b4.moveToNext()) {
            String string = b4.getString(b4.getColumnIndex("username"));
            if (!((ArrayList) a).contains(string)) {
                ((ArrayList) this.f21272e).add(string);
            }
        }
        b4.close();
        ContactListExpandPreference contactListExpandPreference = (ContactListExpandPreference) getPreferenceScreen().mo72519a("black_contact_list_pref");
        this.f21271d = contactListExpandPreference;
        contactListExpandPreference.mo100302L(getPreferenceScreen(), this.f21271d.f121285r);
        ContactListExpandPreference contactListExpandPreference2 = this.f21271d;
        contactListExpandPreference2.mo100304N(true);
        contactListExpandPreference2.mo100305P(true);
        this.f21271d.mo100301K((String) null, this.f21272e);
        this.f21271d.mo100307S(this.f21273f);
        this.f21271d.mo7740D(C0966R.string.cgb);
        setMMTitle(getString(C0966R.string.ceq));
        setBackBtn(new C14386a(this));
    }

    public boolean onPreferenceTreeClick(C47511g gVar, Preference preference) {
        return false;
    }
}
