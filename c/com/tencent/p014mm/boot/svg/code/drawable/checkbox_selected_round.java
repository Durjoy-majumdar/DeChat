package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_round */
public class checkbox_selected_round extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = 24;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                instancePaint3.setColor(-1);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(11.0f, 3.0f);
                Path path = instancePath;
                path.cubicTo(15.970563f, 3.0f, 20.0f, 7.029437f, 20.0f, 12.0f);
                path.cubicTo(20.0f, 16.970562f, 15.970563f, 21.0f, 11.0f, 21.0f);
                path.cubicTo(6.029437f, 21.0f, 2.0f, 16.970562f, 2.0f, 12.0f);
                path.cubicTo(2.0f, 7.029437f, 6.029437f, 3.0f, 11.0f, 3.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-16268960);
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(12.0f, 22.0f);
                Path path2 = instancePath2;
                path2.cubicTo(6.4771523f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f);
                path2.cubicTo(2.0f, 6.4771523f, 6.4771523f, 2.0f, 12.0f, 2.0f);
                path2.cubicTo(17.522848f, 2.0f, 22.0f, 6.4771523f, 22.0f, 12.0f);
                path2.cubicTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f);
                instancePath2.close();
                instancePath2.moveTo(10.823438f, 14.139317f);
                instancePath2.lineTo(8.057538f, 11.373417f);
                instancePath2.lineTo(7.0f, 12.430955f);
                instancePath2.lineTo(10.1187f, 15.552128f);
                Path path3 = instancePath2;
                path3.cubicTo(10.118736f, 15.552164f, 10.1187725f, 15.5522f, 10.118809f, 15.552237f);
                path3.cubicTo(10.509253f, 15.9428425f, 11.142417f, 15.942974f, 11.533023f, 15.55253f);
                instancePath2.lineTo(17.485281f, 9.602528f);
                instancePath2.lineTo(16.422754f, 8.54f);
                instancePath2.lineTo(10.823438f, 14.139317f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
