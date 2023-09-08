package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_caption */
public class icons_filled_caption extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 72;
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
                instancePaint3.setColor(-436207616);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 72.17484f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(62.768333f, 12.588635f);
                instancePath.cubicTo(64.15884f, 12.588635f, 65.286064f, 13.71586f, 65.286064f, 15.106362f);
                instancePath.lineTo(65.286064f, 57.06848f);
                instancePath.cubicTo(65.286064f, 58.45898f, 64.15884f, 59.58621f, 62.768333f, 59.58621f);
                instancePath.lineTo(9.056824f, 59.58621f);
                instancePath.cubicTo(7.6663213f, 59.58621f, 6.539097f, 58.45898f, 6.539097f, 57.06848f);
                instancePath.lineTo(6.539097f, 15.106362f);
                instancePath.cubicTo(6.539097f, 13.71586f, 7.6663213f, 12.588635f, 9.056824f, 12.588635f);
                instancePath.lineTo(62.768333f, 12.588635f);
                instancePath.close();
                instancePath.moveTo(43.990288f, 26.908209f);
                instancePath.lineTo(21.960175f, 26.908209f);
                instancePath.lineTo(21.960175f, 32.782906f);
                instancePath.lineTo(43.990288f, 32.782906f);
                instancePath.lineTo(43.990288f, 26.908209f);
                instancePath.close();
                instancePath.moveTo(16.827158f, 26.908209f);
                instancePath.lineTo(10.945119f, 26.908209f);
                instancePath.lineTo(10.945119f, 32.782906f);
                instancePath.lineTo(16.827158f, 32.782906f);
                instancePath.lineTo(16.827158f, 26.908209f);
                instancePath.close();
                instancePath.moveTo(61.614376f, 16.994658f);
                instancePath.lineTo(10.945119f, 16.994658f);
                instancePath.lineTo(10.945119f, 22.869354f);
                instancePath.lineTo(61.614376f, 22.869354f);
                instancePath.lineTo(61.614376f, 16.994658f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
