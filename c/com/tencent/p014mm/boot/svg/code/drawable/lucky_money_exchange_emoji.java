package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lucky_money_exchange_emoji */
public class lucky_money_exchange_emoji extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -136.0f, 0.0f, 1.0f, -533.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 104.0f, 0.0f, 1.0f, 501.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 32.0f, 0.0f, 1.0f, 32.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-526345);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 24.0f);
        Path path = instancePath;
        Matrix matrix = instanceMatrix;
        path.cubicTo(0.0f, 10.745165f, 10.745165f, 0.0f, 24.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        path.cubicTo(37.254837f, 0.0f, 48.0f, 10.745165f, 48.0f, 24.0f);
        instancePath.lineTo(48.0f, 24.0f);
        path.cubicTo(48.0f, 37.254837f, 37.254837f, 48.0f, 24.0f, 48.0f);
        instancePath.lineTo(24.0f, 48.0f);
        path.cubicTo(10.745165f, 48.0f, 0.0f, 37.254837f, 0.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-2511000);
        instancePaint6.setColor(-2511000);
        instancePaint6.setStrokeWidth(0.9f);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 11.428571f, 0.0f, 1.0f, 11.428571f, 0.0f, 0.0f, 1.0f);
        matrix.reset();
        Matrix matrix2 = matrix;
        matrix2.setValues(matrixFloatArray4);
        canvas.concat(matrix2);
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Paint instancePaint8 = C24542c.instancePaint(instancePaint6, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(11.428572f, 2.2857144f);
        instancePath2.cubicTo(15.973414f, 2.2857144f, 19.89864f, 4.938619f, 21.740171f, 8.780357f);
        instancePath2.lineTo(19.67799f, 9.76743f);
        Path path2 = instancePath2;
        path2.cubicTo(18.20482f, 6.693885f, 15.064559f, 4.571429f, 11.428572f, 4.571429f);
        path2.cubicTo(6.379111f, 4.571429f, 2.2857144f, 8.664825f, 2.2857144f, 13.714286f);
        path2.cubicTo(2.2857144f, 18.763746f, 6.379111f, 22.857143f, 11.428572f, 22.857143f);
        path2.cubicTo(14.671368f, 22.857143f, 17.519855f, 21.168907f, 19.143066f, 18.623404f);
        instancePath2.lineTo(21.07189f, 19.850368f);
        Path path3 = instancePath2;
        path3.cubicTo(19.04291f, 23.032423f, 15.4822f, 25.142857f, 11.428572f, 25.142857f);
        path3.cubicTo(5.116746f, 25.142857f, 0.0f, 20.026112f, 0.0f, 13.714286f);
        path3.cubicTo(0.0f, 7.40246f, 5.116746f, 2.2857144f, 11.428572f, 2.2857144f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint7);
        canvas.drawPath(instancePath2, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint5, looper);
        Paint instancePaint10 = C24542c.instancePaint(instancePaint6, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(21.881815f, 0.63178533f);
        instancePath3.cubicTo(21.990536f, 0.5230645f, 22.088455f, 0.56256765f, 22.088455f, 0.7320877f);
        instancePath3.lineTo(22.088455f, 0.7320877f);
        instancePath3.lineTo(22.088455f, 10.011749f);
        instancePath3.cubicTo(22.088455f, 10.178834f, 21.951033f, 10.318692f, 21.781511f, 10.318692f);
        instancePath3.lineTo(21.781511f, 10.318692f);
        instancePath3.lineTo(12.50185f, 10.318692f);
        instancePath3.cubicTo(12.334765f, 10.318692f, 12.287424f, 10.226176f, 12.401548f, 10.112052f);
        instancePath3.lineTo(12.401548f, 10.112052f);
        instancePath3.lineTo(14.46407f, 8.0490465f);
        instancePath3.lineTo(19.80274f, 8.049799f);
        instancePath3.lineTo(19.80207f, 2.710046f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint9);
        canvas.drawPath(instancePath3, instancePaint10);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
