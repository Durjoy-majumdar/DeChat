package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.msg_state_fail_resend_pressed */
public class msg_state_fail_resend_pressed extends C24542c {
    private final int height = 66;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 66;
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
        instancePaint3.setColor(-2800572);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(33.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(51.225395f, 0.0f, 66.0f, 14.774603f, 66.0f, 33.0f);
        path.cubicTo(66.0f, 51.225395f, 51.225395f, 66.0f, 33.0f, 66.0f);
        path.cubicTo(14.774603f, 66.0f, 0.0f, 51.225395f, 0.0f, 33.0f);
        path.cubicTo(0.0f, 14.774603f, 14.774603f, 0.0f, 33.0f, 0.0f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 30.0f, 0.0f, 1.0f, 17.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(3.0f, 27.0f);
        Path path2 = instancePath2;
        path2.cubicTo(4.6568546f, 27.0f, 6.0f, 28.343145f, 6.0f, 30.0f);
        path2.cubicTo(6.0f, 31.656855f, 4.6568546f, 33.0f, 3.0f, 33.0f);
        path2.cubicTo(1.3431456f, 33.0f, 0.0f, 31.656855f, 0.0f, 30.0f);
        path2.cubicTo(0.0f, 28.343145f, 1.3431456f, 27.0f, 3.0f, 27.0f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(0.0f, 0.0f);
        instancePath3.lineTo(6.0f, 0.0f);
        instancePath3.lineTo(5.057815f, 23.0f);
        instancePath3.lineTo(1.0011207f, 23.0f);
        instancePath3.lineTo(0.0f, 0.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
