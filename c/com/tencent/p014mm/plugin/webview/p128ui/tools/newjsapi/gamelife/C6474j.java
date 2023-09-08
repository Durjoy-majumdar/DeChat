package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import java.util.Map;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.j */
public final class C6474j<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23539d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23540e;

    public C6474j(C13855j jVar, C13851h1 h1Var) {
        this.f23539d = jVar;
        this.f23540e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        if (((IPCBoolean) obj).f10312d) {
            C13849g gVar = this.f23539d.f39001d;
            String str = this.f23540e.f38990c;
            StringBuilder sb = new StringBuilder();
            C6457c.f23522d.getClass();
            sb.append(C6457c.f23524f);
            sb.append(":ok deleteConversation");
            gVar.mo10774a(str, sb.toString(), (Map<String, Object>) null);
            return;
        }
        C13849g gVar2 = this.f23539d.f39001d;
        String str2 = this.f23540e.f38990c;
        StringBuilder sb4 = new StringBuilder();
        C6457c.f23522d.getClass();
        sb4.append(C6457c.f23524f);
        sb4.append(":fail deleteConversation");
        gVar2.mo10774a(str2, sb4.toString(), (Map<String, Object>) null);
    }
}
