package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.exdevice_send_failed */
public class exdevice_send_failed extends C24542c {
    private final int height = 64;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = 64;
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
                instancePath.moveTo(32.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(49.67311f, 0.0f, 64.0f, 14.326888f, 64.0f, 32.0f);
                path.cubicTo(64.0f, 49.67311f, 49.67311f, 64.0f, 32.0f, 64.0f);
                path.cubicTo(14.326888f, 64.0f, 0.0f, 49.67311f, 0.0f, 32.0f);
                path.cubicTo(0.0f, 14.326888f, 14.326888f, 0.0f, 32.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(31.985626f, 42.684376f);
                Path path2 = instancePath;
                path2.cubicTo(30.388752f, 42.684376f, 29.12f, 43.909374f, 29.12f, 45.50625f);
                path2.cubicTo(29.12f, 47.103127f, 30.388752f, 48.328125f, 31.985626f, 48.328125f);
                path2.cubicTo(33.62625f, 48.328125f, 34.873127f, 47.103127f, 34.873127f, 45.50625f);
                path2.cubicTo(34.873127f, 43.909374f, 33.62625f, 42.684376f, 31.985626f, 42.684376f);
                instancePath.close();
                instancePath.moveTo(34.435627f, 13.234375f);
                instancePath.lineTo(29.5575f, 13.234375f);
                instancePath.lineTo(29.907501f, 37.54375f);
                instancePath.lineTo(34.085625f, 37.54375f);
                instancePath.lineTo(34.435627f, 13.234375f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
