package iq3;

import com.tencent.p014mm.view.ratio.RatioLayout;
import gy3.C87412m;

/* renamed from: iq3.c */
public class C60601c {

    /* renamed from: a */
    public final String f172708a = "MicroMsg.MultiAreaLayoutManager";

    /* renamed from: b */
    public RatioLayout f172709b;

    /* renamed from: a */
    public RatioLayout mo85561a() {
        RatioLayout ratioLayout = this.f172709b;
        if (ratioLayout != null) {
            return ratioLayout;
        }
        C87412m.m108603p("layout");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85562b() {
        /*
            r10 = this;
            com.tencent.mm.view.ratio.RatioLayout r0 = r10.mo85561a()
            iq3.b r0 = r0.getAdapter()
            int r1 = r0.mo85553a()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = 0
        L_0x0018:
            if (r5 >= r1) goto L_0x004d
            com.tencent.mm.view.ratio.RatioLayout$a r6 = r0.mo85557e(r5)
            java.lang.Object r7 = r0.mo85554b(r5)
            android.view.View r7 = r0.mo85555c(r5, r7)
            r2.add(r7)
            r3.add(r6)
            java.lang.String r7 = r10.f172708a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "addView index:"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r9 = " layoutInfo:"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r6)
            int r5 = r5 + 1
            goto L_0x0018
        L_0x004d:
            com.tencent.mm.view.ratio.RatioLayout r1 = r10.mo85561a()
            r1.removeAllViews()
            int r1 = r2.size()
            if (r1 <= 0) goto L_0x00af
            int r1 = r2.size()
            int r5 = r3.size()
            if (r1 != r5) goto L_0x00af
            java.util.Iterator r1 = r2.iterator()
        L_0x0068:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00d6
            java.lang.Object r2 = r1.next()
            int r5 = r4 + 1
            r6 = 0
            if (r4 < 0) goto L_0x00ab
            android.view.View r2 = (android.view.View) r2
            android.view.ViewParent r7 = r2.getParent()
            if (r7 == 0) goto L_0x008f
            android.view.ViewParent r7 = r2.getParent()
            boolean r8 = r7 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x008a
            r6 = r7
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
        L_0x008a:
            if (r6 == 0) goto L_0x008f
            r6.removeView(r2)
        L_0x008f:
            r0.mo85560h(r4, r2)
            com.tencent.mm.view.ratio.RatioLayout r6 = r10.mo85561a()
            com.tencent.mm.view.ratio.RatioLayout$LayoutParams r7 = new com.tencent.mm.view.ratio.RatioLayout$LayoutParams
            r8 = -1
            r7.<init>((int) r8, (int) r8)
            java.lang.Object r4 = r3.get(r4)
            com.tencent.mm.view.ratio.RatioLayout$a r4 = (com.tencent.p014mm.view.ratio.RatioLayout.C57914a) r4
            r7.f165728a = r4
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r6.addView(r2, r7)
            r4 = r5
            goto L_0x0068
        L_0x00ab:
            sx3.C64197v.m75542k()
            throw r6
        L_0x00af:
            java.lang.String r0 = r10.f172708a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "viewList size:"
            r1.append(r4)
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = ", layoutInfoList size:"
            r1.append(r2)
            int r2 = r3.size()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
        L_0x00d6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iq3.C60601c.mo85562b():void");
    }
}
