package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_delete_on */
public class icons_filled_delete_on extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(7.5f, 15.0f);
        instancePath.lineTo(46.5f, 15.0f);
        instancePath.lineTo(7.5f, 15.0f);
        instancePath.close();
        instancePath.moveTo(46.235294f, 19.500006f);
        instancePath.lineTo(43.832214f, 60.352333f);
        instancePath.cubicTo(43.645664f, 63.52371f, 41.01943f, 66.0f, 37.84257f, 66.0f);
        instancePath.lineTo(16.15743f, 66.0f);
        instancePath.cubicTo(12.980573f, 66.0f, 10.354336f, 63.52371f, 10.167784f, 60.352333f);
        instancePath.lineTo(7.764706f, 19.500006f);
        instancePath.lineTo(46.235294f, 19.500006f);
        instancePath.close();
        instancePath.moveTo(18.0f, 26.999945f);
        instancePath.lineTo(19.5f, 53.99998f);
        instancePath.lineTo(24.0f, 53.99998f);
        instancePath.lineTo(22.800001f, 26.999945f);
        instancePath.lineTo(18.0f, 26.999945f);
        instancePath.close();
        instancePath.moveTo(31.5f, 26.999945f);
        instancePath.lineTo(30.0f, 53.99998f);
        instancePath.lineTo(34.5f, 53.99998f);
        instancePath.lineTo(36.0f, 26.999945f);
        instancePath.lineTo(31.5f, 26.999945f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.9848077f, -0.17364818f, 2.2268772f, 0.17364818f, 0.9848077f, -4.7796535f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(4.429283f, 11.836774f);
        instancePath2.lineTo(52.429283f, 11.836774f);
        instancePath2.cubicTo(53.25771f, 11.836774f, 53.929283f, 12.508347f, 53.929283f, 13.336774f);
        instancePath2.lineTo(53.929283f, 16.33678f);
        instancePath2.lineTo(2.9292831f, 16.33678f);
        instancePath2.lineTo(2.9292831f, 13.336774f);
        instancePath2.cubicTo(2.9292831f, 12.508347f, 3.6008558f, 11.836774f, 4.429283f, 11.836774f);
        instancePath2.close();
        instancePath2.moveTo(22.429283f, 4.336876f);
        instancePath2.lineTo(34.429283f, 4.336876f);
        instancePath2.cubicTo(35.25771f, 4.336876f, 35.929283f, 5.0084486f, 35.929283f, 5.836876f);
        instancePath2.lineTo(35.929283f, 8.836774f);
        instancePath2.lineTo(20.929283f, 8.836774f);
        instancePath2.lineTo(20.929283f, 5.836876f);
        instancePath2.cubicTo(20.929283f, 5.0084486f, 21.600857f, 4.336876f, 22.429283f, 4.336876f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
