package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.userguide_grounpmessage_icon */
public class userguide_grounpmessage_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        instancePaint3.setColor(-12799249);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 13.0f, 0.0f, 1.0f, 14.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(3.0f, 1.0f);
        Path path = instancePath;
        path.cubicTo(3.8530622f, -0.056897663f, 5.4824085f, 0.1032807f, 7.0f, 0.0f);
        path.cubicTo(25.664316f, 0.07324726f, 44.346825f, 0.02319152f, 63.0f, 0.0f);
        path.cubicTo(65.93816f, -0.3372098f, 69.04692f, 1.8352093f, 69.0f, 5.0f);
        path.cubicTo(69.056915f, 20.69621f, 68.96695f, 36.45376f, 69.0f, 52.0f);
        path.cubicTo(69.176865f, 54.744125f, 67.5875f, 57.517212f, 65.0f, 58.0f);
        path.cubicTo(58.361202f, 58.548363f, 51.673885f, 57.547245f, 45.0f, 58.0f);
        path.cubicTo(40.26846f, 60.520557f, 38.759064f, 66.88765f, 34.0f, 69.0f);
        path.cubicTo(30.46239f, 66.0367f, 28.483185f, 61.33146f, 25.0f, 59.0f);
        path.cubicTo(17.807467f, 57.327003f, 10.830264f, 58.658485f, 4.0f, 58.0f);
        path.cubicTo(1.3940482f, 57.497192f, -0.1753225f, 54.714092f, 0.0f, 52.0f);
        path.cubicTo(0.0046053417f, 36.784126f, 0.014601333f, 21.37697f, 0.0f, 6.0f);
        path.cubicTo(-0.11534656f, 3.9375503f, 0.6143608f, 1.7250867f, 3.0f, 1.0f);
        instancePath.lineTo(3.0f, 1.0f);
        instancePath.close();
        instancePath.moveTo(32.0f, 12.0f);
        path.cubicTo(26.251995f, 13.571525f, 25.514194f, 21.794676f, 28.0f, 26.0f);
        path.cubicTo(29.081913f, 28.353016f, 31.679375f, 30.572763f, 30.0f, 33.0f);
        path.cubicTo(26.373276f, 36.011143f, 21.077284f, 37.070564f, 18.0f, 41.0f);
        path.cubicTo(16.761658f, 42.26679f, 16.46856f, 45.667038f, 19.0f, 46.0f);
        path.cubicTo(28.263258f, 46.14126f, 37.692955f, 45.85874f, 47.0f, 46.0f);
        path.cubicTo(48.719532f, 45.788116f, 51.084538f, 46.534756f, 52.0f, 45.0f);
        path.cubicTo(52.15586f, 42.882267f, 52.03458f, 40.743237f, 50.0f, 40.0f);
        path.cubicTo(46.779015f, 36.55599f, 41.422382f, 35.70845f, 38.0f, 32.0f);
        path.cubicTo(38.47118f, 28.524542f, 41.78623f, 26.15345f, 42.0f, 23.0f);
        path.cubicTo(42.301678f, 20.190405f, 42.382534f, 17.244196f, 41.0f, 15.0f);
        path.cubicTo(38.936096f, 12.461651f, 35.41891f, 11.4829445f, 32.0f, 12.0f);
        instancePath.lineTo(32.0f, 12.0f);
        instancePath.close();
        instancePath.moveTo(12.0f, 18.0f);
        path.cubicTo(11.041728f, 22.185745f, 13.108466f, 25.968393f, 15.0f, 29.0f);
        path.cubicTo(12.269493f, 33.078186f, 3.2147257f, 33.45447f, 5.0f, 40.0f);
        path.cubicTo(8.52481f, 40.287003f, 11.839776f, 39.861206f, 15.0f, 40.0f);
        path.cubicTo(18.234386f, 36.97966f, 22.245085f, 35.256676f, 26.0f, 33.0f);
        path.cubicTo(24.076502f, 31.850311f, 19.01197f, 30.681849f, 21.0f, 28.0f);
        path.cubicTo(22.787348f, 24.591984f, 24.127659f, 20.73012f, 22.0f, 17.0f);
        path.cubicTo(20.13742f, 13.838175f, 13.73258f, 14.313481f, 12.0f, 18.0f);
        instancePath.lineTo(12.0f, 18.0f);
        instancePath.close();
        instancePath.moveTo(46.0f, 19.0f);
        path.cubicTo(44.853928f, 22.34409f, 47.18662f, 25.7016f, 49.0f, 29.0f);
        path.cubicTo(47.736687f, 31.267736f, 44.95579f, 31.970932f, 43.0f, 33.0f);
        path.cubicTo(46.738415f, 35.249207f, 50.73149f, 36.97253f, 54.0f, 40.0f);
        path.cubicTo(57.098003f, 39.834835f, 60.40859f, 40.320137f, 64.0f, 40.0f);
        path.cubicTo(64.19794f, 38.141224f, 64.28961f, 36.031635f, 63.0f, 35.0f);
        path.cubicTo(59.940014f, 32.882114f, 56.303463f, 31.842178f, 54.0f, 29.0f);
        path.cubicTo(55.987682f, 25.80064f, 58.116646f, 21.581469f, 56.0f, 18.0f);
        path.cubicTo(54.164314f, 13.727471f, 47.308857f, 14.272201f, 46.0f, 19.0f);
        instancePath.lineTo(46.0f, 19.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
