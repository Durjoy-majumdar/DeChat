package me1;

import gy3.C87412m;
import j31.C9279c;
import je1.C9342n1;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: me1.a */
public final class C21497a extends C9279c<String, C9342n1.C9346d> {

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.cgi.loadertask.FinderStreamDataCache", mo125469f = "FinderStreamLoaderTask.kt", mo125470l = {47, 53}, mo125471m = "requestCache")
    /* renamed from: me1.a$a */
    public static final class C21498a extends C66704d {

        /* renamed from: d */
        public long f60862d;

        /* renamed from: e */
        public Object f60863e;

        /* renamed from: f */
        public /* synthetic */ Object f60864f;

        /* renamed from: g */
        public final /* synthetic */ C21497a f60865g;

        /* renamed from: h */
        public int f60866h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21498a(C21497a aVar, C15601d<? super C21498a> dVar) {
            super(dVar);
            this.f60865g = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f60864f = obj;
            this.f60866h |= Integer.MIN_VALUE;
            return this.f60865g.mo378d(this);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21497a(String str) {
        super(str);
        C87412m.m108594g(str, "key");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo378d(wx3.C15601d<? super je1.C9342n1.C9346d> r13) {
        /*
            r12 = this;
            boolean r0 = r13 instanceof me1.C21497a.C21498a
            if (r0 == 0) goto L_0x0013
            r0 = r13
            me1.a$a r0 = (me1.C21497a.C21498a) r0
            int r1 = r0.f60866h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f60866h = r1
            goto L_0x0018
        L_0x0013:
            me1.a$a r0 = new me1.a$a
            r0.<init>(r12, r13)
        L_0x0018:
            java.lang.Object r13 = r0.f60864f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f60866h
            r3 = 2
            r4 = 1
            java.lang.String r5 = "Finder.FinderStreamLoaderTask"
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r0 = r0.f60863e
            je1.n1$d r0 = (je1.C9342n1.C9346d) r0
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00ab
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0039:
            long r6 = r0.f60862d
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0056
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r13)
            long r6 = android.os.SystemClock.uptimeMillis()
            java.lang.String r13 = "requestCache: start"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            r0.f60862d = r6
            r0.f60866h = r4
            java.lang.Object r13 = j31.C9279c.m8917i(r12, r0)
            if (r13 != r1) goto L_0x0056
            return r1
        L_0x0056:
            je1.n1$d r13 = (je1.C9342n1.C9346d) r13
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "requestCache: value = "
            r2.append(r4)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            if (r13 == 0) goto L_0x00ac
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Long> r2 = up1.C37521f.f99343Z1
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            long r8 = r2.longValue()
            long r10 = android.os.SystemClock.uptimeMillis()
            long r10 = r10 - r6
            long r8 = r8 - r10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "requestCache: loading delay = "
            r2.append(r4)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r2)
            r4 = 0
            int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r2 <= 0) goto L_0x00ac
            r0.f60863e = r13
            r0.f60866h = r3
            java.lang.Object r0 = a14.C53965x0.m60607b(r8, r0)
            if (r0 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r0 = r13
        L_0x00ab:
            r13 = r0
        L_0x00ac:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: me1.C21497a.mo378d(wx3.d):java.lang.Object");
    }
}
