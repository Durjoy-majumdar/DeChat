package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_filled_voice_call */
public class icon_filled_voice_call extends C24542c {
    private final int height = 40;
    private final int width = 40;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 40;
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
                instancePath.lineTo(40.0f, 0.0f);
                instancePath.lineTo(40.0f, 40.0f);
                instancePath.lineTo(0.0f, 40.0f);
                instancePath.lineTo(0.0f, 0.0f);
                instancePath.close();
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-16777216);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.166667f, 0.0f, 1.0f, 5.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(24.31072f, 21.053984f);
                Path path = instancePath2;
                path.cubicTo(23.98513f, 20.951157f, 23.849468f, 21.002571f, 23.55101f, 21.156813f);
                path.cubicTo(22.574242f, 21.670952f, 20.18658f, 22.904884f, 18.77569f, 23.598972f);
                path.cubicTo(18.422968f, 23.778921f, 18.043114f, 23.881748f, 17.608994f, 23.881748f);
                path.cubicTo(17.147741f, 23.881748f, 16.740753f, 23.753214f, 16.388031f, 23.547558f);
                path.cubicTo(14.407358f, 22.44216f, 12.535215f, 21.156813f, 10.934398f, 19.614395f);
                path.cubicTo(9.33358f, 18.097687f, 7.9769554f, 16.323908f, 6.810258f, 14.447301f);
                path.cubicTo(6.593198f, 14.113111f, 6.4575353f, 13.701799f, 6.4575353f, 13.290488f);
                path.cubicTo(6.4575353f, 12.904884f, 6.5660653f, 12.51928f, 6.755993f, 12.18509f);
                path.cubicTo(7.48857f, 10.822622f, 8.790931f, 8.560411f, 9.33358f, 7.6606684f);
                path.cubicTo(9.496375f, 7.377892f, 9.55064f, 7.2236505f, 9.44211f, 6.940874f);
                instancePath2.lineTo(7.1358476f, 1.1311054f);
                Path path2 = instancePath2;
                path2.cubicTo(6.8373904f, 0.46272492f, 6.1590776f, 0.025706941f, 5.345103f, 0.0f);
                path2.cubicTo(5.0195127f, 0.0f, 4.6396575f, 0.1285347f, 4.55826f, 0.15424165f);
                path2.cubicTo(1.8992751f, 1.0796915f, 0.0f, 3.470437f, 0.0f, 6.2982006f);
                path2.cubicTo(0.0f, 7.0951157f, 0.21706f, 7.840617f, 0.24419251f, 8.020566f);
                path2.cubicTo(1.5465525f, 13.4190235f, 4.44973f, 18.226221f, 8.438208f, 22.005142f);
                path2.cubicTo(12.426685f, 25.784061f, 17.500463f, 28.534704f, 23.198288f, 29.768637f);
                path2.cubicTo(23.388216f, 29.820051f, 24.175058f, 30.0f, 25.016167f, 30.0f);
                path2.cubicTo(28.00074f, 30.0f, 30.524063f, 28.200514f, 31.500834f, 25.681234f);
                path2.cubicTo(31.527966f, 25.604113f, 31.690762f, 25.244215f, 31.663628f, 24.935732f);
                path2.cubicTo(31.609364f, 24.164524f, 31.148111f, 23.52185f, 30.442665f, 23.239075f);
                instancePath2.lineTo(24.31072f, 21.053984f);
                instancePath2.close();
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
