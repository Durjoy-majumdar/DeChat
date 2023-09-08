package a14;

import gy3.C87412m;
import j14.C60725h;
import rx3.C90107a;
import wx3.C15601d;

/* renamed from: a14.a1 */
public abstract class C53853a1<T> extends C60725h {

    /* renamed from: f */
    public int f151095f;

    public C53853a1(int i) {
        this.f151095f = i;
    }

    /* renamed from: b */
    public void mo74475b(Object obj, Throwable th) {
    }

    /* renamed from: d */
    public abstract C15601d<T> mo74476d();

    /* renamed from: e */
    public Throwable mo74477e(Object obj) {
        C53969y yVar = obj instanceof C53969y ? (C53969y) obj : null;
        if (yVar != null) {
            return yVar.f151214a;
        }
        return null;
    }

    /* renamed from: f */
    public <T> T mo74478f(Object obj) {
        return obj;
    }

    /* renamed from: g */
    public final void mo74479g(Throwable th, Throwable th4) {
        if (th != null || th4 != null) {
            if (!(th == null || th4 == null)) {
                C90107a.m112735a(th, th4);
            }
            if (th == null) {
                th = th4;
            }
            C87412m.m108591d(th);
            C53918l0.m60515a(mo74476d().getContext(), new C53938q0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: h */
    public abstract Object mo74480h();

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r4.mo74501z0() != false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ae, code lost:
        if (r4.mo74501z0() != false) goto L_0x00b0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004b A[Catch:{ all -> 0x00a7, all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060 A[Catch:{ all -> 0x00a7, all -> 0x00b4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081 A[SYNTHETIC, Splitter:B:27:0x0081] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r12 = this;
            j14.i r0 = r12.f172961e
            wx3.d r1 = r12.mo74476d()     // Catch:{ all -> 0x00b4 }
            f14.h r1 = (f14.C58883h) r1     // Catch:{ all -> 0x00b4 }
            wx3.d<T> r2 = r1.f168526h     // Catch:{ all -> 0x00b4 }
            java.lang.Object r1 = r1.f168528j     // Catch:{ all -> 0x00b4 }
            wx3.f r3 = r2.getContext()     // Catch:{ all -> 0x00b4 }
            java.lang.Object r1 = f14.C58878f0.m68716c(r3, r1)     // Catch:{ all -> 0x00b4 }
            f14.c0 r4 = f14.C58878f0.f168516a     // Catch:{ all -> 0x00b4 }
            r5 = 0
            if (r1 == r4) goto L_0x001e
            a14.d3 r4 = a14.C53876e0.m60399c(r2, r3, r1)     // Catch:{ all -> 0x00b4 }
            goto L_0x001f
        L_0x001e:
            r4 = r5
        L_0x001f:
            wx3.f r6 = r2.getContext()     // Catch:{ all -> 0x00a7 }
            java.lang.Object r7 = r12.mo74480h()     // Catch:{ all -> 0x00a7 }
            java.lang.Throwable r8 = r12.mo74477e(r7)     // Catch:{ all -> 0x00a7 }
            if (r8 != 0) goto L_0x0042
            int r9 = r12.f151095f     // Catch:{ all -> 0x00a7 }
            r10 = 1
            if (r9 == r10) goto L_0x0037
            r11 = 2
            if (r9 != r11) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r10 = 0
        L_0x0037:
            if (r10 == 0) goto L_0x0042
            a14.z1$b r9 = a14.C53973z1.C0004b.f3d     // Catch:{ all -> 0x00a7 }
            wx3.f$b r6 = r6.get(r9)     // Catch:{ all -> 0x00a7 }
            a14.z1 r6 = (a14.C53973z1) r6     // Catch:{ all -> 0x00a7 }
            goto L_0x0043
        L_0x0042:
            r6 = r5
        L_0x0043:
            if (r6 == 0) goto L_0x0060
            boolean r9 = r6.mo74466a()     // Catch:{ all -> 0x00a7 }
            if (r9 != 0) goto L_0x0060
            java.util.concurrent.CancellationException r6 = r6.mo74526Z()     // Catch:{ all -> 0x00a7 }
            r12.mo74475b(r7, r6)     // Catch:{ all -> 0x00a7 }
            kotlin.Result$Companion r7 = kotlin.Result.Companion     // Catch:{ all -> 0x00a7 }
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r6)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r6 = kotlin.Result.m168114constructorimpl(r6)     // Catch:{ all -> 0x00a7 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a7 }
            goto L_0x007d
        L_0x0060:
            if (r8 == 0) goto L_0x0070
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x00a7 }
            java.lang.Object r6 = kotlin.ResultKt.createFailure(r8)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r6 = kotlin.Result.m168114constructorimpl(r6)     // Catch:{ all -> 0x00a7 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a7 }
            goto L_0x007d
        L_0x0070:
            kotlin.Result$Companion r6 = kotlin.Result.Companion     // Catch:{ all -> 0x00a7 }
            java.lang.Object r6 = r12.mo74478f(r7)     // Catch:{ all -> 0x00a7 }
            java.lang.Object r6 = kotlin.Result.m168114constructorimpl(r6)     // Catch:{ all -> 0x00a7 }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00a7 }
        L_0x007d:
            rx3.b0 r2 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00a7 }
            if (r4 == 0) goto L_0x0087
            boolean r2 = r4.mo74501z0()     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x008a
        L_0x0087:
            f14.C58878f0.m68714a(r3, r1)     // Catch:{ all -> 0x00b4 }
        L_0x008a:
            r0.mo85663a()     // Catch:{ all -> 0x0094 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0094 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x009f
        L_0x0094:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x009f:
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r0)
            r12.mo74479g(r5, r0)
            goto L_0x00d3
        L_0x00a7:
            r2 = move-exception
            if (r4 == 0) goto L_0x00b0
            boolean r4 = r4.mo74501z0()     // Catch:{ all -> 0x00b4 }
            if (r4 == 0) goto L_0x00b3
        L_0x00b0:
            f14.C58878f0.m68714a(r3, r1)     // Catch:{ all -> 0x00b4 }
        L_0x00b3:
            throw r2     // Catch:{ all -> 0x00b4 }
        L_0x00b4:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch:{ all -> 0x00c1 }
            r0.mo85663a()     // Catch:{ all -> 0x00c1 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00c1 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x00cc
        L_0x00c1:
            r0 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x00cc:
            java.lang.Throwable r0 = kotlin.Result.m168117exceptionOrNullimpl(r0)
            r12.mo74479g(r1, r0)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53853a1.run():void");
    }
}
