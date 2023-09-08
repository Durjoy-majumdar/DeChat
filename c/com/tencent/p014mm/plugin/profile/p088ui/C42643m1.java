package com.tencent.p014mm.plugin.profile.p088ui;

import ad3.C67027a;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.MinishopPluginReportStruct;
import com.tencent.p014mm.p136ui.base.preference.CheckBoxPreference;
import com.tencent.p014mm.pluginsdk.model.C44590b1;
import com.tencent.p014mm.pluginsdk.p133ui.preference.HelperHeaderPreference;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C44660i2;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import f62.C75700k0;
import h81.C32735h;
import java.util.ArrayList;
import ke3.C88144b;
import nj3.C76879j;
import pj3.C47511g;
import qo3.C89779i0;

/* renamed from: com.tencent.mm.plugin.profile.ui.m1 */
public class C42643m1 implements C67027a {

    /* renamed from: d */
    public final Context f115422d;

    /* renamed from: e */
    public C72996z1 f115423e = null;

    /* renamed from: f */
    public C47511g f115424f;

    /* renamed from: g */
    public CheckBoxPreference f115425g;

    /* renamed from: h */
    public CheckBoxPreference f115426h;

    /* renamed from: i */
    public C42644a f115427i = null;

    /* renamed from: com.tencent.mm.plugin.profile.ui.m1$a */
    public static class C42644a {

        /* renamed from: a */
        public final MinishopPluginReportStruct f115428a = new MinishopPluginReportStruct();

        public C42644a(C42634j1 j1Var) {
        }

        /* renamed from: a */
        public final void mo66774a(int i, int i2) {
            MinishopPluginReportStruct minishopPluginReportStruct = this.f115428a;
            minishopPluginReportStruct.f107994d = (long) i;
            minishopPluginReportStruct.f107995e = (long) i2;
            minishopPluginReportStruct.mo86054n();
        }
    }

    public C42643m1(Context context) {
        this.f115422d = context;
    }

    /* renamed from: a */
    public final C42644a mo66772a() {
        if (this.f115427i == null) {
            this.f115427i = new C42644a((C42634j1) null);
        }
        return this.f115427i;
    }

    /* renamed from: b */
    public final void mo66773b() {
        HelperHeaderPreference helperHeaderPreference = (HelperHeaderPreference) this.f115424f.mo72519a("contact_info_mini_shop_helper_header_helper");
        helperHeaderPreference.mo7600I(this.f115423e.getUsername(), this.f115423e.mo62909j3(), this.f115422d.getString(C0966R.string.boa));
        if (this.f115423e.mo62927s3()) {
            helperHeaderPreference.mo7601J(1);
            this.f115424f.mo72529n("contact_info_mini_shop_helper_install", true);
            this.f115424f.mo72529n("contact_info_mini_shop_helper_uninstall", false);
            this.f115424f.mo72529n("contact_info_mini_shop_helper_go_to", false);
            this.f115424f.mo72529n("contact_info_mini_shop_helper_top", false);
            this.f115424f.mo72529n("contact_info_mini_shop_helper_not_disturb", false);
            this.f115424f.mo72529n("contact_info_mini_shop_helper_help", false);
            this.f115424f.mo72529n("contact_info_mini_shop_helper_clear_data", false);
            this.f115425g.mo6805K(((C44660i2) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96094Ku()).mo69755a0(this.f115423e.getUsername()));
            this.f115426h.mo6805K(C45628s0.m50746K(this.f115423e));
            return;
        }
        helperHeaderPreference.mo7601J(0);
        this.f115424f.mo72529n("contact_info_mini_shop_helper_install", false);
        this.f115424f.mo72529n("contact_info_mini_shop_helper_uninstall", true);
        this.f115424f.mo72529n("contact_info_mini_shop_helper_go_to", true);
        this.f115424f.mo72529n("contact_info_mini_shop_helper_top", true);
        this.f115424f.mo72529n("contact_info_mini_shop_helper_not_disturb", true);
        this.f115424f.mo72529n("contact_info_mini_shop_helper_help", true);
        this.f115424f.mo72529n("contact_info_mini_shop_helper_clear_data", true);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public boolean onDetach() {
        Log.m105924i("MicroMsg.ContactWidgetMiniShopHelper", "onDetach");
        return true;
    }

    /* renamed from: x */
    public boolean mo5961x(C47511g gVar, C72996z1 z1Var, boolean z, int i) {
        Log.m105924i("MicroMsg.ContactWidgetMiniShopHelper", "onAttach");
        this.f115424f = gVar;
        this.f115423e = z1Var;
        gVar.mo72520b(C0966R.xml.f8874a0);
        this.f115425g = (CheckBoxPreference) gVar.mo72519a("contact_info_mini_shop_helper_top");
        this.f115426h = (CheckBoxPreference) gVar.mo72519a("contact_info_mini_shop_helper_not_disturb");
        mo66773b();
        return true;
    }

    /* renamed from: y */
    public boolean mo5962y(String str) {
        Log.m105924i("MicroMsg.ContactWidgetMiniShopHelper", "handleEvent, key: " + str);
        if (str == null) {
            return false;
        }
        str.getClass();
        char c = 65535;
        int i = 2;
        switch (str.hashCode()) {
            case -2027998924:
                if (str.equals("contact_info_mini_shop_helper_go_to")) {
                    c = 0;
                    break;
                }
                break;
            case -1521942243:
                if (str.equals("contact_info_mini_shop_helper_install")) {
                    c = 1;
                    break;
                }
                break;
            case -1450872065:
                if (str.equals("contact_info_mini_shop_helper_help")) {
                    c = 2;
                    break;
                }
                break;
            case 154744730:
                if (str.equals("contact_info_mini_shop_helper_clear_data")) {
                    c = 3;
                    break;
                }
                break;
            case 1338682839:
                if (str.equals("contact_info_mini_shop_helper_top")) {
                    c = 4;
                    break;
                }
                break;
            case 1342712804:
                if (str.equals("contact_info_mini_shop_helper_uninstall")) {
                    c = 5;
                    break;
                }
                break;
            case 1848846101:
                if (str.equals("contact_info_mini_shop_helper_not_disturb")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Intent intent = new Intent();
                intent.putExtra("Chat_User", this.f115423e.getUsername());
                intent.putExtra("finish_direct", true);
                C88144b.m109801s(this.f115422d, ".ui.chatting.ChattingUI", intent, (Bundle) null);
                mo66772a().mo66774a(1, 1);
                return true;
            case 1:
                Context context = this.f115422d;
                C89779i0 Q = C76879j.m92723Q(context, context.getString(C0966R.string.a3h), this.f115422d.getString(C0966R.string.iww), true, true, (DialogInterface.OnCancelListener) null);
                Q.show();
                C86709a0.m107524d().mo123455a(30, new C42638k1(this, Q));
                ArrayList arrayList = new ArrayList();
                arrayList.add("gh_579db1f2cf89");
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(1);
                C86709a0.m107524d().mo123460f(new C44590b1(1, arrayList, arrayList2, "", ""));
                return true;
            case 2:
                Intent intent2 = new Intent();
                intent2.putExtra("rawUrl", ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_minishop_plugin_helpcenter, "https://developers.weixin.qq.com/community/minihome/article/doc/000000208c8018662cda04cf35b813"));
                intent2.putExtra("showShare", true);
                intent2.putExtra("allow_mix_content_mode", false);
                C88144b.m109791i(this.f115422d, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent2, (Bundle) null);
                mo66772a().mo66774a(5, 1);
                return true;
            case 3:
                Context context2 = this.f115422d;
                C76879j.m92707A(context2, context2.getString(C0966R.string.blf), "", this.f115422d.getString(C0966R.string.f7930wk), this.f115422d.getString(C0966R.string.f7926wf), new C42634j1(this), (DialogInterface.OnClickListener) null);
                return true;
            case 4:
                boolean J = this.f115425g.mo6804J();
                C42644a a = mo66772a();
                if (!J) {
                    i = 3;
                }
                a.mo66774a(3, i);
                if (J) {
                    C45628s0.m50787m0(this.f115423e.getUsername(), true, true);
                } else {
                    C45628s0.m50803u0(this.f115423e.getUsername(), true);
                }
                return true;
            case 5:
                Context context3 = this.f115422d;
                C76879j.m92707A(context3, context3.getString(C0966R.string.iwz), "", this.f115422d.getString(C0966R.string.f7930wk), this.f115422d.getString(C0966R.string.f7926wf), new C42641l1(this), (DialogInterface.OnClickListener) null);
                return true;
            case 6:
                boolean J2 = this.f115426h.mo6804J();
                C42644a a2 = mo66772a();
                if (!J2) {
                    i = 3;
                }
                a2.mo66774a(4, i);
                if (J2) {
                    C45628s0.m50779i0(this.f115423e, true);
                } else {
                    C45628s0.m50797r0(this.f115423e, true);
                }
                return true;
            default:
                return false;
        }
    }
}
