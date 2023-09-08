package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_comment_writeicon_normal */
public class friendactivity_comment_writeicon_normal extends C24542c {
    private final int height = 54;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 60;
        }
        if (i2 == 1) {
            return 54;
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
            instancePaint3.setColor(-1);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 3.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(1.0513232f, 4.9491887f);
            Path path = instancePath;
            path.cubicTo(0.73179597f, 3.1712198f, 1.9300232f, 0.9937079f, 3.9270685f, 1.1035824f);
            path.cubicTo(19.633831f, 0.9837193f, 35.35058f, 1.0836052f, 51.05734f, 1.0536394f);
            path.cubicTo(52.844696f, 0.724016f, 54.961563f, 1.9426237f, 54.901653f, 3.9103754f);
            path.cubicTo(55.041443f, 14.298506f, 54.931606f, 24.696625f, 54.951576f, 35.084755f);
            path.cubicTo(55.26112f, 36.872715f, 54.062893f, 39.09018f, 52.035892f, 38.960327f);
            path.cubicTo(42.370193f, 39.080193f, 32.694508f, 38.970318f, 23.028807f, 39.010273f);
            path.cubicTo(18.685234f, 41.99686f, 14.36163f, 45.003426f, 10.028042f, 48.0f);
            instancePath.lineTo(10.028042f, 39.010273f);
            Path path2 = instancePath;
            path2.cubicTo(7.152297f, 38.59075f, 2.8187084f, 40.328766f, 1.2011017f, 37.05251f);
            path2.cubicTo(0.83164823f, 26.36472f, 1.1312051f, 15.646965f, 1.0513232f, 4.9491887f);
            instancePath.lineTo(1.0513232f, 4.9491887f);
            instancePath.close();
            instancePath.moveTo(7.0f, 7.0f);
            instancePath.lineTo(7.0f, 33.0f);
            instancePath.lineTo(15.0f, 33.0f);
            instancePath.lineTo(15.0f, 38.0f);
            Path path3 = instancePath;
            path3.cubicTo(17.34f, 36.33f, 19.68f, 34.66f, 22.02f, 32.99f);
            path3.cubicTo(31.01f, 33.01f, 40.01f, 33.0f, 49.0f, 33.0f);
            instancePath.lineTo(49.0f, 7.0f);
            instancePath.lineTo(7.0f, 7.0f);
            instancePath.lineTo(7.0f, 7.0f);
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
