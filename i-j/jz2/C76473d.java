package jz2;

import android.animation.ValueAnimator;
import com.tencent.p014mm.plugin.textstatus.p112ui.LongTextView;

/* renamed from: jz2.d */
public final class C76473d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C76452b f223845d;

    /* renamed from: e */
    public final /* synthetic */ LongTextView f223846e;

    /* renamed from: f */
    public final /* synthetic */ int f223847f;

    /* renamed from: g */
    public final /* synthetic */ CharSequence f223848g;

    public C76473d(C76452b bVar, LongTextView longTextView, int i, CharSequence charSequence) {
        this.f223845d = bVar;
        this.f223846e = longTextView;
        this.f223847f = i;
        this.f223848g = charSequence;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0054, code lost:
        r12 = r12.getText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAnimationUpdate(android.animation.ValueAnimator r17) {
        /*
            r16 = this;
            r0 = r16
            float r1 = r17.getAnimatedFraction()
            double r2 = (double) r1
            r4 = 4607632778762754458(0x3ff199999999999a, double:1.1)
            double r4 = r4 * r2
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Math.min(r6, r4)
            jz2.b r4 = r0.f223845d
            int r5 = r4.f223815p0
            float r5 = (float) r5
            r4.getClass()
            jz2.b r4 = r0.f223845d
            int r4 = r4.f223815p0
            r6 = 0
            int r4 = 0 - r4
            float r4 = (float) r4
            float r4 = r4 * r1
            float r5 = r5 + r4
            com.tencent.mm.plugin.textstatus.ui.LongTextView r4 = r0.f223846e
            android.widget.TextView r4 = r4.getTvLongText()
            if (r4 == 0) goto L_0x00c6
            int r7 = r0.f223847f
            jz2.b r8 = r0.f223845d
            com.tencent.mm.plugin.textstatus.ui.LongTextView r9 = r0.f223846e
            java.lang.CharSequence r10 = r0.f223848g
            android.view.ViewGroup$LayoutParams r11 = r4.getLayoutParams()
            r11.height = r7
            android.view.ViewGroup$LayoutParams r11 = r4.getLayoutParams()
            java.lang.String r12 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            gy3.C87412m.m108592e(r11, r12)
            android.widget.RelativeLayout$LayoutParams r11 = (android.widget.RelativeLayout.LayoutParams) r11
            double r12 = r8.f223816x0
            r14 = 1
            int r15 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r15 < 0) goto L_0x008e
            android.widget.TextView r12 = r9.getTvLongText()
            if (r12 == 0) goto L_0x0062
            java.lang.CharSequence r12 = r12.getText()
            if (r12 == 0) goto L_0x0062
            boolean r12 = r12.equals(r10)
            if (r12 != 0) goto L_0x0062
            r12 = 1
            goto L_0x0063
        L_0x0062:
            r12 = 0
        L_0x0063:
            if (r12 == 0) goto L_0x007c
            android.widget.TextView r12 = r9.getTvLongText()
            if (r12 != 0) goto L_0x006c
            goto L_0x006f
        L_0x006c:
            r12.setText(r10)
        L_0x006f:
            android.widget.TextView r10 = r9.getTvLongText()
            if (r10 != 0) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            r12 = 2147483647(0x7fffffff, float:NaN)
            r10.setMaxLines(r12)
        L_0x007c:
            double r12 = r8.f223816x0
            double r2 = r2 - r12
            r10 = r7
            double r6 = (double) r14
            double r6 = r6 - r12
            double r2 = r2 / r6
            double r6 = (double) r10
            int r8 = r8.f223817y0
            int r8 = r8 - r10
            double r12 = (double) r8
            double r12 = r12 * r2
            double r6 = r6 + r12
            int r2 = (int) r6
            r11.height = r2
        L_0x008e:
            int r2 = (int) r5
            r11.bottomMargin = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0099
            r1 = 1
            goto L_0x009a
        L_0x0099:
            r1 = 0
        L_0x009a:
            if (r1 == 0) goto L_0x00b3
            r1 = -2
            r11.height = r1
            com.tencent.mm.ui.widget.pulldown.NestedBounceView r1 = r9.getNestedBounceView()
            if (r1 == 0) goto L_0x00a8
            r1.setBounce(r14)
        L_0x00a8:
            b03.s r1 = r9.getTextviewSuffixWrapper()
            if (r1 != 0) goto L_0x00af
            goto L_0x00b3
        L_0x00af:
            r2 = 0
            r1.f192761o = r2
            goto L_0x00b4
        L_0x00b3:
            r2 = 0
        L_0x00b4:
            int r1 = r4.getPaddingLeft()
            int r3 = r4.getPaddingTop()
            int r5 = r4.getPaddingRight()
            r4.setPadding(r1, r3, r5, r2)
            r4.setLayoutParams(r11)
        L_0x00c6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jz2.C76473d.onAnimationUpdate(android.animation.ValueAnimator):void");
    }
}
