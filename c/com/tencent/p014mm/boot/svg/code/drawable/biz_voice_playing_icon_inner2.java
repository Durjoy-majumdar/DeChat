package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_voice_playing_icon_inner2 */
public class biz_voice_playing_icon_inner2 extends C24542c {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16268960);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -10.0f, 0.0f, 1.0f, -10.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(21.434671f, 15.5f);
                Path path = instancePath;
                path.cubicTo(23.081448f, 17.163496f, 24.1f, 19.461592f, 24.1f, 22.0f);
                path.cubicTo(24.1f, 24.538408f, 23.081448f, 26.836504f, 21.434671f, 28.5f);
                instancePath.lineTo(19.949747f, 27.0f);
                Path path2 = instancePath;
                path2.cubicTo(21.255392f, 25.681099f, 22.0f, 23.902777f, 22.0f, 22.0f);
                path2.cubicTo(22.0f, 20.097223f, 21.255392f, 18.318901f, 19.949747f, 17.0f);
                instancePath.lineTo(21.434671f, 15.5f);
                instancePath.close();
                instancePath.moveTo(17.969849f, 19.0f);
                Path path3 = instancePath;
                path3.cubicTo(18.729898f, 19.767767f, 19.2f, 20.828426f, 19.2f, 22.0f);
                path3.cubicTo(19.2f, 23.171574f, 18.729898f, 24.232233f, 17.969849f, 25.0f);
                instancePath.lineTo(17.969849f, 25.0f);
                instancePath.lineTo(15.0f, 22.0f);
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
