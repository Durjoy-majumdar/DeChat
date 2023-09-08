package rs1;

import com.tencent.p014mm.protocal.protobuf.FinderContact;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import ob0.C89132b;
import sx3.C36907w;
import te3.C51686ve0;
import te3.C51961xe0;

/* renamed from: rs1.n */
public final class C48081n {
    /* renamed from: a */
    public static final C48080m m53453a(C89132b.C89134c<C51961xe0> cVar) {
        ArrayList arrayList;
        C87412m.m108594g(cVar, "<this>");
        int i = cVar.f256793a;
        int i2 = cVar.f256794b;
        String str = cVar.f256795c;
        T t = cVar.f256796d;
        C87412m.m108593f(t, "this.resp");
        C48080m mVar = new C48080m(i, i2, str, (C51961xe0) t);
        mVar.setHasMore(((C51961xe0) cVar.f256796d).f144622e != 0);
        mVar.setLastBuffer(((C51961xe0) cVar.f256796d).f144623f);
        LinkedList<C51686ve0> linkedList = ((C51961xe0) cVar.f256796d).f144621d;
        if (linkedList != null) {
            ArrayList<C51686ve0> arrayList2 = new ArrayList<>();
            for (T next : linkedList) {
                if (!(((C51686ve0) next).f143450d == null)) {
                    arrayList2.add(next);
                }
            }
            arrayList = new ArrayList(C36907w.m41090l(arrayList2, 10));
            for (C51686ve0 ve02 : arrayList2) {
                FinderContact finderContact = ve02.f143450d;
                C87412m.m108591d(finderContact);
                String str2 = ve02.f143452f;
                if (str2 == null) {
                    str2 = "";
                }
                LinkedList<FinderObject> linkedList2 = ve02.f143451e;
                C87412m.m108593f(linkedList2, "item.`object`");
                arrayList.add(new C13310l(finderContact, str2, linkedList2));
            }
        } else {
            arrayList = null;
        }
        mVar.setIncrementList(arrayList);
        return mVar;
    }
}
