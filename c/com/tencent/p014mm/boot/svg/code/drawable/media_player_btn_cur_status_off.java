package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.media_player_btn_cur_status_off */
public class media_player_btn_cur_status_off extends C24542c {
    private final int height = 32;
    private final int width = 32;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 32;
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
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(0.0f, 0.0f);
                instancePath.lineTo(32.0f, 0.0f);
                instancePath.lineTo(32.0f, 32.0f);
                instancePath.lineTo(0.0f, 32.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-1);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.8369701E-16f, -1.0f, 33.0f, 1.0f, -1.8369701E-16f, -1.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(17.83205f, 11.2480755f);
                instancePath2.lineTo(23.963533f, 20.4453f);
                Path path = instancePath2;
                path.cubicTo(24.269886f, 20.904829f, 24.145712f, 21.525698f, 23.686184f, 21.83205f);
                path.cubicTo(23.521915f, 21.941563f, 23.328907f, 22.0f, 23.131483f, 22.0f);
                instancePath2.lineTo(10.868517f, 22.0f);
                Path path2 = instancePath2;
                path2.cubicTo(10.316233f, 22.0f, 9.868517f, 21.552284f, 9.868517f, 21.0f);
                path2.cubicTo(9.868517f, 20.802574f, 9.926955f, 20.609568f, 10.036467f, 20.4453f);
                instancePath2.lineTo(16.16795f, 11.2480755f);
                path2.cubicTo(16.474302f, 10.788547f, 17.095171f, 10.664372f, 17.5547f, 10.970725f);
                path2.cubicTo(17.664553f, 11.043961f, 17.758816f, 11.138224f, 17.83205f, 11.2480755f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
