package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.C83727p2;
import com.tencent.p014mm.plugin.appbrand.config.AppBrandSysConfigWC;
import com.tencent.p014mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82967h0;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import h81.C32735h;
import java.util.HashMap;
import ke3.C88144b;
import kr0.C88267e;
import ob0.C47350c;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89916g;
import p225rc.C89925n;
import p225rc.g$$f;
import te3.C49964j92;
import te3.C50098k92;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.j */
public class C82334j extends C82268c {
    public static final int CTRL_INDEX = 145;
    public static final String NAME = "enterContact";

    /* renamed from: g */
    public String f241301g;

    /* renamed from: h */
    public String f241302h;

    /* renamed from: i */
    public String f241303i;

    /* renamed from: j */
    public String f241304j;

    /* renamed from: n */
    public String f241305n;

    /* renamed from: o */
    public boolean f241306o;

    /* renamed from: p */
    public String f241307p;

    /* renamed from: q */
    public boolean f241308q;

    /* renamed from: r */
    public final int f241309r = C87687a.m109085a(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.j$a */
    public class C82335a implements C82338c {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241310a;

        /* renamed from: b */
        public final /* synthetic */ int f241311b;

        public C82335a(C82381f fVar, int i) {
            this.f241310a = fVar;
            this.f241311b = i;
        }

        /* renamed from: a */
        public void mo114725a(boolean z, String str, Intent intent) {
            Log.m105925i("MicroMsg.JsApiEnterContact", "page enterChatting isSuccess:%b", Boolean.valueOf(z));
            if (z) {
                HashMap hashMap = new HashMap();
                Object hashMap2 = new HashMap();
                String str2 = "";
                if (intent != null) {
                    String nullAs = Util.nullAs(intent.getStringExtra("keyOutPagePath"), str2);
                    str2 = C89925n.m112488a(nullAs);
                    hashMap2 = C89925n.m112489b(nullAs);
                }
                hashMap.put("path", str2);
                hashMap.put(SearchIntents.EXTRA_QUERY, hashMap2);
                Log.m105925i("MicroMsg.JsApiEnterContact", "onBackFromContact path:%s, query:%s", str2, hashMap2.toString());
                this.f241310a.mo109647a(this.f241311b, C82334j.this.mo115112m("ok", hashMap));
                return;
            }
            this.f241310a.mo109647a(this.f241311b, C82334j.this.mo115109j(str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.j$b */
    public class C82336b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ JsApiChattingTask f241313d;

        /* renamed from: e */
        public final /* synthetic */ WxaExposedParams.C81632b f241314e;

        /* renamed from: f */
        public final /* synthetic */ C83928t1 f241315f;

        /* renamed from: g */
        public final /* synthetic */ C82338c f241316g;

        /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.j$b$a */
        public class C82337a implements g$$f {
            public C82337a() {
            }

            /* renamed from: b */
            public boolean mo1596b(int i, int i2, Intent intent) {
                C82336b bVar = C82336b.this;
                if (i != C82334j.this.f241309r) {
                    return false;
                }
                C82338c cVar = bVar.f241316g;
                if (cVar != null) {
                    ((C82335a) cVar).mo114725a(true, "ok", intent);
                }
                C82336b.this.f241313d.mo114397h();
                return true;
            }
        }

        public C82336b(JsApiChattingTask jsApiChattingTask, WxaExposedParams.C81632b bVar, C83928t1 t1Var, C82338c cVar) {
            this.f241313d = jsApiChattingTask;
            this.f241314e = bVar;
            this.f241315f = t1Var;
            this.f241316g = cVar;
        }

        public void run() {
            Log.m105924i("MicroMsg.JsApiEnterContact", "go to the chattingUI");
            Intent intent = new Intent();
            intent.setFlags(67108864);
            intent.putExtra("Chat_User", this.f241313d.f241245h);
            intent.putExtra("app_brand_chatting_from_scene", 2);
            intent.putExtra("app_brand_chatting_expose_params", this.f241314e.mo113977a());
            intent.putExtra("key_temp_session_from", this.f241313d.f241243f);
            intent.putExtra("finish_direct", true);
            boolean z = BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger();
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            if (hVar != null) {
                z = hVar.mo58784wf(C32735h.C32737c.clicfg_android_appbrand_contact_support_send_video, z);
            }
            Log.m105924i("MicroMsg.AppBrandContactABTests", "isSupportSendVideo#get, " + z);
            if (!z) {
                intent.putExtra("key_need_send_video", false);
            }
            C82334j jVar = C82334j.this;
            if (jVar.f241306o) {
                intent.putExtra("sendMessageTitle", jVar.f241303i);
                intent.putExtra("sendMessagePath", C82334j.this.f241304j);
                intent.putExtra("sendMessageImg", C82334j.this.f241305n);
                intent.putExtra("sendMessageLocalImg", C82967h0.m101763b(C82334j.this.f241307p));
                intent.putExtra("needDelThumb", C82334j.this.f241308q);
            }
            intent.putExtra("showMessageCard", C82334j.this.f241306o);
            int i = this.f241315f.getRuntime().mo113194Y1() ? 2 : 1;
            String R0 = this.f241315f.mo116163R0();
            String appId = this.f241315f.getAppId();
            Log.m105925i("MicroMsg.JsApiEnterContact", "doEnterChatting, scene: %d, sceneNote: %s, fromAppId: %s", Integer.valueOf(i), R0, appId);
            intent.putExtra("app_brand_chatting_from_scene_new", i);
            intent.putExtra("app_brand_chatting_from_scene_note_new", R0);
            intent.putExtra("app_brand_chatting_from_app_id", appId);
            Activity R = this.f241315f.getRuntime().mo113026R();
            if (R == null) {
                C82338c cVar = this.f241316g;
                if (cVar != null) {
                    ((C82335a) cVar).mo114725a(false, "fail:internal error invalid android context", (Intent) null);
                }
                Log.m105920e("MicroMsg.JsApiEnterContact", "mmActivity is null, invoke fail!");
                return;
            }
            C89916g.m112446a(R).mo124232f(new C82337a());
            C88144b.m109802t(R, ".ui.chatting.AppBrandServiceChattingUI", intent, C82334j.this.f241309r);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.j$c */
    public interface C82338c {
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar instanceof C88267e) {
            C88267e eVar = (C88267e) fVar;
            C83928t1 M0 = eVar.mo114341l0();
            if (M0 == null) {
                Log.m105924i("MicroMsg.JsApiEnterContact", "enterChatting fail, pageView is null");
                eVar.mo109647a(i, mo115109j("fail:current page do not exist"));
                return;
            }
            mo114724x(M0, eVar, jSONObject, i);
        } else if (fVar instanceof C83780d1) {
            mo114724x((C83928t1) fVar, fVar, jSONObject, i);
        } else {
            fVar.mo109647a(i, mo115109j("fail:internal error invalid js component"));
        }
    }

    /* renamed from: w */
    public final void mo114723w(C83928t1 t1Var, AppBrandSysConfigWC appBrandSysConfigWC, String str, C82338c cVar) {
        JsApiChattingTask jsApiChattingTask = new JsApiChattingTask();
        String str2 = t1Var.getRuntime().mo113210l1().f234839s;
        WxaExposedParams.C81632b bVar = new WxaExposedParams.C81632b();
        bVar.f239557a = t1Var.getAppId();
        bVar.f239560d = str2;
        bVar.f239561e = appBrandSysConfigWC.f261061d;
        bVar.f239562f = appBrandSysConfigWC.f261063f;
        bVar.f239564h = appBrandSysConfigWC.f261072r.f238585d;
        bVar.f239563g = appBrandSysConfigWC.f261072r.pkgVersion;
        bVar.f239565i = appBrandSysConfigWC.f261072r.md5;
        bVar.f239566j = 5;
        String Q0 = t1Var.mo116162Q0();
        Log.m105919d("MicroMsg.JsApiEnterContact", "getCurrentPageId %s", Q0);
        bVar.f239567k = Q0;
        bVar.f239568l = C83727p2.m102773c(t1Var.getAppId());
        String str3 = "";
        if (!Util.isNullOrNil(str)) {
            str2 = str;
        } else if (Util.isNullOrNil(str2)) {
            Log.m105920e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
            str2 = str3;
        }
        jsApiChattingTask.f241245h = str2;
        String str4 = appBrandSysConfigWC.f261061d;
        if (Util.isNullOrNil(str)) {
            if (!Util.isNullOrNil(str4)) {
                str3 = str4;
            } else {
                Log.m105920e("MicroMsg.JsApiEnterContact", "username & subBusinessUsername is null, err");
            }
        }
        jsApiChattingTask.f241246i = str3;
        jsApiChattingTask.f241243f = this.f241301g;
        jsApiChattingTask.f241247j = new C82336b(jsApiChattingTask, bVar, t1Var, cVar);
        jsApiChattingTask.mo114395c();
    }

    /* renamed from: x */
    public void mo114724x(C83928t1 t1Var, C82381f fVar, JSONObject jSONObject, int i) {
        C82335a aVar = new C82335a(fVar, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiEnterContact", "enterChatting fail, data is null");
            aVar.mo114725a(false, "fail:invalid data", (Intent) null);
            return;
        }
        AppBrandSysConfigWC S1 = t1Var.getRuntime().mo113213o1();
        if (S1 == null) {
            Log.m105924i("MicroMsg.JsApiEnterContact", "enterChatting fail, config is null");
            aVar.mo114725a(false, "fail:config is null", (Intent) null);
            return;
        }
        String optString = jSONObject.optString("sessionFrom");
        this.f241301g = optString;
        if (optString.length() > 1024) {
            this.f241301g = this.f241301g.substring(0, 1024);
            Log.m105924i("MicroMsg.JsApiEnterContact", "sessionFrom length is large than 1024!");
        }
        this.f241302h = jSONObject.optString("businessId");
        String optString2 = jSONObject.optString("sendMessageTitle");
        this.f241303i = optString2;
        if (Util.isNullOrNil(optString2)) {
            this.f241303i = t1Var.mo116156K0();
        }
        String optString3 = jSONObject.optString("sendMessagePath");
        this.f241304j = optString3;
        if (Util.isNullOrNil(optString3)) {
            String R0 = t1Var.mo116163R0();
            this.f241304j = R0;
            if (R0.length() > 1024) {
                this.f241304j = this.f241304j.substring(0, 1024);
            }
        }
        this.f241305n = jSONObject.optString("sendMessageImg");
        this.f241306o = jSONObject.optBoolean("showMessageCard", false);
        this.f241308q = Util.isNullOrNil(this.f241305n);
        this.f241307p = C82967h0.m101766e(t1Var, this.f241305n, true);
        if (Util.isNullOrNil(this.f241302h)) {
            Log.m105924i("MicroMsg.JsApiEnterContact", "businessId is empty, enter to chatting");
            mo114723w(t1Var, S1, "", aVar);
            return;
        }
        Log.m105924i("MicroMsg.JsApiEnterContact", "do GetSubBusinessInfo cgi");
        String str = t1Var.getRuntime().mo113210l1().f234839s;
        if (Util.isNullOrNil(str)) {
            Log.m105920e("MicroMsg.JsApiEnterContact", "doCgiAndEnterChatting username is null, err");
            aVar.mo114725a(false, "fail:config is null", (Intent) null);
            return;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49964j92();
        bVar.f127067b = new C50098k92();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/wxausrevent/getsubbusinessinfo";
        bVar.f127069d = 1303;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        C49964j92 j922 = (C49964j92) a.f127055a.f127080a;
        j922.f135942d = str;
        j922.f135943e = this.f241302h;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C82339k(this, aVar, t1Var, S1));
    }
}
