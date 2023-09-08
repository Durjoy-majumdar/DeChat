package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.file_float_ball_icon_excel */
public class file_float_ball_icon_excel extends C24542c {
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
            instancePaint3.setColor(-14650554);
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
            instancePath2.moveTo(16.511719f, 33.0f);
            instancePath2.lineTo(22.019531f, 24.527344f);
            instancePath2.lineTo(22.019531f, 24.445312f);
            instancePath2.lineTo(16.558594f, 16.089844f);
            instancePath2.lineTo(20.132812f, 16.089844f);
            instancePath2.lineTo(24.046875f, 22.441406f);
            instancePath2.lineTo(24.140625f, 22.441406f);
            instancePath2.lineTo(28.101562f, 16.089844f);
            instancePath2.lineTo(31.488281f, 16.089844f);
            instancePath2.lineTo(25.851562f, 24.515625f);
            instancePath2.lineTo(25.851562f, 24.597656f);
            instancePath2.lineTo(31.394531f, 33.0f);
            instancePath2.lineTo(27.914062f, 33.0f);
            instancePath2.lineTo(23.929688f, 26.789062f);
            instancePath2.lineTo(23.835938f, 26.789062f);
            instancePath2.lineTo(19.804688f, 33.0f);
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
