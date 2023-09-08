package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_headset */
public class icons_filled_headset extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 9.0f);
        instancePath.cubicTo(50.91169f, 9.0f, 63.0f, 21.088312f, 63.0f, 36.0f);
        instancePath.lineTo(63.0f, 54.0f);
        instancePath.lineTo(62.997f, 54.0f);
        instancePath.lineTo(63.0f, 57.0f);
        instancePath.cubicTo(63.0f, 60.31371f, 60.31371f, 63.0f, 57.0f, 63.0f);
        instancePath.lineTo(51.0f, 63.0f);
        instancePath.cubicTo(49.343147f, 63.0f, 48.0f, 61.656853f, 48.0f, 60.0f);
        instancePath.lineTo(48.0f, 45.0f);
        Path path = instancePath;
        path.cubicTo(48.0f, 43.343147f, 49.343147f, 42.0f, 51.0f, 42.0f);
        instancePath.lineTo(57.0f, 42.0f);
        instancePath.lineTo(57.0f, 36.0f);
        path.cubicTo(57.0f, 24.40202f, 47.59798f, 15.0f, 36.0f, 15.0f);
        path.cubicTo(24.40202f, 15.0f, 15.0f, 24.40202f, 15.0f, 36.0f);
        instancePath.lineTo(15.0f, 42.0f);
        instancePath.lineTo(21.0f, 42.0f);
        instancePath.cubicTo(22.656855f, 42.0f, 24.0f, 43.343147f, 24.0f, 45.0f);
        instancePath.lineTo(24.0f, 60.0f);
        Path path2 = instancePath;
        path2.cubicTo(24.0f, 61.656853f, 22.656855f, 63.0f, 21.0f, 63.0f);
        instancePath.lineTo(15.0f, 63.0f);
        path2.cubicTo(11.686292f, 63.0f, 9.0f, 60.31371f, 9.0f, 57.0f);
        instancePath.lineTo(9.0f, 36.0f);
        path2.cubicTo(9.0f, 21.088312f, 21.088312f, 9.0f, 36.0f, 9.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
