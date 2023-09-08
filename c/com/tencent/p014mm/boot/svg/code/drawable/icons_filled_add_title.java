package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_add_title */
public class icons_filled_add_title extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 6.0f, 0.0f, 0.0f, 0.0f, 6.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.666667f, 2.0f);
        instancePath.lineTo(3.3333333f, 2.0f);
        instancePath.cubicTo(2.7810485f, 2.0f, 2.3333333f, 2.4477153f, 2.3333333f, 3.0f);
        instancePath.lineTo(2.3333333f, 5.0f);
        instancePath.cubicTo(2.3333333f, 5.5522847f, 2.7810485f, 6.0f, 3.3333333f, 6.0f);
        instancePath.lineTo(6.0f, 6.0f);
        instancePath.lineTo(6.0f, 6.0f);
        instancePath.lineTo(6.0f, 13.0f);
        instancePath.cubicTo(6.0f, 13.552284f, 6.4477153f, 14.0f, 7.0f, 14.0f);
        instancePath.lineTo(9.0f, 14.0f);
        instancePath.cubicTo(9.552285f, 14.0f, 10.0f, 13.552284f, 10.0f, 13.0f);
        instancePath.lineTo(10.0f, 6.0f);
        instancePath.lineTo(10.0f, 6.0f);
        instancePath.lineTo(12.666667f, 6.0f);
        instancePath.cubicTo(13.218951f, 6.0f, 13.666667f, 5.5522847f, 13.666667f, 5.0f);
        instancePath.lineTo(13.666667f, 3.0f);
        instancePath.cubicTo(13.666667f, 2.4477153f, 13.218951f, 2.0f, 12.666667f, 2.0f);
        instancePath.close();
        instancePath.moveTo(12.333333f, 3.3333333f);
        instancePath.lineTo(12.333333f, 4.6666665f);
        instancePath.lineTo(8.666667f, 4.6666665f);
        instancePath.lineTo(8.666667f, 12.666667f);
        instancePath.lineTo(7.3333335f, 12.666667f);
        instancePath.lineTo(7.3333335f, 4.6666665f);
        instancePath.lineTo(3.6666667f, 4.6666665f);
        instancePath.lineTo(3.6666667f, 3.3333333f);
        instancePath.lineTo(12.333333f, 3.3333333f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
