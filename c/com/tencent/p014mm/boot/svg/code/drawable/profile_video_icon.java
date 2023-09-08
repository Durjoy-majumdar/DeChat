package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.profile_video_icon */
public class profile_video_icon extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
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
            instancePaint3.setColor(-15028967);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 6.0f, 0.0f, 1.0f, 12.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(3.6f, 8.1f);
            instancePath.lineTo(3.6f, 39.9f);
            instancePath.lineTo(41.4f, 39.9f);
            instancePath.lineTo(41.4f, 8.1f);
            instancePath.lineTo(3.6f, 8.1f);
            instancePath.close();
            instancePath.moveTo(3.0f, 4.5f);
            instancePath.lineTo(42.0f, 4.5f);
            instancePath.cubicTo(43.656853f, 4.5f, 45.0f, 5.843146f, 45.0f, 7.5f);
            instancePath.lineTo(45.0f, 40.5f);
            instancePath.cubicTo(45.0f, 42.156853f, 43.656853f, 43.5f, 42.0f, 43.5f);
            instancePath.lineTo(3.0f, 43.5f);
            instancePath.cubicTo(1.3431457f, 43.5f, 0.0f, 42.156853f, 0.0f, 40.5f);
            instancePath.lineTo(0.0f, 7.5f);
            instancePath.cubicTo(0.0f, 5.843146f, 1.3431457f, 4.5f, 3.0f, 4.5f);
            instancePath.close();
            instancePath.moveTo(51.6f, 28.26975f);
            instancePath.lineTo(59.4f, 34.50975f);
            instancePath.lineTo(59.4f, 13.49025f);
            instancePath.lineTo(51.6f, 19.73025f);
            instancePath.lineTo(51.6f, 28.26975f);
            instancePath.close();
            instancePath.moveTo(48.0f, 18.0f);
            instancePath.lineTo(58.125916f, 9.899268f);
            Path path = instancePath;
            path.cubicTo(59.4197f, 8.86424f, 61.30758f, 9.074003f, 62.342606f, 10.367789f);
            path.cubicTo(62.768158f, 10.899729f, 63.0f, 11.56066f, 63.0f, 12.241875f);
            instancePath.lineTo(63.0f, 35.758125f);
            Path path2 = instancePath;
            path2.cubicTo(63.0f, 37.414978f, 61.656853f, 38.758125f, 60.0f, 38.758125f);
            path2.cubicTo(59.318787f, 38.758125f, 58.657852f, 38.526283f, 58.125916f, 38.10073f);
            instancePath.lineTo(48.0f, 30.0f);
            instancePath.lineTo(48.0f, 18.0f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
