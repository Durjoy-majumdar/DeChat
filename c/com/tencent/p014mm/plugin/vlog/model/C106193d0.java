package com.tencent.p014mm.plugin.vlog.model;

import android.graphics.Matrix;
import android.graphics.RectF;
import gy3.C87412m;

/* renamed from: com.tencent.mm.plugin.vlog.model.d0 */
public final class C106193d0 {
    /* renamed from: a */
    public static final float m142869a(Matrix matrix) {
        C87412m.m108594g(matrix, "<this>");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f = fArr[0];
        float f2 = fArr[3];
        return (float) Math.sqrt((double) ((f * f) + (f2 * f2)));
    }

    /* renamed from: b */
    public static final void m142870b(Matrix matrix, RectF rectF, RectF rectF2) {
        C87412m.m108594g(matrix, "<this>");
        C87412m.m108594g(rectF, "src");
        C87412m.m108594g(rectF2, "dst");
        matrix.reset();
        float max = Math.max(rectF2.height() / rectF.height(), rectF2.width() / rectF.width());
        matrix.postTranslate(-rectF.centerX(), -rectF.centerY());
        matrix.postScale(max, max);
        matrix.postTranslate(rectF2.centerX(), rectF2.centerY());
    }
}
