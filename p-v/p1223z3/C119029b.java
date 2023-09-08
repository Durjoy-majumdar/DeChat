package p1223z3;

import p1188d4.C116569f;
import p1191e4.C116691f;

/* renamed from: z3.b */
public abstract class C119029b<T> extends C119048k {
    public C119029b(C119038g gVar) {
        super(gVar);
    }

    /* renamed from: d */
    public abstract void mo183532d(C116569f fVar, T t);

    /* renamed from: e */
    public final void mo183689e(T t) {
        C116569f a = mo183713a();
        try {
            mo183532d(a, t);
            ((C116691f) a).f349956e.executeInsert();
        } finally {
            mo183714c(a);
        }
    }
}
