package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_oval_close */
public class icons_outlined_oval_close extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = 20;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(10.0f, 20.0f);
                Path path = instancePath;
                path.cubicTo(4.47715f, 20.0f, 0.0f, 15.5228f, 0.0f, 10.0f);
                path.cubicTo(0.0f, 4.47715f, 4.47715f, 0.0f, 10.0f, 0.0f);
                path.cubicTo(15.5228f, 0.0f, 20.0f, 4.47715f, 20.0f, 10.0f);
                path.cubicTo(20.0f, 15.5228f, 15.5228f, 20.0f, 10.0f, 20.0f);
                instancePath.close();
                instancePath.moveTo(10.0f, 18.8f);
                Path path2 = instancePath;
                path2.cubicTo(14.8601f, 18.8f, 18.8f, 14.8601f, 18.8f, 10.0f);
                path2.cubicTo(18.8f, 5.13989f, 14.8601f, 1.2f, 10.0f, 1.2f);
                path2.cubicTo(5.13989f, 1.2f, 1.2f, 5.13989f, 1.2f, 10.0f);
                path2.cubicTo(1.2f, 14.8601f, 5.13989f, 18.8f, 10.0f, 18.8f);
                instancePath.close();
                instancePath.moveTo(13.1113f, 6.0402f);
                instancePath.lineTo(13.9598f, 6.88873f);
                instancePath.lineTo(10.8485f, 10.0f);
                instancePath.lineTo(13.9598f, 13.1113f);
                instancePath.lineTo(13.1113f, 13.9598f);
                instancePath.lineTo(10.0f, 10.8485f);
                instancePath.lineTo(6.88873f, 13.9598f);
                instancePath.lineTo(6.0402f, 13.1113f);
                instancePath.lineTo(9.15147f, 10.0f);
                instancePath.lineTo(6.0402f, 6.88873f);
                instancePath.lineTo(6.88873f, 6.0402f);
                instancePath.lineTo(10.0f, 9.15147f);
                instancePath.lineTo(13.1113f, 6.0402f);
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
