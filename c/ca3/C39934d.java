package ca3;

import android.content.Context;
import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.xweb.file.XVFSFile;
import fl0.C86918c;
import gy3.C87412m;
import java.util.Map;
import org.json.JSONObject;
import p830xc.C91165a;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import z04.C112551y;

/* renamed from: ca3.d */
public final class C39934d implements C91165a {

    /* renamed from: a */
    public final C13855j f107067a;

    /* renamed from: b */
    public final C13851h1 f107068b;

    public C39934d(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        this.f107067a = jVar;
        this.f107068b = h1Var;
    }

    /* renamed from: a */
    public void mo62538a(C91165a.C53318a aVar) {
        Context context = this.f107067a.f38998a;
        if (context instanceof C39933c) {
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.video.samelayer.IWebViewUILifeCycle");
            ((C39933c) context).mo62536W4(aVar);
        }
    }

    /* renamed from: b */
    public JSONObject mo62539b() {
        JSONObject jSONObject = this.f107068b.f38991d;
        C87412m.m108593f(jSONObject, "msg.rawParams");
        return jSONObject;
    }

    /* renamed from: c */
    public void mo62540c(C91165a.C53318a aVar) {
        Context context = this.f107067a.f38998a;
        if ((context instanceof C39933c) && aVar != null) {
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.video.samelayer.IWebViewUILifeCycle");
            ((C39933c) context).mo62537f1(aVar);
        }
    }

    /* renamed from: d */
    public boolean mo62541d() {
        return false;
    }

    /* renamed from: e */
    public boolean mo62542e() {
        String optString = mo62539b().optString("action", "");
        if (optString != null) {
            return C112551y.m153819s(optString, "insert", false);
        }
        return false;
    }

    /* renamed from: f */
    public String mo62543f() {
        String str = this.f107068b.f38996i;
        C87412m.m108593f(str, "msg.function");
        return str;
    }

    /* renamed from: g */
    public C82381f mo62544g() {
        return null;
    }

    public String getAppId() {
        return "";
    }

    public Context getContext() {
        return this.f107067a.f38998a;
    }

    /* renamed from: h */
    public String mo62547h(C86918c cVar, Map map) {
        mo62550k(cVar.f252305b, map);
        return null;
    }

    /* renamed from: i */
    public void mo62548i() {
    }

    /* renamed from: j */
    public String mo62549j(String str) {
        C13849g gVar = this.f107067a.f39001d;
        String str2 = this.f107068b.f38990c;
        gVar.mo10774a(str2, this.f107068b.f38996i + XVFSFile.PATH_SEPARATOR_CHAR + str, (Map<String, Object>) null);
        return null;
    }

    /* renamed from: k */
    public String mo62550k(String str, Map<String, ? extends Object> map) {
        C13849g gVar = this.f107067a.f39001d;
        String str2 = this.f107068b.f38990c;
        gVar.mo10774a(str2, this.f107068b.f38996i + XVFSFile.PATH_SEPARATOR_CHAR + str, map);
        return null;
    }

    /* renamed from: l */
    public String mo62551l(C86918c cVar) {
        mo62549j(cVar.f252305b);
        return null;
    }

    /* renamed from: m */
    public String mo62552m(String str, C86918c cVar) {
        mo62549j(str);
        return null;
    }
}
