package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_pay_coupon */
public class icons_filled_pay_coupon extends C24542c {
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(60.0f, 15.0f);
            instancePath.cubicTo(61.656853f, 15.0f, 63.0f, 16.343145f, 63.0f, 18.0f);
            instancePath.lineTo(63.0f, 30.0f);
            Path path = instancePath;
            path.cubicTo(59.68629f, 30.0f, 57.0f, 32.68629f, 57.0f, 36.0f);
            path.cubicTo(57.0f, 39.31371f, 59.68629f, 42.0f, 63.0f, 42.0f);
            instancePath.lineTo(63.0f, 54.0f);
            instancePath.cubicTo(63.0f, 55.656853f, 61.656853f, 57.0f, 60.0f, 57.0f);
            instancePath.lineTo(12.0f, 57.0f);
            instancePath.cubicTo(10.343145f, 57.0f, 9.0f, 55.656853f, 9.0f, 54.0f);
            instancePath.lineTo(9.0f, 42.0f);
            Path path2 = instancePath;
            path2.cubicTo(12.313708f, 42.0f, 15.0f, 39.31371f, 15.0f, 36.0f);
            path2.cubicTo(15.0f, 32.68629f, 12.313708f, 30.0f, 9.0f, 30.0f);
            instancePath.lineTo(9.0f, 18.0f);
            instancePath.cubicTo(9.0f, 16.343145f, 10.343145f, 15.0f, 12.0f, 15.0f);
            instancePath.lineTo(60.0f, 15.0f);
            instancePath.close();
            instancePath.moveTo(33.0f, 44.4f);
            instancePath.lineTo(27.0f, 44.4f);
            instancePath.lineTo(27.0f, 51.6f);
            instancePath.lineTo(33.0f, 51.6f);
            instancePath.lineTo(33.0f, 44.4f);
            instancePath.close();
            instancePath.moveTo(33.0f, 32.4f);
            instancePath.lineTo(27.0f, 32.4f);
            instancePath.lineTo(27.0f, 39.6f);
            instancePath.lineTo(33.0f, 39.6f);
            instancePath.lineTo(33.0f, 32.4f);
            instancePath.close();
            instancePath.moveTo(33.0f, 20.4f);
            instancePath.lineTo(27.0f, 20.4f);
            instancePath.lineTo(27.0f, 27.6f);
            instancePath.lineTo(33.0f, 27.6f);
            instancePath.lineTo(33.0f, 20.4f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
