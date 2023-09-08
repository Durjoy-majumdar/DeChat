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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icons_filled_pause */
public class finder_icons_filled_pause extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(24.0f, 0.0f);
        instancePath.lineTo(24.0f, 24.0f);
        instancePath.lineTo(0.0f, 24.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 230, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(10.0f, 0.0f);
        Path path = instancePath2;
        path.cubicTo(15.522847f, 0.0f, 20.0f, 4.4771523f, 20.0f, 10.0f);
        path.cubicTo(20.0f, 15.522847f, 15.522847f, 20.0f, 10.0f, 20.0f);
        path.cubicTo(4.4771523f, 20.0f, -2.1316282E-14f, 15.522847f, -2.1316282E-14f, 10.0f);
        path.cubicTo(-2.1316282E-14f, 4.4771523f, 4.4771523f, 0.0f, 10.0f, 0.0f);
        instancePath2.close();
        instancePath2.moveTo(10.0f, 1.2f);
        Path path2 = instancePath2;
        path2.cubicTo(5.139894f, 1.2f, 1.2f, 5.139894f, 1.2f, 10.0f);
        path2.cubicTo(1.2f, 14.8601055f, 5.139894f, 18.8f, 10.0f, 18.8f);
        path2.cubicTo(14.8601055f, 18.8f, 18.8f, 14.8601055f, 18.8f, 10.0f);
        path2.cubicTo(18.8f, 5.139894f, 14.8601055f, 1.2f, 10.0f, 1.2f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-436207616);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 3.75f, 0.0f, 1.0f, 3.75f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 3.75f, 0.0f, 1.0f, 2.25f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(0.5625f, 0.0f);
        instancePath3.cubicTo(0.8731602f, 0.0f, 1.125f, 0.22385763f, 1.125f, 0.5f);
        instancePath3.lineTo(1.125f, 7.0f);
        Path path3 = instancePath3;
        path3.cubicTo(1.125f, 7.2761426f, 0.8731602f, 7.5f, 0.5625f, 7.5f);
        path3.cubicTo(0.25183982f, 7.5f, 0.0f, 7.2761426f, 0.0f, 7.0f);
        instancePath3.lineTo(0.0f, 0.5f);
        path3.cubicTo(0.0f, 0.22385763f, 0.25183982f, 0.0f, 0.5625f, 0.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(4.0625f, 0.0f);
        Path path4 = instancePath4;
        path4.cubicTo(4.3731604f, 0.0f, 4.625f, 0.22385763f, 4.625f, 0.5f);
        instancePath4.lineTo(4.625f, 7.0f);
        path4.cubicTo(4.625f, 7.2761426f, 4.3731604f, 7.5f, 4.0625f, 7.5f);
        path4.cubicTo(3.7518399f, 7.5f, 3.5f, 7.2761426f, 3.5f, 7.0f);
        instancePath4.lineTo(3.5f, 0.5f);
        path4.cubicTo(3.5f, 0.22385763f, 3.7518399f, 0.0f, 4.0625f, 0.0f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
