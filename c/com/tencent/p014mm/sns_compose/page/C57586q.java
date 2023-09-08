package com.tencent.p014mm.sns_compose.page;

import gy3.C87412m;
import lh3.C99474g;
import p247u3.C65145q1;
import p247u3.C65164r1;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: com.tencent.mm.sns_compose.page.q */
public final class C57586q extends C65145q1<Long, C99474g> {

    @C91590f(mo125468c = "com.tencent.mm.sns_compose.page.WithTaDataSource", mo125469f = "WithTaDataSource.kt", mo125470l = {27}, mo125471m = "load")
    /* renamed from: com.tencent.mm.sns_compose.page.q$a */
    public static final class C57587a extends C66704d {

        /* renamed from: d */
        public long f164898d;

        /* renamed from: e */
        public /* synthetic */ Object f164899e;

        /* renamed from: f */
        public final /* synthetic */ C57586q f164900f;

        /* renamed from: g */
        public int f164901g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C57587a(C57586q qVar, C15601d<? super C57587a> dVar) {
            super(dVar);
            this.f164900f = qVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f164899e = obj;
            this.f164901g |= Integer.MIN_VALUE;
            return this.f164900f.mo72456d((C65145q1.C65146a<Long>) null, this);
        }
    }

    /* renamed from: b */
    public Object mo72455b(C65164r1 r1Var) {
        C87412m.m108594g(r1Var, "state");
        return -1L;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo72456d(p247u3.C65145q1.C65146a<java.lang.Long> r8, wx3.C15601d<? super p247u3.C65145q1.C65150b<java.lang.Long, lh3.C99474g>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.tencent.p014mm.sns_compose.page.C57586q.C57587a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.tencent.mm.sns_compose.page.q$a r0 = (com.tencent.p014mm.sns_compose.page.C57586q.C57587a) r0
            int r1 = r0.f164901g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f164901g = r1
            goto L_0x0018
        L_0x0013:
            com.tencent.mm.sns_compose.page.q$a r0 = new com.tencent.mm.sns_compose.page.q$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f164899e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f164901g
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            long r0 = r0.f164898d
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0055
        L_0x0029:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r8 = r8.mo89309a()
            java.lang.Long r8 = (java.lang.Long) r8
            if (r8 == 0) goto L_0x0041
            long r8 = r8.longValue()
            goto L_0x0043
        L_0x0041:
            r8 = -1
        L_0x0043:
            kh3.a r2 = kh3.C61095a.f173960a
            r4 = 40
            r0.f164898d = r8
            r0.f164901g = r3
            java.lang.Object r0 = r2.mo86020i(r8, r4, r0)
            if (r0 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r5 = r8
            r9 = r0
            r0 = r5
        L_0x0055:
            lh3.f r9 = (lh3.C61285f) r9
            boolean r8 = r9 instanceof lh3.C61285f.C61287b
            java.lang.String r2 = "DemoDataSource"
            r3 = 0
            if (r8 == 0) goto L_0x009d
            lh3.f$b r9 = (lh3.C61285f.C61287b) r9
            T r8 = r9.f174396a
            lh3.e r8 = (lh3.C34282e) r8
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r4 = "ok curKey: "
            r9.append(r4)
            r9.append(r0)
            java.lang.String r0 = ", nextKey: "
            r9.append(r0)
            long r0 = r8.f92402c
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r9)
            boolean r9 = r8.f92401b
            if (r9 == 0) goto L_0x0095
            u3.q1$b$b r9 = new u3.q1$b$b
            java.util.List<T> r0 = r8.f92400a
            long r1 = r8.f92402c
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r1)
            r9.<init>(r0, r3, r8)
            goto L_0x00a9
        L_0x0095:
            u3.q1$b$b r9 = new u3.q1$b$b
            java.util.List<T> r8 = r8.f92400a
            r9.<init>(r8, r3, r3)
            goto L_0x00a9
        L_0x009d:
            java.lang.String r8 = "error"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r8)
            u3.q1$b$b r9 = new u3.q1$b$b
            sx3.f0 r8 = sx3.C64186f0.f181907d
            r9.<init>(r8, r3, r3)
        L_0x00a9:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sns_compose.page.C57586q.mo72456d(u3.q1$a, wx3.d):java.lang.Object");
    }
}
