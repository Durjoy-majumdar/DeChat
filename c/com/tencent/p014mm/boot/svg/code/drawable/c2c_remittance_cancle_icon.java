package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.c2c_remittance_cancle_icon */
public class c2c_remittance_cancle_icon extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
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
        instancePath.moveTo(46.970562f, 34.800003f);
        instancePath.lineTo(52.061733f, 39.89117f);
        instancePath.lineTo(43.949646f, 47.99859f);
        instancePath.lineTo(72.0f, 48.0f);
        Path path3 = instancePath;
        path3.cubicTo(81.941124f, 48.0f, 90.0f, 56.058876f, 90.0f, 66.0f);
        path3.cubicTo(90.0f, 75.941124f, 81.941124f, 84.0f, 72.0f, 84.0f);
        instancePath.lineTo(60.0f, 84.0f);
        instancePath.lineTo(60.0f, 76.8f);
        instancePath.lineTo(72.0f, 76.8f);
        Path path4 = instancePath;
        path4.cubicTo(77.964676f, 76.8f, 82.8f, 71.964676f, 82.8f, 66.0f);
        path4.cubicTo(82.8f, 60.035324f, 77.964676f, 55.2f, 72.0f, 55.2f);
        instancePath.lineTo(43.610825f, 55.19859f);
        instancePath.lineTo(52.061733f, 63.649956f);
        instancePath.lineTo(46.970562f, 68.74113f);
        instancePath.lineTo(32.12132f, 53.891884f);
        instancePath.cubicTo(30.949747f, 52.72031f, 30.949747f, 50.820816f, 32.12132f, 49.649242f);
        instancePath.lineTo(46.970562f, 34.800003f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
