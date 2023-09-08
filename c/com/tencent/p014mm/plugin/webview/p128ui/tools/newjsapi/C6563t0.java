package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8477a0;
import gy3.C87412m;
import java.util.HashMap;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.t0 */
public final class C6563t0<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ HashMap<String, Object> f23771d;

    /* renamed from: e */
    public final /* synthetic */ C8477a0 f23772e;

    /* renamed from: f */
    public final /* synthetic */ C13855j f23773f;

    /* renamed from: g */
    public final /* synthetic */ C13851h1 f23774g;

    public C6563t0(HashMap<String, Object> hashMap, C8477a0 a0Var, C13855j jVar, C13851h1 h1Var) {
        this.f23771d = hashMap;
        this.f23772e = a0Var;
        this.f23773f = jVar;
        this.f23774g = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        HashMap<String, Object> hashMap = this.f23771d;
        String str = ((IPCString) obj).f10315d;
        C87412m.m108593f(str, "result.value");
        hashMap.put("temporaryVisitInfoList", str);
        Log.m105924i("MicroMsg.JsApiHandleMPPageAction", "getTeenModeTemporaryVisitInfo isValidVisit=" + this.f23772e.f27482d + ", temporaryVisitInfoList=" + this.f23771d.get("temporaryVisitInfoList"));
        C13849g gVar = this.f23773f.f39001d;
        String str2 = this.f23774g.f38990c;
        gVar.mo10774a(str2, this.f23774g.f38996i + ":ok", this.f23771d);
    }
}
