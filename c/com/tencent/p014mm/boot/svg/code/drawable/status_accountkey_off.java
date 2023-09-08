package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.status_accountkey_off */
public class status_accountkey_off extends C24542c {
    private final int height = 46;
    private final int width = 46;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 46;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-499359);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(23.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(35.70255f, 0.0f, 46.0f, 10.29745f, 46.0f, 23.0f);
                path.cubicTo(46.0f, 35.70255f, 35.70255f, 46.0f, 23.0f, 46.0f);
                path.cubicTo(10.29745f, 46.0f, 0.0f, 35.70255f, 0.0f, 23.0f);
                path.cubicTo(0.0f, 10.29745f, 10.29745f, 0.0f, 23.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(29.85458f, 16.970005f);
                Path path2 = instancePath2;
                path2.cubicTo(29.680027f, 15.727787f, 29.348436f, 14.533834f, 28.44f, 13.570005f);
                path2.cubicTo(25.85f, 10.150005f, 20.18f, 10.140005f, 17.59f, 13.560005f);
                path2.cubicTo(15.97f, 15.310005f, 16.18f, 17.790005f, 15.83f, 19.970005f);
                instancePath2.lineTo(13.0f, 19.970005f);
                instancePath2.cubicTo(13.01f, 24.310005f, 13.01f, 28.640005f, 13.01f, 32.970005f);
                instancePath2.lineTo(33.01f, 32.970005f);
                instancePath2.cubicTo(33.01f, 28.640005f, 33.01f, 24.310005f, 33.02f, 19.970005f);
                instancePath2.lineTo(31.605f, 19.970005f);
                instancePath2.lineTo(26.1f, 19.970005f);
                instancePath2.lineTo(18.83f, 19.970005f);
                Path path3 = instancePath2;
                path3.cubicTo(18.81f, 17.350006f, 19.72f, 13.870006f, 23.0f, 13.970005f);
                path3.cubicTo(25.080025f, 13.887314f, 26.22539f, 15.273373f, 26.773254f, 16.970005f);
                instancePath2.lineTo(29.85458f, 16.970005f);
                instancePath2.lineTo(29.85458f, 16.970005f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
