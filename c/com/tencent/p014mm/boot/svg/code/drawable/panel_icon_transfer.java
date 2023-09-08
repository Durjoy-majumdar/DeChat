package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_transfer */
public class panel_icon_transfer extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 192;
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
                instancePaint3.setColor(-13421773);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(57.0f, 42.0f);
                instancePath.lineTo(71.83607f, 42.0f);
                Path path = instancePath;
                path.cubicTo(73.49293f, 42.0f, 74.83607f, 43.343147f, 74.83607f, 45.0f);
                path.cubicTo(74.83607f, 45.95563f, 74.38078f, 46.85409f, 73.61016f, 47.419216f);
                instancePath.lineTo(39.985905f, 72.077f);
                Path path2 = instancePath;
                path2.cubicTo(39.31786f, 72.5669f, 38.379154f, 72.422485f, 37.889256f, 71.75444f);
                path2.cubicTo(37.593067f, 71.35055f, 37.51801f, 70.82548f, 37.68917f, 70.35478f);
                instancePath.lineTo(44.727272f, 51.0f);
                instancePath.lineTo(3.0f, 51.0f);
                instancePath.cubicTo(1.3431457f, 51.0f, 2.0290612E-16f, 49.656853f, 0.0f, 48.0f);
                instancePath.lineTo(0.0f, 45.0f);
                instancePath.cubicTo(-2.0290612E-16f, 43.343147f, 1.3431457f, 42.0f, 3.0f, 42.0f);
                instancePath.lineTo(57.0f, 42.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(30.272728f, 24.0f);
                instancePath2.lineTo(75.0f, 24.0f);
                instancePath2.cubicTo(76.65685f, 24.0f, 78.0f, 25.343145f, 78.0f, 27.0f);
                instancePath2.lineTo(78.0f, 30.0f);
                instancePath2.cubicTo(78.0f, 31.656855f, 76.65685f, 33.0f, 75.0f, 33.0f);
                instancePath2.lineTo(21.0f, 33.0f);
                instancePath2.lineTo(3.1639297f, 33.0f);
                Path path3 = instancePath2;
                path3.cubicTo(1.5070753f, 33.0f, 0.16392961f, 31.656855f, 0.16392961f, 30.0f);
                path3.cubicTo(0.16392961f, 29.044369f, 0.6192133f, 28.14591f, 1.3898386f, 27.580786f);
                instancePath2.lineTo(35.014095f, 2.9229982f);
                Path path4 = instancePath2;
                path4.cubicTo(35.68214f, 2.4330964f, 36.620846f, 2.5775125f, 37.110744f, 3.2455602f);
                path4.cubicTo(37.406933f, 3.6494505f, 37.48199f, 4.174522f, 37.31083f, 4.6452203f);
                instancePath2.lineTo(30.272728f, 24.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
