package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radio_on_easymode */
public class radio_on_easymode extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 60;
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
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(60.0f, 0.0f);
            instancePath.lineTo(60.0f, 60.0f);
            instancePath.lineTo(0.0f, 60.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16676542);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(30.0f, 16.0f);
            Path path = instancePath2;
            path.cubicTo(22.16f, 16.0f, 16.0f, 22.16f, 16.0f, 30.0f);
            path.cubicTo(16.0f, 37.84f, 22.16f, 44.0f, 30.0f, 44.0f);
            path.cubicTo(37.84f, 44.0f, 44.0f, 37.84f, 44.0f, 30.0f);
            path.cubicTo(44.0f, 22.16f, 37.84f, 16.0f, 30.0f, 16.0f);
            instancePath2.lineTo(30.0f, 16.0f);
            instancePath2.close();
            instancePath2.moveTo(30.0f, 6.0f);
            path.cubicTo(16.8f, 6.0f, 6.0f, 16.8f, 6.0f, 30.0f);
            path.cubicTo(6.0f, 43.2f, 16.8f, 54.0f, 30.0f, 54.0f);
            path.cubicTo(43.2f, 54.0f, 54.0f, 43.2f, 54.0f, 30.0f);
            path.cubicTo(54.0f, 16.8f, 43.2f, 6.0f, 30.0f, 6.0f);
            instancePath2.lineTo(30.0f, 6.0f);
            instancePath2.close();
            instancePath2.moveTo(10.0f, 30.0f);
            Path path2 = instancePath2;
            path2.cubicTo(10.0f, 19.0f, 19.0f, 10.0f, 30.0f, 10.0f);
            path2.cubicTo(41.0f, 10.0f, 50.0f, 19.0f, 50.0f, 30.0f);
            path2.cubicTo(50.0f, 41.0f, 41.0f, 50.0f, 30.0f, 50.0f);
            path2.cubicTo(19.0f, 50.0f, 10.0f, 41.0f, 10.0f, 30.0f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
