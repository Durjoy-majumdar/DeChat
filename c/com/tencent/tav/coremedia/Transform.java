package com.tencent.tav.coremedia;

import android.graphics.Matrix;

public class Transform {
    public float degrees;
    public final float scaleX;
    public final float scaleY;
    public final float translateX;
    public final float translateY;

    public Transform(float f, float f2, float f3, float f4, float f5) {
        this.scaleX = f;
        this.scaleY = f2;
        this.translateX = f3;
        this.translateY = f4;
        this.degrees = f5;
    }

    public static Transform instanceFromScale(float f, float f2) {
        return new Transform(f, f2, 0.0f, 0.0f, 0.0f);
    }

    public static Transform instanceFromTranslate(float f, float f2) {
        return new Transform(1.0f, 1.0f, f, f2, 0.0f);
    }

    public Matrix toMatrix() {
        Matrix matrix = new Matrix();
        matrix.postRotate(this.degrees);
        matrix.postScale(this.scaleX, this.scaleY);
        matrix.postTranslate(this.translateX, this.translateY);
        return matrix;
    }
}
