package a14;

import fy3.C32226l;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: a14.z1 */
public interface C53973z1 extends C66212f.C66215b {

    /* renamed from: b0 */
    public static final /* synthetic */ int f151221b0 = 0;

    /* renamed from: a14.z1$b */
    public static final class C0004b implements C66212f.C15602c<C53973z1> {

        /* renamed from: d */
        public static final /* synthetic */ C0004b f3d = new C0004b();
    }

    /* renamed from: a14.z1$a */
    public static final class C53974a {
        /* renamed from: a */
        public static /* synthetic */ void m60623a(C53973z1 z1Var, CancellationException cancellationException, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    cancellationException = null;
                }
                z1Var.mo74528b(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        /* renamed from: b */
        public static /* synthetic */ C53883f1 m60624b(C53973z1 z1Var, boolean z, boolean z2, C32226l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                if ((i & 2) != 0) {
                    z2 = true;
                }
                return z1Var.mo74533g0(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }
    }

    /* renamed from: E */
    C53883f1 mo74515E(C32226l<? super Throwable, C13598b0> lVar);

    /* renamed from: M */
    C53941r mo74519M(C53948t tVar);

    /* renamed from: O */
    Object mo74521O(C15601d<? super C13598b0> dVar);

    /* renamed from: Z */
    CancellationException mo74526Z();

    /* renamed from: a */
    boolean mo74466a();

    /* renamed from: b */
    void mo74528b(CancellationException cancellationException);

    /* renamed from: c */
    boolean mo74530c();

    /* renamed from: g0 */
    C53883f1 mo74533g0(boolean z, boolean z2, C32226l<? super Throwable, C13598b0> lVar);

    boolean isCancelled();

    boolean start();
}
