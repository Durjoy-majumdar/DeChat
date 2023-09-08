package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pause2 */
public class icons_outlined_pause2 extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(55.882812f, 0.0f, 72.0f, 16.117188f, 72.0f, 36.0f);
        path.cubicTo(72.0f, 55.882812f, 55.882812f, 72.0f, 36.0f, 72.0f);
        path.cubicTo(16.117188f, 72.0f, 0.0f, 55.882812f, 0.0f, 36.0f);
        path.cubicTo(0.0f, 16.117188f, 16.117188f, 0.0f, 36.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(36.0f, 2.160156f);
        Path path2 = instancePath;
        path2.cubicTo(17.3125f, 2.160156f, 2.160156f, 17.3125f, 2.160156f, 36.0f);
        path2.cubicTo(2.160156f, 54.6875f, 17.3125f, 69.83984f, 36.0f, 69.83984f);
        path2.cubicTo(54.6875f, 69.83984f, 69.83984f, 54.6875f, 69.83984f, 36.0f);
        path2.cubicTo(69.83984f, 17.3125f, 54.6875f, 2.160156f, 36.0f, 2.160156f);
        instancePath.close();
        instancePath.moveTo(30.601562f, 23.398438f);
        instancePath.cubicTo(31.59375f, 23.398438f, 32.398438f, 24.152344f, 32.398438f, 25.078125f);
        instancePath.lineTo(32.398438f, 46.921875f);
        instancePath.cubicTo(32.398438f, 47.847656f, 31.59375f, 48.601562f, 30.601562f, 48.601562f);
        instancePath.lineTo(27.0f, 48.601562f);
        instancePath.cubicTo(26.007812f, 48.601562f, 25.199219f, 47.847656f, 25.199219f, 46.921875f);
        instancePath.lineTo(25.199219f, 25.078125f);
        Path path3 = instancePath;
        path3.cubicTo(25.199219f, 24.152344f, 26.007812f, 23.398438f, 27.0f, 23.398438f);
        instancePath.close();
        instancePath.moveTo(45.0f, 23.398438f);
        path3.cubicTo(45.992188f, 23.398438f, 46.80078f, 24.152344f, 46.80078f, 25.078125f);
        instancePath.lineTo(46.80078f, 46.921875f);
        instancePath.cubicTo(46.80078f, 47.847656f, 45.992188f, 48.601562f, 45.0f, 48.601562f);
        instancePath.lineTo(41.398438f, 48.601562f);
        instancePath.cubicTo(40.40625f, 48.601562f, 39.601562f, 47.847656f, 39.601562f, 46.921875f);
        instancePath.lineTo(39.601562f, 25.078125f);
        instancePath.cubicTo(39.601562f, 24.152344f, 40.40625f, 23.398438f, 41.398438f, 23.398438f);
        instancePath.close();
        instancePath.moveTo(45.0f, 23.398438f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
