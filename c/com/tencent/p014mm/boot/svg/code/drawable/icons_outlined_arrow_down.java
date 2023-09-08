package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_arrow_down */
public class icons_outlined_arrow_down extends C24542c {
    private final int height = 36;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 72;
        }
        if (i2 == 1) {
            return 36;
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(52.257812f, 7.363281f);
            instancePath.lineTo(55.441406f, 10.542969f);
            instancePath.lineTo(38.101562f, 27.878906f);
            instancePath.cubicTo(36.933594f, 29.050781f, 35.046875f, 29.0625f, 33.86328f, 27.878906f);
            instancePath.lineTo(16.527344f, 10.542969f);
            instancePath.lineTo(19.710938f, 7.363281f);
            instancePath.lineTo(35.984375f, 23.636719f);
            instancePath.close();
            instancePath.moveTo(52.257812f, 7.363281f);
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
