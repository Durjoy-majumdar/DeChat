package com.tencent.p014mm.plugin.brandservice.p028ui.timeline.item;

import com.tencent.p014mm.storage.C19623o0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import sx3.C36907w;
import te3.C22493dh;
import te3.C22495eh;
import te3.C48851bg;
import te3.C49559gh;
import te3.re4;

/* renamed from: com.tencent.mm.plugin.brandservice.ui.timeline.item.s */
public final class C18350s {
    /* renamed from: a */
    public static final C49559gh m18918a(C19623o0 o0Var) {
        C87412m.m108594g(o0Var, "<this>");
        C49559gh ghVar = new C49559gh();
        ghVar.f134043d = o0Var.field_msgId;
        re4 re4 = o0Var.f55530o1;
        ghVar.f134045f = re4.f64521j;
        ghVar.f134046g = re4.f64522n;
        ghVar.f134047h = re4.f64527s;
        LinkedList<C48851bg> linkedList = ghVar.f134044e;
        LinkedList<C22495eh> linkedList2 = o0Var.mo25774x2().f64523o.f63905g;
        C87412m.m108593f(linkedList2, "info.tlRecCardWrapper.extraInfo.BizInfo");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(linkedList2, 10));
        for (C22495eh ehVar : linkedList2) {
            C48851bg bgVar = new C48851bg();
            bgVar.f131091d = ehVar.f63794e;
            LinkedList<String> linkedList3 = bgVar.f131092e;
            LinkedList<C22493dh> linkedList4 = ehVar.f63800n;
            C87412m.m108593f(linkedList4, "info.AppMsg");
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList4, 10));
            for (C22493dh dhVar : linkedList4) {
                arrayList2.add(dhVar.f63755i);
            }
            linkedList3.addAll(arrayList2);
            arrayList.add(bgVar);
        }
        linkedList.addAll(arrayList);
        return ghVar;
    }
}
