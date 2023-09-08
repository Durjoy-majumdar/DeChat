package ry2;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.List;
import rx3.C13598b0;
import uy2.C52657a;

/* renamed from: ry2.d */
public final class C48184d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C48177a f129142d;

    /* renamed from: e */
    public final /* synthetic */ List<C52657a> f129143e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48184d(C48177a aVar, List<C52657a> list) {
        super(0);
        this.f129142d = aVar;
        this.f129143e = list;
    }

    public Object invoke() {
        int itemCount = this.f129142d.getItemCount();
        List<C52657a> list = this.f129143e;
        C48177a aVar = this.f129142d;
        for (C52657a aVar2 : list) {
            HashMap<String, C52657a> hashMap = aVar.f129127f;
            String str = aVar2.field_sessionId;
            C87412m.m108593f(str, "data.field_sessionId");
            hashMap.put(str, aVar2);
        }
        this.f129142d.f129126e.addAll(this.f129143e);
        this.f129142d.notifyItemRangeInserted(itemCount, this.f129143e.size());
        return C13598b0.f38549a;
    }
}
