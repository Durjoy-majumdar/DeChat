package com.tencent.p014mm.plugin.appbrand.page;

import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C87412m;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: com.tencent.mm.plugin.appbrand.page.j4 */
public final class C1948j4 {

    /* renamed from: a */
    public final C83780d1 f11842a;

    /* renamed from: b */
    public final MMHandler f11843b;

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.page.PageSnapshotStore", mo125469f = "PageSnapshotStore.kt", mo125470l = {37, 39}, mo125471m = "takeSnapshot")
    /* renamed from: com.tencent.mm.plugin.appbrand.page.j4$a */
    public static final class C1949a extends C66704d {

        /* renamed from: d */
        public Object f11844d;

        /* renamed from: e */
        public Object f11845e;

        /* renamed from: f */
        public /* synthetic */ Object f11846f;

        /* renamed from: g */
        public final /* synthetic */ C1948j4 f11847g;

        /* renamed from: h */
        public int f11848h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1949a(C1948j4 j4Var, C15601d<? super C1949a> dVar) {
            super(dVar);
            this.f11847g = j4Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f11846f = obj;
            this.f11848h |= Integer.MIN_VALUE;
            return this.f11847g.mo1851a(0, (String) null, this);
        }
    }

    public C1948j4(C83780d1 d1Var) {
        C87412m.m108594g(d1Var, "page");
        this.f11842a = d1Var;
        MMHandler mMHandler = new MMHandler(Looper.getMainLooper());
        mMHandler.setLogging(false);
        this.f11843b = mMHandler;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009d A[PHI: r15 
      PHI: (r15v2 java.lang.Object) = (r15v3 java.lang.Object), (r15v1 java.lang.Object) binds: [B:26:0x009a, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo1851a(long r12, java.lang.String r14, wx3.C15601d<? super android.graphics.Bitmap> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.tencent.p014mm.plugin.appbrand.page.C1948j4.C1949a
            if (r0 == 0) goto L_0x0013
            r0 = r15
            com.tencent.mm.plugin.appbrand.page.j4$a r0 = (com.tencent.p014mm.plugin.appbrand.page.C1948j4.C1949a) r0
            int r1 = r0.f11848h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f11848h = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.plugin.appbrand.page.j4$a r0 = new com.tencent.mm.plugin.appbrand.page.j4$a
            r0.<init>(r11, r15)
        L_0x0018:
            java.lang.Object r15 = r0.f11846f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f11848h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x009d
        L_0x002b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0033:
            java.lang.Object r12 = r0.f11845e
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r0.f11844d
            com.tencent.mm.plugin.appbrand.page.j4 r13 = (com.tencent.p014mm.plugin.appbrand.page.C1948j4) r13
            kotlin.ResultKt.throwOnFailure(r15)
            r14 = r12
            goto L_0x0056
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r15)
            r5 = 0
            int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r15 <= 0) goto L_0x0058
            r0.f11844d = r11
            r0.f11845e = r14
            r0.f11848h = r4
            java.lang.Object r12 = a14.C53965x0.m60607b(r12, r0)
            if (r12 != r1) goto L_0x0058
            return r1
        L_0x0056:
            r6 = r14
            goto L_0x005a
        L_0x0058:
            r13 = r11
            goto L_0x0056
        L_0x005a:
            com.tencent.mm.plugin.appbrand.page.d1 r7 = r13.f11842a
            r12 = 0
            r0.f11844d = r12
            r0.f11845e = r12
            r0.f11848h = r3
            java.lang.Class<hb.c> r13 = p547hb.C87464c.class
            java.lang.Object r13 = r7.mo116150E0(r13)
            hb.c r13 = (p547hb.C87464c) r13
            if (r13 == 0) goto L_0x008c
            long r8 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            a14.m r12 = new a14.m
            wx3.d r14 = xx3.C66447b.m78392b(r0)
            r12.<init>(r14, r4)
            r12.mo74609p()
            com.tencent.mm.plugin.appbrand.page.k4 r14 = new com.tencent.mm.plugin.appbrand.page.k4
            r5 = r14
            r10 = r12
            r5.<init>(r6, r7, r8, r10)
            r13.mo111270v(r14)
            java.lang.Object r12 = r12.mo74608o()
            goto L_0x0099
        L_0x008c:
            a14.h0 r13 = a14.C53872d1.f151117a
            a14.k2 r13 = f14.C58901s.f168555a
            com.tencent.mm.plugin.appbrand.page.l4 r14 = new com.tencent.mm.plugin.appbrand.page.l4
            r14.<init>(r7, r6, r12)
            java.lang.Object r12 = a14.C53895h.m60469g(r13, r14, r0)
        L_0x0099:
            r15 = r12
            if (r15 != r1) goto L_0x009d
            return r1
        L_0x009d:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.page.C1948j4.mo1851a(long, java.lang.String, wx3.d):java.lang.Object");
    }
}
