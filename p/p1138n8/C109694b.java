package p1138n8;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.C104453c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.VisibilityAwareImageButton;
import java.util.ArrayList;
import p1139o8.C109965a;
import p1139o8.C109968b;
import p1148r8.C110504a;
import p1153s8.C110775a;
import p1153s8.C110776b;
import p1162x2.C112019a;

/* renamed from: n8.b */
public class C109694b extends C104453c {

    /* renamed from: n8.b$a */
    public static class C109695a extends GradientDrawable {
        public boolean isStateful() {
            return true;
        }
    }

    public C109694b(VisibilityAwareImageButton visibilityAwareImageButton, C110776b bVar) {
        super(visibilityAwareImageButton, bVar);
    }

    /* renamed from: e */
    public float mo146781e() {
        return this.f309419s.getElevation();
    }

    /* renamed from: f */
    public void mo146782f(Rect rect) {
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        if (floatingActionButton.f309380r) {
            floatingActionButton.getSizeDimension();
            float e = mo146781e() + this.f309414n;
            int i = C110775a.f331374f;
            int ceil = (int) Math.ceil((double) e);
            int ceil2 = (int) Math.ceil((double) (e * 1.5f));
            rect.set(ceil, ceil2, ceil, ceil2);
            return;
        }
        rect.set(0, 0, 0, 0);
    }

    /* renamed from: g */
    public void mo146783g() {
    }

    /* renamed from: h */
    public C109965a mo146784h() {
        return new C109968b();
    }

    /* renamed from: i */
    public void mo146785i() {
        mo146791o();
    }

    /* renamed from: j */
    public void mo146786j(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.f309419s.isEnabled()) {
            this.f309419s.setElevation(this.f309412l);
            if (this.f309419s.isPressed()) {
                this.f309419s.setTranslationZ(this.f309414n);
            } else if (this.f309419s.isFocused() || this.f309419s.isHovered()) {
                this.f309419s.setTranslationZ(this.f309413m);
            } else {
                this.f309419s.setTranslationZ(0.0f);
            }
        } else {
            this.f309419s.setElevation(0.0f);
            this.f309419s.setTranslationZ(0.0f);
        }
    }

    /* renamed from: k */
    public void mo146787k(float f, float f2, float f3) {
        int i = Build.VERSION.SDK_INT;
        if (i == 21) {
            this.f309419s.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(C104453c.f309394A, mo160911p(f, f3));
            stateListAnimator.addState(C104453c.f309395B, mo160911p(f, f2));
            stateListAnimator.addState(C104453c.f309396C, mo160911p(f, f2));
            stateListAnimator.addState(C104453c.f309397D, mo160911p(f, f2));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.f309419s, "elevation", new float[]{f}).setDuration(0));
            if (i >= 22 && i <= 24) {
                VisibilityAwareImageButton visibilityAwareImageButton = this.f309419s;
                arrayList.add(ObjectAnimator.ofFloat(visibilityAwareImageButton, View.TRANSLATION_Z, new float[]{visibilityAwareImageButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.f309419s, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(C104453c.f309400z);
            stateListAnimator.addState(C104453c.f309398E, animatorSet);
            stateListAnimator.addState(C104453c.f309399F, mo160911p(0.0f, 0.0f));
            this.f309419s.setStateListAnimator(stateListAnimator);
        }
        if (FloatingActionButton.this.f309380r) {
            mo146791o();
        }
    }

    /* renamed from: l */
    public void mo146788l(Rect rect) {
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        if (floatingActionButton.f309380r) {
            C109694b.super.setBackgroundDrawable(new InsetDrawable(this.f309409i, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        C109694b.super.setBackgroundDrawable(this.f309409i);
    }

    /* renamed from: m */
    public void mo146789m(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        Drawable drawable;
        GradientDrawable q = mo160912q();
        q.setShape(1);
        q.setColor(-1);
        Drawable g = C112019a.m152749g(q);
        this.f309408h = g;
        g.setTintList(colorStateList);
        if (mode != null) {
            this.f309408h.setTintMode(mode);
        }
        if (i > 0) {
            this.f309410j = mo146779c(i, colorStateList);
            drawable = new LayerDrawable(new Drawable[]{this.f309410j, this.f309408h});
        } else {
            this.f309410j = null;
            drawable = this.f309408h;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(C110504a.m150442a(colorStateList2), drawable, (Drawable) null);
        this.f309409i = rippleDrawable;
        this.f309411k = rippleDrawable;
        C109694b.super.setBackgroundDrawable(rippleDrawable);
    }

    /* renamed from: n */
    public void mo146790n(ColorStateList colorStateList) {
        Drawable drawable = this.f309409i;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(C110504a.m150442a(colorStateList));
        } else {
            super.mo146790n(colorStateList);
        }
    }

    /* renamed from: p */
    public final Animator mo160911p(float f, float f2) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f309419s, "elevation", new float[]{f}).setDuration(0)).with(ObjectAnimator.ofFloat(this.f309419s, View.TRANSLATION_Z, new float[]{f2}).setDuration(100));
        animatorSet.setInterpolator(C104453c.f309400z);
        return animatorSet;
    }

    /* renamed from: q */
    public GradientDrawable mo160912q() {
        return new C109695a();
    }
}
