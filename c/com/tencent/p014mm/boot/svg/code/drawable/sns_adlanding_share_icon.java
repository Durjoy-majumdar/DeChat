package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.sns_adlanding_share_icon */
public class sns_adlanding_share_icon extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 16;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -127.0f, 0.0f, 1.0f, -613.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 134.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 103.0f, 0.0f, 1.0f, 477.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(16.0f, 0.0f);
        instancePath.lineTo(16.0f, 16.0f);
        instancePath.lineTo(0.0f, 16.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-11048043);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(5.2f, 4.0f);
        instancePath2.lineTo(5.2f, 4.96f);
        instancePath2.lineTo(2.96f, 4.96f);
        instancePath2.lineTo(2.96f, 15.04f);
        instancePath2.lineTo(13.84f, 15.04f);
        instancePath2.lineTo(13.84f, 4.96f);
        instancePath2.lineTo(11.6f, 4.96f);
        instancePath2.lineTo(11.6f, 4.0f);
        instancePath2.lineTo(14.000834f, 4.0f);
        instancePath2.cubicTo(14.440696f, 4.0f, 14.8f, 4.356671f, 14.8f, 4.7966466f);
        instancePath2.lineTo(14.8f, 15.203353f);
        instancePath2.cubicTo(14.8f, 15.640863f, 14.443329f, 16.0f, 14.003353f, 16.0f);
        instancePath2.lineTo(2.7966468f, 16.0f);
        instancePath2.cubicTo(2.359136f, 16.0f, 2.0f, 15.643329f, 2.0f, 15.203353f);
        instancePath2.lineTo(2.0f, 4.7966466f);
        instancePath2.cubicTo(2.0f, 4.359136f, 2.3577986f, 4.0f, 2.7991652f, 4.0f);
        instancePath2.lineTo(5.2f, 4.0f);
        instancePath2.close();
        instancePath2.moveTo(8.965686f, 0.5372583f);
        instancePath2.lineTo(11.228427f, 2.8f);
        instancePath2.lineTo(10.549604f, 3.4788225f);
        instancePath2.lineTo(8.879995f, 1.809213f);
        instancePath2.lineTo(8.879995f, 9.2f);
        instancePath2.lineTo(7.9199953f, 9.2f);
        instancePath2.lineTo(7.9199953f, 1.8092228f);
        instancePath2.lineTo(6.2503953f, 3.4788225f);
        instancePath2.lineTo(5.571573f, 2.8f);
        instancePath2.lineTo(7.8343143f, 0.5372583f);
        instancePath2.cubicTo(8.146734f, 0.22483887f, 8.653266f, 0.22483887f, 8.965686f, 0.5372583f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint3);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
