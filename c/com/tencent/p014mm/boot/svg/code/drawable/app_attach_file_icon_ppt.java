package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_attach_file_icon_ppt */
public class app_attach_file_icon_ppt extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 120;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 24.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-892609);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(48.0f, 0.0f);
        instancePath.lineTo(72.0f, 24.0f);
        instancePath.lineTo(72.0f, 3.1482964f);
        instancePath.cubicTo(72.0f, 3.1654983f, 72.0f, 3.1827333f, 72.0f, 3.2f);
        instancePath.lineTo(72.0f, 92.8f);
        instancePath.cubicTo(72.0f, 94.567314f, 70.567314f, 96.0f, 68.8f, 96.0f);
        instancePath.lineTo(3.2f, 96.0f);
        Path path = instancePath;
        path.cubicTo(1.4326888f, 96.0f, 0.0f, 94.567314f, 0.0f, 92.8f);
        instancePath.lineTo(0.0f, 3.2f);
        path.cubicTo(0.0f, 1.4326888f, 1.4326888f, 0.0f, 3.2f, 0.0f);
        instancePath.lineTo(48.0f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-16777216);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(72.0f, 24.0f);
        instancePath2.lineTo(51.2f, 24.0f);
        instancePath2.cubicTo(49.43269f, 24.0f, 48.0f, 22.56731f, 48.0f, 20.8f);
        instancePath2.lineTo(48.0f, 0.0f);
        instancePath2.lineTo(48.0f, 0.0f);
        instancePath2.lineTo(72.0f, 24.0f);
        instancePath2.close();
        canvas.saveLayerAlpha((RectF) null, 51, 31);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(32.01875f, 72.8f);
        instancePath3.lineTo(32.01875f, 63.85625f);
        instancePath3.lineTo(37.49375f, 63.85625f);
        Path path2 = instancePath3;
        path2.cubicTo(42.96875f, 63.85625f, 46.8125f, 60.2f, 46.8125f, 54.8f);
        path2.cubicTo(46.8125f, 49.4f, 43.08125f, 45.74375f, 37.7f, 45.74375f);
        instancePath3.lineTo(27.18125f, 45.74375f);
        instancePath3.lineTo(27.18125f, 72.8f);
        instancePath3.lineTo(32.01875f, 72.8f);
        instancePath3.close();
        instancePath3.moveTo(36.40625f, 59.95625f);
        instancePath3.lineTo(32.01875f, 59.95625f);
        instancePath3.lineTo(32.01875f, 49.7f);
        instancePath3.lineTo(36.425f, 49.7f);
        Path path3 = instancePath3;
        path3.cubicTo(39.89375f, 49.7f, 41.9f, 51.55625f, 41.9f, 54.8f);
        path3.cubicTo(41.9f, 58.08125f, 39.875f, 59.95625f, 36.40625f, 59.95625f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
