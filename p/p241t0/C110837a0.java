package p241t0;

import fy3.C32224a;
import gy3.C87413o;
import java.util.HashSet;
import java.util.Iterator;
import p241t0.C110879z;
import p410k0.C108793e;
import rx3.C13598b0;

/* renamed from: t0.a0 */
public final class C110837a0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C110879z f331585d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110837a0(C110879z zVar) {
        super(0);
        this.f331585d = zVar;
    }

    public Object invoke() {
        C108793e<C110879z.C110880a<?>> eVar = this.f331585d.f331675d;
        int i = eVar.f325786f;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = eVar.f325784d;
            do {
                C110879z.C110880a aVar = (C110879z.C110880a) tArr[i2];
                HashSet<Object> hashSet = aVar.f331681c;
                if (!hashSet.isEmpty()) {
                    Iterator<Object> it = hashSet.iterator();
                    while (it.hasNext()) {
                        aVar.f331679a.invoke(it.next());
                    }
                    hashSet.clear();
                }
                i2++;
            } while (i2 < i);
        }
        return C13598b0.f38549a;
    }
}
