package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.poi_navigation */
public class poi_navigation extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
                Canvas canvas = objArr[0];
                Looper looper = objArr[1];
                Matrix instanceMatrix = C24542c.instanceMatrix(looper);
                float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 11.171573f, 0.70710677f, 0.70710677f, -6.970563f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(14.464238f, 1.1605959f);
                instancePath.lineTo(21.408022f, 18.520058f);
                Path path = instancePath;
                path.cubicTo(21.51058f, 18.77645f, 21.385872f, 19.067434f, 21.12948f, 19.16999f);
                path.cubicTo(20.977533f, 19.230768f, 20.805462f, 19.213343f, 20.668787f, 19.123337f);
                instancePath.lineTo(14.0f, 14.731639f);
                instancePath.lineTo(14.0f, 14.731639f);
                instancePath.lineTo(7.3312135f, 19.123337f);
                Path path2 = instancePath;
                path2.cubicTo(7.1005883f, 19.275213f, 6.7905087f, 19.211374f, 6.638632f, 18.98075f);
                path2.cubicTo(6.5486245f, 18.844074f, 6.531199f, 18.672003f, 6.591977f, 18.520058f);
                instancePath.lineTo(13.535762f, 1.1605959f);
                path2.cubicTo(13.638318f, 0.90420413f, 13.929303f, 0.77949613f, 14.185696f, 0.88205284f);
                path2.cubicTo(14.312747f, 0.93287337f, 14.413418f, 1.0335445f, 14.464238f, 1.1605959f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
