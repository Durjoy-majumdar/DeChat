package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.connect_folder */
public class connect_folder extends C24542c {
    private final int height = 104;
    private final int width = 104;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 104;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(104.0f, 0.0f);
        instancePath.lineTo(104.0f, 104.0f);
        instancePath.lineTo(0.0f, 104.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.2f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(37.7062f, 17.933332f);
        instancePath2.lineTo(45.8312f, 24.433332f);
        instancePath2.lineTo(91.0f, 24.433332f);
        Path path = instancePath2;
        path.cubicTo(92.03093f, 24.433332f, 92.964264f, 24.8512f, 93.63986f, 25.526802f);
        path.cubicTo(94.31547f, 26.202402f, 94.73333f, 27.135735f, 94.73333f, 28.166666f);
        instancePath2.lineTo(94.73333f, 28.166666f);
        instancePath2.lineTo(94.73333f, 82.333336f);
        Path path2 = instancePath2;
        path2.cubicTo(94.73333f, 83.364265f, 94.31547f, 84.2976f, 93.63986f, 84.9732f);
        path2.cubicTo(92.964264f, 85.648796f, 92.03093f, 86.066666f, 91.0f, 86.066666f);
        instancePath2.lineTo(91.0f, 86.066666f);
        instancePath2.lineTo(13.0f, 86.066666f);
        Path path3 = instancePath2;
        path3.cubicTo(11.969069f, 86.066666f, 11.035735f, 85.648796f, 10.360135f, 84.9732f);
        path3.cubicTo(9.684534f, 84.2976f, 9.266666f, 83.364265f, 9.266666f, 82.333336f);
        instancePath2.lineTo(9.266666f, 82.333336f);
        instancePath2.lineTo(9.266666f, 21.666666f);
        Path path4 = instancePath2;
        path4.cubicTo(9.266666f, 20.635735f, 9.684534f, 19.702402f, 10.360135f, 19.026802f);
        path4.cubicTo(11.035735f, 18.3512f, 11.969069f, 17.933332f, 13.0f, 17.933332f);
        instancePath2.lineTo(13.0f, 17.933332f);
        instancePath2.lineTo(37.7062f, 17.933332f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.2f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(8.666667f, 41.166668f);
        instancePath3.lineTo(95.333336f, 41.166668f);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
