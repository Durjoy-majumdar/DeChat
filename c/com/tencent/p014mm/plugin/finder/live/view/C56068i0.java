package com.tencent.p014mm.plugin.finder.live.view;

import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;
import te3.C51575uo1;

/* renamed from: com.tencent.mm.plugin.finder.live.view.i0 */
public final class C56068i0 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ int f159891d;

    /* renamed from: e */
    public final /* synthetic */ String f159892e;

    /* renamed from: f */
    public final /* synthetic */ String f159893f;

    /* renamed from: g */
    public final /* synthetic */ FinderLiveExtendReadingEditView f159894g;

    /* renamed from: h */
    public final /* synthetic */ C51575uo1 f159895h;

    /* renamed from: i */
    public final /* synthetic */ String f159896i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56068i0(int i, String str, String str2, FinderLiveExtendReadingEditView finderLiveExtendReadingEditView, C51575uo1 uo12, String str3) {
        super(0);
        this.f159891d = i;
        this.f159892e = str;
        this.f159893f = str2;
        this.f159894g = finderLiveExtendReadingEditView;
        this.f159895h = uo12;
        this.f159896i = str3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r0 != null) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r7 = this;
            int r0 = r7.f159891d
            if (r0 != 0) goto L_0x0027
            java.lang.String r0 = r7.f159892e
            java.lang.String r1 = r7.f159893f
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x00d2
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r7.f159894g
            fy3.q r0 = r0.getOnSuccData()
            if (r0 == 0) goto L_0x00d2
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r1 = r7.f159894g
            int r1 = r1.f159717n
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r7.f159893f
            te3.uo1 r3 = r7.f159895h
            r0.invoke(r1, r2, r3)
            goto L_0x00d2
        L_0x0027:
            r1 = -4054(0xfffffffffffff02a, float:NaN)
            r2 = 2131099898(0x7f0600fa, float:1.7812162E38)
            r3 = 2131828597(0x7f111f75, float:1.929014E38)
            java.lang.String r4 = "tipsTv"
            r5 = 0
            r6 = 0
            if (r0 != r1) goto L_0x009a
            java.lang.String r0 = r7.f159896i
            if (r0 == 0) goto L_0x004a
            int r1 = r0.length()
            if (r1 <= 0) goto L_0x0042
            r1 = 1
            goto L_0x0043
        L_0x0042:
            r1 = 0
        L_0x0043:
            if (r1 == 0) goto L_0x0046
            goto L_0x0047
        L_0x0046:
            r0 = r6
        L_0x0047:
            if (r0 == 0) goto L_0x004a
            goto L_0x0059
        L_0x004a:
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r7.f159894g
            android.content.Context r0 = r0.getContext()
            java.lang.String r0 = r0.getString(r3)
            java.lang.String r1 = "context.getString(R.stri…on_extend_reading_failed)"
            gy3.C87412m.m108593f(r0, r1)
        L_0x0059:
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r1 = r7.f159894g
            android.widget.TextView r1 = r1.f159715i
            if (r1 == 0) goto L_0x0096
            r1.setText(r0)
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r7.f159894g
            android.widget.TextView r1 = r0.f159715i
            if (r1 == 0) goto L_0x0092
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r2)
            r1.setTextColor(r0)
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r7.f159894g
            android.widget.TextView r0 = r0.f159715i
            if (r0 == 0) goto L_0x008e
            r0.setOnClickListener(r6)
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r7.f159894g
            android.widget.TextView r0 = r0.f159715i
            if (r0 == 0) goto L_0x008a
            r0.setVisibility(r5)
            goto L_0x00d2
        L_0x008a:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x008e:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x0092:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x0096:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x009a:
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r7.f159894g
            android.widget.TextView r1 = r0.f159715i
            if (r1 == 0) goto L_0x00e1
            android.content.Context r0 = r0.getContext()
            java.lang.String r0 = r0.getString(r3)
            r1.setText(r0)
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r7.f159894g
            android.widget.TextView r1 = r0.f159715i
            if (r1 == 0) goto L_0x00dd
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r2)
            r1.setTextColor(r0)
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r7.f159894g
            android.widget.TextView r0 = r0.f159715i
            if (r0 == 0) goto L_0x00d9
            r0.setOnClickListener(r6)
            com.tencent.mm.plugin.finder.live.view.FinderLiveExtendReadingEditView r0 = r7.f159894g
            android.widget.TextView r0 = r0.f159715i
            if (r0 == 0) goto L_0x00d5
            r0.setVisibility(r5)
        L_0x00d2:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        L_0x00d5:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x00d9:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x00dd:
            gy3.C87412m.m108603p(r4)
            throw r6
        L_0x00e1:
            gy3.C87412m.m108603p(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.view.C56068i0.invoke():java.lang.Object");
    }
}
