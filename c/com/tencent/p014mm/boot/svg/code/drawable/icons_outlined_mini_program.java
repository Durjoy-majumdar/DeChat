package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_mini_program */
public class icons_outlined_mini_program extends C24542c {
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
            instancePath.moveTo(62.55f, 25.413738f);
            Path path = instancePath;
            path.cubicTo(62.55f, 18.25061f, 56.113007f, 12.45f, 48.148563f, 12.45f);
            path.cubicTo(40.184116f, 12.45f, 33.747124f, 18.25061f, 33.747124f, 25.413738f);
            instancePath.lineTo(33.747124f, 46.979233f);
            Path path2 = instancePath;
            path2.cubicTo(33.747124f, 51.74834f, 29.256884f, 55.58099f, 23.707668f, 55.58099f);
            path2.cubicTo(18.158451f, 55.58099f, 13.668211f, 51.74834f, 13.668211f, 46.979233f);
            path2.cubicTo(13.668211f, 43.16366f, 16.61802f, 39.82672f, 20.834455f, 38.808975f);
            path2.cubicTo(22.039108f, 38.507828f, 23.166615f, 37.616833f, 23.598444f, 36.611534f);
            path2.cubicTo(23.658064f, 36.493694f, 23.69515f, 36.384315f, 23.713804f, 36.27239f);
            path2.cubicTo(23.728848f, 36.182133f, 23.732689f, 36.109043f, 23.73211f, 35.908947f);
            path2.cubicTo(23.73211f, 34.97101f, 22.928375f, 34.303036f, 21.69489f, 34.303036f);
            instancePath.lineTo(21.187166f, 34.297966f);
            Path path3 = instancePath;
            path3.cubicTo(14.425144f, 35.321667f, 9.45f, 40.70184f, 9.45f, 46.979233f);
            path3.cubicTo(9.45f, 54.14236f, 15.886992f, 59.94297f, 23.851439f, 59.94297f);
            path3.cubicTo(31.815884f, 59.94297f, 38.252876f, 54.14236f, 38.252876f, 46.979233f);
            instancePath.lineTo(38.252876f, 25.413738f);
            Path path4 = instancePath;
            path4.cubicTo(38.252876f, 20.64463f, 42.743114f, 16.811981f, 48.29233f, 16.811981f);
            path4.cubicTo(53.84155f, 16.811981f, 58.33179f, 20.64463f, 58.33179f, 25.413738f);
            path4.cubicTo(58.33179f, 29.344591f, 55.412464f, 32.702663f, 51.154003f, 33.73049f);
            path4.cubicTo(49.91159f, 34.00651f, 48.8674f, 34.840534f, 48.411232f, 35.904827f);
            path4.cubicTo(47.841995f, 37.18553f, 48.673428f, 38.233707f, 50.3003f, 38.23373f);
            instancePath.lineTo(50.920006f, 38.227108f);
            instancePath.cubicTo(57.70792f, 37.031017f, 62.55f, 31.720058f, 62.55f, 25.413738f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
