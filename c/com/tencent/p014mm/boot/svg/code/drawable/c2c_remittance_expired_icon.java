package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.c2c_remittance_expired_icon */
public class c2c_remittance_expired_icon extends C24542c {
    private final int height = 120;
    private final int width = 120;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 120;
        }
        if (i == 2) {
            Canvas canvas = objArr[0];
            Looper looper = objArr[1];
            C24542c.instanceMatrix(looper);
            C24542c.instanceMatrixArray(looper);
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-1);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(60.0f, 0.0f);
            Path path = instancePath;
            path.cubicTo(93.137085f, 0.0f, 120.0f, 26.862915f, 120.0f, 60.0f);
            path.cubicTo(120.0f, 93.137085f, 93.137085f, 120.0f, 60.0f, 120.0f);
            path.cubicTo(26.862915f, 120.0f, 0.0f, 93.137085f, 0.0f, 60.0f);
            path.cubicTo(0.0f, 26.862915f, 26.862915f, 0.0f, 60.0f, 0.0f);
            instancePath.close();
            instancePath.moveTo(60.0f, 7.2f);
            Path path2 = instancePath;
            path2.cubicTo(30.839365f, 7.2f, 7.2f, 30.839365f, 7.2f, 60.0f);
            path2.cubicTo(7.2f, 89.16064f, 30.839365f, 112.8f, 60.0f, 112.8f);
            path2.cubicTo(89.16064f, 112.8f, 112.8f, 89.16064f, 112.8f, 60.0f);
            path2.cubicTo(112.8f, 30.839365f, 89.16064f, 7.2f, 60.0f, 7.2f);
            instancePath.close();
            instancePath.moveTo(60.0f, 80.41992f);
            Path path3 = instancePath;
            path3.cubicTo(62.856445f, 80.41992f, 65.009766f, 82.57324f, 65.009766f, 85.42969f);
            path3.cubicTo(65.009766f, 88.24219f, 62.856445f, 90.43945f, 60.0f, 90.43945f);
            path3.cubicTo(57.1875f, 90.43945f, 54.990234f, 88.24219f, 54.990234f, 85.42969f);
            path3.cubicTo(54.990234f, 82.57324f, 57.1875f, 80.41992f, 60.0f, 80.41992f);
            instancePath.close();
            instancePath.moveTo(63.95508f, 26.586914f);
            instancePath.lineTo(63.427734f, 68.950195f);
            instancePath.lineTo(56.572266f, 68.950195f);
            instancePath.lineTo(56.04492f, 26.586914f);
            instancePath.lineTo(63.95508f, 26.586914f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
