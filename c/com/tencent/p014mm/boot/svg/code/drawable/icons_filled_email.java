package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_email */
public class icons_filled_email extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(9.0f, 12.0f);
            instancePath.lineTo(63.0f, 12.0f);
            instancePath.cubicTo(64.65685f, 12.0f, 66.0f, 13.343145f, 66.0f, 15.0f);
            instancePath.lineTo(66.0f, 57.0f);
            instancePath.cubicTo(66.0f, 58.656853f, 64.65685f, 60.0f, 63.0f, 60.0f);
            instancePath.lineTo(9.0f, 60.0f);
            instancePath.cubicTo(7.343146f, 60.0f, 6.0f, 58.656853f, 6.0f, 57.0f);
            instancePath.lineTo(6.0f, 15.0f);
            instancePath.cubicTo(6.0f, 13.343145f, 7.343146f, 12.0f, 9.0f, 12.0f);
            instancePath.close();
            instancePath.moveTo(57.094437f, 17.743046f);
            instancePath.lineTo(36.46852f, 34.24378f);
            instancePath.cubicTo(36.194607f, 34.46291f, 35.805393f, 34.46291f, 35.53148f, 34.24378f);
            instancePath.lineTo(14.905564f, 17.743046f);
            instancePath.lineTo(12.094436f, 21.256954f);
            instancePath.lineTo(32.720352f, 37.757687f);
            instancePath.cubicTo(34.63775f, 39.291607f, 37.36225f, 39.291607f, 39.279648f, 37.757687f);
            instancePath.lineTo(59.905563f, 21.256954f);
            instancePath.lineTo(57.094437f, 17.743046f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
