package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.refresh */
public class C24265refresh extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-372399);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(46.091885f, 13.908117f);
        Path path = instancePath;
        path.cubicTo(50.97792f, 18.794155f, 54.0f, 25.544155f, 54.0f, 33.0f);
        path.cubicTo(54.0f, 47.91169f, 41.91169f, 60.0f, 27.0f, 60.0f);
        path.cubicTo(12.088312f, 60.0f, 0.0f, 47.91169f, 0.0f, 33.0f);
        path.cubicTo(0.0f, 18.088312f, 12.088312f, 6.0f, 27.0f, 6.0f);
        instancePath.lineTo(27.0f, 9.6f);
        Path path2 = instancePath;
        path2.cubicTo(14.076537f, 9.6f, 3.6f, 20.076536f, 3.6f, 33.0f);
        path2.cubicTo(3.6f, 45.923462f, 14.076537f, 56.4f, 27.0f, 56.4f);
        path2.cubicTo(39.923462f, 56.4f, 50.4f, 45.923462f, 50.4f, 33.0f);
        path2.cubicTo(50.4f, 26.706247f, 47.908665f, 20.816067f, 43.5463f, 16.453701f);
        instancePath.lineTo(46.091885f, 13.908117f);
        instancePath.close();
        instancePath.moveTo(25.730843f, 9.633832f);
        path2.cubicTo(13.397545f, 10.293022f, 3.6f, 20.502342f, 3.6f, 33.0f);
        path2.cubicTo(3.6f, 45.923462f, 14.076537f, 56.4f, 27.0f, 56.4f);
        path2.cubicTo(39.923462f, 56.4f, 50.4f, 45.923462f, 50.4f, 33.0f);
        path2.cubicTo(50.4f, 26.706247f, 47.908665f, 20.816067f, 43.5463f, 16.453701f);
        instancePath.lineTo(46.091885f, 13.908117f);
        path2.cubicTo(50.97792f, 18.794155f, 54.0f, 25.544155f, 54.0f, 33.0f);
        path2.cubicTo(54.0f, 47.91169f, 41.91169f, 60.0f, 27.0f, 60.0f);
        path2.cubicTo(12.088312f, 60.0f, 0.0f, 47.91169f, 0.0f, 33.0f);
        path2.cubicTo(0.0f, 18.928625f, 10.764283f, 7.3713818f, 24.507618f, 6.1135054f);
        instancePath.lineTo(20.939697f, 2.5455844f);
        instancePath.lineTo(23.485281f, 3.0375702E-13f);
        instancePath.lineTo(30.909903f, 7.424621f);
        instancePath.cubicTo(31.49569f, 8.010407f, 31.49569f, 8.9601555f, 30.909903f, 9.545941f);
        instancePath.lineTo(29.424978f, 11.030866f);
        instancePath.lineTo(23.485281f, 16.970562f);
        instancePath.lineTo(20.939697f, 14.424978f);
        instancePath.lineTo(25.730843f, 9.633832f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
