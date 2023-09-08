package com.tencent.p014mm.plugin.finder.p056ui;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.LinkedList;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C36907w;

/* renamed from: com.tencent.mm.plugin.finder.ui.f2 */
public final class C3794f2 extends C87413o implements C32226l<LinkedList<FinderContact>, Object> {

    /* renamed from: d */
    public final /* synthetic */ FinderPostAtUI f17269d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3794f2(FinderPostAtUI finderPostAtUI) {
        super(1);
        this.f17269d = finderPostAtUI;
    }

    public Object invoke(Object obj) {
        LinkedList<FinderContact> linkedList = (LinkedList) obj;
        FinderPostAtUI finderPostAtUI = this.f17269d;
        C89349b bVar = finderPostAtUI.f17005r;
        if (bVar != null) {
            return bVar;
        }
        if (linkedList == null) {
            return null;
        }
        if (finderPostAtUI.f17002o.isEmpty()) {
            ArrayList<C58969q> arrayList = finderPostAtUI.f17002o;
            ArrayList arrayList2 = new ArrayList(C36907w.m41090l(linkedList, 10));
            for (FinderContact f : linkedList) {
                arrayList2.add(C58960c.m68834f(f, (C58969q) null, false, 3, (Object) null));
            }
            arrayList.addAll(arrayList2);
        }
        return C13598b0.f38549a;
    }
}
