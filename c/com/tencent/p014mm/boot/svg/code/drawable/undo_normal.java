package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.undo_normal */
public class undo_normal extends C24542c {
    private final int height = 63;
    private final int width = 63;

    public int doCommand(int i, Object... objArr) {
        int i2 = 63;
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
                instancePath.moveTo(21.0f, 21.0f);
                instancePath.lineTo(43.5f, 21.0f);
                instancePath.lineTo(43.5f, 21.127842f);
                Path path = instancePath;
                path.cubicTo(51.115696f, 22.108934f, 57.0f, 28.61729f, 57.0f, 36.5f);
                path.cubicTo(57.0f, 44.209316f, 51.37172f, 50.604076f, 44.0f, 51.79944f);
                instancePath.lineTo(44.0f, 52.0f);
                instancePath.lineTo(20.0f, 52.0f);
                instancePath.lineTo(20.0f, 46.0f);
                instancePath.lineTo(44.0f, 46.0f);
                instancePath.lineTo(44.0f, 46.16791f);
                Path path2 = instancePath;
                path2.cubicTo(47.53181f, 44.624798f, 50.0f, 41.10064f, 50.0f, 37.0f);
                path2.cubicTo(50.0f, 32.07876f, 46.445118f, 27.987804f, 41.763157f, 27.15494f);
                instancePath.lineTo(41.763157f, 27.0f);
                instancePath.lineTo(21.0f, 27.0f);
                instancePath.lineTo(21.0f, 32.99984f);
                instancePath.cubicTo(21.0f, 34.664913f, 19.933712f, 35.176052f, 18.61838f, 34.159657f);
                instancePath.lineTo(6.88162f, 25.090343f);
                instancePath.cubicTo(5.5572495f, 24.066965f, 5.5662875f, 22.42605f, 6.88162f, 21.409657f);
                instancePath.lineTo(18.61838f, 12.3403425f);
                instancePath.cubicTo(19.94275f, 11.316965f, 21.0f, 11.843217f, 21.0f, 13.500159f);
                instancePath.lineTo(21.0f, 21.0f);
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
