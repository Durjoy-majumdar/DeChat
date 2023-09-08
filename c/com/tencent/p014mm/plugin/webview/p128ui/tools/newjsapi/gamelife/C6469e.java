package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi.gamelife;

import com.tencent.p014mm.ipcinvoker.C1256g;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C36907w;
import yy1.C53645g;
import yy1.C53653o;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife.e */
public final class C6469e<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ List<GamelifeConversationData> f23530a;

    /* renamed from: b */
    public final /* synthetic */ C1256g<GetGamelifeConversationData> f23531b;

    public C6469e(List<GamelifeConversationData> list, C1256g<GetGamelifeConversationData> gVar) {
        this.f23530a = list;
        this.f23531b = gVar;
    }

    public Object call(Object obj) {
        LinkedList<C53653o> linkedList = ((C53645g) ((C89132b.C89134c) obj).f256796d).f150695d;
        C87412m.m108593f(linkedList, "response.resp.session_info_list");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = linkedList.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((C53653o) next).f150715j != 1) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((C53653o) it4.next()).f150709d);
        }
        List<GamelifeConversationData> list = this.f23530a;
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : list) {
            if (arrayList2.contains(((GamelifeConversationData) next2).f23484d)) {
                arrayList3.add(next2);
            }
        }
        GetGamelifeConversationData getGamelifeConversationData = new GetGamelifeConversationData(arrayList3, "get conversationList", true);
        C1256g<GetGamelifeConversationData> gVar = this.f23531b;
        if (gVar == null) {
            return null;
        }
        gVar.mo894a(getGamelifeConversationData);
        return C13598b0.f38549a;
    }
}
