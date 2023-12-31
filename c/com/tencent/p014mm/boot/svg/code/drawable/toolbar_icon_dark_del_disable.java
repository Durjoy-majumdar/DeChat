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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.toolbar_icon_dark_del_disable */
public class toolbar_icon_dark_del_disable extends C24542c {
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-14046139);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(96.0f, 0.0f);
        instancePath.lineTo(96.0f, 96.0f);
        instancePath.lineTo(0.0f, 96.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath, C24542c.instancePaint(instancePaint3, looper));
        canvas.restore();
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        instancePaint4.setColor(-1);
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 76, 31);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 10.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(10.320658f, 10.199991f);
        instancePath2.lineTo(12.757717f, 51.142605f);
        instancePath2.cubicTo(12.833185f, 52.410458f, 13.88338f, 53.4f, 15.153477f, 53.4f);
        instancePath2.lineTo(36.846523f, 53.4f);
        instancePath2.cubicTo(38.11662f, 53.4f, 39.166817f, 52.410458f, 39.242283f, 51.142605f);
        instancePath2.lineTo(41.679344f, 10.199991f);
        instancePath2.lineTo(10.320658f, 10.199991f);
        instancePath2.close();
        instancePath2.moveTo(45.285713f, 10.199991f);
        instancePath2.lineTo(42.835922f, 51.35651f);
        instancePath2.cubicTo(42.647255f, 54.526142f, 40.021767f, 57.0f, 36.846523f, 57.0f);
        instancePath2.lineTo(15.153477f, 57.0f);
        instancePath2.cubicTo(11.978235f, 57.0f, 9.352747f, 54.526142f, 9.164078f, 51.35651f);
        instancePath2.lineTo(6.714286f, 10.199991f);
        instancePath2.lineTo(0.5f, 10.199991f);
        instancePath2.lineTo(0.5f, 8.099991f);
        instancePath2.cubicTo(0.5f, 7.2715635f, 1.1715729f, 6.599991f, 2.0f, 6.599991f);
        instancePath2.lineTo(50.0f, 6.599991f);
        instancePath2.cubicTo(50.828426f, 6.599991f, 51.5f, 7.2715635f, 51.5f, 8.099991f);
        instancePath2.lineTo(51.5f, 10.199991f);
        instancePath2.lineTo(45.285713f, 10.199991f);
        instancePath2.close();
        instancePath2.moveTo(32.0f, 8.1856706E-5f);
        instancePath2.cubicTo(32.828426f, 8.1856706E-5f, 33.5f, 0.67165476f, 33.5f, 1.5000819f);
        instancePath2.lineTo(33.5f, 3.6000726f);
        instancePath2.lineTo(18.5f, 3.6000726f);
        instancePath2.lineTo(18.5f, 1.5000819f);
        instancePath2.cubicTo(18.5f, 0.67165476f, 19.171574f, 8.1856706E-5f, 20.0f, 8.1856706E-5f);
        instancePath2.lineTo(32.0f, 8.1856706E-5f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(18.5f, 18.0f);
        instancePath3.lineTo(22.100037f, 18.0f);
        instancePath3.lineTo(23.600037f, 45.0f);
        instancePath3.lineTo(20.0f, 45.0f);
        instancePath3.lineTo(18.5f, 18.0f);
        instancePath3.close();
        instancePath3.moveTo(29.899963f, 18.0f);
        instancePath3.lineTo(33.5f, 18.0f);
        instancePath3.lineTo(32.0f, 45.0f);
        instancePath3.lineTo(28.399963f, 45.0f);
        instancePath3.lineTo(29.899963f, 18.0f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
