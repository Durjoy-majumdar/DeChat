package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.login_app_default_avatar */
public class login_app_default_avatar extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -180.0f, 0.0f, 1.0f, -98.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 180.0f, 0.0f, 1.0f, 98.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-3552823);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(120.0f, 0.0f);
        instancePath.lineTo(120.0f, 120.0f);
        instancePath.lineTo(0.0f, 120.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(84.01563f, 54.268833f);
        Path path = instancePath2;
        path.cubicTo(89.06397f, 49.220486f, 89.01945f, 40.99985f, 83.91914f, 35.89955f);
        path.cubicTo(78.81996f, 30.80037f, 70.595184f, 30.757744f, 65.549866f, 35.803066f);
        instancePath2.lineTo(53.803066f, 47.549866f);
        Path path2 = instancePath2;
        path2.cubicTo(48.75472f, 52.59821f, 48.799248f, 60.818844f, 53.89955f, 65.91914f);
        instancePath2.lineTo(56.50995f, 63.308746f);
        path2.cubicTo(52.866802f, 59.6656f, 52.805256f, 53.823605f, 56.441032f, 50.18783f);
        instancePath2.lineTo(68.18783f, 38.441032f);
        Path path3 = instancePath2;
        path3.cubicTo(71.82153f, 34.807327f, 77.66728f, 34.86849f, 81.30875f, 38.50995f);
        path3.cubicTo(84.9519f, 42.153095f, 85.01344f, 47.99509f, 81.37766f, 51.630867f);
        instancePath2.lineTo(75.504265f, 57.504265f);
        instancePath2.lineTo(78.142235f, 60.14223f);
        instancePath2.lineTo(84.01563f, 54.268833f);
        instancePath2.close();
        instancePath2.moveTo(35.803066f, 65.549866f);
        Path path4 = instancePath2;
        path4.cubicTo(30.75472f, 70.598206f, 30.799248f, 78.81885f, 35.89955f, 83.91914f);
        path4.cubicTo(40.99873f, 89.018326f, 49.22351f, 89.06095f, 54.268833f, 84.01563f);
        instancePath2.lineTo(66.01563f, 72.26883f);
        Path path5 = instancePath2;
        path5.cubicTo(71.06397f, 67.22049f, 71.01945f, 58.99985f, 65.91914f, 53.89955f);
        instancePath2.lineTo(63.308746f, 56.50995f);
        path5.cubicTo(66.9519f, 60.153095f, 67.01344f, 65.99509f, 63.377663f, 69.63087f);
        instancePath2.lineTo(51.630867f, 81.37766f);
        Path path6 = instancePath2;
        path6.cubicTo(47.997158f, 85.01137f, 42.151413f, 84.95021f, 38.50995f, 81.30875f);
        path6.cubicTo(34.866802f, 77.665596f, 34.805256f, 71.82361f, 38.441032f, 68.18783f);
        instancePath2.lineTo(44.31443f, 62.31443f);
        instancePath2.lineTo(41.676464f, 59.676464f);
        instancePath2.lineTo(35.803066f, 65.549866f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
