package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mall_index_bankcard_icon_normal */
public class mall_index_bankcard_icon_normal extends C24542c {
    private final int height = 93;
    private final int width = 93;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 93;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 13.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(3.7996218f, 0.0f);
                instancePath.cubicTo(2.1727934f, 0.0f, 0.0f, 2.2915592f, 0.0f, 5.020509f);
                instancePath.lineTo(0.0f, 61.501232f);
                instancePath.cubicTo(0.0f, 64.23018f, 2.1727934f, 66.521736f, 3.7996218f, 66.521736f);
                instancePath.lineTo(83.59168f, 66.521736f);
                instancePath.cubicTo(85.217415f, 66.521736f, 87.391304f, 64.23018f, 87.391304f, 61.501232f);
                instancePath.lineTo(87.391304f, 5.020509f);
                Path path = instancePath;
                path.cubicTo(87.391304f, 2.2915592f, 85.217415f, 0.0f, 83.59168f, 0.0f);
                instancePath.lineTo(3.7996218f, 0.0f);
                instancePath.close();
                instancePath.moveTo(10.302137f, 6.521739f);
                path.cubicTo(8.370235f, 6.521739f, 6.521739f, 8.363973f, 6.521739f, 10.252781f);
                instancePath.lineTo(6.521739f, 56.26896f);
                instancePath.cubicTo(6.521739f, 58.157764f, 8.370235f, 60.0f, 10.302137f, 60.0f);
                instancePath.lineTo(77.089165f, 60.0f);
                instancePath.cubicTo(79.02014f, 60.0f, 80.86957f, 58.157764f, 80.86957f, 56.26896f);
                instancePath.lineTo(80.86957f, 10.252781f);
                instancePath.cubicTo(80.86957f, 8.363973f, 79.02014f, 6.521739f, 77.089165f, 6.521739f);
                instancePath.lineTo(10.302137f, 6.521739f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(13.0f, 18.0f);
                instancePath2.lineTo(74.30435f, 18.0f);
                instancePath2.lineTo(74.30435f, 25.826088f);
                instancePath2.lineTo(13.0f, 25.826088f);
                instancePath2.lineTo(13.0f, 18.0f);
                instancePath2.close();
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
