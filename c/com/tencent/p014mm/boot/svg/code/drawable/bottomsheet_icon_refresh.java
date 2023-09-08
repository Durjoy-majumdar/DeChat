package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_refresh */
public class bottomsheet_icon_refresh extends C24542c {
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
                instancePath.moveTo(47.0f, 87.98775f);
                Path path = instancePath;
                path.cubicTo(25.370693f, 87.45702f, 8.0f, 69.75708f, 8.0f, 48.0f);
                path.cubicTo(8.0f, 34.31184f, 14.875527f, 22.229542f, 25.36142f, 15.018275f);
                instancePath.lineTo(31.139889f, 20.796743f);
                Path path2 = instancePath;
                path2.cubicTo(22.05139f, 26.441599f, 16.0f, 36.51411f, 16.0f, 48.0f);
                path2.cubicTo(16.0f, 65.338554f, 29.789598f, 79.456375f, 47.0f, 79.98467f);
                instancePath.lineTo(47.0f, 70.0f);
                instancePath.lineTo(65.0f, 88.0f);
                instancePath.lineTo(47.0f, 88.0f);
                instancePath.lineTo(47.0f, 87.98775f);
                instancePath.close();
                instancePath.moveTo(47.0f, 8.012256f);
                Path path3 = instancePath;
                path3.cubicTo(47.332344f, 8.004101f, 47.66569f, 8.0f, 48.0f, 8.0f);
                path3.cubicTo(70.09139f, 8.0f, 88.0f, 25.90861f, 88.0f, 48.0f);
                path3.cubicTo(88.0f, 62.075714f, 80.72963f, 74.45335f, 69.73931f, 81.58246f);
                instancePath.lineTo(63.921238f, 75.76438f);
                Path path4 = instancePath;
                path4.cubicTo(73.52948f, 70.24273f, 80.0f, 59.877f, 80.0f, 48.0f);
                path4.cubicTo(80.0f, 30.326887f, 65.67311f, 16.0f, 48.0f, 16.0f);
                path4.cubicTo(47.665443f, 16.0f, 47.332085f, 16.005135f, 47.0f, 16.015327f);
                instancePath.lineTo(47.0f, 26.0f);
                instancePath.lineTo(29.0f, 8.0f);
                instancePath.lineTo(47.0f, 8.0f);
                instancePath.lineTo(47.0f, 8.012256f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
