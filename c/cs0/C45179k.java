package cs0;

import cs0.C45174j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import te3.C51309sw3;
import te3.v75;
import te3.w75;

/* renamed from: cs0.k */
public final class C45179k {

    /* renamed from: a */
    public final int f122485a;

    /* renamed from: b */
    public final ArrayList<C45174j> f122486b;

    public C45179k(v75 v75) {
        ArrayList arrayList;
        C45174j.C45178d dVar;
        C87412m.m108594g(v75, "usageInfo");
        ArrayList<C45174j> arrayList2 = new ArrayList<>();
        this.f122486b = arrayList2;
        w75 w75 = v75.f143381d;
        C87412m.m108593f(w75, "usageInfo.wxa_item");
        arrayList2.add(new C45174j.C45175a(w75));
        LinkedList<C51309sw3> linkedList = v75.f143381d.f143918g;
        if (linkedList != null) {
            for (C51309sw3 sw32 : linkedList) {
                if (sw32 != null) {
                    ArrayList<C45174j> arrayList3 = this.f122486b;
                    w75 w752 = v75.f143381d;
                    C87412m.m108593f(w752, "usageInfo.wxa_item");
                    arrayList3.add(new C45174j.C45178d(new C45166g0(w752, (w75) null, sw32)));
                }
            }
        }
        LinkedList<w75> linkedList2 = v75.f143382e;
        if (linkedList2 != null) {
            for (w75 w753 : linkedList2) {
                if (w753 != null) {
                    LinkedList<C51309sw3> linkedList3 = w753.f143918g;
                    if (linkedList3 != null) {
                        arrayList = new ArrayList();
                        for (C51309sw3 sw33 : linkedList3) {
                            if (sw33 != null) {
                                w75 w754 = v75.f143381d;
                                C87412m.m108593f(w754, "usageInfo.wxa_item");
                                dVar = new C45174j.C45178d(new C45166g0(w754, w753, sw33));
                            } else {
                                dVar = null;
                            }
                            if (dVar != null) {
                                arrayList.add(dVar);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (!(arrayList == null || arrayList.isEmpty())) {
                        ArrayList<C45174j> arrayList4 = this.f122486b;
                        String str = w753.f143916e;
                        arrayList4.add(new C45174j.C45177c(str == null ? "" : str));
                        this.f122486b.addAll(arrayList);
                    }
                }
            }
        }
        this.f122486b.add(C45174j.C45176b.f122482a);
        this.f122485a = this.f122486b.size();
    }
}
