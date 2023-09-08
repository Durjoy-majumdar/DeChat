package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import de3.C75360c0;
import go3.C76003c;

/* renamed from: com.tencent.mm.plugin.sns.ui.l1 */
public class C71253l1 implements View.OnTouchListener {

    /* renamed from: d */
    public static C75360c0 f206196d;

    /* renamed from: e */
    public static C76003c f206197e;

    /* renamed from: f */
    public static TextView f206198f;

    /* renamed from: a */
    public static void m83680a() {
        SnsMethodCalculate.markStartTimeMs("removeActionDown", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        C75360c0 c0Var = f206196d;
        if (c0Var != null) {
            c0Var.setIsPressed(false);
            f206198f.invalidate();
            f206198f = null;
            f206196d = null;
        }
        C76003c cVar = f206197e;
        if (cVar != null) {
            cVar.getClass();
            f206198f.invalidate();
            f206198f = null;
            f206197e = null;
        }
        SnsMethodCalculate.markEndTimeMs("removeActionDown", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
    }

    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r18, android.view.MotionEvent r19) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r7)
            r8 = r19
            r0.add(r8)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/MMOnTouchListener"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r17
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "onTouch"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.MMOnTouchListener"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = r7
            android.widget.TextView r2 = (android.widget.TextView) r2
            r2.getTag()
            java.lang.CharSequence r3 = r2.getText()
            android.text.Layout r4 = r2.getLayout()
            if (r4 != 0) goto L_0x0049
            boolean r5 = r2 instanceof com.tencent.p014mm.kiss.widget.textview.SysTextView
            if (r5 == 0) goto L_0x0049
            r4 = r2
            com.tencent.mm.kiss.widget.textview.SysTextView r4 = (com.tencent.p014mm.kiss.widget.textview.SysTextView) r4
            android.text.Layout r4 = r4.getTvLayout()
        L_0x0049:
            boolean r5 = r3 instanceof android.text.Spannable
            r7 = 0
            if (r5 == 0) goto L_0x01f6
            if (r4 == 0) goto L_0x01f6
            android.text.Spannable r3 = (android.text.Spannable) r3
            java.lang.String r4 = "onTouchEvent"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r1)
            int r5 = r19.getAction()
            android.text.Layout r9 = r2.getLayout()
            if (r9 != 0) goto L_0x006d
            boolean r10 = r2 instanceof com.tencent.p014mm.kiss.widget.textview.SysTextView
            if (r10 == 0) goto L_0x006d
            r9 = r2
            com.tencent.mm.kiss.widget.textview.SysTextView r9 = (com.tencent.p014mm.kiss.widget.textview.SysTextView) r9
            android.text.Layout r9 = r9.getTvLayout()
        L_0x006d:
            r2.invalidate()
            r10 = 1
            if (r3 == 0) goto L_0x007e
            boolean r11 = de3.C45334i.m50245a(r2, r3)
            if (r11 == 0) goto L_0x007e
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L_0x01e3
        L_0x007e:
            r11 = 2
            if (r5 == r10) goto L_0x0085
            if (r5 == 0) goto L_0x0085
            if (r5 != r11) goto L_0x01d5
        L_0x0085:
            float r5 = r19.getX()
            int r5 = (int) r5
            float r12 = r19.getY()
            int r12 = (int) r12
            boolean r13 = r2 instanceof com.tencent.p014mm.kiss.widget.textview.PLSysTextView
            if (r13 == 0) goto L_0x00c4
            r14 = r2
            com.tencent.mm.kiss.widget.textview.PLSysTextView r14 = (com.tencent.p014mm.kiss.widget.textview.PLSysTextView) r14
            int r15 = r14.getHorizontalDrawOffset()
            if (r5 < r15) goto L_0x00bf
            int r15 = r9.getWidth()
            int r16 = r14.getHorizontalDrawOffset()
            int r15 = r15 + r16
            if (r5 <= r15) goto L_0x00a9
            goto L_0x00bf
        L_0x00a9:
            int r15 = r14.getVerticalDrawOffset()
            if (r12 < r15) goto L_0x00ba
            int r15 = r9.getHeight()
            int r14 = r14.getVerticalDrawOffset()
            int r15 = r15 + r14
            if (r12 <= r15) goto L_0x00ea
        L_0x00ba:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L_0x01e3
        L_0x00bf:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L_0x01e3
        L_0x00c4:
            int r14 = r2.getTotalPaddingLeft()
            if (r5 < r14) goto L_0x01e0
            int r14 = r9.getWidth()
            int r15 = r2.getTotalPaddingLeft()
            int r14 = r14 + r15
            if (r5 <= r14) goto L_0x00d7
            goto L_0x01e0
        L_0x00d7:
            int r14 = r2.getTotalPaddingTop()
            if (r12 < r14) goto L_0x01dc
            int r14 = r9.getHeight()
            int r15 = r2.getTotalPaddingTop()
            int r14 = r14 + r15
            if (r12 <= r14) goto L_0x00ea
            goto L_0x01dc
        L_0x00ea:
            if (r13 == 0) goto L_0x00f9
            r13 = r2
            com.tencent.mm.kiss.widget.textview.PLSysTextView r13 = (com.tencent.p014mm.kiss.widget.textview.PLSysTextView) r13
            int r14 = r13.getHorizontalDrawOffset()
            int r5 = r5 - r14
            int r13 = r13.getVerticalDrawOffset()
            goto L_0x0102
        L_0x00f9:
            int r13 = r2.getTotalPaddingLeft()
            int r5 = r5 - r13
            int r13 = r2.getTotalPaddingTop()
        L_0x0102:
            int r12 = r12 - r13
            int r13 = r2.getScrollX()
            int r5 = r5 + r13
            int r13 = r2.getScrollY()
            int r12 = r12 + r13
            int r12 = r9.getLineForVertical(r12)
            float r5 = (float) r5
            int r5 = r9.getOffsetForHorizontal(r12, r5)
            java.lang.String r9 = "processSnsClick"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r1)
            int r8 = r19.getAction()
            java.lang.Class<de3.c0> r12 = de3.C75360c0.class
            java.lang.Object[] r12 = r3.getSpans(r5, r5, r12)
            de3.c0[] r12 = (de3.C75360c0[]) r12
            java.lang.Class<go3.c> r13 = go3.C76003c.class
            java.lang.Object[] r3 = r3.getSpans(r5, r5, r13)
            go3.c[] r3 = (go3.C76003c[]) r3
            java.lang.Object[] r5 = new java.lang.Object[r11]
            int r13 = r12.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r5[r7] = r13
            int r13 = r3.length
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r5[r10] = r13
            java.lang.String r13 = "MicroMsg.MMOnTouchListener"
            java.lang.String r14 = " action span Len: %d icon span Len: %d"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r13, r14, r5)
            android.text.Layout r5 = r2.getLayout()
            if (r5 != 0) goto L_0x0157
            boolean r5 = r2 instanceof com.tencent.p014mm.kiss.widget.textview.SysTextView
            if (r5 == 0) goto L_0x0157
            r5 = r2
            com.tencent.mm.kiss.widget.textview.SysTextView r5 = (com.tencent.p014mm.kiss.widget.textview.SysTextView) r5
            r5.getTvLayout()
        L_0x0157:
            int r5 = r12.length
            r13 = 3
            r14 = 300(0x12c, double:1.48E-321)
            if (r5 == 0) goto L_0x0190
            int r3 = r12.length
            int r3 = r3 - r10
            if (r8 != r10) goto L_0x0177
            r3 = r12[r3]
            r3.onClick(r2)
            com.tencent.mm.sdk.platformtools.MMHandler r2 = new com.tencent.mm.sdk.platformtools.MMHandler
            r2.<init>()
            com.tencent.mm.plugin.sns.ui.j1 r3 = new com.tencent.mm.plugin.sns.ui.j1
            r3.<init>(r6)
            r2.postDelayed(r3, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            goto L_0x01c5
        L_0x0177:
            if (r8 == 0) goto L_0x017d
            if (r8 == r11) goto L_0x017d
            if (r8 != r13) goto L_0x01ca
        L_0x017d:
            m83680a()
            r3 = r12[r3]
            f206196d = r3
            f206198f = r2
            r3.setIsPressed(r10)
            r2.invalidate()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            goto L_0x01c5
        L_0x0190:
            int r5 = r3.length
            if (r5 == 0) goto L_0x01c7
            int r5 = r3.length
            int r5 = r5 - r10
            if (r8 != r10) goto L_0x01ad
            r3 = r3[r5]
            r3.onClick(r2)
            com.tencent.mm.sdk.platformtools.MMHandler r2 = new com.tencent.mm.sdk.platformtools.MMHandler
            r2.<init>()
            com.tencent.mm.plugin.sns.ui.k1 r3 = new com.tencent.mm.plugin.sns.ui.k1
            r3.<init>(r6)
            r2.postDelayed(r3, r14)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            goto L_0x01c5
        L_0x01ad:
            if (r8 == 0) goto L_0x01b3
            if (r8 == r11) goto L_0x01b3
            if (r8 != r13) goto L_0x01ca
        L_0x01b3:
            m83680a()
            r3 = r3[r5]
            f206197e = r3
            f206198f = r2
            r3.getClass()
            r2.invalidate()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
        L_0x01c5:
            r2 = 1
            goto L_0x01ce
        L_0x01c7:
            m83680a()
        L_0x01ca:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r1)
            r2 = 0
        L_0x01ce:
            if (r2 == 0) goto L_0x01d5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            r7 = 1
            goto L_0x01e3
        L_0x01d5:
            m83680a()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L_0x01e3
        L_0x01dc:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
            goto L_0x01e3
        L_0x01e0:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r1)
        L_0x01e3:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/MMOnTouchListener"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r0 = r7
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r7
        L_0x01f6:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/MMOnTouchListener"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r17
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C71253l1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
