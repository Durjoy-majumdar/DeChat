package ij2;

import fj2.C59106c;
import gy3.C87412m;
import java.util.LinkedList;
import nj3.C11182m0;
import nj3.C76874e0;
import qo3.C77407n;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C64563mr3;

/* renamed from: ij2.d */
public final class C60318d implements C11182m0 {

    /* renamed from: d */
    public final /* synthetic */ LinkedList<String> f171957d;

    /* renamed from: e */
    public final /* synthetic */ C64563mr3 f171958e;

    /* renamed from: f */
    public final /* synthetic */ C59106c f171959f;

    /* renamed from: g */
    public final /* synthetic */ C77407n f171960g;

    public C60318d(LinkedList<String> linkedList, C64563mr3 mr32, C60313c cVar, C59106c cVar2, C77407n nVar) {
        this.f171957d = linkedList;
        this.f171958e = mr32;
        this.f171959f = cVar2;
        this.f171960g = nVar;
    }

    public final void onCreateMMMenu(C76874e0 e0Var) {
        LinkedList<String> linkedList = this.f171957d;
        C64563mr3 mr32 = this.f171958e;
        C59106c cVar = this.f171959f;
        C77407n nVar = this.f171960g;
        int i = 0;
        for (T next : linkedList) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) next;
                LinkedList<String> linkedList2 = mr32.f184386j;
                C87412m.m108593f(linkedList2, "configItem.valueAlias");
                String str2 = (String) C110818d0.m150917O(linkedList2, i);
                if (str2 != null) {
                    e0Var.mo107144g(i, str + '(' + str2 + ')', 0);
                } else {
                    e0Var.mo107144g(i, String.valueOf(str), 0);
                }
                if (C87412m.m108589b(cVar.f169070g, str)) {
                    nVar.f225786q1 = i;
                }
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
    }
}
