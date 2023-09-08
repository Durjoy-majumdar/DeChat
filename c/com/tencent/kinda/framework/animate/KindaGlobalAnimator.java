package com.tencent.kinda.framework.animate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import java.util.ArrayList;
import java.util.List;

public class KindaGlobalAnimator {
    private static List<Animator> animList = new ArrayList();
    private static AnimatorSet animSet = null;
    private static long animateDuration;
    private static boolean isAnimated;
    /* access modifiers changed from: private */
    public static Runnable onComplete = null;

    public static void addAnimator(Animator animator) {
        animList.add(animator);
    }

    public static long animateDuration() {
        return animateDuration;
    }

    public static boolean hasAnimate() {
        return isAnimated && animateDuration > 0;
    }

    /* access modifiers changed from: private */
    public static void setupAnimate(long j, Runnable runnable) {
        isAnimated = true;
        animateDuration = j;
        onComplete = runnable;
    }

    /* access modifiers changed from: private */
    public static void startAnimInternal() {
        isAnimated = false;
        animateDuration = 0;
        if (animList.size() > 0) {
            AnimatorSet animatorSet = new AnimatorSet();
            animSet = animatorSet;
            animatorSet.playTogether(animList);
            final Runnable runnable = onComplete;
            if (runnable != null) {
                animSet.addListener(new AnimatorListenerAdapter() {
                    public void onAnimationEnd(Animator animator) {
                        runnable.run();
                    }
                });
            }
            animSet.start();
            animSet = null;
            animList.clear();
            onComplete = null;
        }
    }

    public static void startAnimate(final long j, final Runnable runnable) {
        KindaAnimatorWatch.post(new Runnable() {
            public void run() {
                long j = j;
                if (j > 0 && runnable != null) {
                    KindaGlobalAnimator.setupAnimate(j, (Runnable) null);
                    runnable.run();
                    KindaGlobalAnimator.startAnimInternal();
                }
            }
        });
    }

    public static void startAnimate(final long j, final Runnable runnable, final Runnable runnable2) {
        KindaAnimatorWatch.post(new Runnable() {
            public void run() {
                long j = j;
                if (j > 0 && runnable != null) {
                    KindaGlobalAnimator.setupAnimate(j, runnable2);
                    runnable.run();
                    KindaGlobalAnimator.startAnimInternal();
                    if (KindaGlobalAnimator.onComplete != null) {
                        KindaGlobalAnimator.onComplete.run();
                        Runnable unused = KindaGlobalAnimator.onComplete = null;
                    }
                }
            }
        });
    }
}
