package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_fans_level_1 */
public class finder_live_fans_level_1 extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(8.00256f, 12.0334f);
        instancePath.lineTo(4.71873f, 13.7384f);
        Path path = instancePath;
        instancePath.cubicTo(4.37514f, 13.9167f, 3.95018f, 13.7863f, 3.76955f, 13.447f);
        path.cubicTo(3.69762f, 13.3119f, 3.6728f, 13.1571f, 3.69893f, 13.0066f);
        Path path2 = path;
        path2.lineTo(4.32608f, 9.39547f);
        path2.lineTo(1.66941f, 6.83803f);
        Path path3 = path2;
        path2.cubicTo(1.39144f, 6.57044f, 1.38575f, 6.13099f, 1.6567f, 5.85648f);
        path3.cubicTo(1.7646f, 5.74717f, 1.90597f, 5.67603f, 2.05894f, 5.65408f);
        Path path4 = path3;
        path4.lineTo(5.73037f, 5.12721f);
        path4.lineTo(7.37229f, 1.84167f);
        path4.cubicTo(7.54408f, 1.49791f, 7.96553f, 1.35676f, 8.31362f, 1.52642f);
        path3.cubicTo(8.45223f, 1.59398f, 8.56442f, 1.70478f, 8.63283f, 1.84167f);
        Path path5 = path3;
        path5.lineTo(10.2748f, 5.12721f);
        path5.lineTo(13.9462f, 5.65408f);
        Path path6 = path5;
        path5.cubicTo(14.3303f, 5.7092f, 14.5965f, 6.06143f, 14.5407f, 6.44079f);
        path6.cubicTo(14.5184f, 6.59186f, 14.4464f, 6.73147f, 14.3357f, 6.83803f);
        Path path7 = path6;
        path7.lineTo(11.679f, 9.39547f);
        path7.lineTo(12.3062f, 13.0066f);
        Path path8 = path7;
        path7.cubicTo(12.3718f, 13.3845f, 12.1149f, 13.7433f, 11.7323f, 13.8081f);
        path8.cubicTo(11.5799f, 13.8339f, 11.4232f, 13.8094f, 11.2864f, 13.7384f);
        path8.lineTo(8.00256f, 12.0334f);
        path8.close();
        Paint instancePaint4 = C24542c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(Paint.Style.FILL);
        Paint instancePaint5 = C24542c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect((PathEffect) null);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        Path path9 = path8;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 8.00261f, 1.45459f, 8.00261f, 13.8182f, new int[]{-337567, -1067520}, new float[]{0.0f, 1.0f}, instanceMatrix, 0);
        WeChatSVGRenderC2Java.setFillType(path9, 2);
        canvas.drawPath(path9, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-15616);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(13.4506f, 3.53f);
        instancePath2.lineTo(12.5276f, 3.21479f);
        Path path10 = instancePath2;
        path10.cubicTo(12.4971f, 3.20441f, 12.4809f, 3.17134f, 12.4913f, 3.14093f);
        path10.cubicTo(12.4971f, 3.12388f, 12.5105f, 3.11049f, 12.5276f, 3.10467f);
        instancePath2.lineTo(13.4506f, 2.78946f);
        instancePath2.lineTo(13.7658f, 1.86642f);
        Path path11 = instancePath2;
        path11.cubicTo(13.7762f, 1.83601f, 13.8093f, 1.81978f, 13.8397f, 1.83016f);
        path11.cubicTo(13.8567f, 1.83599f, 13.8701f, 1.84937f, 13.8759f, 1.86642f);
        instancePath2.lineTo(14.1911f, 2.78946f);
        instancePath2.lineTo(15.1142f, 3.10467f);
        Path path12 = instancePath2;
        path12.cubicTo(15.1446f, 3.11506f, 15.1608f, 3.14812f, 15.1504f, 3.17853f);
        path12.cubicTo(15.1446f, 3.19558f, 15.1312f, 3.20897f, 15.1142f, 3.21479f);
        instancePath2.lineTo(14.1911f, 3.53f);
        instancePath2.lineTo(13.8759f, 4.45304f);
        Path path13 = instancePath2;
        path13.cubicTo(13.8655f, 4.48345f, 13.8325f, 4.49968f, 13.8021f, 4.4893f);
        path13.cubicTo(13.785f, 4.48348f, 13.7716f, 4.47009f, 13.7658f, 4.45304f);
        instancePath2.lineTo(13.4506f, 3.53f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
