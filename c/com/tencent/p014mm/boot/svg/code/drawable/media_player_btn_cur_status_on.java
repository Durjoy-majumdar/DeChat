package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.media_player_btn_cur_status_on */
public class media_player_btn_cur_status_on extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 32;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(32.0f, 0.0f);
        instancePath.lineTo(32.0f, 32.0f);
        instancePath.lineTo(0.0f, 32.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 1.0f);
        instancePath2.cubicTo(0.0f, 0.44771522f, 0.44771522f, 0.0f, 1.0f, 0.0f);
        instancePath2.lineTo(3.0f, 0.0f);
        instancePath2.cubicTo(3.5522847f, 0.0f, 4.0f, 0.44771522f, 4.0f, 1.0f);
        instancePath2.lineTo(4.0f, 13.0f);
        Path path = instancePath2;
        path.cubicTo(4.0f, 13.552285f, 3.5522847f, 14.0f, 3.0f, 14.0f);
        instancePath2.lineTo(1.0f, 14.0f);
        path.cubicTo(0.44771522f, 14.0f, 0.0f, 13.552285f, 0.0f, 13.0f);
        instancePath2.lineTo(0.0f, 1.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(8.0f, 1.0f);
        instancePath3.cubicTo(8.0f, 0.44771522f, 8.447715f, 0.0f, 9.0f, 0.0f);
        instancePath3.lineTo(11.0f, 0.0f);
        instancePath3.cubicTo(11.552285f, 0.0f, 12.0f, 0.44771522f, 12.0f, 1.0f);
        instancePath3.lineTo(12.0f, 13.0f);
        instancePath3.cubicTo(12.0f, 13.552285f, 11.552285f, 14.0f, 11.0f, 14.0f);
        instancePath3.lineTo(9.0f, 14.0f);
        instancePath3.cubicTo(8.447715f, 14.0f, 8.0f, 13.552285f, 8.0f, 13.0f);
        instancePath3.lineTo(8.0f, 1.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
