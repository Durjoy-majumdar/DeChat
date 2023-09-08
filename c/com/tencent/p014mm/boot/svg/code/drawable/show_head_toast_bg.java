package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.show_head_toast_bg */
public class show_head_toast_bg extends C24542c {
    private final int height = 198;
    private final int width = 198;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 198;
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
                instancePaint3.setColor(-3355444);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, 0.70710677f, -41.00714f, -0.70710677f, 0.70710677f, 99.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(168.0f, 99.0f);
                instancePath.lineTo(168.0f, 165.0f);
                Path path = instancePath;
                path.cubicTo(168.0f, 166.65686f, 166.65686f, 168.0f, 165.0f, 168.0f);
                instancePath.lineTo(99.0f, 168.0f);
                path.cubicTo(60.892353f, 168.0f, 30.0f, 137.10765f, 30.0f, 99.0f);
                path.cubicTo(30.0f, 60.892353f, 60.892353f, 30.0f, 99.0f, 30.0f);
                path.cubicTo(137.10765f, 30.0f, 168.0f, 60.892353f, 168.0f, 99.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
