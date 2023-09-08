package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_self_feed_like_arrow */
public class finder_self_feed_like_arrow extends C24542c {
    private final int height = 24;
    private final int width = 24;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 24;
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
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 1.2246469E-16f, 19.0f, -1.2246469E-16f, -1.0f, 17.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(13.0f, 4.25f);
        instancePath.lineTo(13.0f, 5.75f);
        instancePath.lineTo(2.8711069f, 5.749359f);
        instancePath.lineTo(5.303301f, 8.18198f);
        instancePath.lineTo(4.2426405f, 9.2426405f);
        instancePath.lineTo(0.35355338f, 5.3535533f);
        instancePath.cubicTo(0.15829125f, 5.1582913f, 0.15829125f, 4.8417087f, 0.35355338f, 4.6464467f);
        instancePath.lineTo(1.0606601f, 3.9393399f);
        instancePath.lineTo(1.0611068f, 3.9393594f);
        instancePath.lineTo(4.2426405f, 0.7573593f);
        instancePath.lineTo(5.303301f, 1.8180195f);
        instancePath.lineTo(2.8711069f, 4.249359f);
        instancePath.lineTo(13.0f, 4.25f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
