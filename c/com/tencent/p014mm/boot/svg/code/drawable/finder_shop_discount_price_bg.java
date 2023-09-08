package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_shop_discount_price_bg */
public class finder_shop_discount_price_bg extends C24542c {
    private final int height = 32;
    private final int width = 201;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 201;
        }
        if (i2 == 1) {
            return 32;
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
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(-1.7136293E-14f, 0.0f);
        instancePath.lineTo(201.0f, 0.0f);
        instancePath.lineTo(201.0f, 32.0f);
        instancePath.lineTo(-1.7136293E-14f, 32.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        Paint instancePaint4 = C24542c.instancePaint(looper);
        instancePaint4.setFlags(385);
        instancePaint4.setStyle(Paint.Style.FILL);
        Paint instancePaint5 = C24542c.instancePaint(looper);
        instancePaint5.setFlags(385);
        instancePaint5.setStyle(Paint.Style.STROKE);
        instancePaint4.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.0f);
        instancePaint5.setStrokeCap(Paint.Cap.BUTT);
        instancePaint5.setStrokeJoin(Paint.Join.MITER);
        instancePaint5.setStrokeMiter(4.0f);
        instancePaint5.setPathEffect((PathEffect) null);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 201.0f, 0.0f, -1.7136293E-14f, 0.0f, 32.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        Matrix matrix = instanceMatrix;
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint3, 0.0f, 1.0f, 1.0f, 1.0f, new int[]{-40634, -33971}, new float[]{0.0f, 1.0f}, matrix, 0);
        Path path = instancePath;
        WeChatSVGRenderC2Java.setFillType(path, 2);
        canvas.drawPath(path, instancePaint3);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 0.9945219f, 0.104528464f, -12.793014f, -0.104528464f, 0.9945219f, 22.566837f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(9.992486f, 330.764f);
        instancePath2.lineTo(-1.4669633f, 330.764f);
        Path path2 = instancePath2;
        path2.cubicTo(-2.4251113f, 319.90546f, -3.0f, 310.31314f, -3.0f, 301.41144f);
        path2.cubicTo(-3.0f, 119.694145f, 153.10147f, -31.903204f, 358.22177f, -63.059124f);
        path2.cubicTo(358.78442f, -64.436295f, 358.78442f, -64.436295f, 359.24298f, -63.059124f);
        path2.cubicTo(383.77155f, -56.26775f, 419.81152f, -20.008703f, 420.76968f, -0.4019586f);
        path2.cubicTo(420.76968f, -0.1333731f, 420.808f, 0.1735818f, 420.808f, 0.44216734f);
        path2.cubicTo(205.83792f, 7.0800667f, 26.85589f, 149.77573f, 9.992486f, 330.764f);
        instancePath2.close();
        Paint instancePaint7 = C24542c.instancePaint(looper);
        instancePaint7.setFlags(385);
        instancePaint7.setStyle(Paint.Style.FILL);
        Paint instancePaint8 = C24542c.instancePaint(looper);
        instancePaint8.setFlags(385);
        instancePaint8.setStyle(Paint.Style.STROKE);
        instancePaint7.setColor(-16777216);
        instancePaint8.setStrokeWidth(1.0f);
        instancePaint8.setStrokeCap(Paint.Cap.BUTT);
        instancePaint8.setStrokeJoin(Paint.Join.MITER);
        instancePaint8.setStrokeMiter(4.0f);
        instancePaint8.setPathEffect((PathEffect) null);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 420.808f, 0.0f, -3.0f, 0.0f, 330.764f, -64.436295f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        WeChatSVGRenderC2Java.setLinearGradient(instancePaint6, 0.712871f, 0.14770126f, 0.36606425f, 0.36894768f, new int[]{16777215, 654311423, 16777215}, new float[]{0.0f, 0.5132928f, 1.0f}, matrix, 0);
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
