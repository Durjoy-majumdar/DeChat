package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.actionbar_goto_disabled_biz_icon */
public class actionbar_goto_disabled_biz_icon extends C24542c {
    private final int height = 30;
    private final int width = 30;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 30;
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
        instancePaint3.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -30.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(48.870228f, 11.038835f);
        instancePath.lineTo(46.0f, 13.9090605f);
        instancePath.lineTo(47.16861f, 15.077669f);
        instancePath.lineTo(50.038834f, 12.207443f);
        instancePath.lineTo(52.90906f, 15.077669f);
        instancePath.lineTo(54.07767f, 13.9090605f);
        instancePath.lineTo(51.207443f, 11.038835f);
        instancePath.lineTo(54.07767f, 8.168609f);
        instancePath.lineTo(52.90906f, 7.0f);
        instancePath.lineTo(50.038834f, 9.870226f);
        instancePath.lineTo(47.16861f, 7.0f);
        instancePath.lineTo(46.0f, 8.168609f);
        instancePath.lineTo(48.870228f, 11.038835f);
        instancePath.close();
        instancePath.moveTo(37.99703f, 7.0f);
        instancePath.cubicTo(37.446384f, 7.0f, 37.0f, 7.4530363f, 37.0f, 7.9970303f);
        instancePath.lineTo(37.0f, 14.00297f);
        instancePath.cubicTo(37.0f, 14.553615f, 37.453037f, 15.0f, 37.99703f, 15.0f);
        instancePath.lineTo(44.00297f, 15.0f);
        instancePath.cubicTo(44.553616f, 15.0f, 45.0f, 14.546964f, 45.0f, 14.00297f);
        instancePath.lineTo(45.0f, 7.9970303f);
        Path path = instancePath;
        path.cubicTo(45.0f, 7.4463854f, 44.546963f, 7.0f, 44.00297f, 7.0f);
        instancePath.lineTo(37.99703f, 7.0f);
        instancePath.close();
        instancePath.moveTo(37.99703f, 16.0f);
        path.cubicTo(37.446384f, 16.0f, 37.0f, 16.453035f, 37.0f, 16.99703f);
        instancePath.lineTo(37.0f, 23.00297f);
        Path path2 = instancePath;
        path2.cubicTo(37.0f, 23.553614f, 37.453037f, 24.0f, 37.99703f, 24.0f);
        instancePath.lineTo(44.00297f, 24.0f);
        path2.cubicTo(44.553616f, 24.0f, 45.0f, 23.546965f, 45.0f, 23.00297f);
        instancePath.lineTo(45.0f, 16.99703f);
        path2.cubicTo(45.0f, 16.446386f, 44.546963f, 16.0f, 44.00297f, 16.0f);
        instancePath.lineTo(37.99703f, 16.0f);
        instancePath.close();
        instancePath.moveTo(46.99703f, 16.0f);
        path2.cubicTo(46.446384f, 16.0f, 46.0f, 16.453035f, 46.0f, 16.99703f);
        instancePath.lineTo(46.0f, 23.00297f);
        path2.cubicTo(46.0f, 23.553614f, 46.453037f, 24.0f, 46.99703f, 24.0f);
        instancePath.lineTo(53.00297f, 24.0f);
        path2.cubicTo(53.553616f, 24.0f, 54.0f, 23.546965f, 54.0f, 23.00297f);
        instancePath.lineTo(54.0f, 16.99703f);
        path2.cubicTo(54.0f, 16.446386f, 53.546963f, 16.0f, 53.00297f, 16.0f);
        instancePath.lineTo(46.99703f, 16.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
