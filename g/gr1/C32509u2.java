package gr1;

import android.graphics.Bitmap;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.List;
import rx3.C13598b0;
import sp3.C36777d;
import sx3.C36907w;

/* renamed from: gr1.u2 */
public final class C32509u2 implements C36777d {

    /* renamed from: a */
    public final long f86347a;

    /* renamed from: b */
    public final C36777d f86348b;

    /* renamed from: c */
    public final C32224a<C13598b0> f86349c;

    /* renamed from: gr1.u2$a */
    public static final class C32510a extends C87413o implements C32227p<Long, Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C32227p<Long, Bitmap, C13598b0> f86350d;

        /* renamed from: e */
        public final /* synthetic */ C32509u2 f86351e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C32510a(C32227p<? super Long, ? super Bitmap, C13598b0> pVar, C32509u2 u2Var) {
            super(2);
            this.f86350d = pVar;
            this.f86351e = u2Var;
        }

        public Object invoke(Object obj, Object obj2) {
            long longValue = ((Number) obj).longValue();
            this.f86350d.invoke(Long.valueOf(longValue - this.f86351e.f86347a), (Bitmap) obj2);
            return C13598b0.f38549a;
        }
    }

    public C32509u2(long j, C36777d dVar, C32224a<C13598b0> aVar) {
        C87412m.m108594g(dVar, "thumbFetcher");
        C87412m.m108594g(aVar, "destroyCallback");
        this.f86347a = j;
        this.f86348b = dVar;
        this.f86349c = aVar;
    }

    /* renamed from: C */
    public void mo58663C(int i, int i2) {
        this.f86348b.mo58663C(i, i2);
    }

    /* renamed from: a */
    public void mo58664a(long j) {
        this.f86348b.mo58664a(j + this.f86347a);
    }

    /* renamed from: b */
    public void mo58665b(List<Long> list, C32227p<? super Long, ? super Bitmap, C13598b0> pVar) {
        C87412m.m108594g(list, "times");
        C87412m.m108594g(pVar, "callback");
        C36777d dVar = this.f86348b;
        ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
        for (Number longValue : list) {
            arrayList.add(Long.valueOf(longValue.longValue() + this.f86347a));
        }
        dVar.mo58665b(arrayList, new C32510a(pVar, this));
    }

    public void destroy() {
        this.f86348b.destroy();
        this.f86349c.invoke();
    }
}
