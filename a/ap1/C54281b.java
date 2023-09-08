package ap1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;

/* renamed from: ap1.b */
public final class C54281b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C54282c f152361d;

    /* renamed from: e */
    public final /* synthetic */ C56032b f152362e;

    public C54281b(C54282c cVar, C56032b bVar) {
        this.f152361d = cVar;
        this.f152362e = bVar;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.tencent.mm.plugin.finder.live.view.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r32) {
        /*
            r31 = this;
            r6 = r31
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r32
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/replay/shopping/FinderLiveShoppingReplayDecorateUIC$initPlugins$1$1$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r31
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            ap1.c r0 = r6.f152361d
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            androidx.lifecycle.i0 r1 = r0.mo83051g(r1)
            cl1.o r1 = (cl1.C54991o) r1
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.f154341n
            r2 = 0
            if (r1 == 0) goto L_0x00b0
            java.lang.String r3 = r1.username
            zc1.b r4 = zc1.C66785b.f191882e
            java.lang.String r4 = r4.mo90662O5()
            boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isEqual((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r4 = ""
            if (r3 == 0) goto L_0x007b
            java.lang.Class<tf0.o1> r3 = tf0.C13883o1.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            java.lang.String r5 = "getService(IActivityRouter::class.java)"
            gy3.C87412m.m108593f(r3, r5)
            r7 = r3
            tf0.o1 r7 = (tf0.C13883o1) r7
            androidx.appcompat.app.AppCompatActivity r8 = r0.f189237e
            long r9 = r1.f164794id
            java.lang.String r3 = r1.objectNonceId
            if (r3 != 0) goto L_0x0057
            r11 = r4
            goto L_0x0058
        L_0x0057:
            r11 = r3
        L_0x0058:
            te3.c21 r3 = r1.liveInfo
            if (r3 != 0) goto L_0x0061
            te3.c21 r3 = new te3.c21
            r3.<init>()
        L_0x0061:
            r12 = r3
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            java.lang.String r1 = r1.sessionBuffer
            r19 = r1
            r20 = 0
            r21 = 0
            r22 = 7152(0x1bf0, float:1.0022E-41)
            r23 = 0
            tf0.C13883o1.C13884a.m13249a(r7, r8, r9, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            goto L_0x00ad
        L_0x007b:
            te3.c90 r3 = new te3.c90
            r3.<init>()
            r3.f182444d = r4
            r3.f182445e = r4
            r4 = 0
            r3.f182446f = r4
            r4 = -1
            r3.f182447g = r4
            r3.f182448h = r4
            r3.f182449i = r4
            r3.f182450j = r2
            java.lang.Class<ls3.f> r4 = ls3.C10649f.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            r24 = r4
            ls3.f r24 = (ls3.C10649f) r24
            androidx.appcompat.app.AppCompatActivity r4 = r0.f189237e
            r26 = 0
            java.util.List r27 = sx3.C26236u.m33719b(r1)
            r28 = 0
            r30 = 0
            r25 = r4
            r29 = r3
            r24.mo10913cP(r25, r26, r27, r28, r29, r30)
        L_0x00ad:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x00b1
        L_0x00b0:
            r1 = r2
        L_0x00b1:
            if (r1 != 0) goto L_0x00ba
            java.lang.String r1 = r0.f152363g
            java.lang.String r3 = "gotoFinderLive error finderObject is null!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r3)
        L_0x00ba:
            com.tencent.mm.plugin.finder.live.view.b r0 = r0.f189238f
            if (r0 == 0) goto L_0x00c1
            r0.finish()
        L_0x00c1:
            com.tencent.mm.plugin.finder.live.view.b r0 = r6.f152362e
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout
            if (r1 == 0) goto L_0x00ca
            r2 = r0
            com.tencent.mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout r2 = (com.tencent.p014mm.plugin.finder.replay.shopping.FinderLiveShoppingReplayPluginLayout) r2
        L_0x00ca:
            if (r2 == 0) goto L_0x00d7
            cp1.q r0 = r2.getUiClickListener()
            if (r0 == 0) goto L_0x00d7
            ks3.l r1 = ks3.C61162l.ShopReplay
            r0.mo82767c(r1)
        L_0x00d7:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/replay/shopping/FinderLiveShoppingReplayDecorateUIC$initPlugins$1$1$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            j20.C117292a.m165361g(r6, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ap1.C54281b.onClick(android.view.View):void");
    }
}
