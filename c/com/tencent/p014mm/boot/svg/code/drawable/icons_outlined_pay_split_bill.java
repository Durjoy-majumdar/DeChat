package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pay_split_bill */
public class icons_outlined_pay_split_bill extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 15.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(39.0f, 0.0f);
        instancePath.cubicTo(40.656853f, 0.0f, 42.0f, 1.3431457f, 42.0f, 3.0f);
        instancePath.lineTo(42.0f, 51.0f);
        instancePath.cubicTo(42.0f, 52.656853f, 40.656853f, 54.0f, 39.0f, 54.0f);
        instancePath.lineTo(3.0f, 54.0f);
        Path path = instancePath;
        path.cubicTo(1.3431457f, 54.0f, 0.0f, 52.656853f, 0.0f, 51.0f);
        instancePath.lineTo(0.0f, 3.0f);
        path.cubicTo(0.0f, 1.3431457f, 1.3431457f, 0.0f, 3.0f, 0.0f);
        instancePath.lineTo(39.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(38.4f, 3.6f);
        instancePath.lineTo(3.6f, 3.6f);
        instancePath.lineTo(3.6f, 50.4f);
        instancePath.lineTo(38.4f, 50.4f);
        instancePath.lineTo(38.399f, 29.511f);
        instancePath.lineTo(24.674976f, 44.051704f);
        instancePath.cubicTo(24.643566f, 44.084984f, 24.61142f, 44.117554f, 24.578566f, 44.14939f);
        instancePath.lineTo(24.4779f, 44.24269f);
        instancePath.cubicTo(23.20458f, 45.37111f, 21.257587f, 45.25365f, 20.129166f, 43.98033f);
        instancePath.lineTo(20.129166f, 43.98033f);
        instancePath.lineTo(12.0f, 34.80733f);
        instancePath.lineTo(13.727176f, 33.110573f);
        instancePath.lineTo(22.363054f, 40.08119f);
        instancePath.lineTo(38.399f, 25.682f);
        instancePath.lineTo(38.4f, 3.6f);
        instancePath.close();
        instancePath.moveTo(25.5f, 18.0f);
        instancePath.lineTo(25.5f, 21.6f);
        instancePath.lineTo(7.5f, 21.6f);
        instancePath.lineTo(7.5f, 18.0f);
        instancePath.lineTo(25.5f, 18.0f);
        instancePath.close();
        instancePath.moveTo(25.5f, 9.0f);
        instancePath.lineTo(25.5f, 12.6f);
        instancePath.lineTo(7.5f, 12.6f);
        instancePath.lineTo(7.5f, 9.0f);
        instancePath.lineTo(25.5f, 9.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
