package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_red */
public class checkbox_selected_red extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
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
                instancePaint3.setColor(-372399);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(72.0f, 36.444443f);
                Path path = instancePath;
                path.cubicTo(72.0f, 16.117332f, 55.882668f, 0.0f, 35.555557f, 0.0f);
                path.cubicTo(16.117332f, 0.0f, 0.0f, 16.117332f, 0.0f, 36.444443f);
                path.cubicTo(0.0f, 55.882668f, 16.117332f, 72.0f, 35.555557f, 72.0f);
                path.cubicTo(55.882668f, 72.0f, 72.0f, 55.882668f, 72.0f, 36.444443f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(31.091883f, 45.941124f);
                instancePath2.lineTo(21.18198f, 36.031223f);
                instancePath2.lineTo(18.0f, 39.213203f);
                instancePath2.lineTo(28.970562f, 50.183765f);
                instancePath2.cubicTo(30.142136f, 51.35534f, 32.04163f, 51.35534f, 33.213203f, 50.183765f);
                instancePath2.lineTo(56.21499f, 27.18198f);
                instancePath2.lineTo(56.21499f, 27.18198f);
                instancePath2.lineTo(53.03301f, 24.0f);
                instancePath2.lineTo(31.091883f, 45.941124f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
