package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mmsight_camera_preview_icon_done */
public class mmsight_camera_preview_icon_done extends C24542c {
    private final int height = 240;
    private final int width = 240;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 240;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-15028967);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 68.0f, 0.0f, 1.0f, 85.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(13.540069f, 40.015434f);
                instancePath.cubicTo(12.961421f, 39.417805f, 12.934421f, 38.432583f, 13.489049f, 37.804356f);
                instancePath.lineTo(15.936921f, 35.03166f);
                instancePath.cubicTo(16.48739f, 34.408142f, 17.474325f, 34.316227f, 18.125168f, 34.814026f);
                instancePath.lineTo(37.615322f, 49.72111f);
                instancePath.cubicTo(38.273388f, 50.224434f, 39.324657f, 50.21021f, 39.97293f, 49.68157f);
                instancePath.lineTo(89.95811f, 8.920589f);
                instancePath.cubicTo(90.60211f, 8.395429f, 91.602684f, 8.439274f, 92.19417f, 9.019729f);
                instancePath.lineTo(93.4955f, 10.296785f);
                instancePath.cubicTo(94.08643f, 10.876699f, 94.083435f, 11.820237f, 93.50139f, 12.391867f);
                instancePath.lineTo(39.869316f, 65.06429f);
                instancePath.cubicTo(39.28163f, 65.64146f, 38.337345f, 65.62612f, 37.75749f, 65.027245f);
                instancePath.lineTo(13.540069f, 40.015434f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
