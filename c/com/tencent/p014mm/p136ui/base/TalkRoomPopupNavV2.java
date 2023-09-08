package com.tencent.p014mm.p136ui.base;

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

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/ui/base/TalkRoomPopupNavV2;", "Lcom/tencent/mm/ui/base/TalkRoomPopupNav;", "", "getInitViewLayout", "", "rotation", "Lrx3/b0;", "setArrowRotation", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNavV2 */
public final class TalkRoomPopupNavV2 extends TalkRoomPopupNav {

    /* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNavV2$a */
    public static final class C73221a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f215006d;

        /* renamed from: e */
        public final /* synthetic */ TalkRoomPopupNavV2 f215007e;

        public C73221a(int i, TalkRoomPopupNavV2 talkRoomPopupNavV2, float f, float f2) {
            this.f215006d = i;
            this.f215007e = talkRoomPopupNavV2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            ViewGroup.LayoutParams layoutParams = this.f215007e.f214986g.getLayoutParams();
            TalkRoomPopupNavV2 talkRoomPopupNavV2 = this.f215007e;
            layoutParams.height = (int) (((float) this.f215006d) * animatedFraction);
            talkRoomPopupNavV2.f214986g.setLayoutParams(layoutParams);
            float f = 90.0f + (180.0f * animatedFraction);
            WeImageView weImageView = this.f215007e.f214996t;
            if (weImageView != null) {
                weImageView.setRotation(f);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNavV2$b */
    public static final class C73222b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f215008d;

        /* renamed from: e */
        public final /* synthetic */ TalkRoomPopupNavV2 f215009e;

        public C73222b(int i, int i2, TalkRoomPopupNavV2 talkRoomPopupNavV2, float f, float f2) {
            this.f215008d = i;
            this.f215009e = talkRoomPopupNavV2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i = this.f215008d;
            float f = ((float) i) + (((float) (0 - i)) * animatedFraction);
            ViewGroup.LayoutParams layoutParams = this.f215009e.f214986g.getLayoutParams();
            TalkRoomPopupNavV2 talkRoomPopupNavV2 = this.f215009e;
            layoutParams.height = (int) f;
            talkRoomPopupNavV2.f214986g.setLayoutParams(layoutParams);
            float f2 = 270.0f + (-180.0f * animatedFraction);
            WeImageView weImageView = this.f215009e.f214996t;
            if (weImageView != null) {
                weImageView.setRotation(f2);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.base.TalkRoomPopupNavV2$c */
    public static final class C73223c extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ TalkRoomPopupNavV2 f215010d;

        /* renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f215011e;

        public C73223c(TalkRoomPopupNavV2 talkRoomPopupNavV2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f215010d = talkRoomPopupNavV2;
            this.f215011e = viewPropertyAnimator;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f215010d.f214986g.setVisibility(8);
            LinearLayout linearLayout = this.f215010d.f214985f;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(C0966R.C0969drawable.b_w);
            }
            this.f215011e.setListener((Animator.AnimatorListener) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TalkRoomPopupNavV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: f */
    public void mo101883f(long j) {
        this.f214986g.getLayoutParams().width = -2;
        this.f214986g.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = this.f214986g.getMeasuredHeight();
        LinearLayout linearLayout = this.f214985f;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(C0966R.C0969drawable.b_y);
        }
        ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new AccelerateDecelerateInterpolator());
        animate.setDuration(j);
        animate.setUpdateListener(new C73221a(measuredHeight, this, 90.0f, 270.0f));
        animate.start();
    }

    /* renamed from: g */
    public void mo101884g(long j) {
        int height = this.f214986g.getHeight();
        ViewPropertyAnimator animate = animate();
        animate.setInterpolator(new AccelerateDecelerateInterpolator());
        animate.setDuration(j);
        animate.setUpdateListener(new C73222b(height, 0, this, 270.0f, 90.0f));
        animate.setListener(new C73223c(this, animate));
        animate.start();
    }

    public int getInitViewLayout() {
        return C0966R.C0971layout.cwi;
    }

    /* renamed from: h */
    public void mo101888h() {
    }

    public final void setArrowRotation(float f) {
        WeImageView weImageView = this.f214996t;
        if (weImageView != null) {
            weImageView.setRotation(f);
        }
    }
}
