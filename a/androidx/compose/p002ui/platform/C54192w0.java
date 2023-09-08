package androidx.compose.p002ui.platform;

import a14.C0000n0;
import c14.C54625h;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", mo125469f = "GlobalSnapshotManager.android.kt", mo125470l = {63}, mo125471m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.w0 */
public final class C54192w0 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f152151d;

    /* renamed from: e */
    public Object f152152e;

    /* renamed from: f */
    public int f152153f;

    /* renamed from: g */
    public final /* synthetic */ C54625h<C13598b0> f152154g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54192w0(C54625h<C13598b0> hVar, C15601d<? super C54192w0> dVar) {
        super(2, dVar);
        this.f152154g = hVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C54192w0(this.f152154g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C54192w0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x007a, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x007b, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048 A[Catch:{ all -> 0x007a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f152153f
            r2 = 1
            if (r1 == 0) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r1 = r8.f152152e
            c14.j r1 = (c14.C54628j) r1
            java.lang.Object r3 = r8.f152151d
            c14.x r3 = (c14.C54649x) r3
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ all -> 0x007d }
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            goto L_0x003f
        L_0x0019:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0021:
            kotlin.ResultKt.throwOnFailure(r9)
            c14.h<rx3.b0> r3 = r8.f152154g
            c14.j r9 = r3.iterator()     // Catch:{ all -> 0x007d }
            r1 = r9
            r9 = r8
        L_0x002c:
            r9.f152151d = r3     // Catch:{ all -> 0x007d }
            r9.f152152e = r1     // Catch:{ all -> 0x007d }
            r9.f152153f = r2     // Catch:{ all -> 0x007d }
            java.lang.Object r4 = r1.mo75523a(r9)     // Catch:{ all -> 0x007d }
            if (r4 != r0) goto L_0x0039
            return r0
        L_0x0039:
            r7 = r0
            r0 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r7
        L_0x003f:
            r5 = 0
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x007a }
            boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x007a }
            if (r9 == 0) goto L_0x0074
            java.lang.Object r9 = r3.next()     // Catch:{ all -> 0x007a }
            rx3.b0 r9 = (rx3.C13598b0) r9     // Catch:{ all -> 0x007a }
            java.lang.Object r9 = p241t0.C110865n.f331651c     // Catch:{ all -> 0x007a }
            monitor-enter(r9)     // Catch:{ all -> 0x007a }
            java.util.concurrent.atomic.AtomicReference<t0.a> r5 = p241t0.C110865n.f331657i     // Catch:{ all -> 0x0071 }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x0071 }
            t0.a r5 = (p241t0.C110834a) r5     // Catch:{ all -> 0x0071 }
            java.util.Set<t0.h0> r5 = r5.f331588h     // Catch:{ all -> 0x0071 }
            r6 = 0
            if (r5 == 0) goto L_0x0066
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0071 }
            r5 = r5 ^ r2
            if (r5 != r2) goto L_0x0066
            r6 = 1
        L_0x0066:
            monitor-exit(r9)     // Catch:{ all -> 0x007a }
            if (r6 == 0) goto L_0x006c
            p241t0.C110865n.m151138a()     // Catch:{ all -> 0x007a }
        L_0x006c:
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x002c
        L_0x0071:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x007a }
            throw r0     // Catch:{ all -> 0x007a }
        L_0x0074:
            c14.C54633m.m61481a(r4, r5)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        L_0x007a:
            r9 = move-exception
            r3 = r4
            goto L_0x007e
        L_0x007d:
            r9 = move-exception
        L_0x007e:
            throw r9     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            c14.C54633m.m61481a(r3, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p002ui.platform.C54192w0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
