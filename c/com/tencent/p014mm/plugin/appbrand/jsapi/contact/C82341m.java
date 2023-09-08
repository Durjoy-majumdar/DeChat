package com.tencent.p014mm.plugin.appbrand.jsapi.contact;

import android.content.Intent;
import com.google.android.gms.actions.SearchIntents;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82268c;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.share.C82967h0;
import com.tencent.p014mm.plugin.appbrand.page.C83928t1;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.HashMap;
import kr0.C88267e;
import ob0.C47350c;
import org.json.JSONObject;
import p170ic.C87687a;
import p225rc.C89925n;
import te3.C49964j92;
import te3.C50098k92;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.m */
public class C82341m extends C82268c {
    public static final int CTRL_INDEX = 550;
    public static final String NAME = "privateEnterContact";

    /* renamed from: g */
    public String f241325g;

    /* renamed from: h */
    public String f241326h;

    /* renamed from: i */
    public String f241327i;

    /* renamed from: j */
    public String f241328j;

    /* renamed from: n */
    public String f241329n;

    /* renamed from: o */
    public String f241330o;

    /* renamed from: p */
    public String f241331p;

    /* renamed from: q */
    public String f241332q;

    /* renamed from: r */
    public String f241333r;

    /* renamed from: s */
    public String f241334s;

    /* renamed from: t */
    public String f241335t;

    /* renamed from: u */
    public String f241336u;

    /* renamed from: v */
    public boolean f241337v;

    /* renamed from: w */
    public String f241338w;

    /* renamed from: x */
    public boolean f241339x;

    /* renamed from: y */
    public final int f241340y = C87687a.m109085a(this);

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.m$a */
    public class C82342a implements C82343b {

        /* renamed from: a */
        public final /* synthetic */ C82381f f241341a;

        /* renamed from: b */
        public final /* synthetic */ int f241342b;

        public C82342a(C82381f fVar, int i) {
            this.f241341a = fVar;
            this.f241342b = i;
        }

        /* renamed from: a */
        public void mo114729a(boolean z, String str, Intent intent) {
            Log.m105925i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact page enterChatting isSuccess:%b", Boolean.valueOf(z));
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
                Log.m105925i("MicroMsg.JsApiPrivateEnterContact", "onBackFromContact path:%s, query:%s", str2, hashMap2.toString());
                this.f241341a.mo109647a(this.f241342b, C82341m.this.mo115112m("ok", hashMap));
                return;
            }
            this.f241341a.mo109647a(this.f241342b, C82341m.this.mo115109j(str));
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.contact.m$b */
    public interface C82343b {
    }

    /* renamed from: u */
    public void mo1505u(C82381f fVar, JSONObject jSONObject, int i) {
        if (fVar instanceof C88267e) {
            C88267e eVar = (C88267e) fVar;
            C83928t1 M0 = eVar.mo114341l0();
            if (M0 == null) {
                Log.m105924i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, pageView is null");
                eVar.mo109647a(i, mo115109j("fail:current page do not exist"));
                return;
            }
            mo114728w(M0, eVar, jSONObject, i);
        } else if (fVar instanceof C83928t1) {
            mo114728w((C83928t1) fVar, fVar, jSONObject, i);
        } else {
            Log.m105928w("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact not support");
        }
    }

    /* renamed from: w */
    public void mo114728w(C83928t1 t1Var, C82381f fVar, JSONObject jSONObject, int i) {
        C82342a aVar = new C82342a(fVar, i);
        if (jSONObject == null) {
            Log.m105920e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, data is null");
            aVar.mo114729a(false, "fail:invalid data", (Intent) null);
        } else if (t1Var.getRuntime().mo113213o1() == null) {
            Log.m105920e("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact enterChatting fail, config is null");
            aVar.mo114729a(false, "fail:config is null", (Intent) null);
        } else {
            String optString = jSONObject.optString("sessionFrom");
            this.f241325g = optString;
            if (optString.length() > 1024) {
                this.f241325g = this.f241325g.substring(0, 1024);
                Log.m105924i("MicroMsg.JsApiPrivateEnterContact", "privateEnterContact sessionFrom length is large than 1024!");
            }
            String optString2 = jSONObject.optString("appId");
            this.f241326h = optString2;
            if (Util.isNullOrNil(optString2)) {
                aVar.mo114729a(false, "fail:appId is null", (Intent) null);
                return;
            }
            this.f241327i = jSONObject.optString("userName");
            String optString3 = jSONObject.optString("contactUsername");
            this.f241331p = optString3;
            if (Util.isNullOrNil(optString3)) {
                optString3 = "";
            } else if (!optString3.endsWith("@app")) {
                optString3 = optString3 + "@app";
            }
            this.f241331p = optString3;
            this.f241328j = jSONObject.optString(FFmpegMetadataRetriever.METADATA_KEY_TITLE);
            this.f241329n = jSONObject.optString("subTitle");
            this.f241330o = jSONObject.optString("headimgUrl");
            if (!Util.isNullOrNil(this.f241327i)) {
                JsApiChattingTask jsApiChattingTask = new JsApiChattingTask();
                jsApiChattingTask.f241245h = this.f241327i;
                jsApiChattingTask.f241243f = this.f241325g;
                jsApiChattingTask.f241247j = new C82344n(this, jsApiChattingTask, t1Var, aVar);
                jsApiChattingTask.mo114395c();
            } else if (!Util.isNullOrNil(this.f241331p)) {
                this.f241333r = jSONObject.optString("businessId");
                this.f241334s = jSONObject.optString("sendMessageTitle");
                this.f241335t = jSONObject.optString("sendMessagePath");
                this.f241336u = jSONObject.optString("sendMessageImg");
                this.f241337v = jSONObject.optBoolean("showMessageCard", false);
                this.f241339x = Util.isNullOrNil(this.f241336u);
                this.f241338w = C82967h0.m101766e(t1Var, this.f241336u, true);
                if (Util.isNullOrNil(this.f241331p)) {
                    Log.m105920e("MicroMsg.JsApiPrivateEnterContact", "doCgiAndEnterChatting username is null, err");
                    aVar.mo114729a(false, "fail:config is null", (Intent) null);
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
                j922.f135942d = this.f241331p;
                j922.f135943e = this.f241333r;
                ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C82346o(this, aVar, t1Var));
            }
        }
    }
}
