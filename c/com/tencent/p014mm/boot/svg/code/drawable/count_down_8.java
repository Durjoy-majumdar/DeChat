package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.count_down_8 */
public class count_down_8 extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(40.152f, 13.0f);
            Path path = instancePath;
            path.cubicTo(45.624f, 13.0f, 49.944f, 14.44f, 53.184f, 17.32f);
            path.cubicTo(56.064f, 19.912f, 57.504f, 23.152f, 57.504f, 26.968f);
            path.cubicTo(57.504f, 29.632f, 56.928f, 31.864f, 55.776f, 33.664f);
            path.cubicTo(54.48f, 35.608f, 52.536f, 37.048f, 49.944f, 38.056f);
            instancePath.lineTo(49.944f, 38.272f);
            Path path2 = instancePath;
            path2.cubicTo(52.392f, 38.848f, 54.552f, 40.288f, 56.28f, 42.592f);
            path2.cubicTo(58.296f, 45.04f, 59.304f, 47.848f, 59.304f, 51.088f);
            path2.cubicTo(59.304f, 55.624f, 57.648f, 59.296f, 54.336f, 62.176f);
            path2.cubicTo(50.952f, 64.984f, 46.2f, 66.424f, 40.152f, 66.424f);
            path2.cubicTo(34.032f, 66.424f, 29.28f, 64.984f, 25.968f, 62.176f);
            path2.cubicTo(22.656f, 59.296f, 21.0f, 55.624f, 21.0f, 51.088f);
            path2.cubicTo(21.0f, 47.848f, 22.008f, 45.04f, 24.024f, 42.592f);
            path2.cubicTo(25.752f, 40.288f, 27.84f, 38.848f, 30.36f, 38.272f);
            instancePath.lineTo(30.36f, 38.056f);
            Path path3 = instancePath;
            path3.cubicTo(27.768f, 37.048f, 25.824f, 35.608f, 24.528f, 33.664f);
            path3.cubicTo(23.376f, 31.864f, 22.8f, 29.632f, 22.8f, 26.968f);
            path3.cubicTo(22.8f, 23.152f, 24.24f, 19.912f, 27.12f, 17.32f);
            path3.cubicTo(30.288f, 14.44f, 34.68f, 13.0f, 40.152f, 13.0f);
            instancePath.close();
            instancePath.moveTo(40.152f, 19.264f);
            Path path4 = instancePath;
            path4.cubicTo(36.984f, 19.264f, 34.464f, 20.056f, 32.592f, 21.784f);
            path4.cubicTo(30.936f, 23.224f, 30.144f, 25.096f, 30.144f, 27.256f);
            path4.cubicTo(30.144f, 29.704f, 30.792f, 31.648f, 32.16f, 33.088f);
            path4.cubicTo(33.816f, 34.816f, 36.48f, 35.68f, 40.152f, 35.68f);
            path4.cubicTo(43.752f, 35.68f, 46.416f, 34.816f, 48.144f, 33.088f);
            path4.cubicTo(49.44f, 31.648f, 50.16f, 29.704f, 50.16f, 27.256f);
            path4.cubicTo(50.16f, 25.096f, 49.296f, 23.224f, 47.712f, 21.784f);
            path4.cubicTo(45.84f, 20.056f, 43.32f, 19.264f, 40.152f, 19.264f);
            instancePath.close();
            instancePath.moveTo(40.152f, 41.512f);
            Path path5 = instancePath;
            path5.cubicTo(36.408f, 41.512f, 33.528f, 42.376f, 31.656f, 44.248f);
            path5.cubicTo(29.712f, 45.976f, 28.776f, 48.208f, 28.776f, 51.088f);
            path5.cubicTo(28.776f, 53.752f, 29.712f, 55.912f, 31.728f, 57.568f);
            path5.cubicTo(33.672f, 59.224f, 36.48f, 60.088f, 40.152f, 60.088f);
            path5.cubicTo(43.752f, 60.088f, 46.632f, 59.224f, 48.72f, 57.568f);
            path5.cubicTo(50.592f, 55.912f, 51.528f, 53.752f, 51.528f, 51.088f);
            path5.cubicTo(51.528f, 48.208f, 50.592f, 45.976f, 48.72f, 44.32f);
            path5.cubicTo(46.704f, 42.448f, 43.896f, 41.512f, 40.152f, 41.512f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
