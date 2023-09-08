package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_mike_off */
public class icon_filled_mike_off extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.803045f, 14.681725f);
        instancePath.cubicTo(17.246958f, 13.888364f, 17.5f, 12.973733f, 17.5f, 12.0f);
        instancePath.lineTo(17.5f, 10.0f);
        instancePath.lineTo(19.0f, 10.0f);
        instancePath.lineTo(19.0f, 12.0f);
        instancePath.cubicTo(19.0f, 13.390109f, 18.594795f, 14.685577f, 17.896053f, 15.774734f);
        instancePath.lineTo(22.091883f, 19.970562f);
        instancePath.lineTo(21.031223f, 21.031223f);
        instancePath.lineTo(4.0606604f, 4.0606604f);
        instancePath.lineTo(5.1213202f, 3.0f);
        instancePath.lineTo(8.001753f, 5.8804326f);
        Path path = instancePath;
        path.cubicTo(8.064982f, 3.7266023f, 9.830856f, 2.0f, 12.0f, 2.0f);
        path.cubicTo(14.209139f, 2.0f, 16.0f, 3.790861f, 16.0f, 6.0f);
        instancePath.lineTo(16.0f, 12.0f);
        instancePath.cubicTo(16.0f, 12.554274f, 15.887263f, 13.082216f, 15.68347f, 13.562149f);
        instancePath.lineTo(16.803045f, 14.681725f);
        instancePath.lineTo(16.803045f, 14.681725f);
        instancePath.close();
        instancePath.moveTo(14.681725f, 16.803045f);
        instancePath.lineTo(15.774734f, 17.896053f);
        instancePath.cubicTo(14.884093f, 18.467438f, 13.8554945f, 18.842539f, 12.75f, 18.960293f);
        instancePath.lineTo(12.75f, 22.0f);
        instancePath.lineTo(11.25f, 22.0f);
        instancePath.lineTo(11.25f, 18.960293f);
        instancePath.cubicTo(7.736675f, 18.586063f, 5.0f, 15.612624f, 5.0f, 12.0f);
        instancePath.lineTo(5.0f, 10.0f);
        instancePath.lineTo(6.5f, 10.0f);
        instancePath.lineTo(6.5f, 12.0f);
        Path path2 = instancePath;
        path2.cubicTo(6.5f, 15.037566f, 8.962434f, 17.5f, 12.0f, 17.5f);
        path2.cubicTo(12.973733f, 17.5f, 13.888364f, 17.246958f, 14.681725f, 16.803045f);
        instancePath.lineTo(14.681725f, 16.803045f);
        instancePath.close();
        instancePath.moveTo(13.562149f, 15.68347f);
        path2.cubicTo(13.082216f, 15.887263f, 12.554274f, 16.0f, 12.0f, 16.0f);
        path2.cubicTo(9.790861f, 16.0f, 8.0f, 14.209139f, 8.0f, 12.0f);
        instancePath.lineTo(8.0f, 10.121321f);
        instancePath.lineTo(13.562149f, 15.68347f);
        instancePath.lineTo(13.562149f, 15.68347f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
