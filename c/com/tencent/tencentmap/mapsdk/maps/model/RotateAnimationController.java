package com.tencent.tencentmap.mapsdk.maps.model;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.tencent.tencentmap.mapsdk.maps.model.GeneralTranslateAnimator;
import com.tencent.tencentmap.mapsdk.maps.model.transform.Point;
import com.tencent.tencentmap.mapsdk.maps.model.transform.SphericalMercatorProjection;
import java.util.ArrayList;

public class RotateAnimationController {
    /* access modifiers changed from: private */
    public IAnimatorModel mAnimatorModel;
    private double[] mDistances;
    private long mDuration;
    private SphericalMercatorProjection mEarthMercatorProjection;
    private C116374a mIValueAnimatorStrategy;
    private final float mInitRotate;
    private LatLng[] mLatLngs;
    /* access modifiers changed from: private */
    public GeneralTranslateAnimator.ModelType mModelType;
    private AnimatorSet mRotateAnimatorSet;
    private final boolean mRotateEnabled;
    private double mSumDistance;

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController$3 */
    public static /* synthetic */ class C1163733 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f349188a;

        static {
            int[] iArr = new int[GeneralTranslateAnimator.ModelType.values().length];
            f349188a = iArr;
            try {
                iArr[GeneralTranslateAnimator.ModelType.MODEL_OVERLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.tencent.tencentmap.mapsdk.maps.model.RotateAnimationController$a */
    public interface C116374a {
        /* renamed from: a */
        ValueAnimator mo178817a(float f, float f2);

        /* renamed from: a */
        double[] mo178818a();
    }

    public RotateAnimationController(IAnimatorModel iAnimatorModel, long j, GeneralTranslateAnimator.ModelType modelType, boolean z, float f, LatLng[] latLngArr, double[] dArr, double d, SphericalMercatorProjection sphericalMercatorProjection) {
        this.mRotateEnabled = z;
        this.mInitRotate = f;
        if (z) {
            this.mAnimatorModel = iAnimatorModel;
            this.mDuration = j;
            this.mModelType = modelType;
            this.mRotateAnimatorSet = new AnimatorSet();
            this.mLatLngs = latLngArr;
            this.mDistances = dArr;
            this.mSumDistance = d;
            this.mEarthMercatorProjection = sphericalMercatorProjection;
            initValueAnimatorStrategy();
            initRotateAnimation();
        }
    }

    private double calculateAngle(double d, double d2, double d3, double d4) {
        double sqrt = ((d * d3) + (d2 * d4)) / (Math.sqrt((d * d) + (d2 * d2)) * Math.sqrt((d3 * d3) + (d4 * d4)));
        if (Double.isNaN(sqrt)) {
            return 0.0d;
        }
        if (sqrt < -1.0d) {
            sqrt = -1.0d;
        }
        if (sqrt > 1.0d) {
            sqrt = 1.0d;
        }
        double acos = (Math.acos(sqrt) * 180.0d) / 3.141592653589793d;
        if ((d * d4) - (d2 * d3) > 0.0d) {
            acos = -acos;
        }
        return (double) ((float) acos);
    }

    private long calculateDelay(int i, int i2) {
        double d = 0.0d;
        while (i < i2) {
            d += this.mDistances[i];
            i++;
        }
        return (long) ((((double) this.mDuration) * d) / this.mSumDistance);
    }

    private ValueAnimator createRotateAnimator(float f, float f2, long j, long j2) {
        C116374a aVar = this.mIValueAnimatorStrategy;
        float f3 = this.mInitRotate;
        ValueAnimator a = aVar.mo178817a(f + f3, f2 + f3);
        a.setDuration(j);
        a.setStartDelay(j2);
        a.setInterpolator(new LinearInterpolator());
        a.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                double parseDouble = Double.parseDouble(String.valueOf(valueAnimator.getAnimatedValue()));
                if (RotateAnimationController.this.mAnimatorModel != null) {
                    RotateAnimationController.this.mAnimatorModel.setRotation((float) parseDouble);
                }
            }
        });
        return a;
    }

    private void initRotateAnimation() {
        int i;
        long j;
        float f;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        float f2 = 0.0f;
        long j2 = 0;
        while (true) {
            LatLng[] latLngArr = this.mLatLngs;
            if (i3 < latLngArr.length) {
                if (!latLngArr[i4].equals(latLngArr[i3])) {
                    Point point = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i2]);
                    Point point2 = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i4]);
                    Point point3 = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i3]);
                    double d = point2.f349191x;
                    double d2 = point.f349192y;
                    double d3 = point2.f349192y;
                    Point point4 = point2;
                    double d4 = point3.f349191x - d;
                    double d5 = d3 - point3.f349192y;
                    Point point5 = point3;
                    int i5 = i2;
                    Point point6 = point4;
                    float f3 = f2;
                    i = i3;
                    int i6 = i4;
                    float calculateAngle = (float) calculateAngle(d - point.f349191x, d2 - d3, d4, d5);
                    if (arrayList.size() == 0) {
                        IAnimatorModel iAnimatorModel = this.mAnimatorModel;
                        if (iAnimatorModel != null) {
                            float rotation = iAnimatorModel.getRotation();
                            double[] a = this.mIValueAnimatorStrategy.mo178818a();
                            calculateAngle = ((float) calculateAngle(a[0], a[1], point5.f349191x - point6.f349191x, point6.f349192y - point5.f349192y)) - rotation;
                            f = rotation;
                            j = 0;
                        } else {
                            return;
                        }
                    } else {
                        long abs = (long) ((((double) this.mDuration) * (((((double) Math.abs(calculateAngle)) * 3.141592653589793d) * 6.0d) / 180.0d)) / this.mSumDistance);
                        j2 = calculateDelay(i5, i6) - (abs / 2);
                        j = abs;
                        f = f3;
                    }
                    float f4 = f + calculateAngle;
                    arrayList.add(createRotateAnimator(f, f4, j, j2));
                    i4 = i;
                    i2 = i6;
                    f2 = f4;
                } else {
                    int i7 = i2;
                    i = i3;
                    float f5 = f2;
                    int i8 = i4;
                    f2 = f5;
                }
                i3 = i + 1;
            } else {
                this.mRotateAnimatorSet.playSequentially(arrayList);
                return;
            }
        }
    }

    private void initValueAnimatorStrategy() {
        this.mIValueAnimatorStrategy = new C116374a() {
            /* renamed from: a */
            public final ValueAnimator mo178817a(float f, float f2) {
                if (C1163733.f349188a[RotateAnimationController.this.mModelType.ordinal()] != 1) {
                    return ValueAnimator.ofFloat(new float[]{f, f2});
                }
                return ValueAnimator.ofFloat(new float[]{f * -1.0f, f2 * -1.0f});
            }

            /* renamed from: a */
            public final double[] mo178818a() {
                double[] dArr = {0.0d, 1.0d};
                int[] iArr = C1163733.f349188a;
                RotateAnimationController.this.mModelType.ordinal();
                return dArr;
            }
        };
    }

    public void cancelAnimation() {
        if (this.mRotateEnabled) {
            this.mRotateAnimatorSet.cancel();
        }
    }

    public void endAnimation() {
        if (this.mRotateEnabled) {
            this.mRotateAnimatorSet.end();
        }
    }

    public void startAnimation() {
        if (this.mRotateEnabled && !this.mRotateAnimatorSet.isRunning()) {
            this.mRotateAnimatorSet.start();
        }
    }
}
