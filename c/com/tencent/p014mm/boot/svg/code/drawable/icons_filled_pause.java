package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_pause */
public class icons_filled_pause extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(19.5f, 13.5f);
        instancePath.lineTo(25.5f, 13.5f);
        instancePath.cubicTo(27.156855f, 13.5f, 28.5f, 14.843145f, 28.5f, 16.5f);
        instancePath.lineTo(28.5f, 55.5f);
        Path path = instancePath;
        path.cubicTo(28.5f, 57.156853f, 27.156855f, 58.5f, 25.5f, 58.5f);
        instancePath.lineTo(19.5f, 58.5f);
        path.cubicTo(17.843145f, 58.5f, 16.5f, 57.156853f, 16.5f, 55.5f);
        instancePath.lineTo(16.5f, 16.5f);
        path.cubicTo(16.5f, 14.843145f, 17.843145f, 13.5f, 19.5f, 13.5f);
        instancePath.close();
        instancePath.moveTo(46.5f, 13.5f);
        instancePath.lineTo(52.5f, 13.5f);
        Path path2 = instancePath;
        path2.cubicTo(54.156853f, 13.5f, 55.5f, 14.843145f, 55.5f, 16.5f);
        instancePath.lineTo(55.5f, 55.5f);
        path2.cubicTo(55.5f, 57.156853f, 54.156853f, 58.5f, 52.5f, 58.5f);
        instancePath.lineTo(46.5f, 58.5f);
        path2.cubicTo(44.843147f, 58.5f, 43.5f, 57.156853f, 43.5f, 55.5f);
        instancePath.lineTo(43.5f, 16.5f);
        path2.cubicTo(43.5f, 14.843145f, 44.843147f, 13.5f, 46.5f, 13.5f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
