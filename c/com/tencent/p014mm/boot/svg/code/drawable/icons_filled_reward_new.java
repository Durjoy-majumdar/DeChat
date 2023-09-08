package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_filled_reward_new */
public class icons_filled_reward_new extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(17.125824f, 22.215218f);
            Path path = instancePath;
            path.cubicTo(23.146244f, 22.99172f, 28.474106f, 24.881105f, 32.877087f, 27.526522f);
            path.cubicTo(30.966658f, 29.089598f, 29.277954f, 30.8048f, 27.835758f, 32.636482f);
            instancePath.lineTo(27.835758f, 32.636482f);
            instancePath.lineTo(30.664242f, 34.863518f);
            instancePath.lineTo(31.13953f, 34.276737f);
            Path path2 = instancePath;
            path2.cubicTo(32.52694f, 32.61116f, 34.15383f, 31.05592f, 36.001335f, 29.645966f);
            path2.cubicTo(38.059605f, 31.21876f, 39.848797f, 32.97498f, 41.33576f, 34.863518f);
            instancePath.lineTo(41.33576f, 34.863518f);
            instancePath.lineTo(44.16424f, 32.636482f);
            instancePath.lineTo(43.66493f, 32.01885f);
            Path path3 = instancePath;
            path3.cubicTo(42.336803f, 30.41835f, 40.81704f, 28.912622f, 39.12109f, 27.527876f);
            path3.cubicTo(43.51424f, 24.888115f, 48.825695f, 23.00168f, 54.826622f, 22.221376f);
            path3.cubicTo(60.30647f, 26.486378f, 63.604507f, 31.839163f, 64.53269f, 38.002533f);
            path3.cubicTo(64.66999f, 38.91423f, 64.75544f, 39.843662f, 64.788414f, 40.789936f);
            path3.cubicTo(64.80248f, 41.18679f, 64.80298f, 41.57904f, 64.789955f, 41.96661f);
            path3.cubicTo(64.79936f, 57.49941f, 51.60173f, 65.039925f, 36.06872f, 65.039925f);
            path3.cubicTo(20.691042f, 65.039925f, 7.4118032f, 57.649464f, 7.1477566f, 42.429993f);
            instancePath.lineTo(7.14375f, 41.9664f);
            Path path4 = instancePath;
            path4.cubicTo(7.140127f, 41.57904f, 7.1406283f, 41.18679f, 7.154694f, 40.789936f);
            path4.cubicTo(7.4070816f, 33.54789f, 10.732542f, 27.292068f, 16.856752f, 22.425255f);
            instancePath.close();
            instancePath.moveTo(36.32625f, 5.625f);
            Path path5 = instancePath;
            path5.cubicTo(39.95397f, 5.625f, 43.080387f, 7.7713532f, 44.50487f, 10.863438f);
            path5.cubicTo(45.42551f, 10.391221f, 46.46979f, 10.125f, 47.57625f, 10.125f);
            path5.cubicTo(51.304173f, 10.125f, 54.32625f, 13.147078f, 54.32625f, 16.875f);
            path5.cubicTo(54.32625f, 17.503834f, 54.24026f, 18.112585f, 54.0794f, 18.690134f);
            path5.cubicTo(47.119686f, 19.635084f, 40.987972f, 21.97058f, 36.002697f, 25.240389f);
            path5.cubicTo(31.106855f, 22.031912f, 25.108948f, 19.722368f, 18.309086f, 18.743448f);
            path5.cubicTo(18.136559f, 18.151379f, 18.045f, 17.523882f, 18.045f, 16.875f);
            path5.cubicTo(18.045f, 13.147078f, 21.067078f, 10.125f, 24.795f, 10.125f);
            path5.cubicTo(25.993025f, 10.125f, 27.118153f, 10.437107f, 28.09351f, 10.984447f);
            path5.cubicTo(29.49035f, 7.827913f, 32.651043f, 5.625f, 36.32625f, 5.625f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
