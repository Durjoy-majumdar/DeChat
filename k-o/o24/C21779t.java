package o24;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.io.OutputStream;

/* renamed from: o24.t */
public final class C21779t implements C21754b0 {

    /* renamed from: d */
    public final OutputStream f61716d;

    /* renamed from: e */
    public final C21762e0 f61717e;

    public C21779t(OutputStream outputStream, C21762e0 e0Var) {
        C87412m.m108594g(outputStream, "out");
        C87412m.m108594g(e0Var, "timeout");
        this.f61716d = outputStream;
        this.f61717e = e0Var;
    }

    public void close() {
        this.f61716d.close();
    }

    /* renamed from: f */
    public C21762e0 mo32770f() {
        return this.f61717e;
    }

    public void flush() {
        this.f61716d.flush();
    }

    public String toString() {
        return "sink(" + this.f61716d + ')';
    }

    /* renamed from: x */
    public void mo32354x(C21766h hVar, long j) {
        C87412m.m108594g(hVar, FirebaseAnalytics.C113379b.SOURCE);
        C21753b.m24816b(hVar.f61695e, 0, j);
        while (j > 0) {
            this.f61717e.mo34107f();
            C21784y yVar = hVar.f61694d;
            C87412m.m108591d(yVar);
            int min = (int) Math.min(j, (long) (yVar.f61733c - yVar.f61732b));
            this.f61716d.write(yVar.f61731a, yVar.f61732b, min);
            int i = yVar.f61732b + min;
            yVar.f61732b = i;
            long j2 = (long) min;
            j -= j2;
            hVar.f61695e -= j2;
            if (i == yVar.f61733c) {
                hVar.f61694d = yVar.mo34186a();
                C21785z.m24975a(yVar);
            }
        }
    }
}
