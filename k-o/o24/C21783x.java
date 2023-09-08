package o24;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.MAlarmHandler;
import gy3.C87412m;
import java.io.EOFException;
import java.nio.ByteBuffer;
import p24.C21916a;
import z04.C66713a;

/* renamed from: o24.x */
public final class C21783x implements C21768j {

    /* renamed from: d */
    public final C21766h f61728d = new C21766h();

    /* renamed from: e */
    public boolean f61729e;

    /* renamed from: f */
    public final C21760d0 f61730f;

    public C21783x(C21760d0 d0Var) {
        C87412m.m108594g(d0Var, FirebaseAnalytics.C113379b.SOURCE);
        this.f61730f = d0Var;
    }

    /* renamed from: G */
    public C21769k mo34120G(long j) {
        mo34121G0(j);
        return this.f61728d.mo34120G(j);
    }

    /* renamed from: G0 */
    public void mo34121G0(long j) {
        if (!mo34138h(j)) {
            throw new EOFException();
        }
    }

    /* renamed from: L0 */
    public long mo32327L0(C21766h hVar, long j) {
        C87412m.m108594g(hVar, "sink");
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (true ^ this.f61729e) {
            C21766h hVar2 = this.f61728d;
            if (hVar2.f61695e == 0 && this.f61730f.mo32327L0(hVar2, (long) 8192) == -1) {
                return -1;
            }
            return this.f61728d.mo32327L0(hVar, Math.min(j, this.f61728d.f61695e));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo34123P() {
        /*
            r5 = this;
            r0 = 1
            r5.mo34121G0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.mo34138h(r2)
            if (r2 == 0) goto L_0x0062
            o24.h r2 = r5.f61728d
            long r3 = (long) r0
            byte r2 = r2.mo34130c(r3)
            r3 = 48
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0020
            r3 = 57
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x0020:
            r3 = 97
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x002a
            r3 = 102(0x66, float:1.43E-43)
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
        L_0x002a:
            r3 = 65
            byte r3 = (byte) r3
            if (r2 < r3) goto L_0x0037
            r3 = 70
            byte r3 = (byte) r3
            if (r2 <= r3) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0062
        L_0x003a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r3)
            r3 = 16
            z04.C66713a.m78712a(r3)
            z04.C66713a.m78712a(r3)
            java.lang.String r2 = java.lang.Integer.toString(r2, r3)
            java.lang.String r3 = "java.lang.Integer.toStri…(this, checkRadix(radix))"
            gy3.C87412m.m108593f(r2, r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0062:
            o24.h r0 = r5.f61728d
            long r0 = r0.mo34123P()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o24.C21783x.mo34123P():long");
    }

    /* renamed from: V */
    public String mo34125V(long j) {
        if (j >= 0) {
            long j2 = j == MAlarmHandler.NEXT_FIRE_INTERVAL ? Long.MAX_VALUE : j + 1;
            byte b = (byte) 10;
            long a = mo34180a(b, 0, j2);
            if (a != -1) {
                return C21916a.m25178a(this.f61728d, a);
            }
            if (j2 < MAlarmHandler.NEXT_FIRE_INTERVAL && mo34138h(j2) && this.f61728d.mo34130c(j2 - 1) == ((byte) 13) && mo34138h(1 + j2) && this.f61728d.mo34130c(j2) == b) {
                return C21916a.m25178a(this.f61728d, j2);
            }
            C21766h hVar = new C21766h();
            C21766h hVar2 = this.f61728d;
            hVar2.mo34129b(hVar, 0, Math.min((long) 32, hVar2.f61695e));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f61728d.f61695e, j) + " content=" + hVar.mo34120G(hVar.f61695e).mo34086g() + "…");
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    /* renamed from: Y */
    public String mo34127Y() {
        return mo34125V(MAlarmHandler.NEXT_FIRE_INTERVAL);
    }

    /* renamed from: a */
    public long mo34180a(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f61729e) {
            if (0 > j || j2 < j) {
                z = false;
            }
            if (z) {
                while (j < j2) {
                    long d = this.f61728d.mo34132d(b, j, j2);
                    if (d != -1) {
                        return d;
                    }
                    C21766h hVar = this.f61728d;
                    long j3 = hVar.f61695e;
                    if (j3 >= j2 || this.f61730f.mo32327L0(hVar, (long) 8192) == -1) {
                        return -1;
                    }
                    j = Math.max(j, j3);
                }
                return -1;
            }
            throw new IllegalArgumentException(("fromIndex=" + j + " toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: b */
    public void mo34181b(byte[] bArr) {
        C87412m.m108594g(bArr, "sink");
        int i = 0;
        try {
            mo34121G0((long) bArr.length);
            C21766h hVar = this.f61728d;
            hVar.getClass();
            while (i < bArr.length) {
                int e = hVar.mo34133e(bArr, i, bArr.length - i);
                if (e != -1) {
                    i += e;
                } else {
                    throw new EOFException();
                }
            }
        } catch (EOFException e2) {
            while (true) {
                C21766h hVar2 = this.f61728d;
                long j = hVar2.f61695e;
                if (j > 0) {
                    int e3 = hVar2.mo34133e(bArr, i, (int) j);
                    if (e3 != -1) {
                        i += e3;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: c */
    public int mo34182c() {
        mo34121G0(4);
        int readInt = this.f61728d.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public void close() {
        if (!this.f61729e) {
            this.f61729e = true;
            this.f61730f.close();
            C21766h hVar = this.f61728d;
            hVar.skip(hVar.f61695e);
        }
    }

    /* renamed from: e0 */
    public boolean mo34134e0() {
        if (!this.f61729e) {
            return this.f61728d.mo34134e0() && this.f61730f.mo32327L0(this.f61728d, (long) 8192) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* renamed from: f */
    public C21762e0 mo32328f() {
        return this.f61730f.mo32328f();
    }

    public C21766h getBuffer() {
        return this.f61728d;
    }

    /* renamed from: h */
    public boolean mo34138h(long j) {
        C21766h hVar;
        if (!(j >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        } else if (!this.f61729e) {
            do {
                hVar = this.f61728d;
                if (hVar.f61695e >= j) {
                    return true;
                }
            } while (this.f61730f.mo32327L0(hVar, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public boolean isOpen() {
        return !this.f61729e;
    }

    /* renamed from: m0 */
    public long mo34144m0() {
        int i;
        mo34121G0(1);
        long j = 0;
        while (true) {
            long j2 = j + 1;
            if (!mo34138h(j2)) {
                break;
            }
            byte c = this.f61728d.mo34130c(j);
            if ((c >= ((byte) 48) && c <= ((byte) 57)) || (j == 0 && c == ((byte) 45))) {
                j = j2;
            } else if (i == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Expected leading [0-9] or '-' character but was 0x");
                C66713a.m78712a(16);
                C66713a.m78712a(16);
                String num = Integer.toString(c, 16);
                C87412m.m108593f(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
                sb.append(num);
                throw new NumberFormatException(sb.toString());
            }
        }
        return this.f61728d.mo34144m0();
    }

    /* renamed from: p */
    public C21766h mo34147p() {
        return this.f61728d;
    }

    public int read(ByteBuffer byteBuffer) {
        C87412m.m108594g(byteBuffer, "sink");
        C21766h hVar = this.f61728d;
        if (hVar.f61695e == 0 && this.f61730f.mo32327L0(hVar, (long) 8192) == -1) {
            return -1;
        }
        return this.f61728d.read(byteBuffer);
    }

    public byte readByte() {
        mo34121G0(1);
        return this.f61728d.readByte();
    }

    public int readInt() {
        mo34121G0(4);
        return this.f61728d.readInt();
    }

    public short readShort() {
        mo34121G0(2);
        return this.f61728d.readShort();
    }

    public void skip(long j) {
        if (!this.f61729e) {
            while (j > 0) {
                C21766h hVar = this.f61728d;
                if (hVar.f61695e == 0 && this.f61730f.mo32327L0(hVar, (long) 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.f61728d.f61695e);
                this.f61728d.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public String toString() {
        return "buffer(" + this.f61730f + ')';
    }

    /* renamed from: v */
    public long mo34158v(C21754b0 b0Var) {
        C87412m.m108594g(b0Var, "sink");
        long j = 0;
        while (this.f61730f.mo32327L0(this.f61728d, (long) 8192) != -1) {
            long a = this.f61728d.mo34128a();
            if (a > 0) {
                j += a;
                b0Var.mo32354x(this.f61728d, a);
            }
        }
        C21766h hVar = this.f61728d;
        long j2 = hVar.f61695e;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        b0Var.mo32354x(hVar, j2);
        return j3;
    }
}
