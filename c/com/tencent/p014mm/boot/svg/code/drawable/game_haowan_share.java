package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_haowan_share */
public class game_haowan_share extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-419430401);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -10.0f, 0.0f, 1.0f, -8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 8.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(5.6f, 4.668629f);
        instancePath.lineTo(5.599f, 5.867629f);
        instancePath.lineTo(4.0f, 5.868629f);
        instancePath.lineTo(4.0f, 13.468629f);
        instancePath.lineTo(12.0f, 13.468629f);
        instancePath.lineTo(12.0f, 5.868629f);
        instancePath.lineTo(10.399f, 5.867629f);
        instancePath.lineTo(10.4f, 4.668629f);
        instancePath.lineTo(12.16f, 4.668629f);
        instancePath.cubicTo(12.734376f, 4.668629f, 13.2f, 5.1163445f, 13.2f, 5.668629f);
        instancePath.lineTo(13.2f, 13.66863f);
        instancePath.cubicTo(13.2f, 14.220914f, 12.734376f, 14.66863f, 12.16f, 14.66863f);
        instancePath.lineTo(3.84f, 14.66863f);
        instancePath.cubicTo(3.2656238f, 14.66863f, 2.8f, 14.220914f, 2.8f, 13.66863f);
        instancePath.lineTo(2.8f, 5.668629f);
        instancePath.cubicTo(2.8f, 5.1163445f, 3.2656238f, 4.668629f, 3.84f, 4.668629f);
        instancePath.lineTo(5.6f, 4.668629f);
        instancePath.close();
        instancePath.moveTo(8.594112f, 1.2343146f);
        instancePath.lineTo(10.856854f, 3.4970562f);
        instancePath.lineTo(10.008327f, 4.3455844f);
        instancePath.lineTo(8.6f, 2.937f);
        instancePath.lineTo(8.6f, 8.668629f);
        instancePath.lineTo(7.4f, 8.668629f);
        instancePath.lineTo(7.4f, 2.993f);
        instancePath.lineTo(6.048528f, 4.3455844f);
        instancePath.lineTo(5.2f, 3.4970562f);
        instancePath.lineTo(7.462742f, 1.2343146f);
        instancePath.cubicTo(7.7751613f, 0.92189515f, 8.281693f, 0.92189515f, 8.594112f, 1.2343146f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
