package hj3;

import android.animation.Animator;
import android.app.Activity;
import android.transition.ChangeBounds;
import android.transition.ChangeClipBounds;
import android.transition.ChangeImageTransform;
import android.transition.ChangeTransform;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import com.tencent.p014mm.p136ui.chatting.gallery.C97056h;
import com.tencent.p014mm.p136ui.chatting.gallery.C97153x;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI$$w0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gj3.C59471d;
import gy3.C87412m;
import ij3.C60331a;
import java.lang.ref.WeakReference;
import p387u9.C22617a;

/* renamed from: hj3.a */
public final class C20945a implements C59931c {

    /* renamed from: a */
    public static final C20945a f59387a = new C20945a();

    /* renamed from: b */
    public static final AccelerateDecelerateInterpolator f59388b = new AccelerateDecelerateInterpolator();

    /* renamed from: hj3.a$a */
    public static final class C20946a extends Fade {
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r6.view;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.animation.Animator createAnimator(android.view.ViewGroup r5, android.transition.TransitionValues r6, android.transition.TransitionValues r7) {
            /*
                r4 = this;
                r0 = 0
                if (r6 == 0) goto L_0x000f
                android.view.View r1 = r6.view
                if (r1 == 0) goto L_0x000f
                r2 = 2131306580(0x7f092854, float:1.8231363E38)
                java.lang.Object r1 = r1.getTag(r2)
                goto L_0x0010
            L_0x000f:
                r1 = r0
            L_0x0010:
                boolean r2 = r1 instanceof java.lang.Integer
                if (r2 == 0) goto L_0x0017
                java.lang.Integer r1 = (java.lang.Integer) r1
                goto L_0x0018
            L_0x0017:
                r1 = r0
            L_0x0018:
                r2 = 0
                if (r1 == 0) goto L_0x0020
                int r1 = r1.intValue()
                goto L_0x0021
            L_0x0020:
                r1 = 0
            L_0x0021:
                r3 = 1
                if (r1 != r3) goto L_0x0025
                r2 = 1
            L_0x0025:
                android.animation.Animator r5 = super.createAnimator(r5, r6, r7)
                if (r5 == 0) goto L_0x004a
                if (r2 == 0) goto L_0x0038
                r6 = 250(0xfa, double:1.235E-321)
                r5.setDuration(r6)
                r6 = 0
                r5.setStartDelay(r6)
                goto L_0x0042
            L_0x0038:
                r6 = 100
                r5.setDuration(r6)
                r6 = 150(0x96, double:7.4E-322)
                r5.setStartDelay(r6)
            L_0x0042:
                hj3.a r6 = hj3.C20945a.f59387a
                android.view.animation.AccelerateDecelerateInterpolator r6 = hj3.C20945a.f59388b
                r5.setInterpolator(r6)
                r0 = r5
            L_0x004a:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hj3.C20945a.C20946a.createAnimator(android.view.ViewGroup, android.transition.TransitionValues, android.transition.TransitionValues):android.animation.Animator");
        }
    }

    /* renamed from: hj3.a$b */
    public static final class C20947b extends Fade {
        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
            r1 = r6.view;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.animation.Animator createAnimator(android.view.ViewGroup r5, android.transition.TransitionValues r6, android.transition.TransitionValues r7) {
            /*
                r4 = this;
                r0 = 0
                if (r6 == 0) goto L_0x000f
                android.view.View r1 = r6.view
                if (r1 == 0) goto L_0x000f
                r2 = 2131306580(0x7f092854, float:1.8231363E38)
                java.lang.Object r1 = r1.getTag(r2)
                goto L_0x0010
            L_0x000f:
                r1 = r0
            L_0x0010:
                boolean r2 = r1 instanceof java.lang.Integer
                if (r2 == 0) goto L_0x0017
                java.lang.Integer r1 = (java.lang.Integer) r1
                goto L_0x0018
            L_0x0017:
                r1 = r0
            L_0x0018:
                r2 = 0
                if (r1 == 0) goto L_0x0020
                int r1 = r1.intValue()
                goto L_0x0021
            L_0x0020:
                r1 = 0
            L_0x0021:
                r3 = 1
                if (r1 != r3) goto L_0x0025
                r2 = 1
            L_0x0025:
                android.animation.Animator r5 = super.createAnimator(r5, r6, r7)
                if (r5 == 0) goto L_0x0048
                r6 = 0
                if (r2 == 0) goto L_0x0038
                r0 = 250(0xfa, double:1.235E-321)
                r5.setDuration(r0)
                r5.setStartDelay(r6)
                goto L_0x0040
            L_0x0038:
                r0 = 150(0x96, double:7.4E-322)
                r5.setDuration(r0)
                r5.setStartDelay(r6)
            L_0x0040:
                hj3.a r6 = hj3.C20945a.f59387a
                android.view.animation.AccelerateDecelerateInterpolator r6 = hj3.C20945a.f59388b
                r5.setInterpolator(r6)
                r0 = r5
            L_0x0048:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: hj3.C20945a.C20947b.createAnimator(android.view.ViewGroup, android.transition.TransitionValues, android.transition.TransitionValues):android.animation.Animator");
        }
    }

    /* renamed from: hj3.a$c */
    public static final class C20948c extends ChangeBounds {
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
            if (createAnimator == null) {
                return null;
            }
            C20945a.f59387a.mo32698b(this, createAnimator, viewGroup, transitionValues, transitionValues2);
            return createAnimator;
        }
    }

    /* renamed from: hj3.a$d */
    public static final class C20949d extends ChangeClipBounds {
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
            if (createAnimator == null) {
                return null;
            }
            C20945a.f59387a.mo32698b(this, createAnimator, viewGroup, transitionValues, transitionValues2);
            return createAnimator;
        }
    }

    /* renamed from: hj3.a$e */
    public static final class C20950e extends ChangeImageTransform {
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
            if (createAnimator == null) {
                return null;
            }
            C20945a.f59387a.mo32698b(this, createAnimator, viewGroup, transitionValues, transitionValues2);
            return createAnimator;
        }
    }

    /* renamed from: hj3.a$f */
    public static final class C20951f extends ChangeTransform {
        public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
            Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
            if (createAnimator == null) {
                return null;
            }
            C20945a.f59387a.mo32698b(this, createAnimator, viewGroup, transitionValues, transitionValues2);
            return createAnimator;
        }
    }

    /* renamed from: hj3.a$g */
    public static final class C20952g extends C22617a {

        /* renamed from: a */
        public final /* synthetic */ String f59389a;

        /* renamed from: b */
        public final /* synthetic */ C59471d f59390b;

        /* renamed from: c */
        public final /* synthetic */ Window f59391c;

        /* renamed from: d */
        public final /* synthetic */ Transition f59392d;

        /* renamed from: e */
        public final /* synthetic */ Activity f59393e;

        /* renamed from: hj3.a$g$a */
        public static final class C20953a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Activity f59394d;

            public C20953a(Activity activity) {
                this.f59394d = activity;
            }

            public final void run() {
                for (WeakReference weakReference : MMTransitionHelper.f165034a.mo81991b(this.f59394d).f165041e) {
                    C60331a aVar = (C60331a) weakReference.get();
                    if (aVar != null) {
                        aVar.mo81999g(true);
                    }
                }
            }
        }

        public C20952g(String str, C59471d dVar, Window window, Transition transition, Activity activity) {
            this.f59389a = str;
            this.f59390b = dVar;
            this.f59391c = window;
            this.f59392d = transition;
            this.f59393e = activity;
        }

        public void onTransitionEnd(Transition transition) {
            ImageGalleryUI$$w0 imageGalleryUI$$w0;
            Log.m105918d("MM.Transition", this.f59389a + " sharedElementEnterTransition onTransitionEnd() called with: transition = " + transition);
            Window window = this.f59391c;
            Transition transition2 = this.f59392d;
            transition2.setDuration(250);
            window.setSharedElementEnterTransition(transition2);
            C59471d dVar = this.f59390b;
            if (!(dVar == null || (imageGalleryUI$$w0 = ((C97153x) dVar).f285095a.f284428e2) == null)) {
                ((C97056h.C97063f.C97066b) imageGalleryUI$$w0).mo135948a(Boolean.FALSE);
            }
            this.f59391c.getSharedElementEnterTransition().removeListener(this);
            MMTransitionHelper.f165034a.mo81991b(this.f59393e).f165042f = true;
            MMHandlerThread.postToMainThread(new C20953a(this.f59393e));
        }

        public void onTransitionStart(Transition transition) {
            ImageGalleryUI$$w0 imageGalleryUI$$w0;
            Log.m105918d("MM.Transition", this.f59389a + " sharedElementEnterTransition onTransitionStart() called with: transition = " + transition);
            C59471d dVar = this.f59390b;
            if (dVar != null && (imageGalleryUI$$w0 = ((C97153x) dVar).f285095a.f284428e2) != null) {
                ((C97056h.C97063f.C97066b) imageGalleryUI$$w0).mo135948a(Boolean.TRUE);
            }
        }
    }

    /* renamed from: hj3.a$h */
    public static final class C20954h implements Transition.TransitionListener {

        /* renamed from: a */
        public final /* synthetic */ Window f59395a;

        public C20954h(Window window) {
            this.f59395a = window;
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
            this.f59395a.setEnterTransition(new C20947b());
        }

        public void onTransitionPause(Transition transition) {
        }

        public void onTransitionResume(Transition transition) {
        }

        public void onTransitionStart(Transition transition) {
        }
    }

    /* renamed from: a */
    public void mo32697a(Activity activity, C59471d dVar) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Window window = activity.getWindow();
        String simpleName = activity.getClass().getSimpleName();
        Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new C20948c());
        transitionSet.addTransition(new C20951f());
        transitionSet.addTransition(new C20949d());
        transitionSet.addTransition(new C20950e());
        window.setSharedElementEnterTransition(transitionSet);
        window.getSharedElementEnterTransition().addListener(new C20952g(simpleName, dVar, window, sharedElementEnterTransition, activity));
        window.setEnterTransition(new C20946a());
        window.getEnterTransition().addListener(new C20954h(window));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004e  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo32698b(android.transition.Transition r3, android.animation.Animator r4, android.view.ViewGroup r5, android.transition.TransitionValues r6, android.transition.TransitionValues r7) {
        /*
            r2 = this;
            java.lang.String r5 = "transition"
            gy3.C87412m.m108594g(r3, r5)
            java.lang.String r5 = "animator"
            gy3.C87412m.m108594g(r4, r5)
            r5 = 0
            if (r6 == 0) goto L_0x0026
            android.view.View r6 = r6.view
            if (r6 == 0) goto L_0x0026
            r7 = 2131313430(0x7f094316, float:1.8245257E38)
            java.lang.Object r6 = r6.getTag(r7)
            boolean r7 = r6 instanceof gj3.C32465g
            if (r7 == 0) goto L_0x0020
            gj3.g r6 = (gj3.C32465g) r6
            goto L_0x0021
        L_0x0020:
            r6 = r5
        L_0x0021:
            if (r6 == 0) goto L_0x0026
            java.lang.Object r6 = r6.f86260b
            goto L_0x0027
        L_0x0026:
            r6 = r5
        L_0x0027:
            boolean r7 = r6 instanceof java.lang.Integer
            if (r7 == 0) goto L_0x002e
            r5 = r6
            java.lang.Integer r5 = (java.lang.Integer) r5
        L_0x002e:
            if (r5 == 0) goto L_0x0035
            int r5 = r5.intValue()
            goto L_0x0036
        L_0x0035:
            r5 = -1
        L_0x0036:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "handleAnimator transition:"
            r6.append(r7)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r6 = "MM.Transition"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r6, r3)
            if (r5 < 0) goto L_0x0062
            int r5 = r5 * 20
            r6 = 250(0xfa, double:1.235E-321)
            long r0 = (long) r5
            long r6 = r6 - r0
            r4.setStartDelay(r0)
            r0 = 0
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 <= 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r6 = r0
        L_0x005f:
            r4.setDuration(r6)
        L_0x0062:
            android.view.animation.DecelerateInterpolator r3 = new android.view.animation.DecelerateInterpolator
            r5 = 1067030938(0x3f99999a, float:1.2)
            r3.<init>(r5)
            r4.setInterpolator(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hj3.C20945a.mo32698b(android.transition.Transition, android.animation.Animator, android.view.ViewGroup, android.transition.TransitionValues, android.transition.TransitionValues):void");
    }
}
