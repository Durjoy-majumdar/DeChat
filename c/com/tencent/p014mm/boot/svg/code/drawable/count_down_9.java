package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.count_down_9 */
public class count_down_9 extends C24542c {
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
            instancePath.moveTo(39.144f, 13.0f);
            Path path = instancePath;
            path.cubicTo(45.408f, 13.0f, 50.232f, 15.232f, 53.544f, 19.768f);
            path.cubicTo(56.856f, 24.232f, 58.512f, 30.352f, 58.512f, 38.272f);
            path.cubicTo(58.512f, 46.624f, 56.712f, 53.464f, 53.256f, 58.648f);
            path.cubicTo(49.728f, 63.832f, 44.976f, 66.424f, 39.072f, 66.424f);
            path.cubicTo(28.92f, 66.424f, 23.232f, 61.744f, 22.008f, 52.384f);
            instancePath.lineTo(30.216f, 52.384f);
            Path path2 = instancePath;
            path2.cubicTo(31.224f, 57.136f, 34.176f, 59.512f, 39.144f, 59.512f);
            path2.cubicTo(42.528f, 59.512f, 45.264f, 57.784f, 47.352f, 54.472f);
            path2.cubicTo(49.296f, 51.304f, 50.304f, 47.344f, 50.304f, 42.592f);
            instancePath.lineTo(50.304f, 41.944f);
            instancePath.lineTo(49.944f, 41.944f);
            Path path3 = instancePath;
            path3.cubicTo(48.432f, 44.032f, 46.632f, 45.616f, 44.544f, 46.624f);
            path3.cubicTo(42.528f, 47.56f, 40.224f, 48.064f, 37.632f, 48.064f);
            path3.cubicTo(32.592f, 48.064f, 28.488f, 46.408f, 25.464f, 43.096f);
            path3.cubicTo(22.44f, 39.928f, 21.0f, 35.824f, 21.0f, 30.784f);
            path3.cubicTo(21.0f, 25.6f, 22.728f, 21.352f, 26.184f, 18.04f);
            path3.cubicTo(29.64f, 14.656f, 33.96f, 13.0f, 39.144f, 13.0f);
            instancePath.close();
            instancePath.moveTo(39.432f, 19.984f);
            Path path4 = instancePath;
            path4.cubicTo(36.408f, 19.984f, 33.96f, 20.992f, 32.088f, 23.008f);
            path4.cubicTo(30.216f, 25.024f, 29.352f, 27.616f, 29.352f, 30.784f);
            path4.cubicTo(29.352f, 33.952f, 30.216f, 36.472f, 32.088f, 38.344f);
            path4.cubicTo(33.816f, 40.216f, 36.264f, 41.224f, 39.432f, 41.224f);
            path4.cubicTo(42.528f, 41.224f, 44.976f, 40.216f, 46.776f, 38.344f);
            path4.cubicTo(48.504f, 36.4f, 49.44f, 33.808f, 49.44f, 30.496f);
            path4.cubicTo(49.44f, 27.184f, 48.504f, 24.664f, 46.632f, 22.792f);
            path4.cubicTo(44.76f, 20.92f, 42.312f, 19.984f, 39.432f, 19.984f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
