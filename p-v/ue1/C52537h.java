package ue1;

import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import java.util.HashMap;
import java.util.List;
import rx3.C13598b0;

/* renamed from: ue1.h */
public final class C52537h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C52530g f146740d;

    /* renamed from: e */
    public final /* synthetic */ List<C52528f> f146741e;

    /* renamed from: f */
    public final /* synthetic */ boolean f146742f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52537h(C52530g gVar, List<C52528f> list, boolean z) {
        super(0);
        this.f146740d = gVar;
        this.f146741e = list;
        this.f146742f = z;
    }

    public Object invoke() {
        int itemCount = this.f146740d.getItemCount();
        List<C52528f> list = this.f146741e;
        C52530g gVar = this.f146740d;
        for (C52528f fVar : list) {
            if (!gVar.f146726g.containsKey(fVar.field_sessionId)) {
                HashMap<String, C52528f> hashMap = gVar.f146726g;
                String str = fVar.field_sessionId;
                C87412m.m108593f(str, "item.field_sessionId");
                hashMap.put(str, fVar);
                gVar.f146725f.add(fVar);
            }
        }
        if (this.f146742f) {
            this.f146740d.notifyDataSetChanged();
        } else {
            this.f146740d.mo73475N5(itemCount, this.f146741e.size());
        }
        return C13598b0.f38549a;
    }
}
