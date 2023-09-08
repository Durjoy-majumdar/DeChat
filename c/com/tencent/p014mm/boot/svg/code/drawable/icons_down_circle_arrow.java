package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_down_circle_arrow */
public class icons_down_circle_arrow extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
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
                instancePaint3.setColor(-526345);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(18.627419f, 0.0f, 24.0f, 5.3725824f, 24.0f, 12.0f);
                path.cubicTo(24.0f, 18.627419f, 18.627419f, 24.0f, 12.0f, 24.0f);
                path.cubicTo(5.3725824f, 24.0f, 0.0f, 18.627419f, 0.0f, 12.0f);
                path.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-436207616);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, -0.70710677f, 11.117083f, -0.70710677f, -0.70710677f, 26.839014f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(9.086634f, 7.0f);
                instancePath2.lineTo(15.753301f, 7.0f);
                instancePath2.lineTo(15.753301f, 7.0f);
                instancePath2.lineTo(15.753301f, 8.666667f);
                instancePath2.lineTo(9.919968f, 8.666667f);
                instancePath2.lineTo(9.919968f, 14.5f);
                instancePath2.lineTo(8.253301f, 14.5f);
                instancePath2.lineTo(8.253301f, 7.8333335f);
                instancePath2.cubicTo(8.253301f, 7.373096f, 8.626397f, 7.0f, 9.086634f, 7.0f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
