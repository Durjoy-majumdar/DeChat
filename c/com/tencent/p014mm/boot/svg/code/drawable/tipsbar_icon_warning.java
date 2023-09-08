package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.tipsbar_icon_warning */
public class tipsbar_icon_warning extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(0);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(96.0f, 0.0f);
        instancePath.lineTo(96.0f, 96.0f);
        instancePath.lineTo(0.0f, 96.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 21.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-499359);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(27.0f, 0.0f);
        Path path = instancePath2;
        path.cubicTo(41.91169f, 0.0f, 54.0f, 12.088311f, 54.0f, 27.0f);
        path.cubicTo(54.0f, 41.91169f, 41.91169f, 54.0f, 27.0f, 54.0f);
        path.cubicTo(12.088311f, 54.0f, 0.0f, 41.91169f, 0.0f, 27.0f);
        path.cubicTo(0.0f, 12.088311f, 12.088311f, 0.0f, 27.0f, 0.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 13.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(3.0f, 24.0f);
        Path path2 = instancePath3;
        path2.cubicTo(4.6568546f, 24.0f, 6.0f, 25.343145f, 6.0f, 27.0f);
        path2.cubicTo(6.0f, 28.656855f, 4.6568546f, 30.0f, 3.0f, 30.0f);
        path2.cubicTo(1.3431456f, 30.0f, 0.0f, 28.656855f, 0.0f, 27.0f);
        path2.cubicTo(0.0f, 25.343145f, 1.3431456f, 24.0f, 3.0f, 24.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(0.49475262f, 0.0f);
        instancePath4.lineTo(5.4947524f, 0.0f);
        instancePath4.lineTo(4.7095985f, 20.212122f);
        instancePath4.lineTo(1.3290199f, 20.212122f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
