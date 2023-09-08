package com.tencent.mapsdk.internal;

import com.tencent.tencentmap.mapsdk.maps.model.AlphaAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.Animation;
import com.tencent.tencentmap.mapsdk.maps.model.AnimationSet;
import com.tencent.tencentmap.mapsdk.maps.model.EmergeAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimationSet;
import com.tencent.tencentmap.mapsdk.maps.model.RotateAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.ScaleAnimation;
import com.tencent.tencentmap.mapsdk.maps.model.TranslateAnimation;

/* renamed from: com.tencent.mapsdk.internal.ih */
public final class C113829ih {
    /* renamed from: a */
    private static double[] m157229a(double d, double d2, int i) {
        double d3 = d + d2;
        double abs = Math.abs(d2) / 2.0d;
        double sqrt = Math.sqrt((4.0d * abs) / 3.141592653589793d);
        int i2 = i >> 1;
        int i3 = i2 << 1;
        double[] dArr = new double[i3];
        int i4 = i2 - 1;
        dArr[i4] = d + (d2 / 2.0d);
        dArr[i3 - 1] = d3;
        double d4 = sqrt / ((double) i2);
        int i5 = 0;
        while (i5 < i4) {
            int i6 = i5 + 1;
            double d5 = sqrt - (((double) i6) * d4);
            double acos = Math.acos(d5 / sqrt);
            double sin = (((acos * abs) * 2.0d) / 3.141592653589793d) - ((d5 * (Math.sin(acos) * sqrt)) / 2.0d);
            if (d2 < 0.0d) {
                sin = -sin;
            }
            dArr[i5] = d + sin;
            dArr[(i3 - 2) - i5] = d3 - sin;
            i5 = i6;
        }
        return dArr;
    }

    /* renamed from: b */
    private static double[] m157230b(double d, double d2, int i) {
        double d3 = d + d2;
        double[] dArr = new double[i];
        double d4 = (double) i;
        double d5 = ((d2 * 2.0d) / d4) / d4;
        double d6 = d5 / 2.0d;
        int i2 = i - 1;
        dArr[i2] = d3;
        dArr[0] = d + d6;
        for (int i3 = 1; i3 < i2; i3++) {
            dArr[i3] = dArr[i3 - 1] + (((double) i3) * d5) + d6;
        }
        return dArr;
    }

    /* renamed from: a */
    public static double[] m157228a(double d, double d2) {
        double d3 = d + d2;
        double[] dArr = new double[20];
        dArr[9] = (d2 / 2.0d) + d;
        dArr[19] = d3;
        double d4 = (d2 / 10.0d) / 10.0d;
        double d5 = d4 / 2.0d;
        dArr[0] = d + d5;
        dArr[18] = d3 - d5;
        for (int i = 1; i < 9; i++) {
            double d6 = (((double) i) * d4) + d5;
            dArr[i] = dArr[i - 1] + d6;
            dArr[18 - i] = dArr[19 - i] - d6;
        }
        return dArr;
    }

    /* renamed from: a */
    public static <A extends Animation> C113805hi m157227a(C113565bo boVar, A a) {
        Animation animation = null;
        if (boVar == null || a == null) {
            return null;
        }
        if (a instanceof C113805hi) {
            return (C113805hi) a;
        }
        Class<?> cls = a.getClass();
        if (cls == AlphaAnimation.class) {
            AlphaAnimation alphaAnimation = (AlphaAnimation) a;
            animation = boVar.createAlphaAnimation(alphaAnimation.mFromAlpha, alphaAnimation.mToAlpha);
        } else if (cls == ScaleAnimation.class) {
            ScaleAnimation scaleAnimation = (ScaleAnimation) a;
            animation = boVar.createScaleAnimation(scaleAnimation.mFromX, scaleAnimation.mToX, scaleAnimation.mFromY, scaleAnimation.mToY);
        } else if (cls == EmergeAnimation.class) {
            animation = boVar.createEmergeAnimation(((EmergeAnimation) a).mStartPoint);
        } else if (cls == AnimationSet.class) {
            AnimationSet animationSet = (AnimationSet) a;
            IAnimationSet createAnimationSet = boVar.createAnimationSet(animationSet.mShareInterpolator);
            for (Animation a2 : animationSet.mAnimations) {
                ((C113809hj) createAnimationSet).addAnimation(m157227a(boVar, a2));
            }
            animation = createAnimationSet;
        } else if (cls == RotateAnimation.class) {
            RotateAnimation rotateAnimation = (RotateAnimation) a;
            animation = boVar.createRotateAnimation(rotateAnimation.mFromDegree, rotateAnimation.mToDegree, rotateAnimation.mPivoteX, rotateAnimation.mPivoteY, rotateAnimation.mPivoteZ);
        } else if (cls == TranslateAnimation.class) {
            animation = boVar.createTranslateAnimation(((TranslateAnimation) a).mTargetLatLng);
        }
        if (animation != null) {
            animation.setDuration(a.getDuration());
            animation.setInterpolator(a.getInterpolator());
            animation.setAnimationListener(a.getAnimationListener());
        }
        return (C113805hi) animation;
    }
}
