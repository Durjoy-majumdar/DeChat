package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_pic_icon */
public class ofm_pic_icon extends C24542c {
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
                instancePaint3.setColor(-1);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(78.0f, 23.0f);
                instancePath.lineTo(18.0f, 23.0f);
                instancePath.cubicTo(16.344f, 23.0f, 15.0f, 24.343f, 15.0f, 26.0f);
                instancePath.lineTo(15.0f, 70.0f);
                instancePath.cubicTo(15.0f, 71.657f, 16.344f, 73.0f, 18.0f, 73.0f);
                instancePath.lineTo(78.0f, 73.0f);
                instancePath.cubicTo(79.656f, 73.0f, 81.0f, 71.657f, 81.0f, 70.0f);
                instancePath.lineTo(81.0f, 26.0f);
                Path path = instancePath;
                path.cubicTo(81.0f, 24.343f, 79.656f, 23.0f, 78.0f, 23.0f);
                instancePath.close();
                instancePath.moveTo(76.0f, 59.0f);
                path.cubicTo(73.152f, 54.088184f, 68.083f, 47.354908f, 63.744f, 47.354908f);
                path.cubicTo(62.005f, 47.354908f, 58.828f, 49.3773f, 55.663f, 52.12908f);
                path.cubicTo(56.991f, 55.097874f, 58.811f, 58.14101f, 58.8f, 58.14101f);
                path.cubicTo(57.888f, 58.14101f, 55.199f, 53.835007f, 55.199f, 53.835007f);
                path.cubicTo(55.026f, 53.55973f, 54.844f, 53.290478f, 54.659f, 53.026253f);
                path.cubicTo(54.605f, 53.07548f, 54.552f, 53.123703f, 54.498f, 53.17293f);
                path.cubicTo(51.521f, 49.35821f, 45.061f, 40.19967f, 39.359f, 40.19967f);
                path.cubicTo(35.016f, 40.19967f, 24.034f, 50.0655f, 20.0f, 57.164474f);
                instancePath.lineTo(20.0f, 28.0f);
                instancePath.lineTo(76.0f, 28.0f);
                instancePath.lineTo(76.0f, 59.0f);
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
