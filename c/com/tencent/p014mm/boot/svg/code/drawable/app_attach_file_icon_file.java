package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_icon_file */
public class app_attach_file_icon_file extends C24542c {
    private final int height = 180;
    private final int width = 180;

    public int doCommand(int i, Object... objArr) {
        int i2 = 180;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-13917627);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(180.0f, 0.0f);
                instancePath.lineTo(180.0f, 180.0f);
                instancePath.lineTo(0.0f, 180.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(49.799175f, 34.8f);
                instancePath2.cubicTo(48.142776f, 34.8f, 46.8f, 36.136326f, 46.8f, 37.79583f);
                instancePath2.lineTo(46.8f, 142.20418f);
                instancePath2.cubicTo(46.8f, 143.85872f, 48.139797f, 145.2f, 49.799175f, 145.2f);
                instancePath2.lineTo(130.20082f, 145.2f);
                instancePath2.cubicTo(131.85722f, 145.2f, 133.2f, 143.86368f, 133.2f, 142.20418f);
                instancePath2.lineTo(133.2f, 37.79583f);
                instancePath2.cubicTo(133.2f, 36.141277f, 131.8602f, 34.8f, 130.20082f, 34.8f);
                instancePath2.lineTo(49.799175f, 34.8f);
                instancePath2.close();
                instancePath2.moveTo(88.8f, 84.0f);
                instancePath2.lineTo(88.8f, 90.0f);
                instancePath2.lineTo(57.6f, 90.0f);
                instancePath2.lineTo(57.6f, 84.0f);
                instancePath2.lineTo(88.8f, 84.0f);
                instancePath2.close();
                instancePath2.moveTo(108.0f, 67.2f);
                instancePath2.lineTo(108.0f, 73.2f);
                instancePath2.lineTo(57.6f, 73.2f);
                instancePath2.lineTo(57.6f, 67.2f);
                instancePath2.lineTo(108.0f, 67.2f);
                instancePath2.close();
                instancePath2.moveTo(122.4f, 51.6f);
                instancePath2.lineTo(122.4f, 57.6f);
                instancePath2.lineTo(57.6f, 57.6f);
                instancePath2.lineTo(57.6f, 51.6f);
                instancePath2.lineTo(122.4f, 51.6f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
