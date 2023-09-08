package f14;

import fy3.C32226l;
import wx3.C15601d;

/* renamed from: f14.i */
public final class C58885i {

    /* renamed from: a */
    public static final C58872c0 f168529a = new C58872c0("UNDEFINED");

    /* renamed from: b */
    public static final C58872c0 f168530b = new C58872c0("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009f, code lost:
        if (r0.mo74501z0() != false) goto L_0x00a1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m68732a(wx3.C15601d<? super T> r6, java.lang.Object r7, fy3.C32226l<? super java.lang.Throwable, rx3.C13598b0> r8) {
        /*
            boolean r0 = r6 instanceof f14.C58883h
            if (r0 == 0) goto L_0x00c6
            f14.h r6 = (f14.C58883h) r6
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r7)
            r1 = 0
            r2 = 0
            if (r0 != 0) goto L_0x0018
            if (r8 == 0) goto L_0x0016
            a14.z r0 = new a14.z
            r0.<init>(r7, r8)
            goto L_0x001f
        L_0x0016:
            r0 = r7
            goto L_0x001f
        L_0x0018:
            a14.y r8 = new a14.y
            r3 = 2
            r8.<init>(r0, r2, r3, r1)
            r0 = r8
        L_0x001f:
            a14.h0 r8 = r6.f168525g
            wx3.f r3 = r6.getContext()
            boolean r8 = r8.mo74565h0(r3)
            r3 = 1
            if (r8 == 0) goto L_0x003b
            r6.f168527i = r0
            r6.f151095f = r3
            a14.h0 r7 = r6.f168525g
            wx3.f r8 = r6.getContext()
            r7.mo74497S(r8, r6)
            goto L_0x00c9
        L_0x003b:
            a14.x2 r8 = a14.C53968x2.f151211a
            a14.j1 r8 = r8.mo74642a()
            boolean r4 = r8.mo74572l0()
            if (r4 == 0) goto L_0x0050
            r6.f168527i = r0
            r6.f151095f = r3
            r8.mo74570j0(r6)
            goto L_0x00c9
        L_0x0050:
            r8.mo74571k0(r3)
            wx3.f r4 = r6.getContext()     // Catch:{ all -> 0x00b9 }
            a14.z1$b r5 = a14.C53973z1.C0004b.f3d     // Catch:{ all -> 0x00b9 }
            wx3.f$b r4 = r4.get(r5)     // Catch:{ all -> 0x00b9 }
            a14.z1 r4 = (a14.C53973z1) r4     // Catch:{ all -> 0x00b9 }
            if (r4 == 0) goto L_0x007a
            boolean r5 = r4.mo74466a()     // Catch:{ all -> 0x00b9 }
            if (r5 != 0) goto L_0x007a
            java.util.concurrent.CancellationException r2 = r4.mo74526Z()     // Catch:{ all -> 0x00b9 }
            r6.mo74475b(r0, r2)     // Catch:{ all -> 0x00b9 }
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00b9 }
            r6.resumeWith(r0)     // Catch:{ all -> 0x00b9 }
            r2 = 1
        L_0x007a:
            if (r2 != 0) goto L_0x00b2
            wx3.d<T> r0 = r6.f168526h     // Catch:{ all -> 0x00b9 }
            java.lang.Object r2 = r6.f168528j     // Catch:{ all -> 0x00b9 }
            wx3.f r4 = r0.getContext()     // Catch:{ all -> 0x00b9 }
            java.lang.Object r2 = f14.C58878f0.m68716c(r4, r2)     // Catch:{ all -> 0x00b9 }
            f14.c0 r5 = f14.C58878f0.f168516a     // Catch:{ all -> 0x00b9 }
            if (r2 == r5) goto L_0x0091
            a14.d3 r0 = a14.C53876e0.m60399c(r0, r4, r2)     // Catch:{ all -> 0x00b9 }
            goto L_0x0092
        L_0x0091:
            r0 = r1
        L_0x0092:
            wx3.d<T> r5 = r6.f168526h     // Catch:{ all -> 0x00a5 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x00a5 }
            rx3.b0 r7 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x00a1
            boolean r7 = r0.mo74501z0()     // Catch:{ all -> 0x00b9 }
            if (r7 == 0) goto L_0x00b2
        L_0x00a1:
            f14.C58878f0.m68714a(r4, r2)     // Catch:{ all -> 0x00b9 }
            goto L_0x00b2
        L_0x00a5:
            r7 = move-exception
            if (r0 == 0) goto L_0x00ae
            boolean r0 = r0.mo74501z0()     // Catch:{ all -> 0x00b9 }
            if (r0 == 0) goto L_0x00b1
        L_0x00ae:
            f14.C58878f0.m68714a(r4, r2)     // Catch:{ all -> 0x00b9 }
        L_0x00b1:
            throw r7     // Catch:{ all -> 0x00b9 }
        L_0x00b2:
            boolean r7 = r8.mo74574o0()     // Catch:{ all -> 0x00b9 }
            if (r7 != 0) goto L_0x00b2
            goto L_0x00bd
        L_0x00b9:
            r7 = move-exception
            r6.mo74479g(r7, r1)     // Catch:{ all -> 0x00c1 }
        L_0x00bd:
            r8.mo74569i0(r3)
            goto L_0x00c9
        L_0x00c1:
            r6 = move-exception
            r8.mo74569i0(r3)
            throw r6
        L_0x00c6:
            r6.resumeWith(r7)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f14.C58885i.m68732a(wx3.d, java.lang.Object, fy3.l):void");
    }

    /* renamed from: b */
    public static /* synthetic */ void m68733b(C15601d dVar, Object obj, C32226l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m68732a(dVar, obj, lVar);
    }
}
