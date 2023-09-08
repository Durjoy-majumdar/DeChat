package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_gift */
public class icons_filled_gift extends C24542c {
    private final int height = 92;
    private final int width = 92;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 92;
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
        instancePaint3.setColor(-13421773);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -121.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 121.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(15.333333f, 50.6f);
        instancePath.lineTo(43.699333f, 50.599335f);
        instancePath.lineTo(43.7f, 80.5f);
        instancePath.lineTo(48.3f, 80.5f);
        instancePath.lineTo(48.29933f, 50.599335f);
        instancePath.lineTo(76.666664f, 50.6f);
        instancePath.lineTo(76.666664f, 76.5f);
        instancePath.cubicTo(76.666664f, 78.70914f, 74.87581f, 80.5f, 72.666664f, 80.5f);
        instancePath.lineTo(19.333334f, 80.5f);
        Path path = instancePath;
        path.cubicTo(17.124195f, 80.5f, 15.333333f, 78.70914f, 15.333333f, 76.5f);
        instancePath.lineTo(15.333333f, 50.6f);
        instancePath.close();
        instancePath.moveTo(55.583332f, 11.5f);
        path.cubicTo(60.87606f, 11.5f, 65.166664f, 15.790605f, 65.166664f, 21.083334f);
        path.cubicTo(65.166664f, 23.241062f, 64.45356f, 25.232237f, 63.25017f, 26.83404f);
        instancePath.lineTo(76.5f, 26.833334f);
        path.cubicTo(78.70914f, 26.833334f, 80.5f, 28.624195f, 80.5f, 30.833334f);
        instancePath.lineTo(80.5f, 42.0f);
        path.cubicTo(80.5f, 44.153297f, 78.79853f, 45.909195f, 76.6667f, 45.99659f);
        instancePath.lineTo(76.666664f, 46.0f);
        instancePath.lineTo(48.29933f, 45.999332f);
        instancePath.lineTo(48.3f, 26.833334f);
        instancePath.lineTo(43.7f, 26.833334f);
        instancePath.lineTo(43.699333f, 45.999332f);
        instancePath.lineTo(15.333333f, 46.0f);
        instancePath.lineTo(15.333f, 45.995335f);
        instancePath.lineTo(15.30036f, 45.995106f);
        instancePath.cubicTo(13.183969f, 45.89108f, 11.5f, 44.142197f, 11.5f, 42.0f);
        instancePath.lineTo(11.5f, 30.833334f);
        instancePath.cubicTo(11.5f, 28.624195f, 13.290861f, 26.833334f, 15.5f, 26.833334f);
        instancePath.lineTo(28.749828f, 26.83404f);
        Path path2 = instancePath;
        path2.cubicTo(27.546438f, 25.232237f, 26.833334f, 23.241062f, 26.833334f, 21.083334f);
        path2.cubicTo(26.833334f, 15.790605f, 31.123938f, 11.5f, 36.416668f, 11.5f);
        path2.cubicTo(41.570114f, 11.5f, 45.773483f, 15.567755f, 45.991146f, 20.667627f);
        instancePath.lineTo(46.0f, 21.06f);
        instancePath.lineTo(46.008854f, 20.667627f);
        path2.cubicTo(46.22263f, 15.658824f, 50.281036f, 11.645606f, 55.30818f, 11.503874f);
        instancePath.close();
        instancePath.moveTo(36.416668f, 16.1f);
        path2.cubicTo(33.664448f, 16.1f, 31.433332f, 18.331114f, 31.433332f, 21.083334f);
        path2.cubicTo(31.433332f, 23.835552f, 33.664448f, 26.066668f, 36.416668f, 26.066668f);
        instancePath.lineTo(41.400505f, 26.066668f);
        instancePath.lineTo(41.401043f, 21.181286f);
        instancePath.lineTo(41.39533f, 20.863777f);
        instancePath.cubicTo(41.28197f, 18.207777f, 39.087807f, 16.1f, 36.416668f, 16.1f);
        instancePath.close();
        instancePath.moveTo(55.583332f, 16.1f);
        instancePath.cubicTo(52.912193f, 16.1f, 50.71803f, 18.207777f, 50.60467f, 20.863777f);
        instancePath.lineTo(50.60467f, 20.863777f);
        instancePath.lineTo(50.598957f, 21.181286f);
        instancePath.lineTo(50.599495f, 26.066668f);
        instancePath.lineTo(55.583332f, 26.066668f);
        Path path3 = instancePath;
        path3.cubicTo(58.335552f, 26.066668f, 60.566666f, 23.835552f, 60.566666f, 21.083334f);
        path3.cubicTo(60.566666f, 18.331114f, 58.335552f, 16.1f, 55.583332f, 16.1f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
