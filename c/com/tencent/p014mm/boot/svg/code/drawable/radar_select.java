package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.radar_select */
public class radar_select extends C24542c {
    private final int height = 74;
    private final int width = 74;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 74;
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
        instancePaint3.setColor(-16335356);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(34.948597f, 0.0f);
        instancePath.lineTo(38.70567f, 0.0f);
        Path path = instancePath;
        path.cubicTo(48.546585f, 0.5134044f, 58.08532f, 5.0333767f, 64.62243f, 12.412307f);
        path.cubicTo(70.253f, 18.613426f, 73.45608f, 26.797697f, 74.0f, 35.122902f);
        instancePath.lineTo(74.0f, 38.646267f);
        Path path2 = instancePath;
        path2.cubicTo(73.50645f, 56.816757f, 57.88387f, 72.943695f, 39.692783f, 73.869835f);
        path2.cubicTo(25.923563f, 75.08791f, 11.942819f, 67.658646f, 5.08339f, 55.70941f);
        path2.cubicTo(-2.0681434f, 43.90111f, -1.6148771f, 28.106375f, 6.070503f, 16.660477f);
        path2.cubicTo(12.37594f, 6.966193f, 23.425564f, 0.69460595f, 34.948597f, 0.0f);
        instancePath.lineTo(34.948597f, 0.0f);
        instancePath.close();
        instancePath.moveTo(55.60017f, 22.880356f);
        path2.cubicTo(48.029774f, 30.035088f, 40.68324f, 37.42798f, 33.16372f, 44.652172f);
        path2.cubicTo(29.073265f, 40.782066f, 25.227016f, 36.66388f, 21.004284f, 32.942627f);
        path2.cubicTo(18.725027f, 31.414433f, 16.232088f, 33.66703f, 15.285789f, 35.62193f);
        path2.cubicTo(14.817726f, 37.55698f, 16.496645f, 38.896633f, 17.7075f, 40.12713f);
        path2.cubicTo(22.215141f, 44.423935f, 26.590502f, 48.85967f, 31.108318f, 53.146553f);
        path2.cubicTo(32.41075f, 54.59536f, 34.761234f, 54.04958f, 35.82964f, 52.63054f);
        path2.cubicTo(43.81722f, 44.80102f, 51.825146f, 36.981426f, 59.853428f, 29.201527f);
        path2.cubicTo(60.952354f, 28.149652f, 62.33619f, 26.760384f, 61.65445f, 25.103186f);
        path2.cubicTo(60.7692f, 22.959743f, 57.665745f, 20.717068f, 55.60017f, 22.880356f);
        instancePath.lineTo(55.60017f, 22.880356f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 14.191781f, 0.0f, 1.0f, 21.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(41.408386f, 0.8803564f);
        Path path3 = instancePath2;
        path3.cubicTo(43.473965f, -1.2829324f, 46.57742f, 0.95974314f, 47.462666f, 3.1031854f);
        path3.cubicTo(48.14441f, 4.7603836f, 46.760574f, 6.1496515f, 45.661648f, 7.201526f);
        path3.cubicTo(37.633366f, 14.981427f, 29.625437f, 22.801022f, 21.637857f, 30.630539f);
        path3.cubicTo(20.569456f, 32.04958f, 18.21897f, 32.59536f, 16.916536f, 31.146553f);
        path3.cubicTo(12.398722f, 26.859669f, 8.023359f, 22.423935f, 3.5157194f, 18.127127f);
        path3.cubicTo(2.3048635f, 16.896633f, 0.62594557f, 15.556981f, 1.0940075f, 13.621929f);
        path3.cubicTo(2.0403068f, 11.66703f, 4.5332456f, 9.414432f, 6.812504f, 10.942627f);
        path3.cubicTo(11.035236f, 14.66388f, 14.881485f, 18.782068f, 18.97194f, 22.652172f);
        path3.cubicTo(26.491457f, 15.427978f, 33.837994f, 8.035087f, 41.408386f, 0.8803564f);
        instancePath2.lineTo(41.408386f, 0.8803564f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
