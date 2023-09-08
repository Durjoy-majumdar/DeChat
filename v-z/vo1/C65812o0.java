package vo1;

import android.os.Bundle;
import cl1.C54974f1;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import d60.C58124b;
import fj1.C45795b;
import fy3.C32228q;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C50912q41;
import te3.C64370fp1;
import te3.C64857yh3;

/* renamed from: vo1.o0 */
public final class C65812o0 implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ C65808n0 f189268d;

    /* renamed from: e */
    public final /* synthetic */ C45795b f189269e;

    /* renamed from: vo1.o0$a */
    public static final class C65813a extends C87413o implements C32228q<Boolean, String, C50912q41, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C65808n0 f189270d;

        /* renamed from: e */
        public final /* synthetic */ C64370fp1 f189271e;

        /* renamed from: f */
        public final /* synthetic */ C45795b f189272f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65813a(C65808n0 n0Var, C64370fp1 fp12, C45795b bVar) {
            super(3);
            this.f189270d = n0Var;
            this.f189271e = fp12;
            this.f189272f = bVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C64857yh3 yh32;
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Class cls = C54974f1.class;
            C87412m.m108594g((String) obj2, "errMsg");
            C87412m.m108594g((C50912q41) obj3, "resp");
            this.f189270d.f189261i = false;
            if (booleanValue) {
                long j = this.f189271e.f183176d;
                C64370fp1 fp12 = ((C54974f1) this.f189272f.mo71262a(cls)).f154098g;
                if (j == (fp12 != null ? fp12.f183176d : 0)) {
                    C64370fp1 fp13 = ((C54974f1) this.f189272f.mo71262a(cls)).f154098g;
                    if (!(fp13 == null || (yh32 = fp13.f183160E) == null)) {
                        yh32.f186537i = 0;
                    }
                    ((C54974f1) this.f189272f.mo71262a(cls)).mo75934c3((C64370fp1) null);
                    FinderLiveService.f159376d.getClass();
                    C56032b bVar = FinderLiveService.f159379g;
                    if (bVar != null) {
                        bVar.statusChange(C58124b.C58125b.FINDER_LIVE_SHOPPING_LIST_UPDATE, (Bundle) null);
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C65812o0(C65808n0 n0Var, C45795b bVar) {
        this.f189268d = n0Var;
        this.f189269e = bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0031, code lost:
        r6 = r6.f154113E;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTimerExpired() {
        /*
            r19 = this;
            r1 = r19
            vo1.n0 r0 = r1.f189268d
            boolean r0 = r0.f189261i
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            vo1.n0 r0 = r1.f189268d
            fj1.b r3 = r1.f189269e
            monitor-enter(r2)
            java.lang.String r4 = r0.f189258f     // Catch:{ all -> 0x0148 }
            java.lang.String r5 = "count down looping"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)     // Catch:{ all -> 0x0148 }
            boolean r4 = r0.f189261i     // Catch:{ all -> 0x0148 }
            r5 = 0
            if (r4 == 0) goto L_0x0024
            java.lang.String r0 = r0.f189258f     // Catch:{ all -> 0x0148 }
            java.lang.String r3 = "cgi going,return "
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)     // Catch:{ all -> 0x0148 }
            monitor-exit(r2)
            return r5
        L_0x0024:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d     // Catch:{ all -> 0x0148 }
            java.lang.Class<cl1.h1> r6 = cl1.C54979h1.class
            androidx.lifecycle.i0 r6 = r4.mo77630e(r6)     // Catch:{ all -> 0x0148 }
            cl1.h1 r6 = (cl1.C54979h1) r6     // Catch:{ all -> 0x0148 }
            r7 = 1
            if (r6 == 0) goto L_0x003b
            te3.gj1 r6 = r6.f154113E     // Catch:{ all -> 0x0148 }
            if (r6 == 0) goto L_0x003b
            int r6 = r6.f183344e     // Catch:{ all -> 0x0148 }
            if (r6 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            if (r6 == 0) goto L_0x0040
            monitor-exit(r2)
            return r7
        L_0x0040:
            java.lang.Class<cl1.f1> r6 = cl1.C54974f1.class
            androidx.lifecycle.i0 r6 = r3.mo71262a(r6)     // Catch:{ all -> 0x0148 }
            cl1.f1 r6 = (cl1.C54974f1) r6     // Catch:{ all -> 0x0148 }
            te3.fp1 r6 = r6.f154098g     // Catch:{ all -> 0x0148 }
            er1.j4 r8 = er1.C58739j4.f168176a     // Catch:{ all -> 0x0148 }
            r8 = 0
            if (r6 == 0) goto L_0x0052
            te3.yh3 r9 = r6.f183160E     // Catch:{ all -> 0x0148 }
            goto L_0x0053
        L_0x0052:
            r9 = r8
        L_0x0053:
            if (r6 == 0) goto L_0x0144
            if (r9 == 0) goto L_0x0144
            rx3.g r10 = r0.f189259g     // Catch:{ all -> 0x0148 }
            rx3.n r10 = (rx3.C36570n) r10     // Catch:{ all -> 0x0148 }
            java.lang.Object r10 = r10.getValue()     // Catch:{ all -> 0x0148 }
            java.lang.Number r10 = (java.lang.Number) r10     // Catch:{ all -> 0x0148 }
            long r10 = r10.longValue()     // Catch:{ all -> 0x0148 }
            int r12 = eb0.C31543z5.m39455e()     // Catch:{ all -> 0x0148 }
            int r9 = r9.f186534f     // Catch:{ all -> 0x0148 }
            int r12 = r12 - r9
            long r12 = (long) r12     // Catch:{ all -> 0x0148 }
            long r10 = r10 - r12
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x0148 }
            java.util.HashMap<java.lang.Long, vo1.n0$b> r9 = r0.f189260h     // Catch:{ all -> 0x0148 }
            long r12 = r6.f183176d     // Catch:{ all -> 0x0148 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0148 }
            boolean r9 = r9.containsKey(r12)     // Catch:{ all -> 0x0148 }
            if (r9 != 0) goto L_0x008f
            java.util.HashMap<java.lang.Long, vo1.n0$b> r9 = r0.f189260h     // Catch:{ all -> 0x0148 }
            long r12 = r6.f183176d     // Catch:{ all -> 0x0148 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0148 }
            vo1.n0$b r13 = new vo1.n0$b     // Catch:{ all -> 0x0148 }
            r13.<init>(r5, r5, r5)     // Catch:{ all -> 0x0148 }
            r9.put(r12, r13)     // Catch:{ all -> 0x0148 }
        L_0x008f:
            java.util.HashMap<java.lang.Long, vo1.n0$b> r9 = r0.f189260h     // Catch:{ all -> 0x0148 }
            long r12 = r6.f183176d     // Catch:{ all -> 0x0148 }
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch:{ all -> 0x0148 }
            java.lang.Object r9 = r9.get(r12)     // Catch:{ all -> 0x0148 }
            gy3.C87412m.m108591d(r9)     // Catch:{ all -> 0x0148 }
            vo1.n0$b r9 = (vo1.C65808n0.C37795b) r9     // Catch:{ all -> 0x0148 }
            r12 = 0
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 > 0) goto L_0x0140
            boolean r10 = r9.f100110c     // Catch:{ all -> 0x0148 }
            if (r10 != 0) goto L_0x00b5
            r10 = 2131828529(0x7f111f31, float:1.9290001E38)
            vo1.p0 r11 = new vo1.p0     // Catch:{ all -> 0x0148 }
            r11.<init>(r10)     // Catch:{ all -> 0x0148 }
            o40.C61926c.m72668M(r11)     // Catch:{ all -> 0x0148 }
        L_0x00b5:
            r9.f100110c = r7     // Catch:{ all -> 0x0148 }
            java.lang.Class<ak1.o> r9 = ak1.C54108o.class
            di3.d r9 = di3.C86312j.m106911c(r9)     // Catch:{ all -> 0x0148 }
            java.lang.String r10 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r9, r10)     // Catch:{ all -> 0x0148 }
            r11 = r9
            ak1.o r11 = (ak1.C54108o) r11     // Catch:{ all -> 0x0148 }
            r12 = 7
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 12
            r18 = 0
            ak1.C54108o.Ux0(r11, r12, r13, r14, r16, r17, r18)     // Catch:{ all -> 0x0148 }
            r0.f189261i = r7     // Catch:{ all -> 0x0148 }
            java.lang.Class<cl1.u> r7 = cl1.C55001u.class
            androidx.lifecycle.i0 r7 = r4.mo77630e(r7)     // Catch:{ all -> 0x0148 }
            cl1.u r7 = (cl1.C55001u) r7     // Catch:{ all -> 0x0148 }
            if (r7 == 0) goto L_0x013c
            r4.getClass()     // Catch:{ all -> 0x0148 }
            cj1.n5 r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159396y     // Catch:{ all -> 0x0148 }
            if (r9 == 0) goto L_0x013c
            r4.getClass()     // Catch:{ all -> 0x0148 }
            com.tencent.mm.plugin.finder.live.view.b r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g     // Catch:{ all -> 0x0148 }
            if (r10 == 0) goto L_0x00f0
            android.content.Context r8 = r10.getContext()     // Catch:{ all -> 0x0148 }
        L_0x00f0:
            java.lang.String r10 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            gy3.C87412m.m108592e(r8, r10)     // Catch:{ all -> 0x0148 }
            r10 = r8
            com.tencent.mm.ui.MMActivity r10 = (com.tencent.p014mm.p136ui.MMActivity) r10     // Catch:{ all -> 0x0148 }
            te3.c21 r8 = r7.f154420q     // Catch:{ all -> 0x0148 }
            long r11 = r8.f182392d     // Catch:{ all -> 0x0148 }
            long r13 = r7.f154416j     // Catch:{ all -> 0x0148 }
            java.lang.Class<cl1.o> r7 = cl1.C54991o.class
            androidx.lifecycle.i0 r4 = r4.mo77630e(r7)     // Catch:{ all -> 0x0148 }
            cl1.o r4 = (cl1.C54991o) r4     // Catch:{ all -> 0x0148 }
            if (r4 == 0) goto L_0x010c
            java.lang.String r4 = r4.f154345o     // Catch:{ all -> 0x0148 }
            if (r4 != 0) goto L_0x010e
        L_0x010c:
            java.lang.String r4 = ""
        L_0x010e:
            r15 = r4
            te3.mh0 r4 = new te3.mh0     // Catch:{ all -> 0x0148 }
            r4.<init>()     // Catch:{ all -> 0x0148 }
            r7 = 106(0x6a, float:1.49E-43)
            r4.f138028d = r7     // Catch:{ all -> 0x0148 }
            er1.j4 r7 = er1.C58739j4.f168176a     // Catch:{ all -> 0x0148 }
            te3.n41 r8 = new te3.n41     // Catch:{ all -> 0x0148 }
            r8.<init>()     // Catch:{ all -> 0x0148 }
            r18 = r2
            long r1 = r6.f183176d     // Catch:{ all -> 0x013a }
            r8.f138404d = r1     // Catch:{ all -> 0x013a }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x013a }
            pe3.b r1 = r7.mo83710g0(r8)     // Catch:{ all -> 0x013a }
            r4.f138029e = r1     // Catch:{ all -> 0x013a }
            vo1.o0$a r1 = new vo1.o0$a     // Catch:{ all -> 0x013a }
            r1.<init>(r0, r6, r3)     // Catch:{ all -> 0x013a }
            r16 = r4
            r17 = r1
            r9.mo75737h(r10, r11, r13, r15, r16, r17)     // Catch:{ all -> 0x013a }
            goto L_0x013e
        L_0x013a:
            r0 = move-exception
            goto L_0x014b
        L_0x013c:
            r18 = r2
        L_0x013e:
            monitor-exit(r18)
            return r5
        L_0x0140:
            r18 = r2
            monitor-exit(r18)
            return r7
        L_0x0144:
            r18 = r2
            monitor-exit(r18)
            return r5
        L_0x0148:
            r0 = move-exception
            r18 = r2
        L_0x014b:
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vo1.C65812o0.onTimerExpired():boolean");
    }
}
