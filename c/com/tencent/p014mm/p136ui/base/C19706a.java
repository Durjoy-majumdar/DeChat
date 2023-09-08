package com.tencent.p014mm.p136ui.base;

import android.graphics.Matrix;
import android.graphics.PointF;

/* renamed from: com.tencent.mm.ui.base.a */
public interface C19706a {

    /* renamed from: com.tencent.mm.ui.base.a$a */
    public interface C19707a {
        /* renamed from: a */
        void mo26082a(float f, float f2);
    }

    /* renamed from: a */
    void mo26056a(float f, float f2);

    /* renamed from: b */
    boolean mo26057b();

    /* renamed from: c */
    void mo26058c();

    /* renamed from: d */
    void mo26059d();

    /* renamed from: e */
    boolean mo26060e();

    /* renamed from: f */
    PointF mo26061f(PointF pointF, int i, int i2);

    float getDoubleTabScale();

    int getImageHeight();

    Matrix getImageMatrix();

    PointF getImageViewMatrixScale();

    PointF getImageViewMatrixTranslation();

    int getImageWidth();

    float getScale();

    float getScaleRate();

    /* renamed from: h */
    PointF mo26070h(PointF pointF);

    /* renamed from: i */
    void mo26071i(float f, float f2, float f3);

    /* renamed from: k */
    void mo26072k(float f, float f2);

    /* renamed from: l */
    void mo26073l(float f, float f2, float f3);

    /* renamed from: m */
    void mo26074m();

    /* renamed from: n */
    float mo26075n(float f, float f2);

    /* renamed from: o */
    void mo26076o();

    void setCanRefresh(boolean z);

    void setCustomScaleRate(Float f);

    void setImageViewMatrix(Matrix matrix);

    void setMaxZoomLimit(float f);

    void setOnZoomScaleChangedListener(C19707a aVar);
}
