package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.appbrand_icon_star_off */
public class appbrand_icon_star_off extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 32;
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.733333f, 0.0f, 1.0f, 3.733333f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(5.6f, 13.6f);
                Path path = instancePath;
                path.cubicTo(8.545519f, 13.6f, 10.933333f, 15.987815f, 10.933333f, 18.933332f);
                path.cubicTo(10.933333f, 21.878853f, 8.545519f, 24.266666f, 5.6f, 24.266666f);
                path.cubicTo(2.6544814f, 24.266666f, 0.26666668f, 21.878853f, 0.26666668f, 18.933332f);
                path.cubicTo(0.26666668f, 15.987815f, 2.6544814f, 13.6f, 5.6f, 13.6f);
                instancePath.close();
                instancePath.moveTo(22.133333f, 14.666667f);
                instancePath.lineTo(22.133333f, 16.8f);
                instancePath.lineTo(18.307667f, 16.799667f);
                instancePath.lineTo(24.08758f, 22.579086f);
                instancePath.lineTo(22.579086f, 24.08758f);
                instancePath.lineTo(16.799667f, 18.307667f);
                instancePath.lineTo(16.8f, 22.133333f);
                instancePath.lineTo(14.666667f, 22.133333f);
                instancePath.lineTo(14.666667f, 14.666667f);
                instancePath.lineTo(22.133333f, 14.666667f);
                instancePath.close();
                instancePath.moveTo(5.6f, 0.26666668f);
                Path path2 = instancePath;
                path2.cubicTo(8.545519f, 0.26666668f, 10.933333f, 2.6544814f, 10.933333f, 5.6f);
                path2.cubicTo(10.933333f, 8.545519f, 8.545519f, 10.933333f, 5.6f, 10.933333f);
                path2.cubicTo(2.6544814f, 10.933333f, 0.26666668f, 8.545519f, 0.26666668f, 5.6f);
                path2.cubicTo(0.26666668f, 2.6544814f, 2.6544814f, 0.26666668f, 5.6f, 0.26666668f);
                instancePath.close();
                instancePath.moveTo(18.933332f, 0.26666668f);
                Path path3 = instancePath;
                path3.cubicTo(21.878853f, 0.26666668f, 24.266666f, 2.6544814f, 24.266666f, 5.6f);
                path3.cubicTo(24.266666f, 8.545519f, 21.878853f, 10.933333f, 18.933332f, 10.933333f);
                path3.cubicTo(15.987815f, 10.933333f, 13.6f, 8.545519f, 13.6f, 5.6f);
                path3.cubicTo(13.6f, 2.6544814f, 15.987815f, 0.26666668f, 18.933332f, 0.26666668f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
