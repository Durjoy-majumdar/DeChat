package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.panel_icon_fav */
public class panel_icon_fav extends C24542c {
    private final int height = 192;
    private final int width = 192;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 192;
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
        instancePaint3.setColor(-13421773);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 48.0f, 0.0f, 1.0f, 48.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(81.37307f, 25.26795f);
        instancePath.lineTo(48.0f, 44.5359f);
        instancePath.lineTo(14.626933f, 25.26795f);
        instancePath.lineTo(45.398735f, 7.5018406f);
        instancePath.cubicTo(46.835373f, 6.672397f, 49.169003f, 6.674923f, 50.601265f, 7.5018406f);
        instancePath.lineTo(81.37307f, 25.26795f);
        instancePath.close();
        instancePath.moveTo(84.37307f, 30.464102f);
        instancePath.lineTo(84.37307f, 65.996315f);
        instancePath.cubicTo(84.37307f, 67.655205f, 83.20406f, 69.67493f, 81.771805f, 70.50184f);
        instancePath.lineTo(51.0f, 88.26795f);
        instancePath.lineTo(51.0f, 49.73205f);
        instancePath.lineTo(84.37307f, 30.464102f);
        instancePath.close();
        instancePath.moveTo(45.0f, 88.26795f);
        instancePath.lineTo(14.228197f, 70.50184f);
        instancePath.cubicTo(12.791558f, 69.67239f, 11.626933f, 67.650154f, 11.626933f, 65.996315f);
        instancePath.lineTo(11.626933f, 30.464102f);
        instancePath.lineTo(45.0f, 49.73205f);
        instancePath.lineTo(45.0f, 88.26795f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
