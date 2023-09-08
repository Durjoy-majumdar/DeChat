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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.more_email_icon_disable */
public class more_email_icon_disable extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-14046139);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(96.0f, 0.0f);
        instancePath.lineTo(96.0f, 96.0f);
        instancePath.lineTo(0.0f, 96.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 51, 31);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 13.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(3.6f, 5.1f);
        instancePath2.lineTo(3.6f, 39.9f);
        instancePath2.lineTo(56.4f, 39.9f);
        instancePath2.lineTo(56.4f, 5.1f);
        instancePath2.lineTo(3.6f, 5.1f);
        instancePath2.close();
        instancePath2.moveTo(0.0f, 4.5f);
        instancePath2.cubicTo(-2.0290612E-16f, 2.8431458f, 1.3431457f, 1.5f, 3.0f, 1.5f);
        instancePath2.lineTo(57.0f, 1.5f);
        instancePath2.cubicTo(58.656853f, 1.5f, 60.0f, 2.8431458f, 60.0f, 4.5f);
        instancePath2.lineTo(60.0f, 40.5f);
        instancePath2.cubicTo(60.0f, 42.156853f, 58.656853f, 43.5f, 57.0f, 43.5f);
        instancePath2.lineTo(3.0f, 43.5f);
        instancePath2.cubicTo(1.3431457f, 43.5f, -2.7402583E-15f, 42.156853f, 0.0f, 40.5f);
        instancePath2.lineTo(0.0f, 4.5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(2.5124738f, 6.5230727f);
        instancePath3.lineTo(25.253035f, 23.99735f);
        instancePath3.cubicTo(28.055511f, 26.150826f, 31.955736f, 26.150826f, 34.758213f, 23.99735f);
        instancePath3.lineTo(57.498775f, 6.5230727f);
        instancePath3.lineTo(55.30527f, 3.6685066f);
        instancePath3.lineTo(32.56471f, 21.142784f);
        instancePath3.cubicTo(31.055685f, 22.30235f, 28.955564f, 22.30235f, 27.446539f, 21.142784f);
        instancePath3.lineTo(4.7059765f, 3.6685066f);
        instancePath3.lineTo(2.5124738f, 6.5230727f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
