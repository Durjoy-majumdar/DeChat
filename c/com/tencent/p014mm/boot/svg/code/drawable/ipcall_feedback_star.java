package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ipcall_feedback_star */
public class ipcall_feedback_star extends C24542c {
    private final int height = 90;
    private final int width = 90;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 90;
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
        canvas.saveLayerAlpha((RectF) null, 25, 31);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(44.999012f, 71.646385f);
        instancePath.lineTo(18.06173f, 87.246506f);
        instancePath.cubicTo(16.15247f, 88.35221f, 15.124873f, 87.53144f, 15.765567f, 85.41645f);
        instancePath.lineTo(24.811031f, 55.55646f);
        instancePath.lineTo(1.0043138f, 34.66419f);
        instancePath.cubicTo(-0.6587564f, 33.204716f, -0.20764746f, 32.021576f, 1.9966353f, 32.021576f);
        instancePath.lineTo(31.459358f, 32.021576f);
        instancePath.lineTo(43.445843f, 3.5297964f);
        instancePath.cubicTo(44.303635f, 1.4908304f, 45.69375f, 1.4893055f, 46.552185f, 3.5297964f);
        instancePath.lineTo(58.538666f, 32.021576f);
        instancePath.lineTo(88.00139f, 32.021576f);
        instancePath.cubicTo(90.2125f, 32.021576f, 90.65668f, 33.204803f, 88.99371f, 34.66419f);
        instancePath.lineTo(65.187f, 55.55646f);
        instancePath.lineTo(74.23246f, 85.41645f);
        instancePath.cubicTo(74.87358f, 87.53287f, 73.84428f, 88.35146f, 71.936295f, 87.246506f);
        instancePath.lineTo(44.999012f, 71.646385f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
