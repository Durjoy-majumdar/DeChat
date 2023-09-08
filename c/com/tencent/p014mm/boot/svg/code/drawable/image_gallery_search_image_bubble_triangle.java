package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.image_gallery_search_image_bubble_triangle */
public class image_gallery_search_image_bubble_triangle extends C24542c {
    private final int height = 5;
    private final int width = 14;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 14;
        }
        if (i2 == 1) {
            return 5;
        }
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1284016265);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -273.0f, 0.0f, 1.0f, -738.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 6.123234E-17f, 1.0f, -460.50168f, -1.0f, 6.123234E-17f, 1020.4983f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(281.20755f, 736.37714f);
            instancePath.lineTo(277.97794f, 739.54205f);
            Path path = instancePath;
            path.cubicTo(277.33832f, 740.1688f, 277.33862f, 741.168f, 277.97794f, 741.79456f);
            instancePath.lineTo(281.20755f, 744.9594f);
            path.cubicTo(281.79355f, 745.5337f, 282.49832f, 746.6472f, 282.49832f, 747.49835f);
            instancePath.lineTo(282.49832f, 733.50165f);
            instancePath.cubicTo(282.49832f, 735.33954f, 281.7925f, 735.8039f, 281.20755f, 736.37714f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
