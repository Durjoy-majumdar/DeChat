package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.PreferenceCategory;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.plugin.profile.p088ui.NormalUserFooterPreference;
import com.tencent.p014mm.pluginsdk.p133ui.applet.ContactListExpandPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C97625j3;
import j20.C117292a;
import java.util.List;
import junit.framework.Assert;
import k20.C9556a;
import p740wo.C53193b;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.profile.ui.e1 */
public class C4986e1 implements C67027a {

    /* renamed from: d */
    public Context f20270d;

    /* renamed from: e */
    public C47511g f20271e;

    /* renamed from: f */
    public C72996z1 f20272f;

    /* renamed from: g */
    public boolean f20273g;

    /* renamed from: h */
    public int f20274h;

    /* renamed from: i */
    public boolean f20275i;

    /* renamed from: j */
    public int f20276j;

    /* renamed from: n */
    public String f20277n;

    /* renamed from: o */
    public C44661m1 f20278o;

    /* renamed from: p */
    public ContactListExpandPreference f20279p;

    public C4986e1(Context context) {
        this.f20270d = context;
        this.f20279p = new ContactListExpandPreference(context, 0);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        NormalUserFooterPreference normalUserFooterPreference = (NormalUserFooterPreference) this.f20271e.mo72519a("contact_info_footer_normal");
        if (normalUserFooterPreference == null) {
            return true;
        }
        NormalUserFooterPreference.C70154c cVar = normalUserFooterPreference.f202646Y;
        if (cVar != null) {
            cVar.mo96636j();
        }
        normalUserFooterPreference.f202655f1.removeAll();
        return true;
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        C47511g gVar2 = gVar;
        C72996z1 z1Var2 = z1Var;
        Assert.assertTrue(z1Var2 != null);
        Assert.assertTrue(Util.nullAsNil(z1Var.getUsername()).length() > 0);
        Assert.assertTrue(gVar2 != null);
        this.f20271e = gVar2;
        this.f20272f = z1Var2;
        this.f20273g = z;
        this.f20274h = i;
        this.f20275i = ((Activity) this.f20270d).getIntent().getBooleanExtra("User_Verify", false);
        this.f20276j = ((Activity) this.f20270d).getIntent().getIntExtra("Kdel_from", -1);
        this.f20277n = z1Var.getUsername();
        this.f20278o = ((C44662n1) C97625j3.m125812b().mo105902q()).mo69801SE(this.f20277n);
        this.f20271e.removeAll();
        this.f20271e.mo72527k(new PreferenceSmallCategory(this.f20270d, (AttributeSet) null));
        this.f20279p.mo26273A("roominfo_contact_anchor");
        this.f20271e.mo72527k(this.f20279p);
        this.f20271e.mo72527k(new PreferenceCategory(this.f20270d, (AttributeSet) null));
        NormalUserFooterPreference normalUserFooterPreference = new NormalUserFooterPreference(this.f20270d);
        normalUserFooterPreference.f121271G = C0966R.C0971layout.f7068x6;
        normalUserFooterPreference.mo26273A("contact_info_footer_normal");
        if (normalUserFooterPreference.mo96626a0(this.f20272f, "", this.f20273g, this.f20275i, false, this.f20274h, this.f20276j, false, true, false, 0, "")) {
            this.f20271e.mo72527k(normalUserFooterPreference);
        }
        ContactListExpandPreference contactListExpandPreference = this.f20279p;
        contactListExpandPreference.mo100302L(this.f20271e, contactListExpandPreference.f121285r);
        List<String> k5 = ((C53193b) C86312j.m106911c(C53193b.class)).mo73727k5(this.f20277n);
        ContactListExpandPreference contactListExpandPreference2 = this.f20279p;
        contactListExpandPreference2.mo100304N(false);
        contactListExpandPreference2.mo100305P(false);
        this.f20279p.mo100301K(this.f20277n, k5);
        this.f20279p.mo100307S(new C4983d1(this));
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105918d("MicroMsg.ContactWidgetGroupCard", "handleEvent " + str);
        C72996z1 z1Var = C97625j3.m125812b().mo105907v().get(str);
        if (z1Var != null && ((int) z1Var.f108320R1) > 0) {
            Intent intent = new Intent();
            intent.setClass(this.f20270d, ContactInfoUI.class);
            intent.putExtra("Contact_User", z1Var.getUsername());
            Context context = this.f20270d;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            Context context2 = context;
            C117292a.m165358d(context2, aVar.mo10232b(), "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(context2, "com/tencent/mm/plugin/profile/ui/ContactWidgetGroupCard", "handleEvent", "(Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }
}
