package p853i4;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.view.View;
import com.tencent.p014mm.C0966R;

/* renamed from: i4.q */
public class C108355q {

    /* renamed from: i4.q$a */
    public static class C76284a extends AnimatorListenerAdapter {

        /* renamed from: d */
        public final View f223471d;

        /* renamed from: e */
        public final View f223472e;

        /* renamed from: f */
        public final int f223473f;

        /* renamed from: g */
        public final int f223474g;

        /* renamed from: h */
        public int[] f223475h;

        /* renamed from: i */
        public float f223476i;

        /* renamed from: j */
        public float f223477j;

        /* renamed from: n */
        public final float f223478n;

        /* renamed from: o */
        public final float f223479o;

        public C76284a(View view, View view2, int i, int i2, float f, float f2) {
            this.f223472e = view;
            this.f223471d = view2;
            this.f223473f = i - Math.round(view.getTranslationX());
            this.f223474g = i2 - Math.round(view.getTranslationY());
            this.f223478n = f;
            this.f223479o = f2;
            int[] iArr = (int[]) view2.getTag(C0966R.C0970id.ktt);
            this.f223475h = iArr;
            if (iArr != null) {
                view2.setTag(C0966R.C0970id.ktt, (Object) null);
            }
        }

        public void onAnimationCancel(Animator animator) {
            if (this.f223475h == null) {
                this.f223475h = new int[2];
            }
            this.f223475h[0] = Math.round(((float) this.f223473f) + this.f223472e.getTranslationX());
            this.f223475h[1] = Math.round(((float) this.f223474g) + this.f223472e.getTranslationY());
            this.f223471d.setTag(C0966R.C0970id.ktt, this.f223475h);
        }

        public void onAnimationEnd(Animator animator) {
            this.f223472e.setTranslationX(this.f223478n);
            this.f223472e.setTranslationY(this.f223479o);
        }

        public void onAnimationPause(Animator animator) {
            this.f223476i = this.f223472e.getTranslationX();
            this.f223477j = this.f223472e.getTranslationY();
            this.f223472e.setTranslationX(this.f223478n);
            this.f223472e.setTranslationY(this.f223479o);
        }

        public void onAnimationResume(Animator animator) {
            this.f223472e.setTranslationX(this.f223476i);
            this.f223472e.setTranslationY(this.f223477j);
        }
    }

    /* renamed from: a */
    public static Animator m146759a(View view, C108353o oVar, int i, int i2, float f, float f2, float f3, float f4, TimeInterpolator timeInterpolator) {
        float f5;
        float f6;
        View view2 = view;
        C108353o oVar2 = oVar;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        int[] iArr = (int[]) oVar2.f324392b.getTag(C0966R.C0970id.ktt);
        if (iArr != null) {
            f5 = ((float) (iArr[0] - i)) + translationX;
            f6 = ((float) (iArr[1] - i2)) + translationY;
        } else {
            f5 = f;
            f6 = f2;
        }
        int round = i + Math.round(f5 - translationX);
        int round2 = i2 + Math.round(f6 - translationY);
        view.setTranslationX(f5);
        view.setTranslationY(f6);
        if (f5 == f3 && f6 == f4) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[]{f5, f3}), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{f6, f4})});
        C76284a aVar = new C76284a(view, oVar2.f324392b, round, round2, translationX, translationY);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.addPauseListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
