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

/* renamed from: com.tencent.mm.boot.svg.code.drawable.mmsight_camera_preview_icon_back */
public class mmsight_camera_preview_icon_back extends C24542c {
    private final int height = 240;
    private final int width = 240;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 240;
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
                canvas.saveLayerAlpha((RectF) null, 204, 31);
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                canvas.save();
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 83.0f, 0.0f, 1.0f, 91.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(32.8514f, 18.0f);
                instancePath.lineTo(15.0f, 18.0f);
                instancePath.lineTo(15.0f, 30.0f);
                instancePath.lineTo(0.0f, 15.0f);
                instancePath.lineTo(15.0f, 0.0f);
                instancePath.lineTo(15.0f, 12.0f);
                instancePath.lineTo(52.5f, 12.0f);
                Path path = instancePath;
                path.cubicTo(64.92641f, 12.0f, 75.0f, 22.073593f, 75.0f, 34.5f);
                path.cubicTo(75.0f, 46.926407f, 64.92641f, 57.0f, 52.5f, 57.0f);
                instancePath.lineTo(28.0f, 57.0f);
                instancePath.lineTo(28.0f, 51.0f);
                instancePath.lineTo(28.5f, 51.0f);
                instancePath.lineTo(32.8514f, 51.0f);
                instancePath.lineTo(37.202793f, 51.0f);
                instancePath.lineTo(52.5f, 51.0f);
                Path path2 = instancePath;
                path2.cubicTo(61.612698f, 51.0f, 69.0f, 43.612698f, 69.0f, 34.5f);
                path2.cubicTo(69.0f, 25.387302f, 61.612698f, 18.0f, 52.5f, 18.0f);
                instancePath.lineTo(32.8514f, 18.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
