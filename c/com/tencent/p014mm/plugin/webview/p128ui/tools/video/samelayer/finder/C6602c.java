package com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder;

import com.tencent.p014mm.ipcinvoker.type.IPCLong;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import o40.C61926c;
import rx3.C13598b0;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.c */
public final class C6602c extends C87413o implements C32226l<IPCLong, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23857d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23858e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6602c(C13855j jVar, C13851h1 h1Var) {
        super(1);
        this.f23857d = jVar;
        this.f23858e = h1Var;
    }

    public Object invoke(Object obj) {
        IPCLong iPCLong = (IPCLong) obj;
        C87412m.m108594g(iPCLong, "result");
        String p = C61926c.m72691p(iPCLong.f10314d);
        Log.m105924i("MicroMsg.WebViewVideoFinderActionHandler", "getFinderPlayInfo callback localFeedId: " + p);
        HashMap hashMap = new HashMap();
        hashMap.put("localFeedId", p);
        C13598b0 b0Var = C13598b0.f38549a;
        this.f23857d.f39001d.mo10774a(this.f23858e.f38990c, this.f23858e.f38996i + ":ok", hashMap);
        return C13598b0.f38549a;
    }
}
