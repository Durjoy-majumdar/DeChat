package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.app_brand_404_page_alert_icon */
public class app_brand_404_page_alert_icon extends C24542c {
    private final int height = 280;
    private final int width = 280;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 280;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -10.0f, 0.0f, 1.0f, -10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16896);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(289.5f, 151.72223f);
                Path path = instancePath;
                path.cubicTo(289.5f, 72.954666f, 227.04533f, 10.5f, 148.27777f, 10.5f);
                path.cubicTo(72.954666f, 10.5f, 10.5f, 72.954666f, 10.5f, 151.72223f);
                path.cubicTo(10.5f, 227.04533f, 72.954666f, 289.5f, 148.27777f, 289.5f);
                path.cubicTo(227.04533f, 289.5f, 289.5f, 227.04533f, 289.5f, 151.72223f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
                instancePaint4.setColor(-1);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(141.49457f, 85.5f);
                instancePath2.cubicTo(140.39299f, 85.5f, 139.53296f, 86.39243f, 139.57391f, 87.50098f);
                instancePath2.lineTo(142.96306f, 179.25606f);
                instancePath2.cubicTo(142.98346f, 179.80836f, 143.44995f, 180.2561f, 144.00685f, 180.2561f);
                instancePath2.lineTo(155.99315f, 180.2561f);
                instancePath2.cubicTo(156.54922f, 180.2561f, 157.01639f, 179.81255f, 157.03694f, 179.25606f);
                instancePath2.lineTo(160.42609f, 87.50098f);
                instancePath2.cubicTo(160.4669f, 86.39587f, 159.59766f, 85.5f, 158.50543f, 85.5f);
                instancePath2.lineTo(141.49457f, 85.5f);
                instancePath2.close();
                instancePath2.moveTo(150.0f, 214.5f);
                Path path2 = instancePath2;
                path2.cubicTo(155.799f, 214.5f, 160.5f, 209.799f, 160.5f, 204.0f);
                path2.cubicTo(160.5f, 198.201f, 155.799f, 193.5f, 150.0f, 193.5f);
                path2.cubicTo(144.201f, 193.5f, 139.5f, 198.201f, 139.5f, 204.0f);
                path2.cubicTo(139.5f, 209.799f, 144.201f, 214.5f, 150.0f, 214.5f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
