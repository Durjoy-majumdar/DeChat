package c14;

import java.util.concurrent.CancellationException;

/* renamed from: c14.f */
public interface C54622f<E> extends C54612b0<E> {

    /* renamed from: c14.f$a */
    public static final class C54623a {
        /* renamed from: a */
        public static /* synthetic */ void m61466a(C54622f fVar, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                fVar.mo75551b(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    /* renamed from: b */
    void mo75551b(CancellationException cancellationException);

    /* renamed from: e */
    C54649x<E> mo75552e();
}
