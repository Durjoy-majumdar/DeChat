package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Bundle;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.widget.C85590k1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import org.json.JSONObject;
import p828wa.C53096b;
import te3.C49713hj2;
import te3.C49717hk2;
import te3.C90412gk2;
import te3.C90418ik2;
import te3.C90421jk2;
import te3.C90437rw3;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.u0 */
public class C85510u0 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.u0$a */
    public class C85511a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C53096b.C53097a f249176a;

        /* renamed from: b */
        public final /* synthetic */ String f249177b;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.u0$a$a */
        public class C85512a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ String f249179d;

            /* renamed from: e */
            public final /* synthetic */ LinkedList f249180e;

            /* renamed from: f */
            public final /* synthetic */ String f249181f;

            /* renamed from: g */
            public final /* synthetic */ String f249182g;

            /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.u0$a$a$a */
            public class C85513a implements C85590k1.C85591a {
                public C85513a() {
                }

                /* renamed from: a */
                public void mo67901a(int i, Bundle bundle) {
                    Log.m105925i("MicroMsg.JsApiLogin", "onRevMsg resultCode %d", Integer.valueOf(i));
                    if (i == 1 || i == 2) {
                        C85512a aVar = C85512a.this;
                        C85511a aVar2 = C85511a.this;
                        C85510u0 u0Var = C85510u0.this;
                        String str = aVar2.f249177b;
                        String str2 = aVar.f249179d;
                        C53096b.C53097a aVar3 = aVar2.f249176a;
                        u0Var.getClass();
                        LinkedList<String> linkedList = new LinkedList<>();
                        Iterator it = ((ArrayList) bundle.getSerializable("key_scope")).iterator();
                        while (it.hasNext()) {
                            linkedList.add((String) it.next());
                        }
                        C47350c.C47352b bVar = new C47350c.C47352b();
                        C90412gk2 gk22 = new C90412gk2();
                        bVar.f127066a = gk22;
                        bVar.f127067b = new C49717hk2();
                        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-login-confirm";
                        bVar.f127069d = 1117;
                        bVar.f127070e = 0;
                        bVar.f127071f = 0;
                        gk22.f259525d = str;
                        gk22.f259526e = linkedList;
                        gk22.f259527f = 0;
                        gk22.f259528g = str2;
                        gk22.f259530i = 0;
                        gk22.f259529h = i;
                        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C43623v0(u0Var, aVar3, i));
                        if (i == 2) {
                            Log.m105920e("MicroMsg.JsApiLogin", "fail auth deny!");
                            C85511a.this.f249176a.mo73778c("auth_deny", (JSONObject) null);
                            return;
                        }
                        return;
                    }
                    Log.m105924i("MicroMsg.JsApiLogin", "press back button!");
                    C85511a.this.f249176a.mo73778c("auth_cancel", (JSONObject) null);
                }
            }

            public C85512a(String str, LinkedList linkedList, String str2, String str3) {
                this.f249179d = str;
                this.f249180e = linkedList;
                this.f249181f = str2;
                this.f249182g = str3;
            }

            public void run() {
                C85590k1 k1Var = new C85590k1(((C43658n) C85511a.this.f249176a.f148189a).f148196d);
                C85513a aVar = new C85513a();
                LinkedList linkedList = this.f249180e;
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105920e("MicroMsg.JsApiLogin", "scopeInfoList is empty!");
                    C85511a.this.f249176a.mo73778c("fail", (JSONObject) null);
                } else if (!k1Var.mo119057a(this.f249180e, this.f249181f, this.f249182g, (String) null, aVar)) {
                    C85511a.this.f249176a.mo73778c("fail", (JSONObject) null);
                }
            }
        }

        public C85511a(C53096b.C53097a aVar, String str) {
            this.f249176a = aVar;
            this.f249177b = str;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C49713hj2 hj22;
            Log.m105925i("MicroMsg.JsApiLogin", "errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C90421jk2 jk22 = (C90421jk2) cVar.f127056b.f127083a;
                if (jk22 == null || (hj22 = jk22.f259628d) == null) {
                    this.f249176a.mo73778c("fail", (JSONObject) null);
                    return;
                }
                int i3 = hj22.f134688d;
                String str2 = hj22.f134689e;
                String str3 = jk22.f259637p;
                Log.m105925i("MicroMsg.JsApiLogin", "NetSceneJSLogin jsErrcode %d", Integer.valueOf(i3));
                if (i3 == -12000) {
                    LinkedList<C90437rw3> linkedList = jk22.f259630f;
                    String str4 = jk22.f259631g;
                    String str5 = jk22.f259632h;
                    Log.m105919d("MicroMsg.JsApiLogin", "appName %s, appIconUrl %s", str4, str5);
                    MMHandlerThread.postToMainThread(new C85512a(str3, linkedList, str4, str5));
                } else if (i3 == 0) {
                    String str6 = jk22.f259629e;
                    new HashMap().put("code", str6);
                    Log.m105919d("MicroMsg.JsApiLogin", "resp data code [%s]", str6);
                    this.f249176a.mo73776a();
                } else {
                    Log.m105921e("MicroMsg.JsApiLogin", "onSceneEnd NetSceneJSLogin %s", str2);
                    this.f249176a.mo73778c("fail", (JSONObject) null);
                }
            } else {
                this.f249176a.mo73778c("fail", (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "login";
    }

    /* renamed from: c */
    public int mo5383c() {
        return 0;
    }

    /* renamed from: d */
    public void mo5384d(Context context, String str, C43620m2.C5947b bVar) {
    }

    /* renamed from: e */
    public void mo5385e(C53096b<C43658n>.a aVar) {
        Log.m105924i("MicroMsg.JsApiLogin", "invoke");
        LinkedList<String> linkedList = new LinkedList<>();
        String b = ((C43658n) aVar.f148189a).f117923M.mo67920b();
        if (Util.isNullOrNil(b)) {
            Log.m105920e("MicroMsg.JsApiLogin", "appId is null!");
            aVar.mo73778c("fail", (JSONObject) null);
            return;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        C90418ik2 ik22 = new C90418ik2();
        bVar.f127066a = ik22;
        bVar.f127067b = new C90421jk2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-login";
        bVar.f127069d = 1029;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        ik22.f259576d = b;
        ik22.f259577e = linkedList;
        ik22.f259578f = 0;
        ik22.f259579g = "";
        ik22.f259580h = "";
        ik22.f259581i = 0;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C85511a(aVar, b));
    }
}
