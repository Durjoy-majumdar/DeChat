package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_help */
public class icons_outlined_help extends C24542c {
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
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(36.0f, 67.68f);
        Path path = instancePath;
        path.cubicTo(53.49638f, 67.68f, 67.68f, 53.49638f, 67.68f, 36.0f);
        path.cubicTo(67.68f, 18.503618f, 53.49638f, 4.32f, 36.0f, 4.32f);
        path.cubicTo(18.503618f, 4.32f, 4.32f, 18.503618f, 4.32f, 36.0f);
        path.cubicTo(4.32f, 53.49638f, 18.503618f, 67.68f, 36.0f, 67.68f);
        instancePath.close();
        instancePath.moveTo(36.0f, 72.0f);
        Path path2 = instancePath;
        path2.cubicTo(16.117748f, 72.0f, 0.0f, 55.88225f, 0.0f, 36.0f);
        path2.cubicTo(0.0f, 16.117748f, 16.117748f, 0.0f, 36.0f, 0.0f);
        path2.cubicTo(55.88225f, 0.0f, 72.0f, 16.117748f, 72.0f, 36.0f);
        path2.cubicTo(72.0f, 55.88225f, 55.88225f, 72.0f, 36.0f, 72.0f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(25.2f, 27.745117f);
        instancePath2.lineTo(29.494884f, 27.745117f);
        Path path3 = instancePath2;
        path3.cubicTo(29.771162f, 24.153488f, 32.182327f, 21.91814f, 35.974884f, 21.91814f);
        path3.cubicTo(39.71721f, 21.91814f, 42.128372f, 24.20372f, 42.128372f, 27.31814f);
        path3.cubicTo(42.128372f, 30.00558f, 40.99814f, 31.587908f, 38.084652f, 33.371162f);
        path3.cubicTo(34.643723f, 35.4307f, 33.036278f, 37.691162f, 33.061394f, 41.00651f);
        instancePath2.lineTo(33.061394f, 43.31721f);
        instancePath2.lineTo(37.456745f, 43.31721f);
        instancePath2.lineTo(37.456745f, 41.68465f);
        Path path4 = instancePath2;
        path4.cubicTo(37.456745f, 39.047443f, 38.36093f, 37.64093f, 41.550697f, 35.75721f);
        path4.cubicTo(44.765583f, 33.823257f, 46.8f, 31.035349f, 46.8f, 27.092093f);
        path4.cubicTo(46.8f, 21.91814f, 42.48f, 18.0f, 36.150696f, 18.0f);
        path4.cubicTo(29.093023f, 18.0f, 25.476278f, 22.32f, 25.2f, 27.745117f);
        instancePath2.close();
        instancePath2.moveTo(35.27163f, 54.770233f);
        Path path5 = instancePath2;
        path5.cubicTo(36.904186f, 54.770233f, 38.134884f, 53.51442f, 38.134884f, 51.90698f);
        path5.cubicTo(38.134884f, 50.274418f, 36.904186f, 49.04372f, 35.27163f, 49.04372f);
        path5.cubicTo(33.664185f, 49.04372f, 32.40837f, 50.274418f, 32.40837f, 51.90698f);
        path5.cubicTo(32.40837f, 53.51442f, 33.664185f, 54.770233f, 35.27163f, 54.770233f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
