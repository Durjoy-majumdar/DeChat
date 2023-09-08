package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_eyes_on */
public class icons_outlined_eyes_on extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 15.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(33.0f, 38.4f);
            Path path = instancePath;
            path.cubicTo(45.102955f, 38.4f, 56.058674f, 31.649624f, 61.943615f, 21.0f);
            path.cubicTo(56.058674f, 10.350376f, 45.102955f, 3.6f, 33.0f, 3.6f);
            path.cubicTo(20.897047f, 3.6f, 9.941325f, 10.350376f, 4.0563836f, 21.0f);
            path.cubicTo(9.941325f, 31.649624f, 20.897047f, 38.4f, 33.0f, 38.4f);
            instancePath.close();
            instancePath.moveTo(33.0f, 0.0f);
            Path path2 = instancePath;
            path2.cubicTo(47.42337f, 0.0f, 59.91619f, 8.542883f, 66.0f, 21.0f);
            path2.cubicTo(59.91619f, 33.45712f, 47.42337f, 42.0f, 33.0f, 42.0f);
            path2.cubicTo(18.576628f, 42.0f, 6.0838094f, 33.45712f, -1.0963674E-11f, 21.0f);
            path2.cubicTo(6.0838094f, 8.542883f, 18.576628f, 0.0f, 33.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(33.0f, 29.4f);
            Path path3 = instancePath;
            path3.cubicTo(37.63919f, 29.4f, 41.4f, 25.639193f, 41.4f, 21.0f);
            path3.cubicTo(41.4f, 16.360807f, 37.63919f, 12.6f, 33.0f, 12.6f);
            path3.cubicTo(28.360807f, 12.6f, 24.6f, 16.360807f, 24.6f, 21.0f);
            path3.cubicTo(24.6f, 25.639193f, 28.360807f, 29.4f, 33.0f, 29.4f);
            instancePath.close();
            instancePath.moveTo(33.0f, 33.0f);
            path3.cubicTo(26.372583f, 33.0f, 21.0f, 27.627417f, 21.0f, 21.0f);
            path3.cubicTo(21.0f, 14.372583f, 26.372583f, 9.0f, 33.0f, 9.0f);
            path3.cubicTo(39.62742f, 9.0f, 45.0f, 14.372583f, 45.0f, 21.0f);
            path3.cubicTo(45.0f, 27.627417f, 39.62742f, 33.0f, 33.0f, 33.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
