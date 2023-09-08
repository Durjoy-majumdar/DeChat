package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_more2 */
public class icons_filled_more2 extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(36.0f, 66.0f);
            Path path = instancePath;
            path.cubicTo(19.431458f, 66.0f, 6.0f, 52.568542f, 6.0f, 36.0f);
            path.cubicTo(6.0f, 19.431458f, 19.431458f, 6.0f, 36.0f, 6.0f);
            path.cubicTo(52.568542f, 6.0f, 66.0f, 19.431458f, 66.0f, 36.0f);
            path.cubicTo(66.0f, 52.568542f, 52.568542f, 66.0f, 36.0f, 66.0f);
            instancePath.close();
            instancePath.moveTo(36.0f, 40.5f);
            path.cubicTo(38.485283f, 40.5f, 40.5f, 38.485283f, 40.5f, 36.0f);
            path.cubicTo(40.5f, 33.514717f, 38.485283f, 31.5f, 36.0f, 31.5f);
            path.cubicTo(33.514717f, 31.5f, 31.5f, 33.514717f, 31.5f, 36.0f);
            path.cubicTo(31.5f, 38.485283f, 33.514717f, 40.5f, 36.0f, 40.5f);
            instancePath.close();
            instancePath.moveTo(49.5f, 40.5f);
            Path path2 = instancePath;
            path2.cubicTo(51.985283f, 40.5f, 54.0f, 38.485283f, 54.0f, 36.0f);
            path2.cubicTo(54.0f, 33.514717f, 51.985283f, 31.5f, 49.5f, 31.5f);
            path2.cubicTo(47.014717f, 31.5f, 45.0f, 33.514717f, 45.0f, 36.0f);
            path2.cubicTo(45.0f, 38.485283f, 47.014717f, 40.5f, 49.5f, 40.5f);
            instancePath.close();
            instancePath.moveTo(22.5f, 40.5f);
            Path path3 = instancePath;
            path3.cubicTo(24.985281f, 40.5f, 27.0f, 38.485283f, 27.0f, 36.0f);
            path3.cubicTo(27.0f, 33.514717f, 24.985281f, 31.5f, 22.5f, 31.5f);
            path3.cubicTo(20.014719f, 31.5f, 18.0f, 33.514717f, 18.0f, 36.0f);
            path3.cubicTo(18.0f, 38.485283f, 20.014719f, 40.5f, 22.5f, 40.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
