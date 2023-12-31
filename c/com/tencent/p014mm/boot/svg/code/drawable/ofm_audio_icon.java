package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ofm_audio_icon */
public class ofm_audio_icon extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 96;
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
                instancePaint3.setColor(-1);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 20.0f, 0.0f, 1.0f, 19.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(2.253182f, 8.691923f);
                Path path = instancePath;
                path.cubicTo(4.7252164f, 5.0494986f, 8.263815f, 2.0657039f, 12.131352f, -3.5527137E-15f);
                path.cubicTo(14.832648f, 0.5189208f, 15.699854f, 3.8819268f, 17.404362f, 5.748046f);
                path.cubicTo(19.068998f, 8.801695f, 22.458078f, 11.346403f, 22.747147f, 14.8590975f);
                path.cubicTo(20.334919f, 17.693203f, 16.547125f, 18.850796f, 13.327498f, 20.52731f);
                path.cubicTo(15.231364f, 26.904047f, 19.736847f, 32.053337f, 24.511461f, 36.50408f);
                path.cubicTo(27.77096f, 39.537773f, 31.52885f, 42.09246f, 35.805073f, 43.459618f);
                path.cubicTo(37.50958f, 40.186424f, 38.596077f, 36.27456f, 41.466827f, 33.8496f);
                path.cubicTo(44.98549f, 34.27871f, 47.477463f, 37.71157f, 50.527634f, 39.43798f);
                path.cubicTo(52.331818f, 41.124474f, 55.501606f, 41.99267f, 56.0f, 44.63717f);
                path.cubicTo(54.056263f, 48.439262f, 51.23535f, 51.89208f, 47.84627f, 54.486683f);
                path.cubicTo(45.08517f, 56.67214f, 41.31731f, 56.213093f, 38.30701f, 54.855915f);
                path.cubicTo(22.009523f, 48.020134f, 8.732305f, 34.40844f, 2.1435351f, 18.00256f);
                path.cubicTo(0.9573573f, 15.048703f, 0.26957348f, 11.486113f, 2.253182f, 8.691923f);
                instancePath.lineTo(2.253182f, 8.691923f);
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
