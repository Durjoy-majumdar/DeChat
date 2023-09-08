package ew2;

import fy3.C32224a;
import fy3.C32229r;
import gy3.C8479f0;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import kw2.C99263b;
import rx3.C13598b0;

/* renamed from: ew2.d */
public final class C97768d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<C99263b> f286843d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97768d(C8479f0<C99263b> f0Var) {
        super(0);
        this.f286843d = f0Var;
    }

    public Object invoke() {
        ArrayList<C32229r<Long, Boolean, String, String, C13598b0>> arrayList = C97758b.f286829p;
        C8479f0<C99263b> f0Var = this.f286843d;
        Iterator<C32229r<Long, Boolean, String, String, C13598b0>> it = arrayList.iterator();
        while (it.hasNext()) {
            Long valueOf = Long.valueOf(((C99263b) f0Var.f27484d).field_storyId);
            Boolean bool = Boolean.TRUE;
            C99263b bVar = (C99263b) f0Var.f27484d;
            it.next().mo162I(valueOf, bool, bVar.f291056x, bVar.f291057y);
        }
        return C13598b0.f38549a;
    }
}
