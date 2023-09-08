package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.friendactivity_comment_likeicon_normal */
public class friendactivity_comment_likeicon_normal extends C24542c {
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(6.1010113f, 2.057324f);
            Path path = instancePath;
            path.cubicTo(12.419818f, -2.0276875f, 21.226343f, 0.35939744f, 26.002764f, 5.80275f);
            path.cubicTo(29.913458f, 1.4081168f, 36.07305f, -0.88907796f, 41.88436f, 0.33942184f);
            path.cubicTo(46.15329f, 1.198373f, 49.516685f, 4.71408f, 50.899857f, 8.769128f);
            path.cubicTo(52.929836f, 14.562054f, 52.034256f, 21.104065f, 49.168404f, 26.457527f);
            path.cubicTo(44.093456f, 36.205624f, 35.60536f, 43.86627f, 26.002764f, 49.0f);
            path.cubicTo(15.315523f, 43.22705f, 5.722878f, 34.327915f, 1.2648852f, 22.801992f);
            path.cubicTo(-1.1929812f, 15.840492f, -0.31730413f, 6.591787f, 6.1010113f, 2.057324f);
            instancePath.lineTo(6.1010113f, 2.057324f);
            instancePath.lineTo(6.1010113f, 2.057324f);
            instancePath.close();
            instancePath.moveTo(6.614176f, 11.27121f);
            path.cubicTo(5.3116097f, 15.999485f, 6.10707f, 21.24757f, 8.751974f, 25.366068f);
            path.cubicTo(13.007686f, 32.263554f, 19.450912f, 37.44166f, 26.003513f, 42.0f);
            path.cubicTo(31.064629f, 38.52127f, 35.90699f, 34.642685f, 39.924065f, 29.96439f);
            path.cubicTo(43.255054f, 26.065813f, 46.138596f, 21.297552f, 45.979504f, 15.979492f);
            path.cubicTo(46.198254f, 12.1209f, 44.686882f, 7.2526755f, 40.441113f, 6.3430076f);
            path.cubicTo(34.624313f, 4.603642f, 30.24928f, 9.891713f, 26.003513f, 12.950597f);
            path.cubicTo(21.837292f, 9.991676f, 17.651184f, 4.8135653f, 11.963644f, 6.2630367f);
            path.cubicTo(9.358513f, 6.6728873f, 7.3300896f, 8.782118f, 6.614176f, 11.27121f);
            instancePath.lineTo(6.614176f, 11.27121f);
            instancePath.lineTo(6.614176f, 11.27121f);
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
