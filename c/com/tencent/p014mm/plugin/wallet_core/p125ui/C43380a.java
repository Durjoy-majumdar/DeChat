package com.tencent.p014mm.plugin.wallet_core.p125ui;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.http.HttpWrapperBase;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import java.util.LinkedList;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C28611c;
import p011cm.C39989b;
import p196ln.C76708i;
import p227rn.C48052u;
import p227rn.C48054w;
import p910lj.C76701a;
import pj3.C47511g;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.a */
public class C43380a implements C67027a, C11385n {

    /* renamed from: n */
    public static final String f117314n = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/product/wechatpay_app.html?scene_id=kf594");

    /* renamed from: d */
    public Context f117315d;

    /* renamed from: e */
    public C72996z1 f117316e;

    /* renamed from: f */
    public C47511g f117317f;

    /* renamed from: g */
    public int f117318g;

    /* renamed from: h */
    public CheckBoxPreference f117319h;

    /* renamed from: i */
    public CheckBoxPreference f117320i;

    /* renamed from: j */
    public C89779i0 f117321j;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.a$a */
    public class C43381a implements DialogInterface.OnClickListener {
        public C43381a(C43380a aVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101089TE("gh_e087bb5b95e6");
        }
    }

    public C43380a(Context context) {
        this.f117315d = context;
    }

    /* renamed from: a */
    public final void mo67578a() {
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f117317f.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f117316e.getUsername(), this.f117316e.mo62898f(), this.f117315d.getString(C0966R.string.bto));
        if (this.f117316e.mo62927s3()) {
            helperHeaderPreference.mo7601J(1);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_install", true);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_uninstall", false);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_go_to", false);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_top", false);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_not_disturb", false);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_help", false);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_clear_data", false);
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69755a0(this.f117316e.getUsername())) {
                this.f117319h.mo6805K(true);
            } else {
                this.f117319h.mo6805K(false);
            }
            if (C45628s0.m50746K(this.f117316e)) {
                this.f117320i.mo6805K(true);
            } else {
                this.f117320i.mo6805K(false);
            }
        } else {
            helperHeaderPreference.mo7601J(0);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_install", false);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_uninstall", true);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_go_to", true);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_top", true);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_not_disturb", true);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_help", true);
            this.f117317f.mo72529n("contact_info_wxpay_business_collection_clear_data", true);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C75700k0.class;
        Class cls2 = C48054w.class;
        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        if (yVar instanceof C28611c) {
            C86709a0.m107524d().mo123470p(30, this);
            if (i == 0 && i2 == 0) {
                String T0 = ((C28611c) yVar).mo56091T0();
                Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "bind fitness contact %s success", T0);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_e087bb5b95e6");
                if (z1Var == null || Util.isNullOrNil(T0)) {
                    Log.m105920e("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "respUsername == " + T0 + ", contact = " + z1Var);
                } else {
                    C48052u uVar = null;
                    if (C72996z1.m85796D5(z1Var.getUsername())) {
                        String nullAsNil = Util.nullAsNil(z1Var.getUsername());
                        C48052u v = ((C48054w) C86312j.m106911c(cls2)).mo72625v(nullAsNil);
                        if (v != null) {
                            v.setUsername(T0);
                        }
                        ((C48054w) C86312j.m106911c(cls2)).mo72623d0(nullAsNil);
                        z1Var.mo62874S2(nullAsNil);
                        uVar = v;
                    }
                    z1Var.setUsername(T0);
                    if (((int) z1Var.f108320R1) == 0) {
                        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var);
                    }
                    if (((int) z1Var.f108320R1) <= 0) {
                        Log.m105920e("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "addContact : insert contact failed");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
                        if (uVar != null) {
                            ((C48054w) C86312j.m106911c(cls2)).mo72621Uu(uVar);
                        } else {
                            Class cls3 = C76708i.class;
                            C48052u v2 = ((C48054w) C86312j.m106911c(cls2)).mo72625v(z1Var2.getUsername());
                            if (v2 == null || v2.mo72809G1()) {
                                Log.m105918d("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls3)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5()) {
                                Log.m105919d("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "update contact, last check time=%d", Integer.valueOf(z1Var2.f149509Q0));
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls3)).mo106823Jc(z1Var2.getUsername());
                            }
                        }
                    }
                }
                C48052u v3 = ((C48054w) C86312j.m106911c(cls2)).mo72625v(z1Var.getUsername());
                if (v3 != null) {
                    ((C48054w) C86312j.m106911c(cls2)).mo72620Nf(v3);
                }
                C86709a0.m107535s().mo121142i().mo119676J(327825, Boolean.TRUE);
            } else {
                Log.m105921e("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
                }
            }
            C89779i0 i0Var = this.f117321j;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            mo67578a();
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        this.f117317f = gVar;
        this.f117316e = z1Var;
        this.f117318g = i;
        gVar.mo72520b(C0966R.xml.f8882aa);
        this.f117319h = (CheckBoxPreference) gVar.mo72519a("contact_info_wxpay_business_collection_top");
        this.f117320i = (CheckBoxPreference) gVar.mo72519a("contact_info_wxpay_business_collection_not_disturb");
        mo67578a();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayBussinessCollection", "handleEvent key:%s", str);
        if (Util.isEqual("contact_info_wxpay_business_collection_go_to", str)) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", this.f117316e.getUsername());
            intent.putExtra("finish_direct", true);
            C88144b.m109801s(this.f117315d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        } else if (Util.isEqual("contact_info_wxpay_business_collection_top", str)) {
            if (this.f117319h.mo6804J()) {
                C45628s0.m50787m0(this.f117316e.getUsername(), true, true);
            } else {
                C45628s0.m50803u0(this.f117316e.getUsername(), true);
            }
        } else if (Util.isEqual("contact_info_wxpay_business_collection_not_disturb", str)) {
            if (this.f117320i.mo6804J()) {
                C45628s0.m50779i0(this.f117316e, true);
            } else {
                C45628s0.m50797r0(this.f117316e, true);
            }
        } else if (Util.isEqual("contact_info_wxpay_business_collection_help", str)) {
            C75228t.m90219L(this.f117315d, f117314n, true);
        } else if (Util.isEqual("contact_info_wxpay_business_collection_clear_data", str)) {
            Context context = this.f117315d;
            C76879j.m92707A(context, context.getString(C0966R.string.blf), "", this.f117315d.getString(C0966R.string.f7930wk), this.f117315d.getString(C0966R.string.f7926wf), new C43381a(this), (DialogInterface.OnClickListener) null);
        } else if (Util.isEqual("contact_info_wxpay_business_collection_install", str)) {
            Context context2 = this.f117315d;
            C89779i0 Q = C76879j.m92723Q(context2, context2.getString(C0966R.string.a3h), this.f117315d.getString(C0966R.string.iww), true, true, (DialogInterface.OnCancelListener) null);
            this.f117321j = Q;
            Q.show();
            C86709a0.m107524d().mo123455a(30, this);
            LinkedList linkedList = new LinkedList();
            linkedList.add("gh_e087bb5b95e6");
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(Integer.valueOf(this.f117318g));
            C86709a0.m107524d().mo123460f((C117747y) ((C39989b) C86312j.m106911c(C39989b.class)).Ya0(1, linkedList, linkedList2, "", ""));
        } else if (Util.isEqual("contact_info_wxpay_business_collection_uninstall", str)) {
            Context context3 = this.f117315d;
            C76879j.m92707A(context3, context3.getString(C0966R.string.iwz), "", this.f117315d.getString(C0966R.string.f7930wk), this.f117315d.getString(C0966R.string.f7926wf), new C43382b(this), (DialogInterface.OnClickListener) null);
        }
        return false;
    }
}
