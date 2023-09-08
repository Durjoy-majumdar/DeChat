package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_add_emoji */
public class icons_filled_add_emoji extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 32;
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
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 2.24f, 0.0f, 1.0f, 2.24f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(11.76f, 23.52f);
                Path path = instancePath;
                path.cubicTo(5.2651315f, 23.52f, 0.0f, 18.25487f, 0.0f, 11.76f);
                path.cubicTo(0.0f, 5.2651315f, 5.2651315f, 0.0f, 11.76f, 0.0f);
                path.cubicTo(18.25487f, 0.0f, 23.52f, 5.2651315f, 23.52f, 11.76f);
                path.cubicTo(23.52f, 18.25487f, 18.25487f, 23.52f, 11.76f, 23.52f);
                instancePath.close();
                instancePath.moveTo(11.76f, 18.816f);
                instancePath.cubicTo(15.133969f, 18.816f, 17.904558f, 16.232622f, 18.201632f, 12.936f);
                instancePath.lineTo(5.3183675f, 12.936f);
                instancePath.cubicTo(5.6154423f, 16.232622f, 8.386031f, 18.816f, 11.76f, 18.816f);
                instancePath.close();
                instancePath.moveTo(7.644f, 9.996f);
                Path path2 = instancePath;
                path2.cubicTo(8.61823f, 9.996f, 9.408f, 9.20623f, 9.408f, 8.232f);
                path2.cubicTo(9.408f, 7.2577696f, 8.61823f, 6.468f, 7.644f, 6.468f);
                path2.cubicTo(6.66977f, 6.468f, 5.88f, 7.2577696f, 5.88f, 8.232f);
                path2.cubicTo(5.88f, 9.20623f, 6.66977f, 9.996f, 7.644f, 9.996f);
                instancePath.close();
                instancePath.moveTo(15.876f, 9.996f);
                Path path3 = instancePath;
                path3.cubicTo(16.850231f, 9.996f, 17.64f, 9.20623f, 17.64f, 8.232f);
                path3.cubicTo(17.64f, 7.2577696f, 16.850231f, 6.468f, 15.876f, 6.468f);
                path3.cubicTo(14.90177f, 6.468f, 14.112f, 7.2577696f, 14.112f, 8.232f);
                path3.cubicTo(14.112f, 9.20623f, 14.90177f, 9.996f, 15.876f, 9.996f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
