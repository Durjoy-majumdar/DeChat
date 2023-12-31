package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fav_delete_pressed */
public class fav_delete_pressed extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 24;
        if (!(i2 == 0 || i2 == 1)) {
            i3 = 0;
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
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 3.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(15.411764f, 4.5000024f);
                instancePath.lineTo(14.610739f, 18.117443f);
                instancePath.cubicTo(14.548554f, 19.17457f, 13.673142f, 20.0f, 12.61419f, 20.0f);
                instancePath.lineTo(5.3858104f, 20.0f);
                instancePath.cubicTo(4.3268576f, 20.0f, 3.4514453f, 19.17457f, 3.3892615f, 18.117443f);
                instancePath.lineTo(2.5882354f, 4.5000024f);
                instancePath.lineTo(0.5f, 4.5000024f);
                instancePath.lineTo(0.5f, 3.5f);
                instancePath.cubicTo(0.5f, 3.2238576f, 0.72385764f, 3.0f, 1.0f, 3.0f);
                instancePath.lineTo(17.0f, 3.0f);
                instancePath.cubicTo(17.276142f, 3.0f, 17.5f, 3.2238576f, 17.5f, 3.5f);
                instancePath.lineTo(17.5f, 4.5000024f);
                instancePath.lineTo(15.411764f, 4.5000024f);
                instancePath.close();
                instancePath.moveTo(7.0f, 0.5000341f);
                instancePath.lineTo(11.0f, 0.5000341f);
                instancePath.cubicTo(11.276142f, 0.5000341f, 11.5f, 0.72389174f, 11.5f, 1.0000341f);
                instancePath.lineTo(11.5f, 2.0f);
                instancePath.lineTo(6.5f, 2.0f);
                instancePath.lineTo(6.5f, 1.0000341f);
                instancePath.cubicTo(6.5f, 0.72389174f, 6.7238574f, 0.5000341f, 7.0f, 0.5000341f);
                instancePath.close();
                instancePath.moveTo(6.0f, 6.9999814f);
                instancePath.lineTo(6.5f, 15.999994f);
                instancePath.lineTo(8.0f, 15.999994f);
                instancePath.lineTo(7.6000004f, 6.9999814f);
                instancePath.lineTo(6.0f, 6.9999814f);
                instancePath.close();
                instancePath.moveTo(10.5f, 6.9999814f);
                instancePath.lineTo(10.0f, 15.999994f);
                instancePath.lineTo(11.5f, 15.999994f);
                instancePath.lineTo(12.0f, 6.9999814f);
                instancePath.lineTo(10.5f, 6.9999814f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
