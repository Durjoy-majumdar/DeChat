package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_keyboard */
public class icons_filled_keyboard extends C24542c {
    private final int height = 28;
    private final int width = 28;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 28;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-983041);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(16.0f, 2.6666667f);
                Path path = instancePath;
                path.cubicTo(23.363796f, 2.6666667f, 29.333332f, 8.636204f, 29.333332f, 16.0f);
                path.cubicTo(29.333332f, 23.363796f, 23.363796f, 29.333332f, 15.999999f, 29.333332f);
                path.cubicTo(8.636202f, 29.333332f, 2.666666f, 23.363796f, 2.666666f, 15.999999f);
                path.cubicTo(2.666666f, 8.636202f, 8.636203f, 2.666666f, 15.999999f, 2.666666f);
                instancePath.close();
                instancePath.moveTo(20.0f, 20.0f);
                instancePath.lineTo(12.0f, 20.0f);
                instancePath.lineTo(12.0f, 22.666666f);
                instancePath.lineTo(20.0f, 22.666666f);
                instancePath.close();
                instancePath.moveTo(11.333333f, 14.666666f);
                instancePath.lineTo(8.666666f, 14.666666f);
                instancePath.lineTo(8.666666f, 17.333332f);
                instancePath.lineTo(11.333333f, 17.333332f);
                instancePath.close();
                instancePath.moveTo(15.333333f, 14.666666f);
                instancePath.lineTo(12.666666f, 14.666666f);
                instancePath.lineTo(12.666666f, 17.333332f);
                instancePath.lineTo(15.333332f, 17.333332f);
                instancePath.close();
                instancePath.moveTo(19.333332f, 14.666666f);
                instancePath.lineTo(16.666666f, 14.666666f);
                instancePath.lineTo(16.666666f, 17.333332f);
                instancePath.lineTo(19.333332f, 17.333332f);
                instancePath.close();
                instancePath.moveTo(23.333332f, 14.666666f);
                instancePath.lineTo(20.666666f, 14.666666f);
                instancePath.lineTo(20.666666f, 17.333332f);
                instancePath.lineTo(23.333332f, 17.333332f);
                instancePath.close();
                instancePath.moveTo(11.333332f, 10.666666f);
                instancePath.lineTo(8.666665f, 10.666666f);
                instancePath.lineTo(8.666665f, 13.333332f);
                instancePath.lineTo(11.333332f, 13.333332f);
                instancePath.close();
                instancePath.moveTo(15.333332f, 10.666666f);
                instancePath.lineTo(12.666666f, 10.666666f);
                instancePath.lineTo(12.666666f, 13.333332f);
                instancePath.lineTo(15.333332f, 13.333332f);
                instancePath.close();
                instancePath.moveTo(19.333332f, 10.666666f);
                instancePath.lineTo(16.666666f, 10.666666f);
                instancePath.lineTo(16.666666f, 13.333332f);
                instancePath.lineTo(19.333332f, 13.333332f);
                instancePath.close();
                instancePath.moveTo(23.333332f, 10.666666f);
                instancePath.lineTo(20.666666f, 10.666666f);
                instancePath.lineTo(20.666666f, 13.333332f);
                instancePath.lineTo(23.333332f, 13.333332f);
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
