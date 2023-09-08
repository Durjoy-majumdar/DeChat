package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_capsule_multitasking_wechat */
public class app_brand_capsule_multitasking_wechat extends C24542c {
    private final int height = 150;
    private final int width = 150;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 150;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -239.0f, 0.0f, 1.0f, -739.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 239.0f, 0.0f, 1.0f, 739.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16139513);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(75.0f, 0.0f);
                Path path = instancePath;
                path.cubicTo(116.42136f, 0.0f, 150.0f, 33.57864f, 150.0f, 75.0f);
                path.cubicTo(150.0f, 116.42136f, 116.42136f, 150.0f, 75.0f, 150.0f);
                path.cubicTo(33.57864f, 150.0f, 0.0f, 116.42136f, 0.0f, 75.0f);
                path.cubicTo(0.0f, 33.57864f, 33.57864f, 0.0f, 75.0f, 0.0f);
                instancePath.close();
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(40.333332f, 110.27027f);
                instancePath2.cubicTo(37.63287f, 110.70741f, 36.316177f, 109.3305f, 37.133335f, 107.076164f);
                instancePath2.lineTo(41.4f, 94.29975f);
                Path path2 = instancePath2;
                path2.cubicTo(37.380486f, 88.30855f, 35.0f, 83.169525f, 35.0f, 76.19984f);
                path2.cubicTo(35.0f, 56.08848f, 52.9088f, 40.0f, 75.53333f, 40.0f);
                path2.cubicTo(97.0912f, 40.0f, 115.0f, 56.08848f, 115.0f, 76.19984f);
                path2.cubicTo(115.0f, 95.78047f, 97.0912f, 110.27027f, 75.53333f, 110.27027f);
                path2.cubicTo(67.61395f, 110.27027f, 60.69544f, 108.47199f, 55.266666f, 104.94676f);
                instancePath2.lineTo(40.333332f, 110.27027f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
