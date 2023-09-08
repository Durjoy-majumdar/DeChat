package zg1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C16006g;

/* renamed from: zg1.g0 */
public final class C16174g0 extends C16006g {

    /* renamed from: c */
    public final String f43363c = "LiveTargetFlashSaleInfoInterceptor";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16174g0(C45795b bVar) {
        super(bVar);
        C87412m.m108594g(bVar, "liveContext");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0015, code lost:
        r7 = r7.f144906h;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14632d(java.util.LinkedList<te3.C52013xs0> r7) {
        /*
            r6 = this;
            java.lang.Class<oh1.c> r0 = oh1.C11415c.class
            java.lang.String r1 = "msgList"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
            te3.xs0 r7 = (te3.C52013xs0) r7
            te3.av0 r1 = new te3.av0
            r1.<init>()
            r2 = 0
            if (r7 == 0) goto L_0x001e
            pe3.b r7 = r7.f144906h
            if (r7 == 0) goto L_0x001e
            byte[] r7 = r7.mo123703f()
            goto L_0x001f
        L_0x001e:
            r7 = r2
        L_0x001f:
            if (r7 != 0) goto L_0x0022
            goto L_0x0035
        L_0x0022:
            r1.parseFrom(r7)     // Catch:{ Exception -> 0x0026 }
            goto L_0x0035
        L_0x0026:
            r7 = move-exception
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r7
            java.lang.String r7 = "safeParser"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r7, r4, r3)
        L_0x0035:
            te3.ry0 r7 = r1.f130777d
            if (r7 == 0) goto L_0x00a2
            cj1.m5 r1 = new cj1.m5
            r1.<init>(r7)
            java.lang.String r3 = r6.f43363c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "on receive flash sale product, cancel = "
            r4.append(r5)
            int r5 = r1.f1374c
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r3, r4)
            fj1.b r3 = r6.f43066a
            java.lang.Class<cl1.h1> r4 = cl1.C54979h1.class
            androidx.lifecycle.i0 r3 = r3.mo71262a(r4)
            cl1.h1 r3 = (cl1.C54979h1) r3
            r3.mo75946m3(r1)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r3.getClass()
            com.tencent.mm.plugin.finder.live.view.b r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r3 == 0) goto L_0x00a2
            int r7 = r7.f141213d
            if (r7 == 0) goto L_0x0081
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r7 = r3.getController(r0)
            oh1.c r7 = (oh1.C11415c) r7
            if (r7 == 0) goto L_0x00a2
            oh1.b r0 = new oh1.b
            r0.<init>(r7)
            o40.C61926c.m72668M(r0)
            goto L_0x00a2
        L_0x0081:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r7 = r3.getController(r0)
            oh1.c r7 = (oh1.C11415c) r7
            if (r7 == 0) goto L_0x008c
            r7.mo11424m3()
        L_0x008c:
            com.tencent.mm.plugin.finder.live.view.b r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r7 == 0) goto L_0x0094
            android.content.Context r2 = r7.getContext()
        L_0x0094:
            if (r2 != 0) goto L_0x009f
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r7 = "getContext()"
            gy3.C87412m.m108593f(r2, r7)
        L_0x009f:
            oh1.C47378k.m52727a(r1, r2, r3)
        L_0x00a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: zg1.C16174g0.mo14632d(java.util.LinkedList):void");
    }

    /* renamed from: g */
    public int[] mo14635g() {
        return new int[]{20087};
    }
}
