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
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import p828wa.C53096b;
import te3.C49014ck2;
import te3.C49158dk2;
import te3.C49297ek2;
import te3.C49713hj2;
import te3.C90411fk2;
import wm0.C91035a;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g */
public class C43608g extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g$a */
    public class C43609a implements C40324j.C40326a {

        /* renamed from: a */
        public final /* synthetic */ C53096b.C53097a f117860a;

        /* renamed from: b */
        public final /* synthetic */ String f117861b;

        /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g$a$a */
        public class C43610a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ LinkedList f117863d;

            /* renamed from: e */
            public final /* synthetic */ String f117864e;

            /* renamed from: f */
            public final /* synthetic */ String f117865f;

            /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.g$a$a$a */
            public class C43611a implements C85590k1.C85591a {
                public C43611a() {
                }

                /* renamed from: a */
                public void mo67901a(int i, Bundle bundle) {
                    Log.m105925i("MicroMsg.JsApiAuthorize", "stev onRevMsg resultCode %d", Integer.valueOf(i));
                    if (i == 1 || i == 2) {
                        C43609a aVar = C43609a.this;
                        C43608g gVar = C43608g.this;
                        String str = aVar.f117861b;
                        C53096b.C53097a aVar2 = aVar.f117860a;
                        gVar.getClass();
                        LinkedList<String> linkedList = new LinkedList<>();
                        Iterator it = ((ArrayList) bundle.getSerializable("key_scope")).iterator();
                        while (it.hasNext()) {
                            linkedList.add((String) it.next());
                        }
                        C47350c.C47352b bVar = new C47350c.C47352b();
                        C49014ck2 ck22 = new C49014ck2();
                        bVar.f127066a = ck22;
                        bVar.f127067b = new C49158dk2();
                        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-authorize-confirm";
                        bVar.f127069d = C91035a.CTRL_INDEX;
                        bVar.f127070e = 0;
                        bVar.f127071f = 0;
                        ck22.f131795d = str;
                        ck22.f131796e = linkedList;
                        ck22.f131798g = 0;
                        ck22.f131797f = i;
                        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C43612h(gVar, aVar2, i));
                        if (i == 2) {
                            C43609a.this.f117860a.mo73778c("auth_deny", (JSONObject) null);
                            return;
                        }
                        return;
                    }
                    Log.m105918d("MicroMsg.JsApiAuthorize", "press back button!");
                    C43609a.this.f117860a.mo73778c("auth_cancel", (JSONObject) null);
                }
            }

            public C43610a(LinkedList linkedList, String str, String str2) {
                this.f117863d = linkedList;
                this.f117864e = str;
                this.f117865f = str2;
            }

            public void run() {
                C85590k1 k1Var = new C85590k1(((C43658n) C43609a.this.f117860a.f148189a).f148196d);
                C43611a aVar = new C43611a();
                LinkedList linkedList = this.f117863d;
                if (linkedList == null || linkedList.size() <= 0) {
                    Log.m105920e("MicroMsg.JsApiAuthorize", "scopeInfoList is empty!");
                    C43609a.this.f117860a.mo73778c("fail", (JSONObject) null);
                } else if (!k1Var.mo119057a(this.f117863d, this.f117864e, this.f117865f, (String) null, aVar)) {
                    C43609a.this.f117860a.mo73778c("fail", (JSONObject) null);
                }
            }
        }

        public C43609a(C53096b.C53097a aVar, String str) {
            this.f117860a = aVar;
            this.f117861b = str;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C49713hj2 hj22;
            Log.m105925i("MicroMsg.JsApiAuthorize", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", Integer.valueOf(i), Integer.valueOf(i2), str);
            if (i == 0 && i2 == 0) {
                C90411fk2 fk22 = (C90411fk2) cVar.f127056b.f127083a;
                if (fk22 == null || (hj22 = fk22.f259514d) == null) {
                    this.f117860a.mo73778c("fail", (JSONObject) null);
                    return;
                }
                int i3 = hj22.f134688d;
                String str2 = hj22.f134689e;
                Log.m105925i("MicroMsg.JsApiAuthorize", "jsErrcode = %d", Integer.valueOf(i3));
                if (i3 == -12000) {
                    MMHandlerThread.postToMainThread(new C43610a(fk22.f259515e, fk22.f259516f, fk22.f259517g));
                } else if (i3 == 0) {
                    this.f117860a.mo73776a();
                } else {
                    Log.m105921e("MicroMsg.JsApiAuthorize", "ERROR = %s", str2);
                    this.f117860a.mo73778c("fail", (JSONObject) null);
                }
            } else {
                this.f117860a.mo73778c("fail", (JSONObject) null);
            }
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "authorize";
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
        Log.m105924i("MicroMsg.JsApiAuthorize", "invokeInOwn");
        JSONArray optJSONArray = aVar.f148190b.f129368c.optJSONArray("scope");
        if (optJSONArray == null) {
            Log.m105920e("MicroMsg.JsApiAuthorize", "scope is null!");
            aVar.mo73778c("fail", (JSONObject) null);
            return;
        }
        String b = ((C43658n) aVar.f148189a).f117923M.mo67920b();
        if (Util.isNullOrNil(b)) {
            Log.m105920e("MicroMsg.JsApiAuthorize", "appId is null!");
            aVar.mo73778c("fail", (JSONObject) null);
            return;
        }
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < optJSONArray.length(); i++) {
            linkedList.add(optJSONArray.optString(i));
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49297ek2 ek22 = new C49297ek2();
        bVar.f127066a = ek22;
        bVar.f127067b = new C90411fk2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-authorize";
        bVar.f127069d = 1157;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        ek22.f132983d = b;
        ek22.f132984e = linkedList;
        ek22.f132985f = 0;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(bVar.mo72403a(), new C43609a(aVar, b));
    }
}
