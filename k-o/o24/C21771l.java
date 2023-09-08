package o24;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;

/* renamed from: o24.l */
public abstract class C21771l implements C21754b0 {

    /* renamed from: d */
    public final C21754b0 f61701d;

    public C21771l(C21754b0 b0Var) {
        C87412m.m108594g(b0Var, "delegate");
        this.f61701d = b0Var;
    }

    public void close() {
        this.f61701d.close();
    }

    /* renamed from: f */
    public C21762e0 mo32770f() {
        return this.f61701d.mo32770f();
    }

    public void flush() {
        this.f61701d.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.f61701d + ')';
    }

    /* renamed from: x */
    public void mo32354x(C21766h hVar, long j) {
        C87412m.m108594g(hVar, FirebaseAnalytics.C113379b.SOURCE);
        this.f61701d.mo32354x(hVar, j);
    }
}
