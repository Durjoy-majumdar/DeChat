package o24;

import gy3.C87412m;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o24.q */
public final class C21776q implements C21760d0 {

    /* renamed from: d */
    public final InputStream f61713d;

    /* renamed from: e */
    public final C21762e0 f61714e;

    public C21776q(InputStream inputStream, C21762e0 e0Var) {
        C87412m.m108594g(inputStream, "input");
        C87412m.m108594g(e0Var, "timeout");
        this.f61713d = inputStream;
        this.f61714e = e0Var;
    }

    /* renamed from: L0 */
    public long mo32327L0(C21766h hVar, long j) {
        C87412m.m108594g(hVar, "sink");
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        if (i >= 0) {
            try {
                this.f61714e.mo34107f();
                C21784y l = hVar.mo34143l(1);
                int read = this.f61713d.read(l.f61731a, l.f61733c, (int) Math.min(j, (long) (8192 - l.f61733c)));
                if (read != -1) {
                    l.f61733c += read;
                    long j2 = (long) read;
                    hVar.f61695e += j2;
                    return j2;
                } else if (l.f61732b != l.f61733c) {
                    return -1;
                } else {
                    hVar.f61694d = l.mo34186a();
                    C21785z.m24975a(l);
                    return -1;
                }
            } catch (AssertionError e) {
                if (C21777r.m24936c(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        } else {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    public void close() {
        this.f61713d.close();
    }

    /* renamed from: f */
    public C21762e0 mo32328f() {
        return this.f61714e;
    }

    public String toString() {
        return "source(" + this.f61713d + ')';
    }
}
