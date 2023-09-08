package com.tencent.p014mm.plugin.finder.viewmodel.component;

import com.tencent.p014mm.autogen.events.FeedMegaVideoAnimPlayEvent;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.d */
public final class C4330d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLikeGuideUIC f18806d;

    /* renamed from: e */
    public final /* synthetic */ FeedMegaVideoAnimPlayEvent f18807e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4330d(FinderLikeGuideUIC finderLikeGuideUIC, FeedMegaVideoAnimPlayEvent feedMegaVideoAnimPlayEvent) {
        super(0);
        this.f18806d = finderLikeGuideUIC;
        this.f18807e = feedMegaVideoAnimPlayEvent;
    }

    /* JADX WARNING: type inference failed for: r5v16, types: [androidx.recyclerview.widget.RecyclerView$z] */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        if ((r11 != null && r11.f44859i == 2) != false) goto L_0x00a6;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r16 = this;
            r0 = r16
            com.tencent.mm.plugin.finder.viewmodel.component.FinderLikeGuideUIC r1 = r0.f18806d
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent r2 = r0.f18807e
            com.tencent.mm.autogen.events.FeedMegaVideoAnimPlayEvent$a r2 = r2.f9160d
            long r2 = r2.f9161a
            r1.getClass()
            gy3.f0 r4 = new gy3.f0
            r4.<init>()
            androidx.appcompat.app.AppCompatActivity r5 = r1.getActivity()
            boolean r5 = r5 instanceof com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI
            r6 = 1
            r7 = 0
            r8 = -1
            r9 = 4
            r10 = 2
            if (r5 == 0) goto L_0x00af
            androidx.appcompat.app.AppCompatActivity r5 = r1.getActivity()
            boolean r5 = r5.isFinishing()
            if (r5 != 0) goto L_0x00af
            androidx.appcompat.app.AppCompatActivity r5 = r1.getActivity()
            boolean r5 = r5.isDestroyed()
            if (r5 != 0) goto L_0x00af
            bl3.r r5 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r11 = r1.getActivity()
            bl3.r$a r11 = r5.mo62444c(r11)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC> r12 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.class
            androidx.lifecycle.i0 r11 = r11.mo75002a(r12)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC r11 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC) r11
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r11 = r11.getActiveFragment()
            bl3.r$a r5 = r5.mo62445d(r11)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC> r11 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.class
            bl3.t r5 = r5.mo62449e(r11)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC r5 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC) r5
            r11 = 0
            if (r5 == 0) goto L_0x006a
            kf1.n9 r5 = r5.f18786e
            if (r5 == 0) goto L_0x0063
            kf1.nb r5 = (kf1.C9881nb) r5
            androidx.recyclerview.widget.RecyclerView r5 = r5.getRecyclerView()
            goto L_0x006b
        L_0x0063:
            java.lang.String r1 = "viewCallback"
            gy3.C87412m.m108603p(r1)
            throw r11
        L_0x006a:
            r5 = r11
        L_0x006b:
            if (r5 != 0) goto L_0x006f
            goto L_0x0230
        L_0x006f:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r12 = r5.getLayoutManager()
            boolean r13 = r12 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r13 == 0) goto L_0x007a
            androidx.recyclerview.widget.LinearLayoutManager r12 = (androidx.recyclerview.widget.LinearLayoutManager) r12
            goto L_0x007b
        L_0x007a:
            r12 = r11
        L_0x007b:
            if (r12 == 0) goto L_0x0082
            int r12 = r12.mo17004z()
            goto L_0x0083
        L_0x0082:
            r12 = -1
        L_0x0083:
            if (r12 == r8) goto L_0x00af
            androidx.recyclerview.widget.RecyclerView$z r5 = r5.mo17023I0(r12)
            boolean r12 = r5 instanceof jq3.C60905o
            if (r12 == 0) goto L_0x0090
            r11 = r5
            jq3.o r11 = (jq3.C60905o) r11
        L_0x0090:
            if (r11 == 0) goto L_0x0098
            int r5 = r11.f44859i
            if (r5 != r9) goto L_0x0098
            r5 = 1
            goto L_0x0099
        L_0x0098:
            r5 = 0
        L_0x0099:
            if (r5 != 0) goto L_0x00a6
            if (r11 == 0) goto L_0x00a3
            int r5 = r11.f44859i
            if (r5 != r10) goto L_0x00a3
            r5 = 1
            goto L_0x00a4
        L_0x00a3:
            r5 = 0
        L_0x00a4:
            if (r5 == 0) goto L_0x00af
        L_0x00a6:
            r5 = 2131309065(0x7f093209, float:1.8236403E38)
            android.view.View r5 = r11.mo85812D(r5)
            r4.f27484d = r5
        L_0x00af:
            T r5 = r4.f27484d
            if (r5 != 0) goto L_0x00b5
            goto L_0x0230
        L_0x00b5:
            f40.o r5 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r5 = r5.mo121142i()
            com.tencent.mm.storage.y1$a r11 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_FULL_LIKE_FEED_GUIDE_INT
            int r5 = r5.mo119689j(r11, r7)
            r12 = 3
            if (r5 >= r12) goto L_0x0230
            boolean r13 = r1.f18759e
            if (r13 == 0) goto L_0x0230
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "[checkGuide] count="
            r13.append(r14)
            r13.append(r5)
            java.lang.String r13 = r13.toString()
            java.lang.String r14 = "Finder.LikeGuideUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r13)
            java.lang.String r2 = o40.C61926c.m72691p(r2)
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r13 = r1.getActivity()
            rs1.s8 r3 = r3.mo12873f(r13)
            if (r3 == 0) goto L_0x00f5
            te3.hj1 r3 = r3.mo12861q3()
            goto L_0x00fa
        L_0x00f5:
            te3.hj1 r3 = new te3.hj1
            r3.<init>()
        L_0x00fa:
            long r13 = java.lang.System.currentTimeMillis()
            java.lang.String r13 = java.lang.String.valueOf(r13)
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = "feedid"
            r14.put(r15, r2)
            java.lang.String r2 = r14.toString()
            java.lang.String r14 = "JSONObject().apply {\n   …dId)\n        }.toString()"
            gy3.C87412m.m108593f(r2, r14)
            java.lang.String r14 = ","
            java.lang.String r15 = ";"
            java.lang.String r2 = z04.C112551y.m153814n(r2, r14, r15, r7)
            com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r15 = 8
            java.lang.Object[] r15 = new java.lang.Object[r15]
            java.lang.String r8 = r3.f134670d
            r15[r7] = r8
            java.lang.String r8 = r3.f134671e
            r15[r6] = r8
            int r8 = r3.f134675i
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r15[r10] = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r15[r12] = r8
            r15[r9] = r13
            r8 = 5
            java.lang.String r9 = "dbclck_like_edu"
            r15[r8] = r9
            r8 = 6
            r15[r8] = r2
            r2 = 7
            java.lang.String r3 = r3.f134672f
            r15[r2] = r3
            r2 = 21875(0x5573, float:3.0653E-41)
            r14.mo160131h(r2, r15)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
            r2.<init>(r3)
            r1.f18758d = r2
            r2.setOrientation(r6)
            android.widget.LinearLayout r2 = r1.f18758d
            r3 = 17
            if (r2 != 0) goto L_0x0162
            goto L_0x0165
        L_0x0162:
            r2.setGravity(r3)
        L_0x0165:
            android.widget.LinearLayout r2 = r1.f18758d
            if (r2 == 0) goto L_0x016f
            r8 = 2131100922(0x7f0604fa, float:1.781424E38)
            r2.setBackgroundResource(r8)
        L_0x016f:
            org.libpag.PAGView r2 = new org.libpag.PAGView
            androidx.appcompat.app.AppCompatActivity r8 = r1.getActivity()
            r2.<init>(r8)
            androidx.appcompat.app.AppCompatActivity r8 = r1.getActivity()
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131165292(0x7f07006c, float:1.7944797E38)
            float r8 = r8.getDimension(r9)
            int r8 = (int) r8
            android.widget.LinearLayout r9 = r1.f18758d
            if (r9 == 0) goto L_0x0198
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r10.<init>(r8, r8)
            r10.gravity = r3
            rx3.b0 r8 = rx3.C13598b0.f38549a
            r9.addView(r2, r10)
        L_0x0198:
            android.widget.TextView r8 = new android.widget.TextView
            androidx.appcompat.app.AppCompatActivity r9 = r1.getActivity()
            r8.<init>(r9)
            androidx.appcompat.app.AppCompatActivity r9 = r1.getActivity()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131826581(0x7f111795, float:1.928605E38)
            java.lang.String r9 = r9.getString(r10)
            r8.setText(r9)
            r9 = -1
            r8.setTextColor(r9)
            r9 = 1101004800(0x41a00000, float:20.0)
            r8.setTextSize(r6, r9)
            er1.C7919x.m8091a(r8)
            android.widget.LinearLayout r9 = r1.f18758d
            if (r9 == 0) goto L_0x01e2
            android.widget.LinearLayout$LayoutParams r10 = new android.widget.LinearLayout$LayoutParams
            r12 = -2
            r10.<init>(r12, r12)
            androidx.appcompat.app.AppCompatActivity r12 = r1.getActivity()
            android.content.res.Resources r12 = r12.getResources()
            r13 = 2131165337(0x7f070099, float:1.7944888E38)
            float r12 = r12.getDimension(r13)
            int r12 = (int) r12
            r10.topMargin = r12
            r10.gravity = r3
            rx3.b0 r12 = rx3.C13598b0.f38549a
            r9.addView(r8, r10)
        L_0x01e2:
            r8 = -1
            r2.setRepeatCount(r8)
            android.app.Activity r9 = r1.getContext()
            android.content.res.AssetManager r9 = r9.getAssets()
            java.lang.String r10 = "finder_full_like_guide.pag"
            org.libpag.PAGFile r9 = org.libpag.PAGFile.Load(r9, r10)
            r2.setComposition(r9)
            r2.play()
            T r2 = r4.f27484d
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            android.widget.LinearLayout r9 = r1.f18758d
            android.widget.FrameLayout$LayoutParams r10 = new android.widget.FrameLayout$LayoutParams
            r10.<init>(r8, r8)
            r10.gravity = r3
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r2.addView(r9, r10)
            android.widget.LinearLayout r2 = r1.f18758d
            if (r2 != 0) goto L_0x0211
            goto L_0x0214
        L_0x0211:
            r2.setClickable(r7)
        L_0x0214:
            android.widget.LinearLayout r2 = r1.f18758d
            if (r2 == 0) goto L_0x0220
            rs1.f6 r3 = new rs1.f6
            r3.<init>(r4, r1)
            r2.setOnTouchListener(r3)
        L_0x0220:
            f40.o r1 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r1 = r1.mo121142i()
            int r5 = r5 + r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            r1.mo119677K(r11, r2)
        L_0x0230:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.C4330d.invoke():java.lang.Object");
    }
}
