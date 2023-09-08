package com.tencent.p014mm.plugin.finder.live;

import com.tencent.p014mm.autogen.events.FinderLiveUninterestedEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.live.b */
public final class C55896b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveUninterestedEvent f159265d;

    /* renamed from: e */
    public final /* synthetic */ FinderLiveViewCallback f159266e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C55896b(FinderLiveUninterestedEvent finderLiveUninterestedEvent, FinderLiveViewCallback finderLiveViewCallback) {
        super(0);
        this.f159265d = finderLiveUninterestedEvent;
        this.f159266e = finderLiveViewCallback;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: cl1.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: cl1.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: cl1.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: java.lang.Integer} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: cl1.o} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v15, resolved type: cl1.o} */
    /* JADX WARNING: type inference failed for: r1v10, types: [androidx.lifecycle.i0] */
    /* JADX WARNING: type inference failed for: r2v13, types: [java.lang.Integer] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r15 = this;
            com.tencent.mm.autogen.events.FinderLiveUninterestedEvent r0 = r15.f159265d
            com.tencent.mm.autogen.events.FinderLiveUninterestedEvent$a r0 = r0.f9222d
            long r8 = r0.f9223a
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r0 = r15.f159266e
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r0 = r0.f159220q
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            boolean r1 = r0 instanceof eg1.C58589p
            r2 = 0
            if (r1 == 0) goto L_0x0016
            eg1.p r0 = (eg1.C58589p) r0
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 == 0) goto L_0x0122
            al1.i r0 = r0.f167742e
            if (r0 == 0) goto L_0x0122
            java.util.ArrayList<al1.h> r0 = r0.f151990e
            if (r0 == 0) goto L_0x0122
            com.tencent.mm.plugin.finder.live.FinderLiveViewCallback r3 = r15.f159266e
            com.tencent.mm.autogen.events.FinderLiveUninterestedEvent r10 = r15.f159265d
            monitor-enter(r0)
            gy3.d0 r11 = new gy3.d0     // Catch:{ all -> 0x011f }
            r11.<init>()     // Catch:{ all -> 0x011f }
            r1 = -1
            r11.f27483d = r1     // Catch:{ all -> 0x011f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x011f }
            r5 = 0
            r6 = 0
        L_0x0034:
            boolean r7 = r4.hasNext()     // Catch:{ all -> 0x011f }
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r4.next()     // Catch:{ all -> 0x011f }
            int r12 = r6 + 1
            if (r6 < 0) goto L_0x0050
            al1.h r7 = (al1.C54127h) r7     // Catch:{ all -> 0x011f }
            com.tencent.mm.live.api.LiveConfig r7 = r7.f151977d     // Catch:{ all -> 0x011f }
            long r13 = r7.f157075s     // Catch:{ all -> 0x011f }
            int r7 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x004e
            r11.f27483d = r6     // Catch:{ all -> 0x011f }
        L_0x004e:
            r6 = r12
            goto L_0x0034
        L_0x0050:
            sx3.C64197v.m75542k()     // Catch:{ all -> 0x011f }
            throw r2     // Catch:{ all -> 0x011f }
        L_0x0054:
            int r4 = r11.f27483d     // Catch:{ all -> 0x011f }
            if (r4 != r1) goto L_0x005b
            monitor-exit(r0)
            goto L_0x0122
        L_0x005b:
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r1 = r3.f159220q     // Catch:{ all -> 0x011f }
            androidx.recyclerview.widget.RecyclerView$e r1 = r1.getAdapter()     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x0068
            int r1 = r1.getItemCount()     // Catch:{ all -> 0x011f }
            goto L_0x0069
        L_0x0068:
            r1 = 0
        L_0x0069:
            r4 = 1
            if (r1 <= r4) goto L_0x00ef
            int r1 = r11.f27483d     // Catch:{ all -> 0x011f }
            int r6 = r0.size()     // Catch:{ all -> 0x011f }
            if (r1 < r6) goto L_0x0076
            goto L_0x00ef
        L_0x0076:
            eg1.u r1 = r3.f159214h     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x0088
            al1.i r1 = r1.mo77493G0()     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x0088
            int r1 = r1.mo74925c()     // Catch:{ all -> 0x011f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x011f }
        L_0x0088:
            r12 = r2
            int r1 = r11.f27483d     // Catch:{ all -> 0x011f }
            if (r12 != 0) goto L_0x008e
            goto L_0x00ae
        L_0x008e:
            int r2 = r12.intValue()     // Catch:{ all -> 0x011f }
            if (r2 != r1) goto L_0x00ae
            int r1 = r11.f27483d     // Catch:{ all -> 0x011f }
            int r1 = r1 + r4
            r2 = 400(0x190, float:5.6E-43)
            r3.mo77515G0(r1, r2)     // Catch:{ all -> 0x011f }
            com.tencent.mm.plugin.finder.live.view.FinderLiveRecyclerView r13 = r3.f159220q     // Catch:{ all -> 0x011f }
            com.tencent.mm.plugin.finder.live.a r14 = new com.tencent.mm.plugin.finder.live.a     // Catch:{ all -> 0x011f }
            r1 = r14
            r2 = r0
            r4 = r11
            r5 = r10
            r6 = r8
            r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x011f }
            r1 = 450(0x1c2, double:2.223E-321)
            r13.postDelayed(r14, r1)     // Catch:{ all -> 0x011f }
            goto L_0x00b3
        L_0x00ae:
            int r1 = r11.f27483d     // Catch:{ all -> 0x011f }
            com.tencent.p014mm.plugin.finder.live.FinderLiveViewCallback.m63697v(r3, r1, r0)     // Catch:{ all -> 0x011f }
        L_0x00b3:
            java.lang.String r1 = "Finder.FinderLiveViewCallback"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x011f }
            r2.<init>()     // Catch:{ all -> 0x011f }
            java.lang.String r3 = "FinderLiveUninterestedEvent: remove feedId="
            r2.append(r3)     // Catch:{ all -> 0x011f }
            java.lang.String r3 = o40.C61926c.m72691p(r8)     // Catch:{ all -> 0x011f }
            r2.append(r3)     // Catch:{ all -> 0x011f }
            java.lang.String r3 = ", curIndex="
            r2.append(r3)     // Catch:{ all -> 0x011f }
            int r3 = r11.f27483d     // Catch:{ all -> 0x011f }
            r2.append(r3)     // Catch:{ all -> 0x011f }
            java.lang.String r3 = ", flowCurPos="
            r2.append(r3)     // Catch:{ all -> 0x011f }
            r2.append(r12)     // Catch:{ all -> 0x011f }
            java.lang.String r3 = ", isUserAction="
            r2.append(r3)     // Catch:{ all -> 0x011f }
            com.tencent.mm.autogen.events.FinderLiveUninterestedEvent$a r3 = r10.f9222d     // Catch:{ all -> 0x011f }
            boolean r3 = r3.f9224b     // Catch:{ all -> 0x011f }
            r2.append(r3)     // Catch:{ all -> 0x011f }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x011f }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)     // Catch:{ all -> 0x011f }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x011f }
            monitor-exit(r0)
            goto L_0x0122
        L_0x00ef:
            java.lang.String r1 = "Finder.FinderLiveViewCallback"
            java.lang.String r4 = "FinderLiveUninterestedEvent: finish directly"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r4)     // Catch:{ all -> 0x011f }
            fj1.b r1 = fj1.C45795b.f123698n     // Catch:{ all -> 0x011f }
            if (r1 == 0) goto L_0x0103
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r2)     // Catch:{ all -> 0x011f }
            r2 = r1
            cl1.o r2 = (cl1.C54991o) r2     // Catch:{ all -> 0x011f }
        L_0x0103:
            if (r2 != 0) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r2.f154350p0 = r5     // Catch:{ all -> 0x011f }
        L_0x0108:
            com.tencent.mm.ui.MMActivity r1 = r3.f159212f     // Catch:{ all -> 0x011f }
            android.content.res.Resources r2 = r1.getResources()     // Catch:{ all -> 0x011f }
            r4 = 2131828676(0x7f111fc4, float:1.92903E38)
            java.lang.String r2 = r2.getString(r4)     // Catch:{ all -> 0x011f }
            nj3.C76912y0.m92773l(r1, r2)     // Catch:{ all -> 0x011f }
            com.tencent.mm.ui.MMActivity r1 = r3.f159212f     // Catch:{ all -> 0x011f }
            r1.finish()     // Catch:{ all -> 0x011f }
            monitor-exit(r0)
            goto L_0x0122
        L_0x011f:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0122:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.C55896b.invoke():java.lang.Object");
    }
}
