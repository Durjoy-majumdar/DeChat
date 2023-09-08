package t70;

import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: t70.c */
public interface C36961c {

    /* renamed from: t70.c$a */
    public static final class C36962a {
        /* renamed from: a */
        public static /* synthetic */ boolean m41108a(C36961c cVar, boolean z, int i, C32226l lVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    z = false;
                }
                if ((i2 & 2) != 0) {
                    i = -1;
                }
                if ((i2 & 4) != 0) {
                    lVar = null;
                }
                return cVar.mo56355a(z, i, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: pull");
        }
    }

    /* renamed from: a */
    boolean mo56355a(boolean z, int i, C32226l<Object, C13598b0> lVar);
}
