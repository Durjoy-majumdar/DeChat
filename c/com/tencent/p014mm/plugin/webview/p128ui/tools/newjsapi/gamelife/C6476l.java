package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C90364q0;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.l */
public final class C6476l<T> implements C1256g {

    /* renamed from: d */
    public final /* synthetic */ C13855j f23543d;

    /* renamed from: e */
    public final /* synthetic */ C13851h1 f23544e;

    public C6476l(C13855j jVar, C13851h1 h1Var) {
        this.f23543d = jVar;
        this.f23544e = h1Var;
    }

    /* renamed from: a */
    public void mo894a(Object obj) {
        GetGamelifeConversationData getGamelifeConversationData = (GetGamelifeConversationData) obj;
        if (getGamelifeConversationData.f23499f) {
            LinkedList linkedList = new LinkedList();
            List<GamelifeConversationData> list = getGamelifeConversationData.f23497d;
            if (list != null) {
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (GamelifeConversationData gamelifeConversationData : list) {
                    arrayList.add(Boolean.valueOf(linkedList.add(C13851h1.C13852a.m13142b(C90364q0.m113147f(new C13604l("sessionId", gamelifeConversationData.f23484d), new C13604l("unreadCount", Integer.valueOf(gamelifeConversationData.f23485e)), new C13604l("lastMsgUpdateTime", Integer.valueOf(gamelifeConversationData.f23486f)), new C13604l("draftMsg", gamelifeConversationData.f23487g), new C13604l("draftMsgTime", Integer.valueOf(gamelifeConversationData.f23488h)), new C13604l("selfUsername", gamelifeConversationData.f23489i), new C13604l("talker", gamelifeConversationData.f23490j), new C13604l("digest", gamelifeConversationData.f23491n))))));
                }
            }
            HashMap hashMap = new HashMap();
            hashMap.put("conversationList", linkedList);
            C13849g gVar = this.f23543d.f39001d;
            String str = this.f23544e.f38990c;
            StringBuilder sb = new StringBuilder();
            C6457c.f23522d.getClass();
            sb.append(C6457c.f23524f);
            sb.append(":ok ");
            sb.append(getGamelifeConversationData.f23498e);
            gVar.mo10774a(str, sb.toString(), hashMap);
            return;
        }
        C13849g gVar2 = this.f23543d.f39001d;
        String str2 = this.f23544e.f38990c;
        StringBuilder sb4 = new StringBuilder();
        C6457c.f23522d.getClass();
        sb4.append(C6457c.f23524f);
        sb4.append(":fail ");
        sb4.append(getGamelifeConversationData.f23498e);
        gVar2.mo10774a(str2, sb4.toString(), (Map<String, Object>) null);
    }
}
