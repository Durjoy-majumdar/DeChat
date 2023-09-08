package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.chatting_fast_entrance_video */
public class chatting_fast_entrance_video extends C24542c {
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
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 14.0f, 0.0f, 1.0f, 27.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(2.388248f, 1.4991292f);
                Path path = instancePath;
                path.cubicTo(3.7864833f, 0.7005225f, 5.52429f, 1.1497388f, 7.062349f, 1.0f);
                path.cubicTo(20.05595f, 1.0798607f, 33.04955f, 0.9301219f, 46.04315f, 1.0698781f);
                path.cubicTo(48.050617f, 0.9401045f, 49.239117f, 3.1362731f, 48.959473f, 4.913173f);
                path.cubicTo(48.959473f, 15.664417f, 48.96946f, 26.41566f, 48.949482f, 37.15692f);
                path.cubicTo(49.22913f, 38.903873f, 48.000683f, 41.020184f, 46.063126f, 40.90039f);
                path.cubicTo(32.36042f, 41.020184f, 18.647728f, 40.920357f, 4.945021f, 40.950302f);
                path.cubicTo(3.1672647f, 41.259766f, 0.98002523f, 40.101784f, 1.0798992f, 38.095284f);
                path.cubicTo(0.9300882f, 27.403936f, 1.0798992f, 16.702606f, 1.0f, 6.001275f);
                path.cubicTo(1.049937f, 4.434009f, 0.7902647f, 2.4275095f, 2.388248f, 1.4991292f);
                instancePath.lineTo(2.388248f, 1.4991292f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(52.016293f, 14.441051f);
                Path path2 = instancePath2;
                path2.cubicTo(57.033634f, 10.007826f, 61.711834f, 5.170664f, 66.958595f, 1.0f);
                path2.cubicTo(68.434875f, 3.0297904f, 67.87628f, 5.604898f, 67.97603f, 7.9477406f);
                path2.cubicTo(67.84636f, 18.36935f, 68.1855f, 28.821257f, 67.81644f, 39.23277f);
                path2.cubicTo(67.596985f, 39.667004f, 67.1581f, 40.555668f, 66.93865f, 41.0f);
                path2.cubicTo(61.711834f, 36.87983f, 57.12341f, 32.002274f, 52.066166f, 27.670033f);
                path2.cubicTo(51.956444f, 23.257006f, 52.016293f, 18.854076f, 52.016293f, 14.441051f);
                instancePath2.lineTo(52.016293f, 14.441051f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
