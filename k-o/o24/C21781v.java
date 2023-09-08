package o24;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.nio.ByteBuffer;

/* renamed from: o24.v */
public final class C21781v implements C21767i {

    /* renamed from: d */
    public final C21766h f61724d = new C21766h();

    /* renamed from: e */
    public boolean f61725e;

    /* renamed from: f */
    public final C21754b0 f61726f;

    public C21781v(C21754b0 b0Var) {
        C87412m.m108594g(b0Var, "sink");
        this.f61726f = b0Var;
    }

    /* renamed from: A0 */
    public C21767i mo34115A0(long j) {
        if (!this.f61725e) {
            this.f61724d.mo34115A0(j);
            return mo34124U();
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: F */
    public C21767i mo34119F(long j) {
        if (!this.f61725e) {
            this.f61724d.mo34119F(j);
            mo34124U();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: J0 */
    public C21767i mo34122J0(int i) {
        if (!this.f61725e) {
            this.f61724d.mo34114A(i);
            mo34124U();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: U */
    public C21767i mo34124U() {
        if (!this.f61725e) {
            long a = this.f61724d.mo34128a();
            if (a > 0) {
                this.f61726f.mo32354x(this.f61724d, a);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: W */
    public C21767i mo34126W(String str) {
        C87412m.m108594g(str, "string");
        if (!this.f61725e) {
            this.f61724d.mo34116B(str);
            mo34124U();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: a */
    public C21767i mo34171a(byte[] bArr, int i, int i2) {
        C87412m.m108594g(bArr, FirebaseAnalytics.C113379b.SOURCE);
        if (!this.f61725e) {
            this.f61724d.mo34145n(bArr, i, i2);
            mo34124U();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public void close() {
        if (!this.f61725e) {
            Throwable th = null;
            try {
                C21766h hVar = this.f61724d;
                long j = hVar.f61695e;
                if (j > 0) {
                    this.f61726f.mo32354x(hVar, j);
                }
            } catch (Throwable th4) {
                th = th4;
            }
            try {
                this.f61726f.close();
            } catch (Throwable th5) {
                if (th == null) {
                    th = th5;
                }
            }
            this.f61725e = true;
            if (th != null) {
                throw th;
            }
        }
    }

    /* renamed from: f */
    public C21762e0 mo32770f() {
        return this.f61726f.mo32770f();
    }

    public void flush() {
        if (!this.f61725e) {
            C21766h hVar = this.f61724d;
            long j = hVar.f61695e;
            if (j > 0) {
                this.f61726f.mo32354x(hVar, j);
            }
            this.f61726f.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public boolean isOpen() {
        return !this.f61725e;
    }

    /* renamed from: o */
    public C21767i mo34146o(int i) {
        if (!this.f61725e) {
            this.f61724d.mo34148q(i);
            mo34124U();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: p */
    public C21766h mo34147p() {
        return this.f61724d;
    }

    /* renamed from: r0 */
    public C21767i mo34150r0(int i) {
        if (!this.f61725e) {
            this.f61724d.mo34161y(i);
            return mo34124U();
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f61726f + ')';
    }

    public int write(ByteBuffer byteBuffer) {
        C87412m.m108594g(byteBuffer, FirebaseAnalytics.C113379b.SOURCE);
        if (!this.f61725e) {
            int write = this.f61724d.write(byteBuffer);
            mo34124U();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: x */
    public void mo32354x(C21766h hVar, long j) {
        C87412m.m108594g(hVar, FirebaseAnalytics.C113379b.SOURCE);
        if (!this.f61725e) {
            this.f61724d.mo32354x(hVar, j);
            mo34124U();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public C21767i write(byte[] bArr) {
        C87412m.m108594g(bArr, FirebaseAnalytics.C113379b.SOURCE);
        if (!this.f61725e) {
            C21766h hVar = this.f61724d;
            hVar.getClass();
            hVar.mo34145n(bArr, 0, bArr.length);
            mo34124U();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
