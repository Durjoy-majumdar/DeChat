package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_poi_more */
public class icon_poi_more extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
        }
        if (i == 2) {
            Canvas canvas = objArr[0];
            Looper looper = objArr[1];
            C24542c.instanceMatrix(looper);
            C24542c.instanceMatrixArray(looper);
            Paint instancePaint = C24542c.instancePaint(looper);
            instancePaint.setFlags(385);
            instancePaint.setStyle(Paint.Style.FILL);
            Paint instancePaint2 = C24542c.instancePaint(looper);
            instancePaint2.setFlags(385);
            instancePaint2.setStyle(Paint.Style.STROKE);
            instancePaint.setColor(-16777216);
            instancePaint2.setStrokeWidth(1.0f);
            instancePaint2.setStrokeCap(Paint.Cap.BUTT);
            instancePaint2.setStrokeJoin(Paint.Join.MITER);
            instancePaint2.setStrokeMiter(4.0f);
            instancePaint2.setPathEffect((PathEffect) null);
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-2565928);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(72.0f, 0.0f);
            instancePath.lineTo(72.0f, 72.0f);
            instancePath.lineTo(0.0f, 72.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
            canvas.restore();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-2565928);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.0f, 0.0f);
            instancePath2.lineTo(72.0f, 0.0f);
            instancePath2.lineTo(72.0f, 72.0f);
            instancePath2.lineTo(0.0f, 72.0f);
            instancePath2.lineTo(0.0f, 0.0f);
            instancePath2.close();
            canvas.saveLayerAlpha((RectF) null, 0, 31);
            canvas.drawPath(instancePath2, C24542c.instancePaint(instancePaint4, looper));
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-16777216);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(18.0f, 18.0f);
            instancePath3.lineTo(54.0f, 18.0f);
            instancePath3.lineTo(54.0f, 24.0f);
            instancePath3.lineTo(18.0f, 24.0f);
            instancePath3.lineTo(18.0f, 18.0f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
            instancePaint6.setColor(-16777216);
            Path instancePath4 = C24542c.instancePath(looper);
            instancePath4.moveTo(18.0f, 33.0f);
            instancePath4.lineTo(54.0f, 33.0f);
            instancePath4.lineTo(54.0f, 39.0f);
            instancePath4.lineTo(18.0f, 39.0f);
            instancePath4.lineTo(18.0f, 33.0f);
            instancePath4.close();
            canvas.drawPath(instancePath4, instancePaint6);
            canvas.restore();
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
            instancePaint7.setColor(-16777216);
            Path instancePath5 = C24542c.instancePath(looper);
            instancePath5.moveTo(18.0f, 48.0f);
            instancePath5.lineTo(54.0f, 48.0f);
            instancePath5.lineTo(54.0f, 54.0f);
            instancePath5.lineTo(18.0f, 54.0f);
            instancePath5.lineTo(18.0f, 48.0f);
            instancePath5.close();
            canvas.drawPath(instancePath5, instancePaint7);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
