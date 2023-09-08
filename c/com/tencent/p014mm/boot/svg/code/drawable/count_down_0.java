package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.count_down_0 */
public class count_down_0 extends C24542c {
    private final int height = 80;
    private final int width = 80;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 80;
        }
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
            instancePaint3.setColor(-1);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(39.576f, 13.0f);
            Path path = instancePath;
            path.cubicTo(45.624f, 13.0f, 50.304f, 15.52f, 53.616f, 20.632f);
            path.cubicTo(56.64f, 25.384f, 58.152f, 31.72f, 58.152f, 39.712f);
            path.cubicTo(58.152f, 47.632f, 56.64f, 54.04f, 53.616f, 58.792f);
            path.cubicTo(50.304f, 63.832f, 45.624f, 66.424f, 39.576f, 66.424f);
            path.cubicTo(33.528f, 66.424f, 28.848f, 63.832f, 25.536f, 58.792f);
            path.cubicTo(22.512f, 54.04f, 21.0f, 47.704f, 21.0f, 39.712f);
            path.cubicTo(21.0f, 31.648f, 22.512f, 25.312f, 25.536f, 20.632f);
            path.cubicTo(28.848f, 15.52f, 33.528f, 13.0f, 39.576f, 13.0f);
            instancePath.close();
            instancePath.moveTo(39.576f, 19.624f);
            Path path2 = instancePath;
            path2.cubicTo(35.328f, 19.624f, 32.376f, 21.928f, 30.648f, 26.608f);
            path2.cubicTo(29.352f, 29.776f, 28.776f, 34.168f, 28.776f, 39.712f);
            path2.cubicTo(28.776f, 45.184f, 29.352f, 49.576f, 30.648f, 52.816f);
            path2.cubicTo(32.376f, 57.424f, 35.328f, 59.8f, 39.576f, 59.8f);
            path2.cubicTo(43.752f, 59.8f, 46.776f, 57.424f, 48.504f, 52.816f);
            path2.cubicTo(49.728f, 49.576f, 50.376f, 45.184f, 50.376f, 39.712f);
            path2.cubicTo(50.376f, 34.168f, 49.728f, 29.776f, 48.504f, 26.608f);
            path2.cubicTo(46.776f, 21.928f, 43.752f, 19.624f, 39.576f, 19.624f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
