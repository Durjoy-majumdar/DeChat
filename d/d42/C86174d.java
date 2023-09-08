package d42;

import e42.C31415g;

/* renamed from: d42.d */
public interface C86174d<T> {

    /* renamed from: d42.d$a */
    public static final class C86175a {
        /* renamed from: a */
        public static /* synthetic */ void m106688a(C86174d dVar, C31415g gVar, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 2) != 0) {
                    obj = null;
                }
                dVar.mo120570a(gVar, obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onResult");
        }
    }

    /* renamed from: a */
    void mo120570a(C31415g gVar, T t);
}
