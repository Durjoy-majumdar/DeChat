package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.remittance_refunded */
public class remittance_refunded extends C24542c {
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
                instancePaint3.setColor(-1202386);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(130.84f, 0.0f);
                instancePath.lineTo(137.49f, 0.0f);
                Path path = instancePath;
                path.cubicTo(169.21f, 0.52f, 200.58f, 12.66f, 224.28f, 33.78f);
                path.cubicTo(252.31f, 58.19f, 269.23f, 94.64f, 270.0f, 131.79f);
                instancePath.lineTo(270.0f, 137.24f);
                Path path2 = instancePath;
                path2.cubicTo(269.55f, 165.21f, 260.21f, 192.96f, 243.45f, 215.38f);
                path2.cubicTo(219.22f, 248.49f, 179.23f, 269.26f, 138.21f, 270.0f);
                instancePath.lineTo(131.99f, 270.0f);
                Path path3 = instancePath;
                path3.cubicTo(100.68f, 269.36f, 69.79f, 257.4f, 46.26f, 236.73f);
                path3.cubicTo(17.95f, 212.27f, 0.75f, 175.62f, 0.0f, 138.21f);
                instancePath.lineTo(0.0f, 132.68f);
                Path path4 = instancePath;
                path4.cubicTo(0.48f, 94.98f, 17.71f, 57.93f, 46.25f, 33.31f);
                path4.cubicTo(69.47f, 12.83f, 99.93f, 0.99f, 130.84f, 0.0f);
                instancePath.lineTo(130.84f, 0.0f);
                instancePath.close();
                instancePath.moveTo(71.0f, 135.0f);
                path4.cubicTo(85.65116f, 149.34f, 100.32233f, 163.67f, 114.98349f, 178.0f);
                path4.cubicTo(115.003494f, 166.66f, 114.98349f, 155.33f, 114.99349f, 144.0f);
                path4.cubicTo(142.32567f, 143.99f, 169.66783f, 144.0f, 197.0f, 144.0f);
                instancePath.lineTo(197.0f, 127.0f);
                instancePath.lineTo(114.99349f, 127.0f);
                Path path5 = instancePath;
                path5.cubicTo(114.98349f, 115.33f, 115.003494f, 103.67f, 114.98349f, 92.0f);
                path5.cubicTo(100.33233f, 106.34f, 85.65116f, 120.66f, 71.0f, 135.0f);
                instancePath.lineTo(71.0f, 135.0f);
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
