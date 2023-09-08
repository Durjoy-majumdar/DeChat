package o24;

import gy3.C87412m;
import java.io.IOException;
import rx3.C13598b0;

/* renamed from: o24.e */
public final class C21761e implements C21760d0 {

    /* renamed from: d */
    public final /* synthetic */ C21755c f61687d;

    /* renamed from: e */
    public final /* synthetic */ C21760d0 f61688e;

    public C21761e(C21755c cVar, C21760d0 d0Var) {
        this.f61687d = cVar;
        this.f61688e = d0Var;
    }

    /* renamed from: L0 */
    public long mo32327L0(C21766h hVar, long j) {
        C87412m.m108594g(hVar, "sink");
        C21755c cVar = this.f61687d;
        cVar.mo34096h();
        try {
            long L0 = this.f61688e.mo32327L0(hVar, j);
            if (!cVar.mo34097i()) {
                return L0;
            }
            throw cVar.mo33151j((IOException) null);
        } catch (IOException e) {
            e = e;
            if (cVar.mo34097i()) {
                e = cVar.mo33151j(e);
            }
            throw e;
        } finally {
            boolean i = cVar.mo34097i();
        }
    }

    public void close() {
        C21755c cVar = this.f61687d;
        cVar.mo34096h();
        try {
            this.f61688e.close();
            C13598b0 b0Var = C13598b0.f38549a;
            if (cVar.mo34097i()) {
                throw cVar.mo33151j((IOException) null);
            }
        } catch (IOException e) {
            e = e;
            if (cVar.mo34097i()) {
                e = cVar.mo33151j(e);
            }
            throw e;
        } finally {
            boolean i = cVar.mo34097i();
        }
    }

    /* renamed from: f */
    public C21762e0 mo32328f() {
        return this.f61687d;
    }

    public String toString() {
        return "AsyncTimeout.source(" + this.f61688e + ')';
    }
}
