package com.tencent.p014mm.p136ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, mo182094d2 = {"Lcom/tencent/mm/ui/MultiTalkRoomPopupNavV2;", "Lcom/tencent/mm/ui/MultiTalkRoomPopupNav;", "", "getInitViewId", "color", "Lrx3/b0;", "setNavBackgroundColor", "resource", "setNavBackgroundResource", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNavV2 */
public final class MultiTalkRoomPopupNavV2 extends MultiTalkRoomPopupNav {

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNavV2$a */
    public static final class C73118a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f214565d;

        /* renamed from: e */
        public final /* synthetic */ LinearLayout f214566e;

        /* renamed from: f */
        public final /* synthetic */ MultiTalkRoomPopupNavV2 f214567f;

        public C73118a(int i, LinearLayout linearLayout, float f, float f2, MultiTalkRoomPopupNavV2 multiTalkRoomPopupNavV2) {
            this.f214565d = i;
            this.f214566e = linearLayout;
            this.f214567f = multiTalkRoomPopupNavV2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            ViewGroup.LayoutParams layoutParams = this.f214566e.getLayoutParams();
            LinearLayout linearLayout = this.f214566e;
            layoutParams.height = (int) (((float) this.f214565d) * animatedFraction);
            linearLayout.setLayoutParams(layoutParams);
            float f = 90.0f + (180.0f * animatedFraction);
            WeImageView weImageView = this.f214567f.f214532e;
            if (weImageView != null) {
                weImageView.setRotation(f);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNavV2$b */
    public static final class C73119b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f214568d;

        /* renamed from: e */
        public final /* synthetic */ LinearLayout f214569e;

        /* renamed from: f */
        public final /* synthetic */ MultiTalkRoomPopupNavV2 f214570f;

        public C73119b(int i, int i2, LinearLayout linearLayout, float f, float f2, MultiTalkRoomPopupNavV2 multiTalkRoomPopupNavV2) {
            this.f214568d = i;
            this.f214569e = linearLayout;
            this.f214570f = multiTalkRoomPopupNavV2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i = this.f214568d;
            float f = ((float) i) + (((float) (0 - i)) * animatedFraction);
            ViewGroup.LayoutParams layoutParams = this.f214569e.getLayoutParams();
            LinearLayout linearLayout = this.f214569e;
            layoutParams.height = (int) f;
            linearLayout.setLayoutParams(layoutParams);
            float f2 = 270.0f + (-180.0f * animatedFraction);
            WeImageView weImageView = this.f214570f.f214532e;
            if (weImageView != null) {
                weImageView.setRotation(f2);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNavV2$c */
    public static final class C73120c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ LinearLayout f214571d;

        /* renamed from: e */
        public final /* synthetic */ MultiTalkRoomPopupNavV2 f214572e;

        /* renamed from: f */
        public final /* synthetic */ ViewPropertyAnimator f214573f;

        public C73120c(LinearLayout linearLayout, MultiTalkRoomPopupNavV2 multiTalkRoomPopupNavV2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f214571d = linearLayout;
            this.f214572e = multiTalkRoomPopupNavV2;
            this.f214573f = viewPropertyAnimator;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f214571d.setVisibility(8);
            View view = this.f214572e.f214533f;
            if (view != null) {
                view.setBackgroundResource(C0966R.C0969drawable.b_w);
            }
            this.f214573f.setListener((Animator.AnimatorListener) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTalkRoomPopupNavV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.f214557a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo101467a() {
        /*
            r3 = this;
            com.tencent.mm.ui.MultiTalkRoomPopupNav$f r0 = r3.f214541q
            r1 = 0
            if (r0 == 0) goto L_0x0011
            android.widget.LinearLayout r0 = r0.f214557a
            if (r0 == 0) goto L_0x0011
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0031
            r0 = 2131299722(0x7f090d8a, float:1.8217453E38)
            android.view.View r0 = r3.findViewById(r0)
            r0.performClick()
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r3.f214532e
            if (r0 != 0) goto L_0x0023
            goto L_0x0028
        L_0x0023:
            r2 = 1119092736(0x42b40000, float:90.0)
            r0.setRotation(r2)
        L_0x0028:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r3.f214532e
            if (r0 != 0) goto L_0x002d
            goto L_0x0046
        L_0x002d:
            r0.setVisibility(r1)
            goto L_0x0046
        L_0x0031:
            super.mo101467a()
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r3.f214532e
            if (r0 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            r2 = 1132920832(0x43870000, float:270.0)
            r0.setRotation(r2)
        L_0x003e:
            com.tencent.mm.ui.widget.imageview.WeImageView r0 = r3.f214532e
            if (r0 != 0) goto L_0x0043
            goto L_0x0046
        L_0x0043:
            r0.setVisibility(r1)
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MultiTalkRoomPopupNavV2.mo101467a():void");
    }

    /* renamed from: f */
    public boolean mo101472f(int i) {
        return true;
    }

    public int getInitViewId() {
        return C0966R.C0971layout.cw4;
    }

    /* renamed from: j */
    public void mo101477j(LinearLayout linearLayout, long j) {
        if (linearLayout != null) {
            linearLayout.getLayoutParams().width = -2;
            linearLayout.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = linearLayout.getMeasuredHeight();
            View view = this.f214533f;
            if (view != null) {
                view.setBackgroundResource(C0966R.C0969drawable.b_y);
            }
            ViewPropertyAnimator animate = animate();
            animate.setInterpolator(new AccelerateDecelerateInterpolator());
            animate.setDuration(j);
            animate.setUpdateListener(new C73118a(measuredHeight, linearLayout, 90.0f, 270.0f, this));
            animate.start();
        }
    }

    /* renamed from: k */
    public void mo101478k(LinearLayout linearLayout, long j) {
        if (linearLayout != null) {
            int height = linearLayout.getHeight();
            ViewPropertyAnimator animate = animate();
            animate.setInterpolator(new AccelerateDecelerateInterpolator());
            animate.setDuration(j);
            animate.setUpdateListener(new C73119b(height, 0, linearLayout, 270.0f, 90.0f, this));
            animate.setListener(new C73120c(linearLayout, this, animate));
            animate.start();
        }
    }

    public void setNavBackgroundColor(int i) {
    }

    public void setNavBackgroundResource(int i) {
    }
}
