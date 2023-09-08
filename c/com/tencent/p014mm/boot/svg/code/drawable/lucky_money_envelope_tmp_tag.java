package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lucky_money_envelope_tmp_tag */
public class lucky_money_envelope_tmp_tag extends C24542c {
    private final int height = 98;
    private final int width = 98;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 98;
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
        Paint paint = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -213.0f, 0.0f, 1.0f, -85.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 213.0f, 0.0f, 1.0f, 85.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(paint, looper);
        instancePaint3.setColor(-12043483);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 5.456968E-12f);
        instancePath.lineTo(46.0f, 5.456968E-12f);
        instancePath.lineTo(46.0f, 0.56433105f);
        instancePath.lineTo(46.0f, 3.0f);
        instancePath.lineTo(0.0f, 3.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-12043483);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(95.0f, 51.0f);
        instancePath2.lineTo(98.0f, 51.0f);
        instancePath2.lineTo(98.0f, 98.0f);
        instancePath2.lineTo(95.0f, 98.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-1323622);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(46.0f, -1.4210855E-14f);
        instancePath3.lineTo(98.0f, 51.0f);
        instancePath3.lineTo(98.0f, 98.0f);
        instancePath3.lineTo(0.0f, 6.465939E-12f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
