package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.preference.KeyValuePreference;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import df2.C75381g;
import di3.C86312j;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import junit.framework.Assert;
import md3.C47001b;
import p214om.C11502f;
import p629ny.C76979h;
import pj3.C47511g;

/* renamed from: com.tencent.mm.plugin.profile.ui.w0 */
public class C70297w0 implements C67027a {

    /* renamed from: d */
    public final Context f203064d;

    /* renamed from: e */
    public C72996z1 f203065e;

    /* renamed from: f */
    public C47511g f203066f;

    /* renamed from: g */
    public C75381g f203067g;

    /* renamed from: com.tencent.mm.plugin.profile.ui.w0$a */
    public class C70298a implements View.OnClickListener {
        public C70298a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/profile/ui/ContactWidgetBottleContact$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C70297w0.this.f203067g.mo105724h();
            C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/ContactWidgetBottleContact$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public C70297w0(Context context) {
        this.f203064d = context;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        C47511g gVar = this.f203066f;
        if (gVar == null) {
            return true;
        }
        NormalProfileHeaderPreference normalProfileHeaderPreference = (NormalProfileHeaderPreference) gVar.mo72519a("contact_info_header_normal");
        if (normalProfileHeaderPreference != null) {
            normalProfileHeaderPreference.mo96615N();
        }
        C75381g gVar2 = this.f203067g;
        if (gVar2 != null) {
            ((C47001b) C86709a0.m107533q(C47001b.class)).mo71279fN(gVar2);
        }
        return true;
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        Assert.assertTrue(z1Var != null);
        Assert.assertTrue(Util.nullAsNil(z1Var.getUsername()).length() > 0);
        Assert.assertTrue(gVar != null);
        this.f203065e = z1Var;
        ((MMActivity) this.f203064d).getIntent().putExtra("Contact_Scene", 25);
        if (this.f203067g == null) {
            this.f203067g = new C75381g((MMActivity) this.f203064d, z1Var);
        }
        onDetach();
        this.f203066f = gVar;
        gVar.removeAll();
        gVar.mo72520b(C0966R.xml.f8865r);
        NormalProfileHeaderPreference normalProfileHeaderPreference = (NormalProfileHeaderPreference) gVar.mo72519a("contact_info_header_normal");
        if (normalProfileHeaderPreference != null) {
            normalProfileHeaderPreference.mo96614M(gVar);
            normalProfileHeaderPreference.mo96611I(z1Var, 25, z, (C75381g) null);
        }
        KeyValuePreference keyValuePreference = (KeyValuePreference) gVar.mo72519a("contact_info_signature");
        if (z1Var.getSignature() == null || z1Var.getSignature().trim().equals("")) {
            gVar.mo72526j(keyValuePreference);
        } else if (keyValuePreference != null) {
            keyValuePreference.mo69915L(false);
            keyValuePreference.mo69924H(this.f203064d.getString(C0966R.string.bqz));
            keyValuePreference.mo7741E(((C76979h) C86312j.m106911c(C76979h.class)).mo107057T1(this.f203064d, z1Var.getSignature()));
            keyValuePreference.mo69912I(false);
            keyValuePreference.mo69921C(8);
        }
        ((MultiButtonPreference) gVar.mo72519a("contact_profile_multi_button")).mo5915I(this.f203064d.getString(C0966R.string.anx), new C70298a());
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        if (!str.equals("contact_profile_say_hi")) {
            return true;
        }
        Intent intent = new Intent();
        intent.putExtra("Contact_User", this.f203065e.getUsername());
        intent.putExtra("Contact_Scene", 25);
        intent.putExtra("AntispamTicket", this.f203065e.f149527Z0);
        ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93187t(intent, this.f203064d);
        return true;
    }
}
