package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.realname_done */
public class realname_done extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = 192;
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
                instancePaint3.setColor(-16268960);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(96.0f, 176.0f);
                Path path = instancePath;
                path.cubicTo(51.81722f, 176.0f, 16.0f, 140.18279f, 16.0f, 96.0f);
                path.cubicTo(16.0f, 51.81722f, 51.81722f, 16.0f, 96.0f, 16.0f);
                path.cubicTo(140.18279f, 16.0f, 176.0f, 51.81722f, 176.0f, 96.0f);
                path.cubicTo(176.0f, 140.18279f, 140.18279f, 176.0f, 96.0f, 176.0f);
                instancePath.close();
                instancePath.moveTo(86.5875f, 113.11453f);
                instancePath.lineTo(64.460304f, 90.987335f);
                instancePath.lineTo(56.0f, 99.44764f);
                instancePath.lineTo(80.95047f, 124.41615f);
                Path path2 = instancePath;
                path2.cubicTo(80.94989f, 124.41731f, 80.95018f, 124.4176f, 80.95047f, 124.41789f);
                path2.cubicTo(84.07402f, 127.54274f, 89.139336f, 127.54379f, 92.26331f, 124.41937f);
                instancePath.lineTo(139.88225f, 76.82022f);
                instancePath.lineTo(131.38203f, 68.32f);
                instancePath.lineTo(86.5875f, 113.11453f);
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
