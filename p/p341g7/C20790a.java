package p341g7;

import com.tencent.tav.coremedia.TimeUtil;
import p294b7.C16738b;
import p294b7.C16742f;
import p294b7.C16748l;
import p333e8.C20528a;

/* renamed from: g7.a */
public final class C20790a implements C20798f {

    /* renamed from: a */
    public final C20797e f58737a = new C20797e();

    /* renamed from: b */
    public final long f58738b;

    /* renamed from: c */
    public final long f58739c;

    /* renamed from: d */
    public final C20800h f58740d;

    /* renamed from: e */
    public int f58741e;

    /* renamed from: f */
    public long f58742f;

    /* renamed from: g */
    public long f58743g;

    /* renamed from: h */
    public long f58744h;

    /* renamed from: i */
    public long f58745i;

    /* renamed from: j */
    public long f58746j;

    /* renamed from: k */
    public long f58747k;

    /* renamed from: l */
    public long f58748l;

    /* renamed from: g7.a$b */
    public class C20792b implements C16748l {
        public C20792b(C20791a aVar) {
        }

        /* renamed from: f */
        public boolean mo17730f() {
            return true;
        }

        /* renamed from: g */
        public long mo17731g(long j) {
            if (j == 0) {
                return C20790a.this.f58738b;
            }
            C20790a aVar = C20790a.this;
            long j2 = (((long) aVar.f58740d.f58784i) * j) / TimeUtil.SECOND_TO_US;
            long j3 = aVar.f58738b;
            long j4 = aVar.f58739c;
            long j5 = (((j2 * (j4 - j3)) / aVar.f58742f) - 30000) + j3;
            if (j5 >= j3) {
                j3 = j5;
            }
            return j3 >= j4 ? j4 - 1 : j3;
        }

        /* renamed from: h */
        public long mo17732h() {
            C20790a aVar = C20790a.this;
            return (aVar.f58742f * TimeUtil.SECOND_TO_US) / ((long) aVar.f58740d.f58784i);
        }
    }

    public C20790a(long j, long j2, C20800h hVar, int i, long j3) {
        C20528a.m22237a(j >= 0 && j2 > j);
        this.f58740d = hVar;
        this.f58738b = j;
        this.f58739c = j2;
        if (((long) i) == j2 - j) {
            this.f58742f = j3;
            this.f58741e = 3;
            return;
        }
        this.f58741e = 0;
    }

    /* renamed from: a */
    public C16748l mo32490a() {
        if (this.f58742f != 0) {
            return new C20792b((C20791a) null);
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo32491b(p294b7.C16742f r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            int r2 = r0.f58741e
            r3 = 0
            r5 = 1
            r6 = 0
            r7 = 3
            if (r2 == 0) goto L_0x0105
            if (r2 == r5) goto L_0x011a
            r8 = 2
            if (r2 == r8) goto L_0x001d
            if (r2 != r7) goto L_0x0017
            r1 = -1
            return r1
        L_0x0017:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x001d:
            long r9 = r0.f58744h
            r11 = 2
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 != 0) goto L_0x0028
        L_0x0025:
            r1 = 3
            goto L_0x0100
        L_0x0028:
            long r13 = r0.f58745i
            long r7 = r0.f58746j
            int r16 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r16 != 0) goto L_0x0037
            long r7 = r0.f58747k
            long r7 = r7 + r11
            long r7 = -r7
        L_0x0034:
            r2 = r3
            goto L_0x00cc
        L_0x0037:
            r13 = r1
            b7.b r13 = (p294b7.C16738b) r13
            long r13 = r13.f45242c
            boolean r7 = r0.mo32493d(r1, r7)
            if (r7 != 0) goto L_0x0051
            long r7 = r0.f58745i
            int r5 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r5 == 0) goto L_0x0049
            goto L_0x0034
        L_0x0049:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "No ogg page can be found."
            r1.<init>(r2)
            throw r1
        L_0x0051:
            g7.e r7 = r0.f58737a
            r7.mo32499a(r1, r6)
            r7 = r1
            b7.b r7 = (p294b7.C16738b) r7
            r7.f45244e = r6
            g7.e r8 = r0.f58737a
            long r5 = r8.f58767b
            long r9 = r9 - r5
            int r2 = r8.f58769d
            int r8 = r8.f58770e
            int r2 = r2 + r8
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 < 0) goto L_0x0079
            r17 = 72000(0x11940, double:3.55727E-319)
            int r19 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x0071
            goto L_0x0079
        L_0x0071:
            r7.mo17738f(r2)
            g7.e r2 = r0.f58737a
            long r5 = r2.f58767b
            goto L_0x0098
        L_0x0079:
            r17 = 100000(0x186a0, double:4.94066E-319)
            if (r8 >= 0) goto L_0x0083
            r0.f58746j = r13
            r0.f58748l = r5
            goto L_0x009d
        L_0x0083:
            long r13 = r7.f45242c
            long r3 = (long) r2
            long r13 = r13 + r3
            r0.f58745i = r13
            r0.f58747k = r5
            long r5 = r0.f58746j
            long r5 = r5 - r13
            long r5 = r5 + r3
            int r3 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r3 >= 0) goto L_0x009d
            r7.mo17738f(r2)
            long r5 = r0.f58747k
        L_0x0098:
            long r5 = r5 + r11
            long r7 = -r5
        L_0x009a:
            r2 = 0
            goto L_0x00cc
        L_0x009d:
            long r3 = r0.f58746j
            long r5 = r0.f58745i
            long r3 = r3 - r5
            int r13 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r13 >= 0) goto L_0x00aa
            r0.f58746j = r5
            r7 = r5
            goto L_0x009a
        L_0x00aa:
            if (r8 > 0) goto L_0x00ae
            r15 = 2
            goto L_0x00af
        L_0x00ae:
            r15 = 1
        L_0x00af:
            int r2 = r2 * r15
            long r13 = (long) r2
            long r7 = r7.f45242c
            long r7 = r7 - r13
            long r9 = r9 * r3
            long r2 = r0.f58748l
            long r13 = r0.f58747k
            long r2 = r2 - r13
            long r9 = r9 / r2
            long r7 = r7 + r9
            long r2 = java.lang.Math.max(r7, r5)
            long r4 = r0.f58746j
            r6 = 1
            long r4 = r4 - r6
            long r7 = java.lang.Math.min(r2, r4)
            goto L_0x009a
        L_0x00cc:
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x00d1
            return r7
        L_0x00d1:
            long r2 = r0.f58744h
            long r7 = r7 + r11
            long r4 = -r7
            g7.e r6 = r0.f58737a
            r7 = 0
            r6.mo32499a(r1, r7)
        L_0x00db:
            g7.e r6 = r0.f58737a
            long r7 = r6.f58767b
            int r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r9 >= 0) goto L_0x00f8
            int r4 = r6.f58769d
            int r5 = r6.f58770e
            int r4 = r4 + r5
            r5 = r1
            b7.b r5 = (p294b7.C16738b) r5
            r5.mo17738f(r4)
            g7.e r4 = r0.f58737a
            long r5 = r4.f58767b
            r7 = 0
            r4.mo32499a(r1, r7)
            r4 = r5
            goto L_0x00db
        L_0x00f8:
            r7 = 0
            b7.b r1 = (p294b7.C16738b) r1
            r1.f45244e = r7
            r3 = r4
            goto L_0x0025
        L_0x0100:
            r0.f58741e = r1
            long r3 = r3 + r11
            long r1 = -r3
            return r1
        L_0x0105:
            r3 = r1
            b7.b r3 = (p294b7.C16738b) r3
            long r3 = r3.f45242c
            r0.f58743g = r3
            r5 = 1
            r0.f58741e = r5
            long r5 = r0.f58739c
            r7 = 65307(0xff1b, double:3.2266E-319)
            long r5 = r5 - r7
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x011a
            return r5
        L_0x011a:
            long r3 = r0.f58739c
            boolean r3 = r0.mo32493d(r1, r3)
            if (r3 == 0) goto L_0x015d
            g7.e r3 = r0.f58737a
            r4 = 0
            r3.f58766a = r4
            r5 = 0
            r3.f58767b = r5
            r3.f58768c = r4
            r3.f58769d = r4
            r3.f58770e = r4
        L_0x0131:
            g7.e r3 = r0.f58737a
            int r4 = r3.f58766a
            r5 = 4
            r4 = r4 & r5
            if (r4 == r5) goto L_0x0153
            r4 = r1
            b7.b r4 = (p294b7.C16738b) r4
            long r5 = r4.f45242c
            long r7 = r0.f58739c
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L_0x0153
            r5 = 0
            r3.mo32499a(r1, r5)
            g7.e r3 = r0.f58737a
            int r6 = r3.f58769d
            int r3 = r3.f58770e
            int r6 = r6 + r3
            r4.mo17738f(r6)
            goto L_0x0131
        L_0x0153:
            long r3 = r3.f58767b
            r0.f58742f = r3
            r1 = 3
            r0.f58741e = r1
            long r1 = r0.f58743g
            return r1
        L_0x015d:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341g7.C20790a.mo32491b(b7.f):long");
    }

    /* renamed from: c */
    public long mo32492c(long j) {
        int i = this.f58741e;
        C20528a.m22237a(i == 3 || i == 2);
        long j2 = j == 0 ? 0 : (((long) this.f58740d.f58784i) * j) / TimeUtil.SECOND_TO_US;
        this.f58744h = j2;
        this.f58741e = 2;
        this.f58745i = this.f58738b;
        this.f58746j = this.f58739c;
        this.f58747k = 0;
        this.f58748l = this.f58742f;
        return j2;
    }

    /* renamed from: d */
    public boolean mo32493d(C16742f fVar, long j) {
        C16738b bVar;
        int i;
        long min = Math.min(j + 3, this.f58739c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i3 = 0;
            if (((C16738b) fVar).f45242c + ((long) i2) <= min || (i2 = (int) (min - ((C16738b) fVar).f45242c)) >= 4) {
                bVar = (C16738b) fVar;
                bVar.mo17734b(bArr, 0, i2, false);
                while (true) {
                    i = i2 - 3;
                    if (i3 >= i) {
                        break;
                    } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        bVar.mo17738f(i3);
                        return true;
                    } else {
                        i3++;
                    }
                }
            } else {
                return false;
            }
            bVar.mo17738f(i);
        }
    }
}
