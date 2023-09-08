package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.qr_reward_top_red_bg */
public class qr_reward_top_red_bg extends C24542c {
    private final int height = 125;
    private final int width = 1080;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 1080;
        }
        if (i == 1) {
            return 125;
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-2664127);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.08785249f, -2.7755576E-16f);
            Path path = instancePath;
            path.cubicTo(0.029366853f, 0.41979796f, 0.0f, 0.8405075f, 0.0f, 1.2620968f);
            path.cubicTo(0.0f, 39.514496f, 150.4436f, 125.0f, 540.0f, 125.0f);
            path.cubicTo(929.5564f, 125.0f, 1080.0f, 39.514496f, 1080.0f, 1.2620968f);
            path.cubicTo(1080.0f, 0.8405075f, 1079.9706f, 0.41979796f, 1079.9121f, 2.220446E-16f);
            instancePath.lineTo(0.08785249f, 0.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
