package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import java.util.Map;
import rx3.C13604l;
import sx3.C90363p0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.o */
public final class C6479o<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23549d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23550e;

    public C6479o(C13855j jVar, C13851h1 h1Var) {
        this.f23549d = jVar;
        this.f23550e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        GetGamelifeSessionIdData getGamelifeSessionIdData = (GetGamelifeSessionIdData) obj;
        if (getGamelifeSessionIdData.f23502f) {
            Map b = C90363p0.m113143b(new C13604l("sessionId", getGamelifeSessionIdData.f23500d));
            C13849g gVar = this.f23549d.f39001d;
            String str = this.f23550e.f38990c;
            StringBuilder sb = new StringBuilder();
            C6457c.f23522d.getClass();
            sb.append(C6457c.f23524f);
            sb.append(" success");
            sb.append(getGamelifeSessionIdData.f23501e);
            gVar.mo10774a(str, sb.toString(), b);
            return;
        }
        C13849g gVar2 = this.f23549d.f39001d;
        String str2 = this.f23550e.f38990c;
        StringBuilder sb4 = new StringBuilder();
        C6457c.f23522d.getClass();
        sb4.append(C6457c.f23524f);
        sb4.append(" fail");
        sb4.append(getGamelifeSessionIdData.f23501e);
        gVar2.mo10774a(str2, sb4.toString(), (Map<String, Object>) null);
    }
}
