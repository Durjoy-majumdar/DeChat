package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.tencent.p014mm.C0966R;
import java.util.ArrayList;
import p1139o8.C109965a;
import p1139o8.C109986i;
import p1148r8.C110504a;
import p1153s8.C110776b;
import p161h8.C108164a;
import p161h8.C108165b;
import p161h8.C108167f;
import p161h8.C108168h;
import p161h8.C98320g;
import p385u2.C111105a;

/* renamed from: com.google.android.material.floatingactionbutton.c */
public class C104453c {

    /* renamed from: A */
    public static final int[] f309394A = {16842919, 16842910};

    /* renamed from: B */
    public static final int[] f309395B = {16843623, 16842908, 16842910};

    /* renamed from: C */
    public static final int[] f309396C = {16842908, 16842910};

    /* renamed from: D */
    public static final int[] f309397D = {16843623, 16842910};

    /* renamed from: E */
    public static final int[] f309398E = {16842910};

    /* renamed from: F */
    public static final int[] f309399F = new int[0];

    /* renamed from: z */
    public static final TimeInterpolator f309400z = C108164a.f323892c;

    /* renamed from: a */
    public int f309401a = 0;

    /* renamed from: b */
    public Animator f309402b;

    /* renamed from: c */
    public C108168h f309403c;

    /* renamed from: d */
    public C108168h f309404d;

    /* renamed from: e */
    public C108168h f309405e;

    /* renamed from: f */
    public C108168h f309406f;

    /* renamed from: g */
    public float f309407g;

    /* renamed from: h */
    public Drawable f309408h;

    /* renamed from: i */
    public Drawable f309409i;

    /* renamed from: j */
    public C109965a f309410j;

    /* renamed from: k */
    public Drawable f309411k;

    /* renamed from: l */
    public float f309412l;

    /* renamed from: m */
    public float f309413m;

    /* renamed from: n */
    public float f309414n;

    /* renamed from: o */
    public int f309415o;

    /* renamed from: p */
    public float f309416p = 1.0f;

    /* renamed from: q */
    public ArrayList<Animator.AnimatorListener> f309417q;

    /* renamed from: r */
    public ArrayList<Animator.AnimatorListener> f309418r;

    /* renamed from: s */
    public final VisibilityAwareImageButton f309419s;

    /* renamed from: t */
    public final C110776b f309420t;

    /* renamed from: u */
    public final Rect f309421u = new Rect();

    /* renamed from: v */
    public final RectF f309422v = new RectF();

    /* renamed from: w */
    public final RectF f309423w = new RectF();

    /* renamed from: x */
    public final Matrix f309424x = new Matrix();

    /* renamed from: y */
    public ViewTreeObserver.OnPreDrawListener f309425y;

    /* renamed from: com.google.android.material.floatingactionbutton.c$a */
    public class C104454a extends C104459f {
        public C104454a(C104453c cVar) {
            super((C104451a) null);
        }

        /* renamed from: a */
        public float mo146792a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$b */
    public class C104455b extends C104459f {
        public C104455b() {
            super((C104451a) null);
        }

        /* renamed from: a */
        public float mo146792a() {
            C104453c cVar = C104453c.this;
            return cVar.f309412l + cVar.f309413m;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$c */
    public class C104456c extends C104459f {
        public C104456c() {
            super((C104451a) null);
        }

        /* renamed from: a */
        public float mo146792a() {
            C104453c cVar = C104453c.this;
            return cVar.f309412l + cVar.f309414n;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$d */
    public interface C104457d {
        /* renamed from: a */
        void mo146793a();

        /* renamed from: b */
        void mo146794b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$e */
    public class C104458e extends C104459f {
        public C104458e() {
            super((C104451a) null);
        }

        /* renamed from: a */
        public float mo146792a() {
            return C104453c.this.f309412l;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.c$f */
    public abstract class C104459f extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public boolean f309429d;

        /* renamed from: e */
        public float f309430e;

        /* renamed from: f */
        public float f309431f;

        public C104459f(C104451a aVar) {
        }

        /* renamed from: a */
        public abstract float mo146792a();

        public void onAnimationEnd(Animator animator) {
            C104453c.this.getClass();
            throw null;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f309429d) {
                C104453c.this.getClass();
                throw null;
            }
            C104453c.this.getClass();
            valueAnimator.getAnimatedFraction();
            throw null;
        }
    }

    public C104453c(VisibilityAwareImageButton visibilityAwareImageButton, C110776b bVar) {
        this.f309419s = visibilityAwareImageButton;
        this.f309420t = bVar;
        C109986i iVar = new C109986i();
        iVar.mo161321a(f309394A, mo146780d(new C104456c()));
        iVar.mo161321a(f309395B, mo146780d(new C104455b()));
        iVar.mo161321a(f309396C, mo146780d(new C104455b()));
        iVar.mo161321a(f309397D, mo146780d(new C104455b()));
        iVar.mo161321a(f309398E, mo146780d(new C104458e()));
        iVar.mo161321a(f309399F, mo146780d(new C104454a(this)));
        this.f309407g = visibilityAwareImageButton.getRotation();
    }

    /* renamed from: a */
    public final void mo146777a(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f309419s.getDrawable();
        if (drawable != null && this.f309415o != 0) {
            RectF rectF = this.f309422v;
            RectF rectF2 = this.f309423w;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f309415o;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f309415o;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: b */
    public final AnimatorSet mo146778b(C108168h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f309419s, View.ALPHA, new float[]{f});
        hVar.mo158568d("opacity").mo158572a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f309419s, View.SCALE_X, new float[]{f2});
        hVar.mo158568d("scale").mo158572a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f309419s, View.SCALE_Y, new float[]{f2});
        hVar.mo158568d("scale").mo158572a(ofFloat3);
        arrayList.add(ofFloat3);
        mo146777a(f3, this.f309424x);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f309419s, new C108167f(), new C98320g(), new Matrix[]{new Matrix(this.f309424x)});
        hVar.mo158568d("iconScale").mo158572a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C108165b.m146494a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: c */
    public C109965a mo146779c(int i, ColorStateList colorStateList) {
        Context context = this.f309419s.getContext();
        C109965a h = mo146784h();
        int b = C111105a.m151500b(context, C0966R.color.f3294mm);
        int b2 = C111105a.m151500b(context, C0966R.color.f3293ml);
        int b3 = C111105a.m151500b(context, C0966R.color.f3291mj);
        int b4 = C111105a.m151500b(context, C0966R.color.f3292mk);
        h.f329068f = b;
        h.f329069g = b2;
        h.f329070h = b3;
        h.f329071i = b4;
        float f = (float) i;
        if (h.f329067e != f) {
            h.f329067e = f;
            h.f329063a.setStrokeWidth(f * 1.3333f);
            h.f329074l = true;
            h.invalidateSelf();
        }
        if (colorStateList != null) {
            h.f329073k = colorStateList.getColorForState(h.getState(), h.f329073k);
        }
        h.f329072j = colorStateList;
        h.f329074l = true;
        h.invalidateSelf();
        return h;
    }

    /* renamed from: d */
    public final ValueAnimator mo146780d(C104459f fVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f309400z);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(fVar);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: e */
    public float mo146781e() {
        throw null;
    }

    /* renamed from: f */
    public void mo146782f(Rect rect) {
        throw null;
    }

    /* renamed from: g */
    public void mo146783g() {
        throw null;
    }

    /* renamed from: h */
    public C109965a mo146784h() {
        throw null;
    }

    /* renamed from: i */
    public void mo146785i() {
        throw null;
    }

    /* renamed from: j */
    public void mo146786j(int[] iArr) {
        throw null;
    }

    /* renamed from: k */
    public void mo146787k(float f, float f2, float f3) {
        throw null;
    }

    /* renamed from: l */
    public void mo146788l(Rect rect) {
        throw null;
    }

    /* renamed from: m */
    public void mo146789m(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    /* renamed from: n */
    public void mo146790n(ColorStateList colorStateList) {
        Drawable drawable = this.f309409i;
        if (drawable != null) {
            drawable.setTintList(C110504a.m150442a(colorStateList));
        }
    }

    /* renamed from: o */
    public final void mo146791o() {
        Rect rect = this.f309421u;
        mo146782f(rect);
        mo146788l(rect);
        C110776b bVar = this.f309420t;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        FloatingActionButton.C104450b bVar2 = (FloatingActionButton.C104450b) bVar;
        FloatingActionButton.this.f309381s.set(i, i2, i3, i4);
        FloatingActionButton floatingActionButton = FloatingActionButton.this;
        int i5 = floatingActionButton.f309378p;
        floatingActionButton.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }
}
