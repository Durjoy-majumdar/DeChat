package com.tencent.p014mm.plugin.finder.live.widget;

import android.content.Context;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;

/* renamed from: com.tencent.mm.plugin.finder.live.widget.c */
public final class C56145c implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveTaskBannerView f160132d;

    /* renamed from: e */
    public final /* synthetic */ Context f160133e;

    /* renamed from: f */
    public final /* synthetic */ FinderLiveTaskBannerView.C56135e f160134f;

    /* renamed from: com.tencent.mm.plugin.finder.live.widget.c$a */
    public static final class C56146a extends C87413o implements C32226l<FinderLiveTaskBannerView.C56133c, Boolean> {

        /* renamed from: d */
        public static final C56146a f160135d = new C56146a();

        public C56146a() {
            super(1);
        }

        public Object invoke(Object obj) {
            FinderLiveTaskBannerView.C56133c cVar = (FinderLiveTaskBannerView.C56133c) obj;
            C87412m.m108594g(cVar, LocaleUtil.ITALIAN);
            return Boolean.valueOf(cVar.mo64568b() == 0);
        }
    }

    public C56145c(FinderLiveTaskBannerView finderLiveTaskBannerView, Context context, FinderLiveTaskBannerView.C56135e eVar) {
        this.f160132d = finderLiveTaskBannerView;
        this.f160133e = context;
        this.f160134f = eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r6 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r7 = r19
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$1$onBindViewHolder$2"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r18
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.lang.Object r0 = r19.getTag()
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            gy3.C87412m.m108592e(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r1 = r6.f160132d
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c> r1 = r1.f160091g
            r2 = 0
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r1.get(r0)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c r1 = (com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView.C56133c) r1
            goto L_0x003e
        L_0x003d:
            r1 = r2
        L_0x003e:
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.lang.String r4 = "onClick"
            java.lang.String r5 = "android/view/View$OnClickListener"
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveTaskBannerView$init$1$onBindViewHolder$2"
            if (r1 == 0) goto L_0x01af
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView r8 = r6.f160132d
            android.content.Context r9 = r6.f160133e
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$e r10 = r6.f160134f
            java.lang.String r11 = r8.f160096o
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = " click posttion = "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r0 = ", reset = "
            r12.append(r0)
            int r0 = r1.mo64568b()
            r12.append(r0)
            java.lang.String r0 = " ，activityICon:"
            r12.append(r0)
            java.lang.String r0 = r1.mo64569c()
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r0)
            java.lang.Class<tf0.o1> r0 = tf0.C13883o1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            tf0.o1 r0 = (tf0.C13883o1) r0
            java.lang.String r11 = r1.getH5Url()
            r12 = 4
            r0.mo13279ch(r9, r2, r12, r11)
            boolean r0 = r1 instanceof com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView.C41479a
            r9 = 1
            r11 = 0
            if (r0 == 0) goto L_0x010d
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r13 = 22748(0x58dc, float:3.1877E-41)
            r14 = 6
            java.lang.Object[] r14 = new java.lang.Object[r14]
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            r14[r11] = r15
            r15 = 2
            java.lang.Integer r16 = java.lang.Integer.valueOf(r15)
            r14[r9] = r16
            long r16 = eb0.C31543z5.m39453c()
            java.lang.Long r16 = java.lang.Long.valueOf(r16)
            r14[r15] = r16
            r15 = 3
            zc1.b r16 = zc1.C66785b.f191882e
            java.lang.String r16 = r16.mo90662O5()
            r14[r15] = r16
            java.lang.String r15 = ""
            r14[r12] = r15
            r12 = 5
            java.lang.String r15 = r1.mo64573n()
            r14[r12] = r15
            r0.mo160131h(r13, r14)
            r0 = r1
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$a r0 = (com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView.C41479a) r0
            te3.l61 r0 = r0.f111699a
            int r0 = r0.f137224n
            if (r0 != r9) goto L_0x00fe
            te3.cb0 r0 = new te3.cb0
            r0.<init>()
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            r13 = 70
            java.lang.String r14 = "feedActionType"
            r12.put(r14, r13)
            java.lang.String r13 = r1.mo64573n()
            java.lang.String r14 = "id"
            r12.put(r14, r13)
            java.lang.String r12 = r12.toString()
            r0.f131610g = r12
            java.lang.Class<tf0.p1> r12 = tf0.C64916p1.class
            di3.d r12 = di3.C86312j.m106911c(r12)
            tf0.p1 r12 = (tf0.C64916p1) r12
            r13 = 18054(0x4686, float:2.5299E-41)
            r12.mo76728y(r2, r13, r0)
            goto L_0x011c
        L_0x00fe:
            java.lang.String r0 = r1.mo64573n()
            if (r0 == 0) goto L_0x011c
            qg1.d r12 = new qg1.d
            r12.<init>(r0)
            r12.mo9225i()
            goto L_0x011c
        L_0x010d:
            er1.u0 r0 = er1.C58777u0.f168283a
            r12 = 12
            java.lang.String r13 = r1.mo64573n()
            java.lang.String r14 = r8.getGameAppId()
            r0.mo83837f(r12, r13, r14)
        L_0x011c:
            int r0 = r1.mo64568b()
            r12 = -1
            if (r0 != r12) goto L_0x0127
            j20.C117292a.m165361g(r6, r7, r5, r4, r3)
            return
        L_0x0127:
            int r0 = r1.mo64568b()
            int r0 = r0 - r9
            if (r0 >= 0) goto L_0x012f
            r0 = 0
        L_0x012f:
            r1.mo64567a(r0)
            int r0 = r1.mo64568b()
            if (r0 != 0) goto L_0x01af
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c> r0 = r8.f160091g
            if (r0 == 0) goto L_0x0141
            com.tencent.mm.plugin.finder.live.widget.c$a r1 = com.tencent.p014mm.plugin.finder.live.widget.C56145c.C56146a.f160135d
            o40.C61926c.m72675T(r0, r1)
        L_0x0141:
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c> r0 = r8.f160091g
            if (r0 == 0) goto L_0x014c
            java.lang.Object r0 = sx3.C110818d0.m150916N(r0)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c r0 = (com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView.C56133c) r0
            goto L_0x014d
        L_0x014c:
            r0 = r2
        L_0x014d:
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c> r1 = r8.f160091g
            if (r1 == 0) goto L_0x0158
            java.lang.Object r1 = sx3.C110818d0.m150925W(r1)
            r2 = r1
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c r2 = (com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView.C56133c) r2
        L_0x0158:
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 != 0) goto L_0x017e
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c> r0 = r8.f160091g
            if (r0 == 0) goto L_0x0167
            int r0 = r0.size()
            goto L_0x0168
        L_0x0167:
            r0 = 0
        L_0x0168:
            if (r0 <= r9) goto L_0x017e
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c> r0 = r8.f160091g
            if (r0 == 0) goto L_0x017e
            int r1 = r0.size()
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c> r2 = r8.f160091g
            gy3.C87412m.m108591d(r2)
            java.lang.Object r2 = r2.get(r11)
            r0.add(r1, r2)
        L_0x017e:
            java.lang.String r0 = r8.f160096o
            java.lang.String r1 = "datalist after del"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            java.util.LinkedList<com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c> r0 = r8.f160091g
            if (r0 == 0) goto L_0x01a7
            java.util.Iterator r0 = r0.iterator()
        L_0x018d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x01a7
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerView$c r2 = (com.tencent.p014mm.plugin.finder.live.widget.FinderLiveTaskBannerView.C56133c) r2
            java.lang.String r9 = r8.f160096o
            java.lang.String r2 = r2.mo64573n()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r2)
            goto L_0x018d
        L_0x01a7:
            java.lang.String r0 = r8.f160096o
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            r10.notifyDataSetChanged()
        L_0x01af:
            j20.C117292a.m165361g(r6, r7, r5, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.widget.C56145c.onClick(android.view.View):void");
    }
}
