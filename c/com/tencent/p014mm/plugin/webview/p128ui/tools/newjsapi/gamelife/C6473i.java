package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.i */
public final class C6473i<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23537d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23538e;

    public C6473i(C13855j jVar, C13851h1 h1Var) {
        this.f23537d = jVar;
        this.f23538e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        GamelifeGeneralReturnParam gamelifeGeneralReturnParam = (GamelifeGeneralReturnParam) obj;
        if (gamelifeGeneralReturnParam.f23492d) {
            C13849g gVar = this.f23537d.f39001d;
            String str = this.f23538e.f38990c;
            StringBuilder sb = new StringBuilder();
            C6457c.f23522d.getClass();
            sb.append(C6457c.f23524f);
            sb.append(":ok addConversation");
            sb.append(gamelifeGeneralReturnParam.f23493e);
            gVar.mo10774a(str, sb.toString(), (Map<String, Object>) null);
            return;
        }
        C13849g gVar2 = this.f23537d.f39001d;
        String str2 = this.f23538e.f38990c;
        StringBuilder sb4 = new StringBuilder();
        C6457c.f23522d.getClass();
        sb4.append(C6457c.f23524f);
        sb4.append(":fail addConversation");
        sb4.append(gamelifeGeneralReturnParam.f23493e);
        gVar2.mo10774a(str2, sb4.toString(), (Map<String, Object>) null);
    }
}
