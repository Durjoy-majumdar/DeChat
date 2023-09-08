package com.tencent.p014mm.plugin.sns.p106ui;

import android.view.View;

/* renamed from: com.tencent.mm.plugin.sns.ui.j5 */
public class C95972j5 implements View.OnTouchListener {

    /* renamed from: d */
    public final /* synthetic */ SnsOnlineVideoActivity f280242d;

    public C95972j5(SnsOnlineVideoActivity snsOnlineVideoActivity) {
        this.f280242d = snsOnlineVideoActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0155, code lost:
        if (r0 != false) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0186, code lost:
        if (r10 >= r0) goto L_0x0188;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0188, code lost:
        if (r2 < 0) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x018f, code lost:
        if (((double) r10) < 0.5d) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0191, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.SnsOnlineVideoActivity", "dancy scale:%s", java.lang.Float.valueOf(r10));
        r0 = r6.f280242d;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        r0.f278392W = r10;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1402", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r6.f280242d).setPivotX((float) (com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122193H7(r6.f280242d).getWidth() / 2));
        com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r6.f280242d).setPivotY((float) (com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122193H7(r6.f280242d).getHeight() / 2));
        com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r6.f280242d).setScaleX(r10);
        com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r6.f280242d).setScaleY(r10);
        com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r6.f280242d).setTranslationY(r7);
        r0 = r6.f280242d;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        r0 = r0.f278407q;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        r0.setAlpha(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x01fd, code lost:
        r0 = r6.f280242d;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        r0.f278389T = true;
        com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity");
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
        /*
            r19 = this;
            r6 = r19
            r7 = r21
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r20
            r0.add(r1)
            r0.add(r7)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$4"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r4 = r19
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            java.lang.String r0 = "onTouch"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity$4"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            int r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.f278370y0
            java.lang.String r3 = "access$700"
            java.lang.String r4 = "com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            android.view.GestureDetector r2 = r2.f278395Z
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r7)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$4"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/GestureDetector_EXEC_"
            java.lang.String r14 = "onTouchEvent"
            java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            android.view.MotionEvent r3 = (android.view.MotionEvent) r3
            boolean r9 = r2.onTouchEvent(r3)
            java.lang.String r10 = "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$4"
            java.lang.String r11 = "onTouch"
            java.lang.String r12 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.lang.String r13 = "android/view/GestureDetector_EXEC_"
            java.lang.String r14 = "onTouchEvent"
            java.lang.String r15 = "(Landroid/view/MotionEvent;)Z"
            j20.C117292a.m165360f(r8, r9, r10, r11, r12, r13, r14, r15)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.view.VelocityTracker r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122201P7(r2)
            java.lang.String r3 = "access$802"
            if (r2 != 0) goto L_0x0090
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.view.VelocityTracker r8 = android.view.VelocityTracker.obtain()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r2.f278406p0 = r8
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x0090:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.view.VelocityTracker r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122201P7(r2)
            if (r2 == 0) goto L_0x00a1
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.view.VelocityTracker r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122201P7(r2)
            r2.addMovement(r7)
        L_0x00a1:
            int r2 = r21.getAction()
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r8 = "access$1100"
            java.lang.String r9 = "access$1102"
            if (r2 == 0) goto L_0x0359
            r7 = 2
            r11 = 1
            java.lang.String r12 = "access$500"
            java.lang.String r13 = "access$1402"
            java.lang.String r14 = "access$1300"
            java.lang.String r15 = "access$302"
            if (r2 == r11) goto L_0x0284
            if (r2 == r7) goto L_0x00bd
            goto L_0x03a5
        L_0x00bd:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.view.VelocityTracker r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122201P7(r2)
            r8 = 1000(0x3e8, float:1.401E-42)
            r2.computeCurrentVelocity(r8)
            float r8 = r2.getXVelocity()
            int r8 = (int) r8
            float r2 = r2.getYVelocity()
            int r2 = (int) r2
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r10 = r6.f280242d
            android.widget.FrameLayout r10 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r10)
            float r10 = r10.getTranslationX()
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r7 = r6.f280242d
            android.widget.FrameLayout r7 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r7)
            float r7 = r7.getTranslationY()
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r11 = r6.f280242d
            int r5 = (int) r10
            r16 = r0
            java.lang.String r0 = "access$1502"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r4)
            r11.f278393X = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r4)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            int r5 = (int) r7
            java.lang.String r11 = "access$1602"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r11, r4)
            r0.f278394Y = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r11, r4)
            r0 = 5
            java.lang.Object[] r0 = new java.lang.Object[r0]
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r5 = r6.f280242d
            boolean r5 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122198M7(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r11 = 0
            r0[r11] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r10)
            r11 = 1
            r0[r11] = r5
            java.lang.Float r5 = java.lang.Float.valueOf(r7)
            r11 = 2
            r0[r11] = r5
            r5 = 3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r0[r5] = r11
            r5 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            r0[r5] = r11
            java.lang.String r5 = "MicroMsg.SnsOnlineVideoActivity"
            java.lang.String r11 = "dancy scaled:%s, tx:%s, ty:%s, vx:%s, vy:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r11, r0)
            float r0 = java.lang.Math.abs(r10)
            r10 = 1132068864(0x437a0000, float:250.0)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0157
            int r0 = java.lang.Math.abs(r2)
            int r8 = java.lang.Math.abs(r8)
            if (r0 <= r8) goto L_0x0157
            if (r2 <= 0) goto L_0x0157
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r4)
            boolean r0 = r0.f278391V
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
            if (r0 == 0) goto L_0x015f
        L_0x0157:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            boolean r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122198M7(r0)
            if (r0 == 0) goto L_0x020a
        L_0x015f:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            android.widget.RelativeLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122193H7(r0)
            int r0 = r0.getHeight()
            float r0 = (float) r0
            float r0 = r7 / r0
            r8 = 1065353216(0x3f800000, float:1.0)
            float r10 = r8 - r0
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0176
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x0176:
            if (r2 <= 0) goto L_0x0188
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            java.lang.String r8 = "access$1400"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r4)
            float r0 = r0.f278392W
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x018a
        L_0x0188:
            if (r2 >= 0) goto L_0x01fd
        L_0x018a:
            double r11 = (double) r10
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x01fd
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Float r0 = java.lang.Float.valueOf(r10)
            r8 = 0
            r2[r8] = r0
            java.lang.String r0 = "dancy scale:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r5, r0, r2)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
            r0.f278392W = r10
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            android.widget.FrameLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r0)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.widget.RelativeLayout r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122193H7(r2)
            int r2 = r2.getWidth()
            r5 = 2
            int r2 = r2 / r5
            float r2 = (float) r2
            r0.setPivotX(r2)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            android.widget.FrameLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r0)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.widget.RelativeLayout r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122193H7(r2)
            int r2 = r2.getHeight()
            int r2 = r2 / r5
            float r2 = (float) r2
            r0.setPivotY(r2)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            android.widget.FrameLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r0)
            r0.setScaleX(r10)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            android.widget.FrameLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r0)
            r0.setScaleY(r10)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            android.widget.FrameLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r0)
            r0.setTranslationY(r7)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r4)
            android.widget.ImageView r0 = r0.f278407q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
            r0.setAlpha(r10)
        L_0x01fd:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r4)
            r2 = 1
            r0.f278389T = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r4)
            r2 = 0
            goto L_0x0215
        L_0x020a:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r4)
            r2 = 0
            r0.f278389T = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r4)
        L_0x0215:
            r0 = 1128792064(0x43480000, float:200.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0226
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
            r0.f278390U = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x0237
        L_0x0226:
            r0 = 1092616192(0x41200000, float:10.0)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0237
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
            r2 = 1
            r0.f278390U = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
        L_0x0237:
            r0 = 1112014848(0x42480000, float:50.0)
            r2 = 0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0247
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            android.widget.FrameLayout r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r0)
            r0.setOnLongClickListener(r2)
        L_0x0247:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            android.view.VelocityTracker r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122201P7(r0)
            if (r0 == 0) goto L_0x0262
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            android.view.VelocityTracker r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122201P7(r0)
            r0.recycle()
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r0.f278406p0 = r2
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x0262:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r0 = r6.f280242d
            boolean r0 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122198M7(r0)
            if (r0 == 0) goto L_0x0280
            r0 = r16
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$4"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r19
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
        L_0x027e:
            r0 = 1
            return r0
        L_0x0280:
            r0 = r16
            goto L_0x03a4
        L_0x0284:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r4)
            boolean r2 = r2.f278390U
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)
            if (r2 == 0) goto L_0x031f
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.widget.FrameLayout r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r2)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r3 = r6.f280242d
            android.widget.RelativeLayout r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122193H7(r3)
            int r3 = r3.getWidth()
            r5 = 2
            int r3 = r3 / r5
            float r3 = (float) r3
            r2.setPivotX(r3)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.widget.FrameLayout r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r2)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r3 = r6.f280242d
            android.widget.RelativeLayout r3 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122193H7(r3)
            int r3 = r3.getHeight()
            int r3 = r3 / r5
            float r3 = (float) r3
            r2.setPivotY(r3)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.widget.FrameLayout r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setScaleX(r3)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.widget.FrameLayout r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r2)
            r2.setScaleY(r3)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.widget.FrameLayout r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r2)
            r3 = 0
            r2.setTranslationX(r3)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            android.widget.FrameLayout r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122199N7(r2)
            r2.setTranslationY(r3)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r14, r4)
            android.widget.ImageView r2 = r2.f278407q
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r14, r4)
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.setAlpha(r3)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r4)
            r2.f278392W = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r4)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r15, r4)
            r3 = 0
            r2.f278389T = r3
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r15, r4)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122200O7(r2, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$4"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r19
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            goto L_0x027e
        L_0x031f:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            boolean r2 = com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122198M7(r2)
            if (r2 == 0) goto L_0x0352
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r12, r4)
            boolean r2 = r2.f278391V
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r12, r4)
            if (r2 != 0) goto L_0x0352
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            r2.mo132875W7()
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            r3 = 0
            com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122200O7(r2, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r0 = 1
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$4"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r5 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r19
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            goto L_0x027e
        L_0x0352:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            r3 = 0
            com.tencent.p014mm.plugin.sns.p106ui.SnsOnlineVideoActivity.m122200O7(r2, r3)
            goto L_0x03a4
        L_0x0359:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            r21.getX()
            java.lang.String r3 = "access$902"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r2.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            r21.getY()
            java.lang.String r3 = "access$1002"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r2.getClass()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r4)
            boolean r2 = r2.f278390U
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r4)
            if (r2 == 0) goto L_0x03a4
            boolean r2 = com.tencent.p014mm.plugin.sns.model.C94847c1.m120216d()
            if (r2 != 0) goto L_0x0398
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            java.lang.String r3 = "access$1200"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r4)
            r2.mo132874V7()
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r4)
        L_0x0398:
            com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity r2 = r6.f280242d
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r9, r4)
            r5 = 0
            r2.f278390U = r5
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r9, r4)
            goto L_0x03a5
        L_0x03a4:
            r5 = 0
        L_0x03a5:
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            r0 = 0
            java.lang.String r2 = "com/tencent/mm/plugin/sns/ui/SnsOnlineVideoActivity$4"
            java.lang.String r3 = "android/view/View$OnTouchListener"
            java.lang.String r4 = "onTouch"
            java.lang.String r7 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r1 = r19
            r8 = 0
            r5 = r7
            j20.C117292a.m165362h(r0, r1, r2, r3, r4, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.p106ui.C95972j5.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
