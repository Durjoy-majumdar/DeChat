package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.c2c_remittance_rejected_icon */
public class c2c_remittance_rejected_icon extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(60.0f, 0.0f);
        Path path = instancePath;
        path.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
        path.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
        path.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
        path.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(60.0f, 7.2f);
        Path path2 = instancePath;
        path2.cubicTo(30.839365f, 7.2f, 7.2f, 30.839365f, 7.2f, 60.0f);
        path2.cubicTo(7.2f, 89.16064f, 30.839365f, 112.8f, 60.0f, 112.8f);
        path2.cubicTo(89.16064f, 112.8f, 112.8f, 89.16064f, 112.8f, 60.0f);
        path2.cubicTo(112.8f, 30.839365f, 89.16064f, 7.2f, 60.0f, 7.2f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 0.70710677f, 0.70710677f, -26.396969f, -0.70710677f, 0.70710677f, 56.698486f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(73.24264f, 42.213203f);
        instancePath2.lineTo(73.24264f, 49.413204f);
        instancePath2.lineTo(44.44264f, 49.413204f);
        instancePath2.lineTo(44.442642f, 78.2132f);
        instancePath2.lineTo(37.24264f, 78.2132f);
        instancePath2.lineTo(37.24264f, 48.213203f);
        instancePath2.cubicTo(37.24264f, 44.899498f, 39.928932f, 42.213203f, 43.24264f, 42.213203f);
        instancePath2.lineTo(73.24264f, 42.213203f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(36.0f, 56.399998f);
        instancePath3.lineTo(90.0f, 56.399998f);
        instancePath3.lineTo(90.0f, 63.6f);
        instancePath3.lineTo(36.0f, 63.6f);
        instancePath3.lineTo(36.0f, 56.399998f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
