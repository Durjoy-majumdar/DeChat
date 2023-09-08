package v50;

import iq3.C60601c;
import java.util.LinkedList;
import u50.C65212a;

/* renamed from: v50.c */
public final class C65549c extends C60601c {

    /* renamed from: c */
    public final LinkedList<C65548b> f188595c = new LinkedList<>();

    /* renamed from: d */
    public C65212a f188596d;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x008e, code lost:
        if (gy3.C87412m.m108589b(r9, r10 != null ? r10.mo87795P() : null) != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f6, code lost:
        if (gy3.C87412m.m108589b(r9, r10 != null ? r10.mo87795P() : null) != false) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0096 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0100 A[EDGE_INSN: B:93:0x0100->B:47:0x0100 ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85562b() {
        /*
            r12 = this;
            com.tencent.mm.view.ratio.RatioLayout r0 = r12.mo85561a()
            iq3.b r0 = r0.getAdapter()
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.live.core.trtc.TRTCRatioVideoAdapter"
            gy3.C87412m.m108592e(r0, r1)
            u50.c r0 = (u50.C65214c) r0
            int r1 = r0.mo85553a()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3 = 0
            r4 = 0
        L_0x001a:
            if (r4 >= r1) goto L_0x003d
            v50.b r5 = new v50.b
            java.util.ArrayList<v50.a> r6 = r0.f187735c
            java.lang.Object r6 = r6.get(r4)
            java.lang.String r7 = "trtcUserList[pos]"
            gy3.C87412m.m108593f(r6, r7)
            v50.a r6 = (v50.C65547a) r6
            java.lang.Object r7 = r0.mo85554b(r4)
            android.view.View r7 = r0.mo85555c(r4, r7)
            r5.<init>(r6, r7)
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x001a
        L_0x003d:
            java.util.LinkedList<v50.b> r0 = r12.f188595c
            java.util.Iterator r0 = r0.iterator()
        L_0x0043:
            boolean r1 = r0.hasNext()
            java.lang.String r4 = "DEFAULT_ANCHOR_USER_ID"
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L_0x00a3
            java.lang.Object r1 = r0.next()
            v50.b r1 = (v50.C65548b) r1
            java.util.Iterator r7 = r2.iterator()
        L_0x0057:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0097
            java.lang.Object r8 = r7.next()
            r9 = r8
            v50.b r9 = (v50.C65548b) r9
            v50.a r10 = r9.f188593a
            java.lang.String r10 = r10.f188591a
            v50.a r11 = r1.f188593a
            java.lang.String r11 = r11.f188591a
            boolean r10 = gy3.C87412m.m108589b(r10, r11)
            if (r10 != 0) goto L_0x0093
            v50.a r10 = r1.f188593a
            java.lang.String r10 = r10.f188591a
            boolean r10 = gy3.C87412m.m108589b(r10, r4)
            if (r10 == 0) goto L_0x0091
            v50.a r9 = r9.f188593a
            java.lang.String r9 = r9.f188591a
            u50.a r10 = r12.f188596d
            if (r10 == 0) goto L_0x0089
            java.lang.String r10 = r10.mo87795P()
            goto L_0x008a
        L_0x0089:
            r10 = r5
        L_0x008a:
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r9 = 0
            goto L_0x0094
        L_0x0093:
            r9 = 1
        L_0x0094:
            if (r9 == 0) goto L_0x0057
            r5 = r8
        L_0x0097:
            if (r5 != 0) goto L_0x0043
            com.tencent.mm.view.ratio.RatioLayout r4 = r12.mo85561a()
            android.view.View r1 = r1.f188594b
            r4.removeView(r1)
            goto L_0x0043
        L_0x00a3:
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x01b2
            java.util.Iterator r0 = r2.iterator()
        L_0x00ad:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0174
            java.lang.Object r1 = r0.next()
            v50.b r1 = (v50.C65548b) r1
            java.util.LinkedList<v50.b> r7 = r12.f188595c
            java.util.Iterator r7 = r7.iterator()
        L_0x00bf:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00ff
            java.lang.Object r8 = r7.next()
            r9 = r8
            v50.b r9 = (v50.C65548b) r9
            v50.a r10 = r9.f188593a
            java.lang.String r10 = r10.f188591a
            v50.a r11 = r1.f188593a
            java.lang.String r11 = r11.f188591a
            boolean r10 = gy3.C87412m.m108589b(r10, r11)
            if (r10 != 0) goto L_0x00fb
            v50.a r9 = r9.f188593a
            java.lang.String r9 = r9.f188591a
            boolean r9 = gy3.C87412m.m108589b(r9, r4)
            if (r9 == 0) goto L_0x00f9
            v50.a r9 = r1.f188593a
            java.lang.String r9 = r9.f188591a
            u50.a r10 = r12.f188596d
            if (r10 == 0) goto L_0x00f1
            java.lang.String r10 = r10.mo87795P()
            goto L_0x00f2
        L_0x00f1:
            r10 = r5
        L_0x00f2:
            boolean r9 = gy3.C87412m.m108589b(r9, r10)
            if (r9 == 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            r9 = 0
            goto L_0x00fc
        L_0x00fb:
            r9 = 1
        L_0x00fc:
            if (r9 == 0) goto L_0x00bf
            goto L_0x0100
        L_0x00ff:
            r8 = r5
        L_0x0100:
            v50.b r8 = (v50.C65548b) r8
            if (r8 == 0) goto L_0x013b
            android.view.View r7 = r8.f188594b
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            boolean r9 = r7 instanceof com.tencent.p014mm.view.ratio.RatioLayout.LayoutParams
            if (r9 == 0) goto L_0x0111
            com.tencent.mm.view.ratio.RatioLayout$LayoutParams r7 = (com.tencent.p014mm.view.ratio.RatioLayout.LayoutParams) r7
            goto L_0x0112
        L_0x0111:
            r7 = r5
        L_0x0112:
            if (r7 != 0) goto L_0x0115
            goto L_0x011b
        L_0x0115:
            v50.a r9 = r1.f188593a
            com.tencent.mm.view.ratio.RatioLayout$a r9 = r9.f188592b
            r7.f165728a = r9
        L_0x011b:
            v50.a r7 = r8.f188593a
            java.lang.String r7 = r7.f188591a
            boolean r7 = gy3.C87412m.m108589b(r7, r4)
            if (r7 == 0) goto L_0x0138
            v50.a r7 = r8.f188593a
            u50.a r8 = r12.f188596d
            if (r8 == 0) goto L_0x0131
            java.lang.String r8 = r8.mo87795P()
            if (r8 != 0) goto L_0x0133
        L_0x0131:
            java.lang.String r8 = ""
        L_0x0133:
            r7.getClass()
            r7.f188591a = r8
        L_0x0138:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x013c
        L_0x013b:
            r7 = r5
        L_0x013c:
            if (r7 != 0) goto L_0x00ad
            android.view.View r7 = r1.f188594b
            android.view.ViewParent r7 = r7.getParent()
            if (r7 == 0) goto L_0x015b
            android.view.View r7 = r1.f188594b
            android.view.ViewParent r7 = r7.getParent()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x0153
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0154
        L_0x0153:
            r7 = r5
        L_0x0154:
            if (r7 == 0) goto L_0x015b
            android.view.View r8 = r1.f188594b
            r7.removeView(r8)
        L_0x015b:
            com.tencent.mm.view.ratio.RatioLayout r7 = r12.mo85561a()
            android.view.View r8 = r1.f188594b
            com.tencent.mm.view.ratio.RatioLayout$LayoutParams r9 = new com.tencent.mm.view.ratio.RatioLayout$LayoutParams
            r10 = -1
            r9.<init>((int) r10, (int) r10)
            v50.a r1 = r1.f188593a
            com.tencent.mm.view.ratio.RatioLayout$a r1 = r1.f188592b
            r9.f165728a = r1
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r7.addView(r8, r9)
            goto L_0x00ad
        L_0x0174:
            java.util.LinkedList<v50.b> r0 = r12.f188595c
            r0.clear()
            java.util.LinkedList<v50.b> r0 = r12.f188595c
            r0.addAll(r2)
            java.util.LinkedList<v50.b> r0 = r12.f188595c
            int r0 = r0.size()
        L_0x0184:
            if (r3 >= r0) goto L_0x0196
            java.util.LinkedList<v50.b> r1 = r12.f188595c
            java.lang.Object r1 = r1.get(r3)
            v50.b r1 = (v50.C65548b) r1
            android.view.View r1 = r1.f188594b
            r1.bringToFront()
            int r3 = r3 + 1
            goto L_0x0184
        L_0x0196:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "requestRefresh, bindHolders size:"
            r0.append(r1)
            java.util.LinkedList<v50.b> r1 = r12.f188595c
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TRTCRatioLayoutManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
        L_0x01b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v50.C65549c.mo85562b():void");
    }
}
