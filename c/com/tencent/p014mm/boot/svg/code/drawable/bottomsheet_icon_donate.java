package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.bottomsheet_icon_donate */
public class bottomsheet_icon_donate extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-8617851);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(32.9052f, 39.8588f);
                instancePath.cubicTo(33.5872f, 40.15305f, 34.10695f, 39.579674f, 34.364075f, 39.163048f);
                instancePath.lineTo(35.824326f, 37.07992f);
                Path path = instancePath;
                path.cubicTo(36.377075f, 36.140797f, 36.22995f, 35.869923f, 35.824326f, 35.689796f);
                path.cubicTo(35.252327f, 35.435425f, 35.054325f, 35.578423f, 34.364075f, 36.384174f);
                instancePath.lineTo(32.9052f, 38.470047f);
                Path path2 = instancePath;
                path2.cubicTo(32.64945f, 38.88255f, 32.496826f, 39.681423f, 32.9052f, 39.8588f);
                instancePath.lineTo(32.9052f, 39.8588f);
                instancePath.close();
                instancePath.moveTo(46.6607f, 39.015923f);
                path2.cubicTo(48.523827f, 42.02305f, 46.255074f, 46.432674f, 42.10395f, 46.478046f);
                path2.cubicTo(37.88545f, 46.52205f, 30.714825f, 39.8588f, 30.714825f, 39.8588f);
                instancePath.lineTo(34.364075f, 32.910923f);
                Path path3 = instancePath;
                path3.cubicTo(34.364075f, 32.910923f, 44.772823f, 35.96755f, 46.6607f, 39.015923f);
                instancePath.lineTo(46.6607f, 39.015923f);
                instancePath.close();
                instancePath.moveTo(42.3927f, 19.708174f);
                path3.cubicTo(45.130325f, 24.813547f, 44.440075f, 29.763548f, 43.12145f, 34.30105f);
                path3.cubicTo(41.1882f, 33.16392f, 40.485577f, 32.631798f, 39.4722f, 32.21517f);
                path3.cubicTo(39.855824f, 30.103172f, 39.43645f, 29.568298f, 38.74345f, 26.656048f);
                path3.cubicTo(37.273575f, 20.468548f, 29.613451f, 16.426048f, 21.958826f, 17.623672f);
                path3.cubicTo(14.11445f, 18.851547f, 10.813075f, 27.984299f, 12.6707f, 35.219547f);
                path3.cubicTo(14.39495f, 41.929546f, 17.600075f, 45.61592f, 24.147825f, 48.196796f);
                path3.cubicTo(24.147825f, 48.196796f, 25.239574f, 50.98392f, 26.3382f, 53.060173f);
                path3.cubicTo(27.425825f, 55.11855f, 29.257326f, 57.22917f, 29.257326f, 57.22917f);
                path3.cubicTo(24.16295f, 56.82905f, 9.15895f, 50.127296f, 3.4307003f, 40.51605f);
                path3.cubicTo(-2.2947998f, 30.904799f, -1.2442998f, 18.309797f, 9.5535755f, 11.368798f);
                path3.cubicTo(20.42295f, 4.386548f, 36.872074f, 9.410798f, 42.3927f, 19.708174f);
                instancePath.lineTo(42.3927f, 19.708174f);
                instancePath.close();
                instancePath.moveTo(52.61995f, 11.374298f);
                path3.cubicTo(48.23095f, 14.465298f, 45.361324f, 18.084297f, 43.851574f, 21.794048f);
                path3.cubicTo(42.831326f, 17.757048f, 40.25045f, 14.191673f, 36.553074f, 12.065923f);
                path3.cubicTo(41.01495f, 4.9489226f, 46.541077f, 2.116423f, 53.3377f, 0.94904786f);
                path3.cubicTo(58.10345f, 1.7960478f, 64.21258f, 2.900173f, 67.93195f, 5.8124228f);
                path3.cubicTo(63.604824f, 5.919673f, 58.500824f, 7.235548f, 52.61995f, 11.374298f);
                instancePath.lineTo(52.61995f, 11.374298f);
                instancePath.close();
                instancePath.moveTo(76.68932f, 47.502422f);
                path3.cubicTo(63.8042f, 59.665672f, 57.090076f, 65.93705f, 50.418575f, 75.29668f);
                path3.cubicTo(49.258076f, 72.3143f, 46.9852f, 71.4453f, 46.0392f, 69.04455f);
                path3.cubicTo(45.0987f, 66.64517f, 46.329327f, 64.92642f, 46.0392f, 63.485424f);
                path3.cubicTo(45.75045f, 62.0458f, 44.3892f, 60.316048f, 43.120075f, 60.0108f);
                path3.cubicTo(53.559074f, 46.02155f, 73.63957f, 39.956425f, 75.96058f, 22.488422f);
                path3.cubicTo(78.080826f, 6.521923f, 65.39507f, 1.9184228f, 54.796574f, 0.25329787f);
                path3.cubicTo(68.315575f, -1.1657021f, 79.49158f, 3.3965478f, 84.71795f, 13.456048f);
                path3.cubicTo(89.19357f, 22.080048f, 89.458954f, 35.451923f, 76.68932f, 47.502422f);
                instancePath.lineTo(76.68932f, 47.502422f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
