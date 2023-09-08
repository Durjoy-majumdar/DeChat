package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_pay_ledger */
public class icons_filled_pay_ledger extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            instancePaint3.setColor(-16777216);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(60.0f, 6.0f);
            instancePath.cubicTo(61.656853f, 6.0f, 63.0f, 7.343146f, 63.0f, 9.0f);
            instancePath.lineTo(63.0f, 63.0f);
            instancePath.cubicTo(63.0f, 64.65685f, 61.656853f, 66.0f, 60.0f, 66.0f);
            instancePath.lineTo(24.0f, 66.0f);
            instancePath.lineTo(24.0f, 6.0f);
            instancePath.lineTo(60.0f, 6.0f);
            instancePath.close();
            instancePath.moveTo(18.0f, 6.0f);
            instancePath.lineTo(18.0f, 66.0f);
            instancePath.lineTo(12.0f, 66.0f);
            instancePath.cubicTo(10.343145f, 66.0f, 9.0f, 64.65685f, 9.0f, 63.0f);
            instancePath.lineTo(9.0f, 9.0f);
            instancePath.cubicTo(9.0f, 7.343146f, 10.343145f, 6.0f, 12.0f, 6.0f);
            instancePath.lineTo(18.0f, 6.0f);
            instancePath.close();
            instancePath.moveTo(39.0f, 31.5f);
            instancePath.lineTo(33.0f, 31.5f);
            instancePath.lineTo(37.5f, 40.5f);
            instancePath.lineTo(33.0f, 40.5f);
            instancePath.lineTo(33.0f, 45.0f);
            instancePath.lineTo(41.25f, 45.0f);
            instancePath.lineTo(41.25f, 48.0f);
            instancePath.lineTo(33.0f, 48.0f);
            instancePath.lineTo(33.0f, 52.5f);
            instancePath.lineTo(41.25f, 52.5f);
            instancePath.lineTo(41.25f, 57.0f);
            instancePath.lineTo(45.75f, 57.0f);
            instancePath.lineTo(45.75f, 52.5f);
            instancePath.lineTo(54.0f, 52.5f);
            instancePath.lineTo(54.0f, 48.0f);
            instancePath.lineTo(45.75f, 48.0f);
            instancePath.lineTo(45.75f, 45.0f);
            instancePath.lineTo(54.0f, 45.0f);
            instancePath.lineTo(54.0f, 40.5f);
            instancePath.lineTo(49.5f, 40.5f);
            instancePath.lineTo(54.0f, 31.5f);
            instancePath.lineTo(48.0f, 31.5f);
            instancePath.lineTo(43.5f, 40.5f);
            instancePath.lineTo(39.0f, 31.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
