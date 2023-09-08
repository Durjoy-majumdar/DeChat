package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.webview_download_thumb_unknown */
public class webview_download_thumb_unknown extends C24542c {
    private final int height = 90;
    private final int width = 90;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 90;
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
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-7829368);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(90.0f, 0.0f);
        instancePath.lineTo(90.0f, 90.0f);
        instancePath.lineTo(0.0f, 90.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 25.0f, 0.0f, 1.0f, 17.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint5.setColor(-1);
        instancePaint5.setStrokeWidth(4.0f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(40.0f, 50.0f);
        instancePath2.cubicTo(40.0f, 51.162144f, 39.16621f, 52.0f, 38.0f, 52.0f);
        instancePath2.lineTo(2.0f, 52.0f);
        instancePath2.cubicTo(0.83545685f, 52.0f, 0.0f, 51.15074f, 0.0f, 50.0f);
        instancePath2.lineTo(0.0f, 2.0f);
        instancePath2.cubicTo(0.0f, 0.8378576f, 0.8337914f, 0.0f, 2.0f, 0.0f);
        instancePath2.lineTo(27.0f, 0.0f);
        instancePath2.lineTo(40.0f, 13.0f);
        instancePath2.lineTo(40.0f, 50.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(23.0f, 0.0f);
        instancePath3.lineTo(27.0f, 0.0f);
        instancePath3.lineTo(27.0f, 16.0f);
        instancePath3.lineTo(23.0f, 16.0f);
        instancePath3.lineTo(23.0f, 0.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-1);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(23.0f, 13.0f);
        instancePath4.lineTo(40.0f, 13.0f);
        instancePath4.lineTo(40.0f, 17.0f);
        instancePath4.lineTo(23.0f, 17.0f);
        instancePath4.lineTo(23.0f, 13.0f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
