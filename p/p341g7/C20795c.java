package p341g7;

import java.util.Arrays;
import p294b7.C16738b;
import p294b7.C16741e;
import p294b7.C16742f;
import p294b7.C16743g;
import p333e8.C20541m;
import p396x6.C23015n;

/* renamed from: g7.c */
public class C20795c implements C16741e {

    /* renamed from: a */
    public C16743g f58757a;

    /* renamed from: b */
    public C20800h f58758b;

    /* renamed from: c */
    public boolean f58759c;

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo17745a(p294b7.C16742f r20, p294b7.C16747k r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            g7.h r2 = r0.f58758b
            r3 = 0
            if (r2 != 0) goto L_0x001d
            boolean r2 = r19.mo32497d(r20)
            if (r2 == 0) goto L_0x0015
            r2 = r1
            b7.b r2 = (p294b7.C16738b) r2
            r2.f45244e = r3
            goto L_0x001d
        L_0x0015:
            x6.n r1 = new x6.n
            java.lang.String r2 = "Failed to determine bitstream type"
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x001d:
            boolean r2 = r0.f58759c
            r4 = 1
            if (r2 != 0) goto L_0x003a
            b7.g r2 = r0.f58757a
            b7.m r2 = r2.mo17752o(r3, r4)
            b7.g r5 = r0.f58757a
            r5.mo17751i()
            g7.h r5 = r0.f58758b
            b7.g r6 = r0.f58757a
            r5.f58778c = r6
            r5.f58777b = r2
            r5.mo32496d(r4)
            r0.f58759c = r4
        L_0x003a:
            g7.h r2 = r0.f58758b
            int r5 = r2.f58783h
            r6 = -1
            r8 = 3
            r14 = 2
            if (r5 == 0) goto L_0x00db
            if (r5 == r4) goto L_0x00cf
            if (r5 != r14) goto L_0x00c9
            g7.f r5 = r2.f58779d
            long r9 = r5.mo32491b(r1)
            r11 = 0
            int r5 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r5 < 0) goto L_0x005b
            r5 = r21
            r5.f45264a = r9
            r3 = 1
            goto L_0x016c
        L_0x005b:
            int r5 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x0066
            r13 = 2
            long r9 = r9 + r13
            long r9 = -r9
            r2.mo32501a(r9)
        L_0x0066:
            boolean r5 = r2.f58787l
            if (r5 != 0) goto L_0x0077
            g7.f r5 = r2.f58779d
            b7.l r5 = r5.mo32490a()
            b7.g r9 = r2.f58778c
            r9.mo17750g(r5)
            r2.f58787l = r4
        L_0x0077:
            long r4 = r2.f58786k
            int r9 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r9 > 0) goto L_0x0089
            g7.d r4 = r2.f58776a
            boolean r1 = r4.mo32498a(r1)
            if (r1 == 0) goto L_0x0086
            goto L_0x0089
        L_0x0086:
            r2.f58783h = r8
            goto L_0x00e8
        L_0x0089:
            r2.f58786k = r11
            g7.d r1 = r2.f58776a
            e8.m r1 = r1.f58761b
            long r4 = r2.mo32494b(r1)
            int r8 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r8 < 0) goto L_0x00c2
            long r8 = r2.f58782g
            long r10 = r8 + r4
            long r12 = r2.f58780e
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 < 0) goto L_0x00c2
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r8 * r10
            int r10 = r2.f58784i
            long r10 = (long) r10
            long r13 = r8 / r10
            b7.m r8 = r2.f58777b
            int r9 = r1.f57811c
            r8.mo17742b(r1, r9)
            b7.m r12 = r2.f58777b
            r15 = 1
            int r1 = r1.f57811c
            r17 = 0
            r18 = 0
            r16 = r1
            r12.mo17744d(r13, r15, r16, r17, r18)
            r2.f58780e = r6
        L_0x00c2:
            long r6 = r2.f58782g
            long r6 = r6 + r4
            r2.f58782g = r6
            goto L_0x016c
        L_0x00c9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x00cf:
            long r4 = r2.f58781f
            int r5 = (int) r4
            b7.b r1 = (p294b7.C16738b) r1
            r1.mo17738f(r5)
            r2.f58783h = r14
            goto L_0x016c
        L_0x00db:
            r5 = 1
        L_0x00dc:
            if (r5 == 0) goto L_0x0107
            g7.d r5 = r2.f58776a
            boolean r5 = r5.mo32498a(r1)
            if (r5 != 0) goto L_0x00eb
            r2.f58783h = r8
        L_0x00e8:
            r3 = -1
            goto L_0x016c
        L_0x00eb:
            r5 = r1
            b7.b r5 = (p294b7.C16738b) r5
            long r9 = r5.f45242c
            long r11 = r2.f58781f
            long r9 = r9 - r11
            r2.f58786k = r9
            g7.d r9 = r2.f58776a
            e8.m r9 = r9.f58761b
            g7.h$b r10 = r2.f58785j
            boolean r9 = r2.mo32495c(r9, r11, r10)
            if (r9 == 0) goto L_0x0105
            long r10 = r5.f45242c
            r2.f58781f = r10
        L_0x0105:
            r5 = r9
            goto L_0x00dc
        L_0x0107:
            g7.h$b r5 = r2.f58785j
            com.google.android.exoplayer2.Format r5 = r5.f58789a
            int r8 = r5.f45790y
            r2.f58784i = r8
            boolean r8 = r2.f58788m
            if (r8 != 0) goto L_0x011a
            b7.m r8 = r2.f58777b
            r8.mo17741a(r5)
            r2.f58788m = r4
        L_0x011a:
            g7.h$b r4 = r2.f58785j
            g7.f r4 = r4.f58790b
            r5 = 0
            if (r4 == 0) goto L_0x0124
            r2.f58779d = r4
            goto L_0x0133
        L_0x0124:
            b7.b r1 = (p294b7.C16738b) r1
            long r10 = r1.f45241b
            int r1 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0135
            g7.h$c r1 = new g7.h$c
            r1.<init>(r5)
            r2.f58779d = r1
        L_0x0133:
            r1 = 2
            goto L_0x014f
        L_0x0135:
            g7.d r1 = r2.f58776a
            g7.e r1 = r1.f58760a
            g7.a r4 = new g7.a
            long r8 = r2.f58781f
            int r6 = r1.f58769d
            int r7 = r1.f58770e
            int r13 = r7 + r6
            long r6 = r1.f58767b
            r15 = r6
            r7 = r4
            r12 = r2
            r1 = 2
            r14 = r15
            r7.<init>(r8, r10, r12, r13, r14)
            r2.f58779d = r4
        L_0x014f:
            r2.f58785j = r5
            r2.f58783h = r1
            g7.d r1 = r2.f58776a
            e8.m r1 = r1.f58761b
            byte[] r2 = r1.f57809a
            int r4 = r2.length
            r5 = 65025(0xfe01, float:9.112E-41)
            if (r4 != r5) goto L_0x0160
            goto L_0x016c
        L_0x0160:
            int r4 = r1.f57811c
            int r4 = java.lang.Math.max(r5, r4)
            byte[] r2 = java.util.Arrays.copyOf(r2, r4)
            r1.f57809a = r2
        L_0x016c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p341g7.C20795c.mo17745a(b7.f, b7.k):int");
    }

    /* renamed from: b */
    public void mo17746b(long j, long j2) {
        C20800h hVar = this.f58758b;
        if (hVar != null) {
            C20796d dVar = hVar.f58776a;
            C20797e eVar = dVar.f58760a;
            eVar.f58766a = 0;
            eVar.f58767b = 0;
            eVar.f58768c = 0;
            eVar.f58769d = 0;
            eVar.f58770e = 0;
            dVar.f58761b.mo32109t();
            dVar.f58762c = -1;
            dVar.f58764e = false;
            if (j == 0) {
                hVar.mo32496d(!hVar.f58787l);
            } else if (hVar.f58783h != 0) {
                hVar.f58780e = hVar.f58779d.mo32492c(j2);
                hVar.f58783h = 2;
            }
        }
    }

    /* renamed from: c */
    public boolean mo17747c(C16742f fVar) {
        try {
            return mo32497d(fVar);
        } catch (C23015n unused) {
            return false;
        }
    }

    /* renamed from: d */
    public final boolean mo32497d(C16742f fVar) {
        boolean z;
        boolean z2;
        C20797e eVar = new C20797e();
        if (eVar.mo32499a(fVar, true) && (eVar.f58766a & 2) == 2) {
            int min = Math.min(eVar.f58770e, 8);
            C20541m mVar = new C20541m(min);
            ((C16738b) fVar).mo17734b(mVar.f57809a, 0, min, false);
            mVar.mo32113x(0);
            if (mVar.f57811c - mVar.f57810b >= 5 && mVar.mo32103n() == 127 && mVar.mo32104o() == 1179402563) {
                this.f58758b = new C20793b();
            } else {
                mVar.mo32113x(0);
                try {
                    z = C20807k.m22805a(1, mVar, true);
                } catch (C23015n unused) {
                    z = false;
                }
                if (z) {
                    this.f58758b = new C20805j();
                } else {
                    mVar.mo32113x(0);
                    int i = C20799g.f58773o;
                    int i2 = mVar.f57811c - mVar.f57810b;
                    byte[] bArr = C20799g.f58774p;
                    if (i2 < bArr.length) {
                        z2 = false;
                    } else {
                        byte[] bArr2 = new byte[bArr.length];
                        mVar.mo32091b(bArr2, 0, bArr.length);
                        z2 = Arrays.equals(bArr2, bArr);
                    }
                    if (z2) {
                        this.f58758b = new C20799g();
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public void mo17748e(C16743g gVar) {
        this.f58757a = gVar;
    }

    public void release() {
    }
}
