package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.popvideo_post_selected */
public class popvideo_post_selected extends C24542c {
    private final int height = 36;
    private final int width = 36;

    public int doCommand(int i, Object... objArr) {
        int i2 = 36;
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
                instancePaint3.setColor(-15819547);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(18.0f, 36.0f);
                Path path = instancePath;
                path.cubicTo(8.058874f, 36.0f, 0.0f, 27.941126f, 0.0f, 18.0f);
                path.cubicTo(0.0f, 8.058874f, 8.058874f, 0.0f, 18.0f, 0.0f);
                path.cubicTo(27.941126f, 0.0f, 36.0f, 8.058874f, 36.0f, 18.0f);
                path.cubicTo(36.0f, 27.941126f, 27.941126f, 36.0f, 18.0f, 36.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(15.882187f, 21.850769f);
                instancePath2.lineTo(25.960957f, 11.772f);
                instancePath2.lineTo(27.873507f, 13.684549f);
                instancePath2.lineTo(17.159441f, 24.394556f);
                Path path2 = instancePath2;
                path2.cubicTo(16.45635f, 25.097353f, 15.316654f, 25.097116f, 14.613856f, 24.394026f);
                path2.cubicTo(14.613791f, 24.39396f, 14.613726f, 24.393896f, 14.613661f, 24.393831f);
                instancePath2.lineTo(9.0f, 18.775719f);
                instancePath2.lineTo(10.903567f, 16.87215f);
                instancePath2.lineTo(15.882187f, 21.850769f);
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
