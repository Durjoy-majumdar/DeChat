package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lucky_money_f2f_record_icon */
public class lucky_money_f2f_record_icon extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -257.0f, 0.0f, 1.0f, -307.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 257.0f, 0.0f, 1.0f, 307.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-3232652);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 5.3333335f);
        Path path = instancePath;
        path.cubicTo(0.0f, 2.3878145f, 2.3878145f, 0.0f, 5.3333335f, 0.0f);
        instancePath.lineTo(42.666668f, 0.0f);
        path.cubicTo(45.612186f, 0.0f, 48.0f, 2.3878145f, 48.0f, 5.3333335f);
        instancePath.lineTo(48.0f, 42.666668f);
        path.cubicTo(48.0f, 45.612186f, 45.612186f, 48.0f, 42.666668f, 48.0f);
        instancePath.lineTo(5.3333335f, 48.0f);
        path.cubicTo(2.3878145f, 48.0f, 0.0f, 45.612186f, 0.0f, 42.666668f);
        instancePath.lineTo(0.0f, 5.3333335f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(14.822541f, 37.75567f);
        instancePath2.lineTo(14.822541f, 36.495667f);
        instancePath2.lineTo(33.27254f, 36.495667f);
        instancePath2.lineTo(33.27254f, 37.75567f);
        instancePath2.lineTo(36.032543f, 37.75567f);
        instancePath2.lineTo(36.032543f, 16.875668f);
        instancePath2.lineTo(24.692541f, 16.875668f);
        instancePath2.cubicTo(25.082542f, 15.855667f, 25.382542f, 14.805667f, 25.622541f, 13.725667f);
        instancePath2.lineTo(37.442543f, 13.725667f);
        instancePath2.lineTo(37.442543f, 10.995667f);
        instancePath2.lineTo(10.562542f, 10.995667f);
        instancePath2.lineTo(10.562542f, 13.725667f);
        instancePath2.lineTo(22.712542f, 13.725667f);
        instancePath2.cubicTo(22.502542f, 14.805667f, 22.202541f, 15.855667f, 21.812542f, 16.875668f);
        instancePath2.lineTo(12.062542f, 16.875668f);
        instancePath2.lineTo(12.062542f, 37.75567f);
        instancePath2.lineTo(14.822541f, 37.75567f);
        instancePath2.close();
        instancePath2.moveTo(18.242542f, 33.855667f);
        instancePath2.lineTo(14.822541f, 33.855667f);
        instancePath2.lineTo(14.822541f, 19.485668f);
        instancePath2.lineTo(18.242542f, 19.485668f);
        instancePath2.lineTo(18.242542f, 33.855667f);
        instancePath2.close();
        instancePath2.moveTo(33.27254f, 33.855667f);
        instancePath2.lineTo(29.76254f, 33.855667f);
        instancePath2.lineTo(29.76254f, 19.485668f);
        instancePath2.lineTo(33.27254f, 19.485668f);
        instancePath2.lineTo(33.27254f, 33.855667f);
        instancePath2.close();
        instancePath2.moveTo(27.09254f, 22.605667f);
        instancePath2.lineTo(20.912542f, 22.605667f);
        instancePath2.lineTo(20.912542f, 19.485668f);
        instancePath2.lineTo(27.09254f, 19.485668f);
        instancePath2.lineTo(27.09254f, 22.605667f);
        instancePath2.close();
        instancePath2.moveTo(27.09254f, 28.185667f);
        instancePath2.lineTo(20.912542f, 28.185667f);
        instancePath2.lineTo(20.912542f, 25.065668f);
        instancePath2.lineTo(27.09254f, 25.065668f);
        instancePath2.lineTo(27.09254f, 28.185667f);
        instancePath2.close();
        instancePath2.moveTo(27.09254f, 33.855667f);
        instancePath2.lineTo(20.912542f, 33.855667f);
        instancePath2.lineTo(20.912542f, 30.615667f);
        instancePath2.lineTo(27.09254f, 30.615667f);
        instancePath2.lineTo(27.09254f, 33.855667f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
