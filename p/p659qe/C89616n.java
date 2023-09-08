package p659qe;

import com.tencent.matrix.lifecycle.IBackgroundStatefulOwner;
import com.tencent.matrix.util.MemInfo;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.concurrent.TimeUnit;
import rx3.C13598b0;

/* renamed from: qe.n */
public final class C89616n {

    /* renamed from: a */
    public final C35836o f257817a;

    /* renamed from: b */
    public final C35836o f257818b;

    /* renamed from: c */
    public final C35836o f257819c;

    /* renamed from: d */
    public final C35836o f257820d;

    /* renamed from: e */
    public final boolean f257821e;

    /* renamed from: f */
    public final IBackgroundStatefulOwner f257822f;

    /* renamed from: g */
    public final long f257823g;

    /* renamed from: h */
    public final C32226l<MemInfo, C13598b0> f257824h;

    /* renamed from: qe.n$a */
    public static final class C89617a extends C87413o implements C32226l<MemInfo, C13598b0> {

        /* renamed from: d */
        public static final C89617a f257825d = new C89617a();

        public C89617a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((MemInfo) obj, "<anonymous parameter 0>");
            return C13598b0.f38549a;
        }
    }

    public C89616n(boolean z, IBackgroundStatefulOwner iBackgroundStatefulOwner, long j, long j2, long j3, long j4, long j5, int i, C32226l<? super MemInfo, C13598b0> lVar) {
        C32226l<? super MemInfo, C13598b0> lVar2 = lVar;
        C87412m.m108594g(iBackgroundStatefulOwner, "bgStatefulOwner");
        C87412m.m108594g(lVar2, "callback");
        this.f257821e = z;
        this.f257822f = iBackgroundStatefulOwner;
        this.f257823g = j;
        this.f257824h = lVar2;
        this.f257817a = new C35836o(j2, i, 0);
        this.f257818b = new C35836o(j3, i, 0);
        this.f257819c = new C35836o(j5, i, 0);
        this.f257820d = new C35836o(j4, i, TimeUnit.MINUTES.toMillis(5));
    }

    public String toString() {
        return "ProcessBgMemoryMonitorConfig(enable=" + this.f257821e + ", bgStatefulOwner=" + this.f257822f + ", checkInterval=" + this.f257823g + ", reportCallback=" + this.f257824h.getClass().getName() + ", javaThresholdByte=" + this.f257817a + ", nativeThresholdByte=" + this.f257818b + ", debugPssThresholdK=" + this.f257819c + ", amsPssThresholdK=" + this.f257820d + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C89616n(boolean r15, com.tencent.matrix.lifecycle.IBackgroundStatefulOwner r16, long r17, long r19, long r21, long r23, long r25, int r27, fy3.C32226l r28, int r29, gy3.C8480h r30) {
        /*
            r14 = this;
            r0 = r29
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 1
            goto L_0x0009
        L_0x0008:
            r1 = r15
        L_0x0009:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0010
            com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner r2 = com.tencent.matrix.lifecycle.owners.ProcessStagedBackgroundOwner.INSTANCE
            goto L_0x0012
        L_0x0010:
            r2 = r16
        L_0x0012:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001f
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
            r4 = 3
            long r3 = r3.toMillis(r4)
            goto L_0x0021
        L_0x001f:
            r3 = r17
        L_0x0021:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0029
            r5 = 262144000(0xfa00000, double:1.295163447E-315)
            goto L_0x002b
        L_0x0029:
            r5 = r19
        L_0x002b:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0033
            r7 = 524288000(0x1f400000, double:2.590326893E-315)
            goto L_0x0035
        L_0x0033:
            r7 = r21
        L_0x0035:
            r9 = r0 & 32
            r10 = 1048576(0x100000, double:5.180654E-318)
            if (r9 == 0) goto L_0x003e
            r12 = r10
            goto L_0x0040
        L_0x003e:
            r12 = r23
        L_0x0040:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r10 = r25
        L_0x0047:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x004d
            r9 = 3
            goto L_0x004f
        L_0x004d:
            r9 = r27
        L_0x004f:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0056
            qe.n$a r0 = p659qe.C89616n.C89617a.f257825d
            goto L_0x0058
        L_0x0056:
            r0 = r28
        L_0x0058:
            r15 = r14
            r16 = r1
            r17 = r2
            r18 = r3
            r20 = r5
            r22 = r7
            r24 = r12
            r26 = r10
            r28 = r9
            r29 = r0
            r15.<init>(r16, r17, r18, r20, r22, r24, r26, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p659qe.C89616n.<init>(boolean, com.tencent.matrix.lifecycle.IBackgroundStatefulOwner, long, long, long, long, long, int, fy3.l, int, gy3.h):void");
    }
}
