package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_live_shop_license */
public class finder_live_shop_license extends C24542c {
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setColor(-16777216);
        instancePaint3.setStrokeWidth(1.2f);
        instancePaint3.setStrokeCap(Paint.Cap.BUTT);
        instancePaint3.setStrokeJoin(Paint.Join.MITER);
        instancePaint3.setStrokeMiter(4.0f);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 3.0f, 0.0f, 0.0f, 0.0f, 3.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(3.60026f, 2.60026f);
        instancePath.lineTo(20.39974f, 2.60026f);
        Path path = instancePath;
        path.cubicTo(20.951822f, 2.60026f, 21.39974f, 3.048177f, 21.39974f, 3.60026f);
        instancePath.lineTo(21.39974f, 20.39974f);
        path.cubicTo(21.39974f, 20.951822f, 20.951822f, 21.39974f, 20.39974f, 21.39974f);
        instancePath.lineTo(3.60026f, 21.39974f);
        path.cubicTo(3.048177f, 21.39974f, 2.60026f, 20.951822f, 2.60026f, 20.39974f);
        instancePath.lineTo(2.60026f, 3.60026f);
        path.cubicTo(2.60026f, 3.048177f, 3.048177f, 2.60026f, 3.60026f, 2.60026f);
        instancePath.close();
        instancePath.moveTo(3.60026f, 2.60026f);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(16.5f, 36.0f);
        instancePath2.lineTo(55.5f, 36.0f);
        instancePath2.lineTo(55.5f, 39.601562f);
        instancePath2.lineTo(16.5f, 39.601562f);
        instancePath2.close();
        instancePath2.moveTo(16.5f, 36.0f);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(16.5f, 45.601562f);
        instancePath3.lineTo(55.5f, 45.601562f);
        instancePath3.lineTo(55.5f, 49.19922f);
        instancePath3.lineTo(16.5f, 49.19922f);
        instancePath3.close();
        instancePath3.moveTo(16.5f, 45.601562f);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(36.0f, 20.398438f);
        Path path2 = instancePath4;
        path2.cubicTo(38.484375f, 20.398438f, 40.5f, 22.414062f, 40.5f, 24.898438f);
        path2.cubicTo(40.5f, 27.386719f, 38.484375f, 29.398438f, 36.0f, 29.398438f);
        path2.cubicTo(33.515625f, 29.398438f, 31.5f, 27.386719f, 31.5f, 24.898438f);
        path2.cubicTo(31.5f, 22.414062f, 33.515625f, 20.398438f, 36.0f, 20.398438f);
        instancePath4.close();
        instancePath4.moveTo(36.0f, 20.398438f);
        WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
        canvas.drawPath(instancePath4, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
