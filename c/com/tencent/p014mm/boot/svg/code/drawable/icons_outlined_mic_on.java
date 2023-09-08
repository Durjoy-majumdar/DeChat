package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_mic_on */
public class icons_outlined_mic_on extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(34.640625f, 24.0f);
        instancePath.lineTo(34.640625f, 48.0f);
        Path path = instancePath;
        path.cubicTo(34.640625f, 55.289062f, 40.597656f, 61.19922f, 47.94922f, 61.19922f);
        path.cubicTo(55.30078f, 61.19922f, 61.26172f, 55.289062f, 61.26172f, 48.0f);
        instancePath.lineTo(61.26172f, 24.0f);
        Path path2 = instancePath;
        path2.cubicTo(61.26172f, 16.710938f, 55.30078f, 10.800781f, 47.94922f, 10.800781f);
        path2.cubicTo(40.597656f, 10.800781f, 34.640625f, 16.710938f, 34.640625f, 24.0f);
        instancePath.close();
        instancePath.moveTo(22.539062f, 42.0f);
        instancePath.lineTo(22.539062f, 48.0f);
        Path path3 = instancePath;
        path3.cubicTo(22.539062f, 61.91797f, 33.91797f, 73.19922f, 47.94922f, 73.19922f);
        path3.cubicTo(61.984375f, 73.19922f, 73.359375f, 61.91797f, 73.359375f, 48.0f);
        instancePath.lineTo(73.359375f, 42.0f);
        instancePath.lineTo(78.19922f, 42.0f);
        instancePath.lineTo(78.19922f, 48.0f);
        instancePath.cubicTo(78.19922f, 63.76172f, 65.94531f, 76.68359f, 50.371094f, 77.90625f);
        instancePath.lineTo(50.371094f, 90.0f);
        instancePath.lineTo(45.53125f, 90.0f);
        instancePath.lineTo(45.53125f, 77.90625f);
        instancePath.cubicTo(29.953125f, 76.68359f, 17.699219f, 63.76172f, 17.699219f, 48.0f);
        instancePath.lineTo(17.699219f, 42.0f);
        instancePath.close();
        instancePath.moveTo(47.94922f, 6.0f);
        instancePath.cubicTo(57.972656f, 6.0f, 66.10156f, 14.058594f, 66.10156f, 24.0f);
        instancePath.lineTo(66.10156f, 48.0f);
        Path path4 = instancePath;
        path4.cubicTo(66.10156f, 57.941406f, 57.972656f, 66.0f, 47.94922f, 66.0f);
        path4.cubicTo(37.92578f, 66.0f, 29.800781f, 57.941406f, 29.800781f, 48.0f);
        instancePath.lineTo(29.800781f, 24.0f);
        instancePath.cubicTo(29.800781f, 14.058594f, 37.92578f, 6.0f, 47.94922f, 6.0f);
        instancePath.close();
        instancePath.moveTo(47.94922f, 6.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
