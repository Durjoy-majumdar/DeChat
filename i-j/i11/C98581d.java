package i11;

import com.tencent.p014mm.vfs.C116271c0;
import com.tencent.p014mm.vfs.C116274d0;
import com.tencent.p014mm.vfs.C116300h1;
import com.tencent.p014mm.vfs.C97318g1;
import com.tencent.wcdb.support.CancellationSignal;
import com.tencent.wcdb.support.OperationCanceledException;
import di3.C86312j;
import gy3.C87412m;
import java.util.Iterator;
import java.util.List;
import kr0.C88274h0;
import qp3.C118196a;

/* renamed from: i11.d */
public final class C98581d implements Runnable {

    /* renamed from: d */
    public final C98582a f289047d;

    /* renamed from: e */
    public final boolean f289048e;

    /* renamed from: f */
    public final C116300h1 f289049f;

    /* renamed from: g */
    public final CancellationSignal f289050g;

    /* renamed from: h */
    public final Runnable f289051h;

    /* renamed from: i11.d$a */
    public interface C98582a {
        /* renamed from: a */
        void mo137951a(boolean z);

        /* renamed from: b */
        void mo137952b(C97318g1 g1Var);
    }

    public C98581d(C98582a aVar, boolean z, C116300h1 h1Var, CancellationSignal cancellationSignal, Runnable runnable) {
        C87412m.m108594g(aVar, "callback");
        this.f289047d = aVar;
        this.f289048e = z;
        this.f289049f = h1Var;
        this.f289050g = cancellationSignal;
        this.f289051h = runnable;
    }

    public void run() {
        CancellationSignal cancellationSignal;
        try {
            CancellationSignal cancellationSignal2 = this.f289050g;
            if (cancellationSignal2 != null) {
                cancellationSignal2.throwIfCanceled();
            }
            Runnable runnable = this.f289051h;
            if (runnable != null) {
                runnable.run();
            }
            CancellationSignal cancellationSignal3 = this.f289050g;
            if (cancellationSignal3 != null) {
                cancellationSignal3.throwIfCanceled();
            }
            C116271c0 c0Var = C116271c0.f348905a;
            List<String> fx = ((C88274h0) C86312j.m106911c(C88274h0.class)).mo113309fx();
            C87412m.m108593f(fx, "getService(IAppBrandMixE…WithPrefixListWhenCleanup");
            C116274d0.f348936p = fx;
            C98585g.m128099b();
            Iterator it = ((C118196a) c0Var.mo177785a(this.f289048e, this.f289049f)).iterator();
            int i = 0;
            while (it.hasNext()) {
                this.f289047d.mo137952b((C97318g1) it.next());
                i++;
                if ((i & 15) == 0 && (cancellationSignal = this.f289050g) != null) {
                    cancellationSignal.throwIfCanceled();
                }
            }
            this.f289047d.mo137951a(false);
        } catch (OperationCanceledException unused) {
            this.f289047d.mo137951a(true);
        }
    }
}
