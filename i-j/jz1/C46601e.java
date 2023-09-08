package jz1;

import cz1.C7143c;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: jz1.e */
public final class C46601e extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C46595b f125509d;

    /* renamed from: e */
    public final /* synthetic */ List<C7143c> f125510e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46601e(C46595b bVar, List<C7143c> list) {
        super(0);
        this.f125509d = bVar;
        this.f125510e = list;
    }

    public Object invoke() {
        int size = this.f125509d.f125504g.size();
        this.f125509d.f125504g.clear();
        C46595b bVar = this.f125509d;
        bVar.getClass();
        bVar.notifyItemRangeRemoved(0, size);
        C46595b bVar2 = this.f125509d;
        List<C7143c> list = this.f125510e;
        bVar2.getClass();
        C87412m.m108594g(list, "data");
        C61926c.m72668M(new C46603g(bVar2, list));
        return C13598b0.f38549a;
    }
}
