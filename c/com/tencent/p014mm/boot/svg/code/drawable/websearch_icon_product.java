package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.websearch_icon_product */
public class websearch_icon_product extends C24542c {
    private final int height = 16;
    private final int width = 12;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 12;
        }
        if (i2 == 1) {
            return 16;
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
        instancePaint3.setColor(-5066062);
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -396.0f, 0.0f, 1.0f, -671.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 66.0f, 0.0f, 1.0f, 602.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 327.0f, 0.0f, 1.0f, 68.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray4 = C24542c.setMatrixFloatArray(matrixFloatArray3, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 1.5f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray4);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.9f, 4.65f);
        instancePath.lineTo(0.9f, 13.506087f);
        instancePath.cubicTo(0.9f, 13.833202f, 1.1669413f, 14.1f, 1.4955453f, 14.1f);
        instancePath.lineTo(10.504455f, 14.1f);
        instancePath.cubicTo(10.832851f, 14.1f, 11.1f, 13.833303f, 11.1f, 13.506087f);
        instancePath.lineTo(11.1f, 4.65f);
        instancePath.lineTo(0.9f, 4.65f);
        instancePath.close();
        instancePath.moveTo(0.0f, 4.505613f);
        instancePath.cubicTo(0.0f, 4.0882993f, 0.33347315f, 3.75f, 0.75065374f, 3.75f);
        instancePath.lineTo(11.249347f, 3.75f);
        instancePath.cubicTo(11.663921f, 3.75f, 12.0f, 4.08669f, 12.0f, 4.505613f);
        instancePath.lineTo(12.0f, 13.506087f);
        instancePath.cubicTo(12.0f, 14.331152f, 11.329115f, 15.0f, 10.504455f, 15.0f);
        instancePath.lineTo(1.4955453f, 15.0f);
        instancePath.cubicTo(0.6695784f, 15.0f, 0.0f, 14.329952f, 0.0f, 13.506087f);
        instancePath.lineTo(0.0f, 4.505613f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(3.0f, 3.0f);
        Path path = instancePath2;
        path.cubicTo(3.0f, 1.3431457f, 4.343146f, 0.0f, 6.0f, 0.0f);
        path.cubicTo(7.656854f, 0.0f, 9.0f, 1.3431457f, 9.0f, 3.0f);
        instancePath2.lineTo(8.999999f, 6.75f);
        instancePath2.lineTo(8.099999f, 6.75f);
        instancePath2.lineTo(8.099999f, 3.0f);
        Path path2 = instancePath2;
        path2.cubicTo(8.0999975f, 1.8401997f, 7.1597958f, 0.8999977f, 5.9999976f, 0.8999977f);
        path2.cubicTo(4.8402f, 0.8999977f, 3.8999977f, 1.8401997f, 3.8999977f, 2.9999976f);
        instancePath2.lineTo(3.9f, 6.75f);
        instancePath2.lineTo(3.0f, 6.75f);
        instancePath2.lineTo(3.0f, 3.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
