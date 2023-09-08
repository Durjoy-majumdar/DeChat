package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_transfer_text */
public class icons_filled_transfer_text extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.0f, 9.0f);
        instancePath.lineTo(60.0f, 9.0f);
        Path path = instancePath;
        path.cubicTo(61.656853f, 9.0f, 63.0f, 10.343145f, 63.0f, 12.0f);
        instancePath.lineTo(63.0f, 60.0f);
        path.cubicTo(63.0f, 61.656853f, 61.656853f, 63.0f, 60.0f, 63.0f);
        instancePath.lineTo(12.0f, 63.0f);
        path.cubicTo(10.343145f, 63.0f, 9.0f, 61.656853f, 9.0f, 60.0f);
        instancePath.lineTo(9.0f, 12.0f);
        path.cubicTo(9.0f, 10.343145f, 10.343145f, 9.0f, 12.0f, 9.0f);
        instancePath.close();
        instancePath.moveTo(21.594f, 26.544f);
        instancePath.lineTo(21.594f, 29.976f);
        instancePath.lineTo(26.61f, 29.976f);
        Path path2 = instancePath;
        path2.cubicTo(27.996f, 34.761f, 30.471f, 38.952f, 34.035f, 42.582f);
        path2.cubicTo(30.603f, 45.486f, 26.247f, 47.598f, 21.0f, 48.951f);
        instancePath.lineTo(22.848f, 51.987f);
        Path path3 = instancePath;
        path3.cubicTo(28.227f, 50.469f, 32.781f, 48.06f, 36.477f, 44.793f);
        path3.cubicTo(39.975f, 47.697f, 44.364f, 50.139f, 49.644f, 52.119f);
        instancePath.lineTo(51.558f, 49.182f);
        Path path4 = instancePath;
        path4.cubicTo(46.542f, 47.334f, 42.318f, 45.09f, 38.919f, 42.384f);
        path4.cubicTo(41.955f, 39.051f, 44.265f, 34.926f, 45.849f, 29.976f);
        instancePath.lineTo(50.832f, 29.976f);
        instancePath.lineTo(50.832f, 26.544f);
        instancePath.lineTo(38.358f, 26.544f);
        instancePath.cubicTo(37.368f, 24.399f, 36.279f, 22.551f, 35.091f, 21.0f);
        instancePath.lineTo(31.626f, 22.254f);
        Path path5 = instancePath;
        path5.cubicTo(32.814f, 23.607f, 33.837f, 25.026f, 34.662f, 26.544f);
        instancePath.lineTo(21.594f, 26.544f);
        instancePath.close();
        instancePath.moveTo(29.91f, 29.976f);
        instancePath.lineTo(42.285f, 29.976f);
        path5.cubicTo(40.998f, 33.969f, 39.051f, 37.401f, 36.477f, 40.239f);
        path5.cubicTo(33.441f, 37.269f, 31.263f, 33.87f, 29.91f, 29.976f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
