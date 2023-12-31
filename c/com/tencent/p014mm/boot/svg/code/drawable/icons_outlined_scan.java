package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_scan */
public class icons_outlined_scan extends C24542c {
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
            instancePath.moveTo(24.0f, 53.1f);
            Path path = instancePath;
            path.cubicTo(21.183348f, 53.1f, 18.9f, 50.81665f, 18.9f, 48.0f);
            path.cubicTo(18.9f, 45.18335f, 21.183348f, 42.9f, 24.0f, 42.9f);
            instancePath.lineTo(52.90141f, 42.9f);
            instancePath.cubicTo(53.646248f, 42.9f, 54.132065f, 42.519794f, 54.18169f, 42.25352f);
            instancePath.lineTo(54.18169f, 36.338028f);
            Path path2 = instancePath;
            path2.cubicTo(54.18169f, 34.047047f, 55.065254f, 31.838139f, 56.503098f, 30.430141f);
            path2.cubicTo(57.56179f, 29.018549f, 59.42604f, 27.9f, 61.140846f, 27.9f);
            path2.cubicTo(63.906757f, 27.9f, 65.93448f, 30.307917f, 65.55437f, 32.955437f);
            path2.cubicTo(65.52923f, 33.20682f, 65.49082f, 33.622913f, 65.45247f, 34.102325f);
            path2.cubicTo(65.4341f, 34.331932f, 65.417656f, 34.553864f, 65.40364f, 34.764103f);
            path2.cubicTo(65.37128f, 35.249645f, 65.35352f, 35.649075f, 65.35352f, 35.915493f);
            path2.cubicTo(65.35352f, 38.362114f, 65.5987f, 40.617764f, 66.13589f, 42.589268f);
            path2.cubicTo(66.26279f, 43.09686f, 66.39207f, 43.535187f, 66.57021f, 44.080772f);
            path2.cubicTo(66.6461f, 44.311607f, 66.6461f, 44.311607f, 66.73953f, 44.59369f);
            path2.cubicTo(67.65387f, 47.565296f, 68.1f, 50.520897f, 68.1f, 53.661972f);
            instancePath.lineTo(68.08716f, 56.217823f);
            Path path3 = instancePath;
            path3.cubicTo(67.84558f, 58.39203f, 66.92488f, 60.628f, 65.61393f, 62.462948f);
            path3.cubicTo(63.35938f, 65.71951f, 59.629265f, 67.74443f, 55.225353f, 68.1f);
            instancePath.lineTo(49.676414f, 68.09925f);
            Path path4 = instancePath;
            path4.cubicTo(46.08486f, 68.00348f, 42.596836f, 66.39767f, 40.008034f, 63.80887f);
            path4.cubicTo(39.518673f, 63.319508f, 39.197826f, 62.878345f, 38.612087f, 61.97819f);
            path4.cubicTo(36.571465f, 59.529446f, 35.088905f, 56.584694f, 34.138916f, 53.1f);
            instancePath.lineTo(24.0f, 53.1f);
            instancePath.close();
            instancePath.moveTo(37.000446f, 49.5f);
            instancePath.lineTo(37.255203f, 50.68463f);
            Path path5 = instancePath;
            path5.cubicTo(38.0449f, 54.356716f, 39.411167f, 57.313705f, 41.473427f, 59.801754f);
            path5.cubicTo(42.04582f, 60.660336f, 42.299538f, 61.009205f, 42.55362f, 61.263283f);
            path5.cubicTo(44.512356f, 63.22202f, 47.136787f, 64.43025f, 49.732395f, 64.5f);
            instancePath.lineTo(55.102238f, 64.50506f);
            Path path6 = instancePath;
            path6.cubicTo(58.292816f, 64.24231f, 61.03356f, 62.754475f, 62.666725f, 60.39575f);
            path6.cubicTo(63.65426f, 59.0132f, 64.33924f, 57.34967f, 64.5f, 55.985916f);
            instancePath.lineTo(64.5f, 53.661972f);
            Path path7 = instancePath;
            path7.cubicTo(64.5f, 50.880447f, 64.10773f, 48.281662f, 63.30937f, 45.685608f);
            path7.cubicTo(63.229645f, 45.446438f, 63.229645f, 45.446438f, 63.148037f, 45.198215f);
            path7.cubicTo(62.94545f, 44.577797f, 62.793026f, 44.06098f, 62.651447f, 43.493267f);
            path7.cubicTo(62.0322f, 41.222702f, 61.75352f, 38.65885f, 61.75352f, 35.915493f);
            path7.cubicTo(61.75352f, 35.55247f, 61.774376f, 35.083252f, 61.811615f, 34.524635f);
            path7.cubicTo(61.826756f, 34.297543f, 61.844357f, 34.059937f, 61.863934f, 33.815243f);
            path7.cubicTo(61.904446f, 33.308834f, 61.944916f, 32.87038f, 61.979866f, 32.534348f);
            path7.cubicTo(62.06428f, 31.943422f, 61.690876f, 31.5f, 61.140846f, 31.5f);
            path7.cubicTo(60.675564f, 31.5f, 59.812183f, 32.01803f, 59.24376f, 32.7508f);
            path7.cubicTo(58.297455f, 33.697105f, 57.78169f, 34.986515f, 57.78169f, 36.338028f);
            instancePath.lineTo(57.78169f, 41.619717f);
            instancePath.lineTo(57.770107f, 42.43957f);
            instancePath.cubicTo(57.466965f, 44.86471f, 55.37743f, 46.5f, 52.90141f, 46.5f);
            instancePath.lineTo(24.0f, 46.5f);
            Path path8 = instancePath;
            path8.cubicTo(23.171574f, 46.5f, 22.5f, 47.171574f, 22.5f, 48.0f);
            path8.cubicTo(22.5f, 48.828426f, 23.171574f, 49.5f, 24.0f, 49.5f);
            instancePath.lineTo(37.000446f, 49.5f);
            instancePath.close();
            instancePath.moveTo(48.0f, 18.9f);
            path8.cubicTo(50.81665f, 18.9f, 53.1f, 21.183348f, 53.1f, 24.0f);
            path8.cubicTo(53.1f, 26.816652f, 50.81665f, 29.1f, 48.0f, 29.1f);
            instancePath.lineTo(19.09859f, 29.1f);
            instancePath.cubicTo(18.353754f, 29.1f, 17.867937f, 29.480206f, 17.81831f, 29.746479f);
            instancePath.lineTo(17.81831f, 35.661972f);
            Path path9 = instancePath;
            path9.cubicTo(17.81831f, 37.952953f, 16.934746f, 40.16186f, 15.4969015f, 41.56986f);
            path9.cubicTo(14.438208f, 42.98145f, 12.573959f, 44.1f, 10.859155f, 44.1f);
            path9.cubicTo(8.093244f, 44.1f, 6.065525f, 41.692085f, 6.445633f, 39.044563f);
            path9.cubicTo(6.470772f, 38.79318f, 6.50918f, 38.377087f, 6.547533f, 37.897675f);
            path9.cubicTo(6.5659018f, 37.668068f, 6.582341f, 37.446136f, 6.596357f, 37.235897f);
            path9.cubicTo(6.6287265f, 36.750355f, 6.6464787f, 36.350925f, 6.6464787f, 36.084507f);
            path9.cubicTo(6.6464787f, 33.637886f, 6.4013f, 31.382238f, 5.864109f, 29.410734f);
            path9.cubicTo(5.7043867f, 28.771843f, 5.576448f, 28.356043f, 5.26047f, 27.406313f);
            path9.cubicTo(4.346128f, 24.434702f, 3.9f, 21.479105f, 3.9f, 18.338028f);
            instancePath.lineTo(3.9128442f, 15.782178f);
            Path path10 = instancePath;
            path10.cubicTo(4.1544228f, 13.607972f, 5.0751166f, 11.372001f, 6.3860726f, 9.537053f);
            path10.cubicTo(8.640619f, 6.2804856f, 12.370734f, 4.255566f, 16.774649f, 3.9f);
            instancePath.lineTo(22.323586f, 3.9007463f);
            Path path11 = instancePath;
            path11.cubicTo(25.915136f, 3.996521f, 29.403164f, 5.6023297f, 31.991966f, 8.191133f);
            path11.cubicTo(32.481327f, 8.680492f, 32.802174f, 9.121655f, 33.387913f, 10.02181f);
            path11.cubicTo(35.428535f, 12.470555f, 36.911095f, 15.415307f, 37.861084f, 18.9f);
            instancePath.lineTo(48.0f, 18.9f);
            instancePath.close();
            instancePath.moveTo(34.999554f, 22.5f);
            instancePath.lineTo(34.744797f, 21.31537f);
            Path path12 = instancePath;
            path12.cubicTo(33.9551f, 17.643284f, 32.588833f, 14.686295f, 30.526573f, 12.198248f);
            path12.cubicTo(29.954182f, 11.339663f, 29.70046f, 10.990795f, 29.446383f, 10.736716f);
            path12.cubicTo(27.487644f, 8.777979f, 24.86321f, 7.5697494f, 22.267605f, 7.5f);
            instancePath.lineTo(16.89776f, 7.4949393f);
            Path path13 = instancePath;
            path13.cubicTo(13.707183f, 7.757693f, 10.966437f, 9.245525f, 9.333276f, 11.604252f);
            path13.cubicTo(8.345741f, 12.9868f, 7.6607594f, 14.650329f, 7.5f, 16.014084f);
            instancePath.lineTo(7.5f, 18.338028f);
            Path path14 = instancePath;
            path14.cubicTo(7.5f, 21.119553f, 7.8922696f, 23.718338f, 8.690631f, 26.31439f);
            path14.cubicTo(9.018835f, 27.299004f, 9.168899f, 27.78671f, 9.348555f, 28.506733f);
            path14.cubicTo(9.967799f, 30.777298f, 10.246479f, 33.34115f, 10.246479f, 36.084507f);
            path14.cubicTo(10.246479f, 36.44753f, 10.225625f, 36.916748f, 10.188383f, 37.475365f);
            path14.cubicTo(10.173244f, 37.702457f, 10.155643f, 37.940063f, 10.136068f, 38.184757f);
            path14.cubicTo(10.095555f, 38.691166f, 10.055082f, 39.12962f, 10.020136f, 39.465652f);
            path14.cubicTo(9.935718f, 40.05658f, 10.309125f, 40.5f, 10.859155f, 40.5f);
            path14.cubicTo(11.324436f, 40.5f, 12.187818f, 39.98197f, 12.756241f, 39.2492f);
            path14.cubicTo(13.702545f, 38.302895f, 14.21831f, 37.013485f, 14.21831f, 35.661972f);
            instancePath.lineTo(14.21831f, 30.380281f);
            instancePath.lineTo(14.229893f, 29.560427f);
            instancePath.cubicTo(14.533035f, 27.135288f, 16.62257f, 25.5f, 19.09859f, 25.5f);
            instancePath.lineTo(48.0f, 25.5f);
            Path path15 = instancePath;
            path15.cubicTo(48.828426f, 25.5f, 49.5f, 24.828426f, 49.5f, 24.0f);
            path15.cubicTo(49.5f, 23.171574f, 48.828426f, 22.5f, 48.0f, 22.5f);
            instancePath.lineTo(34.999554f, 22.5f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
