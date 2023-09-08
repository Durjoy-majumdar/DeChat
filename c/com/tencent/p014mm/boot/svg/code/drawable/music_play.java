package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.music_play */
public class music_play extends C24542c {
    private final int height = 107;
    private final int width = 107;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 107;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(29.0f, 22.005177f);
        instancePath.cubicTo(29.0f, 20.897749f, 29.90195f, 20.0f, 31.00853f, 20.0f);
        instancePath.lineTo(38.99147f, 20.0f);
        instancePath.cubicTo(40.10075f, 20.0f, 41.0f, 20.89647f, 41.0f, 22.005177f);
        instancePath.lineTo(41.0f, 84.99482f);
        instancePath.cubicTo(41.0f, 86.10225f, 40.09805f, 87.0f, 38.99147f, 87.0f);
        instancePath.lineTo(31.00853f, 87.0f);
        Path path = instancePath;
        path.cubicTo(29.89925f, 87.0f, 29.0f, 86.10353f, 29.0f, 84.99482f);
        instancePath.lineTo(29.0f, 22.005177f);
        instancePath.close();
        instancePath.moveTo(66.0f, 22.005177f);
        path.cubicTo(66.0f, 20.897749f, 66.90195f, 20.0f, 68.00853f, 20.0f);
        instancePath.lineTo(75.99147f, 20.0f);
        instancePath.cubicTo(77.10075f, 20.0f, 78.0f, 20.89647f, 78.0f, 22.005177f);
        instancePath.lineTo(78.0f, 84.99482f);
        Path path2 = instancePath;
        path2.cubicTo(78.0f, 86.10225f, 77.09805f, 87.0f, 75.99147f, 87.0f);
        instancePath.lineTo(68.00853f, 87.0f);
        path2.cubicTo(66.89925f, 87.0f, 66.0f, 86.10353f, 66.0f, 84.99482f);
        instancePath.lineTo(66.0f, 22.005177f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
