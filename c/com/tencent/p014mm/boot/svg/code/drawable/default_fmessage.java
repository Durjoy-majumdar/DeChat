package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_fmessage */
public class default_fmessage extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
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
        instancePaint3.setColor(-352965);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 12.0f);
        Path path = instancePath;
        path.cubicTo(0.0f, 5.3725824f, 5.3725824f, 0.0f, 12.0f, 0.0f);
        instancePath.lineTo(108.0f, 0.0f);
        path.cubicTo(114.62742f, 0.0f, 120.0f, 5.3725824f, 120.0f, 12.0f);
        instancePath.lineTo(120.0f, 108.0f);
        path.cubicTo(120.0f, 114.62742f, 114.62742f, 120.0f, 108.0f, 120.0f);
        instancePath.lineTo(12.0f, 120.0f);
        path.cubicTo(5.3725824f, 120.0f, 0.0f, 114.62742f, 0.0f, 108.0f);
        instancePath.lineTo(0.0f, 12.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(84.2129f, 73.166664f);
        instancePath2.lineTo(77.898056f, 73.166664f);
        instancePath2.lineTo(77.898056f, 76.333336f);
        instancePath2.lineTo(84.2129f, 76.333336f);
        instancePath2.lineTo(84.2129f, 82.666664f);
        instancePath2.lineTo(87.370316f, 82.666664f);
        instancePath2.lineTo(87.370316f, 76.333336f);
        instancePath2.lineTo(93.68516f, 76.333336f);
        instancePath2.lineTo(93.68516f, 73.166664f);
        instancePath2.lineTo(87.370316f, 73.166664f);
        instancePath2.lineTo(87.370316f, 66.833336f);
        instancePath2.lineTo(84.2129f, 66.833336f);
        instancePath2.lineTo(84.2129f, 73.166664f);
        instancePath2.close();
        instancePath2.moveTo(67.42371f, 70.079285f);
        Path path2 = instancePath2;
        path2.cubicTo(67.04714f, 71.57356f, 66.847084f, 73.13834f, 66.847084f, 74.75f);
        path2.cubicTo(66.847084f, 80.42489f, 69.32752f, 85.51856f, 73.26041f, 89.0f);
        instancePath2.lineTo(30.74431f, 89.0f);
        instancePath2.cubicTo(28.998022f, 89.0f, 27.783651f, 87.60048f, 28.032288f, 85.87163f);
        instancePath2.lineTo(28.33345f, 83.77754f);
        instancePath2.cubicTo(28.638906f, 81.65361f, 30.436558f, 79.121124f, 32.358017f, 78.116165f);
        instancePath2.lineTo(49.048275f, 69.38685f);
        instancePath2.cubicTo(51.59825f, 68.05316f, 52.127117f, 65.226555f, 50.227116f, 63.0707f);
        instancePath2.lineTo(48.833565f, 61.489502f);
        instancePath2.cubicTo(46.46028f, 58.796635f, 44.53635f, 53.717762f, 44.53635f, 50.146694f);
        instancePath2.lineTo(44.53635f, 44.955544f);
        Path path3 = instancePath2;
        path3.cubicTo(44.53635f, 37.800396f, 50.373653f, 32.0f, 57.57787f, 32.0f);
        path3.cubicTo(64.7805f, 32.0f, 70.61939f, 37.80192f, 70.61939f, 44.955544f);
        instancePath2.lineTo(70.61939f, 50.146694f);
        instancePath2.cubicTo(70.61939f, 53.71829f, 68.6945f, 58.798832f, 66.322174f, 61.491985f);
        instancePath2.lineTo(64.92863f, 63.073994f);
        instancePath2.cubicTo(63.029705f, 65.22971f, 63.56034f, 68.05949f, 66.10747f, 69.39114f);
        instancePath2.lineTo(67.42371f, 70.079285f);
        instancePath2.close();
        instancePath2.moveTo(71.58321f, 74.75129f);
        Path path4 = instancePath2;
        path4.cubicTo(71.58321f, 66.88027f, 77.944855f, 60.5f, 85.79161f, 60.5f);
        path4.cubicTo(93.63965f, 60.5f, 100.0f, 66.88027f, 100.0f, 74.75129f);
        path4.cubicTo(100.0f, 82.621025f, 93.63965f, 89.0f, 85.79161f, 89.0f);
        path4.cubicTo(78.66269f, 89.0f, 72.7596f, 83.734764f, 71.739204f, 76.86994f);
        path4.cubicTo(71.63645f, 76.178696f, 71.58321f, 75.47123f, 71.58321f, 74.75129f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
