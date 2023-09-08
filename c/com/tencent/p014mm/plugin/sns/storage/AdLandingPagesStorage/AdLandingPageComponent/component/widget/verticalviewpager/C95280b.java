package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.view.MotionEvent;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.b */
public class C95280b implements View.OnTouchListener {

    /* renamed from: d */
    public DummyViewPager f276535d;

    /* renamed from: e */
    public float f276536e = Float.MIN_VALUE;

    /* renamed from: f */
    public float f276537f = Float.MIN_VALUE;

    public C95280b(DummyViewPager dummyViewPager) {
        this.f276535d = dummyViewPager;
    }

    /* renamed from: a */
    public final boolean mo131824a(View view, MotionEvent motionEvent, float f) {
        SnsMethodCalculate.markStartTimeMs("fakeDragVp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
        DummyViewPager dummyViewPager = this.f276535d;
        dummyViewPager.getClass();
        SnsMethodCalculate.markStartTimeMs("isFakeDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z = dummyViewPager.f316228S;
        SnsMethodCalculate.markEndTimeMs("isFakeDragging", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        if (z) {
            float scrollX = (float) (((int) (((float) this.f276535d.getScrollX()) - f)) - this.f276535d.getBaseScrollX());
            float scrollX2 = (float) (this.f276535d.getScrollX() - this.f276535d.getBaseScrollX());
            SnsMethodCalculate.markStartTimeMs("isDiffSign", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
            boolean z2 = Math.abs(scrollX + scrollX2) < Math.abs(scrollX - scrollX2);
            SnsMethodCalculate.markEndTimeMs("isDiffSign", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
            if (z2) {
                f = (float) (this.f276535d.getScrollX() - this.f276535d.getBaseScrollX());
            }
            this.f276535d.mo151940m(f);
            this.f276535d.getScrollX();
            SnsMethodCalculate.markStartTimeMs("adjustDownMotion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
            MotionEvent obtain = MotionEvent.obtain(motionEvent);
            obtain.setAction(0);
            view.dispatchTouchEvent(obtain);
            SnsMethodCalculate.markEndTimeMs("adjustDownMotion", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
            SnsMethodCalculate.markEndTimeMs("fakeDragVp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
            return true;
        }
        SnsMethodCalculate.markEndTimeMs("fakeDragVp", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        if (r2 != 3) goto L_0x0107;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r14, android.view.MotionEvent r15) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r14)
            r0.add(r15)
            java.lang.Object[] r6 = r0.toArray()
            r0.clear()
            java.lang.String r1 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/VerticalVPOnTouchListener"
            java.lang.String r2 = "android/view/View$OnTouchListener"
            java.lang.String r3 = "onTouch"
            java.lang.String r4 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = r13
            j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = "onTouch"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.VerticalVPOnTouchListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r15.getAction()
            r15.getRawY()
            int r2 = r15.getAction()
            if (r2 == 0) goto L_0x0101
            r3 = 1
            r4 = 1
            if (r2 == r3) goto L_0x00da
            r5 = 2
            if (r2 == r5) goto L_0x003f
            r3 = 3
            if (r2 == r3) goto L_0x00da
            goto L_0x0107
        L_0x003f:
            float r2 = r13.f276537f
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0053
            float r2 = r13.f276536e
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0053
            float r2 = r15.getRawY()
            r13.f276537f = r2
            goto L_0x0107
        L_0x0053:
            float r2 = r15.getRawY()
            float r5 = r13.f276536e
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L_0x005f
            float r5 = r13.f276537f
        L_0x005f:
            float r2 = r2 - r5
            float r4 = r15.getRawY()
            r13.f276536e = r4
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager r4 = r13.f276535d
            r4.getScrollX()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager r4 = r13.f276535d
            r4.getBaseScrollX()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager r4 = r13.f276535d
            int r4 = r4.getScrollX()
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager r5 = r13.f276535d
            int r5 = r5.getBaseScrollX()
            r6 = 0
            if (r4 == r5) goto L_0x009a
            boolean r2 = r13.mo131824a(r14, r15, r2)
            if (r2 == 0) goto L_0x0107
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r7 = 0
            java.lang.String r9 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/VerticalVPOnTouchListener"
            java.lang.String r10 = "android/view/View$OnTouchListener"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r8 = r13
            j20.C117292a.m165362h(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x009a:
            float r4 = -r2
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a1
            goto L_0x00a2
        L_0x00a1:
            r3 = -1
        L_0x00a2:
            java.util.WeakHashMap<android.view.View, e3.a0> r4 = p849e3.C107207u.f320808a
            boolean r3 = r14.canScrollVertically(r3)
            if (r3 == 0) goto L_0x00ae
            r15.getY()
            goto L_0x0107
        L_0x00ae:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager r3 = r13.f276535d
            r3.mo151926f()
            r13.mo131824a(r14, r15, r2)
            java.lang.String r2 = "adjustDownMotion"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            android.view.MotionEvent r15 = android.view.MotionEvent.obtain(r15)
            r15.setAction(r6)
            r14.dispatchTouchEvent(r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r7 = 0
            java.lang.String r9 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/VerticalVPOnTouchListener"
            java.lang.String r10 = "android/view/View$OnTouchListener"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r8 = r13
            j20.C117292a.m165362h(r7, r8, r9, r10, r11, r12)
            return r6
        L_0x00da:
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager r2 = r13.f276535d
            r2.getClass()
            java.lang.String r3 = "isFakeDragging"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            boolean r2 = r2.f316228S
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            if (r2 == 0) goto L_0x00f3
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager r2 = r13.f276535d     // Catch:{ Exception -> 0x00f3 }
            r2.mo151939l()     // Catch:{ Exception -> 0x00f3 }
        L_0x00f3:
            java.lang.String r2 = "reset"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            r13.f276537f = r4
            r13.f276536e = r4
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            goto L_0x0107
        L_0x0101:
            float r2 = r15.getRawY()
            r13.f276537f = r2
        L_0x0107:
            boolean r14 = r14.onTouchEvent(r15)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.lang.String r5 = "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/widget/verticalviewpager/VerticalVPOnTouchListener"
            java.lang.String r6 = "android/view/View$OnTouchListener"
            java.lang.String r7 = "onTouch"
            java.lang.String r8 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r3 = r14
            r4 = r13
            j20.C117292a.m165362h(r3, r4, r5, r6, r7, r8)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.C95280b.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
