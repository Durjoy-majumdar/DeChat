package com.tencent.p014mm.p136ui.tools;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.view.animation.TranslateAnimation;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.ui.tools.m0 */
public class C45059m0 {

    /* renamed from: A */
    public boolean f122213A = false;

    /* renamed from: B */
    public boolean f122214B = false;

    /* renamed from: C */
    public boolean f122215C = false;

    /* renamed from: D */
    public VelocityTracker f122216D;

    /* renamed from: E */
    public C45069j f122217E;

    /* renamed from: F */
    public C45071l f122218F;

    /* renamed from: G */
    public C45070k f122219G;

    /* renamed from: H */
    public C45067h f122220H;

    /* renamed from: a */
    public final Context f122221a;

    /* renamed from: b */
    public int f122222b = 0;

    /* renamed from: c */
    public int f122223c = 0;

    /* renamed from: d */
    public int f122224d = 0;

    /* renamed from: e */
    public int f122225e = 0;

    /* renamed from: f */
    public int f122226f = 0;

    /* renamed from: g */
    public int f122227g = 0;

    /* renamed from: h */
    public int f122228h = 0;

    /* renamed from: i */
    public int f122229i = 0;

    /* renamed from: j */
    public float f122230j = 0.0f;

    /* renamed from: k */
    public float f122231k = 0.0f;

    /* renamed from: l */
    public float f122232l = 0.0f;

    /* renamed from: m */
    public float f122233m = 0.0f;

    /* renamed from: n */
    public float f122234n = 1.0f;

    /* renamed from: o */
    public int f122235o = 0;

    /* renamed from: p */
    public int f122236p = 0;

    /* renamed from: q */
    public float f122237q = 1.0f;

    /* renamed from: r */
    public int f122238r = 0;

    /* renamed from: s */
    public int f122239s = 0;

    /* renamed from: t */
    public int f122240t = 0;

    /* renamed from: u */
    public int f122241u = 0;

    /* renamed from: v */
    public int f122242v = 0;

    /* renamed from: w */
    public int f122243w = 0;

    /* renamed from: x */
    public MMHandler f122244x = new MMHandler();

    /* renamed from: y */
    public float f122245y = 0.0f;

    /* renamed from: z */
    public float f122246z = 0.0f;

    /* renamed from: com.tencent.mm.ui.tools.m0$a */
    public class C45060a implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f122247d;

        public C45060a(C45059m0 m0Var, View view) {
            this.f122247d = view;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f122247d.setLayerType(0, (Paint) null);
            Log.m105925i("MicroMsg.ImagePreviewAnimation", "pennqin, bg animation result, alpha %s.", Float.valueOf(this.f122247d.getAlpha()));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f122247d.setLayerType(2, (Paint) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$b */
    public class C45061b implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C45068i f122248d;

        /* renamed from: e */
        public final /* synthetic */ View f122249e;

        public C45061b(C45068i iVar, View view) {
            this.f122248d = iVar;
            this.f122249e = view;
        }

        public void onAnimationCancel(Animator animator) {
            C45059m0 m0Var = C45059m0.this;
            m0Var.getClass();
            m0Var.f122243w = 3;
        }

        public void onAnimationEnd(Animator animator) {
            C45068i iVar = this.f122248d;
            if (iVar != null) {
                iVar.onAnimationEnd();
            }
            C45059m0 m0Var = C45059m0.this;
            m0Var.getClass();
            m0Var.f122243w = 3;
            Log.m105925i("MicroMsg.ImagePreviewAnimation", "pennqin, gallery animation result, sx %s, sy %s, tx %s, ty %s.", Float.valueOf(this.f122249e.getScaleX()), Float.valueOf(this.f122249e.getScaleY()), Float.valueOf(this.f122249e.getTranslationX()), Float.valueOf(this.f122249e.getTranslationY()));
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            C45068i iVar = this.f122248d;
            if (iVar != null) {
                iVar.onAnimationStart();
            }
            C45059m0 m0Var = C45059m0.this;
            m0Var.getClass();
            m0Var.f122243w = 2;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$c */
    public class C45062c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f122251d;

        public C45062c(View view) {
            this.f122251d = view;
        }

        public void run() {
            C45059m0 m0Var = C45059m0.this;
            int i = m0Var.f122243w;
            m0Var.getClass();
            if (i == 0) {
                Log.m105924i("MicroMsg.ImagePreviewAnimation", "dancy enter Animation not Start!");
                this.f122251d.requestLayout();
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$d */
    public class C45063d implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f122253d;

        public C45063d(C45059m0 m0Var, View view) {
            this.f122253d = view;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f122253d.setLayerType(0, (Paint) null);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
            this.f122253d.setLayerType(2, (Paint) null);
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$e */
    public class C45064e extends ScaleAnimation {

        /* renamed from: d */
        public final /* synthetic */ View f122254d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45064e(float f, float f2, float f3, float f4, View view, C45066g gVar) {
            super(f, f2, f3, f4);
            this.f122254d = view;
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            C45059m0 m0Var = C45059m0.this;
            if (!(m0Var.f122226f == 0 || m0Var.f122227g == 0 || m0Var.f122234n != 1.0f)) {
                Rect rect = new Rect();
                this.f122254d.getGlobalVisibleRect(rect);
                int i2 = rect.right;
                int i3 = rect.left;
                int i4 = rect.bottom;
                int i5 = rect.top;
                C45059m0 m0Var2 = C45059m0.this;
                int i6 = m0Var2.f122238r;
                int i7 = ((i4 - i5) + i6) / 2;
                int i8 = m0Var2.f122226f;
                int i9 = m0Var2.f122224d;
                float f2 = 1.0f - f;
                float f3 = m0Var2.f122232l;
                int i15 = (int) (((((float) (i8 - i9)) * f2) + ((float) i9)) / (1.0f - ((1.0f - f3) * f)));
                int i16 = m0Var2.f122227g;
                int i17 = m0Var2.f122225e;
                int i18 = (i2 - i3) / 2;
                int i19 = (int) (((((float) (i16 - i17)) * f2) + ((float) i17)) / (1.0f - ((1.0f - f3) * f)));
                float f4 = m0Var2.f122234n;
                if (f4 != 1.0f) {
                    float f5 = m0Var2.f122233m / f4;
                    m0Var2.f122232l = f5;
                    i = (i2 + i3) / 2;
                    i7 = (m0Var2.f122236p - i5) + ((int) (((float) i16) / 2.0f));
                    i15 = (int) (((((float) (i8 - i9)) * f2) + ((float) i9)) / (1.0f - ((1.0f - f5) * f)));
                    i19 = (int) (((((float) (i16 - i17)) * f2) + ((float) i17)) / (1.0f - ((1.0f - f5) * f)));
                } else {
                    i = i18;
                }
                int i25 = i15 / 2;
                float f6 = m0Var2.f122232l;
                int i26 = i19 / 2;
                this.f122254d.setClipBounds(new Rect((int) (((float) (i - i25)) + ((((float) m0Var2.f122239s) * f) / (1.0f - ((1.0f - f6) * f)))), (int) ((((float) (i7 - i26)) - ((((float) i6) * f2) / 2.0f)) + ((((float) m0Var2.f122241u) * f) / (1.0f - ((1.0f - f6) * f)))), (int) (((float) (i + i25)) - ((((float) m0Var2.f122240t) * f) / (1.0f - ((1.0f - f6) * f)))), (int) (((float) (i7 + i26)) - ((((float) m0Var2.f122242v) * f) / (1.0f - ((1.0f - f6) * f))))));
            }
            super.applyTransformation(f, transformation);
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$f */
    public class C45065f implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ C45068i f122256a;

        public C45065f(C45068i iVar) {
            this.f122256a = iVar;
        }

        public void onAnimationEnd(Animation animation) {
            Log.m105924i("MicroMsg.ImagePreviewAnimation", "ExitAnimation end!");
            C45068i iVar = this.f122256a;
            if (iVar != null) {
                iVar.onAnimationEnd();
            }
            C45059m0 m0Var = C45059m0.this;
            m0Var.getClass();
            m0Var.f122243w = 1;
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
            Log.m105924i("MicroMsg.ImagePreviewAnimation", "ExitAnimation start!");
            C45068i iVar = this.f122256a;
            if (iVar != null) {
                iVar.onAnimationStart();
            }
            C45059m0 m0Var = C45059m0.this;
            m0Var.getClass();
            m0Var.f122243w = 4;
        }
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$g */
    public interface C45066g {
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$h */
    public interface C45067h {
        /* renamed from: o0 */
        void mo68703o0();
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$i */
    public interface C45068i {
        void onAnimationEnd();

        void onAnimationStart();
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$j */
    public interface C45069j {
        /* renamed from: a */
        void mo68704a();
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$k */
    public interface C45070k {
        /* renamed from: a */
        void mo68706a(float f, float f2);
    }

    /* renamed from: com.tencent.mm.ui.tools.m0$l */
    public interface C45071l {
        /* renamed from: a */
        void mo68705a();
    }

    public C45059m0(Context context) {
        this.f122221a = context;
    }

    /* renamed from: a */
    public static void m49910a(C45059m0 m0Var, float f, float f2, View view, View view2, View view3) {
        C45059m0 m0Var2 = m0Var;
        float f3 = f;
        float f4 = f2;
        View view4 = view3;
        C45070k kVar = m0Var2.f122219G;
        if (kVar != null) {
            kVar.mo68706a(f3, f4);
        }
        float height = 1.0f - (f4 / ((float) view.getHeight()));
        if (height > 1.0f) {
            height = 1.0f;
        }
        if (!Float.isNaN(height)) {
            if (((double) height) != 1.0d) {
                m0Var2.f122234n = 1.0f / height;
                if (!(f3 == 0.0f && f4 == 0.0f)) {
                    m0Var2.f122235o = (int) (((float) ((int) (((float) (view.getWidth() / 2)) * (1.0f - height)))) + f3);
                    m0Var2.f122236p = (int) ((((float) (view.getHeight() / 2)) + f4) - (((float) (m0Var2.f122227g / 2)) * height));
                }
            }
            Log.m105919d("MicroMsg.ImagePreviewAnimation", "onGalleryScale tx: %f, ty: %f, scale: %f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(height));
            if (view4 != null) {
                view4.setPivotX((float) (view.getWidth() / 2));
                view4.setPivotY((float) (view.getHeight() / 2));
                view4.setScaleX(height);
                view4.setScaleY(height);
                view4.setTranslationX(f3);
                view4.setTranslationY(f4);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(height));
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/tools/ImagePreviewAnimation", "onGalleryScale", "(FFLandroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                View view5 = view2;
                view5.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view5, "com/tencent/mm/ui/tools/ImagePreviewAnimation", "onGalleryScale", "(FFLandroid/view/View;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                return;
            }
            Log.m105918d("MicroMsg.ImagePreviewAnimation", "runDragAnimation contentView is null !!");
        }
    }

    /* renamed from: b */
    public final void mo70407b(View view, boolean z) {
        int i;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (this.f122222b == 0 && this.f122223c == 0) {
            this.f122222b = view.getWidth() / 2;
            this.f122223c = view.getHeight() / 2;
        }
        this.f122228h = this.f122222b - iArr[0];
        this.f122229i = this.f122223c - iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (width == 0 || height == 0) {
            width = this.f122226f;
            height = this.f122227g;
        }
        if (!(width == 0 || height == 0)) {
            this.f122230j = ((float) this.f122224d) / ((float) width);
            this.f122231k = ((float) this.f122225e) / ((float) height);
        }
        float f = (this.f122239s == 0 && this.f122240t == 0 && this.f122241u == 0 && this.f122242v == 0) ? 1.0f : 1.1f;
        if (z) {
            int i2 = this.f122226f;
            if (!(i2 == 0 || (i = this.f122227g) == 0)) {
                this.f122230j = ((float) this.f122224d) / ((float) i2);
                this.f122231k = ((float) this.f122225e) / ((float) i);
            }
            f = 1.0f;
        }
        float f2 = this.f122234n;
        if (((double) f2) != 1.0d) {
            int i3 = this.f122228h + iArr[0];
            int i4 = this.f122229i + iArr[1];
            float f3 = this.f122230j * f2;
            this.f122232l = f3;
            this.f122233m = f3;
            this.f122229i = (int) (((float) i4) - (((float) this.f122236p) * f3));
            this.f122228h = (int) (((float) i3) - (((float) this.f122235o) * f3));
            return;
        }
        float f4 = this.f122230j;
        float f5 = this.f122231k;
        if (f4 > f5) {
            float f6 = f4 * f;
            this.f122232l = f6;
            this.f122229i = (int) (((float) this.f122229i) - (((((float) height) * f6) - (((float) this.f122225e) * f)) / 2.0f));
        } else {
            float f7 = f5 * f;
            this.f122232l = f7;
            this.f122228h = (int) (((float) this.f122228h) - (((((float) width) * f7) - (((float) this.f122224d) * f)) / 2.0f));
            int i5 = this.f122227g;
            if (i5 != 0 && i5 < height) {
                this.f122229i = (int) (((float) this.f122229i) - (((((float) height) * f7) - (((float) this.f122225e) * f)) / 2.0f));
            }
        }
        int i6 = this.f122225e;
        float f8 = f - 1.0f;
        int i7 = this.f122238r;
        int i8 = (int) ((((float) this.f122229i) - ((((float) i6) * f8) / 2.0f)) - ((((float) i7) * this.f122232l) / 2.0f));
        this.f122229i = i8;
        int i9 = this.f122224d;
        int i15 = (int) (((float) this.f122228h) - ((((float) i9) * f8) / 2.0f));
        this.f122228h = i15;
        int i16 = this.f122227g;
        if (i16 != 0 && this.f122223c < (height - i16) / 2) {
            this.f122229i = (int) (((float) i8) + ((((float) i6) * f8) / 2.0f));
        } else if (i16 != 0 && this.f122223c + i6 > (i16 + height) / 2) {
            this.f122229i = (int) (((float) i8) - ((((float) i6) * f8) / 2.0f));
        }
        if (i9 == 0 && i6 == 0) {
            this.f122232l = 0.5f;
            this.f122237q = 0.0f;
            this.f122228h = (int) (((float) i15) - ((((float) width) * 0.5f) / 2.0f));
            this.f122229i = (int) ((((float) this.f122229i) - ((((float) height) * 0.5f) / 2.0f)) - ((((float) i7) * 0.5f) / 2.0f));
        }
        Log.m105925i("MicroMsg.ImagePreviewAnimation", "left: %s; top: %s; width: %s; height: %s; zoomScale: %s; LeftDelta: %s; TopDelta: %s", Integer.valueOf(this.f122222b), Integer.valueOf(this.f122223c), Integer.valueOf(this.f122224d), Integer.valueOf(this.f122225e), Float.valueOf(this.f122232l), Integer.valueOf(this.f122228h), Integer.valueOf(this.f122229i));
    }

    /* renamed from: c */
    public void mo70408c(View view, View view2, C45068i iVar) {
        int i;
        View view3 = view;
        View view4 = view2;
        if (view3 == null || (i = this.f122243w) == 2 || i == 4 || i == 3) {
            Log.m105921e("MicroMsg.ImagePreviewAnimation", "[runEnterAnimation] %s %s ", Integer.valueOf(this.f122243w), view3);
        } else if (!Float.isNaN(this.f122232l)) {
            mo70407b(view3, false);
            view3.setPivotX(0.0f);
            view3.setPivotY(0.0f);
            view3.setScaleX(this.f122232l);
            view3.setScaleY(this.f122232l);
            view3.setTranslationX((float) this.f122228h);
            view3.setTranslationY((float) this.f122229i);
            if (view4 != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Float.valueOf(0.0f));
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/ui/tools/ImagePreviewAnimation", "runEnterAnimation", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/ui/tools/ImagePreviewAnimation$ICallback;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view4.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
                C117292a.m165359e(view2, "com/tencent/mm/ui/tools/ImagePreviewAnimation", "runEnterAnimation", "(Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/ui/tools/ImagePreviewAnimation$ICallback;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.animate().setDuration((long) 300).setInterpolator(new DecelerateInterpolator(1.2f)).alpha(1.0f).setListener(new C45060a(this, view4));
            }
            view.animate().setDuration((long) 300).setInterpolator(new DecelerateInterpolator(1.2f)).scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setListener(new C45061b(iVar, view3));
            this.f122244x.postDelayed(new C45062c(view3), (long) 10);
        }
    }

    /* renamed from: d */
    public void mo70409d(View view, View view2, C45068i iVar, C45066g gVar) {
        int i;
        View view3 = view;
        View view4 = view2;
        if (view3 == null || (i = this.f122243w) == 2 || i == 4 || i == 1) {
            Log.m105925i("MicroMsg.ImagePreviewAnimation", "ExitAnimation not run! animationState: %s , gallery:%s", Integer.valueOf(this.f122243w), view3);
            return;
        }
        mo70407b(view3, true);
        if (view4 != null) {
            view2.animate().setDuration(200).setInterpolator(new DecelerateInterpolator(1.2f)).alpha(0.0f).setListener(new C45063d(this, view4));
        }
        AnimationSet animationSet = new AnimationSet(true);
        float f = this.f122232l;
        C45064e eVar = r0;
        C45064e eVar2 = new C45064e(1.0f, f, 1.0f, f, view, gVar);
        eVar.setDuration(200);
        eVar.setInterpolator(new DecelerateInterpolator(1.2f));
        animationSet.addAnimation(eVar);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, (float) this.f122228h, 0.0f, (float) this.f122229i);
        translateAnimation.setDuration(200);
        translateAnimation.setInterpolator(new DecelerateInterpolator(1.2f));
        animationSet.addAnimation(translateAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, this.f122237q);
        alphaAnimation.setDuration(200);
        alphaAnimation.setInterpolator(new DecelerateInterpolator(1.2f));
        animationSet.addAnimation(alphaAnimation);
        animationSet.setFillAfter(true);
        animationSet.setAnimationListener(new C45065f(iVar));
        view3.startAnimation(animationSet);
    }

    /* renamed from: e */
    public void mo70410e(int i, int i2, int i3, int i4) {
        this.f122222b = i;
        this.f122223c = i2;
        this.f122224d = i3;
        this.f122225e = i4;
        Log.m105925i("MicroMsg.ImagePreviewAnimation", "setAnimationParam: left=%d, top=%d, width=%d, height=%d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }
}
