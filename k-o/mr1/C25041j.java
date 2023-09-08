package mr1;

import fy3.C32224a;
import gy3.C87413o;
import mr1.C25026b;
import rx3.C13598b0;
import sx3.C110818d0;

/* renamed from: mr1.j */
public final class C25041j extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C25026b f71466d;

    /* renamed from: e */
    public final /* synthetic */ String f71467e;

    /* renamed from: f */
    public final /* synthetic */ long f71468f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25041j(C25026b bVar, String str, long j) {
        super(0);
        this.f71466d = bVar;
        this.f71467e = str;
        this.f71468f = j;
    }

    public Object invoke() {
        C25026b.C25029d dVar = this.f71466d.f71362c.get(this.f71467e);
        if (dVar != null) {
            long j = this.f71468f;
            if (!dVar.f71416c && !dVar.f71419f.isEmpty()) {
                C25026b.C25027a aVar = (C25026b.C25027a) C110818d0.m150923U(dVar.f71419f);
                if (!aVar.f71368A && j > 50) {
                    aVar.f71385R.add(Integer.valueOf((int) (j / ((long) 100))));
                }
            }
            C13598b0 b0Var = C13598b0.f38549a;
        }
        return C13598b0.f38549a;
    }
}
