package com.tencent.tav.core;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;

public class CGMathFunctions {
    public static CGRect initGLViewportDefault(CGSize cGSize, CGSize cGSize2) {
        return new CGRect(new PointF((cGSize.width - cGSize2.width) / 2.0f, (cGSize.height - cGSize2.height) / 2.0f), cGSize2);
    }

    public static CGRect initGLViewportFill(CGSize cGSize, CGSize cGSize2) {
        float f;
        float f2 = cGSize2.height;
        float f3 = cGSize2.width;
        float f4 = cGSize.height;
        float f5 = cGSize.width;
        float f6 = 0.0f;
        if (f5 / f4 > f3 / f2) {
            float f7 = (f2 * f5) / f3;
            f = (f4 - f7) / 2.0f;
            f4 = f7;
        } else {
            float f8 = (f3 * f4) / f2;
            f6 = (f5 - f8) / 2.0f;
            f5 = f8;
            f = 0.0f;
        }
        return new CGRect(new PointF(f6, f), new CGSize(f5, f4));
    }

    public static CGRect initGLViewportFit(CGSize cGSize, CGSize cGSize2) {
        float f;
        float f2 = cGSize2.height;
        float f3 = cGSize2.width;
        float f4 = cGSize.height;
        float f5 = cGSize.width;
        float f6 = 0.0f;
        if (f5 / f4 > f3 / f2) {
            float f7 = (f3 * f4) / f2;
            f6 = (f5 - f7) / 2.0f;
            f5 = f7;
            f = 0.0f;
        } else {
            float f8 = (f2 * f5) / f3;
            f = (f4 - f8) / 2.0f;
            f4 = f8;
        }
        return new CGRect(new PointF(f6, f), new CGSize(f5, f4));
    }

    private static CGRect rectFill(CGRect cGRect, CGRect cGRect2) {
        CGSize sizeFill = sizeFill(cGRect.size, cGRect2.size);
        PointF pointF = cGRect2.origin;
        float f = pointF.x;
        CGSize cGSize = cGRect2.size;
        float f2 = cGSize.width;
        float f3 = sizeFill.width;
        float f4 = pointF.y;
        float f5 = cGSize.height;
        float f6 = sizeFill.height;
        return new CGRect(f + ((f2 - f3) / 2.0f), f4 + ((f5 - f6) / 2.0f), f3, f6);
    }

    private static CGRect rectFit(CGRect cGRect, CGRect cGRect2) {
        CGSize sizeFit = sizeFit(cGRect.size, cGRect2.size);
        PointF pointF = cGRect2.origin;
        float f = pointF.x;
        CGSize cGSize = cGRect2.size;
        float f2 = cGSize.width;
        float f3 = sizeFit.width;
        float f4 = pointF.y;
        float f5 = cGSize.height;
        float f6 = sizeFit.height;
        return new CGRect(f + ((f2 - f3) / 2.0f), f4 + ((f5 - f6) / 2.0f), f3, f6);
    }

    private static CGSize sizeFill(CGSize cGSize, CGSize cGSize2) {
        CGSize clone = cGSize2.clone();
        float f = cGSize2.width;
        float f2 = cGSize.width;
        float f3 = f / f2;
        float f4 = cGSize2.height;
        float f5 = cGSize.height;
        float f6 = f4 / f5;
        if (f6 > f3) {
            clone.width = f6 * f2;
        } else if (f3 > f6) {
            clone.height = f3 * f5;
        }
        return clone;
    }

    public static CGSize sizeFit(CGSize cGSize, CGSize cGSize2) {
        CGSize clone = cGSize2.clone();
        float f = cGSize2.width;
        float f2 = cGSize.width;
        float f3 = f / f2;
        float f4 = cGSize2.height;
        float f5 = cGSize.height;
        float f6 = f4 / f5;
        if (f6 < f3) {
            clone.width = (float) Math.round(f6 * f2);
        } else if (f3 < f6) {
            clone.height = (float) Math.round(f3 * f5);
        }
        return clone;
    }

    public static Matrix transformByScaleFitRect(CGRect cGRect, CGRect cGRect2) {
        Matrix matrix = new Matrix();
        CGSize cGSize = cGRect2.size;
        float f = cGSize.width;
        CGSize cGSize2 = cGRect.size;
        matrix.postScale(f / cGSize2.width, cGSize.height / cGSize2.height);
        return matrix;
    }

    public static Matrix transformBySourceRectFill(CGRect cGRect, CGRect cGRect2) {
        CGRect rectFill = rectFill(cGRect, cGRect2);
        CGSize cGSize = rectFill.size;
        float f = cGSize.width;
        CGSize cGSize2 = cGRect.size;
        float f2 = f / cGSize2.width;
        float f3 = cGSize.height / cGSize2.height;
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f3);
        PointF pointF = rectFill.origin;
        float f4 = pointF.x;
        PointF pointF2 = cGRect.origin;
        matrix.postTranslate(f4 - (pointF2.x * f2), pointF.y - (pointF2.y * f3));
        return matrix;
    }

    public static Matrix transformBySourceRectFit(CGRect cGRect, CGRect cGRect2) {
        CGRect rectFit = rectFit(cGRect, cGRect2);
        CGSize cGSize = rectFit.size;
        float f = cGSize.width;
        CGSize cGSize2 = cGRect.size;
        float f2 = f / cGSize2.width;
        float f3 = cGSize.height / cGSize2.height;
        Matrix matrix = new Matrix();
        PointF pointF = rectFit.origin;
        float f4 = pointF.x;
        PointF pointF2 = cGRect.origin;
        matrix.postScale(f2, f3);
        matrix.postTranslate(f4 - (pointF2.x * f2), pointF.y - (pointF2.y * f3));
        return matrix;
    }
}
