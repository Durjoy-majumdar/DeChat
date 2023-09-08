package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import com.tencent.p014mm.C0966R;
import p849e3.C58525r;

/* renamed from: androidx.fragment.app.n */
public class C112943n {
    /* renamed from: a */
    public static C112944a m154542a(Context context, Fragment fragment, boolean z, boolean z2) {
        int nextTransition = fragment.getNextTransition();
        int popEnterAnim = z2 ? z ? fragment.getPopEnterAnim() : fragment.getPopExitAnim() : z ? fragment.getEnterAnim() : fragment.getExitAnim();
        boolean z3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        ViewGroup viewGroup = fragment.mContainer;
        if (!(viewGroup == null || viewGroup.getTag(C0966R.C0970id.l9v) == null)) {
            fragment.mContainer.setTag(C0966R.C0970id.l9v, (Object) null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, z, popEnterAnim);
        if (onCreateAnimation != null) {
            return new C112944a(onCreateAnimation);
        }
        Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, z, popEnterAnim);
        if (onCreateAnimator != null) {
            return new C112944a(onCreateAnimator);
        }
        if (popEnterAnim == 0 && nextTransition != 0) {
            popEnterAnim = nextTransition != 4097 ? nextTransition != 4099 ? nextTransition != 8194 ? -1 : z ? C0966R.animator.f2551j : C0966R.animator.f2552k : z ? C0966R.animator.f2553l : C0966R.animator.f2554m : z ? C0966R.animator.f2555n : C0966R.animator.f2556o;
        }
        if (popEnterAnim != 0) {
            boolean equals = "anim".equals(context.getResources().getResourceTypeName(popEnterAnim));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(context, popEnterAnim);
                    if (loadAnimation != null) {
                        return new C112944a(loadAnimation);
                    }
                    z3 = true;
                } catch (Resources.NotFoundException e) {
                    throw e;
                } catch (RuntimeException unused) {
                }
            }
            if (!z3) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, popEnterAnim);
                    if (loadAnimator != null) {
                        return new C112944a(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (!equals) {
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, popEnterAnim);
                        if (loadAnimation2 != null) {
                            return new C112944a(loadAnimation2);
                        }
                    } else {
                        throw e2;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: androidx.fragment.app.n$a */
    public static class C112944a {

        /* renamed from: a */
        public final Animation f338121a;

        /* renamed from: b */
        public final Animator f338122b;

        public C112944a(Animation animation) {
            this.f338121a = animation;
            this.f338122b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public C112944a(Animator animator) {
            this.f338121a = null;
            this.f338122b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* renamed from: androidx.fragment.app.n$b */
    public static class C112945b extends AnimationSet implements Runnable {

        /* renamed from: d */
        public final ViewGroup f338123d;

        /* renamed from: e */
        public final View f338124e;

        /* renamed from: f */
        public boolean f338125f;

        /* renamed from: g */
        public boolean f338126g;

        /* renamed from: h */
        public boolean f338127h = true;

        public C112945b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f338123d = viewGroup;
            this.f338124e = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation) {
            this.f338127h = true;
            if (this.f338125f) {
                return !this.f338126g;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f338125f = true;
                C58525r.m67941a(this.f338123d, this);
            }
            return true;
        }

        public void run() {
            if (this.f338125f || !this.f338127h) {
                this.f338123d.endViewTransition(this.f338124e);
                this.f338126g = true;
                return;
            }
            this.f338127h = false;
            this.f338123d.post(this);
        }

        public boolean getTransformation(long j, Transformation transformation, float f) {
            this.f338127h = true;
            if (this.f338125f) {
                return !this.f338126g;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f338125f = true;
                C58525r.m67941a(this.f338123d, this);
            }
            return true;
        }
    }
}
