package o24;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import gy3.C87412m;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: o24.o */
public final class C21774o implements C21760d0 {

    /* renamed from: d */
    public byte f61704d;

    /* renamed from: e */
    public final C21783x f61705e;

    /* renamed from: f */
    public final Inflater f61706f;

    /* renamed from: g */
    public final C21775p f61707g;

    /* renamed from: h */
    public final CRC32 f61708h = new CRC32();

    public C21774o(C21760d0 d0Var) {
        C87412m.m108594g(d0Var, FirebaseAnalytics.C113379b.SOURCE);
        C21783x xVar = new C21783x(d0Var);
        this.f61705e = xVar;
        Inflater inflater = new Inflater(true);
        this.f61706f = inflater;
        this.f61707g = new C21775p(xVar, inflater);
    }

    /* renamed from: L0 */
    public long mo32327L0(C21766h hVar, long j) {
        long j2;
        C21766h hVar2 = hVar;
        long j3 = j;
        C87412m.m108594g(hVar2, "sink");
        boolean z = false;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j3).toString());
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f61704d == 0) {
                this.f61705e.mo34121G0(10);
                byte c = this.f61705e.f61728d.mo34130c(3);
                boolean z2 = ((c >> 1) & 1) == 1;
                if (z2) {
                    mo34168b(this.f61705e.f61728d, 0, 10);
                }
                mo34167a("ID1ID2", 8075, this.f61705e.readShort());
                this.f61705e.skip(8);
                if (((c >> 2) & 1) == 1) {
                    this.f61705e.mo34121G0(2);
                    if (z2) {
                        mo34168b(this.f61705e.f61728d, 0, 2);
                    }
                    short readShort = this.f61705e.f61728d.readShort() & 65535;
                    long j4 = (long) ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8)));
                    this.f61705e.mo34121G0(j4);
                    if (z2) {
                        j2 = j4;
                        mo34168b(this.f61705e.f61728d, 0, j4);
                    } else {
                        j2 = j4;
                    }
                    this.f61705e.skip(j2);
                }
                if (((c >> 3) & 1) == 1) {
                    long a = this.f61705e.mo34180a((byte) 0, 0, MAlarmHandler.NEXT_FIRE_INTERVAL);
                    if (a != -1) {
                        if (z2) {
                            mo34168b(this.f61705e.f61728d, 0, a + 1);
                        }
                        this.f61705e.skip(a + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((c >> 4) & 1) == 1) {
                    z = true;
                }
                if (z) {
                    long a2 = this.f61705e.mo34180a((byte) 0, 0, MAlarmHandler.NEXT_FIRE_INTERVAL);
                    if (a2 != -1) {
                        if (z2) {
                            mo34168b(this.f61705e.f61728d, 0, a2 + 1);
                        }
                        this.f61705e.skip(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    C21783x xVar = this.f61705e;
                    xVar.mo34121G0(2);
                    short readShort2 = xVar.f61728d.readShort() & 65535;
                    mo34167a("FHCRC", (short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) ((int) this.f61708h.getValue()));
                    this.f61708h.reset();
                }
                this.f61704d = 1;
            }
            if (this.f61704d == 1) {
                long j5 = hVar2.f61695e;
                long L0 = this.f61707g.mo32327L0(hVar2, j3);
                if (L0 != -1) {
                    mo34168b(hVar, j5, L0);
                    return L0;
                }
                this.f61704d = 2;
            }
            if (this.f61704d == 2) {
                mo34167a("CRC", this.f61705e.mo34182c(), (int) this.f61708h.getValue());
                mo34167a("ISIZE", this.f61705e.mo34182c(), (int) this.f61706f.getBytesWritten());
                this.f61704d = 3;
                if (!this.f61705e.mo34134e0()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo34167a(String str, int i, int i2) {
        if (i2 != i) {
            String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
            C87412m.m108593f(format, "java.lang.String.format(this, *args)");
            throw new IOException(format);
        }
    }

    /* renamed from: b */
    public final void mo34168b(C21766h hVar, long j, long j2) {
        C21784y yVar = hVar.f61694d;
        C87412m.m108591d(yVar);
        while (true) {
            int i = yVar.f61733c;
            int i2 = yVar.f61732b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            yVar = yVar.f61736f;
            C87412m.m108591d(yVar);
        }
        while (j2 > 0) {
            int i3 = (int) (((long) yVar.f61732b) + j);
            int min = (int) Math.min((long) (yVar.f61733c - i3), j2);
            this.f61708h.update(yVar.f61731a, i3, min);
            j2 -= (long) min;
            yVar = yVar.f61736f;
            C87412m.m108591d(yVar);
            j = 0;
        }
    }

    public void close() {
        this.f61707g.close();
    }

    /* renamed from: f */
    public C21762e0 mo32328f() {
        return this.f61705e.mo32328f();
    }
}
