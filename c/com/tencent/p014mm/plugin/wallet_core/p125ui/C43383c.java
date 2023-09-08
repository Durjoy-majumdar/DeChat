package com.tencent.p014mm.plugin.wallet_core.p125ui;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.kinda.framework.app.KindaConfigCacheStg;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.WeChatPayCollectionPluginReportStruct;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83121t;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di0.C86300q;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C28611c;
import p011cm.C39989b;
import p196ln.C76708i;
import p227rn.C48051r;
import p227rn.C48052u;
import p227rn.C48054w;
import p910lj.C76701a;
import pj3.C47511g;
import qo3.C89779i0;
import te3.C49009cj2;
import te3.C49809i72;
import te3.C50456mv3;
import te3.te4;
import te3.ue4;
import te3.zf4;
import v53.C52772l;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.c */
public class C43383c implements C67027a, C11385n {

    /* renamed from: d */
    public Context f117323d;

    /* renamed from: e */
    public C72996z1 f117324e;

    /* renamed from: f */
    public C47511g f117325f;

    /* renamed from: g */
    public CheckBoxPreference f117326g;

    /* renamed from: h */
    public CheckBoxPreference f117327h;

    /* renamed from: i */
    public C89779i0 f117328i;

    /* renamed from: j */
    public List<Preference> f117329j = new ArrayList();

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c$a */
    public class C43384a implements DialogInterface.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c$a$a */
        public class C43385a implements Runnable {
            public C43385a(C43384a aVar) {
            }

            public void run() {
                Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "clear record");
                ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101089TE("gh_f0a92aa7146c");
            }
        }

        public C43384a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C43385a(this));
            C43383c.this.mo67581a(9);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c$b */
    public class C43386b extends Preference {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c$b$a */
        public class C43387a implements View.OnClickListener {
            public C43387a() {
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayCollection$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C43386b.this.f121276f.mo24588a((Preference) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayCollection$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C43386b(C43383c cVar, Context context) {
            super(context);
        }

        /* renamed from: w */
        public void mo1086w(View view) {
            super.mo1086w(view);
            if (this.f121276f != null) {
                view.setOnClickListener(new C43387a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.c$c */
    public class C43388c implements Preference.C44715b {

        /* renamed from: a */
        public final /* synthetic */ zf4 f117332a;

        /* renamed from: b */
        public final /* synthetic */ C50456mv3 f117333b;

        public C43388c(zf4 zf4, C50456mv3 mv32) {
            this.f117332a = zf4;
            this.f117333b = mv32;
        }

        /* renamed from: a */
        public boolean mo24588a(Preference preference) {
            Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "text(%s) click!", this.f117332a.f145863d.get(0).f143463f);
            Bundle bundle = new Bundle();
            bundle.putInt("key_tiny_app_scene", C83121t.CTRL_INDEX);
            C43423i0.m46932c(C43383c.this.f117323d, this.f117333b, bundle, (C86300q) null, (C43423i0.C43429f) null);
            C115669n.INSTANCE.mo160131h(19541, 1, this.f117332a.f145863d.get(0).f143463f);
            return true;
        }
    }

    public C43383c(Context context) {
        this.f117323d = context;
    }

    /* renamed from: a */
    public final void mo67581a(int i) {
        WeChatPayCollectionPluginReportStruct weChatPayCollectionPluginReportStruct = new WeChatPayCollectionPluginReportStruct();
        weChatPayCollectionPluginReportStruct.f108023d = (long) i;
        weChatPayCollectionPluginReportStruct.mo86054n();
    }

    /* renamed from: b */
    public final void mo67582b() {
        List<Preference> list = this.f117329j;
        if (list != null && ((ArrayList) list).size() > 0) {
            Iterator it = ((ArrayList) this.f117329j).iterator();
            while (it.hasNext()) {
                this.f117325f.mo72526j((Preference) it.next());
            }
            this.f117325f.notifyDataSetChanged();
            ((ArrayList) this.f117329j).clear();
        }
    }

    /* renamed from: c */
    public final void mo67583c(C49809i72 i722) {
        String str;
        ue4 ue4;
        LinkedList<C49009cj2> linkedList;
        if (!(i722 == null || (ue4 = i722.f135153d) == null || (linkedList = ue4.f142818e) == null || linkedList.isEmpty())) {
            try {
                str = new String(i722.toByteArray(), KindaConfigCacheStg.SAVE_CHARSET);
            } catch (IOException e) {
                Log.m105920e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "save config exp, " + e.getLocalizedMessage());
            }
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WX_PAY_REVEIVE_PLUGIN_CONFIG_STRING_SYNC, str);
            C86709a0.m107528h();
            C86709a0.m107535s().mo121142i().mo119681a(true);
        }
        str = " ";
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WX_PAY_REVEIVE_PLUGIN_CONFIG_STRING_SYNC, str);
        C86709a0.m107528h();
        C86709a0.m107535s().mo121142i().mo119681a(true);
    }

    /* renamed from: d */
    public final void mo67584d(C49809i72 i722) {
        ue4 ue4;
        LinkedList<C49009cj2> linkedList;
        if (!this.f117324e.mo62927s3()) {
            mo67582b();
            return;
        }
        mo67582b();
        if (i722 == null || (ue4 = i722.f135153d) == null || (linkedList = ue4.f142818e) == null || linkedList.isEmpty()) {
            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "NetSceneGetPayPlugin no data");
            return;
        }
        int d = this.f117325f.mo72521d("contact_info_wxpay_collection_go_to");
        Iterator<C49009cj2> it = i722.f135153d.f142818e.iterator();
        while (it.hasNext()) {
            C49009cj2 next = it.next();
            if (next.f131777e.isEmpty()) {
                Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "ItemSectionViewData is null");
            } else {
                d++;
                PreferenceSmallCategory preferenceSmallCategory = new PreferenceSmallCategory(this.f117323d, (AttributeSet) null);
                this.f117325f.mo72524h(preferenceSmallCategory, d);
                ((ArrayList) this.f117329j).add(preferenceSmallCategory);
                Iterator<te4> it4 = next.f131777e.iterator();
                while (it4.hasNext()) {
                    te4 next2 = it4.next();
                    if (next2.f142183e.isEmpty() || next2.f142184f.isEmpty()) {
                        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "TableCellViewData data null");
                    } else {
                        zf4 zf4 = next2.f142183e.get(0);
                        zf4 zf42 = next2.f142184f.get(0);
                        C50456mv3 mv32 = next2.f142189n;
                        if (zf4.f145863d.isEmpty() || Util.isNullOrNil(zf4.f145863d.get(0).f143463f) || mv32 == null) {
                            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "TableCellViewData inner data null");
                        } else {
                            d++;
                            C43386b bVar = new C43386b(this, this.f117323d);
                            bVar.mo69924H(zf4.f145863d.get(0).f143463f);
                            bVar.f121271G = C0966R.C0971layout.bcy;
                            if (!zf42.f145863d.isEmpty() && !Util.isNullOrNil(zf42.f145863d.get(0).f143463f)) {
                                bVar.mo7741E(zf42.f145863d.get(0).f143463f);
                            }
                            this.f117325f.mo72524h(bVar, d);
                            ((ArrayList) this.f117329j).add(bVar);
                            bVar.f121276f = new C43388c(zf4, mv32);
                        }
                    }
                }
            }
        }
        this.f117325f.notifyDataSetChanged();
    }

    /* renamed from: e */
    public final void mo67585e() {
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f117325f.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f117324e.getUsername(), this.f117324e.mo62898f(), this.f117323d.getString(C0966R.string.btt));
        Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "contact.getUsername():%s", this.f117324e.getUsername());
        if (this.f117324e.mo62927s3()) {
            helperHeaderPreference.mo7601J(1);
            this.f117325f.mo72529n("contact_info_wxpay_collection_install", true);
            this.f117325f.mo72529n("contact_info_wxpay_collection_uninstall", false);
            this.f117325f.mo72529n("contact_info_wxpay_collection_go_to", true);
            this.f117325f.mo72529n("contact_info_wxpay_collection_top", false);
            this.f117325f.mo72529n("contact_info_wxpay_collection_not_disturb", false);
            this.f117325f.mo72529n("contact_info_wxpay_collection_help", false);
            this.f117325f.mo72529n("contact_info_wxpay_collection_clear_data", false);
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69755a0(this.f117324e.getUsername())) {
                this.f117326g.mo6805K(true);
            } else {
                this.f117326g.mo6805K(false);
            }
            if (C45628s0.m50746K(this.f117324e)) {
                this.f117327h.mo6805K(true);
            } else {
                this.f117327h.mo6805K(false);
            }
        } else {
            helperHeaderPreference.mo7601J(0);
            this.f117325f.mo72529n("contact_info_wxpay_collection_install", false);
            this.f117325f.mo72529n("contact_info_wxpay_collection_uninstall", true);
            this.f117325f.mo72529n("contact_info_wxpay_collection_go_to", true);
            this.f117325f.mo72529n("contact_info_wxpay_collection_top", true);
            this.f117325f.mo72529n("contact_info_wxpay_collection_not_disturb", true);
            this.f117325f.mo72529n("contact_info_wxpay_collection_help", true);
            this.f117325f.mo72529n("contact_info_wxpay_collection_clear_data", true);
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
        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        if (yVar instanceof C28611c) {
            C86709a0.m107524d().mo123470p(30, this);
            if (i == 0 && i2 == 0) {
                String T0 = ((C28611c) yVar).mo56091T0();
                Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "bind fitness contact %s success", T0);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get("gh_f0a92aa7146c");
                if (z1Var == null || Util.isNullOrNil(T0)) {
                    Log.m105920e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "respUsername == " + T0 + ", contact = " + z1Var);
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
                        Log.m105920e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "addContact : insert contact failed");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(z1Var.getUsername());
                        if (uVar != null) {
                            ((C48054w) C86312j.m106911c(cls2)).mo72621Uu(uVar);
                        } else {
                            Class cls3 = C76708i.class;
                            C48052u v2 = ((C48054w) C86312j.m106911c(cls2)).mo72625v(z1Var2.getUsername());
                            if (v2 == null || v2.mo72809G1()) {
                                Log.m105918d("MicroMsg.WxPay.ContactWidgetWxPayCollection", "shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls3)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5()) {
                                Log.m105919d("MicroMsg.WxPay.ContactWidgetWxPayCollection", "update contact, last check time=%d", Integer.valueOf(z1Var2.f149509Q0));
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
                Log.m105921e("MicroMsg.WxPay.ContactWidgetWxPayCollection", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
                }
            }
            C89779i0 i0Var = this.f117328i;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            mo67585e();
        } else if (yVar instanceof C52772l) {
            C86709a0.m107524d().mo123470p(2860, this);
            if (i == 0 && i2 == 0) {
                C49809i72 i722 = ((C52772l) yVar).f147450f;
                if (i722 == null) {
                    i722 = new C49809i72();
                }
                mo67584d(i722);
                mo67583c(i722);
                return;
            }
            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "NetSceneGetPayPlugin fail!");
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        this.f117325f = gVar;
        this.f117324e = z1Var;
        gVar.mo72520b(C0966R.xml.f8883ab);
        this.f117326g = (CheckBoxPreference) gVar.mo72519a("contact_info_wxpay_collection_top");
        this.f117327h = (CheckBoxPreference) gVar.mo72519a("contact_info_wxpay_collection_not_disturb");
        mo67585e();
        C49809i72 i722 = new C49809i72();
        C86709a0.m107528h();
        String str = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WX_PAY_REVEIVE_PLUGIN_CONFIG_STRING_SYNC, (Object) null);
        if (Util.isNullOrNil(str)) {
            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "etReceiptAssisPluginResponse failed");
        } else {
            try {
                i722.parseFrom(str.getBytes(KindaConfigCacheStg.SAVE_CHARSET));
            } catch (Exception e) {
                Log.m105928w("MicroMsg.WxPay.ContactWidgetWxPayCollection", "parseConfig exp, " + e.getLocalizedMessage());
            }
        }
        mo67584d(i722);
        C86709a0.m107524d().mo123455a(2860, this);
        C86709a0.m107524d().mo123460f(new C52772l());
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayCollection", "handleEvent key:%s", str);
        if (Util.isEqual("contact_info_wxpay_collection_go_to", str)) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", this.f117324e.getUsername());
            intent.putExtra("finish_direct", true);
            C88144b.m109801s(this.f117323d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
            mo67581a(3);
        } else if (Util.isEqual("contact_info_wxpay_collection_top", str)) {
            if (this.f117326g.mo6804J()) {
                C45628s0.m50787m0(this.f117324e.getUsername(), true, true);
                mo67581a(4);
            } else {
                C45628s0.m50803u0(this.f117324e.getUsername(), true);
                mo67581a(5);
            }
        } else if (Util.isEqual("contact_info_wxpay_collection_not_disturb", str)) {
            if (this.f117327h.mo6804J()) {
                C45628s0.m50779i0(this.f117324e, true);
                mo67581a(6);
            } else {
                C45628s0.m50797r0(this.f117324e, true);
                mo67581a(7);
            }
        } else if (Util.isEqual("contact_info_wxpay_collection_help", str)) {
            C75228t.m90224Q("gh_106decc2eec5@app", "/pages/product/productInfo/product.html?code=A4075&producttitle=收款小账本&scene_id=kf5662", 0, C83121t.CTRL_INDEX);
            mo67581a(8);
        } else if (Util.isEqual("contact_info_wxpay_collection_clear_data", str)) {
            Context context = this.f117323d;
            C76879j.m92707A(context, context.getString(C0966R.string.blf), "", this.f117323d.getString(C0966R.string.f7930wk), this.f117323d.getString(C0966R.string.f7926wf), new C43384a(), (DialogInterface.OnClickListener) null);
        } else if (Util.isEqual("contact_info_wxpay_collection_install", str)) {
            Context context2 = this.f117323d;
            C89779i0 Q = C76879j.m92723Q(context2, context2.getString(C0966R.string.a3h), this.f117323d.getString(C0966R.string.iww), true, true, (DialogInterface.OnCancelListener) null);
            this.f117328i = Q;
            Q.show();
            C86709a0.m107524d().mo123455a(30, this);
            LinkedList linkedList = new LinkedList();
            linkedList.add("gh_f0a92aa7146c");
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(1);
            C86709a0.m107524d().mo123460f((C117747y) ((C39989b) C86312j.m106911c(C39989b.class)).Ya0(1, linkedList, linkedList2, "", ""));
            C86709a0.m107529k().f251779b.mo123460f((C117747y) ((C48051r) C86312j.m106911c(C48051r.class)).mo72609PF(new C43392e(this)));
            mo67581a(11);
        } else if (Util.isEqual("contact_info_wxpay_collection_uninstall", str)) {
            Context context3 = this.f117323d;
            C76879j.m92707A(context3, context3.getString(C0966R.string.iwz), "", this.f117323d.getString(C0966R.string.f7930wk), this.f117323d.getString(C0966R.string.f7926wf), new C43391d(this), (DialogInterface.OnClickListener) null);
        }
        return false;
    }
}
