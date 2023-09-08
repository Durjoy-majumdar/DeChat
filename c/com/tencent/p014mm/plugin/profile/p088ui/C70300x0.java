package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.MMWizardActivity;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.plugin.account.bind.p021ui.BindMContactIntroUI;
import com.tencent.p014mm.plugin.profile.p088ui.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C75592q0;
import eb0.C75604z3;
import eb0.C97625j3;
import hg0.C76186t;
import junit.framework.Assert;
import ke3.C88144b;
import nc0.C76850a;
import nj3.C76879j;
import p154fy.C87121j;
import p214om.C11502f;
import p286zl.C79396l;
import pj3.C47511g;
import qo3.C89779i0;
import tc0.C37006i;
import tc0.C77885p;
import wc3.C15141z;

/* renamed from: com.tencent.mm.plugin.profile.ui.x0 */
public class C70300x0 implements C67027a {

    /* renamed from: d */
    public Context f203071d;

    /* renamed from: e */
    public C47511g f203072e;

    /* renamed from: f */
    public boolean f203073f;

    /* renamed from: g */
    public C72996z1 f203074g;

    /* renamed from: h */
    public int f203075h;

    /* renamed from: i */
    public HelperHeaderPreference.C42607a f203076i;

    /* renamed from: j */
    public C89779i0 f203077j = null;

    /* renamed from: n */
    public boolean f203078n = false;

    /* renamed from: com.tencent.mm.plugin.profile.ui.x0$a */
    public class C70301a implements DialogInterface.OnClickListener {
        public C70301a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            C70300x0 x0Var = C70300x0.this;
            x0Var.f203078n = false;
            Context context = x0Var.f203071d;
            x0Var.f203077j = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), x0Var.f203071d.getString(C0966R.string.a4d), true, true, new C70304y0(x0Var));
            C75604z3.m90836h("fmessage", new C70309z0(x0Var));
            ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot("fmessage", 15);
            ((C44660i2) C97625j3.m125812b().mo105908w()).mo69763f("fmessage");
        }
    }

    public C70300x0(Context context) {
        this.f203071d = context;
        this.f203076i = new C42679t1(context);
        this.f203075h = -1;
    }

    /* renamed from: a */
    public final void mo96803a(boolean z, int i, int i2) {
        Log.m105918d("MicroMsg.ContactWidgetFMessage", "switch change : open = " + z + " item value = " + i + " functionId = " + i2);
        if (z) {
            this.f203075h = i | this.f203075h;
        } else {
            this.f203075h = (~i) & this.f203075h;
        }
        C97625j3.m125812b().mo105906u().mo119676J(7, Integer.valueOf(this.f203075h));
        ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C37006i(i2, z ? 1 : 2));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        HelperHeaderPreference.C42607a aVar;
        ((C11502f) C86312j.m106911c(C11502f.class)).mo11461Sr().mo93136Bk();
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f203072e.mo72519a("contact_info_header_helper");
        if (helperHeaderPreference == null || (aVar = helperHeaderPreference.f115333P) == null) {
            return true;
        }
        aVar.onDetach();
        return true;
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        boolean z2 = false;
        Assert.assertTrue(gVar != null);
        Assert.assertTrue(z1Var != null);
        Assert.assertTrue(C72996z1.m85830a5(z1Var.getUsername()));
        this.f203072e = gVar;
        this.f203073f = z;
        this.f203074g = z1Var;
        if (this.f203075h == -1) {
            this.f203075h = C75592q0.m90787q();
        }
        gVar.mo72520b(C0966R.xml.f8869v);
        CheckBoxPreference checkBoxPreference = (CheckBoxPreference) gVar.mo72519a("contact_info_recommend_qqfriends_to_me");
        CheckBoxPreference checkBoxPreference2 = (CheckBoxPreference) gVar.mo72519a("contact_info_recommend_mobilefriends_to_me");
        CheckBoxPreference checkBoxPreference3 = (CheckBoxPreference) gVar.mo72519a("contact_info_recommend_fbfriends_to_me");
        checkBoxPreference2.mo6805K(!((256 & this.f203075h) != 0));
        checkBoxPreference.mo6805K(!((128 & this.f203075h) != 0));
        checkBoxPreference3.mo6805K((C75592q0.m90786p() & 4) != 0);
        ((HelperHeaderPreference) gVar.mo72519a("contact_info_header_helper")).mo66737J(z1Var, this.f203076i);
        if (Util.nullAsNil((Integer) C97625j3.m125812b().mo105906u().mo119683d(9)) != 0) {
            gVar.mo72526j(gVar.mo72519a("contact_info_bind_qq_entry"));
            gVar.mo72526j(gVar.mo72519a("contact_info_bind_qq_entry_tip"));
        } else {
            gVar.mo72526j(checkBoxPreference);
            if (!C76850a.m92637i()) {
                gVar.mo72526j(gVar.mo72519a("contact_info_bind_qq_entry"));
                gVar.mo72526j(gVar.mo72519a("contact_info_bind_qq_entry_tip"));
            }
        }
        if (C76186t.m91534b() == C79396l.SUCC) {
            gVar.mo72526j(gVar.mo72519a("contact_info_bind_mobile_entry"));
            gVar.mo72526j(gVar.mo72519a("contact_info_bind_mobile_entry_tip"));
        } else {
            gVar.mo72526j(checkBoxPreference2);
            gVar.mo72519a("contact_info_bind_mobile_entry").mo7740D(C0966R.string.iqw);
        }
        if ((C75592q0.m90785o() & 8192) == 0) {
            z2 = true;
        }
        if (z2) {
            boolean v = C75592q0.m90792v();
            gVar.mo72526j(checkBoxPreference3);
            if (!v) {
                gVar.mo72519a("contact_info_bind_fb_entry").mo7740D(C0966R.string.iqw);
            } else {
                gVar.mo72519a("contact_info_bind_fb_entry").mo7740D(C0966R.string.bm7);
            }
        } else {
            gVar.mo72526j(gVar.mo72519a("contact_info_bind_fb_entry"));
            gVar.mo72526j(gVar.mo72519a("contact_info_bind_fb_entry_tip"));
            gVar.mo72526j(checkBoxPreference3);
        }
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Class cls = C11502f.class;
        Log.m105918d("MicroMsg.ContactWidgetFMessage", "handlerEvent : key = " + str);
        if (Util.nullAsNil(str).length() <= 0) {
            return false;
        }
        if (str.equals("contact_info_recommend_qqfriends_to_me")) {
            mo96803a(!((CheckBoxPreference) this.f203072e.mo72519a("contact_info_recommend_qqfriends_to_me")).mo6804J(), 128, 6);
            return true;
        } else if (str.equals("contact_info_recommend_mobilefriends_to_me")) {
            mo96803a(!((CheckBoxPreference) this.f203072e.mo72519a("contact_info_recommend_mobilefriends_to_me")).mo6804J(), 256, 7);
            return true;
        } else if (str.equals("contact_info_recommend_fbfriends_to_me")) {
            boolean J = ((CheckBoxPreference) this.f203072e.mo72519a("contact_info_recommend_fbfriends_to_me")).mo6804J();
            Log.m105918d("MicroMsg.ContactWidgetFMessage", "switch change : open = " + J + " item value = " + 4 + " functionId = " + 18);
            int p = C75592q0.m90786p();
            C97625j3.m125812b().mo105906u().mo119676J(40, Integer.valueOf(J ? p | 4 : p & -5));
            ((C77885p) C97625j3.m125812b().mo105876B()).mo107993q(new C37006i(18, J ? 1 : 2));
            return true;
        } else if (str.equals("contact_info_view_message")) {
            Intent intent = new Intent();
            if (this.f203073f) {
                intent.putExtra("Chat_User", this.f203074g.getUsername());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                ((Activity) this.f203071d).setResult(-1, intent);
                ((Activity) this.f203071d).finish();
            } else {
                intent.putExtra("Chat_User", this.f203074g.getUsername());
                intent.putExtra("Chat_Mode", 1);
                intent.addFlags(67108864);
                ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93173f(intent, this.f203071d);
                ((Activity) this.f203071d).finish();
            }
            return true;
        } else if (str.equals("contact_info_bind_mobile_entry")) {
            C15141z yM = ((C11502f) C86312j.m106911c(cls)).mo11462yM();
            Intent intent2 = new Intent();
            Context context = this.f203071d;
            ((C67654r1) yM).getClass();
            if (context != null) {
                intent2.setClass(context, BindMContactIntroUI.class);
                MMWizardActivity.m7017L7(context, intent2);
            }
            return true;
        } else if (str.equals("contact_info_bind_qq_entry")) {
            ((C67654r1) ((C11502f) C86312j.m106911c(cls)).mo11462yM()).mo93172e(new Intent(), this.f203071d);
            return true;
        } else if (str.equals("contact_info_bind_fb_entry")) {
            C88144b.m109791i(this.f203071d, "account", ".ui.FacebookAuthUI", new Intent(), (Bundle) null);
            return true;
        } else if (str.equals("contact_info_fmessage_clear_data")) {
            Context context2 = this.f203071d;
            C76879j.m92707A(context2, context2.getString(C0966R.string.blf), "", this.f203071d.getString(C0966R.string.f7930wk), this.f203071d.getString(C0966R.string.f7926wf), new C70301a(), (DialogInterface.OnClickListener) null);
            return true;
        } else {
            Log.m105920e("MicroMsg.ContactWidgetFMessage", "handleEvent : unExpected key = " + str);
            return false;
        }
    }
}
