package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.remittance_received */
public class remittance_received extends C24542c {
    private final int height = 270;
    private final int width = 270;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 270;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                instancePaint3.setColor(-12601288);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(131.16f, 0.0f);
                instancePath.lineTo(138.59f, 0.0f);
                Path path = instancePath;
                path.cubicTo(169.69f, 0.83f, 200.36f, 12.7f, 223.71f, 33.28f);
                path.cubicTo(251.77f, 57.44f, 268.83f, 93.6f, 270.0f, 130.59f);
                instancePath.lineTo(270.0f, 137.53f);
                Path path2 = instancePath;
                path2.cubicTo(269.48f, 168.53f, 257.86f, 199.15f, 237.66f, 222.67f);
                path2.cubicTo(213.11f, 251.69f, 175.86f, 269.39f, 137.83f, 270.0f);
                instancePath.lineTo(132.41f, 270.0f);
                Path path3 = instancePath;
                path3.cubicTo(106.69f, 269.5f, 81.14f, 261.55f, 59.82f, 247.12f);
                path3.cubicTo(35.24f, 230.72f, 16.33f, 205.99f, 7.01f, 177.95f);
                path3.cubicTo(2.53f, 164.82f, 0.31f, 150.97f, 0.0f, 137.13f);
                instancePath.lineTo(0.0f, 133.07f);
                Path path4 = instancePath;
                path4.cubicTo(0.36f, 94.51f, 18.29f, 56.6f, 47.89f, 31.9f);
                path4.cubicTo(70.96f, 12.2f, 100.85f, 0.89f, 131.16f, 0.0f);
                instancePath.lineTo(131.16f, 0.0f);
                instancePath.close();
                instancePath.moveTo(203.02f, 82.05f);
                path4.cubicTo(171.35f, 113.7f, 139.71f, 145.38f, 108.03f, 177.02f);
                path4.cubicTo(95.98f, 165.08f, 84.03f, 153.03f, 72.01f, 141.05f);
                path4.cubicTo(71.22f, 140.01f, 69.44f, 139.34f, 68.41f, 140.39f);
                path4.cubicTo(65.92f, 142.65f, 63.6f, 145.1f, 61.23f, 147.49f);
                path4.cubicTo(59.98f, 148.45f, 60.3f, 150.46f, 61.49f, 151.33f);
                path4.cubicTo(76.33f, 166.21f, 91.18f, 181.09f, 106.08f, 195.91f);
                path4.cubicTo(107.0f, 197.16f, 108.96f, 197.19f, 109.91f, 195.94f);
                path4.cubicTo(144.3f, 161.65f, 178.59f, 127.26f, 212.96f, 92.94f);
                path4.cubicTo(214.03f, 91.97f, 215.05f, 90.77f, 214.44f, 89.23f);
                path4.cubicTo(211.96f, 86.51f, 209.35f, 83.91f, 206.66f, 81.41f);
                path4.cubicTo(205.59f, 80.26f, 203.84f, 81.02f, 203.02f, 82.05f);
                instancePath.lineTo(203.02f, 82.05f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
