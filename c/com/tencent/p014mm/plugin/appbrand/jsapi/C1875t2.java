package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.plugin.appbrand.jsapi.JsApiGamelifeManager;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import ob0.C89132b;
import rx3.C13598b0;
import sx3.C36907w;
import yy1.C53645g;
import yy1.C53653o;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.t2 */
public final class C1875t2<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ List<Map<String, Object>> f11714a;

    /* renamed from: b */
    public final /* synthetic */ C1256g<JsApiGamelifeManager.GetGameLifeRedCountData> f11715b;

    public C1875t2(List<Map<String, Object>> list, C1256g<JsApiGamelifeManager.GetGameLifeRedCountData> gVar) {
        this.f11714a = list;
        this.f11715b = gVar;
    }

    public Object call(Object obj) {
        int i;
        LinkedList<C53653o> linkedList = ((C53645g) ((C89132b.C89134c) obj).f256796d).f150695d;
        C87412m.m108593f(linkedList, "response.resp.session_info_list");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = linkedList.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (((C53653o) next).f150715j == 1) {
                i = 1;
            }
            if (i != 0) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            arrayList2.add(((C53653o) it4.next()).f150709d);
        }
        List<Map<String, Object>> list = this.f11714a;
        ArrayList arrayList3 = new ArrayList();
        for (T next2 : list) {
            Object obj2 = ((Map) next2).get("sessionId");
            C87412m.m108592e(obj2, "null cannot be cast to non-null type kotlin.String");
            if (arrayList2.contains((String) obj2)) {
                arrayList3.add(next2);
            }
        }
        ArrayList arrayList4 = new ArrayList(C36907w.m41090l(arrayList3, 10));
        Iterator it5 = arrayList3.iterator();
        while (it5.hasNext()) {
            Object obj3 = ((Map) it5.next()).get("unreadCount");
            C87412m.m108592e(obj3, "null cannot be cast to non-null type kotlin.Int");
            arrayList4.add(Integer.valueOf(((Integer) obj3).intValue()));
        }
        if (!arrayList4.isEmpty()) {
            Iterator it6 = arrayList4.iterator();
            if (it6.hasNext()) {
                Object next3 = it6.next();
                while (it6.hasNext()) {
                    next3 = Integer.valueOf(((Number) next3).intValue() + ((Number) it6.next()).intValue());
                }
                i = ((Number) next3).intValue();
            } else {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
        }
        String.valueOf(i);
        JsApiGamelifeManager.GetGameLifeRedCountData getGameLifeRedCountData = new JsApiGamelifeManager.GetGameLifeRedCountData(i, "get redcount", true);
        C1256g<JsApiGamelifeManager.GetGameLifeRedCountData> gVar = this.f11715b;
        if (gVar == null) {
            return null;
        }
        gVar.mo894a(getGameLifeRedCountData);
        return C13598b0.f38549a;
    }
}
