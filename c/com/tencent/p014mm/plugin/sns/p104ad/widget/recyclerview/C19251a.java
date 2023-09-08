package com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.CardLayoutManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.recyclerview.a */
public class C19251a extends CardLayoutManager.C19248d {

    /* renamed from: d */
    public final int f54245d;

    /* renamed from: e */
    public final int f54246e;

    /* renamed from: f */
    public CardLayoutManager.C19250f f54247f;

    public C19251a(int i, int i2) {
        this.f54245d = i;
        this.f54246e = i2;
    }

    /* renamed from: a */
    public void mo24724a(View view) {
        SnsMethodCalculate.markStartTimeMs("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        CardLayoutManager e = mo24728e();
        CardLayoutManager.C19250f fVar = this.f54247f;
        if (e == null || view == null || view.getTag(C0966R.C0970id.jpb) != null) {
            SnsMethodCalculate.markEndTimeMs("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || fVar == null) {
            SnsMethodCalculate.markEndTimeMs("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return;
        }
        layoutParams.width = fVar.f54243a;
        layoutParams.height = fVar.f54244b;
        view.setLayoutParams(layoutParams);
        view.setTag(C0966R.C0970id.jpb, Boolean.TRUE);
        SnsMethodCalculate.markEndTimeMs("doChildLayoutParam", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        if (r11 >= 0.5f) goto L_0x003d;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24725b(int r10, float r11, android.view.View r12, int r13, int r14) {
        /*
            r9 = this;
            java.lang.String r0 = "doLayoutAndAnimation"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r2 = r9.mo24728e()
            if (r2 == 0) goto L_0x00a2
            int r3 = r9.f54238b
            if (r3 <= 0) goto L_0x00a2
            int r3 = r9.f54237a
            if (r3 > 0) goto L_0x0017
            goto L_0x00a2
        L_0x0017:
            r3 = 0
            if (r13 != 0) goto L_0x002d
            int r4 = r9.mo24730f(r10)
            int r10 = r9.f54237a
            int r6 = r4 + r10
            int r10 = r9.f54238b
            int r7 = r10 + 0
            r5 = 0
            r3 = r12
            r2.layoutDecorated(r3, r4, r5, r6, r7)
            goto L_0x009e
        L_0x002d:
            java.lang.String r10 = "canRelayoutNotFirstView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            if (r14 == 0) goto L_0x003d
            r9.mo24727d()
            r4 = 1056964608(0x3f000000, float:0.5)
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x003e
        L_0x003d:
            r3 = 1
        L_0x003e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
            if (r3 == 0) goto L_0x009e
            java.lang.String r10 = "getAfterVisibleViewStartOffset"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            int r3 = r9.f54245d
            float r3 = (float) r3
            java.lang.String r4 = "computeOffsetFactor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r14 != 0) goto L_0x005c
            float r7 = (float) r13
            float r7 = r7 - r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L_0x0064
        L_0x005c:
            float r7 = (float) r13
            float r8 = r11 * r6
            float r7 = r7 - r8
            float r7 = r7 + r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
        L_0x0064:
            float r3 = r3 * r7
            int r7 = java.lang.Math.round(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
            java.lang.String r10 = "getAfterVisibleViewTopOffset"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r1)
            int r3 = r9.f54246e
            float r3 = (float) r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            if (r14 != 0) goto L_0x0080
            float r13 = (float) r13
            float r13 = r13 - r11
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L_0x0088
        L_0x0080:
            float r13 = (float) r13
            float r11 = r11 * r6
            float r13 = r13 - r11
            float r13 = r13 + r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
        L_0x0088:
            float r3 = r3 * r13
            int r5 = java.lang.Math.round(r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r1)
            int r10 = r9.f54237a
            int r6 = r7 + r10
            int r10 = r9.f54238b
            int r10 = r10 + r5
            r3 = r12
            r4 = r7
            r7 = r10
            r2.layoutDecorated(r3, r4, r5, r6, r7)
        L_0x009e:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L_0x00a2:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.C19251a.mo24725b(int, float, android.view.View, int, int):void");
    }

    /* renamed from: c */
    public boolean mo24726c(RecyclerView.C16625r rVar, RecyclerView.C16628w wVar, int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("doMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        CardLayoutManager e = mo24728e();
        if (e == null) {
            SnsMethodCalculate.markEndTimeMs("doMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return false;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f54247f == null) {
            this.f54247f = new CardLayoutManager.C19250f();
        }
        CardLayoutManager.C19250f fVar = this.f54247f;
        int i3 = size - (this.f54245d * 2);
        fVar.f54243a = i3;
        int i4 = (int) ((((float) i3) * 0.75f) + 0.5f);
        fVar.f54244b = i4;
        e.setMeasuredDimension(size, i4);
        SnsMethodCalculate.markEndTimeMs("doMeasure", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        return true;
    }

    /* renamed from: d */
    public float mo24727d() {
        SnsMethodCalculate.markStartTimeMs("getFixedScrollPercentExtent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        SnsMethodCalculate.markEndTimeMs("getFixedScrollPercentExtent", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        return 0.5f;
    }

    /* renamed from: f */
    public int mo24730f(int i) {
        SnsMethodCalculate.markStartTimeMs("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
        int i2 = this.f54237a;
        if (i2 == 0 || this.f54238b == 0) {
            SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return 0;
        } else if (i >= 0) {
            int i3 = (-i) % i2;
            SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return i3;
        } else if (i % i2 == 0) {
            SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return 0;
        } else {
            int i4 = ((-i) % i2) - i2;
            SnsMethodCalculate.markEndTimeMs("getFirstVisibleViewStartOffset", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper");
            return i4;
        }
    }
}
