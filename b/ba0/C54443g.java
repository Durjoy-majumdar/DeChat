package ba0;

import fy3.C32227p;
import gy3.C87413o;
import la0.C61242a;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: ba0.g */
public final class C54443g extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C54438d f152693d;

    /* renamed from: e */
    public final /* synthetic */ C61242a f152694e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54443g(C54438d dVar, C61242a aVar) {
        super(2);
        this.f152693d = dVar;
        this.f152694e = aVar;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            C104075a.m138825c(new C54442e(this.f152693d), new C0260f(this.f152693d.getContext()), this.f152693d.mo90626f3(this.f152694e, false, hVar, 512, 2), hVar, 512);
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
