package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.file_float_ball_icon_ppt */
public class file_float_ball_icon_ppt extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
        }
        if (i2 == 2) {
            Canvas canvas = objArr[0];
            Looper looper = objArr[1];
            C24542c.instanceMatrix(looper);
            C24542c.instanceMatrixArray(looper);
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
            instancePaint3.setColor(-892609);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(48.0f, 0.0f);
            instancePath.lineTo(48.0f, 48.0f);
            instancePath.lineTo(0.0f, 48.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(19.751953f, 16.089844f);
            instancePath2.lineTo(26.326172f, 16.089844f);
            Path path = instancePath2;
            path.cubicTo(29.689453f, 16.089844f, 32.021484f, 18.375f, 32.021484f, 21.75f);
            path.cubicTo(32.021484f, 25.125f, 29.61914f, 27.410156f, 26.197266f, 27.410156f);
            instancePath2.lineTo(22.77539f, 27.410156f);
            instancePath2.lineTo(22.77539f, 33.0f);
            instancePath2.lineTo(19.751953f, 33.0f);
            instancePath2.lineTo(19.751953f, 16.089844f);
            instancePath2.close();
            instancePath2.moveTo(22.77539f, 18.5625f);
            instancePath2.lineTo(22.77539f, 24.972656f);
            instancePath2.lineTo(25.517578f, 24.972656f);
            Path path2 = instancePath2;
            path2.cubicTo(27.685547f, 24.972656f, 28.951172f, 23.800781f, 28.951172f, 21.75f);
            path2.cubicTo(28.951172f, 19.722656f, 27.697266f, 18.5625f, 25.529297f, 18.5625f);
            instancePath2.lineTo(22.77539f, 18.5625f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
