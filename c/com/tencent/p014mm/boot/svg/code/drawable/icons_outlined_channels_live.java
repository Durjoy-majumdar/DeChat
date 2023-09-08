package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_channels_live */
public class icons_outlined_channels_live extends C24542c {
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
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(24.0f, 0.0f);
                instancePath.lineTo(24.0f, 24.0f);
                instancePath.lineTo(0.0f, 24.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(12.0f, 2.0f);
                Path path = instancePath2;
                path.cubicTo(17.522848f, 2.0f, 22.0f, 6.4771523f, 22.0f, 12.0f);
                path.cubicTo(22.0f, 17.522848f, 17.522848f, 22.0f, 12.0f, 22.0f);
                path.cubicTo(6.4771523f, 22.0f, 2.0f, 17.522848f, 2.0f, 12.0f);
                path.cubicTo(2.0f, 6.4771523f, 6.4771523f, 2.0f, 12.0f, 2.0f);
                instancePath2.close();
                instancePath2.moveTo(12.0f, 3.2f);
                Path path2 = instancePath2;
                path2.cubicTo(7.139894f, 3.2f, 3.2f, 7.139894f, 3.2f, 12.0f);
                path2.cubicTo(3.2f, 16.860106f, 7.139894f, 20.8f, 12.0f, 20.8f);
                path2.cubicTo(16.860106f, 20.8f, 20.8f, 16.860106f, 20.8f, 12.0f);
                path2.cubicTo(20.8f, 7.139894f, 16.860106f, 3.2f, 12.0f, 3.2f);
                instancePath2.close();
                instancePath2.moveTo(12.0f, 6.5f);
                Path path3 = instancePath2;
                path3.cubicTo(15.037566f, 6.5f, 17.5f, 8.962434f, 17.5f, 12.0f);
                path3.cubicTo(17.5f, 15.037566f, 15.037566f, 17.5f, 12.0f, 17.5f);
                path3.cubicTo(8.962434f, 17.5f, 6.5f, 15.037566f, 6.5f, 12.0f);
                path3.cubicTo(6.5f, 8.962434f, 8.962434f, 6.5f, 12.0f, 6.5f);
                instancePath2.close();
                instancePath2.moveTo(12.0f, 7.7f);
                Path path4 = instancePath2;
                path4.cubicTo(9.625175f, 7.7f, 7.7f, 9.625175f, 7.7f, 12.0f);
                path4.cubicTo(7.7f, 14.374825f, 9.625175f, 16.3f, 12.0f, 16.3f);
                path4.cubicTo(14.374825f, 16.3f, 16.3f, 14.374825f, 16.3f, 12.0f);
                path4.cubicTo(16.3f, 9.625175f, 14.374825f, 7.7f, 12.0f, 7.7f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
