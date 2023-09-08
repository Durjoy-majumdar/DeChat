package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.collect_main_screenshot_cover_icon */
public class collect_main_screenshot_cover_icon extends C24542c {
    private final int height = 56;
    private final int width = 56;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 56;
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
                instancePaint3.setColor(1275068416);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -508.0f, 0.0f, 1.0f, -303.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 508.0f, 0.0f, 1.0f, 303.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(28.0f, 4.6666665f);
                Path path = instancePath;
                path.cubicTo(40.886642f, 4.6666665f, 51.333332f, 15.113356f, 51.333332f, 28.0f);
                path.cubicTo(51.333332f, 40.886642f, 40.886642f, 51.333332f, 28.0f, 51.333332f);
                path.cubicTo(15.113356f, 51.333332f, 4.6666665f, 40.886642f, 4.6666665f, 28.0f);
                path.cubicTo(4.6666665f, 15.113356f, 15.113356f, 4.6666665f, 28.0f, 4.6666665f);
                instancePath.close();
                instancePath.moveTo(28.0f, 7.4666667f);
                Path path2 = instancePath;
                path2.cubicTo(16.659754f, 7.4666667f, 7.4666667f, 16.659754f, 7.4666667f, 28.0f);
                path2.cubicTo(7.4666667f, 39.34025f, 16.659754f, 48.533333f, 28.0f, 48.533333f);
                path2.cubicTo(39.34025f, 48.533333f, 48.533333f, 39.34025f, 48.533333f, 28.0f);
                path2.cubicTo(48.533333f, 16.659754f, 39.34025f, 7.4666667f, 28.0f, 7.4666667f);
                instancePath.close();
                instancePath.moveTo(28.0f, 35.941082f);
                Path path3 = instancePath;
                path3.cubicTo(29.11084f, 35.941082f, 29.948242f, 36.778484f, 29.948242f, 37.889324f);
                path3.cubicTo(29.948242f, 38.983074f, 29.11084f, 39.837566f, 28.0f, 39.837566f);
                path3.cubicTo(26.90625f, 39.837566f, 26.051758f, 38.983074f, 26.051758f, 37.889324f);
                path3.cubicTo(26.051758f, 36.778484f, 26.90625f, 35.941082f, 28.0f, 35.941082f);
                instancePath.close();
                instancePath.moveTo(29.538086f, 15.006022f);
                instancePath.lineTo(29.333008f, 31.48063f);
                instancePath.lineTo(26.666992f, 31.48063f);
                instancePath.lineTo(26.461914f, 15.006022f);
                instancePath.lineTo(29.538086f, 15.006022f);
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
