package com.tencent.p014mm.plugin.wallet_core.p125ui;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WeChatPayPluginReportStruct;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
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
import di0.C86300q;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
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
import te3.C49009cj2;
import te3.C50456mv3;
import te3.C50944qc3;
import te3.te4;
import te3.ue4;
import te3.zf4;
import v53.C52770j;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.i */
public class C43404i implements C67027a, C11385n {

    /* renamed from: j */
    public static final String f117356j = (HttpWrapperBase.PROTOCAL_HTTPS + WeChatHosts.domainString(C0966R.string.fls) + "/touch/scene_product.html?scene_id=kf1");

    /* renamed from: d */
    public Context f117357d;

    /* renamed from: e */
    public C72996z1 f117358e;

    /* renamed from: f */
    public C47511g f117359f;

    /* renamed from: g */
    public CheckBoxPreference f117360g;

    /* renamed from: h */
    public CheckBoxPreference f117361h;

    /* renamed from: i */
    public C89779i0 f117362i;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.i$a */
    public class C43405a implements DialogInterface.OnClickListener {
        public C43405a(C43404i iVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101089TE("gh_3dfda90e39d6");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.i$b */
    public class C43406b extends Preference {

        /* renamed from: J */
        public final /* synthetic */ zf4 f117363J;

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.i$b$a */
        public class C43407a implements View.OnClickListener {
            public C43407a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayNotify$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C43406b.this.f121276f.mo24588a((Preference) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayNotify$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43406b(C43404i iVar, Context context, zf4 zf4) {
            super(context);
            this.f117363J = zf4;
        }

        /* renamed from: w */
        public void mo1086w(View view) {
            super.mo1086w(view);
            C115669n.INSTANCE.mo160131h(27779, 1, this.f117363J.f145863d.get(0).f143463f, 0, 0);
            if (this.f121276f != null) {
                view.setOnClickListener(new C43407a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.i$c */
    public class C43408c implements Preference.C44715b {

        /* renamed from: a */
        public final /* synthetic */ zf4 f117365a;

        /* renamed from: b */
        public final /* synthetic */ C50456mv3 f117366b;

        public C43408c(zf4 zf4, C50456mv3 mv32) {
            this.f117365a = zf4;
            this.f117366b = mv32;
        }

        /* renamed from: a */
        public boolean mo24588a(Preference preference) {
            Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "text(%s) click!", this.f117365a.f145863d.get(0).f143463f);
            Bundle bundle = new Bundle();
            bundle.putInt("key_tiny_app_scene", 1000);
            C115669n.INSTANCE.mo160131h(27779, 1, this.f117365a.f145863d.get(0).f143463f, 0, 1);
            C43423i0.m46932c(C43404i.this.f117357d, this.f117366b, bundle, (C86300q) null, (C43423i0.C43429f) null);
            return true;
        }
    }

    public C43404i(Context context) {
        this.f117357d = context;
    }

    /* renamed from: a */
    public final void mo67598a(int i) {
        WeChatPayPluginReportStruct weChatPayPluginReportStruct = new WeChatPayPluginReportStruct();
        weChatPayPluginReportStruct.f108024d = (long) i;
        weChatPayPluginReportStruct.mo86054n();
    }

    /* renamed from: b */
    public final void mo67599b() {
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f117359f.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f117358e.getUsername(), this.f117358e.mo62898f(), this.f117357d.getString(C0966R.string.bu5));
        if (this.f117358e.mo62927s3()) {
            helperHeaderPreference.mo7601J(1);
            this.f117359f.mo72529n("contact_info_wxpay_notify_install", true);
            this.f117359f.mo72529n("contact_info_wxpay_notify_uninstall", false);
            this.f117359f.mo72529n("contact_info_wxpay_notify_go_to", false);
            this.f117359f.mo72529n("contact_info_wxpay_notify_top", false);
            this.f117359f.mo72529n("contact_info_wxpay_notify_not_disturb", false);
            this.f117359f.mo72529n("contact_info_wxpay_notify_help", false);
            this.f117359f.mo72529n("contact_info_wxpay_notify_clear_data", false);
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69755a0(this.f117358e.getUsername())) {
                this.f117360g.mo6805K(true);
            } else {
                this.f117360g.mo6805K(false);
            }
            if (C45628s0.m50746K(this.f117358e)) {
                this.f117361h.mo6805K(true);
            } else {
                this.f117361h.mo6805K(false);
            }
        } else {
            helperHeaderPreference.mo7601J(0);
            this.f117359f.mo72529n("contact_info_wxpay_notify_install", false);
            this.f117359f.mo72529n("contact_info_wxpay_notify_uninstall", true);
            this.f117359f.mo72529n("contact_info_wxpay_notify_go_to", true);
            this.f117359f.mo72529n("contact_info_wxpay_notify_top", true);
            this.f117359f.mo72529n("contact_info_wxpay_notify_not_disturb", true);
            this.f117359f.mo72529n("contact_info_wxpay_notify_help", true);
            this.f117359f.mo72529n("contact_info_wxpay_notify_clear_data", true);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        LinkedList<C49009cj2> linkedList;
        Class cls = C75700k0.class;
        Class cls2 = C48054w.class;
        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        C48052u uVar = null;
        if (yVar instanceof C28611c) {
            C86709a0.m107524d().mo123470p(30, this);
            if (i == 0 && i2 == 0) {
                String T0 = ((C28611c) yVar).mo56091T0();
                Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "bind fitness contact %s success", T0);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_3dfda90e39d6");
                if (z1Var == null || Util.isNullOrNil(T0)) {
                    Log.m105920e("MicroMsg.WxPay.ContactWidgetWxPayNotify", "respUsername == " + T0 + ", contact = " + z1Var);
                } else {
                    if (C72996z1.m85796D5(z1Var.getUsername())) {
                        String nullAsNil = Util.nullAsNil(z1Var.getUsername());
                        uVar = ((C48054w) C86312j.m106911c(cls2)).mo72625v(nullAsNil);
                        if (uVar != null) {
                            uVar.setUsername(T0);
                        }
                        ((C48054w) C86312j.m106911c(cls2)).mo72623d0(nullAsNil);
                        z1Var.mo62874S2(nullAsNil);
                    }
                    z1Var.setUsername(T0);
                    if (((int) z1Var.f108320R1) == 0) {
                        ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69707j3(z1Var);
                    }
                    if (((int) z1Var.f108320R1) <= 0) {
                        Log.m105920e("MicroMsg.WxPay.ContactWidgetWxPayNotify", "addContact : insert contact failed");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
                        if (uVar != null) {
                            ((C48054w) C86312j.m106911c(cls2)).mo72621Uu(uVar);
                        } else {
                            Class cls3 = C76708i.class;
                            C48052u v = ((C48054w) C86312j.m106911c(cls2)).mo72625v(z1Var2.getUsername());
                            if (v == null || v.mo72809G1()) {
                                Log.m105918d("MicroMsg.WxPay.ContactWidgetWxPayNotify", "shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls3)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5()) {
                                Log.m105919d("MicroMsg.WxPay.ContactWidgetWxPayNotify", "update contact, last check time=%d", Integer.valueOf(z1Var2.f149509Q0));
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls3)).mo106823Jc(z1Var2.getUsername());
                            }
                        }
                    }
                }
                C48052u v2 = ((C48054w) C86312j.m106911c(cls2)).mo72625v(z1Var.getUsername());
                if (v2 != null) {
                    ((C48054w) C86312j.m106911c(cls2)).mo72620Nf(v2);
                }
                C86709a0.m107535s().mo121142i().mo119676J(327825, Boolean.TRUE);
            } else {
                Log.m105921e("MicroMsg.WxPay.ContactWidgetWxPayNotify", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
                }
            }
            C89779i0 i0Var = this.f117362i;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            mo67599b();
        } else if (yVar instanceof C52770j) {
            C86709a0.m107524d().mo123470p(1820, this);
            if (i == 0 && i2 == 0) {
                C50944qc3 qc32 = ((C52770j) yVar).f147442f;
                if (qc32 == null) {
                    qc32 = new C50944qc3();
                }
                ue4 ue4 = qc32.f140243d;
                if (ue4 == null || (linkedList = ue4.f142818e) == null || linkedList.isEmpty()) {
                    Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "NetSceneGetPayPlugin no data");
                    return;
                }
                int d = this.f117359f.mo72521d("contact_info_wxpay_notify_clear_data");
                Iterator<C49009cj2> it = qc32.f140243d.f142818e.iterator();
                while (it.hasNext()) {
                    C49009cj2 next = it.next();
                    if (next.f131777e.isEmpty()) {
                        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "ItemSectionViewData is null");
                    } else {
                        d++;
                        this.f117359f.mo72524h(new PreferenceSmallCategory(this.f117357d, (AttributeSet) null), d);
                        Iterator<te4> it4 = next.f131777e.iterator();
                        while (it4.hasNext()) {
                            te4 next2 = it4.next();
                            if (next2.f142183e.isEmpty() || next2.f142184f.isEmpty()) {
                                Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "TableCellViewData data null");
                            } else {
                                zf4 zf4 = next2.f142183e.get(0);
                                zf4 zf42 = next2.f142184f.get(0);
                                C50456mv3 mv32 = next2.f142189n;
                                if (zf4.f145863d.isEmpty() || Util.isNullOrNil(zf4.f145863d.get(0).f143463f) || mv32 == null) {
                                    Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "TableCellViewData inner data null");
                                } else {
                                    d++;
                                    C43406b bVar = new C43406b(this, this.f117357d, zf4);
                                    bVar.mo69924H(zf4.f145863d.get(0).f143463f);
                                    bVar.f121271G = C0966R.C0971layout.bcy;
                                    if (!zf42.f145863d.isEmpty() && !Util.isNullOrNil(zf42.f145863d.get(0).f143463f)) {
                                        bVar.mo7741E(zf42.f145863d.get(0).f143463f);
                                    }
                                    this.f117359f.mo72524h(bVar, d);
                                    bVar.f121276f = new C43408c(zf4, mv32);
                                }
                            }
                        }
                    }
                }
                this.f117359f.notifyDataSetChanged();
                return;
            }
            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "NetSceneGetPayPlugin fail!");
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        this.f117359f = gVar;
        this.f117358e = z1Var;
        gVar.mo72520b(C0966R.xml.f8885ad);
        this.f117360g = (CheckBoxPreference) gVar.mo72519a("contact_info_wxpay_notify_top");
        this.f117361h = (CheckBoxPreference) gVar.mo72519a("contact_info_wxpay_notify_not_disturb");
        mo67599b();
        C86709a0.m107524d().mo123455a(1820, this);
        C86709a0.m107524d().mo123460f(new C52770j());
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayNotify", "handleEvent key:%s", str);
        if (Util.isEqual("contact_info_wxpay_notify_go_to", str)) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", this.f117358e.getUsername());
            intent.putExtra("finish_direct", true);
            C88144b.m109801s(this.f117357d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        } else if (Util.isEqual("contact_info_wxpay_notify_top", str)) {
            if (this.f117360g.mo6804J()) {
                C45628s0.m50787m0(this.f117358e.getUsername(), true, true);
                mo67598a(3);
            } else {
                C45628s0.m50803u0(this.f117358e.getUsername(), true);
                mo67598a(4);
            }
        } else if (Util.isEqual("contact_info_wxpay_notify_not_disturb", str)) {
            if (this.f117361h.mo6804J()) {
                C45628s0.m50779i0(this.f117358e, true);
                mo67598a(5);
            } else {
                C45628s0.m50797r0(this.f117358e, true);
                mo67598a(6);
            }
        } else if (Util.isEqual("contact_info_wxpay_notify_help", str)) {
            C75228t.m90219L(this.f117357d, f117356j, true);
            mo67598a(7);
        } else if (Util.isEqual("contact_info_wxpay_notify_clear_data", str)) {
            Context context = this.f117357d;
            C76879j.m92707A(context, context.getString(C0966R.string.blf), "", this.f117357d.getString(C0966R.string.f7930wk), this.f117357d.getString(C0966R.string.f7926wf), new C43405a(this), (DialogInterface.OnClickListener) null);
            mo67598a(8);
        } else if (Util.isEqual("contact_info_wxpay_notify_install", str)) {
            Context context2 = this.f117357d;
            C89779i0 Q = C76879j.m92723Q(context2, context2.getString(C0966R.string.a3h), this.f117357d.getString(C0966R.string.iww), true, true, (DialogInterface.OnCancelListener) null);
            this.f117362i = Q;
            Q.show();
            C86709a0.m107524d().mo123455a(30, this);
            LinkedList linkedList = new LinkedList();
            linkedList.add("gh_3dfda90e39d6");
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(1);
            C86709a0.m107524d().mo123460f((C117747y) ((C39989b) C86312j.m106911c(C39989b.class)).Ya0(1, linkedList, linkedList2, "", ""));
            mo67598a(10);
        } else if (Util.isEqual("contact_info_wxpay_notify_uninstall", str)) {
            Context context3 = this.f117357d;
            C76879j.m92707A(context3, context3.getString(C0966R.string.iwz), "", this.f117357d.getString(C0966R.string.f7930wk), this.f117357d.getString(C0966R.string.f7926wf), new C43409j(this), (DialogInterface.OnClickListener) null);
            mo67598a(9);
        }
        return false;
    }
}
