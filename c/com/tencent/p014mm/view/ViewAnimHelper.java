package com.tencent.p014mm.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.view.ViewAnimHelper */
public class ViewAnimHelper {

    /* renamed from: com.tencent.mm.view.ViewAnimHelper$a */
    public class C75073a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ View f220868d;

        /* renamed from: e */
        public final /* synthetic */ float f220869e;

        /* renamed from: f */
        public final /* synthetic */ float f220870f;

        /* renamed from: g */
        public final /* synthetic */ float f220871g;

        /* renamed from: h */
        public final /* synthetic */ float f220872h;

        /* renamed from: i */
        public final /* synthetic */ float f220873i;

        /* renamed from: j */
        public final /* synthetic */ View f220874j;

        /* renamed from: n */
        public final /* synthetic */ ValueAnimator.AnimatorUpdateListener f220875n;

        public C75073a(View view, float f, float f2, float f3, float f4, float f5, View view2, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            this.f220868d = view;
            this.f220869e = f;
            this.f220870f = f2;
            this.f220871g = f3;
            this.f220872h = f4;
            this.f220873i = f5;
            this.f220874j = view2;
            this.f220875n = animatorUpdateListener;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            float f = 1.0f - floatValue;
            this.f220868d.setTranslationX((this.f220869e - this.f220870f) * f);
            this.f220868d.setTranslationY((this.f220871g - this.f220872h) * f);
            float f2 = (this.f220873i * f) + floatValue;
            if (f2 > 0.0f) {
                try {
                    this.f220868d.setScaleX(f2);
                    this.f220868d.setScaleY(f2);
                } catch (Throwable unused) {
                }
            }
            View view = this.f220874j;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(floatValue));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/view/ViewAnimHelper$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view2, "com/tencent/mm/view/ViewAnimHelper$1", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.f220875n;
            if (animatorUpdateListener != null) {
                animatorUpdateListener.onAnimationUpdate(valueAnimator);
            }
        }
    }

    /* renamed from: com.tencent.mm.view.ViewAnimHelper$b */
    public class C75074b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ Animator.AnimatorListener f220876d;

        public C75074b(Animator.AnimatorListener animatorListener) {
            this.f220876d = animatorListener;
        }

        public void onAnimationCancel(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f220876d;
            if (animatorListener != null) {
                animatorListener.onAnimationCancel(animator);
            }
        }

        public void onAnimationEnd(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f220876d;
            if (animatorListener != null) {
                animatorListener.onAnimationEnd(animator);
            }
        }

        public void onAnimationRepeat(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f220876d;
            if (animatorListener != null) {
                animatorListener.onAnimationRepeat(animator);
            }
        }

        public void onAnimationStart(Animator animator) {
            Animator.AnimatorListener animatorListener = this.f220876d;
            if (animatorListener != null) {
                animatorListener.onAnimationStart(animator);
            }
        }
    }

    /* renamed from: a */
    public static void m90032a(View view, View view2, ViewInfo viewInfo, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        ViewInfo b = m90033b(view, (View) null);
        float max = Math.max((((float) viewInfo.f220867d.height()) * 1.0f) / ((float) b.f220867d.height()), (((float) viewInfo.f220867d.width()) * 1.0f) / ((float) b.f220867d.width()));
        float centerY = (float) b.f220867d.centerY();
        float centerX = (float) viewInfo.f220867d.centerX();
        float centerY2 = (float) viewInfo.f220867d.centerY();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(new AccelerateInterpolator(1.2f));
        ofFloat.addUpdateListener(new C75073a(view, centerX, (float) b.f220867d.centerX(), centerY2, centerY, max, view2, animatorUpdateListener));
        ofFloat.addListener(new C75074b(animatorListener));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(240);
        ofFloat.start();
    }

    /* renamed from: b */
    public static ViewInfo m90033b(View view, View view2) {
        String str;
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        if (view2 != null) {
            view2.getGlobalVisibleRect(rect2);
        }
        view.getGlobalVisibleRect(rect);
        if (view.getWidth() <= 0 || view.getHeight() <= 0) {
            str = "getGlobalVisibleRect";
        } else {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i = iArr[0];
            rect.left = i;
            rect.top = iArr[1];
            rect.right = i + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
            str = "getLocationOnScreen";
        }
        Log.m105924i("ViewAnimHelper", str + " left=" + rect.left + " right=" + rect.right + " top=" + rect.top + " bottom=" + rect.bottom);
        if (!rect2.isEmpty() && rect.bottom - view.getHeight() < rect2.top) {
            rect.top = rect.bottom - view.getHeight();
        }
        return new ViewInfo(rect);
    }

    /* renamed from: com.tencent.mm.view.ViewAnimHelper$ViewInfo */
    public static class ViewInfo implements Parcelable {
        public static final Parcelable.Creator<ViewInfo> CREATOR = new C75072a();

        /* renamed from: d */
        public Rect f220867d;

        /* renamed from: com.tencent.mm.view.ViewAnimHelper$ViewInfo$a */
        public class C75072a implements Parcelable.Creator<ViewInfo> {
            public Object createFromParcel(Parcel parcel) {
                return new ViewInfo(parcel);
            }

            public Object[] newArray(int i) {
                return new ViewInfo[i];
            }
        }

        public ViewInfo(Rect rect) {
            Rect rect2 = new Rect();
            this.f220867d = rect2;
            rect2.set(rect);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f220867d, i);
        }

        public ViewInfo(Parcel parcel) {
            this.f220867d = new Rect();
            this.f220867d = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
        }
    }
}
