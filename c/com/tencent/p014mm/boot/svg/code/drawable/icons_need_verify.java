package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_need_verify */
public class icons_need_verify extends C24542c {
    private final int height = 64;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = 64;
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
                instancePaint3.setColor(-15616);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(32.0f, 5.3333335f);
                Path path = instancePath;
                path.cubicTo(46.727592f, 5.3333335f, 58.666668f, 17.272408f, 58.666668f, 32.0f);
                path.cubicTo(58.666668f, 46.727592f, 46.727592f, 58.666668f, 32.0f, 58.666668f);
                path.cubicTo(17.272408f, 58.666668f, 5.3333335f, 46.727592f, 5.3333335f, 32.0f);
                path.cubicTo(5.3333335f, 17.272408f, 17.272408f, 5.3333335f, 32.0f, 5.3333335f);
                instancePath.close();
                instancePath.moveTo(31.988022f, 40.903645f);
                Path path2 = instancePath;
                path2.cubicTo(30.657293f, 40.903645f, 29.6f, 41.92448f, 29.6f, 43.255207f);
                path2.cubicTo(29.6f, 44.585938f, 30.657293f, 45.60677f, 31.988022f, 45.60677f);
                path2.cubicTo(33.35521f, 45.60677f, 34.39427f, 44.585938f, 34.39427f, 43.255207f);
                path2.cubicTo(34.39427f, 41.92448f, 33.35521f, 40.903645f, 31.988022f, 40.903645f);
                instancePath.close();
                instancePath.moveTo(34.02969f, 16.361979f);
                instancePath.lineTo(29.964584f, 16.361979f);
                instancePath.lineTo(30.25625f, 36.619793f);
                instancePath.lineTo(33.73802f, 36.619793f);
                instancePath.lineTo(34.02969f, 16.361979f);
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
