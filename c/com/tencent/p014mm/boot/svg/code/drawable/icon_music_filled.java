package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_music_filled */
public class icon_music_filled extends C24542c {
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
            instancePaint3.setColor(-16777216);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 5.142856f, 0.0f, 1.0f, 5.142857f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(61.69409f, 6.827963f);
            instancePath.cubicTo(61.712543f, 6.9193f, 61.71779f, 7.012813f, 61.709667f, 7.1056404f);
            instancePath.lineTo(58.091946f, 48.456367f);
            Path path = instancePath;
            path.cubicTo(57.64397f, 53.57676f, 53.055096f, 57.357956f, 47.84241f, 56.901905f);
            path.cubicTo(42.629723f, 56.445854f, 38.767162f, 51.92525f, 39.215137f, 46.80486f);
            path.cubicTo(39.647667f, 41.861034f, 43.940437f, 38.165634f, 48.927803f, 38.32714f);
            instancePath.lineTo(49.464676f, 38.35932f);
            instancePath.cubicTo(50.507214f, 38.45053f, 51.424988f, 37.694294f, 51.514584f, 36.670216f);
            instancePath.lineTo(53.264133f, 16.642803f);
            instancePath.lineTo(30.029799f, 21.33465f);
            instancePath.lineTo(27.240149f, 53.230988f);
            instancePath.cubicTo(26.80762f, 58.174816f, 22.514849f, 61.870213f, 17.527485f, 61.70871f);
            instancePath.lineTo(16.990612f, 61.676525f);
            Path path2 = instancePath;
            path2.cubicTo(11.777925f, 61.220474f, 7.9153643f, 56.699875f, 8.36334f, 51.579483f);
            path2.cubicTo(8.795869f, 46.635654f, 13.08864f, 42.940258f, 18.076004f, 43.101765f);
            instancePath.lineTo(18.612877f, 43.133945f);
            instancePath.cubicTo(19.655415f, 43.225155f, 20.573189f, 42.468914f, 20.662785f, 41.444836f);
            instancePath.lineTo(23.032713f, 14.356426f);
            instancePath.cubicTo(23.070347f, 13.926273f, 23.386753f, 13.57227f, 23.810001f, 13.486778f);
            instancePath.lineTo(60.54677f, 6.066248f);
            instancePath.cubicTo(61.073936f, 5.9597645f, 61.58761f, 6.3007956f, 61.69409f, 6.827963f);
            instancePath.close();
            instancePath.moveTo(16.040018f, 3.5527137E-15f);
            instancePath.lineTo(16.580793f, 5.5587f);
            instancePath.lineTo(11.297617f, 6.0520697f);
            instancePath.lineTo(13.182926f, 19.20854f);
            instancePath.lineTo(13.165432f, 19.208094f);
            instancePath.lineTo(13.200538f, 19.399965f);
            instancePath.cubicTo(13.684814f, 22.78477f, 11.428269f, 25.92709f, 8.0915575f, 26.662182f);
            instancePath.lineTo(7.5559735f, 26.757929f);
            Path path3 = instancePath;
            path3.cubicTo(3.9288013f, 27.258669f, 0.5751502f, 24.776257f, 0.06536437f, 21.213308f);
            path3.cubicTo(-0.44438148f, 17.650354f, 2.0827758f, 14.356082f, 5.709948f, 13.855342f);
            path3.cubicTo(6.0415754f, 13.80956f, 6.3709164f, 13.788714f, 6.696006f, 13.791352f);
            instancePath.lineTo(5.192618f, 2.9631145f);
            instancePath.cubicTo(5.067029f, 2.0577111f, 5.6267586f, 1.2157937f, 6.4809685f, 0.9424051f);
            instancePath.lineTo(6.8899026f, 0.8589205f);
            instancePath.lineTo(16.040018f, 3.5527137E-15f);
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
