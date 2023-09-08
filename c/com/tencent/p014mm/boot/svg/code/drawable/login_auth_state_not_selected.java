package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.login_auth_state_not_selected */
public class login_auth_state_not_selected extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
        instancePaint3.setColor(-5592406);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -70.0f, 0.0f, 1.0f, -199.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 69.0f, 0.0f, 1.0f, 98.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 101.67347f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 6.3265305f);
        instancePath.cubicTo(0.0f, 2.9596574f, 2.6835413f, 0.3265306f, 6.0f, 0.3265306f);
        instancePath.lineTo(42.0f, 0.3265306f);
        instancePath.cubicTo(45.31085f, 0.3265306f, 48.0f, 2.9541647f, 48.0f, 6.3265305f);
        instancePath.lineTo(48.0f, 41.32653f);
        instancePath.cubicTo(48.0f, 44.693405f, 45.31646f, 47.32653f, 42.0f, 47.32653f);
        instancePath.lineTo(6.0f, 47.32653f);
        Path path = instancePath;
        path.cubicTo(2.6891508f, 47.32653f, 0.0f, 44.698895f, 0.0f, 41.32653f);
        instancePath.lineTo(0.0f, 6.3265305f);
        instancePath.lineTo(0.0f, 6.3265305f);
        instancePath.close();
        instancePath.moveTo(4.0f, 6.3265305f);
        path.cubicTo(4.0f, 5.198393f, 4.89154f, 4.3265305f, 6.0f, 4.3265305f);
        instancePath.lineTo(42.0f, 4.3265305f);
        instancePath.cubicTo(43.10578f, 4.3265305f, 44.0f, 5.195782f, 44.0f, 6.3265305f);
        instancePath.lineTo(44.0f, 41.32653f);
        instancePath.cubicTo(44.0f, 42.45467f, 43.10846f, 43.32653f, 42.0f, 43.32653f);
        instancePath.lineTo(6.0f, 43.32653f);
        instancePath.cubicTo(4.894218f, 43.32653f, 4.0f, 42.45728f, 4.0f, 41.32653f);
        instancePath.lineTo(4.0f, 6.3265305f);
        instancePath.lineTo(4.0f, 6.3265305f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
