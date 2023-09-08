package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.recv_or_pay_new_icon */
public class recv_or_pay_new_icon extends C24542c {
    private final int height = 39;
    private final int width = 81;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 81;
        }
        if (i2 == 1) {
            return 39;
        }
        if (i2 == 2) {
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
            instancePath.moveTo(0.0f, 19.353983f);
            instancePath.cubicTo(0.0f, 8.665072f, 8.665072f, 0.0f, 19.353983f, 0.0f);
            instancePath.lineTo(61.64602f, 0.0f);
            instancePath.cubicTo(72.33493f, 0.0f, 81.0f, 8.665072f, 81.0f, 19.353983f);
            instancePath.lineTo(81.0f, 19.646017f);
            instancePath.cubicTo(81.0f, 30.334927f, 72.33493f, 39.0f, 61.64602f, 39.0f);
            instancePath.lineTo(19.353983f, 39.0f);
            instancePath.cubicTo(8.665072f, 39.0f, 0.0f, 30.334927f, 0.0f, 19.646017f);
            instancePath.lineTo(0.0f, 19.353983f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-564640);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(31.066368f, 28.874792f);
            instancePath2.lineTo(27.080488f, 28.874792f);
            instancePath2.lineTo(19.06778f, 15.470228f);
            instancePath2.lineTo(18.985878f, 15.483878f);
            instancePath2.lineTo(18.985878f, 28.874792f);
            instancePath2.lineTo(15.0f, 28.874792f);
            instancePath2.lineTo(15.0f, 9.0f);
            instancePath2.lineTo(18.985878f, 9.0f);
            instancePath2.lineTo(26.998587f, 22.390915f);
            instancePath2.lineTo(27.080488f, 22.377264f);
            instancePath2.lineTo(27.080488f, 9.0f);
            instancePath2.lineTo(31.066368f, 9.0f);
            instancePath2.lineTo(31.066368f, 28.874792f);
            instancePath2.close();
            instancePath2.moveTo(39.966133f, 29.161448f);
            Path path = instancePath2;
            path.cubicTo(37.763878f, 29.161448f, 36.04396f, 28.485767f, 34.80633f, 27.134382f);
            path.cubicTo(33.5687f, 25.782999f, 32.949894f, 24.042608f, 32.949894f, 21.913155f);
            instancePath2.lineTo(32.949894f, 21.367144f);
            Path path2 = instancePath2;
            path2.cubicTo(32.949894f, 19.15579f, 33.5505f, 17.344872f, 34.75173f, 15.934337f);
            path2.cubicTo(35.95296f, 14.523802f, 37.604626f, 13.823095f, 39.70678f, 13.832195f);
            path2.cubicTo(41.690628f, 13.832195f, 43.212616f, 14.439627f, 44.272793f, 15.654507f);
            path2.cubicTo(45.33297f, 16.869387f, 45.86305f, 18.505127f, 45.86305f, 20.561779f);
            instancePath2.lineTo(45.86305f, 22.622969f);
            instancePath2.lineTo(37.058624f, 22.622969f);
            instancePath2.lineTo(37.017673f, 22.70487f);
            Path path3 = instancePath2;
            path3.cubicTo(37.081375f, 23.714996f, 37.388504f, 24.534004f, 37.939068f, 25.161919f);
            path3.cubicTo(38.48963f, 25.789835f, 39.306366f, 26.103788f, 40.38929f, 26.103788f);
            path3.cubicTo(41.281113f, 26.103788f, 42.038696f, 26.012787f, 42.66206f, 25.830782f);
            path3.cubicTo(43.285427f, 25.648779f, 43.929256f, 25.371225f, 44.593575f, 24.998116f);
            instancePath2.lineTo(45.671947f, 27.455164f);
            Path path4 = instancePath2;
            path4.cubicTo(45.080433f, 27.937477f, 44.279625f, 28.34243f, 43.269497f, 28.670038f);
            path4.cubicTo(42.259373f, 28.997646f, 41.158264f, 29.161448f, 39.966133f, 29.161448f);
            instancePath2.close();
            instancePath2.moveTo(39.70678f, 16.903505f);
            Path path5 = instancePath2;
            path5.cubicTo(38.90596f, 16.903505f, 38.28943f, 17.178783f, 37.857166f, 17.729347f);
            path5.cubicTo(37.424908f, 18.279911f, 37.163277f, 19.010193f, 37.072277f, 19.920216f);
            instancePath2.lineTo(37.099575f, 19.988466f);
            instancePath2.lineTo(41.959072f, 19.988466f);
            instancePath2.lineTo(41.959072f, 19.688162f);
            Path path6 = instancePath2;
            path6.cubicTo(41.959072f, 18.823639f, 41.78162f, 18.143408f, 41.426712f, 17.647446f);
            path6.cubicTo(41.071804f, 17.151484f, 40.498497f, 16.903505f, 39.70678f, 16.903505f);
            instancePath2.close();
            instancePath2.moveTo(60.168324f, 23.387384f);
            instancePath2.lineTo(60.250225f, 23.387384f);
            instancePath2.lineTo(62.03841f, 14.105201f);
            instancePath2.lineTo(65.915085f, 14.105201f);
            instancePath2.lineTo(62.161263f, 28.874792f);
            instancePath2.lineTo(58.830597f, 28.874792f);
            instancePath2.lineTo(56.08689f, 20.357025f);
            instancePath2.lineTo(56.00499f, 20.357025f);
            instancePath2.lineTo(53.261284f, 28.874792f);
            instancePath2.lineTo(49.94427f, 28.874792f);
            instancePath2.lineTo(46.190445f, 14.105201f);
            instancePath2.lineTo(50.067123f, 14.105201f);
            instancePath2.lineTo(51.882607f, 23.346434f);
            instancePath2.lineTo(51.96451f, 23.346434f);
            instancePath2.lineTo(54.721863f, 14.105201f);
            instancePath2.lineTo(57.383667f, 14.105201f);
            instancePath2.lineTo(60.168324f, 23.387384f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
