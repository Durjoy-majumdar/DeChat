package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ipcall_mini_action */
public class ipcall_mini_action extends C24542c {
    private final int height = 96;
    private final int width = 96;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 96;
        }
        if (i2 != 2) {
            return 0;
        }
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
        instancePaint3.setColor(-13026753);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(47.9983f, 37.61686f);
        instancePath.cubicTo(47.74289f, 37.61725f, 47.48804f, 37.71553f, 47.293037f, 37.910534f);
        instancePath.lineTo(32.00577f, 53.1978f);
        instancePath.cubicTo(31.617527f, 53.58605f, 31.61592f, 54.22187f, 32.007095f, 54.613045f);
        instancePath.lineTo(34.765827f, 57.371777f);
        instancePath.cubicTo(35.160282f, 57.76623f, 35.790627f, 57.763542f, 36.18107f, 57.373096f);
        instancePath.lineTo(48.0f, 45.55417f);
        instancePath.lineTo(59.81893f, 57.373096f);
        instancePath.cubicTo(60.207176f, 57.761345f, 60.843f, 57.76295f, 61.234173f, 57.371777f);
        instancePath.lineTo(63.992905f, 54.613045f);
        instancePath.cubicTo(64.38736f, 54.218586f, 64.384674f, 53.588245f, 63.99423f, 53.1978f);
        instancePath.lineTo(48.706963f, 37.910534f);
        Path path = instancePath;
        path.cubicTo(48.513058f, 37.71663f, 48.257397f, 37.619167f, 48.0013f, 37.61891f);
        instancePath.close();
        instancePath.moveTo(17.0f, 20.996428f);
        path.cubicTo(17.0f, 18.78926f, 18.788675f, 17.0f, 20.996428f, 17.0f);
        instancePath.lineTo(75.00357f, 17.0f);
        path.cubicTo(77.21074f, 17.0f, 79.0f, 18.788675f, 79.0f, 20.996428f);
        instancePath.lineTo(79.0f, 75.00357f);
        path.cubicTo(79.0f, 77.21074f, 77.21133f, 79.0f, 75.00357f, 79.0f);
        instancePath.lineTo(20.996428f, 79.0f);
        path.cubicTo(18.78926f, 79.0f, 17.0f, 77.21133f, 17.0f, 75.00357f);
        instancePath.lineTo(17.0f, 20.996428f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
