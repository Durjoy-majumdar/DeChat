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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.more_more_icon_disable */
public class more_more_icon_disable extends C24542c {
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
        instancePaint4.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 51, 31);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(20.25f, 36.0f);
        Path path = instancePath2;
        path.cubicTo(20.25f, 38.89905f, 17.89905f, 41.25f, 15.0f, 41.25f);
        path.cubicTo(12.10095f, 41.25f, 9.75f, 38.89905f, 9.75f, 36.0f);
        path.cubicTo(9.75f, 33.0999f, 12.10095f, 30.75f, 15.0f, 30.75f);
        path.cubicTo(17.89905f, 30.75f, 20.25f, 33.0999f, 20.25f, 36.0f);
        instancePath2.close();
        instancePath2.moveTo(36.0f, 30.75f);
        path.cubicTo(38.89905f, 30.75f, 41.25f, 33.0999f, 41.25f, 36.0f);
        path.cubicTo(41.25f, 38.89905f, 38.89905f, 41.25f, 36.0f, 41.25f);
        path.cubicTo(33.10095f, 41.25f, 30.75f, 38.89905f, 30.75f, 36.0f);
        path.cubicTo(30.75f, 33.0999f, 33.10095f, 30.75f, 36.0f, 30.75f);
        instancePath2.close();
        instancePath2.moveTo(57.0f, 30.75f);
        Path path2 = instancePath2;
        path2.cubicTo(59.89905f, 30.75f, 62.25f, 33.0999f, 62.25f, 36.0f);
        path2.cubicTo(62.25f, 38.89905f, 59.89905f, 41.25f, 57.0f, 41.25f);
        path2.cubicTo(54.10095f, 41.25f, 51.75f, 38.89905f, 51.75f, 36.0f);
        path2.cubicTo(51.75f, 33.0999f, 54.10095f, 30.75f, 57.0f, 30.75f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
