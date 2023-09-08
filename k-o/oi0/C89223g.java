package oi0;

import gy3.C87412m;
import java.util.Iterator;
import java.util.LinkedList;
import oi0.C89215e;
import rx3.C36570n;

/* renamed from: oi0.g */
public final class C89223g implements C89215e.C89216a {

    /* renamed from: a */
    public final /* synthetic */ C89217f f257091a;

    public C89223g(C89217f fVar) {
        this.f257091a = fVar;
    }

    /* renamed from: a */
    public final void mo123545a(float f, float f2) {
        Iterator it = ((LinkedList) ((C36570n) this.f257091a.f257075c).getValue()).iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            C89217f fVar = this.f257091a;
            C87412m.m108593f(num, "item");
            fVar.mo123546b(num.intValue(), f, f2);
        }
        ((LinkedList) ((C36570n) this.f257091a.f257075c).getValue()).clear();
    }
}
