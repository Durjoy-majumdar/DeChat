package d04;

import java.util.Collection;
import sx3.C64186f0;
import w04.C22843b;
import wy3.C26436b;

/* renamed from: d04.b */
public final class C24445b<N> implements C22843b.C22846c {

    /* renamed from: a */
    public final /* synthetic */ boolean f69896a;

    public C24445b(boolean z) {
        this.f69896a = z;
    }

    /* renamed from: a */
    public Iterable mo33273a(Object obj) {
        C26436b bVar = (C26436b) obj;
        Collection<? extends C26436b> collection = null;
        if (this.f69896a) {
            bVar = bVar != null ? bVar.mo36109a() : null;
        }
        if (bVar != null) {
            collection = bVar.mo52633e();
        }
        return collection == null ? C64186f0.f181907d : collection;
    }
}
