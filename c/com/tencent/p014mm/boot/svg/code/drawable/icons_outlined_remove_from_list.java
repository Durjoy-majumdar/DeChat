package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_remove_from_list */
public class icons_outlined_remove_from_list extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 4.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-16777216);
        instancePaint4.setStrokeWidth(1.2f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.5f, 1.0f);
        instancePath.lineTo(16.0f, 1.0f);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.2f);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.5f, 7.5f);
        instancePath2.lineTo(16.0f, 7.5f);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-16777216);
        instancePaint6.setStrokeWidth(1.2f);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(0.5f, 14.0f);
        instancePath3.lineTo(8.5f, 14.0f);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint, looper);
        instancePaint7.setColor(-16777216);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(14.975205f, 10.5f);
        instancePath4.lineTo(15.823733f, 11.348528f);
        instancePath4.lineTo(10.2485285f, 16.923733f);
        instancePath4.lineTo(9.4f, 16.075205f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint, looper);
        instancePaint8.setColor(-16777216);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(10.2485285f, 10.5f);
        instancePath5.lineTo(15.823733f, 16.075205f);
        instancePath5.lineTo(14.975205f, 16.923733f);
        instancePath5.lineTo(9.4f, 11.348528f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath5, 1);
        canvas.drawPath(instancePath5, instancePaint8);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
