package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sos_logo_icon */
public class sos_logo_icon extends C24542c {
    private final int height = 30;
    private final int width = 30;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 30;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-372399);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -129.0f, 0.0f, 1.0f, -93.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, -271.0f, 0.0f, 1.0f, 88.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 395.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray3);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 5.0f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray4);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(14.014925f, 8.014925f);
                instancePath.lineTo(16.343283f, 3.1791046f);
                Path path = instancePath;
                path.cubicTo(16.61194f, 2.597015f, 16.61194f, 2.0149255f, 16.38806f, 1.4776119f);
                path.cubicTo(16.164179f, 0.9402985f, 15.716418f, 0.53731346f, 15.089552f, 0.31343284f);
                instancePath.lineTo(14.597014f, 0.13432837f);
                Path path2 = instancePath;
                path2.cubicTo(14.373135f, 0.04477612f, 14.149254f, 0.0f, 13.925373f, 0.0f);
                path2.cubicTo(12.940298f, 0.0f, 12.134329f, 0.67164177f, 11.910448f, 1.6567165f);
                instancePath.lineTo(10.880597f, 6.8955226f);
                Path path3 = instancePath;
                path3.cubicTo(10.61194f, 8.149254f, 11.014925f, 9.313433f, 11.731343f, 9.582089f);
                path3.cubicTo(11.820895f, 9.626865f, 11.910448f, 9.626865f, 12.044776f, 9.626865f);
                path3.cubicTo(12.716418f, 9.671641f, 13.522388f, 9.0f, 14.014925f, 8.014925f);
                instancePath.close();
                instancePath.moveTo(8.5074625f, 11.417911f);
                instancePath.cubicTo(8.597015f, 10.656716f, 7.6567163f, 9.850746f, 6.402985f, 9.582089f);
                instancePath.lineTo(2.5522387f, 8.641791f);
                Path path4 = instancePath;
                path4.cubicTo(2.3731344f, 8.597015f, 2.1940298f, 8.597015f, 2.0149255f, 8.597015f);
                path4.cubicTo(0.98507464f, 8.597015f, 0.13432837f, 9.358209f, 0.04477612f, 10.38806f);
                instancePath.lineTo(0.0f, 10.925373f);
                Path path5 = instancePath;
                path5.cubicTo(0.0f, 11.552238f, 0.2238806f, 12.134329f, 0.6268657f, 12.537313f);
                path5.cubicTo(0.98507464f, 12.895522f, 1.4776119f, 13.074627f, 2.0149255f, 13.074627f);
                path5.cubicTo(2.0597014f, 13.074627f, 2.1044776f, 13.074627f, 2.1492538f, 13.074627f);
                instancePath.lineTo(6.0895524f, 12.895522f);
                instancePath.cubicTo(7.3880596f, 12.761194f, 8.417911f, 12.134329f, 8.5074625f, 11.417911f);
                instancePath.close();
                instancePath.moveTo(9.402985f, 15.313433f);
                instancePath.cubicTo(8.641791f, 15.089552f, 7.6119404f, 15.80597f, 7.119403f, 16.97015f);
                instancePath.lineTo(3.358209f, 25.208956f);
                Path path6 = instancePath;
                path6.cubicTo(3.0895522f, 25.791044f, 3.0895522f, 26.373135f, 3.358209f, 26.910448f);
                path6.cubicTo(3.6268656f, 27.447762f, 4.074627f, 27.850746f, 4.7014923f, 28.02985f);
                instancePath.lineTo(5.19403f, 28.208956f);
                instancePath.lineTo(5.238806f, 28.208956f);
                Path path7 = instancePath;
                path7.cubicTo(5.328358f, 28.208956f, 5.4179106f, 28.208956f, 5.5074625f, 28.208956f);
                path7.cubicTo(6.5820894f, 28.208956f, 7.7910447f, 27.716417f, 8.059702f, 26.686567f);
                instancePath.lineTo(10.253732f, 17.910448f);
                Path path8 = instancePath;
                path8.cubicTo(10.477612f, 16.701492f, 10.164179f, 15.537313f, 9.402985f, 15.313433f);
                instancePath.close();
                instancePath.moveTo(15.985075f, 16.298508f);
                path8.cubicTo(15.402986f, 15.671641f, 14.641791f, 15.268657f, 14.014925f, 15.268657f);
                path8.cubicTo(13.746268f, 15.268657f, 13.522388f, 15.358209f, 13.343284f, 15.4925375f);
                path8.cubicTo(12.761194f, 15.985075f, 12.850746f, 17.19403f, 13.61194f, 18.268656f);
                instancePath.lineTo(20.731344f, 28.656717f);
                Path path9 = instancePath;
                path9.cubicTo(21.134329f, 29.283583f, 21.80597f, 29.597015f, 22.477612f, 29.597015f);
                path9.cubicTo(22.97015f, 29.597015f, 23.462687f, 29.41791f, 23.865671f, 29.104477f);
                instancePath.lineTo(24.268656f, 28.791044f);
                Path path10 = instancePath;
                path10.cubicTo(24.761194f, 28.38806f, 25.02985f, 27.850746f, 25.074627f, 27.22388f);
                path10.cubicTo(25.119404f, 26.597015f, 24.895523f, 26.014925f, 24.492537f, 25.567163f);
                instancePath.lineTo(15.985075f, 16.298508f);
                instancePath.close();
                instancePath.moveTo(29.955223f, 11.059702f);
                path10.cubicTo(29.865671f, 9.761194f, 28.791044f, 8.820895f, 27.492537f, 9.0f);
                instancePath.lineTo(16.925373f, 10.567164f);
                Path path11 = instancePath;
                path11.cubicTo(15.671641f, 10.746268f, 14.686567f, 11.5074625f, 14.731343f, 12.313433f);
                path11.cubicTo(14.776119f, 13.119403f, 15.80597f, 13.746268f, 17.104477f, 13.746268f);
                instancePath.lineTo(27.537313f, 13.880597f);
                instancePath.lineTo(27.58209f, 13.880597f);
                Path path12 = instancePath;
                path12.cubicTo(28.25373f, 13.880597f, 28.925373f, 13.567164f, 29.41791f, 13.074627f);
                path12.cubicTo(29.820896f, 12.626865f, 30.0f, 12.089552f, 30.0f, 11.552238f);
                instancePath.lineTo(29.955223f, 11.059702f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
