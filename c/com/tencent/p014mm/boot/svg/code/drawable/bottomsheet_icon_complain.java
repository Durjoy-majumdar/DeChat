package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_complain */
public class bottomsheet_icon_complain extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = 96;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8617851);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(88.0f, 74.0f);
                instancePath.lineTo(88.0f, 74.0f);
                instancePath.lineTo(56.0f, 15.0f);
                instancePath.lineTo(56.0f, 15.0f);
                Path path = instancePath;
                path.cubicTo(54.97f, 11.577649f, 51.78977f, 9.0f, 48.0f, 9.0f);
                path.cubicTo(44.21023f, 9.0f, 41.029545f, 11.577649f, 40.0f, 15.0f);
                instancePath.lineTo(40.0f, 15.0f);
                instancePath.lineTo(8.0f, 74.0f);
                instancePath.lineTo(8.0f, 74.0f);
                Path path2 = instancePath;
                path2.cubicTo(7.5070333f, 75.54358f, 7.0f, 77.10677f, 7.0f, 79.0f);
                path2.cubicTo(7.0f, 83.32397f, 10.671322f, 87.0f, 15.0f, 87.0f);
                path2.cubicTo(15.497933f, 87.0f, 15.791311f, 86.98221f, 16.0f, 87.0f);
                instancePath.lineTo(16.0f, 87.0f);
                instancePath.lineTo(48.0f, 87.0f);
                instancePath.lineTo(48.0f, 79.0f);
                instancePath.lineTo(44.0f, 79.0f);
                instancePath.lineTo(44.0f, 71.0f);
                instancePath.lineTo(48.0f, 71.0f);
                instancePath.lineTo(48.0f, 62.0f);
                instancePath.lineTo(44.0f, 62.0f);
                instancePath.lineTo(42.0f, 34.0f);
                instancePath.lineTo(48.0f, 34.0f);
                instancePath.lineTo(48.0f, 25.0f);
                instancePath.lineTo(48.0f, 25.0f);
                instancePath.lineTo(48.0f, 25.0f);
                instancePath.lineTo(48.0f, 34.0f);
                instancePath.lineTo(54.0f, 34.0f);
                instancePath.lineTo(52.0f, 62.0f);
                instancePath.lineTo(48.0f, 62.0f);
                instancePath.lineTo(48.0f, 71.0f);
                instancePath.lineTo(52.0f, 71.0f);
                instancePath.lineTo(52.0f, 79.0f);
                instancePath.lineTo(48.0f, 79.0f);
                instancePath.lineTo(48.0f, 87.0f);
                instancePath.lineTo(80.0f, 87.0f);
                instancePath.lineTo(80.0f, 87.0f);
                Path path3 = instancePath;
                path3.cubicTo(80.20824f, 86.98221f, 80.50207f, 87.0f, 81.0f, 87.0f);
                path3.cubicTo(85.328674f, 87.0f, 89.0f, 83.32397f, 89.0f, 79.0f);
                path3.cubicTo(89.0f, 77.10677f, 88.49251f, 75.54358f, 88.0f, 74.0f);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
