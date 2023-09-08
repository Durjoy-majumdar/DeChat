package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.count_down_6 */
public class count_down_6 extends C24542c {
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
            instancePath.moveTo(40.224f, 13.0f);
            instancePath.cubicTo(50.16f, 13.0f, 55.848f, 17.608f, 57.144f, 26.968f);
            instancePath.lineTo(49.512f, 26.968f);
            Path path = instancePath;
            path.cubicTo(48.432f, 21.928f, 45.336f, 19.48f, 40.152f, 19.48f);
            path.cubicTo(36.552f, 19.48f, 33.744f, 21.208f, 31.656f, 24.736f);
            path.cubicTo(29.568f, 28.048f, 28.56f, 32.152f, 28.56f, 37.192f);
            path.cubicTo(28.56f, 37.408f, 28.56f, 37.696f, 28.632f, 38.128f);
            instancePath.lineTo(28.92f, 38.128f);
            Path path2 = instancePath;
            path2.cubicTo(30.36f, 35.824f, 32.16f, 34.168f, 34.392f, 33.088f);
            path2.cubicTo(36.408f, 32.008f, 38.784f, 31.504f, 41.52f, 31.504f);
            path2.cubicTo(46.56f, 31.504f, 50.592f, 33.088f, 53.616f, 36.256f);
            path2.cubicTo(56.568f, 39.496f, 58.08f, 43.672f, 58.08f, 48.712f);
            path2.cubicTo(58.08f, 53.824f, 56.352f, 58.072f, 52.968f, 61.384f);
            path2.cubicTo(49.512f, 64.696f, 45.192f, 66.424f, 40.152f, 66.424f);
            path2.cubicTo(33.816f, 66.424f, 29.064f, 64.12f, 25.752f, 59.512f);
            path2.cubicTo(22.584f, 55.12f, 21.0f, 49.0f, 21.0f, 41.152f);
            path2.cubicTo(21.0f, 32.8f, 22.656f, 26.032f, 26.112f, 20.848f);
            path2.cubicTo(29.568f, 15.592f, 34.32f, 13.0f, 40.224f, 13.0f);
            instancePath.close();
            instancePath.moveTo(39.936f, 37.84f);
            Path path3 = instancePath;
            path3.cubicTo(36.696f, 37.84f, 34.176f, 38.848f, 32.304f, 40.864f);
            path3.cubicTo(30.432f, 42.88f, 29.496f, 45.544f, 29.496f, 48.928f);
            path3.cubicTo(29.496f, 52.24f, 30.432f, 54.904f, 32.376f, 56.92f);
            path3.cubicTo(34.248f, 58.936f, 36.768f, 59.944f, 39.864f, 59.944f);
            path3.cubicTo(43.032f, 59.944f, 45.552f, 58.864f, 47.424f, 56.776f);
            path3.cubicTo(49.368f, 54.616f, 50.376f, 51.952f, 50.376f, 48.712f);
            path3.cubicTo(50.376f, 45.4f, 49.44f, 42.736f, 47.568f, 40.864f);
            path3.cubicTo(45.696f, 38.848f, 43.104f, 37.84f, 39.936f, 37.84f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
