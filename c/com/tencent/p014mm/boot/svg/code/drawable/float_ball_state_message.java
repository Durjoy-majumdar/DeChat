package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.float_ball_state_message */
public class float_ball_state_message extends C24542c {
    private final int height = 33;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 32;
        }
        if (i2 == 1) {
            return 33;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -374.0f, 0.0f, 1.0f, -200.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 366.0f, 0.0f, 1.0f, 192.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 8.0f, 0.0f, 1.0f, 8.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16268960);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(24.836555f, 0.0f, 32.0f, 7.1634436f, 32.0f, 16.0f);
        path.cubicTo(32.0f, 24.836555f, 24.836555f, 32.0f, 16.0f, 32.0f);
        path.cubicTo(7.1634436f, 32.0f, 0.0f, 24.836555f, 0.0f, 16.0f);
        path.cubicTo(0.0f, 7.1634436f, 7.1634436f, 0.0f, 16.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(15.833333f, 1.6666666f);
        instancePath2.cubicTo(16.293571f, 1.6666666f, 16.666666f, 2.0397627f, 16.666666f, 2.5f);
        instancePath2.lineTo(16.666666f, 2.5f);
        instancePath2.lineTo(16.666666f, 17.5f);
        instancePath2.cubicTo(16.666666f, 17.960238f, 16.293571f, 18.333334f, 15.833333f, 18.333334f);
        instancePath2.lineTo(15.833333f, 18.333334f);
        instancePath2.lineTo(4.1666665f, 18.333334f);
        instancePath2.cubicTo(3.7064295f, 18.333334f, 3.3333333f, 17.960238f, 3.3333333f, 17.5f);
        instancePath2.lineTo(3.3333333f, 17.5f);
        instancePath2.lineTo(3.3333333f, 2.5f);
        instancePath2.cubicTo(3.3333333f, 2.0397627f, 3.7064295f, 1.6666666f, 4.1666665f, 1.6666666f);
        instancePath2.lineTo(4.1666665f, 1.6666666f);
        instancePath2.close();
        instancePath2.moveTo(9.166667f, 13.333333f);
        instancePath2.lineTo(5.8333335f, 13.333333f);
        instancePath2.lineTo(5.8333335f, 14.583333f);
        instancePath2.lineTo(9.166667f, 14.583333f);
        instancePath2.lineTo(9.166667f, 13.333333f);
        instancePath2.close();
        instancePath2.moveTo(9.166667f, 10.833333f);
        instancePath2.lineTo(5.8333335f, 10.833333f);
        instancePath2.lineTo(5.8333335f, 12.083333f);
        instancePath2.lineTo(9.166667f, 12.083333f);
        instancePath2.lineTo(9.166667f, 10.833333f);
        instancePath2.close();
        instancePath2.moveTo(12.083333f, 8.333333f);
        instancePath2.lineTo(5.8333335f, 8.333333f);
        instancePath2.lineTo(5.8333335f, 9.583333f);
        instancePath2.lineTo(12.083333f, 9.583333f);
        instancePath2.lineTo(12.083333f, 8.333333f);
        instancePath2.close();
        instancePath2.moveTo(7.0833335f, 4.1666665f);
        Path path2 = instancePath2;
        path2.cubicTo(6.392977f, 4.1666665f, 5.8333335f, 4.7263107f, 5.8333335f, 5.4166665f);
        path2.cubicTo(5.8333335f, 6.107023f, 6.392977f, 6.6666665f, 7.0833335f, 6.6666665f);
        path2.cubicTo(7.7736893f, 6.6666665f, 8.333333f, 6.107023f, 8.333333f, 5.4166665f);
        path2.cubicTo(8.333333f, 4.7263107f, 7.7736893f, 4.1666665f, 7.0833335f, 4.1666665f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
