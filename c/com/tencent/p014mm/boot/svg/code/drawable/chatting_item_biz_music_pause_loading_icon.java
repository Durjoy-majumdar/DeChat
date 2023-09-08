package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_item_biz_music_pause_loading_icon */
public class chatting_item_biz_music_pause_loading_icon extends C24542c {
    private final int height = 115;
    private final int width = 115;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 115;
        }
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
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
            instancePaint3.setStrokeWidth(1.0f);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -513.0f, 0.0f, 1.0f, -1170.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 513.0f, 0.0f, 1.0f, 1170.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            instancePaint4.setColor(-5066062);
            instancePaint4.setStrokeWidth(6.0f);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(57.5f, 3.0f);
            Path path = instancePath;
            path.cubicTo(87.59952f, 3.0f, 112.0f, 27.40048f, 112.0f, 57.5f);
            path.cubicTo(112.0f, 87.59952f, 87.59952f, 112.0f, 57.5f, 112.0f);
            path.cubicTo(27.40048f, 112.0f, 3.0f, 87.59952f, 3.0f, 57.5f);
            path.cubicTo(3.0f, 27.40048f, 27.40048f, 3.0f, 57.5f, 3.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
            instancePaint5.setColor(-5066062);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(41.0f, 43.0f);
            Path path2 = instancePath2;
            path2.cubicTo(41.0f, 41.89543f, 41.89543f, 41.0f, 43.0f, 41.0f);
            instancePath2.lineTo(72.0f, 41.0f);
            path2.cubicTo(73.10457f, 41.0f, 74.0f, 41.89543f, 74.0f, 43.0f);
            instancePath2.lineTo(74.0f, 72.0f);
            path2.cubicTo(74.0f, 73.10457f, 73.10457f, 74.0f, 72.0f, 74.0f);
            instancePath2.lineTo(43.0f, 74.0f);
            path2.cubicTo(41.89543f, 74.0f, 41.0f, 73.10457f, 41.0f, 72.0f);
            instancePath2.lineTo(41.0f, 43.0f);
            instancePath2.close();
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
