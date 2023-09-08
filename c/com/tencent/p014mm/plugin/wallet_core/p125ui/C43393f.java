package com.tencent.p014mm.plugin.wallet_core.p125ui;

import ad3.C67027a;
import android.app.Activity;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.p136ui.base.preference.Preference;
import com.tencent.p014mm.p136ui.base.preference.PreferenceSmallCategory;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83121t;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C19607d1;
import com.tencent.p014mm.storage.C19625p0;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.wallet_core.p137ui.C7089c0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import di0.C86300q;
import di3.C86312j;
import eb0.C31519v2;
import eb0.C45628s0;
import eb0.C75604z3;
import eb0.z3$$g;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import p011cm.C28611c;
import p011cm.C39989b;
import p154fy.C87121j;
import p196ln.C76708i;
import p227rn.C48051r;
import p227rn.C48052u;
import p227rn.C48053v;
import p227rn.C48054w;
import p910lj.C76701a;
import pj3.C47511g;
import qo3.C77407n;
import qo3.C89779i0;
import rb0.C47994n;
import te3.C49009cj2;
import te3.C50456mv3;
import te3.C51385te2;
import te3.te4;
import te3.ue4;
import te3.zf4;
import v53.C52769i;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.f */
public class C43393f implements C67027a, C11385n {

    /* renamed from: d */
    public Context f117340d;

    /* renamed from: e */
    public C72996z1 f117341e;

    /* renamed from: f */
    public C47511g f117342f;

    /* renamed from: g */
    public CheckBoxPreference f117343g;

    /* renamed from: h */
    public CheckBoxPreference f117344h;

    /* renamed from: i */
    public Dialog f117345i = null;

    /* renamed from: j */
    public C89779i0 f117346j;

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f$a */
    public class C43394a implements DialogInterface.OnClickListener {
        public C43394a(C43393f fVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).mo101089TE("gh_b4af18eac3d5");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f$b */
    public class C43395b implements DialogInterface.OnCancelListener {
        public C43395b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            Dialog dialog = C43393f.this.f117345i;
            if (dialog != null && dialog.isShowing()) {
                C43393f.this.f117345i.dismiss();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f$c */
    public class C43396c implements Runnable {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f$c$a */
        public class C43397a implements z3$$g {

            /* renamed from: d */
            public final /* synthetic */ String f117349d;

            public C43397a(C43396c cVar, String str) {
                this.f117349d = str;
            }

            /* renamed from: b */
            public boolean mo24603b() {
                return false;
            }

            /* renamed from: c */
            public void mo24604c() {
                ((C48054w) C86312j.m106911c(C48054w.class)).mo72623d0(this.f117349d);
            }
        }

        public C43396c() {
        }

        public void run() {
            Class cls = C48051r.class;
            Dialog dialog = C43393f.this.f117345i;
            if (dialog != null && dialog.isShowing()) {
                C43393f.this.f117345i.dismiss();
                C43393f.this.f117345i = null;
            }
            if (!C43393f.this.f117341e.mo62927s3()) {
                Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "!contact.isContact() close page");
                String username = C43393f.this.f117341e.getUsername();
                C75604z3.m90836h(username, new C43397a(this, username));
                ((C87121j) C86312j.m106911c(C87121j.class)).mo71213Ot(username, 15);
                ((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69763f(username);
                ((C47994n) ((C48051r) C86312j.m106911c(cls)).mo72610qT()).mo72783jo(username);
                ((C19625p0) ((C48051r) C86312j.m106911c(cls)).mo72607MK()).mo25795Yt(username);
                ((C19607d1) ((C48051r) C86312j.m106911c(cls)).mo72611ym()).mo25743qq(username);
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(MMApplicationContext.getPackageName(), "com.tencent.mm.ui.LauncherUI"));
                intent.addFlags(67108864);
                Activity activity = (Activity) C43393f.this.f117340d;
                C9556a aVar = new C9556a();
                aVar.mo10233c(intent);
                Activity activity2 = activity;
                C117292a.m165358d(activity2, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((Intent) aVar.mo10231a(0));
                C117292a.m165359e(activity2, "com/tencent/mm/plugin/wallet_core/ui/ContactWidgetWxPayHKNotify$3", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f$d */
    public class C43398d extends Preference {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f$d$a */
        public class C43399a extends C7089c0 {
            public C43399a() {
            }

            /* renamed from: a */
            public void mo2066a(View view) {
                C43398d.this.f121276f.mo24588a((Preference) null);
            }
        }

        public C43398d(C43393f fVar, Context context) {
            super(context);
        }

        /* renamed from: w */
        public void mo1086w(View view) {
            super.mo1086w(view);
            if (this.f121276f != null) {
                view.setOnClickListener(new C43399a());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f$e */
    public class C43400e implements Preference.C44715b {

        /* renamed from: a */
        public final /* synthetic */ zf4 f117351a;

        /* renamed from: b */
        public final /* synthetic */ C50456mv3 f117352b;

        public C43400e(zf4 zf4, C50456mv3 mv32) {
            this.f117351a = zf4;
            this.f117352b = mv32;
        }

        /* renamed from: a */
        public boolean mo24588a(Preference preference) {
            Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "text(%s) click!", this.f117351a.f145863d.get(0).f143463f);
            Bundle bundle = new Bundle();
            bundle.putInt("key_tiny_app_scene", C83121t.CTRL_INDEX);
            C43423i0.m46932c(C43393f.this.f117340d, this.f117352b, bundle, (C86300q) null, (C43423i0.C43429f) null);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.f$f */
    public class C43401f implements DialogInterface.OnClickListener {
        public C43401f(C43393f fVar) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "click AlertDialog");
        }
    }

    public C43393f(Context context) {
        this.f117340d = context;
    }

    /* renamed from: a */
    public final void mo67592a() {
        Context context = this.f117340d;
        C76879j.m92754y(context, context.getString(C0966R.string.l_3), "", this.f117340d.getString(C0966R.string.kke), new C43401f(this));
    }

    /* renamed from: b */
    public final void mo67593b() {
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f117342f.mo72519a("contact_info_header_helper");
        helperHeaderPreference.mo7600I(this.f117341e.getUsername(), this.f117341e.mo62898f(), this.f117340d.getString(C0966R.string.f360316bu0));
        if (this.f117341e.mo62927s3()) {
            helperHeaderPreference.mo7601J(1);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_install", true);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_uninstall", false);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_go_to", false);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_top", false);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_not_disturb", false);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_help", false);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_clear_data", false);
            if (((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69755a0(this.f117341e.getUsername())) {
                this.f117343g.mo6805K(true);
            } else {
                this.f117343g.mo6805K(false);
            }
            if (C45628s0.m50746K(this.f117341e)) {
                this.f117344h.mo6805K(true);
            } else {
                this.f117344h.mo6805K(false);
            }
        } else {
            helperHeaderPreference.mo7601J(0);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_install", false);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_uninstall", true);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_go_to", true);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_top", true);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_not_disturb", true);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_help", true);
            this.f117342f.mo72529n("contact_info_wxpay_hk_notify_clear_data", true);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "onActivityResult");
        if (i == 4) {
            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "requestCode == REQUEST_CODE_DISABLE_PAY_HK");
            if (this.f117345i == null) {
                Context context = this.f117340d;
                this.f117345i = C76879j.m92721O(context, (String) null, 3, C0966R.style.f8510l3, context.getString(C0966R.string.gas), true, true, new C43395b());
            }
            C119179t tVar = C119157j.f356862d;
            C43396c cVar = new C43396c();
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(cVar, 1000, false);
        }
    }

    public boolean onDetach() {
        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "onDetach");
        C86709a0.m107524d().mo123470p(30, this);
        C86709a0.m107524d().mo123470p(6855, this);
        return true;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        LinkedList<C49009cj2> linkedList;
        Class cls = C48053v.class;
        Class cls2 = C48054w.class;
        Class cls3 = C75700k0.class;
        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "errType:" + i + " errCode:" + i2 + " errMsg:" + str + " scenetype:" + yVar.getType());
        C48052u uVar = null;
        if (yVar instanceof C28611c) {
            C86709a0.m107524d().mo123470p(30, this);
            if (i == 0 && i2 == 0) {
                String T0 = ((C28611c) yVar).mo56091T0();
                Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "bind fitness contact %s success", T0);
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().get("gh_b4af18eac3d5");
                if (z1Var == null || Util.isNullOrNil(T0)) {
                    Log.m105920e("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "respUsername == " + T0 + ", contact = " + z1Var);
                } else {
                    if (C72996z1.m85796D5(z1Var.getUsername())) {
                        String nullAsNil = Util.nullAsNil(z1Var.getUsername());
                        uVar = ((C48053v) C86312j.m106911c(cls)).mo72619v(nullAsNil);
                        if (uVar != null) {
                            uVar.setUsername(T0);
                        }
                        ((C48054w) C86312j.m106911c(cls2)).mo72623d0(nullAsNil);
                        z1Var.mo62874S2(nullAsNil);
                    }
                    z1Var.setUsername(T0);
                    if (((int) z1Var.f108320R1) == 0) {
                        ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().mo69707j3(z1Var);
                    }
                    if (((int) z1Var.f108320R1) <= 0) {
                        Log.m105920e("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "addContact : insert contact failed");
                    } else {
                        C45628s0.m50775g0(z1Var);
                        C72996z1 z1Var2 = ((C75700k0) C86709a0.m107533q(cls3)).mo96097Ni().get(z1Var.getUsername());
                        if (uVar != null) {
                            ((C48054w) C86312j.m106911c(cls2)).mo72621Uu(uVar);
                        } else {
                            Class cls4 = C76708i.class;
                            C48052u v = ((C48053v) C86312j.m106911c(cls)).mo72619v(z1Var2.getUsername());
                            if (v == null || v.mo72809G1()) {
                                Log.m105918d("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "shouldUpdate");
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls4)).mo106823Jc(z1Var2.getUsername());
                            } else if (z1Var2.mo101231Y5()) {
                                Log.m105919d("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "update contact, last check time=%d", Integer.valueOf(z1Var2.f149509Q0));
                                C31519v2.m39436a().mo55987c(z1Var2.getUsername(), "");
                                ((C76708i) C86312j.m106911c(cls4)).mo106823Jc(z1Var2.getUsername());
                            }
                        }
                    }
                }
                C48052u v2 = ((C48053v) C86312j.m106911c(cls)).mo72619v(z1Var.getUsername());
                if (v2 != null) {
                    ((C48054w) C86312j.m106911c(cls2)).mo72620Nf(v2);
                }
                C86709a0.m107535s().mo121142i().mo119676J(327825, Boolean.TRUE);
            } else {
                Log.m105921e("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), str);
                if (i == 4 && i2 == -24 && !Util.isNullOrNil(str)) {
                    C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) str, 1).show();
                }
            }
            C89779i0 i0Var = this.f117346j;
            if (i0Var != null) {
                i0Var.dismiss();
            }
            mo67593b();
        } else if (yVar instanceof C52769i) {
            C86709a0.m107524d().mo123470p(6855, this);
            if (i == 0 && i2 == 0) {
                C51385te2 te22 = ((C52769i) yVar).f147439f;
                if (te22 == null) {
                    te22 = new C51385te2();
                }
                if (!Util.isNullOrNil(te22.f142166f)) {
                    Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "response.support_center_url：%s", te22.f142166f);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WX_PAY_HK_PLUGIN_HELP_URL_STRING_SYNC, te22.f142166f);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119681a(true);
                }
                if (!Util.isNullOrNil(te22.f142165e)) {
                    Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "response.disable_hk_wallet_url：%s", te22.f142165e);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_WX_PAY_HK_PLUGIN_DISABLE_URL_STRING_SYNC, te22.f142165e);
                    C86709a0.m107528h();
                    C86709a0.m107535s().mo121142i().mo119681a(true);
                }
                ue4 ue4 = te22.f142164d;
                if (ue4 == null || (linkedList = ue4.f142818e) == null || linkedList.isEmpty()) {
                    Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "NetSceneGetPayHKPlugin no data");
                    return;
                }
                int d = this.f117342f.mo72521d("contact_info_wxpay_hk_notify_go_to");
                Iterator<C49009cj2> it = te22.f142164d.f142818e.iterator();
                while (it.hasNext()) {
                    C49009cj2 next = it.next();
                    if (next.f131777e.isEmpty()) {
                        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "ItemSectionViewData is null");
                    } else {
                        d++;
                        this.f117342f.mo72524h(new PreferenceSmallCategory(this.f117340d, (AttributeSet) null), d);
                        Iterator<te4> it4 = next.f131777e.iterator();
                        while (it4.hasNext()) {
                            te4 next2 = it4.next();
                            if (next2.f142183e.isEmpty() || next2.f142184f.isEmpty()) {
                                Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "TableCellViewData data null");
                            } else {
                                zf4 zf4 = next2.f142183e.get(0);
                                zf4 zf42 = next2.f142184f.get(0);
                                C50456mv3 mv32 = next2.f142189n;
                                if (zf4.f145863d.isEmpty() || Util.isNullOrNil(zf4.f145863d.get(0).f143463f) || mv32 == null) {
                                    Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "TableCellViewData inner data null");
                                } else {
                                    d++;
                                    C43398d dVar = new C43398d(this, this.f117340d);
                                    dVar.mo69924H(zf4.f145863d.get(0).f143463f);
                                    dVar.f121271G = C0966R.C0971layout.bcy;
                                    if (!zf42.f145863d.isEmpty() && !Util.isNullOrNil(zf42.f145863d.get(0).f143463f)) {
                                        dVar.mo7741E(zf42.f145863d.get(0).f143463f);
                                    }
                                    this.f117342f.mo72524h(dVar, d);
                                    dVar.f121276f = new C43400e(zf4, mv32);
                                }
                            }
                        }
                    }
                }
                this.f117342f.notifyDataSetChanged();
                return;
            }
            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "NetSceneGetPayHKPlugin fail!");
        }
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "onAttach");
        this.f117342f = gVar;
        this.f117341e = z1Var;
        gVar.mo72520b(C0966R.xml.f8884ac);
        this.f117343g = (CheckBoxPreference) gVar.mo72519a("contact_info_wxpay_hk_notify_top");
        this.f117344h = (CheckBoxPreference) gVar.mo72519a("contact_info_wxpay_hk_notify_not_disturb");
        mo67593b();
        C86709a0.m107524d().mo123455a(6855, this);
        C86709a0.m107524d().mo123460f(new C52769i());
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "handleEvent key:%s", str);
        if (Util.isEqual("contact_info_wxpay_hk_notify_go_to", str)) {
            Intent intent = new Intent();
            intent.putExtra("Chat_User", this.f117341e.getUsername());
            intent.putExtra("finish_direct", true);
            C88144b.m109801s(this.f117340d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
        } else if (Util.isEqual("contact_info_wxpay_hk_notify_top", str)) {
            if (this.f117343g.mo6804J()) {
                C45628s0.m50787m0(this.f117341e.getUsername(), true, true);
            } else {
                C45628s0.m50803u0(this.f117341e.getUsername(), true);
            }
        } else if (Util.isEqual("contact_info_wxpay_hk_notify_not_disturb", str)) {
            if (this.f117344h.mo6804J()) {
                C45628s0.m50779i0(this.f117341e, true);
            } else {
                C45628s0.m50797r0(this.f117341e, true);
            }
        } else if (Util.isEqual("contact_info_wxpay_hk_notify_help", str)) {
            Log.m105924i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "click Help button ");
            C86709a0.m107528h();
            String str2 = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WX_PAY_HK_PLUGIN_HELP_URL_STRING_SYNC, (Object) null);
            if (!Util.isNullOrNil(str2)) {
                Log.m105925i("MicroMsg.WxPay.ContactWidgetWxPayHKNotify", "jump to h5:%s ", str2);
                C75228t.m90219L(this.f117340d, str2, true);
            } else {
                mo67592a();
            }
        } else if (Util.isEqual("contact_info_wxpay_hk_notify_clear_data", str)) {
            Context context = this.f117340d;
            C76879j.m92707A(context, context.getString(C0966R.string.blf), "", this.f117340d.getString(C0966R.string.f7930wk), this.f117340d.getString(C0966R.string.f7926wf), new C43394a(this), (DialogInterface.OnClickListener) null);
        } else if (Util.isEqual("contact_info_wxpay_hk_notify_install", str)) {
            Context context2 = this.f117340d;
            C89779i0 Q = C76879j.m92723Q(context2, context2.getString(C0966R.string.a3h), this.f117340d.getString(C0966R.string.iww), true, true, (DialogInterface.OnCancelListener) null);
            this.f117346j = Q;
            Q.show();
            C86709a0.m107524d().mo123455a(30, this);
            LinkedList linkedList = new LinkedList();
            linkedList.add("gh_b4af18eac3d5");
            LinkedList linkedList2 = new LinkedList();
            linkedList2.add(1);
            C86709a0.m107524d().mo123460f((C117747y) ((C39989b) C86312j.m106911c(C39989b.class)).Ya0(1, linkedList, linkedList2, "", ""));
        } else if (Util.isEqual("contact_info_wxpay_hk_notify_uninstall", str)) {
            C77407n nVar = new C77407n(this.f117340d, 1, true);
            TextView textView = new TextView(this.f117340d);
            textView.setGravity(17);
            textView.setHeight(C76577a.m92151b(this.f117340d, 56));
            textView.setTextSize(12.0f);
            textView.setTextColor(this.f117340d.getResources().getColor(C0966R.color.FG_1));
            textView.setText(this.f117340d.getResources().getString(C0966R.string.btw));
            nVar.mo107569n(textView, false);
            nVar.f225784p1 = true;
            nVar.f225771i = new C43402g(this);
            nVar.f225782p = new C43403h(this);
            nVar.mo107573q();
        }
        return false;
    }
}
