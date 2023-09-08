package e14;

import c14.C54624g;
import d14.C45252f;
import wx3.C66212f;
import wx3.C66217g;

/* renamed from: e14.s */
public interface C58506s<T> extends C45252f<T> {

    /* renamed from: e14.s$a */
    public static final class C58507a {
        /* renamed from: a */
        public static /* synthetic */ C45252f m67937a(C58506s sVar, C66212f fVar, int i, C54624g gVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    fVar = C66217g.f190253d;
                }
                if ((i2 & 2) != 0) {
                    i = -3;
                }
                if ((i2 & 4) != 0) {
                    gVar = C54624g.SUSPEND;
                }
                return sVar.mo82831c(fVar, i, gVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fuse");
        }
    }

    /* renamed from: c */
    C45252f<T> mo82831c(C66212f fVar, int i, C54624g gVar);
}
