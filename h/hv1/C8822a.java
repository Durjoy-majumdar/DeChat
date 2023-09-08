package hv1;

import android.view.View;
import com.tencent.p014mm.plugin.forcenotify.p058ui.view.StackLayoutManager;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: hv1.a */
public final class C8822a implements StackLayoutManager.C18806b {

    /* renamed from: a */
    public final int f28052a;

    public C8822a(int i) {
        this.f28052a = i;
    }

    /* renamed from: a */
    public void mo9655a(View view) {
        if (view != null) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(1.0f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "resetViewAnimateProperty", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator", "resetViewAnimateProperty", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0115  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9656b(android.view.View r19, int r20, int r21, float r22, android.view.View r23, android.view.View r24) {
        /*
            r18 = this;
            r8 = r19
            r9 = r22
            if (r8 != 0) goto L_0x0007
            return
        L_0x0007:
            int r10 = r20 - r21
            r11 = 0
            r12 = 1065353216(0x3f800000, float:1.0)
            if (r23 == 0) goto L_0x002f
            int r0 = r23.getMeasuredHeight()
            if (r0 == 0) goto L_0x002f
            int r0 = r19.getMeasuredHeight()
            if (r0 == 0) goto L_0x002f
            float r0 = r23.getScaleY()
            int r1 = r23.getMeasuredHeight()
            float r1 = (float) r1
            float r0 = r0 * r1
            float r0 = r0 * r12
            int r1 = r19.getMeasuredHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            r13 = r0
            goto L_0x0030
        L_0x002f:
            r13 = 0
        L_0x0030:
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r0 = k20.C60958c.f173611a
            r15 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r14.mo10233c(r0)
            java.lang.Object[] r1 = r14.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator"
            java.lang.String r3 = "doAnimate"
            java.lang.String r4 = "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            r0 = r19
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r14.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator"
            java.lang.String r2 = "doAnimate"
            java.lang.String r3 = "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r19
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            r0 = 1
            if (r10 != 0) goto L_0x0087
            float r0 = (float) r0
            r1 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            double r3 = (double) r9
            double r3 = r3 * r1
            float r1 = (float) r3
            float r0 = r0 - r1
            r13 = r0
        L_0x0083:
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00fe
        L_0x0087:
            double r1 = (double) r10
            r3 = 4606732058837280358(0x3fee666666666666, double:0.95)
            double r1 = java.lang.Math.pow(r3, r1)
            int r5 = r10 + -1
            double r5 = (double) r5
            double r3 = java.lang.Math.pow(r3, r5)
            double r3 = r3 - r1
            double r5 = (double) r9
            double r3 = r3 * r5
            double r1 = r1 + r3
            float r14 = (float) r1
            if (r10 != r0) goto L_0x00a5
            float r1 = r12 - r13
            float r1 = r1 * r9
            float r13 = r13 + r1
        L_0x00a5:
            r7 = r18
            int r1 = r7.f28052a
            if (r10 != r1) goto L_0x00fc
            int r1 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x00b0
            goto L_0x00b1
        L_0x00b0:
            r0 = 0
        L_0x00b1:
            if (r0 == 0) goto L_0x00fa
            r0 = 4
            k20.a r6 = new k20.a
            r6.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.mo10233c(r0)
            java.lang.Object[] r1 = r6.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator"
            java.lang.String r3 = "doAnimate"
            java.lang.String r4 = "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r16 = "setVisibility"
            java.lang.String r17 = "(I)V"
            r0 = r19
            r12 = r6
            r6 = r16
            r7 = r17
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r12.mo10231a(r15)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r8.setVisibility(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator"
            java.lang.String r2 = "doAnimate"
            java.lang.String r3 = "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setVisibility"
            java.lang.String r6 = "(I)V"
            r0 = r19
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
        L_0x00fa:
            r0 = r14
            goto L_0x00fe
        L_0x00fc:
            r0 = r14
            goto L_0x0083
        L_0x00fe:
            int r1 = r19.getMeasuredWidth()
            float r1 = (float) r1
            r2 = 2
            float r2 = (float) r2
            float r1 = r1 / r2
            r8.setPivotX(r1)
            r8.setPivotY(r11)
            if (r10 == 0) goto L_0x0115
            r8.setScaleX(r0)
            r8.setScaleY(r13)
            goto L_0x011d
        L_0x0115:
            r0 = 1065353216(0x3f800000, float:1.0)
            r8.setScaleX(r0)
            r8.setScaleY(r0)
        L_0x011d:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.Float r0 = java.lang.Float.valueOf(r9)
            r10.mo10233c(r0)
            java.lang.Object[] r1 = r10.mo10232b()
            java.lang.String r2 = "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator"
            java.lang.String r3 = "doAnimate"
            java.lang.String r4 = "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setAlpha"
            java.lang.String r7 = "(F)V"
            r0 = r19
            j20.C117292a.m165358d(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r0 = r10.mo10231a(r15)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r8.setAlpha(r0)
            java.lang.String r1 = "com/tencent/mm/plugin/forcenotify/ui/view/DefaultScaleAnimator"
            java.lang.String r2 = "doAnimate"
            java.lang.String r3 = "(Landroid/view/View;IIFLandroid/view/View;Landroid/view/View;)V"
            java.lang.String r4 = "android/view/View_EXEC_"
            java.lang.String r5 = "setAlpha"
            java.lang.String r6 = "(F)V"
            r0 = r19
            j20.C117292a.m165359e(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hv1.C8822a.mo9656b(android.view.View, int, int, float, android.view.View, android.view.View):void");
    }
}
