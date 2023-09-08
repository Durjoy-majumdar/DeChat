package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_volume_down */
public class icons_filled_volume_down extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16515072);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(27.9f, 2.1f);
        instancePath.lineTo(16.5f, 13.5f);
        instancePath.lineTo(3.0f, 13.5f);
        instancePath.cubicTo(1.2f, 13.5f, 0.0f, 14.7f, 0.0f, 16.5f);
        instancePath.lineTo(0.0f, 31.5f);
        instancePath.cubicTo(0.0f, 33.3f, 1.2f, 34.5f, 3.0f, 34.5f);
        instancePath.lineTo(16.5f, 34.5f);
        instancePath.lineTo(27.9f, 45.9f);
        Path path = instancePath;
        path.cubicTo(28.5f, 46.5f, 29.1f, 46.8f, 30.0f, 46.8f);
        path.cubicTo(31.8f, 46.8f, 33.0f, 45.6f, 33.0f, 43.8f);
        instancePath.lineTo(33.0f, 4.2f);
        Path path2 = instancePath;
        path2.cubicTo(33.0f, 3.3f, 32.7f, 2.7f, 32.1f, 2.1f);
        path2.cubicTo(30.9f, 0.9f, 29.1f, 0.9f, 27.9f, 2.1f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(42.6f, 35.7f);
        instancePath2.lineTo(39.3f, 32.4f);
        instancePath2.lineTo(39.6f, 32.1f);
        Path path3 = instancePath2;
        path3.cubicTo(41.7f, 30.0f, 42.9f, 27.0f, 42.9f, 24.0f);
        path3.cubicTo(42.9f, 21.0f, 41.7f, 18.0f, 39.6f, 15.9f);
        instancePath2.lineTo(39.3f, 15.6f);
        instancePath2.lineTo(42.6f, 12.3f);
        instancePath2.lineTo(42.9f, 12.6f);
        Path path4 = instancePath2;
        path4.cubicTo(45.9f, 15.6f, 47.7f, 19.8f, 47.7f, 24.0f);
        path4.cubicTo(47.7f, 28.2f, 45.9f, 32.4f, 42.9f, 35.4f);
        instancePath2.lineTo(42.6f, 35.7f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
