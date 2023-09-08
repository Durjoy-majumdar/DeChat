package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pay */
public class icons_outlined_pay extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(3.6000366f, 33.0f);
        instancePath.lineTo(3.6000366f, 44.40001f);
        instancePath.lineTo(15.0f, 44.40001f);
        instancePath.lineTo(15.0f, 48.0f);
        instancePath.lineTo(3.0f, 48.0f);
        Path path = instancePath;
        path.cubicTo(1.3431457f, 48.0f, -2.0290612E-16f, 46.656853f, 0.0f, 45.0f);
        instancePath.lineTo(0.0f, 45.0f);
        instancePath.lineTo(0.0f, 33.0f);
        instancePath.lineTo(3.6000366f, 33.0f);
        instancePath.close();
        instancePath.moveTo(60.0f, 33.0f);
        instancePath.lineTo(60.0f, 45.0f);
        path.cubicTo(60.0f, 46.656853f, 58.656853f, 48.0f, 57.0f, 48.0f);
        instancePath.lineTo(45.0f, 48.0f);
        instancePath.lineTo(45.0f, 44.40001f);
        instancePath.lineTo(56.399963f, 44.40001f);
        instancePath.lineTo(56.399963f, 33.0f);
        instancePath.lineTo(60.0f, 33.0f);
        instancePath.close();
        instancePath.moveTo(43.91026f, 14.25f);
        instancePath.lineTo(46.455845f, 16.795584f);
        instancePath.lineTo(28.606602f, 34.64483f);
        instancePath.cubicTo(27.43503f, 35.8164f, 25.535534f, 35.8164f, 24.363962f, 34.64483f);
        instancePath.lineTo(15.0f, 25.280865f);
        instancePath.lineTo(17.545584f, 22.735281f);
        instancePath.lineTo(26.485281f, 31.674978f);
        instancePath.lineTo(43.91026f, 14.25f);
        instancePath.close();
        instancePath.moveTo(15.0f, 0.0f);
        instancePath.lineTo(15.0f, 3.5999908f);
        instancePath.lineTo(3.6000366f, 3.5999908f);
        instancePath.lineTo(3.6000366f, 15.0f);
        instancePath.lineTo(0.0f, 15.0f);
        instancePath.lineTo(0.0f, 3.0f);
        instancePath.cubicTo(-2.0290612E-16f, 1.3431457f, 1.3431457f, 3.043592E-16f, 3.0f, 0.0f);
        instancePath.lineTo(15.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(57.0f, 0.0f);
        instancePath.cubicTo(58.656853f, 3.043592E-16f, 60.0f, 1.3431457f, 60.0f, 3.0f);
        instancePath.lineTo(60.0f, 3.0f);
        instancePath.lineTo(60.0f, 15.0f);
        instancePath.lineTo(56.399963f, 15.0f);
        instancePath.lineTo(56.399963f, 3.5999908f);
        instancePath.lineTo(45.0f, 3.5999908f);
        instancePath.lineTo(45.0f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
