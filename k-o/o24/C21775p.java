package o24;

import com.google.firebase.analytics.FirebaseAnalytics;
import gy3.C87412m;
import java.util.zip.Inflater;

/* renamed from: o24.p */
public final class C21775p implements C21760d0 {

    /* renamed from: d */
    public int f61709d;

    /* renamed from: e */
    public boolean f61710e;

    /* renamed from: f */
    public final C21768j f61711f;

    /* renamed from: g */
    public final Inflater f61712g;

    public C21775p(C21768j jVar, Inflater inflater) {
        C87412m.m108594g(jVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(inflater, "inflater");
        this.f61711f = jVar;
        this.f61712g = inflater;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0098 A[SYNTHETIC] */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo32327L0(o24.C21766h r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            gy3.C87412m.m108594g(r9, r0)
        L_0x0006:
            r0 = 0
            r2 = 1
            int r3 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r3 < 0) goto L_0x000f
            r4 = 1
            goto L_0x0010
        L_0x000f:
            r4 = 0
        L_0x0010:
            if (r4 == 0) goto L_0x00d3
            boolean r4 = r8.f61710e
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x00c7
            if (r3 != 0) goto L_0x001c
        L_0x0019:
            r2 = r0
            goto L_0x0094
        L_0x001c:
            o24.y r2 = r9.mo34143l(r2)     // Catch:{ DataFormatException -> 0x00c0 }
            int r3 = r2.f61733c     // Catch:{ DataFormatException -> 0x00c0 }
            int r3 = 8192 - r3
            long r3 = (long) r3     // Catch:{ DataFormatException -> 0x00c0 }
            long r3 = java.lang.Math.min(r10, r3)     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = (int) r3     // Catch:{ DataFormatException -> 0x00c0 }
            java.util.zip.Inflater r3 = r8.f61712g     // Catch:{ DataFormatException -> 0x00c0 }
            boolean r3 = r3.needsInput()     // Catch:{ DataFormatException -> 0x00c0 }
            if (r3 != 0) goto L_0x0033
            goto L_0x0055
        L_0x0033:
            o24.j r3 = r8.f61711f     // Catch:{ DataFormatException -> 0x00c0 }
            boolean r3 = r3.mo34134e0()     // Catch:{ DataFormatException -> 0x00c0 }
            if (r3 == 0) goto L_0x003c
            goto L_0x0055
        L_0x003c:
            o24.j r3 = r8.f61711f     // Catch:{ DataFormatException -> 0x00c0 }
            o24.h r3 = r3.getBuffer()     // Catch:{ DataFormatException -> 0x00c0 }
            o24.y r3 = r3.f61694d     // Catch:{ DataFormatException -> 0x00c0 }
            gy3.C87412m.m108591d(r3)     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r3.f61733c     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r3.f61732b     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r5 - r6
            r8.f61709d = r5     // Catch:{ DataFormatException -> 0x00c0 }
            java.util.zip.Inflater r7 = r8.f61712g     // Catch:{ DataFormatException -> 0x00c0 }
            byte[] r3 = r3.f61731a     // Catch:{ DataFormatException -> 0x00c0 }
            r7.setInput(r3, r6, r5)     // Catch:{ DataFormatException -> 0x00c0 }
        L_0x0055:
            java.util.zip.Inflater r3 = r8.f61712g     // Catch:{ DataFormatException -> 0x00c0 }
            byte[] r5 = r2.f61731a     // Catch:{ DataFormatException -> 0x00c0 }
            int r6 = r2.f61733c     // Catch:{ DataFormatException -> 0x00c0 }
            int r3 = r3.inflate(r5, r6, r4)     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = r8.f61709d     // Catch:{ DataFormatException -> 0x00c0 }
            if (r4 != 0) goto L_0x0064
            goto L_0x0076
        L_0x0064:
            java.util.zip.Inflater r5 = r8.f61712g     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r5.getRemaining()     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = r4 - r5
            int r5 = r8.f61709d     // Catch:{ DataFormatException -> 0x00c0 }
            int r5 = r5 - r4
            r8.f61709d = r5     // Catch:{ DataFormatException -> 0x00c0 }
            o24.j r5 = r8.f61711f     // Catch:{ DataFormatException -> 0x00c0 }
            long r6 = (long) r4     // Catch:{ DataFormatException -> 0x00c0 }
            r5.skip(r6)     // Catch:{ DataFormatException -> 0x00c0 }
        L_0x0076:
            if (r3 <= 0) goto L_0x0084
            int r4 = r2.f61733c     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = r4 + r3
            r2.f61733c = r4     // Catch:{ DataFormatException -> 0x00c0 }
            long r4 = r9.f61695e     // Catch:{ DataFormatException -> 0x00c0 }
            long r2 = (long) r3     // Catch:{ DataFormatException -> 0x00c0 }
            long r4 = r4 + r2
            r9.f61695e = r4     // Catch:{ DataFormatException -> 0x00c0 }
            goto L_0x0094
        L_0x0084:
            int r3 = r2.f61732b     // Catch:{ DataFormatException -> 0x00c0 }
            int r4 = r2.f61733c     // Catch:{ DataFormatException -> 0x00c0 }
            if (r3 != r4) goto L_0x0019
            o24.y r3 = r2.mo34186a()     // Catch:{ DataFormatException -> 0x00c0 }
            r9.f61694d = r3     // Catch:{ DataFormatException -> 0x00c0 }
            o24.C21785z.m24975a(r2)     // Catch:{ DataFormatException -> 0x00c0 }
            goto L_0x0019
        L_0x0094:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0099
            return r2
        L_0x0099:
            java.util.zip.Inflater r0 = r8.f61712g
            boolean r0 = r0.finished()
            if (r0 != 0) goto L_0x00bd
            java.util.zip.Inflater r0 = r8.f61712g
            boolean r0 = r0.needsDictionary()
            if (r0 == 0) goto L_0x00aa
            goto L_0x00bd
        L_0x00aa:
            o24.j r0 = r8.f61711f
            boolean r0 = r0.mo34134e0()
            if (r0 != 0) goto L_0x00b4
            goto L_0x0006
        L_0x00b4:
            java.io.EOFException r9 = new java.io.EOFException
            java.lang.String r10 = "source exhausted prematurely"
            r9.<init>(r10)
            throw r9
        L_0x00bd:
            r9 = -1
            return r9
        L_0x00c0:
            r9 = move-exception
            java.io.IOException r10 = new java.io.IOException
            r10.<init>(r9)
            throw r10
        L_0x00c7:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x00d3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "byteCount < 0: "
            r9.append(r0)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o24.C21775p.mo32327L0(o24.h, long):long");
    }

    public void close() {
        if (!this.f61710e) {
            this.f61712g.end();
            this.f61710e = true;
            this.f61711f.close();
        }
    }

    /* renamed from: f */
    public C21762e0 mo32328f() {
        return this.f61711f.mo32328f();
    }
}
