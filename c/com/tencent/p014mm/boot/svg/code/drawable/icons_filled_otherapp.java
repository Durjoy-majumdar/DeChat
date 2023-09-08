package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_otherapp */
public class icons_filled_otherapp extends C24542c {
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
        instancePaint3.setColor(-436207616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(59.15417f, 39.0f);
        Path path = instancePath;
        path.cubicTo(60.49145f, 39.0f, 60.97638f, 39.13924f, 61.465267f, 39.4007f);
        path.cubicTo(61.95416f, 39.66216f, 62.33784f, 40.04584f, 62.5993f, 40.534733f);
        path.cubicTo(62.86076f, 41.02362f, 63.0f, 41.50855f, 63.0f, 42.84583f);
        instancePath.lineTo(63.0f, 59.15417f);
        path.cubicTo(63.0f, 60.49145f, 62.86076f, 60.97638f, 62.5993f, 61.465267f);
        path.cubicTo(62.33784f, 61.95416f, 61.95416f, 62.33784f, 61.465267f, 62.5993f);
        path.cubicTo(60.97638f, 62.86076f, 60.49145f, 63.0f, 59.15417f, 63.0f);
        instancePath.lineTo(42.84583f, 63.0f);
        path.cubicTo(41.50855f, 63.0f, 41.02362f, 62.86076f, 40.534733f, 62.5993f);
        path.cubicTo(40.04584f, 62.33784f, 39.66216f, 61.95416f, 39.4007f, 61.465267f);
        path.cubicTo(39.13924f, 60.97638f, 39.0f, 60.49145f, 39.0f, 59.15417f);
        instancePath.lineTo(39.0f, 42.84583f);
        path.cubicTo(39.0f, 41.50855f, 39.13924f, 41.02362f, 39.4007f, 40.534733f);
        path.cubicTo(39.66216f, 40.04584f, 40.04584f, 39.66216f, 40.534733f, 39.4007f);
        path.cubicTo(41.02362f, 39.13924f, 41.50855f, 39.0f, 42.84583f, 39.0f);
        instancePath.lineTo(59.15417f, 39.0f);
        instancePath.close();
        instancePath.moveTo(29.154173f, 39.0f);
        path.cubicTo(30.49145f, 39.0f, 30.97638f, 39.13924f, 31.46527f, 39.4007f);
        path.cubicTo(31.954157f, 39.66216f, 32.33784f, 40.04584f, 32.5993f, 40.534733f);
        path.cubicTo(32.86076f, 41.02362f, 33.0f, 41.50855f, 33.0f, 42.84583f);
        instancePath.lineTo(33.0f, 59.15417f);
        path.cubicTo(33.0f, 60.49145f, 32.86076f, 60.97638f, 32.5993f, 61.465267f);
        path.cubicTo(32.33784f, 61.95416f, 31.954157f, 62.33784f, 31.46527f, 62.5993f);
        path.cubicTo(30.97638f, 62.86076f, 30.49145f, 63.0f, 29.154173f, 63.0f);
        instancePath.lineTo(12.845828f, 63.0f);
        path.cubicTo(11.50855f, 63.0f, 11.023621f, 62.86076f, 10.534732f, 62.5993f);
        path.cubicTo(10.045842f, 62.33784f, 9.66216f, 61.95416f, 9.400699f, 61.465267f);
        path.cubicTo(9.139238f, 60.97638f, 9.0f, 60.49145f, 9.0f, 59.15417f);
        instancePath.lineTo(9.0f, 42.84583f);
        path.cubicTo(9.0f, 41.50855f, 9.139238f, 41.02362f, 9.400699f, 40.534733f);
        path.cubicTo(9.66216f, 40.04584f, 10.045842f, 39.66216f, 10.534732f, 39.4007f);
        path.cubicTo(11.023621f, 39.13924f, 11.50855f, 39.0f, 12.845828f, 39.0f);
        instancePath.lineTo(29.154173f, 39.0f);
        instancePath.close();
        instancePath.moveTo(59.15417f, 9.0f);
        path.cubicTo(60.49145f, 9.0f, 60.97638f, 9.139238f, 61.465267f, 9.400699f);
        path.cubicTo(61.95416f, 9.66216f, 62.33784f, 10.045842f, 62.5993f, 10.534732f);
        path.cubicTo(62.86076f, 11.023621f, 63.0f, 11.50855f, 63.0f, 12.845828f);
        instancePath.lineTo(63.0f, 29.154173f);
        path.cubicTo(63.0f, 30.49145f, 62.86076f, 30.97638f, 62.5993f, 31.46527f);
        path.cubicTo(62.33784f, 31.954157f, 61.95416f, 32.33784f, 61.465267f, 32.5993f);
        path.cubicTo(60.97638f, 32.86076f, 60.49145f, 33.0f, 59.15417f, 33.0f);
        instancePath.lineTo(42.84583f, 33.0f);
        Path path2 = instancePath;
        path2.cubicTo(41.50855f, 33.0f, 41.02362f, 32.86076f, 40.534733f, 32.5993f);
        path2.cubicTo(40.04584f, 32.33784f, 39.66216f, 31.954157f, 39.4007f, 31.46527f);
        path2.cubicTo(39.13924f, 30.97638f, 39.0f, 30.49145f, 39.0f, 29.154173f);
        instancePath.lineTo(39.0f, 12.845828f);
        path2.cubicTo(39.0f, 11.50855f, 39.13924f, 11.023621f, 39.4007f, 10.534732f);
        path2.cubicTo(39.66216f, 10.045842f, 40.04584f, 9.66216f, 40.534733f, 9.400699f);
        path2.cubicTo(41.02362f, 9.139238f, 41.50855f, 9.0f, 42.84583f, 9.0f);
        instancePath.lineTo(59.15417f, 9.0f);
        instancePath.close();
        instancePath.moveTo(21.0f, 9.0f);
        path2.cubicTo(27.627417f, 9.0f, 33.0f, 14.372583f, 33.0f, 21.0f);
        path2.cubicTo(33.0f, 27.627417f, 27.627417f, 33.0f, 21.0f, 33.0f);
        path2.cubicTo(14.372583f, 33.0f, 9.0f, 27.627417f, 9.0f, 21.0f);
        path2.cubicTo(9.0f, 14.372583f, 14.372583f, 9.0f, 21.0f, 9.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
