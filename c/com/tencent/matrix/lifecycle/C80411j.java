package com.tencent.matrix.lifecycle;

import fy3.C32227p;
import fy3.C32228q;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.Executor;
import p723vf.C118672d;
import rx3.C13598b0;

/* renamed from: com.tencent.matrix.lifecycle.j */
public final class C80411j {

    /* renamed from: a */
    public final Executor f235345a;

    /* renamed from: b */
    public final int f235346b;

    /* renamed from: c */
    public final long f235347c;

    /* renamed from: d */
    public final C32227p<String, Long, C13598b0> f235348d;

    /* renamed from: e */
    public final C32228q<String, String, Long, C13598b0> f235349e;

    /* renamed from: com.tencent.matrix.lifecycle.j$a */
    public static final class C80412a extends C87413o implements C32227p<String, Long, C13598b0> {

        /* renamed from: d */
        public static final C80412a f235350d = new C80412a();

        public C80412a() {
            super(2);
        }

        public Object invoke(Object obj, Object obj2) {
            String str = (String) obj;
            long longValue = ((Number) obj2).longValue();
            C87412m.m108594g(str, "task");
            C118672d.m167352b("Matrix.Lifecycle.Thread", "heavy task(cost " + longValue + "ms):" + str, new Object[0]);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.matrix.lifecycle.j$b */
    public static final class C80413b extends C87413o implements C32228q<String, String, Long, C13598b0> {

        /* renamed from: d */
        public static final C80413b f235351d = new C80413b();

        public C80413b() {
            super(3);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            String str = (String) obj;
            String str2 = (String) obj2;
            long longValue = ((Number) obj3).longValue();
            C87412m.m108594g(str, "thread");
            C87412m.m108594g(str2, "stacktrace");
            C118672d.m167352b("Matrix.Lifecycle.Thread", "thread: " + str + ", cost: " + longValue + ", " + str2, new Object[0]);
            return C13598b0.f38549a;
        }
    }

    public C80411j() {
        this((Executor) null, 0, 0, (C32227p) null, (C32228q) null, 31, (C8480h) null);
    }

    public C80411j(Executor executor, int i, long j, C32227p<? super String, ? super Long, C13598b0> pVar, C32228q<? super String, ? super String, ? super Long, C13598b0> qVar) {
        C87412m.m108594g(pVar, "onHeavyTaskDetected");
        C87412m.m108594g(qVar, "onWorkerBlocked");
        this.f235345a = executor;
        this.f235346b = i;
        this.f235347c = j;
        this.f235348d = pVar;
        this.f235349e = qVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C80411j)) {
            return false;
        }
        C80411j jVar = (C80411j) obj;
        return C87412m.m108589b(this.f235345a, jVar.f235345a) && this.f235346b == jVar.f235346b && this.f235347c == jVar.f235347c && C87412m.m108589b(this.f235348d, jVar.f235348d) && C87412m.m108589b(this.f235349e, jVar.f235349e);
    }

    public int hashCode() {
        Executor executor = this.f235345a;
        int i = 0;
        int hashCode = executor != null ? executor.hashCode() : 0;
        long j = this.f235347c;
        int i2 = ((((hashCode * 31) + this.f235346b) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C32227p<String, Long, C13598b0> pVar = this.f235348d;
        int hashCode2 = (i2 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        C32228q<String, String, Long, C13598b0> qVar = this.f235349e;
        if (qVar != null) {
            i = qVar.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "LifecycleThreadConfig(externalExecutor=" + this.f235345a + ", maxPoolSize=" + this.f235346b + ", keepAliveSeconds=" + this.f235347c + ", onHeavyTaskDetected=" + this.f235348d + ", onWorkerBlocked=" + this.f235349e + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C80411j(java.util.concurrent.Executor r5, int r6, long r7, fy3.C32227p r9, fy3.C32228q r10, int r11, gy3.C8480h r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            r6 = 5
            r12 = 5
            goto L_0x000d
        L_0x000c:
            r12 = r6
        L_0x000d:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            r7 = 30
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            com.tencent.matrix.lifecycle.j$a r9 = com.tencent.matrix.lifecycle.C80411j.C80412a.f235350d
        L_0x001a:
            r2 = r9
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            com.tencent.matrix.lifecycle.j$b r10 = com.tencent.matrix.lifecycle.C80411j.C80413b.f235351d
        L_0x0021:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r11 = r2
            r12 = r3
            r6.<init>(r7, r8, r9, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.matrix.lifecycle.C80411j.<init>(java.util.concurrent.Executor, int, long, fy3.p, fy3.q, int, gy3.h):void");
    }
}
