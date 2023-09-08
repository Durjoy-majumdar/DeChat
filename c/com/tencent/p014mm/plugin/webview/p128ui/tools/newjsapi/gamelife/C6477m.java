package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import java.util.LinkedList;
import java.util.Map;
import rx3.C13604l;
import sx3.C90363p0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.m */
public final class C6477m<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23545d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23546e;

    public C6477m(C13855j jVar, C13851h1 h1Var) {
        this.f23545d = jVar;
        this.f23546e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        GetGamelifeContactData getGamelifeContactData = (GetGamelifeContactData) obj;
        if (getGamelifeContactData.f23496f) {
            LinkedList linkedList = new LinkedList();
            LinkedList<Map<String, String>> linkedList2 = getGamelifeContactData.f23494d;
            if (linkedList2 != null) {
                for (Map b : linkedList2) {
                    linkedList.add(C13851h1.C13852a.m13142b(b));
                }
            }
            Map b2 = C90363p0.m113143b(new C13604l("contacts", linkedList));
            C13849g gVar = this.f23545d.f39001d;
            String str = this.f23546e.f38990c;
            StringBuilder sb = new StringBuilder();
            C6457c.f23522d.getClass();
            sb.append(C6457c.f23524f);
            sb.append(" success");
            sb.append(getGamelifeContactData.f23495e);
            gVar.mo10774a(str, sb.toString(), b2);
            return;
        }
        C13849g gVar2 = this.f23545d.f39001d;
        String str2 = this.f23546e.f38990c;
        StringBuilder sb4 = new StringBuilder();
        C6457c.f23522d.getClass();
        sb4.append(C6457c.f23524f);
        sb4.append(" fail");
        sb4.append(getGamelifeContactData.f23495e);
        gVar2.mo10774a(str2, sb4.toString(), (Map<String, Object>) null);
    }
}
