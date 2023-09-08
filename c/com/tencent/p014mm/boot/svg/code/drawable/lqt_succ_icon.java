package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.lqt_succ_icon */
public class lqt_succ_icon extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 60;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16139513);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -345.0f, 0.0f, 1.0f, -473.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 40.0f, 0.0f, 1.0f, 403.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray2);
                canvas.concat(instanceMatrix);
                canvas.save();
                float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 305.0f, 0.0f, 1.0f, 70.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray3);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(60.0f, 30.37037f);
                Path path = instancePath;
                path.cubicTo(60.0f, 46.56889f, 46.56889f, 60.0f, 29.62963f, 60.0f);
                path.cubicTo(13.431111f, 60.0f, 0.0f, 46.56889f, 0.0f, 30.37037f);
                path.cubicTo(0.0f, 13.431111f, 13.431111f, 0.0f, 29.62963f, 0.0f);
                path.cubicTo(46.56889f, 0.0f, 60.0f, 13.431111f, 60.0f, 30.37037f);
                instancePath.close();
                instancePath.moveTo(15.577749f, 32.460346f);
                instancePath.lineTo(24.47927f, 41.67298f);
                instancePath.cubicTo(24.862179f, 42.06927f, 25.488976f, 42.073776f, 25.882545f, 41.686443f);
                instancePath.lineTo(46.24788f, 21.643913f);
                instancePath.cubicTo(46.63556f, 21.26238f, 46.64444f, 20.630444f, 46.25456f, 20.2454f);
                instancePath.lineTo(45.93083f, 19.92568f);
                instancePath.cubicTo(45.543224f, 19.542885f, 44.883877f, 19.512583f, 44.46322f, 19.863024f);
                instancePath.lineTo(25.932226f, 35.30084f);
                instancePath.cubicTo(25.518642f, 35.64539f, 24.817387f, 35.66468f, 24.381721f, 35.33077f);
                instancePath.lineTo(17.411554f, 29.988533f);
                instancePath.cubicTo(16.979122f, 29.657099f, 16.359636f, 29.7419f, 16.035114f, 30.183472f);
                instancePath.lineTo(15.474698f, 30.946018f);
                instancePath.cubicTo(15.1507f, 31.386875f, 15.196312f, 32.06558f, 15.577749f, 32.460346f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
