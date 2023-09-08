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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.more_remind_icon_normal */
public class more_remind_icon_normal extends C24542c {
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
        Paint paint = instancePaint4;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.saveLayerAlpha((RectF) null, 204, 31);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(30.0f, 56.4f);
        Path path = instancePath2;
        path.cubicTo(44.58032f, 56.4f, 56.4f, 44.58032f, 56.4f, 30.0f);
        path.cubicTo(56.4f, 15.4196825f, 44.58032f, 3.6f, 30.0f, 3.6f);
        path.cubicTo(15.4196825f, 3.6f, 3.6f, 15.4196825f, 3.6f, 30.0f);
        path.cubicTo(3.6f, 44.58032f, 15.4196825f, 56.4f, 30.0f, 56.4f);
        instancePath2.close();
        instancePath2.moveTo(30.0f, 60.0f);
        Path path2 = instancePath2;
        path2.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
        path2.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
        path2.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
        path2.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(paint, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(28.199999f, 12.0f);
        instancePath3.lineTo(31.8f, 12.0f);
        instancePath3.lineTo(31.8f, 30.0f);
        instancePath3.lineTo(28.199999f, 30.0f);
        instancePath3.lineTo(28.199999f, 12.0f);
        instancePath3.close();
        canvas.drawPath(instancePath3, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(paint, looper);
        float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 0.70710677f, -0.70710677f, 35.309544f, -0.70710677f, -0.70710677f, 85.24478f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray3);
        canvas.concat(instanceMatrix);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(34.03675f, 26.09117f);
        instancePath4.lineTo(37.63675f, 26.09117f);
        instancePath4.lineTo(37.63675f, 44.09117f);
        instancePath4.lineTo(34.03675f, 44.09117f);
        instancePath4.lineTo(34.03675f, 26.09117f);
        instancePath4.close();
        canvas.drawPath(instancePath4, instancePaint7);
        canvas.restore();
        canvas.restore();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
