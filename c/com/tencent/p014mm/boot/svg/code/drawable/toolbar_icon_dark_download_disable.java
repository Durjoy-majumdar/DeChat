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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.toolbar_icon_dark_download_disable */
public class toolbar_icon_dark_download_disable extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
        canvas.saveLayerAlpha((RectF) null, 204, 31);
        canvas.restore();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-1);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 53.63604f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(37.79998f, 15.784549f);
        instancePath.lineTo(37.79998f, 43.5f);
        instancePath.lineTo(34.19998f, 43.5f);
        instancePath.lineTo(34.19998f, 15.784586f);
        instancePath.lineTo(27.938982f, 22.045584f);
        instancePath.lineTo(25.393398f, 19.5f);
        instancePath.lineTo(33.87868f, 11.014719f);
        instancePath.cubicTo(35.05025f, 9.843145f, 36.94975f, 9.843145f, 38.12132f, 11.014719f);
        instancePath.lineTo(38.545586f, 11.438983f);
        instancePath.lineTo(46.6066f, 19.5f);
        instancePath.lineTo(44.061016f, 22.045584f);
        instancePath.lineTo(37.79998f, 15.784549f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(56.4f, 24.6f);
        instancePath2.lineTo(48.0f, 24.6f);
        instancePath2.lineTo(48.0f, 21.0f);
        instancePath2.lineTo(57.00313f, 21.0f);
        instancePath2.cubicTo(58.65261f, 21.0f, 60.0f, 22.337517f, 60.0f, 23.987425f);
        instancePath2.lineTo(60.0f, 63.012573f);
        instancePath2.cubicTo(60.0f, 64.65324f, 58.662483f, 66.0f, 57.012573f, 66.0f);
        instancePath2.lineTo(14.987426f, 66.0f);
        instancePath2.cubicTo(13.346761f, 66.0f, 12.0f, 64.66248f, 12.0f, 63.012573f);
        instancePath2.lineTo(12.0f, 23.987425f);
        instancePath2.cubicTo(12.0f, 22.34676f, 13.341744f, 21.0f, 14.99687f, 21.0f);
        instancePath2.lineTo(24.0f, 21.0f);
        instancePath2.lineTo(24.0f, 24.6f);
        instancePath2.lineTo(15.6f, 24.6f);
        instancePath2.lineTo(15.6f, 62.4f);
        instancePath2.lineTo(56.4f, 62.4f);
        instancePath2.lineTo(56.4f, 24.6f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
