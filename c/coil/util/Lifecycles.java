package coil.util;

import androidx.lifecycle.C39623j;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: coil.util.-Lifecycles  reason: invalid class name */
public final class Lifecycles {

    @C91590f(mo125468c = "coil.util.-Lifecycles", mo125469f = "Lifecycles.kt", mo125470l = {44}, mo125471m = "observeStarted")
    /* renamed from: coil.util.-Lifecycles$a */
    public static final class C55060a extends C66704d {

        /* renamed from: d */
        public Object f154595d;

        /* renamed from: e */
        public Object f154596e;

        /* renamed from: f */
        public /* synthetic */ Object f154597f;

        /* renamed from: g */
        public int f154598g;

        public C55060a(C15601d<? super C55060a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f154597f = obj;
            this.f154598g |= Integer.MIN_VALUE;
            return Lifecycles.m62167a((C39623j) null, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m62167a(androidx.lifecycle.C39623j r5, wx3.C15601d<? super rx3.C13598b0> r6) {
        /*
            boolean r0 = r6 instanceof coil.util.Lifecycles.C55060a
            if (r0 == 0) goto L_0x0013
            r0 = r6
            coil.util.-Lifecycles$a r0 = (coil.util.Lifecycles.C55060a) r0
            int r1 = r0.f154598g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f154598g = r1
            goto L_0x0018
        L_0x0013:
            coil.util.-Lifecycles$a r0 = new coil.util.-Lifecycles$a
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f154597f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f154598g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r5 = r0.f154596e
            gy3.f0 r5 = (gy3.C8479f0) r5
            java.lang.Object r0 = r0.f154595d
            androidx.lifecycle.j r0 = (androidx.lifecycle.C39623j) r0
            kotlin.ResultKt.throwOnFailure(r6)     // Catch:{ all -> 0x002f }
            goto L_0x0068
        L_0x002f:
            r6 = move-exception
            goto L_0x007a
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r6)
            gy3.f0 r6 = new gy3.f0
            r6.<init>()
            r0.f154595d = r5     // Catch:{ all -> 0x0075 }
            r0.f154596e = r6     // Catch:{ all -> 0x0075 }
            r0.f154598g = r3     // Catch:{ all -> 0x0075 }
            a14.m r2 = new a14.m     // Catch:{ all -> 0x0075 }
            wx3.d r0 = xx3.C66447b.m78392b(r0)     // Catch:{ all -> 0x0075 }
            r2.<init>(r0, r3)     // Catch:{ all -> 0x0075 }
            r2.mo74609p()     // Catch:{ all -> 0x0075 }
            coil.util.-Lifecycles$observeStarted$2$1 r0 = new coil.util.-Lifecycles$observeStarted$2$1     // Catch:{ all -> 0x0075 }
            r0.<init>(r2)     // Catch:{ all -> 0x0075 }
            r6.f27484d = r0     // Catch:{ all -> 0x0075 }
            androidx.lifecycle.r r0 = (androidx.lifecycle.C0124r) r0     // Catch:{ all -> 0x0075 }
            r5.addObserver(r0)     // Catch:{ all -> 0x0075 }
            java.lang.Object r0 = r2.mo74608o()     // Catch:{ all -> 0x0075 }
            if (r0 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r0 = r5
            r5 = r6
        L_0x0068:
            T r5 = r5.f27484d
            androidx.lifecycle.r r5 = (androidx.lifecycle.C0124r) r5
            if (r5 != 0) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            r0.removeObserver(r5)
        L_0x0072:
            rx3.b0 r5 = rx3.C13598b0.f38549a
            return r5
        L_0x0075:
            r0 = move-exception
            r4 = r0
            r0 = r5
            r5 = r6
            r6 = r4
        L_0x007a:
            T r5 = r5.f27484d
            androidx.lifecycle.r r5 = (androidx.lifecycle.C0124r) r5
            if (r5 != 0) goto L_0x0081
            goto L_0x0084
        L_0x0081:
            r0.removeObserver(r5)
        L_0x0084:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: coil.util.Lifecycles.m62167a(androidx.lifecycle.j, wx3.d):java.lang.Object");
    }
}
