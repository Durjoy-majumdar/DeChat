package me1;

import i31.C117134d;
import j31.C117294b;
import je1.C9342n1;
import rx3.C36570n;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: me1.b */
public final class C117551b extends C117134d<String, C9342n1.C9346d, C9342n1> {

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.cgi.loadertask.FinderStreamLoaderTask", mo125469f = "FinderStreamLoaderTask.kt", mo125470l = {37, 39}, mo125471m = "run")
    /* renamed from: me1.b$a */
    public static final class C117552a extends C66704d {

        /* renamed from: d */
        public Object f351692d;

        /* renamed from: e */
        public boolean f351693e;

        /* renamed from: f */
        public /* synthetic */ Object f351694f;

        /* renamed from: g */
        public final /* synthetic */ C117551b f351695g;

        /* renamed from: h */
        public int f351696h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C117552a(C117551b bVar, C15601d<? super C117552a> dVar) {
            super(dVar);
            this.f351695g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f351694f = obj;
            this.f351696h |= Integer.MIN_VALUE;
            return this.f351695g.mo181071g(false, this);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C117551b(fy3.C32224a r9, a14.C53973z1 r10, androidx.lifecycle.C0125s r11, int r12, gy3.C8480h r13) {
        /*
            r8 = this;
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto L_0x0007
            r3 = r0
            goto L_0x0008
        L_0x0007:
            r3 = r10
        L_0x0008:
            r10 = r12 & 4
            if (r10 == 0) goto L_0x000e
            r4 = r0
            goto L_0x000f
        L_0x000e:
            r4 = r11
        L_0x000f:
            java.lang.String r10 = "initTask"
            gy3.C87412m.m108594g(r9, r10)
            r5 = 0
            r6 = 8
            r7 = 0
            r1 = r8
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me1.C117551b.<init>(fy3.a, a14.z1, androidx.lifecycle.s, int, gy3.h):void");
    }

    /* renamed from: a */
    public C117294b<String, C9342n1.C9346d> mo383a() {
        return new C21497a((String) ((C36570n) this.f350950c).getValue());
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0076 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077 A[PHI: r1 
      PHI: (r1v2 java.lang.Object) = (r1v4 java.lang.Object), (r1v1 java.lang.Object) binds: [B:19:0x0074, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo181071g(boolean r18, wx3.C15601d<? super je1.C9342n1.C9346d> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof me1.C117551b.C117552a
            if (r2 == 0) goto L_0x0017
            r2 = r1
            me1.b$a r2 = (me1.C117551b.C117552a) r2
            int r3 = r2.f351696h
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f351696h = r3
            goto L_0x001c
        L_0x0017:
            me1.b$a r2 = new me1.b$a
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.f351694f
            xx3.a r3 = xx3.C15911a.COROUTINE_SUSPENDED
            int r4 = r2.f351696h
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L_0x0041
            if (r4 == r6) goto L_0x0036
            if (r4 != r5) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r1)
            goto L_0x0077
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0036:
            boolean r4 = r2.f351693e
            java.lang.Object r6 = r2.f351692d
            me1.b r6 = (me1.C117551b) r6
            kotlin.ResultKt.throwOnFailure(r1)
            r1 = r4
            goto L_0x0054
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r1)
            r2.f351692d = r0
            r1 = r18
            r2.f351693e = r1
            r2.f351696h = r6
            java.lang.Object r4 = r0.mo181072j(r2)
            if (r4 != r3) goto L_0x0053
            return r3
        L_0x0053:
            r6 = r0
        L_0x0054:
            dp1.e0 r7 = dp1.C20480e0.f57583a
            i31.g r4 = r6.mo181068b()
            je1.n1 r4 = (je1.C9342n1) r4
            int r8 = r4.f29180d
            r9 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 60
            r16 = 0
            dp1.C20480e0.m22094n(r7, r8, r9, r10, r11, r12, r14, r15, r16)
            r4 = 0
            r2.f351692d = r4
            r2.f351696h = r5
            java.lang.Object r1 = i31.C117134d.m165174i(r6, r1, r2)
            if (r1 != r3) goto L_0x0077
            return r3
        L_0x0077:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: me1.C117551b.mo181071g(boolean, wx3.d):java.lang.Object");
    }
}
