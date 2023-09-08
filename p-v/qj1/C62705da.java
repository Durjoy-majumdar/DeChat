package qj1;

import android.view.ViewGroup;
import cj1.C54847z3;
import cl1.C54951d;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import gy3.C87412m;
import pe3.C47465a;
import te3.C49712hj1;
import te3.C51566um1;
import te3.C51711vm1;
import zp3.C23564m;

/* renamed from: qj1.da */
public final class C62705da extends C62660c {

    /* renamed from: p */
    public final C58124b f178040p;

    /* renamed from: q */
    public boolean f178041q;

    /* renamed from: qj1.da$a */
    public static final class C62706a extends C54847z3.C54849b<C51711vm1> {

        /* renamed from: b */
        public final /* synthetic */ C62705da f178042b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62706a(C62705da daVar, Class<C51711vm1> cls) {
            super(cls);
            this.f178042b = daVar;
        }

        /* renamed from: a */
        public void mo9116a(C47465a aVar) {
            C51711vm1 vm12 = (C51711vm1) aVar;
            C87412m.m108594g(vm12, "result");
            Log.m105924i("FinderLiveLogoReceivePlugin", "#onPollingSuccess isMount=" + this.f178042b.f178041q);
            C62705da daVar = this.f178042b;
            if (daVar.f178041q) {
                C23564m.m28136f(new C62672ca(daVar, vm12));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62705da(ViewGroup viewGroup, C58124b bVar) {
        super(viewGroup, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178040p = bVar;
    }

    /* renamed from: Z0 */
    public final void mo87717Z0() {
        Log.m105924i("FinderLiveLogoReceivePlugin", "#startPollingBannerData");
        if (((C54951d) mo87696x0(C54951d.class)).mo75870f3()) {
            Log.m105924i("FinderLiveLogoReceivePlugin", "#startPollingBannerData return for playing adVideo");
            return;
        }
        C51566um1 um12 = new C51566um1();
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75799e(11, um12, new C62706a(this, C51711vm1.class), false);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001b, code lost:
        r5 = r5.liveInfo;
     */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8357i0() {
        /*
            r13 = this;
            java.lang.Class<cl1.o> r0 = cl1.C54991o.class
            java.lang.String r1 = "FinderLiveLogoReceivePlugin"
            java.lang.String r2 = "#mount"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            r2 = 1
            r13.f178041q = r2
            long r3 = eb0.C31543z5.m39453c()
            androidx.lifecycle.i0 r5 = r13.mo87696x0(r0)
            cl1.o r5 = (cl1.C54991o) r5
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r5.f154341n
            r6 = 0
            if (r5 == 0) goto L_0x0022
            te3.c21 r5 = r5.liveInfo
            if (r5 == 0) goto L_0x0022
            java.util.LinkedList<te3.na1> r5 = r5.f182379U0
            goto L_0x0023
        L_0x0022:
            r5 = r6
        L_0x0023:
            r7 = 0
            if (r5 == 0) goto L_0x004d
            java.util.Iterator r5 = r5.iterator()
        L_0x002a:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0049
            java.lang.Object r8 = r5.next()
            r9 = r8
            te3.na1 r9 = (te3.C50516na1) r9
            long r10 = r9.f138505e
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 > 0) goto L_0x0045
            long r9 = r9.f138509i
            int r11 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0045
            r9 = 1
            goto L_0x0046
        L_0x0045:
            r9 = 0
        L_0x0046:
            if (r9 == 0) goto L_0x002a
            goto L_0x004a
        L_0x0049:
            r8 = r6
        L_0x004a:
            te3.na1 r8 = (te3.C50516na1) r8
            goto L_0x004e
        L_0x004d:
            r8 = r6
        L_0x004e:
            androidx.lifecycle.i0 r0 = r13.mo87696x0(r0)
            cl1.o r0 = (cl1.C54991o) r0
            com.tencent.mm.protocal.protobuf.FinderObject r0 = r0.f154341n
            if (r0 == 0) goto L_0x0063
            te3.c21 r0 = r0.liveInfo
            if (r0 == 0) goto L_0x0063
            long r3 = r0.f182392d
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            goto L_0x0064
        L_0x0063:
            r0 = r6
        L_0x0064:
            if (r8 == 0) goto L_0x0068
            java.lang.String r6 = r8.f138504d
        L_0x0068:
            if (r8 == 0) goto L_0x006f
            boolean r3 = r8.f138510j
            if (r3 != r2) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            if (r2 == 0) goto L_0x008d
            cl1.d$b r2 = cl1.C54951d.f153999u
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r0 = 95
            r3.append(r0)
            r3.append(r6)
            java.lang.String r0 = r3.toString()
            boolean r0 = r2.mo56084b(r0)
            goto L_0x0097
        L_0x008d:
            cl1.d$b r2 = cl1.C54951d.f153999u
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = r2.mo56083a(r0)
        L_0x0097:
            if (r8 == 0) goto L_0x00a2
            if (r0 == 0) goto L_0x009c
            goto L_0x00a2
        L_0x009c:
            java.lang.String r0 = "#mount has ad video, delay to start."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            goto L_0x00aa
        L_0x00a2:
            java.lang.String r0 = "#mount no ad video."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r13.mo87717Z0()
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62705da.mo8357i0():void");
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        this.f178041q = false;
        Log.m105924i("FinderLiveLogoReceivePlugin", "#unMount");
    }
}
