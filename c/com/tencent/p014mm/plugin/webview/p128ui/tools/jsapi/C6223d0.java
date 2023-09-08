package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import f40.C86709a0;
import java.util.LinkedList;
import java.util.Map;
import ob0.C117747y;
import org.json.JSONArray;
import p209nt.C89090b;
import t83.C13851h1;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.d0 */
public class C6223d0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C13851h1 f22955d;

    /* renamed from: e */
    public final /* synthetic */ MsgHandler f22956e;

    public C6223d0(MsgHandler msgHandler, C13851h1 h1Var) {
        this.f22956e = msgHandler;
        this.f22955d = h1Var;
    }

    public void run() {
        String str;
        String str2;
        Class cls = C89090b.class;
        if (this.f22955d.f38996i.equals("login")) {
            MsgHandler msgHandler = this.f22956e;
            C13851h1 h1Var = this.f22955d;
            MsgHandler$$o0 msgHandler$$o0 = MsgHandler.f22671i1;
            msgHandler.getClass();
            Log.m105924i("MicroMsg.MsgHandler", "doLogin!");
            LinkedList linkedList = new LinkedList();
            try {
                str2 = msgHandler.f22715x.getCurrentUrl();
            } catch (Exception e) {
                Log.m105921e("MicroMsg.MsgHandler", "exception in get currentUrl %s", e.getMessage());
                str2 = null;
            }
            String nullAsNil = Util.nullAsNil(msgHandler.f22719z.mo7277c(str2));
            if (Util.isNullOrNil(nullAsNil)) {
                Log.m105920e("MicroMsg.MsgHandler", "appId is null!");
                msgHandler.mo7210k5(h1Var, "doLogin:fail", (Map<String, Object>) null);
                ((MsgHandler$$h) msgHandler$$o0).mo7246a();
                return;
            }
            C86709a0.m107524d().mo123460f((C117747y) ((C89090b) C86312j.m106911c(cls)).mo123229bu(nullAsNil, linkedList, 0, "", "", 0, new C85577f0(msgHandler, h1Var, msgHandler$$o0, nullAsNil)));
        } else if (this.f22955d.f38996i.equals("authorize")) {
            MsgHandler msgHandler2 = this.f22956e;
            C13851h1 h1Var2 = this.f22955d;
            MsgHandler$$o0 msgHandler$$o02 = MsgHandler.f22671i1;
            msgHandler2.getClass();
            Log.m105924i("MicroMsg.MsgHandler", "doOauthAuthorize!");
            String str3 = (String) h1Var2.f38983a.get("scope");
            if (Util.isNullOrNil(str3)) {
                Log.m105920e("MicroMsg.MsgHandler", "scope is null!");
                msgHandler2.mo7210k5(h1Var2, "authorize:fail", (Map<String, Object>) null);
                ((MsgHandler$$h) msgHandler$$o02).mo7246a();
                return;
            }
            try {
                str = msgHandler2.f22715x.getCurrentUrl();
            } catch (Exception e2) {
                Log.m105921e("MicroMsg.MsgHandler", "exception in get currentUrl %s", e2.getMessage());
                str = null;
            }
            String nullAsNil2 = Util.nullAsNil(msgHandler2.f22719z.mo7277c(str));
            if (Util.isNullOrNil(nullAsNil2)) {
                Log.m105920e("MicroMsg.MsgHandler", "appId is null!");
                msgHandler2.mo7210k5(h1Var2, "authorize:fail", (Map<String, Object>) null);
                ((MsgHandler$$h) msgHandler$$o02).mo7246a();
                return;
            }
            LinkedList linkedList2 = new LinkedList();
            try {
                JSONArray jSONArray = new JSONArray(str3);
                for (int i = 0; i < jSONArray.length(); i++) {
                    linkedList2.add(jSONArray.optString(i));
                }
                C86709a0.m107524d().mo123460f((C117747y) ((C89090b) C86312j.m106911c(cls)).mo123234yG(nullAsNil2, linkedList2, 0, new C85581h0(msgHandler2, h1Var2, msgHandler$$o02, nullAsNil2)));
            } catch (Exception e3) {
                Log.m105921e("MicroMsg.MsgHandler", "Exception %s", e3.getMessage());
                msgHandler2.mo7210k5(h1Var2, "authorize:fail", (Map<String, Object>) null);
            }
        }
    }
}
