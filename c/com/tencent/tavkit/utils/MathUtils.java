package com.tencent.tavkit.utils;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.tencent.tav.coremedia.CGRect;
import com.tencent.tav.coremedia.CGSize;

public class MathUtils {
    public static CGRect rect(CGRect cGRect, CGRect cGRect2) {
        CGSize size = size(cGRect.size, cGRect2.size);
        PointF pointF = cGRect2.origin;
        float f = pointF.x;
        CGSize cGSize = cGRect2.size;
        float f2 = cGSize.width;
        float f3 = size.width;
        float f4 = pointF.y;
        float f5 = cGSize.height;
        float f6 = size.height;
        return new CGRect(f + ((f2 - f3) / 2.0f), f4 + ((f5 - f6) / 2.0f), f3, f6);
    }

    public static CGRect rectFill(CGRect cGRect, CGRect cGRect2) {
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

    public static CGRect rectFit(CGRect cGRect, CGRect cGRect2) {
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

    public static CGSize size(CGSize cGSize, CGSize cGSize2) {
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

    public static CGSize sizeFill(CGSize cGSize, CGSize cGSize2) {
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

    public static CGSize sizeScale(CGSize cGSize, CGSize cGSize2) {
        return cGSize2;
    }

    public static Matrix transformBySourceRect(CGRect cGRect, CGRect cGRect2) {
        CGRect rect = rect(cGRect, cGRect2);
        CGSize cGSize = rect.size;
        float f = cGSize.width;
        CGSize cGSize2 = cGRect.size;
        float f2 = f / cGSize2.width;
        float f3 = cGSize.height / cGSize2.height;
        Matrix matrix = new Matrix();
        matrix.postScale(f2, f3);
        PointF pointF = rect.origin;
        float f4 = pointF.x;
        PointF pointF2 = cGRect.origin;
        matrix.postTranslate(f4 - (pointF2.x * f2), pointF.y - (pointF2.y * f3));
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
