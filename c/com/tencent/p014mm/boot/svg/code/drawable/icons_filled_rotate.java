package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_rotate */
public class icons_filled_rotate extends C24542c {
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
        instancePaint3.setColor(-436207616);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.0f, 33.0f);
        instancePath.lineTo(42.0f, 33.0f);
        Path path = instancePath;
        instancePath.cubicTo(43.656853f, 33.0f, 45.0f, 34.343147f, 45.0f, 36.0f);
        path.lineTo(45.0f, 60.0f);
        path.cubicTo(45.0f, 61.656853f, 43.656853f, 63.0f, 42.0f, 63.0f);
        path.lineTo(12.0f, 63.0f);
        Path path2 = path;
        path2.cubicTo(10.343145f, 63.0f, 9.0f, 61.656853f, 9.0f, 60.0f);
        path.lineTo(9.0f, 36.0f);
        path2.cubicTo(9.0f, 34.343147f, 10.343145f, 33.0f, 12.0f, 33.0f);
        path.close();
        path.moveTo(15.0f, 39.0f);
        path.lineTo(15.0f, 57.0f);
        path.lineTo(39.0f, 57.0f);
        path.lineTo(39.0f, 39.0f);
        path.lineTo(15.0f, 39.0f);
        path.close();
        WeChatSVGRenderC2Java.setFillType(path, 1);
        canvas.drawPath(path, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 96.834526f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(33.0f, 36.0f);
        instancePath2.cubicTo(33.0f, 24.234737f, 41.465797f, 14.446767f, 52.638058f, 12.395418f);
        instancePath2.lineTo(52.638058f, 12.395418f);
        instancePath2.lineTo(47.485283f, 7.2426405f);
        instancePath2.lineTo(51.72792f, 3.0f);
        instancePath2.lineTo(63.395184f, 14.667262f);
        Path path3 = instancePath2;
        path3.cubicTo(63.980972f, 15.253048f, 63.980972f, 16.202795f, 63.395184f, 16.788582f);
        instancePath2.lineTo(51.72792f, 28.455845f);
        instancePath2.lineTo(47.485283f, 24.213203f);
        instancePath2.lineTo(53.322514f, 18.375973f);
        path3.cubicTo(45.145084f, 20.07356f, 39.0f, 27.319149f, 39.0f, 36.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
