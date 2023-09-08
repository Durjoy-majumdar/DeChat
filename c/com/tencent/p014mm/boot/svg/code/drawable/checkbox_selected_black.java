package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_black */
public class checkbox_selected_black extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(35.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(54.329967f, 0.0f, 70.0f, 15.670033f, 70.0f, 35.0f);
                path.cubicTo(70.0f, 54.329967f, 54.329967f, 70.0f, 35.0f, 70.0f);
                path.cubicTo(15.670033f, 70.0f, 0.0f, 54.329967f, 0.0f, 35.0f);
                path.cubicTo(0.0f, 15.670033f, 15.670033f, 0.0f, 35.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(50.479637f, 22.89f);
                instancePath.lineTo(30.88203f, 42.48761f);
                instancePath.lineTo(21.201382f, 32.806957f);
                instancePath.lineTo(17.5f, 36.50834f);
                instancePath.lineTo(27.70898f, 46.724705f);
                instancePath.cubicTo(27.708654f, 46.725357f, 27.708818f, 46.72552f, 27.70898f, 46.725685f);
                instancePath.lineTo(27.876831f, 46.885323f);
                instancePath.cubicTo(29.642986f, 48.481728f, 32.37013f, 48.429077f, 34.072453f, 46.726517f);
                instancePath.lineTo(34.072453f, 46.726517f);
                instancePath.lineTo(54.198486f, 26.608847f);
                instancePath.lineTo(50.479637f, 22.89f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(0.0f, 0.0f);
                instancePath2.lineTo(72.0f, 0.0f);
                instancePath2.lineTo(72.0f, 72.0f);
                instancePath2.lineTo(0.0f, 72.0f);
                instancePath2.lineTo(0.0f, 0.0f);
                instancePath2.close();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
