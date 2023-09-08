package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.album_test_donotlook */
public class album_test_donotlook extends C24542c {
    private final int height = 47;
    private final int width = 47;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 47;
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
        instancePaint3.setColor(-11184811);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(8.18948f, 4.4879947f);
        Path path = instancePath;
        path.cubicTo(6.9855037f, 3.6185236f, 6.176108f, 1.2123127f, 8.401946f, 1.0f);
        path.cubicTo(11.35624f, 2.4962993f, 13.227967f, 5.438347f, 15.676389f, 7.5918045f);
        path.cubicTo(27.230513f, 4.1745806f, 41.273525f, 8.5118265f, 47.0f, 19.572308f);
        path.cubicTo(44.753925f, 23.6568f, 41.42529f, 26.972923f, 37.469368f, 29.399353f);
        path.cubicTo(39.300625f, 31.43149f, 41.910927f, 33.01878f, 42.96314f, 35.596863f);
        path.cubicTo(42.993492f, 37.770542f, 40.332603f, 37.06283f, 39.573795f, 35.859726f);
        path.cubicTo(29.122475f, 25.395742f, 18.650917f, 14.941869f, 8.18948f, 4.4879947f);
        instancePath.lineTo(8.18948f, 4.4879947f);
        instancePath.close();
        instancePath.moveTo(20.0f, 12.398834f);
        path.cubicTo(20.580166f, 12.969742f, 21.730663f, 14.111557f, 22.310827f, 14.682465f);
        path.cubicTo(25.722986f, 14.721838f, 28.28948f, 17.28108f, 28.318981f, 20.696682f);
        path.cubicTo(28.889313f, 21.277433f, 30.029976f, 22.429092f, 30.610142f, 23.0f);
        path.cubicTo(31.357473f, 19.978127f, 31.180473f, 16.444405f, 28.741814f, 14.20999f);
        path.cubicTo(26.499819f, 11.798397f, 22.999159f, 11.650748f, 20.0f, 12.398834f);
        instancePath.lineTo(20.0f, 12.398834f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(1.0f, 19.16008f);
        Path path2 = instancePath2;
        path2.cubicTo(3.10299f, 15.428926f, 6.10299f, 12.309762f, 9.730897f, 10.0f);
        path2.cubicTo(11.724253f, 11.974155f, 13.727574f, 13.938439f, 15.681063f, 15.942207f);
        path2.cubicTo(14.953488f, 18.982407f, 15.10299f, 22.506273f, 17.564785f, 24.75681f);
        path2.cubicTo(19.83721f, 27.18502f, 23.39535f, 27.313341f, 26.445183f, 26.602646f);
        path2.cubicTo(27.990034f, 28.073391f, 29.504984f, 29.58362f, 31.0f, 31.11359f);
        path2.cubicTo(19.797342f, 34.025467f, 6.4817276f, 29.692198f, 1.0f, 19.16008f);
        instancePath2.lineTo(1.0f, 19.16008f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(18.0f, 18.0f);
        Path path3 = instancePath3;
        path3.cubicTo(20.119404f, 19.870647f, 22.129353f, 21.870647f, 24.0f, 24.0f);
        path3.cubicTo(20.616915f, 23.910448f, 18.089552f, 21.383085f, 18.0f, 18.0f);
        instancePath3.lineTo(18.0f, 18.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
