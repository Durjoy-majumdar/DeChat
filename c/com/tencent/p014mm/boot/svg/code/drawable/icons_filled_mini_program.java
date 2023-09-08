package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_mini_program */
public class icons_filled_mini_program extends C24542c {
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
            instancePath.moveTo(51.012886f, 38.97225f);
            instancePath.lineTo(50.30511f, 38.983707f);
            Path path = instancePath;
            path.cubicTo(48.16505f, 38.983707f, 46.91978f, 37.41382f, 47.724277f, 35.603878f);
            path.cubicTo(48.275196f, 34.3184f, 49.518124f, 33.325638f, 50.986015f, 32.999577f);
            path.cubicTo(54.913383f, 32.05159f, 57.58179f, 28.98215f, 57.58179f, 25.413738f);
            path.cubicTo(57.58179f, 21.087517f, 53.451355f, 17.561981f, 48.29233f, 17.561981f);
            path.cubicTo(43.13331f, 17.561981f, 39.002876f, 21.087517f, 39.002876f, 25.413738f);
            instancePath.lineTo(39.002876f, 46.979233f);
            Path path2 = instancePath;
            path2.cubicTo(39.002876f, 54.57499f, 32.21369f, 60.69297f, 23.851439f, 60.69297f);
            path2.cubicTo(15.489182f, 60.69297f, 8.7f, 54.57499f, 8.7f, 46.979233f);
            path2.cubicTo(8.7f, 40.318993f, 13.957028f, 34.633987f, 21.119808f, 33.553036f);
            instancePath.lineTo(21.69489f, 33.553036f);
            Path path3 = instancePath;
            path3.cubicTo(23.315079f, 33.553036f, 24.48211f, 34.522938f, 24.482107f, 35.908073f);
            path3.cubicTo(24.482798f, 36.145412f, 24.477034f, 36.25509f, 24.4536f, 36.395687f);
            path3.cubicTo(24.42201f, 36.58522f, 24.360502f, 36.766632f, 24.27572f, 36.93286f);
            path3.cubicTo(23.759354f, 38.137722f, 22.439314f, 39.18086f, 21.013983f, 39.537167f);
            path3.cubicTo(17.11499f, 40.478302f, 14.418211f, 43.529003f, 14.418211f, 46.979233f);
            path3.cubicTo(14.418211f, 51.305454f, 18.548643f, 54.83099f, 23.707668f, 54.83099f);
            path3.cubicTo(28.866692f, 54.83099f, 32.997124f, 51.305454f, 32.997124f, 46.979233f);
            instancePath.lineTo(32.997124f, 25.413738f);
            Path path4 = instancePath;
            path4.cubicTo(32.997124f, 17.817982f, 39.78631f, 11.7f, 48.148563f, 11.7f);
            path4.cubicTo(56.51082f, 11.7f, 63.3f, 17.817982f, 63.3f, 25.413738f);
            path4.cubicTo(63.3f, 32.109337f, 58.16663f, 37.728123f, 51.012886f, 38.97225f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
