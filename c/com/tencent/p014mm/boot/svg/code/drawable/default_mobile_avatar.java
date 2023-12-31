package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.default_mobile_avatar */
public class default_mobile_avatar extends C24542c {
    private final int height = 140;
    private final int width = 140;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 140;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1118482);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(140.0f, 0.0f);
        instancePath.lineTo(140.0f, 140.0f);
        instancePath.lineTo(0.0f, 140.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(57.01697f, 36.70791f);
        Path path = instancePath;
        path.cubicTo(52.47772f, 42.007774f, 52.327744f, 49.61193f, 53.287586f, 56.18417f);
        path.cubicTo(54.177437f, 62.365677f, 58.826675f, 66.90413f, 61.326267f, 72.38433f);
        path.cubicTo(62.965996f, 75.5903f, 60.956326f, 79.227066f, 58.146786f, 80.93024f);
        path.cubicTo(50.34807f, 85.88947f, 41.699486f, 89.496185f, 34.320694f, 95.106636f);
        path.cubicTo(29.991405f, 98.26251f, 30.801273f, 104.32379f, 31.761116f, 108.90232f);
        path.cubicTo(56.97698f, 109.04258f, 82.21284f, 109.01252f, 107.4287f, 108.93237f);
        path.cubicTo(111.00812f, 109.022545f, 109.668335f, 104.48409f, 109.95829f, 102.1798f);
        path.cubicTo(110.32823f, 98.77346f, 108.188576f, 95.89811f, 105.47903f, 94.13483f);
        path.cubicTo(98.66014f, 89.41604f, 91.11138f, 85.89949f, 84.00255f, 81.6616f);
        path.cubicTo(81.18301f, 79.998505f, 78.07352f, 76.83261f, 79.4333f, 73.25595f);
        path.cubicTo(81.55295f, 67.455154f, 86.57213f, 63.016888f, 87.64195f, 56.75523f);
        path.cubicTo(88.63179f, 50.182995f, 88.71178f, 42.598877f, 84.292496f, 37.168766f);
        path.cubicTo(77.66359f, 29.10375f, 63.935837f, 28.943453f, 57.01697f, 36.70791f);
        instancePath.lineTo(57.01697f, 36.70791f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-4934220);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 30.0f, 0.0f, 1.0f, 30.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(27.016973f, 6.7079077f);
        Path path2 = instancePath2;
        path2.cubicTo(33.935837f, -1.056548f, 47.663586f, -0.8962496f, 54.2925f, 7.1687655f);
        path2.cubicTo(58.711773f, 12.598875f, 58.631786f, 20.182995f, 57.64195f, 26.755232f);
        path2.cubicTo(56.572124f, 33.016888f, 51.552948f, 37.45515f, 49.433296f, 43.25595f);
        path2.cubicTo(48.073517f, 46.83261f, 51.18301f, 49.998505f, 54.002544f, 51.661602f);
        path2.cubicTo(61.11138f, 55.89949f, 68.66014f, 59.41604f, 75.47903f, 64.13483f);
        path2.cubicTo(78.188576f, 65.89811f, 80.328224f, 68.77346f, 79.95829f, 72.1798f);
        path2.cubicTo(79.668335f, 74.48409f, 81.00812f, 79.022545f, 77.4287f, 78.93237f);
        path2.cubicTo(52.21284f, 79.01252f, 26.976978f, 79.04258f, 1.7611154f, 78.90232f);
        path2.cubicTo(0.8012729f, 74.32379f, -0.008594216f, 68.26251f, 4.3206954f, 65.106636f);
        path2.cubicTo(11.699485f, 59.49619f, 20.348066f, 55.889473f, 28.146788f, 50.93024f);
        path2.cubicTo(30.956327f, 49.22707f, 32.965996f, 45.590298f, 31.326265f, 42.38433f);
        path2.cubicTo(28.826675f, 36.904125f, 24.177439f, 32.365677f, 23.287584f, 26.184168f);
        path2.cubicTo(22.327742f, 19.611933f, 22.477716f, 12.007775f, 27.016973f, 6.7079077f);
        instancePath2.lineTo(27.016973f, 6.7079077f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
