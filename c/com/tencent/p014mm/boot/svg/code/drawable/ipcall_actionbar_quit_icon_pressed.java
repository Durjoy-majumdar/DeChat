package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ipcall_actionbar_quit_icon_pressed */
public class ipcall_actionbar_quit_icon_pressed extends C24542c {
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
        instancePaint3.setColor(-3552823);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 24.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.0f, 5.270896f);
        Path path = instancePath;
        path.cubicTo(2.4202743f, 3.8405488f, 3.8405488f, 2.4202743f, 5.270896f, 1.0f);
        path.cubicTo(11.687312f, 7.3962708f, 18.083584f, 13.812688f, 24.5f, 20.21903f);
        path.cubicTo(30.916416f, 13.822761f, 37.312687f, 7.3962708f, 43.729103f, 1.0f);
        path.cubicTo(45.15945f, 2.4202743f, 46.579727f, 3.8405488f, 48.0f, 5.270896f);
        path.cubicTo(41.60373f, 11.687312f, 35.17724f, 18.083584f, 28.78097f, 24.5f);
        path.cubicTo(35.17724f, 30.916416f, 41.60373f, 37.312687f, 48.0f, 43.739178f);
        path.cubicTo(46.579727f, 45.15945f, 45.15945f, 46.579727f, 43.739178f, 48.0f);
        path.cubicTo(37.312687f, 41.60373f, 30.916416f, 35.17724f, 24.5f, 28.78097f);
        path.cubicTo(18.083584f, 35.17724f, 11.687312f, 41.60373f, 5.270896f, 48.0f);
        path.cubicTo(3.8405488f, 46.579727f, 2.4202743f, 45.15945f, 1.0f, 43.739178f);
        path.cubicTo(7.3962708f, 37.312687f, 13.822761f, 30.916416f, 20.21903f, 24.5f);
        path.cubicTo(13.822761f, 18.083584f, 7.3962708f, 11.687312f, 1.0f, 5.270896f);
        instancePath.lineTo(1.0f, 5.270896f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
