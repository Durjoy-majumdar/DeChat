package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.video_no_sd_icon */
public class video_no_sd_icon extends C24542c {
    private final int height = 255;
    private final int width = 255;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 255;
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
                instancePaint3.setColor(-1);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 74.0f, 0.0f, 1.0f, 65.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(98.000374f, 0.0f);
                instancePath.lineTo(21.999622f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(12.0f, 12.0f);
                instancePath.lineTo(12.0f, 10.000714f);
                instancePath.lineTo(12.0f, 126.0f);
                instancePath.lineTo(108.0f, 126.0f);
                instancePath.lineTo(108.0f, 10.000714f);
                instancePath.lineTo(108.0f, 12.0f);
                instancePath.lineTo(96.0f, 0.0f);
                instancePath.lineTo(98.000374f, 0.0f);
                instancePath.close();
                instancePath.moveTo(108.0f, 114.0f);
                instancePath.lineTo(96.0f, 126.0f);
                instancePath.lineTo(108.0f, 126.0f);
                instancePath.lineTo(108.0f, 114.0f);
                instancePath.close();
                instancePath.moveTo(0.0f, 48.0f);
                instancePath.lineTo(12.0f, 48.0f);
                instancePath.lineTo(12.0f, 126.0f);
                instancePath.lineTo(0.0f, 126.0f);
                instancePath.lineTo(0.0f, 48.0f);
                instancePath.close();
                instancePath.moveTo(0.0f, 114.0f);
                instancePath.lineTo(12.0f, 126.0f);
                instancePath.lineTo(0.0f, 126.0f);
                instancePath.lineTo(0.0f, 114.0f);
                instancePath.close();
                instancePath.moveTo(0.0f, 60.0f);
                instancePath.lineTo(12.0f, 48.0f);
                instancePath.lineTo(0.0f, 48.0f);
                instancePath.lineTo(0.0f, 60.0f);
                instancePath.close();
                instancePath.moveTo(36.0f, 12.0f);
                instancePath.lineTo(48.0f, 12.0f);
                instancePath.lineTo(48.0f, 42.0f);
                instancePath.lineTo(36.0f, 42.0f);
                instancePath.lineTo(36.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(54.0f, 12.0f);
                instancePath.lineTo(66.0f, 12.0f);
                instancePath.lineTo(66.0f, 42.0f);
                instancePath.lineTo(54.0f, 42.0f);
                instancePath.lineTo(54.0f, 12.0f);
                instancePath.close();
                instancePath.moveTo(72.0f, 12.0f);
                instancePath.lineTo(84.0f, 12.0f);
                instancePath.lineTo(84.0f, 42.0f);
                instancePath.lineTo(72.0f, 42.0f);
                instancePath.lineTo(72.0f, 12.0f);
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
