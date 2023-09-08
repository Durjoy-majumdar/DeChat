package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_fast_comment */
public class icons_outlined_fast_comment extends C24542c {
    private final int height = 25;
    private final int width = 25;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 25;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.467348f, 0.0f, 1.0f, 0.595203f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-436207616);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(10.502944f, 17.8f);
        instancePath.lineTo(20.5f, 17.8f);
        instancePath.cubicTo(20.665686f, 17.8f, 20.8f, 17.665686f, 20.8f, 17.5f);
        instancePath.lineTo(20.8f, 5.5f);
        instancePath.cubicTo(20.8f, 5.3343143f, 20.665686f, 5.2f, 20.5f, 5.2f);
        instancePath.lineTo(3.5f, 5.2f);
        instancePath.cubicTo(3.3343146f, 5.2f, 3.2f, 5.3343143f, 3.2f, 5.5f);
        instancePath.lineTo(3.2f, 17.5f);
        instancePath.cubicTo(3.2f, 17.665686f, 3.3343146f, 17.8f, 3.5f, 17.8f);
        instancePath.lineTo(8.2f, 17.8f);
        instancePath.lineTo(8.2f, 20.102943f);
        instancePath.lineTo(10.502944f, 17.8f);
        instancePath.close();
        instancePath.moveTo(11.0f, 19.0f);
        instancePath.lineTo(8.707107f, 21.292892f);
        Path path = instancePath;
        path.cubicTo(8.316583f, 21.683418f, 7.6834173f, 21.683418f, 7.2928934f, 21.292892f);
        path.cubicTo(7.1053567f, 21.105356f, 7.0f, 20.851004f, 7.0f, 20.585787f);
        instancePath.lineTo(7.0f, 19.0f);
        instancePath.lineTo(3.5f, 19.0f);
        Path path2 = instancePath;
        path2.cubicTo(2.671573f, 19.0f, 2.0f, 18.328426f, 2.0f, 17.5f);
        instancePath.lineTo(2.0f, 5.5f);
        path2.cubicTo(2.0f, 4.6715727f, 2.671573f, 4.0f, 3.5f, 4.0f);
        instancePath.lineTo(20.5f, 4.0f);
        path2.cubicTo(21.328426f, 4.0f, 22.0f, 4.6715727f, 22.0f, 5.5f);
        instancePath.lineTo(22.0f, 17.5f);
        path2.cubicTo(22.0f, 18.328426f, 21.328426f, 19.0f, 20.5f, 19.0f);
        instancePath.lineTo(11.0f, 19.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-15198184);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(6.0f, 8.082094f);
        instancePath2.lineTo(18.0f, 8.082094f);
        instancePath2.lineTo(18.0f, 9.282094f);
        instancePath2.lineTo(6.0f, 9.282094f);
        instancePath2.lineTo(6.0f, 8.082094f);
        instancePath2.close();
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-15198184);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(6.0f, 11.038452f);
        instancePath3.lineTo(14.007202f, 11.038452f);
        instancePath3.lineTo(14.007202f, 12.238452f);
        instancePath3.lineTo(6.0f, 12.238452f);
        instancePath3.lineTo(6.0f, 11.038452f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
