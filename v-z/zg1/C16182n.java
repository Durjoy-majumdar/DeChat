package zg1;

import fj1.C45795b;
import gy3.C87412m;
import java.util.LinkedList;
import pe3.C89349b;
import sx3.C110818d0;
import te3.C52013xs0;
import te3.C52168yu0;
import yg1.C16006g;

/* renamed from: zg1.n */
public final class C16182n extends C16006g {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16182n(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* renamed from: d */
    public void mo14632d(LinkedList<C52013xs0> linkedList) {
        C87412m.m108594g(linkedList, "msgList");
        C52013xs0 xs02 = (C52013xs0) C110818d0.m150925W(linkedList);
        C52168yu0 yu02 = new C52168yu0();
        if (xs02 != null) {
            byte[] bArr = null;
            if (!(xs02.f144906h != null)) {
                xs02 = null;
            }
            if (xs02 != null) {
                C89349b bVar = xs02.f144906h;
                if (bVar != null) {
                    bArr = bVar.mo123703f();
                }
                yu02.parseFrom(bArr);
            }
        }
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20061};
    }
}
