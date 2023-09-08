package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_video_play_btn_pause */
public class app_brand_video_play_btn_pause extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -114.0f, 0.0f, 1.0f, -60.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 114.0f, 0.0f, 1.0f, 60.0f, 0.0f, 0.0f, 1.0f);
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(5.0f, 3.3f);
        instancePath2.cubicTo(5.0f, 3.1343145f, 5.1343145f, 3.0f, 5.3f, 3.0f);
        instancePath2.lineTo(8.7f, 3.0f);
        instancePath2.cubicTo(8.865685f, 3.0f, 9.0f, 3.1343145f, 9.0f, 3.3f);
        instancePath2.lineTo(9.0f, 20.7f);
        instancePath2.cubicTo(9.0f, 20.865686f, 8.865685f, 21.0f, 8.7f, 21.0f);
        instancePath2.lineTo(5.3f, 21.0f);
        instancePath2.cubicTo(5.1343145f, 21.0f, 5.0f, 20.865686f, 5.0f, 20.7f);
        instancePath2.lineTo(5.0f, 3.3f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(15.0f, 3.3f);
        instancePath3.cubicTo(15.0f, 3.1343145f, 15.134315f, 3.0f, 15.3f, 3.0f);
        instancePath3.lineTo(18.7f, 3.0f);
        instancePath3.cubicTo(18.865686f, 3.0f, 19.0f, 3.1343145f, 19.0f, 3.3f);
        instancePath3.lineTo(19.0f, 20.7f);
        instancePath3.cubicTo(19.0f, 20.865686f, 18.865686f, 21.0f, 18.7f, 21.0f);
        instancePath3.lineTo(15.3f, 21.0f);
        instancePath3.cubicTo(15.134315f, 21.0f, 15.0f, 20.865686f, 15.0f, 20.7f);
        instancePath3.lineTo(15.0f, 3.3f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
