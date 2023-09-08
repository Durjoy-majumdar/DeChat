package com.tencent.p014mm.plugin.appbrand;

import android.util.SparseArray;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40322c;
import com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel;
import fy3.C32226l;
import sx3.C110823p;
import te3.C50731ou;
import te3.C50875pu;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: com.tencent.mm.plugin.appbrand.o */
public final class C83710o {

    /* renamed from: a */
    public static final C83710o f244345a = new C83710o();

    /* renamed from: b */
    public static final SparseArray<C83711b> f244346b = new SparseArray<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.o$a */
    public static final class C40497a extends C40322c<C50731ou, C50875pu> {

        /* renamed from: c */
        public final String f108807c = "MicroMsg.AppBrand.CheckPreHotCgi";

        /* renamed from: d */
        public final String f108808d = "/cgi-bin/mmbiz-bin/wxasync/wxaapp_checkprehot";

        /* renamed from: e */
        public final int f108809e = 10699;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C40497a(int r2) {
            /*
                r1 = this;
                te3.ou r0 = new te3.ou
                r0.<init>()
                r0.f139362d = r2
                te3.pu r2 = new te3.pu
                r2.<init>()
                r1.<init>(r0, r2)
                java.lang.String r2 = "MicroMsg.AppBrand.CheckPreHotCgi"
                r1.f108807c = r2
                java.lang.String r2 = "/cgi-bin/mmbiz-bin/wxasync/wxaapp_checkprehot"
                r1.f108808d = r2
                r2 = 10699(0x29cb, float:1.4992E-41)
                r1.f108809e = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C83710o.C40497a.<init>(int):void");
        }

        /* renamed from: a */
        public int mo63009a() {
            return this.f108809e;
        }

        /* renamed from: b */
        public String mo63010b() {
            return this.f108807c;
        }

        /* renamed from: c */
        public String mo63011c() {
            return this.f108808d;
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.o$b */
    public static final class C83711b {

        /* renamed from: a */
        public final long f244347a;

        /* renamed from: b */
        public final long f244348b;

        /* renamed from: c */
        public final int f244349c;

        public C83711b(long j, long j2, int i) {
            this.f244347a = j;
            this.f244348b = j2;
            this.f244349c = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C83711b)) {
                return false;
            }
            C83711b bVar = (C83711b) obj;
            return this.f244347a == bVar.f244347a && this.f244348b == bVar.f244348b && this.f244349c == bVar.f244349c;
        }

        public int hashCode() {
            long j = this.f244347a;
            long j2 = this.f244348b;
            return (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f244349c;
        }

        public String toString() {
            return "Result(responseTick=" + this.f244347a + ", cacheMilliseconds=" + this.f244348b + ", code=" + this.f244349c + ')';
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.appbrand.AppBrandPreRenderColdStartInterceptor", mo125469f = "AppBrandPreRenderColdStartService.kt", mo125470l = {384}, mo125471m = "checkIsIntercepted")
    /* renamed from: com.tencent.mm.plugin.appbrand.o$c */
    public static final class C83712c extends C66704d {

        /* renamed from: d */
        public Object f244350d;

        /* renamed from: e */
        public Object f244351e;

        /* renamed from: f */
        public Object f244352f;

        /* renamed from: g */
        public int f244353g;

        /* renamed from: h */
        public /* synthetic */ Object f244354h;

        /* renamed from: i */
        public final /* synthetic */ C83710o f244355i;

        /* renamed from: j */
        public int f244356j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83712c(C83710o oVar, C15601d<? super C83712c> dVar) {
            super(dVar);
            this.f244355i = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f244354h = obj;
            this.f244356j |= Integer.MIN_VALUE;
            return this.f244355i.mo115995b((LaunchParcel) null, this);
        }
    }

    /* renamed from: a */
    public final int mo115994a(String str, String str2, int i) {
        String[] strArr = new String[3];
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        if (str2 == null) {
            str2 = "";
        }
        strArr[1] = str2;
        strArr[2] = String.valueOf(i);
        return C110823p.m150987M(strArr, "|", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C32226l) null, 62, (Object) null).hashCode();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: b */
    public final java.lang.Object mo115995b(com.tencent.p014mm.plugin.appbrand.launching.params.LaunchParcel r18, wx3.C15601d<? super java.lang.Boolean> r19) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.appbrand.C83710o.C83712c
            if (r3 == 0) goto L_0x0019
            r3 = r2
            com.tencent.mm.plugin.appbrand.o$c r3 = (com.tencent.p014mm.plugin.appbrand.C83710o.C83712c) r3
            int r4 = r3.f244356j
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f244356j = r4
            goto L_0x001e
        L_0x0019:
            com.tencent.mm.plugin.appbrand.o$c r3 = new com.tencent.mm.plugin.appbrand.o$c
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r2 = r3.f244354h
            xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
            int r5 = r3.f244356j
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x0045
            if (r5 != r7) goto L_0x003d
            int r0 = r3.f244353g
            java.lang.Object r4 = r3.f244352f
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r3.f244351e
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.f244350d
            com.tencent.mm.plugin.appbrand.o r3 = (com.tencent.p014mm.plugin.appbrand.C83710o) r3
            kotlin.ResultKt.throwOnFailure(r2)     // Catch:{ Exception -> 0x018a }
            goto L_0x0121
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r2)
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r2 = r0.f243738o
            int r2 = r2.f245533f
            java.lang.String r5 = r0.f243730d
            java.lang.String r0 = r0.f243731e
            int r8 = r1.mo115994a(r5, r0, r2)
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            android.util.SparseArray<com.tencent.mm.plugin.appbrand.o$b> r11 = f244346b
            monitor-enter(r11)
            int r8 = r11.indexOfKey(r8)     // Catch:{ all -> 0x018d }
            r12 = 0
            if (r8 >= 0) goto L_0x0064
            monitor-exit(r11)
            goto L_0x007e
        L_0x0064:
            java.lang.Object r13 = r11.valueAt(r8)     // Catch:{ all -> 0x018d }
            gy3.C87412m.m108591d(r13)     // Catch:{ all -> 0x018d }
            com.tencent.mm.plugin.appbrand.o$b r13 = (com.tencent.p014mm.plugin.appbrand.C83710o.C83711b) r13     // Catch:{ all -> 0x018d }
            long r14 = r13.f244347a     // Catch:{ all -> 0x018d }
            long r9 = r9 - r14
            long r14 = r13.f244348b     // Catch:{ all -> 0x018d }
            int r16 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
            if (r16 <= 0) goto L_0x007b
            r11.removeAt(r8)     // Catch:{ all -> 0x018d }
            monitor-exit(r11)
            goto L_0x007e
        L_0x007b:
            int r12 = r13.f244349c     // Catch:{ all -> 0x018d }
            monitor-exit(r11)
        L_0x007e:
            if (r12 == 0) goto L_0x0107
            if (r12 == r7) goto L_0x00de
            if (r12 == r6) goto L_0x00b5
            java.lang.String r3 = "MicroMsg.AppBrandPreRenderColdStartInterceptor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "checkIsIntercepted get invalid code:"
            r4.append(r6)
            r4.append(r12)
            java.lang.String r6 = " for scene:"
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = ", username:"
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = ", appId:"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x00b5:
            java.lang.String r3 = "MicroMsg.AppBrandPreRenderColdStartInterceptor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "checkIsIntercepted hit cached REJECTED for scene:"
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = ", username:"
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = ", appId:"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            return r0
        L_0x00de:
            java.lang.String r3 = "MicroMsg.AppBrandPreRenderColdStartInterceptor"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "checkIsIntercepted hit cached ACCEPTED for scene:"
            r4.append(r6)
            r4.append(r2)
            java.lang.String r2 = ", username:"
            r4.append(r2)
            r4.append(r5)
            java.lang.String r2 = ", appId:"
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x0107:
            com.tencent.mm.plugin.appbrand.o$a r8 = new com.tencent.mm.plugin.appbrand.o$a     // Catch:{ Exception -> 0x018a }
            r8.<init>(r2)     // Catch:{ Exception -> 0x018a }
            r3.f244350d = r1     // Catch:{ Exception -> 0x018a }
            r3.f244351e = r5     // Catch:{ Exception -> 0x018a }
            r3.f244352f = r0     // Catch:{ Exception -> 0x018a }
            r3.f244353g = r2     // Catch:{ Exception -> 0x018a }
            r3.f244356j = r7     // Catch:{ Exception -> 0x018a }
            java.lang.Object r3 = r8.mo63012d(r3)     // Catch:{ Exception -> 0x018a }
            if (r3 != r4) goto L_0x011d
            return r4
        L_0x011d:
            r4 = r0
            r0 = r2
            r2 = r3
            r3 = r1
        L_0x0121:
            te3.pu r2 = (te3.C50875pu) r2     // Catch:{ Exception -> 0x018a }
            com.tencent.mm.plugin.appbrand.o$b r14 = new com.tencent.mm.plugin.appbrand.o$b
            long r9 = com.tencent.p014mm.sdk.platformtools.Util.currentTicks()
            int r8 = r2.f139977e
            long r11 = (long) r8
            r15 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r15
            boolean r8 = r2.f139976d
            if (r8 == 0) goto L_0x0136
            r13 = 1
            goto L_0x0137
        L_0x0136:
            r13 = 2
        L_0x0137:
            r8 = r14
            r8.<init>(r9, r11, r13)
            int r3 = r3.mo115994a(r5, r4, r0)
            android.util.SparseArray<com.tencent.mm.plugin.appbrand.o$b> r6 = f244346b
            monitor-enter(r6)
            r6.put(r3, r14)     // Catch:{ all -> 0x0187 }
            rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x0187 }
            monitor-exit(r6)
            java.lang.String r3 = "MicroMsg.AppBrandPreRenderColdStartInterceptor"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "checkIsIntercepted get remote result:"
            r6.append(r8)
            boolean r8 = r2.f139976d
            if (r8 == 0) goto L_0x015b
            java.lang.String r8 = "ACCEPTED"
            goto L_0x015d
        L_0x015b:
            java.lang.String r8 = "REJECTED"
        L_0x015d:
            r6.append(r8)
            java.lang.String r8 = " for scene:"
            r6.append(r8)
            r6.append(r0)
            java.lang.String r0 = ", username:"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", appId:"
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            boolean r0 = r2.f139976d
            r0 = r0 ^ r7
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0187:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x018a:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x018d:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C83710o.mo115995b(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel, wx3.d):java.lang.Object");
    }
}
