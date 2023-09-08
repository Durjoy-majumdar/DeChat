package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_video_mute_btn_off */
public class app_brand_video_mute_btn_off extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -168.0f, 0.0f, 1.0f, -60.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 168.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-1);
        instancePaint4.setStrokeWidth(1.5f);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.75f, 5.266332f);
        instancePath2.lineTo(0.75f, 12.733709f);
        instancePath2.lineTo(5.1924944f, 12.733709f);
        instancePath2.lineTo(11.25f, 17.016748f);
        instancePath2.lineTo(11.25f, 0.9832927f);
        instancePath2.lineTo(5.1924944f, 5.266332f);
        instancePath2.lineTo(0.75f, 5.266332f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(21.336575f, 12.275914f);
        instancePath3.lineTo(23.49325f, 14.4325905f);
        instancePath3.cubicTo(23.571356f, 14.510695f, 23.571356f, 14.637328f, 23.49325f, 14.715433f);
        instancePath3.lineTo(22.715433f, 15.49325f);
        instancePath3.cubicTo(22.637327f, 15.571355f, 22.510695f, 15.571355f, 22.43259f, 15.49325f);
        instancePath3.lineTo(20.275915f, 13.336575f);
        instancePath3.lineTo(18.119238f, 15.49325f);
        instancePath3.cubicTo(18.041134f, 15.571355f, 17.914501f, 15.571355f, 17.836395f, 15.49325f);
        instancePath3.lineTo(17.058578f, 14.715433f);
        instancePath3.cubicTo(16.980474f, 14.637328f, 16.980474f, 14.510695f, 17.058578f, 14.4325905f);
        instancePath3.lineTo(19.215254f, 12.275914f);
        instancePath3.lineTo(17.058578f, 10.119239f);
        instancePath3.cubicTo(16.980474f, 10.041134f, 16.980474f, 9.914501f, 17.058578f, 9.836396f);
        instancePath3.lineTo(17.836395f, 9.0585785f);
        instancePath3.cubicTo(17.914501f, 8.9804735f, 18.041134f, 8.9804735f, 18.119238f, 9.0585785f);
        instancePath3.lineTo(20.275915f, 11.215254f);
        instancePath3.lineTo(22.43259f, 9.0585785f);
        Path path = instancePath3;
        path.cubicTo(22.510695f, 8.9804735f, 22.637327f, 8.9804735f, 22.715433f, 9.0585785f);
        instancePath3.lineTo(23.49325f, 9.836396f);
        path.cubicTo(23.571356f, 9.914501f, 23.571356f, 10.041134f, 23.49325f, 10.119239f);
        instancePath3.lineTo(21.336575f, 12.275914f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
