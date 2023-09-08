package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.k */
public final class C6475k<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23541d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23542e;

    public C6475k(C13855j jVar, C13851h1 h1Var) {
        this.f23541d = jVar;
        this.f23542e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        GamelifeGeneralReturnParam gamelifeGeneralReturnParam = (GamelifeGeneralReturnParam) obj;
        if (gamelifeGeneralReturnParam.f23492d) {
            C13849g gVar = this.f23541d.f39001d;
            String str = this.f23542e.f38990c;
            StringBuilder sb = new StringBuilder();
            C6457c.f23522d.getClass();
            sb.append(C6457c.f23524f);
            sb.append(" success");
            sb.append(gamelifeGeneralReturnParam.f23493e);
            gVar.mo10774a(str, sb.toString(), (Map<String, Object>) null);
            return;
        }
        C13849g gVar2 = this.f23541d.f39001d;
        String str2 = this.f23542e.f38990c;
        StringBuilder sb4 = new StringBuilder();
        C6457c.f23522d.getClass();
        sb4.append(C6457c.f23524f);
        sb4.append(" fail");
        sb4.append(gamelifeGeneralReturnParam.f23493e);
        gVar2.mo10774a(str2, sb4.toString(), (Map<String, Object>) null);
    }
}
