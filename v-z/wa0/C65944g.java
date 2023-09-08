package wa0;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C87413o;
import java.util.List;
import p175j0.C108504h;
import rx3.C13598b0;

/* renamed from: wa0.g */
public final class C65944g extends C87413o implements C32227p<C108504h, Integer, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C32228q<List<C111791f>, C108504h, Integer, C13598b0> f189594d;

    /* renamed from: e */
    public final /* synthetic */ List<C111791f> f189595e;

    /* renamed from: f */
    public final /* synthetic */ int f189596f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C65944g(C32228q<? super List<C111791f>, ? super C108504h, ? super Integer, C13598b0> qVar, List<C111791f> list, int i) {
        super(2);
        this.f189594d = qVar;
        this.f189595e = list;
        this.f189596f = i;
    }

    public Object invoke(Object obj, Object obj2) {
        C108504h hVar = (C108504h) obj;
        if ((((Number) obj2).intValue() & 11) != 2 || !hVar.mo51575a()) {
            this.f189594d.invoke(this.f189595e, hVar, Integer.valueOf(((this.f189596f >> 12) & 112) | 8));
        } else {
            hVar.mo51581d();
        }
        return C13598b0.f38549a;
    }
}
