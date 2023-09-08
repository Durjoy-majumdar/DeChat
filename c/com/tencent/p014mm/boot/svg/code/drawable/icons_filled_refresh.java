package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_refresh */
public class icons_filled_refresh extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(52.970562f, 22.029438f);
        Path path = instancePath;
        path.cubicTo(57.31371f, 26.372583f, 60.0f, 32.37258f, 60.0f, 39.0f);
        path.cubicTo(60.0f, 52.254833f, 49.254833f, 63.0f, 36.0f, 63.0f);
        path.cubicTo(22.745167f, 63.0f, 12.0f, 52.254833f, 12.0f, 39.0f);
        path.cubicTo(12.0f, 25.745167f, 22.745167f, 15.0f, 36.0f, 15.0f);
        instancePath.lineTo(36.0f, 21.0f);
        Path path2 = instancePath;
        path2.cubicTo(26.058874f, 21.0f, 18.0f, 29.058874f, 18.0f, 39.0f);
        path2.cubicTo(18.0f, 48.941124f, 26.058874f, 57.0f, 36.0f, 57.0f);
        path2.cubicTo(45.941124f, 57.0f, 54.0f, 48.941124f, 54.0f, 39.0f);
        path2.cubicTo(54.0f, 34.155792f, 52.085682f, 29.629839f, 48.72792f, 26.272078f);
        instancePath.lineTo(52.970562f, 22.029438f);
        instancePath.close();
        instancePath.moveTo(31.63806f, 15.395418f);
        instancePath.lineTo(26.485281f, 10.2426405f);
        instancePath.lineTo(30.727922f, 6.0f);
        instancePath.lineTo(42.395184f, 17.667261f);
        instancePath.cubicTo(42.980972f, 18.253048f, 42.980972f, 19.202795f, 42.395184f, 19.788582f);
        instancePath.lineTo(30.727922f, 31.455845f);
        instancePath.lineTo(26.485281f, 27.213203f);
        instancePath.lineTo(32.322514f, 21.375973f);
        Path path3 = instancePath;
        path3.cubicTo(24.145084f, 23.07356f, 18.0f, 30.319149f, 18.0f, 39.0f);
        path3.cubicTo(18.0f, 48.941124f, 26.058874f, 57.0f, 36.0f, 57.0f);
        path3.cubicTo(45.941124f, 57.0f, 54.0f, 48.941124f, 54.0f, 39.0f);
        path3.cubicTo(54.0f, 34.155792f, 52.085682f, 29.629839f, 48.72792f, 26.272078f);
        instancePath.lineTo(52.970562f, 22.029438f);
        path3.cubicTo(57.31371f, 26.372583f, 60.0f, 32.37258f, 60.0f, 39.0f);
        path3.cubicTo(60.0f, 52.254833f, 49.254833f, 63.0f, 36.0f, 63.0f);
        path3.cubicTo(22.745167f, 63.0f, 12.0f, 52.254833f, 12.0f, 39.0f);
        path3.cubicTo(12.0f, 27.234737f, 20.465796f, 17.446768f, 31.63806f, 15.395418f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
