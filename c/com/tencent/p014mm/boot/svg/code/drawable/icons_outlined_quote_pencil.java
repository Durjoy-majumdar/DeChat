package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_quote_pencil */
public class icons_outlined_quote_pencil extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint2, looper);
        instancePaint3.setStrokeWidth(1.0f);
        Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        instancePaint4.setColor(-16777216);
        instancePaint5.setColor(-16777216);
        instancePaint5.setStrokeWidth(1.5f);
        canvas.save();
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 7.75f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(33.0f, 2.0f);
        instancePath.lineTo(33.0f, 5.6f);
        instancePath.lineTo(3.6f, 5.6f);
        instancePath.lineTo(3.6f, 52.4f);
        instancePath.lineTo(50.4f, 52.4f);
        instancePath.lineTo(50.4f, 23.0f);
        instancePath.lineTo(54.0f, 23.0f);
        instancePath.lineTo(54.0f, 53.0f);
        instancePath.cubicTo(54.0f, 54.656853f, 52.656853f, 56.0f, 51.0f, 56.0f);
        instancePath.lineTo(3.0f, 56.0f);
        instancePath.cubicTo(1.3431457f, 56.0f, 0.0f, 54.656853f, 0.0f, 53.0f);
        instancePath.lineTo(0.0f, 5.0f);
        instancePath.cubicTo(0.0f, 3.3431458f, 1.3431457f, 2.0f, 3.0f, 2.0f);
        instancePath.lineTo(33.0f, 2.0f);
        instancePath.close();
        instancePath.moveTo(52.698658f, 1.2382401f);
        instancePath.lineTo(54.814667f, 3.354252f);
        instancePath.cubicTo(55.39899f, 3.9385726f, 55.39899f, 4.8859434f, 54.814667f, 5.470264f);
        instancePath.lineTo(26.285717f, 33.999214f);
        instancePath.lineTo(19.335936f, 37.885635f);
        Path path = instancePath;
        path.cubicTo(18.903196f, 38.12764f, 18.356207f, 37.97302f, 18.114202f, 37.54028f);
        path.cubicTo(17.960512f, 37.265457f, 17.962038f, 36.930202f, 18.118221f, 36.65679f);
        instancePath.lineTo(22.054068f, 29.766817f);
        instancePath.lineTo(50.582645f, 1.2382401f);
        instancePath.cubicTo(51.166965f, 0.6539196f, 52.114338f, 0.6539196f, 52.698658f, 1.2382401f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint6);
        canvas.drawPath(instancePath, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
