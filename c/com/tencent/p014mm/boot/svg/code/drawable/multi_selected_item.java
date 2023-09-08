package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.multi_selected_item */
public class multi_selected_item extends C24542c {
    private final int height = 14;
    private final int width = 18;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 18;
        }
        if (i2 == 1) {
            return 14;
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            canvas.save();
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -363.0f, 0.0f, 1.0f, -511.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 356.0f, 0.0f, 1.0f, 502.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(5.0f, 5.4166665f);
            instancePath.lineTo(5.0f, 4.1666665f);
            instancePath.cubicTo(5.0f, 3.7064295f, 5.373096f, 3.3333333f, 5.8333335f, 3.3333333f);
            instancePath.lineTo(17.5f, 3.3333333f);
            instancePath.cubicTo(17.960238f, 3.3333333f, 18.333334f, 3.7064295f, 18.333334f, 4.1666665f);
            instancePath.lineTo(18.333334f, 12.5f);
            instancePath.cubicTo(18.333334f, 12.9602375f, 17.960238f, 13.333333f, 17.5f, 13.333333f);
            instancePath.lineTo(16.25f, 13.333333f);
            instancePath.lineTo(16.25f, 6.6666665f);
            instancePath.cubicTo(16.25f, 5.9763107f, 15.690356f, 5.4166665f, 15.0f, 5.4166665f);
            instancePath.lineTo(5.0f, 5.4166665f);
            instancePath.close();
            instancePath.moveTo(2.5f, 6.6666665f);
            instancePath.lineTo(14.166667f, 6.6666665f);
            instancePath.cubicTo(14.626904f, 6.6666665f, 15.0f, 7.0397625f, 15.0f, 7.5f);
            instancePath.lineTo(15.0f, 15.833333f);
            instancePath.cubicTo(15.0f, 16.293571f, 14.626904f, 16.666666f, 14.166667f, 16.666666f);
            instancePath.lineTo(2.5f, 16.666666f);
            instancePath.cubicTo(2.0397627f, 16.666666f, 1.6666666f, 16.293571f, 1.6666666f, 15.833333f);
            instancePath.lineTo(1.6666666f, 7.5f);
            instancePath.cubicTo(1.6666666f, 7.0397625f, 2.0397627f, 6.6666665f, 2.5f, 6.6666665f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
