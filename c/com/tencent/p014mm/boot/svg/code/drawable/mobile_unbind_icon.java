package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mobile_unbind_icon */
public class mobile_unbind_icon extends C24542c {
    private final int height = 480;
    private final int width = 480;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 480;
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
        instancePaint3.setColor(-10197916);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 129.0f, 0.0f, 1.0f, 40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(46.0f, 3.02f);
        Path path = instancePath;
        path.cubicTo(71.91f, 0.31f, 98.0f, -0.21f, 124.04f, 0.1f);
        path.cubicTo(144.69f, 0.44f, 165.37f, 1.38f, 185.86f, 4.14f);
        path.cubicTo(195.27f, 5.44f, 204.68f, 7.21f, 213.66f, 10.43f);
        path.cubicTo(216.28f, 11.49f, 218.85f, 13.33f, 219.91f, 16.05f);
        path.cubicTo(221.41f, 19.5f, 220.95f, 23.34f, 221.01f, 26.99f);
        path.cubicTo(220.99f, 88.64f, 221.0f, 150.28f, 221.0f, 211.92f);
        path.cubicTo(216.38f, 210.98f, 211.7f, 210.39f, 207.0f, 210.14f);
        instancePath.lineTo(207.0f, 39.0f);
        instancePath.lineTo(15.0f, 39.0f);
        instancePath.lineTo(15.0f, 349.0f);
        instancePath.lineTo(117.8f, 349.0f);
        Path path2 = instancePath;
        path2.cubicTo(129.92f, 372.38f, 152.18f, 390.21f, 177.67f, 396.86f);
        path2.cubicTo(154.52f, 399.26f, 131.24f, 400.06f, 107.98f, 399.99f);
        path2.cubicTo(85.99f, 399.85f, 63.96f, 399.12f, 42.11f, 396.51f);
        path2.cubicTo(30.89f, 394.98f, 19.42f, 393.55f, 8.92f, 389.1f);
        path2.cubicTo(4.08f, 387.2f, 0.57f, 382.32f, 0.99f, 377.03f);
        path2.cubicTo(1.01f, 258.68f, 0.99f, 140.34f, 1.01f, 21.99f);
        path2.cubicTo(0.73f, 17.3f, 3.14f, 12.48f, 7.65f, 10.71f);
        path2.cubicTo(19.99f, 6.32f, 33.03f, 4.46f, 46.0f, 3.02f);
        instancePath.lineTo(46.0f, 3.02f);
        instancePath.close();
        instancePath.moveTo(107.32f, 365.42f);
        path2.cubicTo(100.42f, 367.94f, 99.4f, 378.51f, 105.73f, 382.26f);
        path2.cubicTo(111.39f, 386.41f, 120.33f, 382.02f, 120.53f, 375.02f);
        path2.cubicTo(121.36f, 368.19f, 113.56f, 362.44f, 107.32f, 365.42f);
        instancePath.lineTo(107.32f, 365.42f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 129.0f, 0.0f, 1.0f, 40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-5395027);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 236.0f, 0.0f, 1.0f, 250.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(42.13f, 16.09f);
        Path path3 = instancePath2;
        path3.cubicTo(59.0f, 4.67f, 79.66f, -0.97f, 100.0f, 0.15f);
        path3.cubicTo(104.7f, 0.38f, 109.38f, 0.98f, 113.99f, 1.92f);
        path3.cubicTo(135.39f, 6.21f, 155.12f, 18.21f, 168.8f, 35.21f);
        path3.cubicTo(183.31f, 52.95f, 190.95f, 76.1f, 189.89f, 98.99f);
        path3.cubicTo(189.14f, 118.74f, 181.97f, 138.17f, 169.7f, 153.66f);
        path3.cubicTo(159.15f, 167.17f, 144.84f, 177.68f, 128.82f, 183.79f);
        path3.cubicTo(110.35f, 190.87f, 89.66f, 191.87f, 70.54f, 186.83f);
        path3.cubicTo(45.11f, 180.13f, 22.89f, 162.36f, 10.8f, 139.0f);
        path3.cubicTo(1.4210855E-14f, 118.54f, -2.81f, 94.06f, 2.92f, 71.65f);
        path3.cubicTo(8.52f, 49.13f, 22.83f, 28.96f, 42.13f, 16.09f);
        instancePath2.lineTo(42.13f, 16.09f);
        instancePath2.close();
        instancePath2.moveTo(76.72f, 53.78f);
        path3.cubicTo(71.11f, 58.09f, 68.02f, 65.1f, 67.98f, 72.11f);
        path3.cubicTo(72.07f, 72.16f, 76.17f, 72.12f, 80.27f, 72.15f);
        path3.cubicTo(80.6f, 67.4f, 82.89f, 62.53f, 87.44f, 60.51f);
        path3.cubicTo(93.41f, 57.81f, 101.47f, 57.8f, 106.39f, 62.62f);
        path3.cubicTo(111.52f, 68.46f, 111.33f, 77.86f, 107.13f, 84.17f);
        path3.cubicTo(102.24f, 91.13f, 94.9f, 96.06f, 90.53f, 103.44f);
        path3.cubicTo(87.63f, 108.31f, 87.16f, 114.11f, 87.01f, 119.66f);
        path3.cubicTo(91.14f, 119.68f, 95.28f, 119.68f, 99.41f, 119.66f);
        path3.cubicTo(99.68f, 114.01f, 100.47f, 107.8f, 104.75f, 103.66f);
        path3.cubicTo(110.08f, 98.31f, 115.86f, 93.14f, 119.35f, 86.33f);
        path3.cubicTo(123.82f, 78.2f, 123.76f, 67.82f, 119.41f, 59.66f);
        path3.cubicTo(116.01f, 53.23f, 109.1f, 49.37f, 102.07f, 48.31f);
        path3.cubicTo(93.38f, 46.99f, 83.79f, 48.21f, 76.72f, 53.78f);
        instancePath2.lineTo(76.72f, 53.78f);
        instancePath2.close();
        instancePath2.moveTo(90.38f, 134.5f);
        path3.cubicTo(84.53f, 136.88f, 85.46f, 147.17f, 91.98f, 147.86f);
        path3.cubicTo(96.85f, 149.28f, 102.23f, 145.17f, 101.18f, 139.97f);
        path3.cubicTo(100.85f, 134.8f, 94.68f, 132.56f, 90.38f, 134.5f);
        instancePath2.lineTo(90.38f, 134.5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 303.0f, 0.0f, 1.0f, 297.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint7, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(9.72f, 6.78f);
        Path path4 = instancePath3;
        path4.cubicTo(16.79f, 1.21f, 26.38f, -0.01f, 35.07f, 1.31f);
        path4.cubicTo(42.1f, 2.37f, 49.01f, 6.23f, 52.41f, 12.66f);
        path4.cubicTo(56.76f, 20.82f, 56.82f, 31.2f, 52.35f, 39.33f);
        path4.cubicTo(48.86f, 46.14f, 43.08f, 51.31f, 37.75f, 56.66f);
        path4.cubicTo(33.47f, 60.8f, 32.68f, 67.01f, 32.41f, 72.66f);
        path4.cubicTo(28.28f, 72.68f, 24.14f, 72.68f, 20.01f, 72.66f);
        path4.cubicTo(20.16f, 67.11f, 20.63f, 61.31f, 23.53f, 56.44f);
        path4.cubicTo(27.9f, 49.06f, 35.24f, 44.13f, 40.13f, 37.17f);
        path4.cubicTo(44.33f, 30.86f, 44.52f, 21.46f, 39.39f, 15.62f);
        path4.cubicTo(34.47f, 10.8f, 26.41f, 10.81f, 20.44f, 13.51f);
        path4.cubicTo(15.89f, 15.53f, 13.6f, 20.4f, 13.27f, 25.15f);
        path4.cubicTo(9.17f, 25.12f, 5.07f, 25.16f, 0.98f, 25.11f);
        path4.cubicTo(1.02f, 18.1f, 4.11f, 11.09f, 9.72f, 6.78f);
        instancePath3.lineTo(9.72f, 6.78f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(instancePaint7, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(23.38f, 87.5f);
        Path path5 = instancePath4;
        path5.cubicTo(27.68f, 85.56f, 33.85f, 87.8f, 34.18f, 92.97f);
        path5.cubicTo(35.23f, 98.17f, 29.85f, 102.28f, 24.98f, 100.86f);
        path5.cubicTo(18.46f, 100.17f, 17.53f, 89.88f, 23.38f, 87.5f);
        instancePath4.lineTo(23.38f, 87.5f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint9);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}