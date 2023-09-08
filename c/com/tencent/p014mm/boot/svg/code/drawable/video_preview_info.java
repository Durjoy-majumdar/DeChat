package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.video_preview_info */
public class video_preview_info extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 16;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
            if (i2 == 2) {
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
                instancePaint3.setColor(-2130706433);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -149.0f, 0.0f, 1.0f, -698.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 654.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 16.0f, 0.0f, 1.0f, 16.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray3);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 73.0f, 0.0f, 1.0f, 28.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray4);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray5 = C24542c.setMatrixFloatArray(matrixFloatArray4, 1.0f, 0.0f, 60.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray5);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray6 = C24542c.setMatrixFloatArray(matrixFloatArray5, 1.0f, 0.0f, 1.333333f, 0.0f, 1.0f, 1.333333f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray6);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(6.6666665f, 0.0f);
                Path path = instancePath;
                path.cubicTo(10.348565f, 0.0f, 13.333333f, 2.9847684f, 13.333333f, 6.6666665f);
                path.cubicTo(13.333333f, 10.348565f, 10.348565f, 13.333333f, 6.6666665f, 13.333333f);
                path.cubicTo(2.9847684f, 13.333333f, 0.0f, 10.348565f, 0.0f, 6.6666665f);
                path.cubicTo(0.0f, 2.9847684f, 2.9847684f, 0.0f, 6.6666665f, 0.0f);
                instancePath.close();
                instancePath.moveTo(6.6666665f, 0.8f);
                Path path2 = instancePath;
                path2.cubicTo(3.4265962f, 0.8f, 0.8f, 3.4265962f, 0.8f, 6.6666665f);
                path2.cubicTo(0.8f, 9.906737f, 3.4265962f, 12.533333f, 6.6666665f, 12.533333f);
                path2.cubicTo(9.906737f, 12.533333f, 12.533333f, 9.906737f, 12.533333f, 6.6666665f);
                path2.cubicTo(12.533333f, 3.4265962f, 9.906737f, 0.8f, 6.6666665f, 0.8f);
                instancePath.close();
                instancePath.moveTo(7.0666666f, 5.3333335f);
                instancePath.lineTo(7.0666666f, 10.0f);
                instancePath.lineTo(6.2666664f, 10.0f);
                instancePath.lineTo(6.2666664f, 5.3333335f);
                instancePath.lineTo(7.0666666f, 5.3333335f);
                instancePath.close();
                instancePath.moveTo(6.6666665f, 3.3333333f);
                Path path3 = instancePath;
                path3.cubicTo(7.0348563f, 3.3333333f, 7.3333335f, 3.6318102f, 7.3333335f, 4.0f);
                path3.cubicTo(7.3333335f, 4.36819f, 7.0348563f, 4.6666665f, 6.6666665f, 4.6666665f);
                path3.cubicTo(6.2984767f, 4.6666665f, 6.0f, 4.36819f, 6.0f, 4.0f);
                path3.cubicTo(6.0f, 3.6318102f, 6.2984767f, 3.3333333f, 6.6666665f, 3.3333333f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
