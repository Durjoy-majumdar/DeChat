package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icon_outlined_mini_window_2 */
public class finder_icon_outlined_mini_window_2 extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.2f, 0.0f, 1.0f, 10.2f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(45.84045f, 24.0f);
        Path path = instancePath;
        path.cubicTo(48.86989f, 24.0f, 51.35305f, 26.338902f, 51.582672f, 29.309444f);
        instancePath.lineTo(51.6f, 29.75955f);
        instancePath.lineTo(51.6f, 45.3f);
        path.cubicTo(51.6f, 48.628117f, 49.019333f, 51.353485f, 45.74992f, 51.584183f);
        instancePath.lineTo(45.3f, 51.6f);
        instancePath.lineTo(30.3f, 51.6f);
        path.cubicTo(26.971884f, 51.6f, 24.246515f, 49.019333f, 24.015818f, 45.74992f);
        instancePath.lineTo(24.0f, 45.3f);
        instancePath.lineTo(24.0f, 30.3f);
        path.cubicTo(24.0f, 26.971884f, 26.580667f, 24.246515f, 29.85008f, 24.015818f);
        instancePath.lineTo(30.3f, 24.0f);
        instancePath.lineTo(45.84045f, 24.0f);
        instancePath.close();
        instancePath.moveTo(45.84045f, 27.6f);
        instancePath.lineTo(30.3f, 27.6f);
        path.cubicTo(28.923536f, 27.6f, 27.787645f, 28.63001f, 27.621037f, 29.961317f);
        instancePath.lineTo(27.6f, 30.3f);
        instancePath.lineTo(27.6f, 45.3f);
        path.cubicTo(27.6f, 46.676464f, 28.63001f, 47.812355f, 29.961317f, 47.978962f);
        instancePath.lineTo(30.3f, 48.0f);
        instancePath.lineTo(45.3f, 48.0f);
        path.cubicTo(46.676464f, 48.0f, 47.812355f, 46.96999f, 47.978962f, 45.638683f);
        instancePath.lineTo(48.0f, 45.3f);
        instancePath.lineTo(48.0f, 29.75955f);
        path.cubicTo(48.0f, 28.666254f, 47.187565f, 27.762712f, 46.133488f, 27.619715f);
        instancePath.lineTo(45.84045f, 27.6f);
        instancePath.close();
        instancePath.moveTo(37.8f, 0.0f);
        path.cubicTo(40.30369f, 0.0f, 42.35967f, 1.9168845f, 42.580383f, 4.363102f);
        instancePath.lineTo(42.6f, 4.8f);
        instancePath.lineTo(42.6f, 18.0f);
        instancePath.lineTo(39.0f, 18.0f);
        instancePath.lineTo(39.0f, 4.8f);
        path.cubicTo(39.0f, 4.220101f, 38.58866f, 3.7362752f, 38.041843f, 3.6243796f);
        instancePath.lineTo(37.8f, 3.6f);
        instancePath.lineTo(4.8f, 3.6f);
        path.cubicTo(4.220101f, 3.6f, 3.7362752f, 4.011338f, 3.6243796f, 4.558158f);
        instancePath.lineTo(3.6f, 4.8f);
        instancePath.lineTo(3.6f, 37.8f);
        path.cubicTo(3.6f, 38.379898f, 4.011338f, 38.863724f, 4.558158f, 38.97562f);
        instancePath.lineTo(4.8f, 39.0f);
        instancePath.lineTo(18.0f, 39.0f);
        instancePath.lineTo(18.0f, 42.6f);
        instancePath.lineTo(4.8f, 42.6f);
        path.cubicTo(2.2963092f, 42.6f, 0.24033065f, 40.683117f, 0.019616032f, 38.236897f);
        instancePath.lineTo(0.0f, 37.8f);
        instancePath.lineTo(0.0f, 4.8f);
        path.cubicTo(0.0f, 2.2963092f, 1.9168845f, 0.24033065f, 4.363102f, 0.019616032f);
        instancePath.lineTo(4.8f, 0.0f);
        instancePath.lineTo(37.8f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
