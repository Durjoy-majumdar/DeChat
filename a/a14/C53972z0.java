package a14;

import f14.C58907y;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: a14.z0 */
public final class C53972z0<T> extends C58907y<T> {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f151220g = AtomicIntegerFieldUpdater.newUpdater(C53972z0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C53972z0(C66212f fVar, C15601d<? super T> dVar) {
        super(fVar, dVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo74470v0(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L_0x0016
            if (r0 != r2) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f151220g
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            wx3.d<T> r0 = r4.f168560f
            wx3.d r0 = xx3.C66447b.m78392b(r0)
            wx3.d<T> r1 = r4.f168560f
            java.lang.Object r5 = a14.C53865c0.m60381a(r5, r1)
            r1 = 0
            f14.C58885i.m68733b(r0, r5, r1, r3, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53972z0.mo74470v0(java.lang.Object):void");
    }

    /* renamed from: x */
    public void mo74511x(Object obj) {
        mo74470v0(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74648z0() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f151220g
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.mo74531d0()
            java.lang.Object r0 = a14.C53899h2.m60476a(r0)
            boolean r1 = r0 instanceof a14.C53969y
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            a14.y r0 = (a14.C53969y) r0
            java.lang.Throwable r0 = r0.f151214a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53972z0.mo74648z0():java.lang.Object");
    }
}
