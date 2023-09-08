package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.location_correct */
public class location_correct extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 32;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                instancePaint3.setColor(-436207616);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -92.0f, 0.0f, 1.0f, -710.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 427.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, -103.0f, 0.0f, 1.0f, 147.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray3);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 82.4f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray4);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 195.0f, 0.0f, 1.0f, 53.6f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray5);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(16.0f, 2.6666667f);
                Path path = instancePath;
                path.cubicTo(23.363796f, 2.6666667f, 29.333334f, 8.636204f, 29.333334f, 16.0f);
                path.cubicTo(29.333334f, 23.363796f, 23.363796f, 29.333334f, 16.0f, 29.333334f);
                path.cubicTo(8.636204f, 29.333334f, 2.6666667f, 23.363796f, 2.6666667f, 16.0f);
                path.cubicTo(2.6666667f, 8.636204f, 8.636204f, 2.6666667f, 16.0f, 2.6666667f);
                instancePath.close();
                instancePath.moveTo(16.0f, 4.266667f);
                Path path2 = instancePath;
                path2.cubicTo(9.519859f, 4.266667f, 4.266667f, 9.519859f, 4.266667f, 16.0f);
                path2.cubicTo(4.266667f, 22.48014f, 9.519859f, 27.733334f, 16.0f, 27.733334f);
                path2.cubicTo(22.48014f, 27.733334f, 27.733334f, 22.48014f, 27.733334f, 16.0f);
                path2.cubicTo(27.733334f, 9.519859f, 22.48014f, 4.266667f, 16.0f, 4.266667f);
                instancePath.close();
                instancePath.moveTo(16.0f, 20.53776f);
                Path path3 = instancePath;
                path3.cubicTo(16.634766f, 20.53776f, 17.113281f, 21.016275f, 17.113281f, 21.651041f);
                path3.cubicTo(17.113281f, 22.276041f, 16.634766f, 22.764322f, 16.0f, 22.764322f);
                path3.cubicTo(15.375f, 22.764322f, 14.886719f, 22.276041f, 14.886719f, 21.651041f);
                path3.cubicTo(14.886719f, 21.016275f, 15.375f, 20.53776f, 16.0f, 20.53776f);
                instancePath.close();
                instancePath.moveTo(16.878906f, 8.57487f);
                instancePath.lineTo(16.761719f, 17.988932f);
                instancePath.lineTo(15.238281f, 17.988932f);
                instancePath.lineTo(15.121094f, 8.57487f);
                instancePath.lineTo(16.878906f, 8.57487f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
