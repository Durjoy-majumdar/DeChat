package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voip_videocall */
public class voip_videocall extends C24542c {
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
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, -1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.restore();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 18.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, -1.0f, 0.0f, 66.650795f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(15.814285f, 31.066668f);
        instancePath.lineTo(50.83651f, 31.066668f);
        instancePath.lineTo(50.83651f, 3.6f);
        instancePath.lineTo(15.814285f, 3.6f);
        instancePath.lineTo(15.814285f, 31.066668f);
        instancePath.close();
        instancePath.moveTo(14.401286f, 2.220446E-16f);
        instancePath.lineTo(52.249508f, -1.110223E-16f);
        instancePath.cubicTo(53.457355f, -3.3290015E-16f, 54.43651f, 0.9791533f, 54.43651f, 2.187f);
        instancePath.lineTo(54.43651f, 32.479668f);
        instancePath.cubicTo(54.43651f, 33.687515f, 53.457355f, 34.666668f, 52.249508f, 34.666668f);
        instancePath.lineTo(14.401286f, 34.666668f);
        instancePath.cubicTo(13.193439f, 34.666668f, 12.214286f, 33.687515f, 12.214286f, 32.479668f);
        instancePath.lineTo(12.214286f, 2.187f);
        instancePath.cubicTo(12.214286f, 0.9791533f, 13.193439f, 1.1100563E-15f, 14.401286f, 2.220446E-16f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, -1.0f, 0.0f, 15.079366f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray5);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(3.6f, 19.946148f);
        instancePath2.lineTo(11.479365f, 27.687836f);
        instancePath2.lineTo(11.479365f, 6.7578244f);
        instancePath2.lineTo(3.6f, 14.499511f);
        instancePath2.lineTo(3.6f, 19.946148f);
        instancePath2.close();
        instancePath2.moveTo(0.0f, 12.989721f);
        instancePath2.lineTo(11.3596115f, 1.8286f);
        Path path = instancePath2;
        path.cubicTo(12.221183f, 0.9820839f, 13.605861f, 0.99428797f, 14.452377f, 1.8558587f);
        path.cubicTo(14.854209f, 2.2648373f, 15.079365f, 2.8152597f, 15.079365f, 3.3886118f);
        instancePath2.lineTo(15.079365f, 31.057047f);
        Path path2 = instancePath2;
        path2.cubicTo(15.079365f, 32.264893f, 14.100212f, 33.24405f, 12.892365f, 33.24405f);
        path2.cubicTo(12.319013f, 33.24405f, 11.768591f, 33.01889f, 11.3596115f, 32.617058f);
        instancePath2.lineTo(0.0f, 21.455938f);
        instancePath2.lineTo(0.0f, 12.989721f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
