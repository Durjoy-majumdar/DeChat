package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.card_home_friend_ticket_icon */
public class card_home_friend_ticket_icon extends C24542c {
    private final int height = 48;
    private final int width = 66;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0) {
            return 66;
        }
        if (i2 == 1) {
            return 48;
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
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16139513);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(1.492238E-12f, 4.753689f);
        instancePath.lineTo(1.4921397E-12f, 1.44f);
        instancePath.lineTo(1.4921397E-12f, 1.44f);
        instancePath.cubicTo(1.4920424E-12f, 0.64470994f, 0.64470994f, 5.0310737E-15f, 1.44f, 4.8849813E-15f);
        instancePath.lineTo(1.44f, 7.1054274E-15f);
        instancePath.lineTo(63.440598f, 7.1054274E-15f);
        instancePath.lineTo(63.440598f, 6.8833828E-15f);
        instancePath.cubicTo(64.235886f, 1.0975447E-14f, 64.8806f, 0.64470994f, 64.8806f, 1.44f);
        instancePath.lineTo(64.8806f, 4.7524633f);
        Path path = instancePath;
        path.cubicTo(63.212986f, 4.838482f, 61.888626f, 6.1519527f, 61.888626f, 7.759649f);
        path.cubicTo(61.888626f, 9.367345f, 63.212986f, 10.680816f, 64.8806f, 10.766834f);
        instancePath.lineTo(64.8806f, 15.700022f);
        Path path2 = instancePath;
        path2.cubicTo(63.212986f, 15.78604f, 61.888626f, 17.099512f, 61.888626f, 18.707207f);
        path2.cubicTo(61.888626f, 20.314903f, 63.212986f, 21.628374f, 64.8806f, 21.714392f);
        instancePath.lineTo(64.8806f, 26.64758f);
        Path path3 = instancePath;
        path3.cubicTo(63.212986f, 26.733599f, 61.888626f, 28.04707f, 61.888626f, 29.654766f);
        path3.cubicTo(61.888626f, 31.26246f, 63.212986f, 32.57593f, 64.8806f, 32.66195f);
        instancePath.lineTo(64.8806f, 37.59514f);
        Path path4 = instancePath;
        path4.cubicTo(63.212986f, 37.681156f, 61.888626f, 38.99463f, 61.888626f, 40.602325f);
        path4.cubicTo(61.888626f, 42.21002f, 63.212986f, 43.52349f, 64.8806f, 43.60951f);
        instancePath.lineTo(64.8806f, 46.403267f);
        Path path5 = instancePath;
        path5.cubicTo(64.8806f, 47.198555f, 64.235886f, 47.843266f, 63.440598f, 47.843266f);
        instancePath.lineTo(1.44f, 47.843266f);
        instancePath.lineTo(1.44f, 47.843266f);
        path5.cubicTo(0.64470994f, 47.843266f, 1.4974544E-12f, 47.198555f, 1.493472E-12f, 46.403267f);
        instancePath.lineTo(1.4933892E-12f, 43.608284f);
        path5.cubicTo(1.6570933f, 43.511753f, 2.969651f, 42.20284f, 2.969651f, 40.602325f);
        path5.cubicTo(2.969651f, 39.00181f, 1.6570933f, 37.692894f, 1.5220741E-12f, 37.596363f);
        instancePath.lineTo(1.4930648E-12f, 32.660725f);
        path5.cubicTo(1.6570933f, 32.564198f, 2.969651f, 31.255281f, 2.969651f, 29.654766f);
        path5.cubicTo(2.969651f, 28.054249f, 1.6570933f, 26.745335f, 1.5188684E-12f, 26.648806f);
        instancePath.lineTo(1.4927404E-12f, 21.713167f);
        path5.cubicTo(1.6570933f, 21.616638f, 2.969651f, 20.307724f, 2.969651f, 18.707207f);
        path5.cubicTo(2.969651f, 17.10669f, 1.6570933f, 15.797776f, 1.5214496E-12f, 15.701247f);
        instancePath.lineTo(1.4924161E-12f, 10.765609f);
        path5.cubicTo(1.6570933f, 10.669079f, 2.969651f, 9.360166f, 2.969651f, 7.759649f);
        path5.cubicTo(2.969651f, 6.1591315f, 1.6570933f, 4.8502183f, 1.5211582E-12f, 4.753689f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint, looper);
        instancePaint5.setColor(-1);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 12.766567f, 0.0f, 1.0f, 11.284898f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(27.595623f, 4.3071604f);
        Path path6 = instancePath2;
        path6.cubicTo(27.895103f, 4.257804f, 28.206886f, 4.231837f, 28.530052f, 4.231837f);
        path6.cubicTo(31.791265f, 4.231837f, 33.893112f, 6.8762636f, 33.893112f, 9.515511f);
        path6.cubicTo(33.893112f, 12.0585985f, 32.952255f, 12.706281f, 31.849623f, 14.214129f);
        path6.cubicTo(30.38874f, 16.211538f, 32.642963f, 17.07872f, 33.730682f, 17.629368f);
        path6.cubicTo(37.6348f, 19.60661f, 39.404655f, 20.372955f, 39.404655f, 21.401474f);
        instancePath2.lineTo(39.404655f, 22.687485f);
        instancePath2.cubicTo(39.404655f, 23.16594f, 39.036354f, 23.54473f, 38.45894f, 23.54473f);
        instancePath2.lineTo(36.02181f, 23.54473f);
        instancePath2.lineTo(36.02181f, 22.387041f);
        Path path7 = instancePath2;
        path7.cubicTo(36.02181f, 21.20894f, 31.7092f, 18.685806f, 27.265581f, 16.338505f);
        path7.cubicTo(26.625496f, 16.000385f, 25.99978f, 15.9148f, 25.658697f, 15.706315f);
        path7.cubicTo(25.719418f, 15.427879f, 25.690248f, 15.114451f, 25.533134f, 14.759604f);
        path7.cubicTo(25.69226f, 14.4091625f, 25.996216f, 13.935938f, 26.486708f, 13.281987f);
        path7.cubicTo(28.105675f, 11.123124f, 28.233088f, 9.803711f, 28.233088f, 8.206916f);
        path7.cubicTo(28.233088f, 7.4495745f, 28.17138f, 5.8157215f, 27.595623f, 4.3071604f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint6);
        canvas.restore();
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(13.871522f, 14.759604f);
        Path path8 = instancePath3;
        path8.cubicTo(13.714407f, 15.114451f, 13.685238f, 15.427879f, 13.745958f, 15.706315f);
        path8.cubicTo(13.404876f, 15.9148f, 12.7791605f, 16.000385f, 12.139076f, 16.338505f);
        path8.cubicTo(7.695457f, 18.685806f, 3.382846f, 21.20894f, 3.382846f, 22.387041f);
        instancePath3.lineTo(3.382846f, 23.54473f);
        instancePath3.lineTo(0.9457164f, 23.54473f);
        instancePath3.cubicTo(0.36830094f, 23.54473f, -3.5527137E-15f, 23.16594f, -3.5527137E-15f, 22.687485f);
        instancePath3.lineTo(-3.5527137E-15f, 21.401474f);
        Path path9 = instancePath3;
        path9.cubicTo(-3.5527137E-15f, 20.372955f, 1.7698545f, 19.60661f, 5.673974f, 17.629368f);
        path9.cubicTo(6.761694f, 17.07872f, 9.015916f, 16.211538f, 7.5550323f, 14.214129f);
        path9.cubicTo(6.452399f, 12.706281f, 5.5115457f, 12.0585985f, 5.5115457f, 9.515511f);
        path9.cubicTo(5.5115457f, 6.8762636f, 7.6133895f, 4.231837f, 10.874603f, 4.231837f);
        path9.cubicTo(11.19777f, 4.231837f, 11.509552f, 4.257804f, 11.809032f, 4.3071604f);
        path9.cubicTo(11.233276f, 5.8157215f, 11.171569f, 7.4495745f, 11.171569f, 8.206916f);
        path9.cubicTo(11.171569f, 9.803711f, 11.298982f, 11.123124f, 12.917948f, 13.281987f);
        path9.cubicTo(13.408441f, 13.935938f, 13.712396f, 14.4091625f, 13.871522f, 14.759604f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.save();
        Paint instancePaint8 = C24542c.instancePaint(instancePaint5, looper);
        Path instancePath4 = C24542c.instancePath(looper);
        instancePath4.moveTo(12.660459f, 7.1585255f);
        Path path10 = instancePath4;
        path10.cubicTo(12.660459f, 10.603999f, 13.853084f, 11.481504f, 15.25078f, 13.524396f);
        path10.cubicTo(17.102594f, 16.230564f, 14.245145f, 17.405455f, 12.866353f, 18.151493f);
        path10.cubicTo(7.9174953f, 20.830338f, 5.67403f, 21.868614f, 5.67403f, 23.262089f);
        instancePath4.lineTo(5.67403f, 25.004427f);
        instancePath4.cubicTo(5.67403f, 25.652655f, 6.1408877f, 26.165854f, 6.872819f, 26.165854f);
        instancePath4.lineTo(32.04451f, 26.165854f);
        instancePath4.cubicTo(32.776443f, 26.165854f, 33.2433f, 25.652655f, 33.2433f, 25.004427f);
        instancePath4.lineTo(33.2433f, 23.262089f);
        Path path11 = instancePath4;
        path11.cubicTo(33.2433f, 21.868614f, 30.999834f, 20.830338f, 26.050976f, 18.151493f);
        path11.cubicTo(24.672184f, 17.405455f, 21.814735f, 16.230564f, 23.66655f, 13.524396f);
        path11.cubicTo(25.064245f, 11.481504f, 26.25687f, 10.603999f, 26.25687f, 7.1585255f);
        path11.cubicTo(26.25687f, 3.5827715f, 23.592575f, 0.0f, 19.458664f, 0.0f);
        path11.cubicTo(15.324754f, 0.0f, 12.660459f, 3.5827715f, 12.660459f, 7.1585255f);
        instancePath4.close();
        WeChatSVGRenderC2Java.setFillType(instancePath4, 2);
        canvas.drawPath(instancePath4, instancePaint8);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
