package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.peoplenearby_icon */
public class peoplenearby_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 23.0f, 0.0f, 1.0f, 13.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-5592406);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(3.8078494f, 11.822346f);
                Path path = instancePath;
                path.cubicTo(8.404776f, 4.3013563f, 17.218054f, -0.42926627f, 26.051363f, 0.030794242f);
                path.cubicTo(35.185123f, 0.3208324f, 43.81813f, 6.141598f, 47.61385f, 14.432689f);
                path.cubicTo(51.018982f, 21.393604f, 50.488182f, 29.64469f, 47.854214f, 36.76563f);
                path.cubicTo(43.167152f, 49.54731f, 34.35387f, 60.318726f, 24.989763f, 70.0f);
                path.cubicTo(15.275126f, 59.908672f, 6.0412145f, 48.637188f, 1.6045299f, 35.145412f);
                path.cubicTo(-0.95933306f, 27.51441f, -0.60880494f, 18.713253f, 3.8078494f, 11.822346f);
                instancePath.lineTo(3.8078494f, 11.822346f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(25.084106f, 24.087467f);
                instancePath2.lineTo(16.49832f, 15.50168f);
                instancePath2.lineTo(13.669893f, 18.330107f);
                instancePath2.lineTo(22.25568f, 26.915894f);
                instancePath2.lineTo(13.669893f, 35.50168f);
                instancePath2.lineTo(16.49832f, 38.33011f);
                instancePath2.lineTo(25.084106f, 29.74432f);
                instancePath2.lineTo(33.66989f, 38.33011f);
                instancePath2.lineTo(36.49832f, 35.50168f);
                instancePath2.lineTo(27.912533f, 26.915894f);
                instancePath2.lineTo(36.49832f, 18.330107f);
                instancePath2.lineTo(33.66989f, 15.50168f);
                instancePath2.lineTo(25.084106f, 24.087467f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
