package com.tencent.tencentmap.mapsdk.vector.compat.utils.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import com.tencent.mapsdk.raster.model.LatLng;
import com.tencent.mapsdk.raster.model.Marker;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116377b;
import com.tencent.tencentmap.mapsdk.vector.compat.utils.p900a.C116378c;
import java.util.ArrayList;

public class MarkerTranslateAnimator extends OverlayAnimator {

    /* renamed from: a */
    private LatLng[] f349215a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public double[] f349216b;

    /* renamed from: c */
    private double f349217c;

    /* renamed from: d */
    private boolean f349218d;

    /* renamed from: e */
    private AnimatorSet f349219e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C116378c f349220f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile boolean f349221g;

    public MarkerTranslateAnimator(Marker marker, long j, LatLng[] latLngArr) {
        this(marker, j, latLngArr, false);
    }

    public void cancelAnimation() {
        AnimatorSet animatorSet;
        super.cancelAnimation();
        synchronized (this) {
            if (this.f349218d && (animatorSet = this.f349219e) != null) {
                animatorSet.cancel();
            }
        }
    }

    public ValueAnimator createSegmentAnimator(final int i) {
        final C116377b a = this.f349220f.mo178914a(this.f349215a[i]);
        final C116377b a2 = this.f349220f.mo178914a(this.f349215a[i + 1]);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration((long) ((((double) getDuration()) * this.f349216b[i]) / this.f349217c));
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.setFloatValues(new float[]{(float) this.f349216b[i]});
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (!a.equals(a2)) {
                    double parseDouble = Double.parseDouble(String.valueOf(valueAnimator.getAnimatedValue()));
                    double d = a.f349207a;
                    double d2 = d + (((a2.f349207a - d) * parseDouble) / MarkerTranslateAnimator.this.f349216b[i]);
                    double d3 = a.f349208b;
                    double d4 = d3 + (((a2.f349208b - d3) * parseDouble) / MarkerTranslateAnimator.this.f349216b[i]);
                    if (MarkerTranslateAnimator.this.getObject() != null) {
                        ((Marker) MarkerTranslateAnimator.this.getObject()).setPosition(MarkerTranslateAnimator.this.f349220f.mo178913a(new C116377b(d2, d4)));
                    }
                }
            }
        });
        return valueAnimator;
    }

    public void endAnimation() {
        AnimatorSet animatorSet;
        super.endAnimation();
        synchronized (this) {
            if (this.f349218d && (animatorSet = this.f349219e) != null) {
                animatorSet.end();
            }
        }
    }

    public void startAnimation() {
        super.startAnimation();
        synchronized (this) {
            if (this.f349218d && this.f349219e != null && !this.f349221g) {
                this.f349221g = true;
                this.f349219e.start();
            }
        }
    }

    public MarkerTranslateAnimator(Marker marker, long j, LatLng[] latLngArr, boolean z) {
        super(marker, j);
        this.f349221g = false;
        if (latLngArr != null) {
            this.f349215a = latLngArr;
            this.f349216b = new double[(latLngArr.length - 1)];
            this.f349220f = new C116378c();
            int i = 0;
            while (i < latLngArr.length - 1) {
                int i2 = i + 1;
                this.f349216b[i] = this.f349220f.mo178912a(latLngArr[i], latLngArr[i2]);
                this.f349217c += this.f349216b[i];
                i = i2;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < latLngArr.length - 1; i3++) {
                arrayList.add(createSegmentAnimator(i3));
            }
            getAnimatorSet().playSequentially(arrayList);
            this.f349218d = z;
            if (z) {
                m164054a();
            }
        }
    }

    /* renamed from: a */
    private void m164054a() {
        int i;
        int i2;
        long j;
        float f;
        AnimatorSet animatorSet = new AnimatorSet();
        this.f349219e = animatorSet;
        animatorSet.addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
                boolean unused = MarkerTranslateAnimator.this.f349221g = false;
            }

            public void onAnimationEnd(Animator animator) {
                boolean unused = MarkerTranslateAnimator.this.f349221g = false;
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        });
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        float f2 = 0.0f;
        long j2 = 0;
        while (true) {
            LatLng[] latLngArr = this.f349215a;
            if (i3 < latLngArr.length) {
                if (latLngArr[i4].equals(latLngArr[i3])) {
                    i = i3;
                } else {
                    C116377b a = this.f349220f.mo178914a(this.f349215a[i5]);
                    C116377b a2 = this.f349220f.mo178914a(this.f349215a[i4]);
                    C116377b a3 = this.f349220f.mo178914a(this.f349215a[i3]);
                    double d = a2.f349207a;
                    double d2 = a.f349208b;
                    double d3 = a2.f349208b;
                    double d4 = d2 - d3;
                    i = i3;
                    int i6 = i4;
                    double d5 = a3.f349207a - d;
                    double d6 = d3 - a3.f349208b;
                    double d7 = d4;
                    double d8 = d5;
                    C116377b bVar = a2;
                    C116377b bVar2 = a3;
                    float a4 = (float) m164051a(d - a.f349207a, d7, d8, d6);
                    if (arrayList.size() != 0) {
                        long duration = (long) ((((double) getDuration()) * (((((double) Math.abs(a4)) * 3.141592653589793d) * 6.0d) / 180.0d)) / this.f349217c);
                        i2 = i6;
                        j2 = m164052a(i5, i2) - (duration / 2);
                        j = duration;
                        f = f2;
                    } else if (getObject() != null) {
                        float rotation = ((Marker) getObject()).getRotation();
                        a4 = ((float) m164051a(0.0d, 1.0d, bVar2.f349207a - bVar.f349207a, bVar.f349208b - bVar2.f349208b)) - rotation;
                        f = rotation;
                        i2 = i6;
                        j = 0;
                    } else {
                        return;
                    }
                    float f3 = f + a4;
                    arrayList.add(m164053a(f, f3, j, j2));
                    i5 = i2;
                    f2 = f3;
                    i4 = i;
                }
                i3 = i + 1;
            } else {
                this.f349219e.playSequentially(arrayList);
                return;
            }
        }
    }

    /* renamed from: a */
    private double m164051a(double d, double d2, double d3, double d4) {
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

    /* renamed from: a */
    private long m164052a(int i, int i2) {
        double d = 0.0d;
        while (i < i2) {
            d += this.f349216b[i];
            i++;
        }
        return (long) ((((double) getDuration()) * d) / this.f349217c);
    }

    /* renamed from: a */
    private ValueAnimator m164053a(float f, float f2, long j, long j2) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(j);
        ofFloat.setStartDelay(j2);
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                double parseDouble = Double.parseDouble(String.valueOf(valueAnimator.getAnimatedValue()));
                if (MarkerTranslateAnimator.this.getObject() != null) {
                    ((Marker) MarkerTranslateAnimator.this.getObject()).setRotation((float) parseDouble);
                }
            }
        });
        return ofFloat;
    }
}
