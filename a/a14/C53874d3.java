package a14;

import f14.C58878f0;
import f14.C58907y;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: a14.d3 */
public final class C53874d3<T> extends C58907y<T> {

    /* renamed from: g */
    public ThreadLocal<C13604l<C66212f, Object>> f151120g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C53874d3(wx3.C66212f r3, wx3.C15601d<? super T> r4) {
        /*
            r2 = this;
            a14.e3 r0 = a14.C53880e3.f151125d
            wx3.f$b r1 = r3.get(r0)
            if (r1 != 0) goto L_0x000d
            wx3.f r0 = r3.plus(r0)
            goto L_0x000e
        L_0x000d:
            r0 = r3
        L_0x000e:
            r2.<init>(r0, r4)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.f151120g = r0
            wx3.f r4 = r4.getContext()
            wx3.e$a r0 = wx3.C66210e.C66211a.f190251d
            wx3.f$b r4 = r4.get(r0)
            boolean r4 = r4 instanceof a14.C53896h0
            if (r4 != 0) goto L_0x0038
            r4 = 0
            java.lang.Object r4 = f14.C58878f0.m68716c(r3, r4)
            f14.C58878f0.m68714a(r3, r4)
            java.lang.ThreadLocal<rx3.l<wx3.f, java.lang.Object>> r0 = r2.f151120g
            rx3.l r1 = new rx3.l
            r1.<init>(r3, r4)
            r0.set(r1)
        L_0x0038:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53874d3.<init>(wx3.f, wx3.d):void");
    }

    /* renamed from: v0 */
    public void mo74470v0(Object obj) {
        C13604l lVar = this.f151120g.get();
        C53874d3<?> d3Var = null;
        if (lVar != null) {
            C58878f0.m68714a((C66212f) lVar.f38555d, lVar.f38556e);
            this.f151120g.set(d3Var);
        }
        Object a = C53865c0.m60381a(obj, this.f168560f);
        C15601d<T> dVar = this.f168560f;
        C66212f context = dVar.getContext();
        Object c = C58878f0.m68716c(context, d3Var);
        if (c != C58878f0.f168516a) {
            d3Var = C53876e0.m60399c(dVar, context, c);
        }
        try {
            this.f168560f.resumeWith(a);
            C13598b0 b0Var = C13598b0.f38549a;
        } finally {
            if (d3Var == null || d3Var.mo74501z0()) {
                C58878f0.m68714a(context, c);
            }
        }
    }

    /* renamed from: z0 */
    public final boolean mo74501z0() {
        if (this.f151120g.get() == null) {
            return false;
        }
        this.f151120g.set((Object) null);
        return true;
    }
}
