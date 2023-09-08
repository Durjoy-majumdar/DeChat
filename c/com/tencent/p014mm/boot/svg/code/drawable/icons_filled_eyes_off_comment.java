package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_eyes_off_comment */
public class icons_filled_eyes_off_comment extends C24542c {
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
        instancePath.moveTo(17.0f, 12.0f);
        Path path = instancePath;
        path.cubicTo(19.761423f, 12.0f, 22.0f, 14.238576f, 22.0f, 17.0f);
        path.cubicTo(22.0f, 19.761423f, 19.761423f, 22.0f, 17.0f, 22.0f);
        path.cubicTo(14.238576f, 22.0f, 12.0f, 19.761423f, 12.0f, 17.0f);
        path.cubicTo(12.0f, 14.238576f, 14.238576f, 12.0f, 17.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(14.051692f, 15.113071f);
        path.cubicTo(13.702494f, 15.657558f, 13.5f, 16.305132f, 13.5f, 17.0f);
        path.cubicTo(13.5f, 18.932997f, 15.067003f, 20.5f, 17.0f, 20.5f);
        path.cubicTo(17.694868f, 20.5f, 18.342442f, 20.297506f, 18.886929f, 19.948309f);
        instancePath.lineTo(14.051692f, 15.113071f);
        instancePath.close();
        instancePath.moveTo(17.0f, 13.5f);
        path.cubicTo(16.305132f, 13.5f, 15.657558f, 13.702494f, 15.113071f, 14.051692f);
        instancePath.lineTo(19.948309f, 18.886929f);
        Path path2 = instancePath;
        path2.cubicTo(20.297506f, 18.342442f, 20.5f, 17.694868f, 20.5f, 17.0f);
        path2.cubicTo(20.5f, 15.067003f, 18.932997f, 13.5f, 17.0f, 13.5f);
        instancePath.close();
        instancePath.moveTo(12.0f, 2.8f);
        path2.cubicTo(16.807985f, 2.8f, 20.972399f, 5.647857f, 23.000246f, 9.800502f);
        path2.cubicTo(22.59191f, 10.636313f, 22.097034f, 11.419257f, 21.527794f, 12.136749f);
        path2.cubicTo(20.356958f, 10.999647f, 18.760185f, 10.3f, 17.0f, 10.3f);
        path2.cubicTo(16.459064f, 10.3f, 15.93356f, 10.366077f, 15.431122f, 10.490602f);
        path2.cubicTo(15.4765215f, 10.267731f, 15.5f, 10.036607f, 15.5f, 9.8f);
        path2.cubicTo(15.5f, 7.8670034f, 13.932997f, 6.3f, 12.0f, 6.3f);
        path2.cubicTo(10.067003f, 6.3f, 8.5f, 7.8670034f, 8.5f, 9.8f);
        path2.cubicTo(8.5f, 11.577803f, 9.825485f, 13.046021f, 11.542117f, 13.270319f);
        path2.cubicTo(10.898822f, 14.260761f, 10.518794f, 15.439152f, 10.500678f, 16.70511f);
        path2.cubicTo(6.33763f, 16.184742f, 2.8143306f, 13.514596f, 1.0002397f, 9.80049f);
        path2.cubicTo(3.0276008f, 5.647857f, 7.1920156f, 2.8f, 12.0f, 2.8f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
