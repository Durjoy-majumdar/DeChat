package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.ipcall_contacts_icon */
public class ipcall_contacts_icon extends C24542c {
    private final int height = 75;
    private final int width = 75;

    public int doCommand(int i, Object... objArr) {
        int i2 = 75;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
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
                instancePaint3.setColor(-15028967);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(4.0f, 60.0f);
                instancePath.lineTo(4.0f, 71.990364f);
                instancePath.cubicTo(4.0f, 73.65254f, 5.348283f, 75.0f, 7.0073853f, 75.0f);
                instancePath.lineTo(66.992615f, 75.0f);
                instancePath.cubicTo(68.65355f, 75.0f, 70.0f, 73.666405f, 70.0f, 71.990364f);
                instancePath.lineTo(70.0f, 3.0096345f);
                instancePath.cubicTo(70.0f, 1.3474593f, 68.65172f, 0.0f, 66.992615f, 0.0f);
                instancePath.lineTo(7.0073853f, 0.0f);
                Path path = instancePath;
                path.cubicTo(5.346452f, 0.0f, 4.0f, 1.3335965f, 4.0f, 3.0096345f);
                instancePath.lineTo(4.0f, 15.0f);
                path.cubicTo(6.4852815f, 15.0f, 8.5f, 17.014719f, 8.5f, 19.5f);
                path.cubicTo(8.5f, 21.985281f, 6.4852815f, 24.0f, 4.0f, 24.0f);
                instancePath.lineTo(4.0f, 51.0f);
                path.cubicTo(6.4852815f, 51.0f, 8.5f, 53.014717f, 8.5f, 55.5f);
                path.cubicTo(8.5f, 57.985283f, 6.4852815f, 60.0f, 4.0f, 60.0f);
                instancePath.close();
                instancePath.moveTo(35.16073f, 42.33927f);
                path.cubicTo(31.262531f, 38.441074f, 29.43414f, 34.747486f, 29.54121f, 33.381584f);
                path.cubicTo(29.648281f, 32.01568f, 31.987486f, 28.614197f, 31.95635f, 27.008419f);
                path.cubicTo(31.941387f, 26.23667f, 28.530704f, 21.19352f, 28.136374f, 20.583046f);
                path.cubicTo(27.742043f, 19.972572f, 27.281416f, 19.406528f, 26.698536f, 19.512964f);
                path.cubicTo(26.115658f, 19.6194f, 19.69526f, 21.835806f, 20.584337f, 27.494286f);
                path.cubicTo(21.473415f, 33.152767f, 27.573353f, 41.04148f, 31.963337f, 45.536663f);
                instancePath.lineTo(35.16073f, 42.33927f);
                instancePath.close();
                instancePath.moveTo(35.16073f, 42.33927f);
                path.cubicTo(39.058926f, 46.23747f, 42.752514f, 48.06586f, 44.118416f, 47.95879f);
                path.cubicTo(45.48432f, 47.85172f, 48.885803f, 45.512516f, 50.49158f, 45.54365f);
                path.cubicTo(51.263332f, 45.558613f, 56.30648f, 48.969296f, 56.916954f, 49.363625f);
                path.cubicTo(57.527428f, 49.757957f, 58.09347f, 50.218586f, 57.987034f, 50.801464f);
                path.cubicTo(57.8806f, 51.384342f, 55.664196f, 57.80474f, 50.005714f, 56.915665f);
                path.cubicTo(44.347233f, 56.026585f, 36.45852f, 49.926647f, 31.963337f, 45.536663f);
                instancePath.lineTo(35.16073f, 42.33927f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
