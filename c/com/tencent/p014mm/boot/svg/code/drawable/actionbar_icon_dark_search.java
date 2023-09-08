package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.actionbar_icon_dark_search */
public class actionbar_icon_dark_search extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(51.487274f, 48.305294f);
                instancePath.lineTo(62.849243f, 59.667263f);
                instancePath.lineTo(59.667263f, 62.849243f);
                instancePath.lineTo(48.305294f, 51.487274f);
                Path path = instancePath;
                path.cubicTo(44.15103f, 54.930374f, 38.817215f, 57.0f, 33.0f, 57.0f);
                path.cubicTo(19.745142f, 57.0f, 9.0f, 46.254856f, 9.0f, 33.0f);
                path.cubicTo(9.0f, 19.745142f, 19.745142f, 9.0f, 33.0f, 9.0f);
                path.cubicTo(46.254856f, 9.0f, 57.0f, 19.745142f, 57.0f, 33.0f);
                path.cubicTo(57.0f, 38.817215f, 54.930374f, 44.15103f, 51.487274f, 48.305294f);
                instancePath.close();
                instancePath.moveTo(52.54228f, 33.006664f);
                Path path2 = instancePath;
                path2.cubicTo(52.54228f, 22.237095f, 43.81185f, 13.506665f, 33.04228f, 13.506665f);
                path2.cubicTo(22.272707f, 13.506665f, 13.542279f, 22.237095f, 13.542279f, 33.006664f);
                path2.cubicTo(13.542279f, 43.776237f, 22.272707f, 52.506664f, 33.04228f, 52.506664f);
                path2.cubicTo(43.81185f, 52.506664f, 52.54228f, 43.776237f, 52.54228f, 33.006664f);
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
