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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.photo_edit_navbar_icon_mark */
public class photo_edit_navbar_icon_mark extends C24542c {
    private final int height = 240;
    private final int width = 240;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 240;
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
        canvas.saveLayerAlpha((RectF) null, 192, 31);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 92.0f, 0.0f, 1.0f, 95.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(44.0f, 4.0f);
        instancePath.lineTo(57.0f, 4.0f);
        instancePath.lineTo(57.0f, 9.0f);
        instancePath.lineTo(44.0f, 9.0f);
        instancePath.lineTo(44.0f, 14.0f);
        instancePath.lineTo(39.0f, 14.0f);
        instancePath.lineTo(39.0f, 0.0f);
        instancePath.lineTo(44.0f, 0.0f);
        instancePath.lineTo(44.0f, 4.0f);
        instancePath.close();
        instancePath.moveTo(0.0f, 4.0f);
        instancePath.lineTo(36.0f, 4.0f);
        instancePath.lineTo(36.0f, 9.0f);
        instancePath.lineTo(0.0f, 9.0f);
        instancePath.lineTo(0.0f, 4.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(22.0f, 24.0f);
        instancePath2.lineTo(57.0f, 24.0f);
        instancePath2.lineTo(57.0f, 29.0f);
        instancePath2.lineTo(22.0f, 29.0f);
        instancePath2.lineTo(22.0f, 32.0f);
        instancePath2.lineTo(17.0f, 32.0f);
        instancePath2.lineTo(17.0f, 21.0f);
        instancePath2.lineTo(22.0f, 21.0f);
        instancePath2.lineTo(22.0f, 24.0f);
        instancePath2.close();
        instancePath2.moveTo(0.0f, 24.0f);
        instancePath2.lineTo(14.0f, 24.0f);
        instancePath2.lineTo(14.0f, 29.0f);
        instancePath2.lineTo(0.0f, 29.0f);
        instancePath2.lineTo(0.0f, 24.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(44.0f, 43.0f);
        instancePath3.lineTo(57.0f, 43.0f);
        instancePath3.lineTo(57.0f, 48.0f);
        instancePath3.lineTo(44.0f, 48.0f);
        instancePath3.lineTo(44.0f, 51.0f);
        instancePath3.lineTo(40.0f, 51.0f);
        instancePath3.lineTo(40.0f, 40.0f);
        instancePath3.lineTo(44.0f, 40.0f);
        instancePath3.lineTo(44.0f, 43.0f);
        instancePath3.close();
        instancePath3.moveTo(0.0f, 43.0f);
        instancePath3.lineTo(36.0f, 43.0f);
        instancePath3.lineTo(36.0f, 48.0f);
        instancePath3.lineTo(0.0f, 48.0f);
        instancePath3.lineTo(0.0f, 43.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
