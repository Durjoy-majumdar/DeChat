package com.tencent.p014mm.mj_template.sns.compose.widget;

import fy3.C32224a;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import sx3.C36907w;
import te3.o74;
import te3.p74;

/* renamed from: com.tencent.mm.mj_template.sns.compose.widget.w */
public final class C40341w extends C87413o implements C32224a<List<? extends String>> {

    /* renamed from: d */
    public final /* synthetic */ o74 f108425d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40341w(o74 o74) {
        super(0);
        this.f108425d = o74;
    }

    public Object invoke() {
        o74 o74 = this.f108425d;
        LinkedList<p74> linkedList = o74.f139011i;
        if (linkedList == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (T next : linkedList) {
            if (((p74) next).f139631d >= o74.f139008f) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C36907w.m41090l(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((p74) it.next()).f139632e);
        }
        return arrayList2;
    }
}
