package er2;

import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.C19251a;
import com.tencent.p014mm.plugin.sns.p104ad.widget.recyclerview.CardLayoutManager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: er2.c */
public class C20611c extends C19251a {
    public C20611c(int i, int i2) {
        super(i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x01ab  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24725b(int r18, float r19, android.view.View r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r9 = r20
            r7 = r21
            java.lang.String r10 = "doLayoutAndAnimation"
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager r1 = r17.mo24728e()
            if (r1 == 0) goto L_0x01f9
            int r2 = r0.f54238b
            if (r2 <= 0) goto L_0x01f9
            int r2 = r0.f54237a
            if (r2 > 0) goto L_0x001d
            goto L_0x01f9
        L_0x001d:
            r8 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            if (r7 != 0) goto L_0x007f
            int r3 = r17.mo24730f(r18)
            int r2 = r0.f54237a
            int r5 = r3 + r2
            int r2 = r0.f54238b
            int r6 = r2 + 0
            r4 = 0
            r2 = r20
            r1.layoutDecorated(r2, r3, r4, r5, r6)
            r9.setScaleX(r8)
            r9.setScaleY(r8)
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            r13.mo10233c(r1)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper"
            java.lang.String r4 = "doLayoutAndAnimation"
            java.lang.String r5 = "(IFLandroid/view/View;II)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r20
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r13.mo10231a(r12)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r9.setAlpha(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper"
            java.lang.String r3 = "doLayoutAndAnimation"
            java.lang.String r4 = "(IFLandroid/view/View;II)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r1 = r20
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01f5
        L_0x007f:
            java.lang.String r2 = "canRelayoutNotFirstView"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r11)
            r13 = 1056964608(0x3f000000, float:0.5)
            if (r22 == 0) goto L_0x0092
            r17.mo24727d()
            int r3 = (r19 > r13 ? 1 : (r19 == r13 ? 0 : -1))
            if (r3 < 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            r3 = 0
            goto L_0x0093
        L_0x0092:
            r3 = 1
        L_0x0093:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r11)
            if (r3 == 0) goto L_0x01ab
            java.lang.String r2 = "getAfterVisibleViewTopOffset"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ad.widget.recyclerview.DefaultCardLayoutHelper"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            int r4 = r0.f54246e
            float r4 = (float) r4
            java.lang.String r5 = "computeOffsetFactor"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r22 != 0) goto L_0x00b2
            float r14 = (float) r7
            float r14 = r14 - r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L_0x00ba
        L_0x00b2:
            float r14 = (float) r7
            float r15 = r19 * r6
            float r14 = r14 - r15
            float r14 = r14 + r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L_0x00ba:
            float r4 = r4 * r14
            int r4 = java.lang.Math.round(r4)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            int r2 = r0.f54238b
            int r4 = r4 * 2
            int r4 = r2 - r4
            float r4 = (float) r4
            float r2 = (float) r2
            float r4 = r4 / r2
            r9.setScaleX(r4)
            r9.setScaleY(r4)
            java.lang.String r2 = "getAfterVisibleViewStartOffset"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            int r14 = r0.f54245d
            float r14 = (float) r14
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r3)
            if (r22 != 0) goto L_0x00e6
            float r15 = (float) r7
            float r15 = r15 - r19
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
            goto L_0x00ef
        L_0x00e6:
            float r15 = (float) r7
            float r16 = r19 * r6
            float r15 = r15 - r16
            float r15 = r15 + r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r3)
        L_0x00ef:
            float r14 = r14 * r15
            int r5 = java.lang.Math.round(r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
            int r2 = r0.f54237a
            float r3 = (float) r2
            float r4 = r8 - r4
            float r3 = r3 * r4
            float r3 = r3 / r6
            int r3 = (int) r3
            int r3 = r3 + r5
            int r5 = r3 + r2
            int r2 = r0.f54238b
            int r6 = r2 + 0
            r4 = 0
            r2 = r20
            r1.layoutDecorated(r2, r3, r4, r5, r6)
            boolean r1 = r0.mo32272g(r7)
            if (r1 == 0) goto L_0x0167
            java.lang.String r1 = "getCurrentAlpha"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r1, r11)
            r17.mo24727d()
            float r2 = r19 - r13
            float r2 = r2 / r13
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r1, r11)
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Float r1 = java.lang.Float.valueOf(r2)
            r13.mo10233c(r1)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper"
            java.lang.String r4 = "doLayoutAndAnimation"
            java.lang.String r5 = "(IFLandroid/view/View;II)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r20
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r13.mo10231a(r12)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r9.setAlpha(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper"
            java.lang.String r3 = "doLayoutAndAnimation"
            java.lang.String r4 = "(IFLandroid/view/View;II)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r1 = r20
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01f5
        L_0x0167:
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            r13.mo10233c(r1)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper"
            java.lang.String r4 = "doLayoutAndAnimation"
            java.lang.String r5 = "(IFLandroid/view/View;II)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r20
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r13.mo10231a(r12)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r9.setAlpha(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper"
            java.lang.String r3 = "doLayoutAndAnimation"
            java.lang.String r4 = "(IFLandroid/view/View;II)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r1 = r20
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01f5
        L_0x01ab:
            boolean r1 = r0.mo32272g(r7)
            if (r1 == 0) goto L_0x01f5
            r1 = 0
            k20.a r13 = new k20.a
            r13.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r13.mo10233c(r1)
            java.lang.Object[] r2 = r13.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper"
            java.lang.String r4 = "doLayoutAndAnimation"
            java.lang.String r5 = "(IFLandroid/view/View;II)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r1 = r20
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r13.mo10231a(r12)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            r9.setAlpha(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ad/widget/recyclerview/ScaleCardLayoutHelper"
            java.lang.String r3 = "doLayoutAndAnimation"
            java.lang.String r4 = "(IFLandroid/view/View;II)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r1 = r20
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x01f5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        L_0x01f9:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: er2.C20611c.mo24725b(int, float, android.view.View, int, int):void");
    }

    /* renamed from: g */
    public final boolean mo32272g(int i) {
        SnsMethodCalculate.markStartTimeMs("isLastVisibleView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        CardLayoutManager e = mo24728e();
        boolean z = false;
        if (e == null) {
            SnsMethodCalculate.markEndTimeMs("isLastVisibleView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
            return false;
        }
        int x = e.mo24715x();
        SnsMethodCalculate.markStartTimeMs("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        int x2 = e.mo24715x() + e.f54218g;
        SnsMethodCalculate.markEndTimeMs("getLastVisibleViewVirtualPosition", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (x + i == x2) {
            z = true;
        }
        SnsMethodCalculate.markEndTimeMs("isLastVisibleView", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.ScaleCardLayoutHelper");
        return z;
    }
}
