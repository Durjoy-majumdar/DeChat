package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_finder_enable_auto_scroll */
public class icons_finder_enable_auto_scroll extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(25.333334f, 2.6666667f);
        instancePath.cubicTo(26.069714f, 2.6666667f, 26.666666f, 3.2636204f, 26.666666f, 4.0f);
        instancePath.lineTo(26.666666f, 28.0f);
        instancePath.cubicTo(26.666666f, 28.73638f, 26.069714f, 29.333334f, 25.333334f, 29.333334f);
        instancePath.lineTo(6.6666665f, 29.333334f);
        instancePath.cubicTo(5.930287f, 29.333334f, 5.3333335f, 28.73638f, 5.3333335f, 28.0f);
        instancePath.lineTo(5.3333335f, 4.0f);
        instancePath.cubicTo(5.3333335f, 3.2636204f, 5.930287f, 2.6666667f, 6.6666665f, 2.6666667f);
        instancePath.lineTo(25.333334f, 2.6666667f);
        instancePath.close();
        instancePath.moveTo(25.066668f, 4.266667f);
        instancePath.lineTo(6.9333334f, 4.266667f);
        instancePath.lineTo(6.9333334f, 27.733334f);
        instancePath.lineTo(25.066668f, 27.733334f);
        instancePath.lineTo(25.066668f, 4.266667f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.8369701E-16f, -1.0f, 32.0f, 1.0f, -1.8369701E-16f, 2.9391522E-15f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(12.540255f, 11.284008f);
        instancePath2.lineTo(13.668269f, 12.412023f);
        instancePath2.lineTo(10.878406f, 15.202008f);
        instancePath2.lineTo(16.699594f, 15.2023735f);
        instancePath2.lineTo(16.699594f, 16.797626f);
        instancePath2.lineTo(10.877405f, 16.797009f);
        instancePath2.lineTo(13.668269f, 19.587978f);
        instancePath2.lineTo(12.540255f, 20.715992f);
        instancePath2.lineTo(8.952405f, 17.128008f);
        instancePath2.lineTo(8.952277f, 17.128014f);
        instancePath2.lineTo(8.177816f, 16.353554f);
        instancePath2.cubicTo(7.982554f, 16.15829f, 7.982554f, 15.841709f, 8.177816f, 15.646446f);
        instancePath2.lineTo(8.952277f, 14.871985f);
        instancePath2.lineTo(8.952405f, 14.872008f);
        instancePath2.lineTo(12.540255f, 11.284008f);
        instancePath2.close();
        instancePath2.moveTo(18.299595f, 15.2023735f);
        instancePath2.lineTo(20.299595f, 15.2023735f);
        instancePath2.lineTo(20.299595f, 16.797626f);
        instancePath2.lineTo(18.299595f, 16.797626f);
        instancePath2.lineTo(18.299595f, 15.2023735f);
        instancePath2.close();
        instancePath2.moveTo(21.899595f, 15.2023735f);
        instancePath2.lineTo(23.899595f, 15.2023735f);
        instancePath2.lineTo(23.899595f, 16.797626f);
        instancePath2.lineTo(21.899595f, 16.797626f);
        instancePath2.lineTo(21.899595f, 15.2023735f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
