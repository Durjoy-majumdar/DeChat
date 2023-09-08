package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.success_icon */
public class success_icon extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 90.0f, 0.0f, 1.0f, 90.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-11286451);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(141.2704f, 0.26394463f);
        Path path = instancePath;
        path.cubicTo(172.25175f, -1.596309f, 203.76312f, 6.414783f, 229.95427f, 23.087057f);
        path.cubicTo(255.80539f, 39.299267f, 276.4263f, 63.632584f, 288.2668f, 91.746414f);
        path.cubicTo(300.64734f, 120.9704f, 303.29745f, 154.15492f, 295.89716f, 185.00912f);
        path.cubicTo(288.77682f, 214.99323f, 272.0561f, 242.57698f, 248.82509f, 262.82974f);
        path.cubicTo(228.12419f, 281.05222f, 202.29306f, 293.39392f, 175.07187f, 297.9045f);
        path.cubicTo(145.15056f, 302.97522f, 113.699196f, 298.80466f, 86.24799f, 285.81287f);
        path.cubicTo(55.996677f, 271.65094f, 30.745575f, 247.05759f, 15.854925f, 217.15352f);
        path.cubicTo(0.8442703f, 187.46947f, -3.6459255f, 152.71472f, 2.9743633f, 120.15029f);
        path.cubicTo(9.454646f, 87.74587f, 27.115416f, 57.74178f, 52.226513f, 36.268852f);
        path.cubicTo(76.867584f, 14.905941f, 108.698975f, 2.034186f, 141.2704f, 0.26394463f);
        instancePath.lineTo(141.2704f, 0.26394463f);
        instancePath.close();
        instancePath.moveTo(215.60826f, 93.22582f);
        path.cubicTo(185.5484f, 123.492424f, 155.53864f, 153.80917f, 125.4888f, 184.0858f);
        path.cubicTo(112.05204f, 170.58717f, 98.685425f, 157.00833f, 85.22863f, 143.52975f);
        path.cubicTo(82.7036f, 140.73175f, 77.964165f, 140.75182f, 75.429115f, 143.52975f);
        path.cubicTo(70.55942f, 148.38365f, 65.69974f, 153.24756f, 60.910202f, 158.18169f);
        path.cubicTo(58.33507f, 160.72897f, 58.375153f, 165.2519f, 60.9603f, 167.77914f);
        path.cubicTo(80.74971f, 187.80646f, 100.58922f, 207.77359f, 120.4187f, 227.77081f);
        path.cubicTo(122.963776f, 230.69919f, 127.88357f, 230.75935f, 130.46872f, 227.85103f);
        path.cubicTo(165.9594f, 192.11879f, 201.37993f, 156.31635f, 236.86058f, 120.5841f);
        path.cubicTo(239.075f, 118.25745f, 242.1912f, 115.96088f, 241.9908f, 112.3706f);
        path.cubicTo(242.06094f, 109.64279f, 240.06697f, 107.617f, 238.26338f, 105.86198f);
        path.cubicTo(233.83456f, 101.54964f, 229.62617f, 97.01666f, 225.14726f, 92.75447f);
        path.cubicTo(222.53204f, 90.17709f, 218.00304f, 90.5281f, 215.60826f, 93.22582f);
        instancePath.lineTo(215.60826f, 93.22582f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 58.0f, 0.0f, 1.0f, 90.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(157.60826f, 3.225819f);
        Path path2 = instancePath2;
        path2.cubicTo(160.00304f, 0.5280999f, 164.53204f, 0.17709555f, 167.14726f, 2.7544703f);
        path2.cubicTo(171.62617f, 7.0166664f, 175.83456f, 11.549637f, 180.26338f, 15.861977f);
        path2.cubicTo(182.06697f, 17.616999f, 184.06094f, 19.642794f, 183.9908f, 22.3706f);
        path2.cubicTo(184.1912f, 25.960873f, 181.075f, 28.257444f, 178.86058f, 30.584103f);
        path2.cubicTo(143.37993f, 66.316345f, 107.95939f, 102.11879f, 72.46872f, 137.85103f);
        path2.cubicTo(69.88357f, 140.75935f, 64.963776f, 140.69919f, 62.418705f, 137.77081f);
        path2.cubicTo(42.58922f, 117.77358f, 22.749708f, 97.80645f, 2.9603012f, 77.779144f);
        path2.cubicTo(0.37515315f, 75.251915f, 0.33507332f, 70.72897f, 2.9102013f, 68.18169f);
        path2.cubicTo(7.699739f, 63.247566f, 12.559417f, 58.383648f, 17.429113f, 53.52976f);
        path2.cubicTo(19.964163f, 50.75181f, 24.7036f, 50.731754f, 27.228628f, 53.52976f);
        path2.cubicTo(40.685425f, 67.00832f, 54.052044f, 80.58718f, 67.4888f, 94.08581f);
        path2.cubicTo(97.53864f, 63.809174f, 127.5484f, 33.492424f, 157.60826f, 3.225819f);
        instancePath2.lineTo(157.60826f, 3.225819f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
