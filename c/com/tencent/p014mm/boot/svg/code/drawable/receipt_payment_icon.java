package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.receipt_payment_icon */
public class receipt_payment_icon extends C24542c {
    private final int height = 88;
    private final int width = 88;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 88;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-1);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(20.0f, 53.0f);
        instancePath.lineTo(20.0f, 62.0f);
        instancePath.lineTo(32.0f, 62.0f);
        instancePath.lineTo(32.0f, 68.0f);
        instancePath.lineTo(17.0f, 68.0f);
        instancePath.cubicTo(15.343145f, 68.0f, 14.0f, 66.65685f, 14.0f, 65.0f);
        instancePath.lineTo(14.0f, 65.0f);
        instancePath.lineTo(14.0f, 53.0f);
        instancePath.lineTo(20.0f, 53.0f);
        instancePath.close();
        instancePath.moveTo(74.0f, 53.0f);
        instancePath.lineTo(74.0f, 65.0f);
        instancePath.cubicTo(74.0f, 66.65685f, 72.65685f, 68.0f, 71.0f, 68.0f);
        instancePath.lineTo(56.0f, 68.0f);
        instancePath.lineTo(56.0f, 62.0f);
        instancePath.lineTo(68.0f, 62.0f);
        instancePath.lineTo(68.0f, 53.0f);
        instancePath.lineTo(74.0f, 53.0f);
        instancePath.close();
        instancePath.moveTo(56.72792f, 32.514717f);
        instancePath.lineTo(60.970562f, 36.75736f);
        instancePath.lineTo(41.87868f, 55.849243f);
        instancePath.cubicTo(41.363186f, 56.364735f, 40.706768f, 56.65341f, 40.03344f, 56.71527f);
        instancePath.lineTo(39.84948f, 56.726517f);
        instancePath.lineTo(39.84948f, 56.726517f);
        instancePath.lineTo(39.665237f, 56.726517f);
        instancePath.cubicTo(38.928463f, 56.70402f, 38.198395f, 56.4116f, 37.63604f, 55.849243f);
        instancePath.lineTo(27.029438f, 45.24264f);
        instancePath.lineTo(31.272078f, 41.0f);
        instancePath.lineTo(39.757f, 49.485f);
        instancePath.lineTo(56.72792f, 32.514717f);
        instancePath.close();
        instancePath.moveTo(32.0f, 20.0f);
        instancePath.lineTo(32.0f, 26.0f);
        instancePath.lineTo(20.0f, 26.0f);
        instancePath.lineTo(20.0f, 35.0f);
        instancePath.lineTo(14.0f, 35.0f);
        instancePath.lineTo(14.0f, 23.0f);
        instancePath.cubicTo(14.0f, 21.343145f, 15.343145f, 20.0f, 17.0f, 20.0f);
        instancePath.lineTo(32.0f, 20.0f);
        instancePath.close();
        instancePath.moveTo(71.0f, 20.0f);
        instancePath.cubicTo(72.65685f, 20.0f, 74.0f, 21.343145f, 74.0f, 23.0f);
        instancePath.lineTo(74.0f, 23.0f);
        instancePath.lineTo(74.0f, 35.0f);
        instancePath.lineTo(68.0f, 35.0f);
        instancePath.lineTo(68.0f, 26.0f);
        instancePath.lineTo(56.0f, 26.0f);
        instancePath.lineTo(56.0f, 20.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
