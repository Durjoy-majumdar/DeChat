package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_ticket_icon_in_live */
public class finder_live_ticket_icon_in_live extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
        }
        if (i2 == 2) {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            canvas.saveLayerAlpha((RectF) null, 204, 31);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -153.0f, 0.0f, 1.0f, -710.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, -87.0f, 0.0f, 1.0f, 416.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 228.0f, 0.0f, 1.0f, 282.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray4);
            canvas.concat(instanceMatrix);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(32.0f, 0.0f);
            instancePath.lineTo(32.0f, 32.0f);
            instancePath.lineTo(0.0f, 32.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.save();
            float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 2.666667f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray5);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-1);
            instancePaint4.setStrokeWidth(1.3333334f);
            float[] matrixFloatArray6 = C24542c.setMatrixFloatArray(matrixFloatArray5, 1.0f, -2.4492937E-16f, 3.265725E-15f, 2.4492937E-16f, 1.0f, -1.7763568E-15f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray6);
            canvas.concat(instanceMatrix);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(18.89606f, 0.6667234f);
            instancePath2.lineTo(19.333334f, 25.555555f);
            instancePath2.lineTo(13.379977f, 26.0f);
            Path path = instancePath2;
            path.cubicTo(13.245877f, 25.31621f, 12.909445f, 24.704931f, 12.43559f, 24.231077f);
            path.cubicTo(11.812268f, 23.607756f, 10.951158f, 23.222221f, 10.0f, 23.222221f);
            path.cubicTo(9.086806f, 23.222221f, 8.256635f, 23.577621f, 7.64018f, 24.157583f);
            path.cubicTo(7.163266f, 24.606262f, 6.8144336f, 25.189415f, 6.653913f, 25.846394f);
            instancePath2.lineTo(6.653913f, 25.846394f);
            instancePath2.lineTo(1.1039397f, 25.999943f);
            instancePath2.lineTo(0.6666667f, 1.1111112f);
            instancePath2.lineTo(6.6200223f, 0.6666667f);
            path.cubicTo(6.7541227f, 1.3504575f, 7.090555f, 1.9617351f, 7.56441f, 2.43559f);
            path.cubicTo(8.187732f, 3.0589118f, 9.048843f, 3.4444444f, 10.0f, 3.4444444f);
            path.cubicTo(10.913195f, 3.4444444f, 11.743364f, 3.089045f, 12.35982f, 2.5090842f);
            path.cubicTo(12.836734f, 2.0604036f, 13.185567f, 1.477252f, 13.3460865f, 0.82027274f);
            instancePath2.lineTo(13.3460865f, 0.82027274f);
            instancePath2.lineTo(18.89606f, 0.6667234f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-1);
            float[] matrixFloatArray7 = C24542c.setMatrixFloatArray(matrixFloatArray6, 1.0f, 0.0f, 4.444444f, 0.0f, 1.0f, 9.777778f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray7);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray8 = C24542c.setMatrixFloatArray(matrixFloatArray7, 6.123234E-17f, 1.0f, -2.3841858E-7f, -1.0f, 6.123234E-17f, 7.1111116f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray8);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
            float[] matrixFloatArray9 = C24542c.setMatrixFloatArray(matrixFloatArray8, 1.0f, -2.4492937E-16f, 1.3607188E-15f, 2.4492937E-16f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray9);
            canvas.concat(instanceMatrix);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(0.0f, 1.2199446E-14f);
            instancePath3.lineTo(1.3333334f, 1.2199446E-14f);
            instancePath3.lineTo(1.3333334f, 11.111111f);
            instancePath3.lineTo(0.0f, 11.111111f);
            instancePath3.lineTo(0.0f, 1.2199446E-14f);
            instancePath3.close();
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
            float[] matrixFloatArray10 = C24542c.setMatrixFloatArray(matrixFloatArray9, 1.0f, -2.4492937E-16f, 1.3607188E-15f, 2.4492937E-16f, 1.0f, -1.7763568E-15f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray10);
            canvas.concat(instanceMatrix);
            Path instancePath4 = C24542c.instancePath(looper);
            instancePath4.moveTo(5.7777777f, 1.1845659E-14f);
            instancePath4.lineTo(7.111111f, 1.1845659E-14f);
            instancePath4.lineTo(7.111111f, 11.111111f);
            instancePath4.lineTo(5.7777777f, 11.111111f);
            instancePath4.lineTo(5.7777777f, 1.1845659E-14f);
            instancePath4.close();
            canvas.drawPath(instancePath4, instancePaint7);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
