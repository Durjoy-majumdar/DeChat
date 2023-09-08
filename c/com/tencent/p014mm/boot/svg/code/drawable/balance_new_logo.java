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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.balance_new_logo */
public class balance_new_logo extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 40;
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
        C24542c.instancePaint(instancePaint3, looper).setStrokeWidth(1.0f);
        canvas.save();
        Paint paint = instancePaint;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.333333f, 0.0f, 1.0f, 3.333333f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        instancePaint4.setColor(-15616);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(16.666666f, 33.333332f);
        Path path = instancePath;
        path.cubicTo(7.4619207f, 33.333332f, 0.0f, 25.871412f, 0.0f, 16.666666f);
        path.cubicTo(0.0f, 7.4619207f, 7.4619207f, 0.0f, 16.666666f, 0.0f);
        path.cubicTo(25.871412f, 0.0f, 33.333332f, 7.4619207f, 33.333332f, 16.666666f);
        path.cubicTo(33.333332f, 25.871412f, 25.871412f, 33.333332f, 16.666666f, 33.333332f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        instancePaint5.setColor(-1);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(17.333323f, 15.333354f);
        instancePath2.lineTo(20.0f, 10.0f);
        instancePath2.lineTo(22.5f, 10.0f);
        instancePath2.lineTo(19.833323f, 15.333354f);
        instancePath2.lineTo(22.5f, 15.333354f);
        instancePath2.lineTo(22.5f, 17.333353f);
        instancePath2.lineTo(17.666708f, 17.333353f);
        instancePath2.lineTo(17.666708f, 19.166666f);
        instancePath2.lineTo(22.5f, 19.166666f);
        instancePath2.lineTo(22.5f, 21.166666f);
        instancePath2.lineTo(17.666708f, 21.166666f);
        instancePath2.lineTo(17.666708f, 24.166666f);
        instancePath2.lineTo(15.666707f, 24.166666f);
        instancePath2.lineTo(15.666707f, 21.166666f);
        instancePath2.lineTo(10.833333f, 21.166666f);
        instancePath2.lineTo(10.833333f, 19.166666f);
        instancePath2.lineTo(15.666707f, 19.166666f);
        instancePath2.lineTo(15.666707f, 17.333353f);
        instancePath2.lineTo(10.833333f, 17.333353f);
        instancePath2.lineTo(10.833333f, 15.333354f);
        instancePath2.lineTo(13.5000105f, 15.333354f);
        instancePath2.lineTo(10.833333f, 10.0f);
        instancePath2.lineTo(13.333333f, 10.0f);
        instancePath2.lineTo(16.00001f, 15.333354f);
        instancePath2.lineTo(17.333323f, 15.333354f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        instancePaint6.setColor(-1);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(0.0f, 0.0f);
        instancePath3.lineTo(40.0f, 0.0f);
        instancePath3.lineTo(40.0f, 40.0f);
        instancePath3.lineTo(0.0f, 40.0f);
        instancePath3.lineTo(0.0f, 0.0f);
        instancePath3.close();
        canvas.saveLayerAlpha((RectF) null, 0, 31);
        canvas.drawPath(instancePath3, C24542c.instancePaint(instancePaint6, looper));
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
