package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_keyboard */
public class icons_outlined_keyboard extends C24542c {
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
        C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint paint = instancePaint3;
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(paint, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(30.0f, 60.0f);
        Path path = instancePath;
        path.cubicTo(13.4314575f, 60.0f, 0.0f, 46.568542f, 0.0f, 30.0f);
        path.cubicTo(0.0f, 13.4314575f, 13.4314575f, 0.0f, 30.0f, 0.0f);
        path.cubicTo(46.568542f, 0.0f, 60.0f, 13.4314575f, 60.0f, 30.0f);
        path.cubicTo(60.0f, 46.568542f, 46.568542f, 60.0f, 30.0f, 60.0f);
        instancePath.close();
        instancePath.moveTo(30.0f, 56.4f);
        Path path2 = instancePath;
        path2.cubicTo(44.58032f, 56.4f, 56.4f, 44.58032f, 56.4f, 30.0f);
        path2.cubicTo(56.4f, 15.4196825f, 44.58032f, 3.6f, 30.0f, 3.6f);
        path2.cubicTo(15.4196825f, 3.6f, 3.6f, 15.4196825f, 3.6f, 30.0f);
        path2.cubicTo(3.6f, 44.58032f, 15.4196825f, 56.4f, 30.0f, 56.4f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(paint, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(13.5f, 18.0f);
        instancePath2.lineTo(19.5f, 18.0f);
        instancePath2.lineTo(19.5f, 24.0f);
        instancePath2.lineTo(13.5f, 24.0f);
        instancePath2.lineTo(13.5f, 18.0f);
        instancePath2.close();
        instancePath2.moveTo(22.5f, 18.0f);
        instancePath2.lineTo(28.5f, 18.0f);
        instancePath2.lineTo(28.5f, 24.0f);
        instancePath2.lineTo(22.5f, 24.0f);
        instancePath2.lineTo(22.5f, 18.0f);
        instancePath2.close();
        instancePath2.moveTo(31.5f, 18.0f);
        instancePath2.lineTo(37.5f, 18.0f);
        instancePath2.lineTo(37.5f, 24.0f);
        instancePath2.lineTo(31.5f, 24.0f);
        instancePath2.lineTo(31.5f, 18.0f);
        instancePath2.close();
        instancePath2.moveTo(40.5f, 18.0f);
        instancePath2.lineTo(46.5f, 18.0f);
        instancePath2.lineTo(46.5f, 24.0f);
        instancePath2.lineTo(40.5f, 24.0f);
        instancePath2.lineTo(40.5f, 18.0f);
        instancePath2.close();
        instancePath2.moveTo(13.5f, 27.0f);
        instancePath2.lineTo(19.5f, 27.0f);
        instancePath2.lineTo(19.5f, 33.0f);
        instancePath2.lineTo(13.5f, 33.0f);
        instancePath2.lineTo(13.5f, 27.0f);
        instancePath2.close();
        instancePath2.moveTo(22.5f, 27.0f);
        instancePath2.lineTo(28.5f, 27.0f);
        instancePath2.lineTo(28.5f, 33.0f);
        instancePath2.lineTo(22.5f, 33.0f);
        instancePath2.lineTo(22.5f, 27.0f);
        instancePath2.close();
        instancePath2.moveTo(21.0f, 39.0f);
        instancePath2.lineTo(39.0f, 39.0f);
        instancePath2.lineTo(39.0f, 45.0f);
        instancePath2.lineTo(21.0f, 45.0f);
        instancePath2.lineTo(21.0f, 39.0f);
        instancePath2.close();
        instancePath2.moveTo(31.5f, 27.0f);
        instancePath2.lineTo(37.5f, 27.0f);
        instancePath2.lineTo(37.5f, 33.0f);
        instancePath2.lineTo(31.5f, 33.0f);
        instancePath2.lineTo(31.5f, 27.0f);
        instancePath2.close();
        instancePath2.moveTo(40.5f, 27.0f);
        instancePath2.lineTo(46.5f, 27.0f);
        instancePath2.lineTo(46.5f, 33.0f);
        instancePath2.lineTo(40.5f, 33.0f);
        instancePath2.lineTo(40.5f, 27.0f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
