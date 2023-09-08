package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.list_deletetext_icon */
public class list_deletetext_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        instancePaint3.setColor(1073741824);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.70710677f, 0.70710677f, -16.568542f, -0.70710677f, 0.70710677f, 40.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(37.0f, 37.0f);
        instancePath.lineTo(37.0f, 12.995752f);
        Path path = instancePath;
        path.cubicTo(37.0f, 12.450768f, 37.44359f, 12.0f, 37.99078f, 12.0f);
        instancePath.lineTo(42.00922f, 12.0f);
        path.cubicTo(42.549026f, 12.0f, 43.0f, 12.445813f, 43.0f, 12.995752f);
        instancePath.lineTo(43.0f, 37.0f);
        instancePath.lineTo(67.00425f, 37.0f);
        path.cubicTo(67.54923f, 37.0f, 68.0f, 37.44359f, 68.0f, 37.99078f);
        instancePath.lineTo(68.0f, 42.00922f);
        path.cubicTo(68.0f, 42.549026f, 67.554184f, 43.0f, 67.00425f, 43.0f);
        instancePath.lineTo(43.0f, 43.0f);
        instancePath.lineTo(43.0f, 67.00425f);
        path.cubicTo(43.0f, 67.54923f, 42.55641f, 68.0f, 42.00922f, 68.0f);
        instancePath.lineTo(37.99078f, 68.0f);
        path.cubicTo(37.450974f, 68.0f, 37.0f, 67.554184f, 37.0f, 67.00425f);
        instancePath.lineTo(37.0f, 43.0f);
        instancePath.lineTo(12.995752f, 43.0f);
        Path path2 = instancePath;
        path2.cubicTo(12.450768f, 43.0f, 12.0f, 42.55641f, 12.0f, 42.00922f);
        instancePath.lineTo(12.0f, 37.99078f);
        path2.cubicTo(12.0f, 37.450974f, 12.445813f, 37.0f, 12.995752f, 37.0f);
        instancePath.lineTo(37.0f, 37.0f);
        instancePath.lineTo(37.0f, 37.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
