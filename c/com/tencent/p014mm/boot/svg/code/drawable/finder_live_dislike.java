package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_dislike */
public class finder_live_dislike extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = 72;
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
                instancePaint3.setColor(-16777216);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(12.658556f, 17.32395f);
                instancePath.cubicTo(17.9993f, 11.983208f, 26.45697f, 11.463497f, 32.39344f, 16.025959f);
                instancePath.lineTo(32.96079f, 16.47753f);
                instancePath.cubicTo(33.04267f, 16.546074f, 33.11821f, 16.611471f, 33.187397f, 16.674042f);
                instancePath.lineTo(33.375893f, 16.853596f);
                instancePath.lineTo(30.813261f, 19.382017f);
                instancePath.lineTo(30.52293f, 19.13447f);
                instancePath.lineTo(30.199705f, 18.880346f);
                Path path = instancePath;
                path.cubicTo(25.692f, 15.415958f, 19.262644f, 15.811032f, 15.204141f, 19.869535f);
                path.cubicTo(11.1116495f, 23.962027f, 10.75865f, 30.441008f, 14.223859f, 34.888336f);
                instancePath.lineTo(14.6245985f, 35.373898f);
                instancePath.lineTo(15.041107f, 35.828537f);
                instancePath.lineTo(35.991f, 56.78155f);
                instancePath.lineTo(56.90587f, 35.865837f);
                instancePath.cubicTo(61.09029f, 31.55327f, 61.184597f, 24.76189f, 57.222095f, 20.33462f);
                instancePath.lineTo(56.78202f, 19.869535f);
                instancePath.cubicTo(52.6417f, 15.729217f, 46.079338f, 15.425817f, 41.612907f, 19.014229f);
                instancePath.lineTo(41.125492f, 19.42896f);
                instancePath.lineTo(40.638657f, 19.890686f);
                instancePath.lineTo(39.865818f, 20.65031f);
                instancePath.lineTo(37.26429f, 23.133064f);
                instancePath.lineTo(35.265f, 25.116552f);
                instancePath.lineTo(41.036255f, 31.688015f);
                instancePath.cubicTo(41.72483f, 32.4725f, 41.723717f, 33.625687f, 41.081173f, 34.406227f);
                instancePath.lineTo(40.843304f, 34.65159f);
                instancePath.lineTo(35.355f, 39.23455f);
                instancePath.lineTo(38.324383f, 46.980595f);
                instancePath.lineTo(34.9628f, 48.268913f);
                instancePath.lineTo(31.610716f, 39.522392f);
                instancePath.cubicTo(31.329624f, 38.788944f, 31.483654f, 37.970127f, 31.988134f, 37.391407f);
                instancePath.lineTo(32.225548f, 37.15903f);
                instancePath.lineTo(37.314f, 32.90755f);
                instancePath.lineTo(31.631512f, 26.430605f);
                instancePath.cubicTo(30.972692f, 25.680025f, 30.941782f, 24.584719f, 31.516209f, 23.80316f);
                instancePath.lineTo(31.730072f, 23.555164f);
                instancePath.lineTo(34.753128f, 20.55376f);
                instancePath.lineTo(37.360966f, 18.064774f);
                instancePath.lineTo(38.137444f, 17.301683f);
                instancePath.lineTo(38.68162f, 16.785994f);
                Path path2 = instancePath;
                path2.cubicTo(44.601494f, 11.45386f, 53.67758f, 11.673928f, 59.327602f, 17.32395f);
                path2.cubicTo(64.94703f, 22.943377f, 65.18365f, 31.92952f, 59.974842f, 37.846497f);
                instancePath.lineTo(59.470562f, 38.392025f);
                instancePath.lineTo(37.973045f, 59.877323f);
                instancePath.lineTo(37.620205f, 60.149483f);
                instancePath.cubicTo(36.662056f, 60.76835f, 35.43806f, 60.787308f, 34.39102f, 60.1489f);
                instancePath.lineTo(34.049168f, 59.91167f);
                instancePath.lineTo(33.790787f, 59.674217f);
                instancePath.lineTo(12.443951f, 38.32038f);
                instancePath.lineTo(11.9448805f, 37.77742f);
                instancePath.cubicTo(6.78132f, 31.86755f, 7.0739346f, 22.908573f, 12.658556f, 17.32395f);
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
