package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lucky_money_detail_story_video_error_icon */
public class lucky_money_detail_story_video_error_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                instancePaint3.setColor(-1);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -172.0f, 0.0f, 1.0f, -175.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 172.0f, 0.0f, 1.0f, 175.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(48.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(74.50967f, 0.0f, 96.0f, 21.490332f, 96.0f, 48.0f);
                path.cubicTo(96.0f, 74.50967f, 74.50967f, 96.0f, 48.0f, 96.0f);
                path.cubicTo(21.490332f, 96.0f, 0.0f, 74.50967f, 0.0f, 48.0f);
                path.cubicTo(0.0f, 21.490332f, 21.490332f, 0.0f, 48.0f, 0.0f);
                instancePath.close();
                instancePath.moveTo(47.97844f, 64.026566f);
                Path path2 = instancePath;
                path2.cubicTo(45.583126f, 64.026566f, 43.68f, 65.86406f, 43.68f, 68.25938f);
                path2.cubicTo(43.68f, 70.654686f, 45.583126f, 72.49219f, 47.97844f, 72.49219f);
                path2.cubicTo(50.439377f, 72.49219f, 52.30969f, 70.654686f, 52.30969f, 68.25938f);
                path2.cubicTo(52.30969f, 65.86406f, 50.439377f, 64.026566f, 47.97844f, 64.026566f);
                instancePath.close();
                instancePath.moveTo(51.65344f, 19.851562f);
                instancePath.lineTo(44.33625f, 19.851562f);
                instancePath.lineTo(44.86125f, 56.315624f);
                instancePath.lineTo(51.12844f, 56.315624f);
                instancePath.lineTo(51.65344f, 19.851562f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
