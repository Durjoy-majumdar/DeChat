package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.tags_icon */
public class tags_icon extends C24542c {
    private final int height = 49;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 48;
        }
        if (i2 == 1) {
            return 49;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-6381921);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(26.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(27.716187f, -0.38932037f, 29.024296f, 0.74794596f, 30.0f, 2.0f);
        path.cubicTo(35.235313f, 7.012887f, 40.407833f, 12.2004175f, 46.0f, 17.0f);
        path.cubicTo(46.718708f, 18.575094f, 48.416252f, 19.832073f, 48.0f, 22.0f);
        path.cubicTo(47.178043f, 23.263824f, 45.800037f, 24.361187f, 45.0f, 26.0f);
        path.cubicTo(37.232426f, 32.78095f, 30.132692f, 40.32282f, 23.0f, 47.0f);
        path.cubicTo(17.980267f, 48.602917f, 12.877645f, 47.56541f, 8.0f, 48.0f);
        path.cubicTo(5.478345f, 47.61529f, 1.5440342f, 48.99198f, 0.0f, 46.0f);
        path.cubicTo(-0.07362649f, 39.285313f, -0.06364093f, 32.591404f, 0.0f, 26.0f);
        path.cubicTo(5.857796f, 19.403105f, 12.418309f, 13.626988f, 18.0f, 7.0f);
        path.cubicTo(21.025862f, 4.9977307f, 23.172756f, 2.1046848f, 26.0f, 0.0f);
        instancePath.lineTo(26.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(4.0f, 27.0f);
        path.cubicTo(4.0197816f, 32.796772f, 4.0098906f, 38.393444f, 4.0f, 44.0f);
        path.cubicTo(8.945341f, 43.990112f, 13.880792f, 43.980225f, 19.0f, 44.0f);
        path.cubicTo(26.560646f, 36.504814f, 34.285267f, 28.979963f, 42.0f, 21.0f);
        path.cubicTo(36.856846f, 16.30341f, 31.7038f, 11.151705f, 27.0f, 6.0f);
        path.cubicTo(19.033836f, 13.069998f, 11.507028f, 20.120218f, 4.0f, 27.0f);
        instancePath.lineTo(4.0f, 27.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(12.0f, 31.0f);
        Path path2 = instancePath2;
        path2.cubicTo(14.287206f, 29.916079f, 17.727032f, 32.54695f, 17.0f, 35.0f);
        path2.cubicTo(16.355257f, 37.92308f, 12.759549f, 38.921356f, 11.0f, 37.0f);
        path2.cubicTo(9.3509f, 35.43779f, 9.828942f, 32.505356f, 12.0f, 31.0f);
        instancePath2.lineTo(12.0f, 31.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
