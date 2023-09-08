package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_wechatout */
public class icons_outlined_wechatout extends C24542c {
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
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 4.5f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(46.22886f, 39.75217f);
            instancePath.lineTo(57.01254f, 43.80211f);
            Path path = instancePath;
            path.cubicTo(58.980694f, 44.63354f, 60.261246f, 46.51024f, 60.40459f, 48.661503f);
            path.cubicTo(60.420963f, 48.857704f, 60.420868f, 49.053158f, 60.40701f, 49.248974f);
            path.cubicTo(60.37849f, 49.651924f, 60.295635f, 50.034782f, 60.175026f, 50.421837f);
            path.cubicTo(60.113873f, 50.61808f, 60.043068f, 50.811737f, 60.000515f, 50.92317f);
            path.cubicTo(57.96777f, 56.448444f, 52.743507f, 60.187923f, 46.78856f, 60.187923f);
            path.cubicTo(45.420162f, 60.187923f, 43.99217f, 59.950283f, 43.170025f, 59.71261f);
            path.cubicTo(33.07302f, 57.408188f, 23.884508f, 52.274864f, 16.56704f, 44.968384f);
            path.cubicTo(9.249243f, 37.661575f, 4.107736f, 28.48603f, 1.7677788f, 18.231745f);
            path.cubicTo(1.7709881f, 18.254175f, 1.636847f, 17.626104f, 1.5721654f, 17.275263f);
            path.cubicTo(1.414704f, 16.421171f, 1.3233051f, 15.608054f, 1.3233051f, 14.787783f);
            path.cubicTo(1.3233051f, 8.838872f, 5.0692034f, 3.6213472f, 10.661819f, 1.5710254f);
            path.cubicTo(10.815471f, 1.5179147f, 10.99734f, 1.459445f, 11.215516f, 1.4001756f);
            path.cubicTo(11.543273f, 1.3111373f, 11.868964f, 1.2444949f, 12.199514f, 1.2089506f);
            path.cubicTo(12.363703f, 1.1912954f, 12.526502f, 1.1817796f, 12.75884f, 1.1829419f);
            path.cubicTo(14.968856f, 1.2564985f, 16.883158f, 2.5377858f, 17.758429f, 4.607925f);
            instancePath.lineTo(21.76432f, 15.243251f);
            Path path2 = instancePath;
            path2.cubicTo(22.174992f, 16.370901f, 22.02397f, 17.225407f, 21.425602f, 18.319908f);
            path2.cubicTo(20.350695f, 20.19817f, 18.13567f, 24.28131f, 16.98311f, 26.539143f);
            path2.cubicTo(16.811522f, 26.857328f, 16.717373f, 27.220823f, 16.717373f, 27.561794f);
            path2.cubicTo(16.717373f, 27.893484f, 16.827755f, 28.266993f, 17.037537f, 28.608128f);
            path2.cubicTo(19.116108f, 32.131565f, 21.373028f, 35.14371f, 23.874208f, 37.641243f);
            path2.cubicTo(26.34383f, 40.14895f, 29.340273f, 42.39845f, 32.931187f, 44.51092f);
            path2.cubicTo(33.258274f, 44.711906f, 33.587967f, 44.810665f, 33.948303f, 44.810665f);
            path2.cubicTo(34.317825f, 44.810665f, 34.63733f, 44.72671f, 35.004196f, 44.52973f);
            path2.cubicTo(37.08053f, 43.453255f, 40.98824f, 41.339756f, 43.244305f, 40.08834f);
            path2.cubicTo(44.298836f, 39.514008f, 45.08466f, 39.37134f, 46.22886f, 39.75217f);
            instancePath.close();
            instancePath.moveTo(36.681084f, 47.71522f);
            Path path3 = instancePath;
            path3.cubicTo(35.82879f, 48.173462f, 34.92606f, 48.410664f, 33.948303f, 48.410664f);
            path3.cubicTo(32.90218f, 48.410664f, 31.924953f, 48.117935f, 31.071325f, 47.593086f);
            path3.cubicTo(27.2605f, 45.351727f, 24.016785f, 42.91659f, 21.318104f, 40.176216f);
            path3.cubicTo(18.59831f, 37.460506f, 16.161366f, 34.208096f, 13.951854f, 30.462145f);
            path3.cubicTo(13.420091f, 29.599327f, 13.1173725f, 28.57499f, 13.1173725f, 27.561794f);
            path3.cubicTo(13.1173725f, 26.616503f, 13.363279f, 25.667091f, 13.798601f, 24.860672f);
            path3.cubicTo(14.955836f, 22.59247f, 17.198269f, 18.458813f, 18.286577f, 16.557726f);
            path3.cubicTo(18.313852f, 16.507795f, 17.022354f, 12.966344f, 14.412085f, 5.933369f);
            path3.cubicTo(14.122012f, 5.248772f, 13.464088f, 4.8084083f, 12.688983f, 4.78178f);
            path3.cubicTo(12.464445f, 4.8012156f, 12.31752f, 4.8312793f, 12.159285f, 4.8742657f);
            path3.cubicTo(12.034602f, 4.9081364f, 11.937806f, 4.939256f, 11.841541f, 4.971815f);
            path3.cubicTo(7.7094197f, 6.487458f, 4.923305f, 10.368135f, 4.923305f, 14.787783f);
            path3.cubicTo(4.923305f, 15.359447f, 4.991529f, 15.966388f, 5.1125016f, 16.622562f);
            path3.cubicTo(5.1574545f, 16.866392f, 5.3138833f, 17.598818f, 5.308789f, 17.599607f);
            path3.cubicTo(7.464259f, 27.015633f, 12.268067f, 35.58852f, 19.11071f, 42.420887f);
            path3.cubicTo(25.953588f, 49.25349f, 34.53996f, 54.050415f, 44.048798f, 56.222805f);
            path3.cubicTo(44.68194f, 56.40343f, 45.79056f, 56.587925f, 46.78856f, 56.587925f);
            path3.cubicTo(51.216927f, 56.587925f, 55.104233f, 53.805424f, 56.60685f, 49.72311f);
            path3.cubicTo(56.676903f, 49.531948f, 56.70863f, 49.44517f, 56.738026f, 49.350834f);
            path3.cubicTo(56.782673f, 49.20756f, 56.80981f, 49.08216f, 56.815994f, 48.994804f);
            path3.cubicTo(56.758045f, 48.080116f, 56.3003f, 47.409275f, 55.667988f, 47.140827f);
            instancePath.lineTo(45.09261f, 43.16933f);
            instancePath.cubicTo(42.70743f, 44.502876f, 38.771847f, 46.63145f, 36.681084f, 47.71522f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 25.107143f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(6.213008f, 15.805954f);
            Path path4 = instancePath2;
            path4.cubicTo(5.7608614f, 11.796948f, 6.9431252f, 7.9411287f, 9.672789f, 5.16775f);
            path4.cubicTo(14.930721f, -0.19166379f, 24.014297f, 0.3555171f, 30.002613f, 6.229036f);
            path4.cubicTo(35.939026f, 12.103612f, 36.63614f, 21.169064f, 31.394089f, 26.512226f);
            path4.cubicTo(28.639668f, 29.359013f, 24.681374f, 30.622126f, 20.587873f, 30.15083f);
            path4.cubicTo(20.28228f, 30.6213f, 19.929993f, 31.055887f, 19.519777f, 31.465485f);
            path4.cubicTo(15.909817f, 35.1292f, 9.687202f, 34.75426f, 5.7060347f, 30.77882f);
            path4.cubicTo(1.6477474f, 26.839188f, 1.1649352f, 20.62562f, 4.794327f, 16.942354f);
            path4.cubicTo(5.2288585f, 16.508474f, 5.7024174f, 16.129234f, 6.213008f, 15.805954f);
            instancePath2.close();
            instancePath2.moveTo(18.365063f, 25.962624f);
            Path path5 = instancePath2;
            path5.cubicTo(18.590746f, 24.030882f, 17.812334f, 21.84523f, 16.140818f, 20.205503f);
            path5.cubicTo(14.487469f, 18.5836f, 12.348417f, 17.838194f, 10.404866f, 18.042467f);
            path5.cubicTo(11.0512f, 19.815674f, 12.129596f, 21.491978f, 13.579116f, 22.939444f);
            path5.cubicTo(14.986223f, 24.313217f, 16.642477f, 25.348162f, 18.365063f, 25.962624f);
            instancePath2.close();
            instancePath2.moveTo(18.661846f, 17.635597f);
            Path path6 = instancePath2;
            path6.cubicTo(21.186472f, 20.112207f, 22.363724f, 23.519043f, 21.9068f, 26.641684f);
            path6.cubicTo(24.586773f, 26.728634f, 27.063313f, 25.811007f, 28.815586f, 24.000025f);
            path6.cubicTo(32.5943f, 20.148378f, 32.07078f, 13.340383f, 27.476088f, 8.793527f);
            path6.cubicTo(22.839022f, 4.2453723f, 16.023672f, 3.834826f, 12.240551f, 7.69096f);
            path6.cubicTo(10.504562f, 9.454752f, 9.639986f, 11.871755f, 9.724495f, 14.498878f);
            path6.cubicTo(12.827285f, 14.0714f, 16.165052f, 15.186291f, 18.661846f, 17.635597f);
            instancePath2.close();
            instancePath2.moveTo(11.049835f, 25.50115f);
            Path path7 = instancePath2;
            path7.cubicTo(9.326564f, 23.780466f, 8.011593f, 21.79349f, 7.172034f, 19.668589f);
            path7.cubicTo(5.232044f, 21.869429f, 5.5954437f, 25.654177f, 8.231642f, 28.21354f);
            path7.cubicTo(10.777556f, 30.755632f, 14.50742f, 31.077387f, 16.696297f, 29.181122f);
            path7.cubicTo(14.649492f, 28.37767f, 12.712568f, 27.124603f, 11.049835f, 25.50115f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
