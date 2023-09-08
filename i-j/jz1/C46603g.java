package jz1;

import cz1.C7143c;
import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import rx3.C13598b0;

/* renamed from: jz1.g */
public final class C46603g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46595b f125513d;

    /* renamed from: e */
    public final /* synthetic */ List<C7143c> f125514e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46603g(C46595b bVar, List<C7143c> list) {
        super(0);
        this.f125513d = bVar;
        this.f125514e = list;
    }

    public Object invoke() {
        int itemCount = this.f125513d.getItemCount();
        this.f125513d.f125504g.addAll(this.f125514e);
        C46595b bVar = this.f125513d;
        bVar.getClass();
        bVar.notifyItemRangeInserted(itemCount, this.f125514e.size());
        return C13598b0.f38549a;
    }
}
