package sb2;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: sb2.a1 */
public final class C13634a1 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ int f38633d;

    /* renamed from: e */
    public final /* synthetic */ int f38634e;

    /* renamed from: f */
    public final /* synthetic */ View f38635f;

    public C13634a1(int i, int i2, View view) {
        this.f38633d = i;
        this.f38634e = i2;
        this.f38635f = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r4 = r4.findViewById(com.tencent.p014mm.C0966R.C0970id.kul);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r4) {
        /*
            r3 = this;
            float r4 = r4.getAnimatedFraction()
            int r0 = r3.f38633d
            float r1 = (float) r0
            int r2 = r3.f38634e
            int r2 = r2 - r0
            float r0 = (float) r2
            float r0 = r0 * r4
            float r1 = r1 + r0
            android.view.View r4 = r3.f38635f
            r0 = 2131315634(0x7f094bb2, float:1.8249727E38)
            r2 = 0
            if (r4 == 0) goto L_0x0021
            android.view.View r4 = r4.findViewById(r0)
            if (r4 == 0) goto L_0x0021
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            goto L_0x0022
        L_0x0021:
            r4 = r2
        L_0x0022:
            if (r4 != 0) goto L_0x0025
            goto L_0x0028
        L_0x0025:
            int r1 = (int) r1
            r4.width = r1
        L_0x0028:
            android.view.View r1 = r3.f38635f
            if (r1 == 0) goto L_0x0030
            android.view.View r2 = r1.findViewById(r0)
        L_0x0030:
            if (r2 != 0) goto L_0x0033
            goto L_0x0036
        L_0x0033:
            r2.setLayoutParams(r4)
        L_0x0036:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sb2.C13634a1.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
