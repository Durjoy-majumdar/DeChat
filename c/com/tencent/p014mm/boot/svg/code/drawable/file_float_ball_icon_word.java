package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.file_float_ball_icon_word */
public class file_float_ball_icon_word extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 48;
        }
        if (i == 2) {
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
            instancePaint3.setColor(-13871462);
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
            instancePath2.moveTo(23.941406f, 20.765625f);
            instancePath2.lineTo(20.484375f, 33.0f);
            instancePath2.lineTo(17.636719f, 33.0f);
            instancePath2.lineTo(13.1015625f, 16.089844f);
            instancePath2.lineTo(16.242188f, 16.089844f);
            instancePath2.lineTo(19.171875f, 28.898438f);
            instancePath2.lineTo(19.265625f, 28.898438f);
            instancePath2.lineTo(22.664062f, 16.089844f);
            instancePath2.lineTo(25.335938f, 16.089844f);
            instancePath2.lineTo(28.734375f, 28.898438f);
            instancePath2.lineTo(28.828125f, 28.898438f);
            instancePath2.lineTo(31.757812f, 16.089844f);
            instancePath2.lineTo(34.898438f, 16.089844f);
            instancePath2.lineTo(30.363281f, 33.0f);
            instancePath2.lineTo(27.515625f, 33.0f);
            instancePath2.lineTo(24.058594f, 20.765625f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
