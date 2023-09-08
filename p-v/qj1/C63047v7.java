package qj1;

import android.animation.Animator;
import qj1.C63006u7;

/* renamed from: qj1.v7 */
public final class C63047v7 implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C63006u7.C63008c f178913d;

    public C63047v7(C63006u7.C63008c cVar) {
        this.f178913d = cVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r13) {
        /*
            r12 = this;
            qj1.u7$c r13 = r12.f178913d
            r0 = 0
            r13.mo87965d(r0)
            qj1.u7$c r13 = r12.f178913d
            android.animation.ObjectAnimator r13 = r13.f178829x
            java.lang.Object r13 = r13.getTarget()
            boolean r1 = r13 instanceof android.view.View
            r2 = 0
            if (r1 == 0) goto L_0x0016
            android.view.View r13 = (android.view.View) r13
            goto L_0x0017
        L_0x0016:
            r13 = r2
        L_0x0017:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r13 != 0) goto L_0x001c
            goto L_0x005c
        L_0x001c:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Float r3 = java.lang.Float.valueOf(r1)
            r11.mo10233c(r3)
            java.lang.Object[] r4 = r11.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo$registerCntTransferAnimatorSetListener$1"
            java.lang.String r6 = "onAnimationEnd"
            java.lang.String r7 = "(Landroid/animation/Animator;)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setAlpha"
            java.lang.String r10 = "(F)V"
            r3 = r13
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r0 = r11.mo10231a(r0)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r13.setAlpha(r0)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftQueuePlugin$BulletShowingInfo$registerCntTransferAnimatorSetListener$1"
            java.lang.String r5 = "onAnimationEnd"
            java.lang.String r6 = "(Landroid/animation/Animator;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setAlpha"
            java.lang.String r9 = "(F)V"
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x005c:
            qj1.u7$c r13 = r12.f178913d
            android.animation.ObjectAnimator r13 = r13.f178827v
            java.lang.Object r13 = r13.getTarget()
            boolean r0 = r13 instanceof android.view.View
            if (r0 == 0) goto L_0x006b
            android.view.View r13 = (android.view.View) r13
            goto L_0x006c
        L_0x006b:
            r13 = r2
        L_0x006c:
            if (r13 != 0) goto L_0x006f
            goto L_0x0072
        L_0x006f:
            r13.setScaleX(r1)
        L_0x0072:
            qj1.u7$c r13 = r12.f178913d
            android.animation.ObjectAnimator r13 = r13.f178828w
            java.lang.Object r13 = r13.getTarget()
            boolean r0 = r13 instanceof android.view.View
            if (r0 == 0) goto L_0x0081
            r2 = r13
            android.view.View r2 = (android.view.View) r2
        L_0x0081:
            if (r2 != 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            r2.setScaleY(r1)
        L_0x0087:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C63047v7.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        this.f178913d.mo87965d(true);
    }
}
