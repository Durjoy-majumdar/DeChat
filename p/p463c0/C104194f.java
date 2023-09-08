package p463c0;

import p1166z0.C112541g;
import p410k0.C108793e;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: c0.f */
public final class C104194f implements C104193e {

    /* renamed from: a */
    public final C108793e<C104199j> f308458a = new C108793e<>(new C104199j[16], 0);

    @C91590f(mo125468c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", mo125469f = "BringIntoViewRequester.kt", mo125470l = {121}, mo125471m = "bringIntoView")
    /* renamed from: c0.f$a */
    public static final class C104195a extends C66704d {

        /* renamed from: d */
        public Object f308459d;

        /* renamed from: e */
        public Object f308460e;

        /* renamed from: f */
        public int f308461f;

        /* renamed from: g */
        public int f308462g;

        /* renamed from: h */
        public /* synthetic */ Object f308463h;

        /* renamed from: i */
        public final /* synthetic */ C104194f f308464i;

        /* renamed from: j */
        public int f308465j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104195a(C104194f fVar, C15601d<? super C104195a> dVar) {
            super(dVar);
            this.f308464i = fVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f308463h = obj;
            this.f308465j |= Integer.MIN_VALUE;
            return this.f308464i.mo145810a((C112541g) null, this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0097, code lost:
        if (r13 >= r4) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo145810a(p1166z0.C112541g r13, wx3.C15601d<? super rx3.C13598b0> r14) {
        /*
            r12 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            boolean r1 = r14 instanceof p463c0.C104194f.C104195a
            if (r1 == 0) goto L_0x0015
            r1 = r14
            c0.f$a r1 = (p463c0.C104194f.C104195a) r1
            int r2 = r1.f308465j
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f308465j = r2
            goto L_0x001a
        L_0x0015:
            c0.f$a r1 = new c0.f$a
            r1.<init>(r12, r14)
        L_0x001a:
            java.lang.Object r14 = r1.f308463h
            int r2 = r1.f308465j
            r3 = 1
            if (r2 == 0) goto L_0x0040
            if (r2 != r3) goto L_0x0038
            int r13 = r1.f308462g
            int r2 = r1.f308461f
            java.lang.Object r4 = r1.f308460e
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r1.f308459d
            z0.g r5 = (p1166z0.C112541g) r5
            kotlin.ResultKt.throwOnFailure(r14)
            r14 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r0
            goto L_0x0096
        L_0x0038:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0040:
            kotlin.ResultKt.throwOnFailure(r14)
            k0.e<c0.j> r14 = r12.f308458a
            int r2 = r14.f325786f
            if (r2 <= 0) goto L_0x0099
            T[] r14 = r14.f325784d
            r4 = 0
            r5 = r14
            r4 = r2
            r14 = r13
            r2 = r1
            r13 = 0
            r1 = r0
        L_0x0052:
            r6 = r5[r13]
            c0.j r6 = (p463c0.C104199j) r6
            r2.f308459d = r14
            r2.f308460e = r5
            r2.f308461f = r4
            r2.f308462g = r13
            r2.f308465j = r3
            o1.o r7 = r6.f308456f
            r8 = 0
            if (r7 == 0) goto L_0x006c
            boolean r9 = r7.mo161183y()
            if (r9 == 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r7 = r8
        L_0x006d:
            if (r7 != 0) goto L_0x0072
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x0093
        L_0x0072:
            if (r14 != 0) goto L_0x0083
            long r8 = r7.mo161181b()
            long r8 = p560i2.C108329n.m146744b(r8)
            long r10 = p1166z0.C112539e.f336955b
            z0.g r8 = p1166z0.C112542h.m153752a(r10, r8)
            goto L_0x0084
        L_0x0083:
            r8 = r14
        L_0x0084:
            c0.d r9 = r6.f308455e
            if (r9 != 0) goto L_0x008a
            c0.d r9 = r6.f308454d
        L_0x008a:
            java.lang.Object r6 = r9.mo145807b(r8, r7, r2)
            if (r6 != r0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0093:
            if (r6 != r1) goto L_0x0096
            return r1
        L_0x0096:
            int r13 = r13 + r3
            if (r13 < r4) goto L_0x0052
        L_0x0099:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p463c0.C104194f.mo145810a(z0.g, wx3.d):java.lang.Object");
    }
}
