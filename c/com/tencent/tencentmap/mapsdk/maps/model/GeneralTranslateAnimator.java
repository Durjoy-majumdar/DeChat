package com.tencent.tencentmap.mapsdk.maps.model;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel;
import com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator;
import com.tencent.tencentmap.mapsdk.maps.model.transform.Point;
import com.tencent.tencentmap.mapsdk.maps.model.transform.SphericalMercatorProjection;
import java.util.ArrayList;
import java.util.List;

public class GeneralTranslateAnimator extends OverlayAnimator {
    private List<IAnimatorModel.IAnimatorEndListener> mAnimatorEndListeners;
    /* access modifiers changed from: private */
    public final IAnimatorModel mAnimatorModel;
    /* access modifiers changed from: private */
    public double[] mDistances;
    /* access modifiers changed from: private */
    public SphericalMercatorProjection mEarthMercatorProjection;
    private LatLng[] mLatLngs;
    private RotateAnimationController mRotateAnimationController;
    private double mSumDistance;

    public static class Builder {
        /* access modifiers changed from: private */
        public final IAnimatorModel animatorModel;
        /* access modifiers changed from: private */
        public final long duration;
        /* access modifiers changed from: private */
        public float initRotate = 0.0f;
        /* access modifiers changed from: private */
        public final LatLng[] latLngs;
        /* access modifiers changed from: private */
        public ModelType modelType = ModelType.MARKER_OVERLAY;
        /* access modifiers changed from: private */
        public boolean rotateEnabled = false;

        public Builder(IAnimatorModel iAnimatorModel, long j, LatLng[] latLngArr) {
            this.animatorModel = iAnimatorModel;
            this.duration = j;
            this.latLngs = latLngArr;
        }

        public GeneralTranslateAnimator build() {
            return new GeneralTranslateAnimator(this);
        }

        public Builder initRotate(float f) {
            this.initRotate = f;
            return this;
        }

        public Builder modelType(ModelType modelType2) {
            this.modelType = modelType2;
            return this;
        }

        public Builder rotateEnabled(boolean z) {
            this.rotateEnabled = z;
            return this;
        }
    }

    public enum ModelType {
        MARKER_OVERLAY,
        MODEL_OVERLAY
    }

    public GeneralTranslateAnimator(Builder builder) {
        super(builder.animatorModel, builder.duration);
        this.mAnimatorModel = builder.animatorModel;
        if (builder.latLngs != null && builder.latLngs.length > 0 && builder.duration >= 0) {
            this.mLatLngs = builder.latLngs;
            this.mAnimatorEndListeners = new ArrayList();
            this.mEarthMercatorProjection = new SphericalMercatorProjection();
            ArrayList arrayList = new ArrayList();
            this.mDistances = new double[(this.mLatLngs.length - 1)];
            int i = 0;
            while (true) {
                LatLng[] latLngArr = this.mLatLngs;
                if (i >= latLngArr.length - 1) {
                    break;
                }
                int i2 = i + 1;
                this.mDistances[i] = this.mEarthMercatorProjection.distanceBetween(latLngArr[i], latLngArr[i2]);
                this.mSumDistance += this.mDistances[i];
                i = i2;
            }
            for (int i3 = 0; i3 < this.mLatLngs.length - 1; i3++) {
                arrayList.add(createSegmentAnimator(i3));
            }
            getAnimatorSet().playSequentially(arrayList);
            this.mRotateAnimationController = new RotateAnimationController(builder.animatorModel, builder.duration, builder.modelType, builder.rotateEnabled, builder.initRotate, this.mLatLngs, this.mDistances, this.mSumDistance, this.mEarthMercatorProjection);
        }
    }

    public void addAnimatorEndListener(IAnimatorModel.IAnimatorEndListener iAnimatorEndListener) {
        List<IAnimatorModel.IAnimatorEndListener> list = this.mAnimatorEndListeners;
        if (list != null && !list.contains(iAnimatorEndListener) && iAnimatorEndListener != null) {
            this.mAnimatorEndListeners.add(iAnimatorEndListener);
            addAnimationListener();
        }
    }

    public void cancelAnimation() {
        super.cancelAnimation();
        if (this.mRotateAnimationController != null) {
            synchronized (this) {
                this.mRotateAnimationController.cancelAnimation();
            }
        }
    }

    public ValueAnimator createSegmentAnimator(final int i) {
        final Point point = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i]);
        final Point point2 = this.mEarthMercatorProjection.toPoint(this.mLatLngs[i + 1]);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) ((((double) getDuration()) * this.mDistances[i]) / this.mSumDistance));
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setFloatValues(new float[]{(float) this.mDistances[i]});
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (!point.equals(point2)) {
                    double parseDouble = Double.parseDouble(String.valueOf(valueAnimator.getAnimatedValue()));
                    double d = point.f349191x;
                    double d2 = d + (((point2.f349191x - d) * parseDouble) / GeneralTranslateAnimator.this.mDistances[i]);
                    double d3 = point.f349192y;
                    double d4 = d3 + (((point2.f349192y - d3) * parseDouble) / GeneralTranslateAnimator.this.mDistances[i]);
                    if (GeneralTranslateAnimator.this.mAnimatorModel != null) {
                        GeneralTranslateAnimator.this.mAnimatorModel.setPosition(GeneralTranslateAnimator.this.mEarthMercatorProjection.toLatLng(new Point(d2, d4)));
                    }
                }
            }
        });
        return valueAnimator;
    }

    public void endAnimation() {
        super.endAnimation();
        if (this.mRotateAnimationController != null) {
            synchronized (this) {
                this.mRotateAnimationController.endAnimation();
            }
        }
    }

    public void innerAnimationEnd() {
        List<IAnimatorModel.IAnimatorEndListener> list = this.mAnimatorEndListeners;
        if (list != null) {
            for (IAnimatorModel.IAnimatorEndListener onAnimatorEnd : list) {
                onAnimatorEnd.onAnimatorEnd();
            }
        }
    }

    public void removeAnimatorEndListener(IAnimatorModel.IAnimatorEndListener iAnimatorEndListener) {
        List<IAnimatorModel.IAnimatorEndListener> list = this.mAnimatorEndListeners;
        if (list != null) {
            list.remove(iAnimatorEndListener);
            removeAnimationListener();
        }
    }

    public void startAnimation() {
        super.startAnimation();
        if (this.mRotateAnimationController != null) {
            synchronized (this) {
                this.mRotateAnimationController.startAnimation();
            }
        }
    }
}
