package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.webview_add_shortcut */
public class webview_add_shortcut extends C24542c {
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -249.0f, 0.0f, 1.0f, -128.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 249.0f, 0.0f, 1.0f, 128.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-9276814);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(80.0f, 38.0f);
        instancePath.lineTo(80.0f, 46.0f);
        instancePath.cubicTo(81.59742f, 46.5f, 83.5f, 48.403057f, 84.0f, 50.0f);
        instancePath.lineTo(84.0f, 77.0f);
        instancePath.cubicTo(83.5f, 78.59742f, 81.59742f, 80.5f, 80.0f, 81.0f);
        instancePath.lineTo(53.0f, 81.0f);
        instancePath.cubicTo(51.402584f, 80.5f, 49.5f, 78.59742f, 49.0f, 77.0f);
        instancePath.lineTo(41.0f, 77.0f);
        instancePath.cubicTo(41.0f, 83.29178f, 46.70822f, 89.0f, 53.0f, 89.0f);
        instancePath.lineTo(80.0f, 89.0f);
        instancePath.cubicTo(86.29178f, 89.0f, 92.0f, 83.29178f, 92.0f, 77.0f);
        instancePath.lineTo(92.0f, 50.0f);
        instancePath.cubicTo(92.0f, 43.70822f, 86.29178f, 38.0f, 80.0f, 38.0f);
        instancePath.moveTo(16.0f, 56.0f);
        instancePath.lineTo(16.0f, 17.0f);
        instancePath.cubicTo(16.0f, 14.912758f, 17.912758f, 13.0f, 20.0f, 13.0f);
        instancePath.lineTo(59.0f, 13.0f);
        instancePath.cubicTo(61.087242f, 13.0f, 63.0f, 14.912758f, 63.0f, 17.0f);
        instancePath.lineTo(63.0f, 56.0f);
        instancePath.cubicTo(63.0f, 58.087242f, 61.087242f, 60.0f, 59.0f, 60.0f);
        instancePath.lineTo(20.0f, 60.0f);
        instancePath.cubicTo(17.912758f, 60.0f, 16.0f, 58.087242f, 16.0f, 56.0f);
        instancePath.moveTo(71.0f, 56.0f);
        instancePath.lineTo(71.0f, 17.0f);
        instancePath.cubicTo(71.0f, 10.641533f, 65.35893f, 5.0f, 59.0f, 5.0f);
        instancePath.lineTo(20.0f, 5.0f);
        Path path = instancePath;
        path.cubicTo(13.641067f, 5.0f, 8.0f, 10.641533f, 8.0f, 17.0f);
        instancePath.lineTo(8.0f, 56.0f);
        path.cubicTo(8.0f, 62.358932f, 13.641067f, 68.0f, 20.0f, 68.0f);
        instancePath.lineTo(59.0f, 68.0f);
        path.cubicTo(65.35893f, 68.0f, 71.0f, 62.358932f, 71.0f, 56.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
