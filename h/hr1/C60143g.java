package hr1;

import com.tencent.p014mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager;

/* renamed from: hr1.g */
public final class C60143g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ FinderMultiFlowVideoAutoPlayManager f171679d;

    /* renamed from: e */
    public final /* synthetic */ int f171680e;

    public C60143g(FinderMultiFlowVideoAutoPlayManager finderMultiFlowVideoAutoPlayManager, int i) {
        this.f171679d = finderMultiFlowVideoAutoPlayManager;
        this.f171680e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008b, code lost:
        r3 = (r3 = r2.getPlayInfo()).f161892a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e7  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0038  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r16 = this;
            r0 = r16
            com.tencent.mm.plugin.finder.video.autoplay.FinderMultiFlowVideoAutoPlayManager r8 = r0.f171679d
            int r1 = r0.f171680e
            com.tencent.mm.ui.MMFragmentActivity r2 = r8.f161941g
            boolean r3 = r2 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x002c
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r2 = r3.mo62444c(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r3 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(activity)…inderHomeUIC::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r2 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r2
            int r2 = r2.mo5128d3()
            int r3 = r8.f161944j
            if (r2 != r3) goto L_0x002a
            goto L_0x002c
        L_0x002a:
            r2 = 0
            goto L_0x002d
        L_0x002c:
            r2 = 1
        L_0x002d:
            java.lang.String r9 = "Finder.MultiFlowVideoAutoPlayManager"
            if (r2 != 0) goto L_0x0038
            java.lang.String r1 = "is User No Visible Focused"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
            goto L_0x02c2
        L_0x0038:
            boolean r2 = r8.f161953v
            r10 = 0
            if (r2 != 0) goto L_0x0047
            java.lang.String r1 = "is Activity resume."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
            r8.mo79658E1(r10)
            goto L_0x02c2
        L_0x0047:
            boolean r2 = r8.f161948q
            if (r2 == 0) goto L_0x007a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[playSelectedFeed] isLocked="
            r1.append(r2)
            boolean r2 = r8.f161948q
            r1.append(r2)
            java.lang.String r2 = " lockKV="
            r1.append(r2)
            java.util.HashSet<java.lang.String> r2 = r8.f161947p
            r1.append(r2)
            java.lang.String r2 = " tabType="
            r1.append(r2)
            int r2 = r8.f161944j
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
            r8.mo79658E1(r10)
            goto L_0x02c2
        L_0x007a:
            android.graphics.Rect r2 = r8.f161952u
            r2.setEmpty()
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r2 = r8.f161949r
            long r6 = r8.f161950s
            if (r2 == 0) goto L_0x0099
            com.tencent.mm.plugin.finder.video.FinderVideoLayout$b r3 = r2.getPlayInfo()
            if (r3 == 0) goto L_0x0099
            com.tencent.mm.plugin.finder.storage.FeedData r3 = r3.f161892a
            if (r3 == 0) goto L_0x0099
            long r11 = r3.getFeedId()
            int r3 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r3 != 0) goto L_0x0099
            r3 = 1
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            r11 = 2
            if (r3 == 0) goto L_0x00f6
            android.graphics.Rect r3 = r8.f161952u
            boolean r3 = r2.getGlobalVisibleRect(r3)
            if (r3 == 0) goto L_0x00f6
            android.graphics.Rect r3 = r8.f161952u
            int r3 = r3.height()
            int r12 = r2.getHeight()
            int r12 = r12 * 2
            int r12 = r12 / 3
            if (r3 < r12) goto L_0x00f6
            androidx.recyclerview.widget.RecyclerView r3 = r8.f161942h
            androidx.recyclerview.widget.RecyclerView$z r3 = r3.mo17021F0(r2)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "continue to play focus video. focusFeedId="
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = " focusHolderItemId="
            r12.append(r6)
            if (r3 == 0) goto L_0x00d6
            long r6 = r3.f44858h
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            goto L_0x00d7
        L_0x00d6:
            r6 = r10
        L_0x00d7:
            r12.append(r6)
            java.lang.String r6 = r2.getFTPPTag()
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            if (r3 == 0) goto L_0x00f6
            r8.mo79658E1(r3)
            int r1 = r3.mo17363j()
            com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.m65078D(r2, r1, r10, r11, r10)
            goto L_0x02c2
        L_0x00f6:
            android.graphics.Rect r2 = r8.f161952u
            r2.setEmpty()
            androidx.recyclerview.widget.RecyclerView r2 = r8.f161942h
            android.graphics.Rect r3 = r8.f161952u
            r2.getGlobalVisibleRect(r3)
            android.graphics.Rect r2 = r8.f161952u
            int r2 = r2.top
            float r2 = (float) r2
            androidx.recyclerview.widget.RecyclerView r3 = r8.f161942h
            int r3 = r3.getHeight()
            float r3 = (float) r3
            r6 = 1050253722(0x3e99999a, float:0.3)
            float r3 = r3 * r6
            float r2 = r2 + r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            androidx.recyclerview.widget.RecyclerView r6 = r8.f161942h
            int r6 = r6.getChildCount()
            r7 = 0
        L_0x0120:
            r12 = 2131302685(0x7f09191d, float:1.8223463E38)
            if (r7 >= r6) goto L_0x019c
            androidx.recyclerview.widget.RecyclerView r13 = r8.f161942h
            android.view.View r13 = r13.getChildAt(r7)
            int[] r14 = r8.f161951t
            float r15 = (float) r5
            float r15 = r15 + r2
            int r15 = iy3.C60641c.m70921b(r15)
            r14[r5] = r15
            android.view.View r12 = r13.findViewById(r12)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r12 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r12
            if (r12 == 0) goto L_0x0142
            int[] r14 = r8.f161951t
            r12.getLocationInWindow(r14)
        L_0x0142:
            boolean r14 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r14 == 0) goto L_0x016e
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "[findTargetHolder] i="
            r14.append(r15)
            r14.append(r7)
            java.lang.String r15 = " baseY="
            r14.append(r15)
            r14.append(r2)
            java.lang.String r15 = " loc="
            r14.append(r15)
            int[] r15 = r8.f161951t
            r15 = r15[r5]
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r14)
        L_0x016e:
            int[] r14 = r8.f161951t
            r14 = r14[r5]
            float r14 = (float) r14
            int r14 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r14 > 0) goto L_0x0199
            if (r12 == 0) goto L_0x0199
            android.graphics.Rect r14 = r8.f161952u
            r14.setEmpty()
            android.graphics.Rect r14 = r8.f161952u
            boolean r14 = r12.getGlobalVisibleRect(r14)
            if (r14 == 0) goto L_0x0199
            android.graphics.Rect r14 = r8.f161952u
            int r14 = r14.height()
            int r12 = r12.getHeight()
            int r12 = r12 * 2
            int r12 = r12 / 3
            if (r14 < r12) goto L_0x0199
            r3.add(r13)
        L_0x0199:
            int r7 = r7 + 1
            goto L_0x0120
        L_0x019c:
            java.lang.Object r2 = sx3.C110818d0.m150916N(r3)
            android.view.View r2 = (android.view.View) r2
            if (r2 != 0) goto L_0x01ab
            java.lang.String r2 = "validView is empty!"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r2)
            goto L_0x01e2
        L_0x01ab:
            androidx.recyclerview.widget.RecyclerView r3 = r8.f161942h
            androidx.recyclerview.widget.RecyclerView$z r2 = r3.mo17021F0(r2)
            if (r2 == 0) goto L_0x01be
            android.view.View r3 = r2.f44854d
            if (r3 == 0) goto L_0x01be
            android.view.View r3 = r3.findViewById(r12)
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r3 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r3
            goto L_0x01bf
        L_0x01be:
            r3 = r10
        L_0x01bf:
            if (r3 != 0) goto L_0x01e4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "videoLayout is null position="
            r3.append(r6)
            if (r2 == 0) goto L_0x01d7
            int r2 = r2.mo17363j()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x01d8
        L_0x01d7:
            r2 = r10
        L_0x01d8:
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r2)
        L_0x01e2:
            r13 = r10
            goto L_0x01e5
        L_0x01e4:
            r13 = r2
        L_0x01e5:
            if (r13 != 0) goto L_0x020b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "find focusHolder is null. retry="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r2)
            if (r1 > r5) goto L_0x02c2
            com.tencent.mm.sdk.platformtools.MMHandler r2 = r8.f161945n
            android.os.Message r2 = r2.obtainMessage(r5)
            int r1 = r1 + r5
            r2.arg1 = r1
            r2.sendToTarget()
            goto L_0x02c2
        L_0x020b:
            android.view.View r1 = r13.f44854d
            android.view.View r1 = r1.findViewById(r12)
            r12 = r1
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r12 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r12
            r8.mo79658E1(r13)
            boolean r1 = r13 instanceof jq3.C60905o
            if (r1 == 0) goto L_0x021f
            r1 = r13
            jq3.o r1 = (jq3.C60905o) r1
            goto L_0x0220
        L_0x021f:
            r1 = r10
        L_0x0220:
            if (r1 == 0) goto L_0x0228
            java.lang.Object r1 = r1.f173503E
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r1
            r7 = r1
            goto L_0x0229
        L_0x0228:
            r7 = r10
        L_0x0229:
            if (r7 == 0) goto L_0x0230
            long r1 = r7.getItemId()
            goto L_0x0232
        L_0x0230:
            r1 = 0
        L_0x0232:
            r14 = r1
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99391e8
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r5) goto L_0x0248
            r1 = 1
            goto L_0x0249
        L_0x0248:
            r1 = 0
        L_0x0249:
            if (r1 == 0) goto L_0x028a
            if (r7 == 0) goto L_0x0264
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r7.mo3513o()
            if (r1 == 0) goto L_0x0264
            java.util.LinkedList r1 = r1.getMediaList()
            if (r1 == 0) goto L_0x0264
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            te3.rq2 r1 = (te3.C64689rq2) r1
            if (r1 == 0) goto L_0x0264
            java.lang.String r1 = r1.f185283w
            goto L_0x0265
        L_0x0264:
            r1 = r10
        L_0x0265:
            if (r1 == 0) goto L_0x026d
            int r1 = r1.length()
            if (r1 != 0) goto L_0x026e
        L_0x026d:
            r4 = 1
        L_0x026e:
            if (r4 == 0) goto L_0x0271
            goto L_0x028a
        L_0x0271:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "has coverUrl feedId="
            r1.append(r2)
            java.lang.String r2 = o40.C61926c.m72691p(r14)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r9, r1)
            goto L_0x02c2
        L_0x028a:
            r12.setMute(r5)
            hr1.h r6 = new hr1.h
            r1 = r6
            r2 = r8
            r3 = r14
            r5 = r12
            r10 = r6
            r6 = r13
            r1.<init>(r2, r3, r5, r6, r7)
            r12.mo79544H(r10)
            r12.mo79569m(r10)
            int r1 = r13.mo17363j()
            r2 = 0
            com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.m65078D(r12, r1, r2, r11, r2)
            r8.f161949r = r12
            r8.f161950s = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "begin play! "
            r1.append(r2)
            java.lang.String r2 = r12.getFTPPTag()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r1)
        L_0x02c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hr1.C60143g.run():void");
    }
}
