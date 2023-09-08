package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_comment_writeicon_golden_pressed */
public class friendactivity_comment_writeicon_golden_pressed extends C24542c {
    private final int height = 48;
    private final int width = 54;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 54;
        }
        if (i2 == 1) {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-7503);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(21.993774f, 38.0f);
            instancePath.lineTo(51.00044f, 38.0f);
            instancePath.cubicTo(52.66516f, 38.0f, 54.0f, 36.6579f, 54.0f, 35.00234f);
            instancePath.lineTo(54.0f, 2.99766f);
            instancePath.cubicTo(54.0f, 1.3524401f, 52.65705f, 0.0f, 51.00044f, 0.0f);
            instancePath.lineTo(2.9995608f, 0.0f);
            instancePath.cubicTo(1.3348389f, 0.0f, 0.0f, 1.342098f, 0.0f, 2.99766f);
            instancePath.lineTo(0.0f, 35.00234f);
            instancePath.cubicTo(0.0f, 36.64756f, 1.3429492f, 38.0f, 2.9995608f, 38.0f);
            instancePath.lineTo(9.0f, 38.0f);
            instancePath.lineTo(9.0f, 47.950085f);
            instancePath.lineTo(21.993774f, 38.0f);
            instancePath.close();
            instancePath.moveTo(19.0f, 32.0f);
            instancePath.lineTo(48.0f, 32.0f);
            instancePath.lineTo(48.0f, 6.0f);
            instancePath.lineTo(6.0f, 6.0f);
            instancePath.lineTo(6.0f, 32.0f);
            instancePath.lineTo(15.0f, 32.0f);
            instancePath.lineTo(15.0f, 36.0f);
            instancePath.lineTo(19.0f, 32.0f);
            instancePath.lineTo(19.0f, 32.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
