package p202m2;

import a14.C53921m;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.ExecutionException;
import p1167z8.C112608f;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C66447b;

/* renamed from: m2.d */
public final class C109472d {

    /* renamed from: m2.d$a */
    public static final class C109473a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C112608f f327679d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C109473a(C112608f fVar) {
            super(1);
            this.f327679d = fVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f327679d.cancel(false);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: a */
    public static final <T> Object m148692a(C112608f<T> fVar, C15601d<? super T> dVar) {
        try {
            if (fVar.isDone()) {
                return C117502a.m165740f(fVar);
            }
            C53921m mVar = new C53921m(C66447b.m78392b(dVar), 1);
            fVar.addListener(new C109474f(fVar, mVar), C10701c.INSTANCE);
            mVar.mo74599v(new C109473a(fVar));
            return mVar.mo74608o();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            C87412m.m108601n();
            throw null;
        }
    }
}
