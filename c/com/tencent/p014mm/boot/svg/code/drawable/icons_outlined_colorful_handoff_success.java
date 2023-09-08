package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_colorful_handoff_success */
public class icons_outlined_colorful_handoff_success extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
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
            instancePaint3.setColor(-1184275);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 9.0f, 0.0f, 1.0f, 9.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(52.21949f, 61.344994f);
            instancePath.lineTo(56.907486f, 74.229965f);
            Path path = instancePath;
            path.cubicTo(57.357132f, 75.466484f, 56.719242f, 76.8334f, 55.48272f, 77.283035f);
            path.cubicTo(55.221767f, 77.37793f, 54.946236f, 77.42647f, 54.668568f, 77.42647f);
            instancePath.lineTo(25.735844f, 77.42647f);
            Path path2 = instancePath;
            path2.cubicTo(24.420107f, 77.42647f, 23.35349f, 76.359856f, 23.35349f, 75.04412f);
            path2.cubicTo(23.35349f, 74.76645f, 23.402033f, 74.49091f, 23.496925f, 74.229965f);
            instancePath.lineTo(28.18049f, 61.344994f);
            instancePath.lineTo(52.21949f, 61.344994f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(76.23529f, 0.0f);
            instancePath2.cubicTo(78.537834f, 0.0f, 80.40441f, 1.8665775f, 80.40441f, 4.1691175f);
            instancePath2.lineTo(80.40441f, 52.411766f);
            instancePath2.cubicTo(80.40441f, 54.714306f, 78.537834f, 56.580883f, 76.23529f, 56.580883f);
            instancePath2.lineTo(4.1691175f, 56.580883f);
            Path path3 = instancePath2;
            path3.cubicTo(1.8665775f, 56.580883f, 0.0f, 54.714306f, 0.0f, 52.411766f);
            instancePath2.lineTo(0.0f, 4.1691175f);
            path3.cubicTo(0.0f, 1.8665775f, 1.8665775f, 0.0f, 4.1691175f, 0.0f);
            instancePath2.lineTo(76.23529f, 0.0f);
            instancePath2.close();
            instancePath2.moveTo(52.69254f, 17.867647f);
            instancePath2.lineTo(37.491932f, 33.456367f);
            instancePath2.lineTo(30.730364f, 26.289095f);
            instancePath2.lineTo(28.290442f, 28.860275f);
            instancePath2.lineTo(35.253075f, 36.242847f);
            instancePath2.lineTo(35.525486f, 36.50045f);
            instancePath2.cubicTo(36.751408f, 37.532043f, 38.53785f, 37.46258f, 39.689095f, 36.281616f);
            instancePath2.lineTo(39.689095f, 36.281616f);
            instancePath2.lineTo(55.09191f, 20.481117f);
            instancePath2.lineTo(52.69254f, 17.867647f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
