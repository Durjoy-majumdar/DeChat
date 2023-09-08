package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.checkbox_selected_game */
public class checkbox_selected_game extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 60;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-15616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 6.4f);
        Path path = instancePath;
        path.cubicTo(0.0f, 2.8653774f, 2.8653774f, 0.0f, 6.4f, 0.0f);
        instancePath.lineTo(41.6f, 0.0f);
        path.cubicTo(45.13462f, 0.0f, 48.0f, 2.8653774f, 48.0f, 6.4f);
        instancePath.lineTo(48.0f, 41.6f);
        path.cubicTo(48.0f, 45.13462f, 45.13462f, 48.0f, 41.6f, 48.0f);
        instancePath.lineTo(6.4f, 48.0f);
        path.cubicTo(2.8653774f, 48.0f, 0.0f, 45.13462f, 0.0f, 41.6f);
        instancePath.lineTo(0.0f, 6.4f);
        instancePath.close();
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(37.20189f, 9.6f);
        instancePath2.lineTo(41.72737f, 14.1254835f);
        instancePath2.lineTo(23.89f, 31.962f);
        instancePath2.lineTo(23.91362f, 31.98589f);
        instancePath2.lineTo(19.388138f, 36.51137f);
        instancePath2.lineTo(6.4f, 23.523235f);
        instancePath2.lineTo(10.925484f, 18.997753f);
        instancePath2.lineTo(19.365f, 27.437f);
        instancePath2.lineTo(37.20189f, 9.6f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
