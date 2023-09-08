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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fix_tools_uplog */
public class fix_tools_uplog extends C24542c {
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
        canvas.save();
        Paint paint = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 15.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(paint, looper);
        instancePaint3.setColor(-1);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(60.0f, 0.0f);
        instancePath.lineTo(90.0f, 30.0f);
        instancePath.lineTo(90.0f, 116.0f);
        Path path = instancePath;
        path.cubicTo(90.0f, 118.20914f, 88.20914f, 120.0f, 86.0f, 120.0f);
        instancePath.lineTo(4.0f, 120.0f);
        path.cubicTo(1.790861f, 120.0f, 2.705415E-16f, 118.20914f, 0.0f, 116.0f);
        instancePath.lineTo(0.0f, 4.0f);
        path.cubicTo(-2.705415E-16f, 1.790861f, 1.790861f, 4.0581224E-16f, 4.0f, 0.0f);
        instancePath.lineTo(60.0f, 0.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(201326592);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(60.0f, 0.0f);
        instancePath2.lineTo(90.0f, 30.0f);
        instancePath2.lineTo(90.0f, 116.0f);
        Path path2 = instancePath2;
        instancePath2.cubicTo(90.0f, 118.20914f, 88.20914f, 120.0f, 86.0f, 120.0f);
        path2.lineTo(4.0f, 120.0f);
        Path path3 = path2;
        path3.cubicTo(1.790861f, 120.0f, 2.705415E-16f, 118.20914f, 0.0f, 116.0f);
        path2.lineTo(0.0f, 4.0f);
        path3.cubicTo(-2.705415E-16f, 1.790861f, 1.790861f, 4.0581224E-16f, 4.0f, 0.0f);
        path2.lineTo(60.0f, 0.0f);
        path2.close();
        WeChatSVGRenderC2Java.setFillType(path2, 2);
        canvas.drawPath(path2, instancePaint6);
        canvas.restore();
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        instancePaint7.setColor(-16777216);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(90.0f, 30.0f);
        instancePath3.lineTo(64.0f, 30.0f);
        instancePath3.cubicTo(61.79086f, 30.0f, 60.0f, 28.209139f, 60.0f, 26.0f);
        instancePath3.lineTo(60.0f, 0.0f);
        instancePath3.lineTo(90.0f, 30.0f);
        instancePath3.close();
        canvas.saveLayerAlpha((RectF) null, 25, 31);
        Paint instancePaint8 = C24542c.instancePaint(instancePaint7, looper);
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint8);
        canvas.restore();
        canvas.save();
        Paint instancePaint9 = C24542c.instancePaint(paint, looper);
        instancePaint9.setColor(-10461088);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 58.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 204, 31);
        canvas.save();
        Paint instancePaint10 = C24542c.instancePaint(instancePaint9, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(-3.5527137E-15f, 13.20906f);
        instancePath4.lineTo(13.891402f, 3.9411764f);
        instancePath4.lineTo(13.891402f, 7.1200304f);
        instancePath4.lineTo(3.5791855f, 14.0f);
        instancePath4.lineTo(13.891402f, 20.87997f);
        instancePath4.lineTo(13.891402f, 24.058823f);
        instancePath4.lineTo(-1.5543122E-15f, 14.79094f);
        instancePath4.lineTo(0.0f, 13.20906f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint10);
        canvas.restore();
        canvas.save();
        Paint instancePaint11 = C24542c.instancePaint(instancePaint9, looper);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, -1.0f, 0.0f, 76.23529f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        Path instancePath5 = C24542c.instancePath(looper);
        instancePath5.moveTo(31.235294f, 13.20906f);
        instancePath5.lineTo(45.126698f, 3.9411764f);
        instancePath5.lineTo(45.126698f, 7.1200304f);
        instancePath5.lineTo(34.81448f, 14.0f);
        instancePath5.lineTo(45.126698f, 20.87997f);
        instancePath5.lineTo(45.126698f, 24.058823f);
        instancePath5.lineTo(31.235294f, 14.79094f);
        instancePath5.lineTo(31.235294f, 13.20906f);
        instancePath5.close();
        WeChatSVGRenderC2Java.setFillType(instancePath5, 2);
        canvas.drawPath(instancePath5, instancePaint11);
        canvas.restore();
        canvas.save();
        Paint instancePaint12 = C24542c.instancePaint(instancePaint9, looper);
        Path instancePath6 = C24542c.instancePath(looper);
        instancePath6.moveTo(26.200712f, 0.0f);
        instancePath6.lineTo(29.377182f, 0.0f);
        instancePath6.lineTo(19.588236f, 28.0f);
        instancePath6.lineTo(16.411764f, 28.0f);
        instancePath6.close();
        WeChatSVGRenderC2Java.setFillType(instancePath6, 1);
        WeChatSVGRenderC2Java.setFillType(instancePath6, 2);
        canvas.drawPath(instancePath6, instancePaint12);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}