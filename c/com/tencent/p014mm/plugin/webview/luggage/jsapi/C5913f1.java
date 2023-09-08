package com.tencent.p014mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import c02.C92331c;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.plugin.webview.luggage.C43603j1;
import com.tencent.p014mm.plugin.webview.luggage.C43633m1;
import com.tencent.p014mm.plugin.webview.luggage.C43658n;
import com.tencent.p014mm.plugin.webview.luggage.jsapi.C43620m2;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c;
import com.tencent.p014mm.protocal.JsapiPermissionWrapper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import fk0.C86911c;
import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C47350c;
import org.json.JSONArray;
import org.json.JSONObject;
import p828wa.C53096b;
import qe3.C25549c;
import te3.C49713hj2;
import te3.C51702vj2;
import te3.C51842wj2;
import te3.wp4;
import w93.C53091f;

/* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.f1 */
public class C5913f1 extends C5954n2<C43658n> {

    /* renamed from: com.tencent.mm.plugin.webview.luggage.jsapi.f1$a */
    public static class C5914a implements C40324j.C40326a {

        /* renamed from: a */
        public C53096b<C43658n>.a f22143a;

        /* renamed from: b */
        public String f22144b;

        public C5914a(C53096b<C43658n>.a aVar, String str) {
            this.f22143a = aVar;
            this.f22144b = str;
        }

        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            C49713hj2 hj22;
            int i3;
            C53096b<C43658n>.a aVar = this.f22143a;
            if (aVar != null) {
                if (i == 0 && i2 == 0) {
                    C51842wj2 wj22 = (C51842wj2) cVar.f127056b.f127083a;
                    if (wj22 == null || (hj22 = wj22.f144090d) == null || hj22.f134688d != 0) {
                        mo6936b(str);
                        return;
                    }
                    C43633m1 m1Var = ((C43658n) aVar.f148189a).f117923M;
                    String str2 = this.f22144b;
                    m1Var.getClass();
                    if (!Util.isNullOrNil(str2) && !Util.isNullOrNil(m1Var.f117892d.mo67943v())) {
                        m1Var.f117889a.put(m1Var.mo67919a(m1Var.f117892d.mo67943v()), str2);
                    }
                    C43633m1 m1Var2 = ((C43658n) this.f22143a.f148189a).f117923M;
                    String str3 = this.f22144b;
                    String str4 = wj22.f144093g;
                    m1Var2.getClass();
                    if (!Util.isNullOrNil(str3) && !Util.isNullOrNil(str4)) {
                        m1Var2.f117891c.put(str3, str4);
                    }
                    C6210c.C6215d dVar = new C6210c.C6215d(this.f22144b, wj22);
                    C43633m1 m1Var3 = ((C43658n) this.f22143a.f148189a).f117923M;
                    if (!Util.isNullOrNil(m1Var3.f117892d.mo67943v())) {
                        m1Var3.f117890b.put(m1Var3.mo67919a(m1Var3.f117892d.mo67943v()), dVar);
                    }
                    LinkedList<wp4> linkedList = wj22.f144091e;
                    CONTEXT context = this.f22143a.f148189a;
                    JsapiPermissionWrapper g = ((C43658n) context).f117922L.mo70841g(((C43658n) context).mo67943v());
                    if (g == null) {
                        mo6936b("");
                        return;
                    }
                    if (!Util.isNullOrNil((List) linkedList)) {
                        Iterator<wp4> it = linkedList.iterator();
                        while (it.hasNext()) {
                            wp4 next = it.next();
                            C25549c.C12172h b = C25549c.m33051b(next.f144209d);
                            if (!(b == null || g.mo69443d(b.f35270c) == (i3 = next.f144210e))) {
                                g.mo69449h(b.f35270c, (byte) i3);
                            }
                        }
                    }
                    if (((C43658n) this.f22143a.f148189a).f117916F != null) {
                        Log.m105925i("MicroMsg.JsApiPreVerify", "updateFloatBallIcon:%s", wj22.f144093g);
                        ((C43658n) this.f22143a.f148189a).f117916F.mo149076p0(wj22.f144093g);
                    }
                    if (((C43658n) this.f22143a.f148189a).f117917G != null) {
                        Log.m105925i("MicroMsg.JsApiPreVerify", "updateFloatBallIcon:%s", wj22.f144093g);
                        C43603j1 j1Var = ((C43658n) this.f22143a.f148189a).f117917G;
                        String str5 = wj22.f144093g;
                        j1Var.getClass();
                        C87412m.m108594g(str5, "icon");
                        if (j1Var.f117857w == null) {
                            j1Var.mo160076N(str5);
                        }
                    }
                    CONTEXT context2 = this.f22143a.f148189a;
                    if (((C43658n) context2).f117918H != null) {
                        ((C43658n) context2).f117918H.setIcon(Util.nullAsNil(wj22.f144093g));
                        ((C92331c) C86312j.m106911c(C92331c.class)).Gg0(((C43658n) this.f22143a.f148189a).f117918H);
                    }
                    mo6936b("");
                    return;
                }
                Log.m105921e("MicroMsg.JsApiPreVerify", "errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
                mo6936b(str);
            }
        }

        /* renamed from: b */
        public final void mo6936b(String str) {
            if (Util.isNullOrNil(str)) {
                this.f22143a.mo73776a();
            } else {
                this.f22143a.mo73778c(str, (JSONObject) null);
            }
            C53091f.m59457l(((C43658n) this.f22143a.f148189a).mo67941t(), System.currentTimeMillis());
            this.f22143a = null;
            this.f22144b = null;
        }
    }

    /* renamed from: b */
    public String mo5382b() {
        return "preVerifyJSAPI";
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
        C53096b<C43658n>.a aVar2 = aVar;
        Log.m105924i("MicroMsg.JsApiPreVerify", "invokeInOwn");
        C53091f.m59458m(((C43658n) aVar2.f148189a).mo67941t(), System.currentTimeMillis());
        JSONObject jSONObject = aVar2.f148190b.f129368c;
        String optString = jSONObject.optString("verifyAppId");
        String optString2 = jSONObject.optString("verifySignature");
        String optString3 = jSONObject.optString("verifyNonceStr");
        String optString4 = jSONObject.optString("verifyTimestamp");
        String optString5 = jSONObject.optString("verifySignType");
        JSONArray optJSONArray = jSONObject.optJSONArray("verifyJsApiList");
        Log.m105925i("MicroMsg.JsApiPreVerify", "appid : %s, %s, %s, %s, %s", optString, optString2, optString3, optString4, optString5);
        String v = ((C43658n) aVar2.f148189a).mo67943v();
        LinkedList<String> linkedList = new LinkedList<>();
        try {
            Log.m105925i("MicroMsg.JsApiPreVerify", "jsItem length %s", Integer.valueOf(optJSONArray.length()));
            if (optJSONArray.length() == 0) {
                aVar2.mo73778c("checkJsApi:param is empty", (JSONObject) null);
                return;
            }
            for (int i = 0; i < optJSONArray.length(); i++) {
                String string = optJSONArray.getString(i);
                if (!Util.isNullOrNil(string)) {
                    linkedList.add(string);
                }
            }
            if (Util.isNullOrNil(optString) || linkedList.size() <= 0 || Util.isNullOrNil(v)) {
                Log.m105921e("MicroMsg.JsApiPreVerify", "handlePreVerify wrong args, %s", optString);
                aVar2.mo73778c("pre_verify_jsapi:fail_invalid_args", (JSONObject) null);
                return;
            }
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127066a = new C51702vj2();
            bVar.f127067b = new C51842wj2();
            bVar.f127068c = "/cgi-bin/mmbiz-bin/jsapi-preverify";
            bVar.f127069d = C86911c.CTRL_INDEX;
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            C51702vj2 vj22 = (C51702vj2) a.f127055a.f127080a;
            vj22.f143514d = v;
            vj22.f143515e = optString;
            vj22.f143516f = linkedList;
            vj22.f143517g = optString4;
            vj22.f143518h = optString3;
            vj22.f143519i = optString2;
            vj22.f143520j = optString5;
            ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C5914a(aVar2, optString));
        } catch (Exception e) {
            Log.m105928w("MicroMsg.JsApiPreVerify", "exception occur " + e.getMessage());
            aVar.mo73776a();
        }
    }
}
