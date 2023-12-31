package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_msg_share_nearby_life_default */
public class app_msg_share_nearby_life_default extends C24542c {
    private final int height = 27;
    private final int width = 22;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 22;
        }
        if (i2 == 1) {
            return 27;
        }
        if (i2 != 2) {
            return 0;
        }
        Canvas canvas = objArr[0];
        Looper looper = objArr[1];
        Matrix instanceMatrix = C24542c.instanceMatrix(looper);
        float[] instanceMatrixArray = C24542c.instanceMatrixArray(looper);
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
        instancePaint3.setColor(-2565928);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(14.830475f, 11.264064f);
        instancePath.cubicTo(14.830475f, 13.443658f, 13.071956f, 15.210672f, 10.902841f, 15.210672f);
        Path path = instancePath;
        path.cubicTo(8.733725f, 15.210672f, 6.975206f, 13.443658f, 6.975206f, 11.264064f);
        path.cubicTo(6.975206f, 9.08447f, 8.733725f, 7.3174553f, 10.902841f, 7.3174553f);
        path.cubicTo(13.071956f, 7.3174553f, 14.830475f, 9.08447f, 14.830475f, 11.264064f);
        WeChatSVGRenderC2Java.setFillType(path, 2);
        canvas.drawPath(path, instancePaint3);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.134616f, 0.0f, 1.0f, 17.988773f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-2565928);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(4.431921f, 8.5750475f);
        instancePath2.lineTo(0.32109424f, 4.4439363f);
        instancePath2.cubicTo(0.135575f, 4.257308f, 0.135575f, 3.9548347f, 0.32109424f, 3.7684193f);
        instancePath2.lineTo(2.1475172f, 1.933173f);
        instancePath2.cubicTo(2.3332481f, 1.746545f, 2.6342673f, 1.7467575f, 2.8197865f, 1.933173f);
        instancePath2.lineTo(4.431921f, 3.5535207f);
        instancePath2.cubicTo(4.617652f, 3.7401488f, 4.918671f, 3.7401488f, 5.1041903f, 3.5537333f);
        instancePath2.lineTo(8.379652f, 0.2624483f);
        instancePath2.cubicTo(8.565171f, 0.07582029f, 8.86619f, 0.07582029f, 9.051921f, 0.2624483f);
        instancePath2.lineTo(10.878345f, 2.0976946f);
        Path path2 = instancePath2;
        path2.cubicTo(11.063864f, 2.28411f, 11.063864f, 2.5865836f, 10.878345f, 2.7732117f);
        instancePath2.lineTo(5.1041903f, 8.5750475f);
        path2.cubicTo(4.918671f, 8.761676f, 4.617652f, 8.761676f, 4.431921f, 8.5750475f);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.1337f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-2565928);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(4.5452213f, 20.379143f);
        instancePath3.lineTo(3.328029f, 19.156069f);
        Path path3 = instancePath3;
        path3.cubicTo(-1.0228943f, 14.784127f, -1.1692789f, 7.4824657f, 3.252721f, 3.182794f);
        path3.cubicTo(7.5522404f, -0.9978435f, 14.436548f, -0.9559691f, 18.684029f, 3.312031f);
        path3.cubicTo(22.858316f, 7.5062723f, 22.97128f, 14.260379f, 19.022913f, 18.592997f);
        path3.cubicTo(18.842049f, 18.79174f, 18.52749f, 18.791529f, 18.338163f, 18.601288f);
        instancePath3.lineTo(16.510895f, 16.76519f);
        Path path4 = instancePath3;
        path4.cubicTo(16.329393f, 16.582813f, 16.330875f, 16.294369f, 16.501163f, 16.101364f);
        path4.cubicTo(17.71201f, 14.728436f, 18.373491f, 12.980765f, 18.373491f, 11.130427f);
        path4.cubicTo(18.373491f, 8.834988f, 17.355356f, 6.697693f, 15.5335865f, 5.2376156f);
        path4.cubicTo(12.87751f, 3.1090357f, 9.003818f, 3.0884173f, 6.328702f, 5.192978f);
        path4.cubicTo(4.3658366f, 6.737229f, 3.3168173f, 9.059451f, 3.4426827f, 11.528128f);
        path4.cubicTo(3.540625f, 13.449036f, 4.4318366f, 15.243683f, 5.785471f, 16.603857f);
        instancePath3.lineTo(7.0439134f, 17.86838f);
        instancePath3.cubicTo(7.2294326f, 18.055006f, 7.2294326f, 18.357481f, 7.0439134f, 18.543896f);
        instancePath3.lineTo(5.21749f, 20.379143f);
        instancePath3.cubicTo(5.0317597f, 20.56577f, 4.730952f, 20.56577f, 4.5452213f, 20.379143f);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
