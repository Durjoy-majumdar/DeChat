package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.voip_voicecall */
public class voip_voicecall extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 72;
        }
        if (i2 != 2) {
            return 0;
        }
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, -1.0f, 0.0f, 72.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.restore();
        canvas.save();
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(12.642428f, 43.89348f);
        instancePath.lineTo(20.489038f, 40.334248f);
        Path path = instancePath;
        path.cubicTo(20.498533f, 40.297424f, 20.519745f, 40.240364f, 20.555573f, 40.156624f);
        path.cubicTo(20.592392f, 40.070564f, 21.546556f, 37.84544f, 21.804857f, 37.23887f);
        path.cubicTo(21.861208f, 37.106487f, 21.861208f, 37.106487f, 21.917463f, 36.97412f);
        path.cubicTo(22.179684f, 36.35685f, 22.417952f, 35.790356f, 22.656128f, 35.217007f);
        path.cubicTo(23.005909f, 34.374996f, 23.252663f, 33.922047f, 23.866634f, 33.308075f);
        path.cubicTo(24.54784f, 32.62687f, 25.380478f, 32.174458f, 26.242174f, 31.969364f);
        path.cubicTo(29.761038f, 31.057201f, 32.951683f, 30.612867f, 35.958176f, 30.636295f);
        path.cubicTo(39.025455f, 30.612823f, 42.24702f, 31.05929f, 45.690666f, 31.952644f);
        path.cubicTo(46.619522f, 32.174458f, 47.45216f, 32.62687f, 48.133366f, 33.308075f);
        path.cubicTo(48.747337f, 33.922047f, 48.99409f, 34.374996f, 49.343872f, 35.217007f);
        path.cubicTo(49.582047f, 35.790356f, 49.820316f, 36.35685f, 50.08254f, 36.97412f);
        path.cubicTo(50.13879f, 37.106487f, 50.13879f, 37.106487f, 50.195145f, 37.23887f);
        path.cubicTo(50.453445f, 37.84544f, 51.407608f, 40.070564f, 51.444427f, 40.156624f);
        path.cubicTo(51.479324f, 40.23819f, 51.500355f, 40.29444f, 51.509403f, 40.33096f);
        instancePath.lineTo(59.22383f, 43.836f);
        Path path2 = instancePath;
        path2.cubicTo(59.479588f, 43.939846f, 59.781784f, 43.893364f, 60.08658f, 43.649986f);
        path2.cubicTo(60.095524f, 43.635265f, 60.10927f, 43.611115f, 60.129086f, 43.573357f);
        path2.cubicTo(60.15418f, 43.525543f, 60.188065f, 43.45469f, 60.230755f, 43.359913f);
        path2.cubicTo(61.520054f, 40.5698f, 60.914253f, 37.246555f, 58.653526f, 34.79361f);
        path2.cubicTo(54.747036f, 30.55498f, 44.741158f, 27.606579f, 35.988426f, 27.599998f);
        path2.cubicTo(27.237808f, 27.606573f, 17.255089f, 30.552673f, 13.346475f, 34.79361f);
        path2.cubicTo(11.085747f, 37.246555f, 10.479947f, 40.5698f, 11.787497f, 43.40005f);
        path2.cubicTo(11.811936f, 43.45469f, 11.84582f, 43.525543f, 11.870915f, 43.573357f);
        path2.cubicTo(11.892082f, 43.613686f, 11.906316f, 43.638485f, 11.915182f, 43.65286f);
        path2.cubicTo(12.190037f, 43.88873f, 12.507125f, 43.945274f, 12.642428f, 43.89348f);
        instancePath.close();
        instancePath.moveTo(61.300713f, 32.35386f);
        Path path3 = instancePath;
        path3.cubicTo(64.473015f, 35.795876f, 65.443535f, 40.661335f, 63.498714f, 44.87002f);
        path3.cubicTo(63.460358f, 44.95577f, 63.39195f, 45.103035f, 63.316723f, 45.246365f);
        path3.cubicTo(63.168354f, 45.529057f, 63.001297f, 45.78839f, 62.792793f, 46.028656f);
        path3.cubicTo(62.69147f, 46.145412f, 62.582687f, 46.254303f, 62.464314f, 46.354443f);
        path3.cubicTo(61.186558f, 47.472553f, 59.428444f, 47.804516f, 57.869495f, 47.17153f);
        instancePath.lineTo(49.609386f, 43.421844f);
        Path path4 = instancePath;
        path4.cubicTo(48.760178f, 42.99676f, 48.53418f, 42.506554f, 48.134636f, 41.572697f);
        path4.cubicTo(47.354313f, 39.748856f, 46.731472f, 38.312405f, 46.019318f, 36.59807f);
        path4.cubicTo(45.885525f, 36.276f, 45.79355f, 36.059425f, 45.58778f, 35.853657f);
        path4.cubicTo(45.387127f, 35.653004f, 45.148544f, 35.524406f, 44.854485f, 35.454185f);
        path4.cubicTo(41.678555f, 34.630917f, 38.75735f, 34.21498f, 35.98572f, 34.23619f);
        path4.cubicTo(33.214092f, 34.21498f, 30.321447f, 34.630917f, 27.145515f, 35.454185f);
        path4.cubicTo(26.851458f, 35.524406f, 26.612873f, 35.653004f, 26.412218f, 35.853657f);
        path4.cubicTo(26.206453f, 36.059425f, 26.114475f, 36.276f, 25.980682f, 36.59807f);
        path4.cubicTo(25.268526f, 38.312405f, 24.645685f, 39.748856f, 23.865366f, 41.572697f);
        path4.cubicTo(23.46582f, 42.506554f, 23.239822f, 42.99676f, 22.390614f, 43.421844f);
        instancePath.lineTo(14.130505f, 47.17153f);
        Path path5 = instancePath;
        path5.cubicTo(12.571555f, 47.804516f, 10.813441f, 47.472553f, 9.5356865f, 46.354443f);
        path5.cubicTo(9.417313f, 46.254303f, 9.308528f, 46.145412f, 9.207205f, 46.028656f);
        path5.cubicTo(8.998705f, 45.78839f, 8.831646f, 45.529057f, 8.683277f, 45.246365f);
        path5.cubicTo(8.608051f, 45.103035f, 8.539641f, 44.95577f, 8.501286f, 44.87002f);
        path5.cubicTo(6.556469f, 40.661335f, 7.5269885f, 35.795876f, 10.6992855f, 32.35386f);
        path5.cubicTo(15.990823f, 26.612415f, 27.84237f, 24.006119f, 35.98572f, 24.0f);
        path5.cubicTo(44.129074f, 24.006119f, 56.00918f, 26.612415f, 61.300713f, 32.35386f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 1);
        canvas.drawPath(instancePath, instancePaint3);
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
