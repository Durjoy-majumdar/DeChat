package com.tencent.p014mm.plugin.webview.p128ui.tools.video.samelayer.finder;

import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Map;
import rx3.C13598b0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder.d */
public final class C6603d extends C87413o implements C32226l<IPCVoid, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23859d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23860e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6603d(C13855j jVar, C13851h1 h1Var) {
        super(1);
        this.f23859d = jVar;
        this.f23860e = h1Var;
    }

    public Object invoke(Object obj) {
        C87412m.m108594g((IPCVoid) obj, LocaleUtil.ITALIAN);
        Log.m105924i("MicroMsg.WebViewVideoFinderActionHandler", "operateFinderVideo callback");
        C13849g gVar = this.f23859d.f39001d;
        String str = this.f23860e.f38990c;
        gVar.mo10774a(str, this.f23860e.f38996i + ":ok", (Map<String, Object>) null);
        return C13598b0.f38549a;
    }
}
