package o24;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.io.IOException;
import rx3.C13598b0;

/* renamed from: o24.d */
public final class C21759d implements C21754b0 {

    /* renamed from: d */
    public final /* synthetic */ C21755c f61685d;

    /* renamed from: e */
    public final /* synthetic */ C21754b0 f61686e;

    public C21759d(C21755c cVar, C21754b0 b0Var) {
        this.f61685d = cVar;
        this.f61686e = b0Var;
    }

    public void close() {
        C21755c cVar = this.f61685d;
        cVar.mo34096h();
        try {
            this.f61686e.close();
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
    public C21762e0 mo32770f() {
        return this.f61685d;
    }

    public void flush() {
        C21755c cVar = this.f61685d;
        cVar.mo34096h();
        try {
            this.f61686e.flush();
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

    public String toString() {
        return "AsyncTimeout.sink(" + this.f61686e + ')';
    }

    /* renamed from: x */
    public void mo32354x(C21766h hVar, long j) {
        C87412m.m108594g(hVar, FirebaseAnalytics.C113379b.SOURCE);
        C21753b.m24816b(hVar.f61695e, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                C21784y yVar = hVar.f61694d;
                C87412m.m108591d(yVar);
                while (true) {
                    if (j2 >= ((long) 65536)) {
                        break;
                    }
                    j2 += (long) (yVar.f61733c - yVar.f61732b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    } else {
                        yVar = yVar.f61736f;
                        C87412m.m108591d(yVar);
                    }
                }
                C21755c cVar = this.f61685d;
                cVar.mo34096h();
                try {
                    this.f61686e.mo32354x(hVar, j2);
                    C13598b0 b0Var = C13598b0.f38549a;
                    if (!cVar.mo34097i()) {
                        j -= j2;
                    } else {
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
            } else {
                return;
            }
        }
    }
}
