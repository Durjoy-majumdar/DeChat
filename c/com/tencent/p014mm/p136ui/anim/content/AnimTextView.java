package com.tencent.p014mm.p136ui.anim.content;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.appcompat.widget.AppCompatTextView;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010/\u001a\u00020.\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u000100¢\u0006\u0004\b2\u00103R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,¨\u00064"}, mo182094d2 = {"Lcom/tencent/mm/ui/anim/content/AnimTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "", "g", "Ljava/lang/String;", "getTText", "()Ljava/lang/String;", "setTText", "(Ljava/lang/String;)V", "tText", "", "h", "I", "getTTextColor", "()I", "setTTextColor", "(I)V", "tTextColor", "i", "getTPaddingLeft", "setTPaddingLeft", "tPaddingLeft", "j", "getTPaddingRight", "setTPaddingRight", "tPaddingRight", "n", "getTBackgroundRes", "setTBackgroundRes", "tBackgroundRes", "", "o", "Z", "getTBackgroundShow", "()Z", "setTBackgroundShow", "(Z)V", "tBackgroundShow", "", "p", "J", "getTDuration", "()J", "setTDuration", "(J)V", "tDuration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "weui-native-android-lib_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.ui.anim.content.AnimTextView */
public final class AnimTextView extends AppCompatTextView {

    /* renamed from: g */
    public String f214693g = "";

    /* renamed from: h */
    public int f214694h;

    /* renamed from: i */
    public int f214695i;

    /* renamed from: j */
    public int f214696j;

    /* renamed from: n */
    public int f214697n = -1;

    /* renamed from: o */
    public boolean f214698o;

    /* renamed from: p */
    public long f214699p;

    /* renamed from: q */
    public boolean f214700q;

    /* renamed from: com.tencent.mm.ui.anim.content.AnimTextView$a */
    public static final class C73151a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ int f214701d;

        /* renamed from: e */
        public final /* synthetic */ int f214702e;

        /* renamed from: f */
        public final /* synthetic */ AnimTextView f214703f;

        /* renamed from: g */
        public final /* synthetic */ int f214704g;

        /* renamed from: h */
        public final /* synthetic */ int f214705h;

        /* renamed from: i */
        public final /* synthetic */ int f214706i;

        /* renamed from: j */
        public final /* synthetic */ int f214707j;

        /* renamed from: n */
        public final /* synthetic */ int f214708n;

        /* renamed from: o */
        public final /* synthetic */ int f214709o;

        public C73151a(int i, int i2, AnimTextView animTextView, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f214701d = i;
            this.f214702e = i2;
            this.f214703f = animTextView;
            this.f214704g = i3;
            this.f214705h = i4;
            this.f214706i = i5;
            this.f214707j = i6;
            this.f214708n = i7;
            this.f214709o = i8;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            int i = this.f214701d;
            float f = ((float) i) + (((float) (this.f214702e - i)) * animatedFraction);
            ViewGroup.LayoutParams layoutParams = this.f214703f.getLayoutParams();
            AnimTextView animTextView = this.f214703f;
            layoutParams.width = (int) f;
            animTextView.setLayoutParams(layoutParams);
            int i2 = this.f214704g;
            float f2 = ((float) i2) + (((float) (this.f214705h - i2)) * animatedFraction);
            int i3 = this.f214706i;
            float f3 = ((float) i3) + (((float) (this.f214707j - i3)) * animatedFraction);
            int i4 = this.f214708n;
            float f4 = ((float) i4) + (((float) (this.f214709o - i4)) * animatedFraction);
            AnimTextView animTextView2 = this.f214703f;
            animTextView2.setPadding((int) f2, animTextView2.getPaddingTop(), (int) f3, this.f214703f.getPaddingBottom());
            Drawable background = this.f214703f.getBackground();
            if (background != null) {
                background.setAlpha((int) f4);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.anim.content.AnimTextView$b */
    public static final class C73152b extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final /* synthetic */ AnimTextView f214710d;

        public C73152b(AnimTextView animTextView) {
            this.f214710d = animTextView;
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            this.f214710d.f214700q = false;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
    }

    /* renamed from: a */
    public final void mo101572a(boolean z) {
        if (!C87412m.m108589b(getText().toString(), this.f214693g)) {
            int width = getWidth();
            setText(this.f214693g);
            setTextColor(this.f214694h);
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            Drawable background = getBackground();
            int alpha = background != null ? background.getAlpha() : 0;
            int i = this.f214695i;
            int i2 = this.f214696j;
            int i3 = this.f214698o ? 255 : 0;
            setPadding(i, getPaddingTop(), i2, getPaddingBottom());
            getLayoutParams().width = -2;
            setBackgroundResource(this.f214697n);
            Drawable background2 = getBackground();
            if (background2 != null) {
                background2.setAlpha(i3);
            }
            if (!z) {
                setLayoutParams(getLayoutParams());
                return;
            }
            measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = getMeasuredWidth();
            this.f214700q = true;
            ViewPropertyAnimator animate = animate();
            animate.setInterpolator(new AccelerateDecelerateInterpolator());
            animate.setDuration(this.f214699p);
            animate.setUpdateListener(new C73151a(width, measuredWidth, this, paddingLeft, i, paddingRight, i2, alpha, i3));
            animate.setListener(new C73152b(this));
            animate.start();
        }
    }

    public final int getTBackgroundRes() {
        return this.f214697n;
    }

    public final boolean getTBackgroundShow() {
        return this.f214698o;
    }

    public final long getTDuration() {
        return this.f214699p;
    }

    public final int getTPaddingLeft() {
        return this.f214695i;
    }

    public final int getTPaddingRight() {
        return this.f214696j;
    }

    public final String getTText() {
        return this.f214693g;
    }

    public final int getTTextColor() {
        return this.f214694h;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f214700q) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean performClick() {
        if (this.f214700q) {
            return true;
        }
        return super.performClick();
    }

    public final void setTBackgroundRes(int i) {
        this.f214697n = i;
    }

    public final void setTBackgroundShow(boolean z) {
        this.f214698o = z;
    }

    public final void setTDuration(long j) {
        this.f214699p = j;
    }

    public final void setTPaddingLeft(int i) {
        this.f214695i = i;
    }

    public final void setTPaddingRight(int i) {
        this.f214696j = i;
    }

    public final void setTText(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.f214693g = str;
    }

    public final void setTTextColor(int i) {
        this.f214694h = i;
    }
}
