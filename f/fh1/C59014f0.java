package fh1;

import a14.C53973z1;
import cl1.C54991o;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gh1.C8313a;
import gy3.C87412m;
import gy3.C87413o;
import j50.C60735a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import nk1.C61788m;
import te3.C50767p11;

/* renamed from: fh1.f0 */
public final class C59014f0 extends C8313a {

    /* renamed from: j */
    public final String f168847j = "Finder.InteractiveGiftController";

    /* renamed from: n */
    public final int f168848n = 2;

    /* renamed from: o */
    public final ConcurrentLinkedQueue<C59015a> f168849o = new ConcurrentLinkedQueue<>();

    /* renamed from: p */
    public C53973z1 f168850p;

    /* renamed from: q */
    public boolean f168851q;

    /* renamed from: r */
    public final C59016b f168852r = new C59016b(this);

    /* renamed from: fh1.f0$a */
    public static final class C59015a {

        /* renamed from: a */
        public final C50767p11 f168853a;

        /* renamed from: b */
        public final int f168854b;

        public C59015a(C50767p11 p112, int i) {
            this.f168853a = p112;
            this.f168854b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C59015a)) {
                return false;
            }
            C59015a aVar = (C59015a) obj;
            return C87412m.m108589b(this.f168853a, aVar.f168853a) && this.f168854b == aVar.f168854b;
        }

        public int hashCode() {
            C50767p11 p112 = this.f168853a;
            return ((p112 == null ? 0 : p112.hashCode()) * 31) + this.f168854b;
        }

        public String toString() {
            return "InteractiveGiftPlayEvent(gift=" + this.f168853a + ", count=" + this.f168854b + ')';
        }
    }

    /* renamed from: fh1.f0$b */
    public static final class C59016b implements C61788m.C61789a {

        /* renamed from: d */
        public final /* synthetic */ C59014f0 f168855d;

        /* renamed from: fh1.f0$b$a */
        public static final class C59017a extends C87413o implements C32226l<C59015a, CharSequence> {

            /* renamed from: d */
            public static final C59017a f168856d = new C59017a();

            public C59017a() {
                super(1);
            }

            public Object invoke(Object obj) {
                C59015a aVar = (C59015a) obj;
                C87412m.m108594g(aVar, LocaleUtil.ITALIAN);
                C50767p11 p112 = aVar.f168853a;
                String str = p112 != null ? p112.f139507d : null;
                return str == null ? "null" : str;
            }
        }

        public C59016b(C59014f0 f0Var) {
            this.f168855d = f0Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
            if (gy3.C87412m.m108589b(r9.f33051r, ((cl1.C54991o) r2.business(r1)).mo75986U3().f183216g) != false) goto L_0x007e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0080  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0030 A[SYNTHETIC] */
        /* renamed from: s */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo84240s(nk1.C61788m.C11209c r19, java.util.List<nk1.C61788m.C11208b> r20) {
            /*
                r18 = this;
                r0 = r18
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                java.lang.String r2 = "giftType"
                r3 = r19
                gy3.C87412m.m108594g(r3, r2)
                java.lang.String r2 = "appendList"
                r3 = r20
                gy3.C87412m.m108594g(r3, r2)
                fh1.f0 r2 = r0.f168855d
                androidx.lifecycle.i0 r2 = r2.business(r1)
                cl1.o r2 = (cl1.C54991o) r2
                int r2 = r2.f154291a1
                r4 = 524288(0x80000, float:7.34684E-40)
                boolean r2 = o40.C61926c.m72696u(r2, r4)
                if (r2 == 0) goto L_0x0025
                return
            L_0x0025:
                fh1.f0 r2 = r0.f168855d
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r3 = r20.iterator()
            L_0x0030:
                boolean r5 = r3.hasNext()
                r6 = 0
                r7 = 1
                r8 = 0
                if (r5 == 0) goto L_0x0084
                java.lang.Object r5 = r3.next()
                r9 = r5
                nk1.m$b r9 = (nk1.C61788m.C11208b) r9
                boolean r10 = r9.f33048o
                if (r10 == 0) goto L_0x007d
                te3.ju0 r10 = r9.f33043g
                te3.p11 r10 = r10.f136332g
                if (r10 == 0) goto L_0x004c
                java.lang.String r6 = r10.f139498A
            L_0x004c:
                if (r6 == 0) goto L_0x007d
                java.lang.String r6 = r9.f33051r
                zc1.b r10 = zc1.C66785b.f191882e
                java.lang.String r10 = r10.mo90662O5()
                boolean r6 = gy3.C87412m.m108589b(r6, r10)
                if (r6 != 0) goto L_0x007e
                java.lang.String r6 = r9.f33051r
                java.lang.String r10 = eb0.C75592q0.m90789s()
                boolean r6 = gy3.C87412m.m108589b(r6, r10)
                if (r6 != 0) goto L_0x007e
                java.lang.String r6 = r9.f33051r
                androidx.lifecycle.i0 r9 = r2.business(r1)
                cl1.o r9 = (cl1.C54991o) r9
                te3.fs0 r9 = r9.mo75986U3()
                java.lang.String r9 = r9.f183216g
                boolean r6 = gy3.C87412m.m108589b(r6, r9)
                if (r6 == 0) goto L_0x007d
                goto L_0x007e
            L_0x007d:
                r7 = 0
            L_0x007e:
                if (r7 == 0) goto L_0x0030
                r4.add(r5)
                goto L_0x0030
            L_0x0084:
                fh1.f0 r1 = r0.f168855d
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = sx3.C36907w.m41090l(r4, r3)
                r2.<init>(r3)
                java.util.Iterator r3 = r4.iterator()
            L_0x0095:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x00c8
                java.lang.Object r4 = r3.next()
                nk1.m$b r4 = (nk1.C61788m.C11208b) r4
                java.lang.String r5 = r1.f168847j
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r10 = "interactiveGifts targetusername:"
                r9.append(r10)
                java.lang.String r10 = r4.f33051r
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r9)
                fh1.f0$a r5 = new fh1.f0$a
                te3.ju0 r9 = r4.f33043g
                te3.p11 r9 = r9.f136332g
                int r4 = r4.f33046j
                r5.<init>(r9, r4)
                r2.add(r5)
                goto L_0x0095
            L_0x00c8:
                fh1.f0 r1 = r0.f168855d
                java.lang.String r1 = r1.f168847j
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "interactiveGifts "
                r3.append(r4)
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                fh1.f0$b$a r15 = fh1.C59014f0.C59016b.C59017a.f168856d
                r16 = 31
                r17 = 0
                r9 = r2
                java.lang.String r4 = sx3.C110818d0.m150921S(r9, r10, r11, r12, r13, r14, r15, r16, r17)
                r3.append(r4)
                java.lang.String r3 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r3)
                fh1.f0 r1 = r0.f168855d
                java.util.concurrent.ConcurrentLinkedQueue<fh1.f0$a> r1 = r1.f168849o
                r1.addAll(r2)
                fh1.f0 r1 = r0.f168855d
                a14.z1 r2 = r1.f168850p
                if (r2 == 0) goto L_0x0105
                boolean r2 = r2.isCancelled()
                if (r2 != 0) goto L_0x0105
                r2 = 1
                goto L_0x0106
            L_0x0105:
                r2 = 0
            L_0x0106:
                if (r2 == 0) goto L_0x0116
                a14.z1 r2 = r1.f168850p
                if (r2 == 0) goto L_0x0113
                boolean r2 = r2.mo74530c()
                if (r2 != 0) goto L_0x0113
                goto L_0x0114
            L_0x0113:
                r7 = 0
            L_0x0114:
                if (r7 != 0) goto L_0x0126
            L_0x0116:
                r10 = 0
                r11 = 0
                fh1.g0 r12 = new fh1.g0
                r12.<init>(r1, r6)
                r13 = 3
                r14 = 0
                r9 = r1
                a14.z1 r2 = nk1.C11207i.m11066b(r9, r10, r11, r12, r13, r14)
                r1.f168850p = r2
            L_0x0126:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C59014f0.C59016b.mo84240s(nk1.m$c, java.util.List):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59014f0(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m68932m3(fh1.C59014f0 r17, a14.C0000n0 r18, int r19, fi1.C59092a.C59093a.C59095b r20, long r21, wx3.C15601d r23) {
        /*
            r6 = r17
            r0 = r23
            r17.getClass()
            boolean r1 = r0 instanceof fh1.C59028h0
            if (r1 == 0) goto L_0x001a
            r1 = r0
            fh1.h0 r1 = (fh1.C59028h0) r1
            int r2 = r1.f168912i
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.f168912i = r2
            goto L_0x001f
        L_0x001a:
            fh1.h0 r1 = new fh1.h0
            r1.<init>(r6, r0)
        L_0x001f:
            r7 = r1
            java.lang.Object r0 = r7.f168910g
            xx3.a r8 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f168912i
            r9 = 2
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L_0x004e
            if (r1 == r10) goto L_0x003c
            if (r1 != r9) goto L_0x0034
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00ae
        L_0x0034:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003c:
            java.lang.Object r1 = r7.f168909f
            a14.u0 r1 = (a14.C53953u0) r1
            java.lang.Object r2 = r7.f168908e
            gy3.a0 r2 = (gy3.C8477a0) r2
            java.lang.Object r3 = r7.f168907d
            fh1.f0 r3 = (fh1.C59014f0) r3
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ z2 -> 0x004c }
            goto L_0x008d
        L_0x004c:
            goto L_0x008d
        L_0x004e:
            kotlin.ResultKt.throwOnFailure(r0)
            gy3.a0 r12 = new gy3.a0
            r12.<init>()
            r13 = 0
            r14 = 0
            fh1.j0 r15 = new fh1.j0
            r16 = 0
            r5 = 0
            r0 = r15
            r1 = r17
            r2 = r19
            r3 = r20
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r4 = 3
            r0 = r18
            r1 = r13
            r2 = r14
            r3 = r15
            r5 = r16
            a14.u0 r1 = a14.C53895h.m60464b(r0, r1, r2, r3, r4, r5)
            fh1.i0 r0 = new fh1.i0     // Catch:{ z2 -> 0x008a }
            r0.<init>(r1, r11)     // Catch:{ z2 -> 0x008a }
            r7.f168907d = r6     // Catch:{ z2 -> 0x008a }
            r7.f168908e = r12     // Catch:{ z2 -> 0x008a }
            r7.f168909f = r1     // Catch:{ z2 -> 0x008a }
            r7.f168912i = r10     // Catch:{ z2 -> 0x008a }
            r2 = r21
            java.lang.Object r0 = a14.C53860b3.m60374b(r2, r0, r7)     // Catch:{ z2 -> 0x008a }
            if (r0 != r8) goto L_0x008b
            goto L_0x00c9
        L_0x008a:
        L_0x008b:
            r3 = r6
            r2 = r12
        L_0x008d:
            boolean r0 = r1.mo74530c()
            if (r0 != 0) goto L_0x00ae
            boolean r0 = r2.f27482d
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r3.f168847j
            java.lang.String r2 = "timeout but animStarted, continue await"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            r7.f168907d = r11
            r7.f168908e = r11
            r7.f168909f = r11
            r7.f168912i = r9
            java.lang.Object r0 = r1.mo74634A(r7)
            if (r0 != r8) goto L_0x00ae
            goto L_0x00c9
        L_0x00ae:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x00c9
        L_0x00b1:
            java.lang.String r0 = r3.f168847j
            java.lang.String r2 = "timeout, cancel"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            a14.C53973z1.C53974a.m60623a(r1, r11, r10, r11)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r0 == 0) goto L_0x00ae
            r0.mo85692k0()
            goto L_0x00ae
        L_0x00c9:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59014f0.m68932m3(fh1.f0, a14.n0, int, fi1.a$a$b, long, wx3.d):java.lang.Object");
    }

    public void onLiveActivate() {
        ((C54991o) business(C54991o.class)).f154316g.mo86714j(this.f168852r);
    }

    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        ((C54991o) business(C54991o.class)).f154316g.mo86709f(this.f168852r);
    }

    public void onLivePause() {
        Log.m105924i(this.f168847j, "clear interactiveGiftQueue");
        this.f168849o.clear();
        C53973z1 z1Var = this.f168850p;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        this.f168850p = null;
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        if (aVar != null) {
            aVar.mo85692k0();
        }
    }
}
