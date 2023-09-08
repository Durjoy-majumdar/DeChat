package kl1;

import android.animation.Animator;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveGiftTextView;
import gy3.C87412m;
import java.util.List;
import sx3.C64175a0;

/* renamed from: kl1.u */
public final class C10345u implements Animator.AnimatorListener {

    /* renamed from: d */
    public final /* synthetic */ C10346v f31511d;

    public C10345u(C10346v vVar) {
        this.f31511d = vVar;
    }

    public void onAnimationCancel(Animator animator) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAnimationEnd(android.animation.Animator r12) {
        /*
            r11 = this;
            kl1.v r12 = r11.f31511d
            android.animation.ObjectAnimator r12 = r12.f31522k
            java.lang.Object r12 = r12.getTarget()
            boolean r0 = r12 instanceof android.view.View
            r1 = 0
            if (r0 == 0) goto L_0x0010
            android.view.View r12 = (android.view.View) r12
            goto L_0x0011
        L_0x0010:
            r12 = r1
        L_0x0011:
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r12 != 0) goto L_0x0016
            goto L_0x0058
        L_0x0016:
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveHotCommentWidget$cntTransferAnimatorSetListener$2$1"
            java.lang.String r5 = "onAnimationEnd"
            java.lang.String r6 = "(Landroid/animation/Animator;)V"
            java.lang.String r7 = "android/view/View_EXEC_"
            java.lang.String r8 = "setAlpha"
            java.lang.String r9 = "(F)V"
            r2 = r12
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            r2 = 0
            java.lang.Object r2 = r10.mo10231a(r2)
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            r12.setAlpha(r2)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/live/widget/bulletcommet/FinderLiveHotCommentWidget$cntTransferAnimatorSetListener$2$1"
            java.lang.String r4 = "onAnimationEnd"
            java.lang.String r5 = "(Landroid/animation/Animator;)V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setAlpha"
            java.lang.String r8 = "(F)V"
            r2 = r12
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0058:
            kl1.v r12 = r11.f31511d
            android.animation.ObjectAnimator r12 = r12.f31520i
            java.lang.Object r12 = r12.getTarget()
            boolean r2 = r12 instanceof android.view.View
            if (r2 == 0) goto L_0x0067
            android.view.View r12 = (android.view.View) r12
            goto L_0x0068
        L_0x0067:
            r12 = r1
        L_0x0068:
            if (r12 != 0) goto L_0x006b
            goto L_0x006e
        L_0x006b:
            r12.setScaleX(r0)
        L_0x006e:
            kl1.v r12 = r11.f31511d
            android.animation.ObjectAnimator r12 = r12.f31521j
            java.lang.Object r12 = r12.getTarget()
            boolean r2 = r12 instanceof android.view.View
            if (r2 == 0) goto L_0x007d
            r1 = r12
            android.view.View r1 = (android.view.View) r1
        L_0x007d:
            if (r1 != 0) goto L_0x0080
            goto L_0x0083
        L_0x0080:
            r1.setScaleY(r0)
        L_0x0083:
            kl1.v r12 = r11.f31511d
            kl1.C10346v.m10277b(r12)
            kl1.v r12 = r11.f31511d
            kl1.C10346v.m10276a(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kl1.C10345u.onAnimationEnd(android.animation.Animator):void");
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
        FinderLiveGiftTextView d = this.f31511d.mo10643d();
        StringBuilder sb = new StringBuilder();
        sb.append('x');
        List<Integer> list = this.f31511d.f31523l;
        C87412m.m108593f(list, "cntQueue");
        sb.append(C64175a0.m75514v(list));
        d.setText(sb.toString());
    }
}
