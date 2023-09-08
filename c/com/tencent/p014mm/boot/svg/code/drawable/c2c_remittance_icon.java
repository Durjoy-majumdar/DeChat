package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.c2c_remittance_icon */
public class c2c_remittance_icon extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 120;
        }
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
            instancePaint3.setColor(-1);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(60.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
            path.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
            path.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
            path.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(60.0f, 7.2f);
            Path path2 = instancePath;
            path2.cubicTo(30.839365f, 7.2f, 7.2f, 30.839365f, 7.2f, 60.0f);
            path2.cubicTo(7.2f, 89.16064f, 30.839365f, 112.8f, 60.0f, 112.8f);
            path2.cubicTo(89.16064f, 112.8f, 112.8f, 89.16064f, 112.8f, 60.0f);
            path2.cubicTo(112.8f, 30.839365f, 89.16064f, 7.2f, 60.0f, 7.2f);
            instancePath.close();
            instancePath.moveTo(87.0f, 65.28f);
            path2.cubicTo(88.65685f, 65.28f, 90.0f, 66.623146f, 90.0f, 68.28f);
            path2.cubicTo(90.0f, 69.1679f, 89.60669f, 70.01019f, 88.9259f, 70.58019f);
            instancePath.lineTo(69.95742f, 86.462135f);
            Path path3 = instancePath;
            path3.cubicTo(68.94113f, 87.31306f, 67.42746f, 87.17899f, 66.576546f, 86.162704f);
            path3.cubicTo(65.89622f, 85.35017f, 65.829346f, 84.18759f, 66.412025f, 83.30241f);
            instancePath.lineTo(73.53589f, 72.48f);
            instancePath.lineTo(30.275295f, 72.48f);
            instancePath.lineTo(30.275295f, 65.28f);
            instancePath.lineTo(87.0f, 65.28f);
            instancePath.close();
            instancePath.moveTo(53.69875f, 33.859333f);
            instancePath.cubicTo(54.379078f, 34.671875f, 54.445946f, 35.834446f, 53.86327f, 36.719635f);
            instancePath.lineTo(46.73941f, 47.542038f);
            instancePath.lineTo(90.0f, 47.542038f);
            instancePath.lineTo(90.0f, 54.74204f);
            instancePath.lineTo(33.275295f, 54.74204f);
            Path path4 = instancePath;
            path4.cubicTo(31.61844f, 54.74204f, 30.275295f, 53.39889f, 30.275295f, 51.74204f);
            path4.cubicTo(30.275295f, 50.854137f, 30.668608f, 50.01185f, 31.349388f, 49.441845f);
            instancePath.lineTo(50.31787f, 33.559902f);
            instancePath.cubicTo(51.33416f, 32.708984f, 52.84783f, 32.843044f, 53.69875f, 33.859333f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
