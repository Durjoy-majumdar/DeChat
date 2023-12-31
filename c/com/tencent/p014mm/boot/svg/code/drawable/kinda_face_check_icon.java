package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.kinda_face_check_icon */
public class kinda_face_check_icon extends C24542c {
    private final int height = 64;
    private final int width = 64;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 64;
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
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -267.0f, 0.0f, 1.0f, -136.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 267.0f, 0.0f, 1.0f, 136.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray2);
        canvas.concat(instanceMatrix);
        Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
        instancePaint3.setColor(-16777216);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(32.0f, 5.3333335f);
        Path path = instancePath;
        path.cubicTo(46.727592f, 5.3333335f, 58.666668f, 17.272408f, 58.666668f, 32.0f);
        path.cubicTo(58.666668f, 39.42807f, 55.629566f, 46.14679f, 50.729397f, 50.982124f);
        instancePath.lineTo(51.17707f, 50.52977f);
        Path path2 = instancePath;
        path2.cubicTo(51.0104f, 50.702225f, 50.841423f, 50.872444f, 50.67019f, 51.040367f);
        path2.cubicTo(50.368256f, 51.336468f, 50.059284f, 51.625465f, 49.74357f, 51.907066f);
        path2.cubicTo(49.716835f, 51.930912f, 49.690353f, 51.954437f, 49.663822f, 51.977913f);
        path2.cubicTo(49.342503f, 52.26224f, 49.01382f, 52.539295f, 48.678497f, 52.808414f);
        path2.cubicTo(48.661995f, 52.82166f, 48.64583f, 52.8346f, 48.62965f, 52.847523f);
        path2.cubicTo(45.392883f, 55.43282f, 41.540752f, 57.280045f, 37.32818f, 58.13428f);
        instancePath.lineTo(37.33279f, 58.133347f);
        instancePath.lineTo(37.256996f, 58.148617f);
        Path path3 = instancePath;
        path3.cubicTo(36.870956f, 58.2258f, 36.481907f, 58.294647f, 36.090046f, 58.35496f);
        path3.cubicTo(36.054695f, 58.360405f, 36.019672f, 58.365723f, 35.984627f, 58.370975f);
        path3.cubicTo(35.79919f, 58.39876f, 35.612667f, 58.424698f, 35.42554f, 58.448692f);
        path3.cubicTo(35.36909f, 58.455933f, 35.312172f, 58.463047f, 35.255196f, 58.469982f);
        path3.cubicTo(35.083366f, 58.49089f, 34.911438f, 58.510124f, 34.73902f, 58.527718f);
        path3.cubicTo(34.72418f, 58.529232f, 34.709156f, 58.53075f, 34.694126f, 58.532257f);
        path3.cubicTo(34.494987f, 58.55224f, 34.295345f, 58.57001f, 34.095085f, 58.585575f);
        path3.cubicTo(34.047504f, 58.589275f, 34.000164f, 58.592827f, 33.952793f, 58.596256f);
        path3.cubicTo(33.783314f, 58.60852f, 33.613266f, 58.619213f, 33.44279f, 58.6283f);
        path3.cubicTo(33.407295f, 58.63019f, 33.371906f, 58.63201f, 33.3365f, 58.63376f);
        path3.cubicTo(33.13187f, 58.64386f, 32.9264f, 58.65166f, 32.72035f, 58.657127f);
        path3.cubicTo(32.68994f, 58.657932f, 32.659966f, 58.658676f, 32.62998f, 58.65937f);
        path3.cubicTo(32.567253f, 58.660828f, 32.504143f, 58.66207f, 32.440983f, 58.663094f);
        instancePath.lineTo(32.0f, 58.666668f);
        instancePath.lineTo(32.0f, 58.666668f);
        path3.cubicTo(31.789318f, 58.666668f, 31.579206f, 58.664223f, 31.369694f, 58.659363f);
        instancePath.lineTo(32.0f, 58.666668f);
        path3.cubicTo(31.759592f, 58.666668f, 31.519928f, 58.663486f, 31.281046f, 58.65716f);
        path3.cubicTo(31.073915f, 58.651676f, 30.867764f, 58.64385f, 30.662222f, 58.633694f);
        path3.cubicTo(30.629131f, 58.632057f, 30.596735f, 58.630398f, 30.564356f, 58.62868f);
        path3.cubicTo(30.391026f, 58.619488f, 30.217554f, 58.6086f, 30.04454f, 58.59606f);
        path3.cubicTo(29.999208f, 58.592773f, 29.954235f, 58.5894f, 29.909292f, 58.585915f);
        path3.cubicTo(29.708107f, 58.570316f, 29.507149f, 58.552444f, 29.306845f, 58.532356f);
        path3.cubicTo(29.28949f, 58.530617f, 29.272135f, 58.52886f, 29.254782f, 58.527084f);
        path3.cubicTo(29.088734f, 58.5101f, 28.923233f, 58.491608f, 28.758198f, 58.471607f);
        path3.cubicTo(28.695084f, 58.46396f, 28.631474f, 58.45602f, 28.567932f, 58.447857f);
        path3.cubicTo(28.380272f, 58.42374f, 28.193672f, 58.397743f, 28.007702f, 58.369823f);
        path3.cubicTo(27.97743f, 58.365276f, 27.947412f, 58.360718f, 27.917414f, 58.35611f);
        path3.cubicTo(27.727987f, 58.327007f, 27.539112f, 58.295895f, 27.350918f, 58.26281f);
        path3.cubicTo(27.335026f, 58.260014f, 27.319065f, 58.257195f, 27.303108f, 58.254356f);
        path3.cubicTo(27.119144f, 58.22167f, 26.935852f, 58.187096f, 26.753231f, 58.150658f);
        path3.cubicTo(26.724974f, 58.14502f, 26.696083f, 58.139206f, 26.667212f, 58.133347f);
        path3.cubicTo(22.557322f, 57.299995f, 18.786343f, 55.518166f, 15.596864f, 53.026455f);
        instancePath.lineTo(15.370352f, 52.847523f);
        instancePath.lineTo(15.349404f, 52.830776f);
        Path path4 = instancePath;
        path4.cubicTo(15.189836f, 52.703064f, 15.031766f, 52.57355f, 14.875226f, 52.44228f);
        instancePath.lineTo(15.370352f, 52.847523f);
        path4.cubicTo(15.175506f, 52.691895f, 14.982889f, 52.533592f, 14.792559f, 52.37267f);
        path4.cubicTo(14.295941f, 51.952766f, 13.815305f, 51.51544f, 13.351187f, 51.061306f);
        path4.cubicTo(13.317915f, 51.02875f, 13.28436f, 50.995747f, 13.250893f, 50.962654f);
        path4.cubicTo(13.111716f, 50.825024f, 12.97471f, 50.68656f, 12.839224f, 50.546616f);
        path4.cubicTo(12.834029f, 50.54125f, 12.828477f, 50.53551f, 12.822928f, 50.52977f);
        instancePath.lineTo(12.573643f, 50.26833f);
        Path path5 = instancePath;
        path5.cubicTo(8.084096f, 45.496014f, 5.3333335f, 39.069244f, 5.3333335f, 32.0f);
        path5.cubicTo(5.3333335f, 17.272408f, 17.272408f, 5.3333335f, 32.0f, 5.3333335f);
        instancePath.close();
        instancePath.moveTo(32.0f, 8.533334f);
        Path path6 = instancePath;
        path6.cubicTo(19.039719f, 8.533334f, 8.533334f, 19.039719f, 8.533334f, 32.0f);
        path6.cubicTo(8.533334f, 38.712532f, 11.351698f, 44.7668f, 15.869644f, 49.04402f);
        instancePath.lineTo(24.731869f, 44.717716f);
        instancePath.cubicTo(26.921005f, 43.64944f, 27.430023f, 41.283367f, 25.849188f, 39.409702f);
        instancePath.lineTo(24.885101f, 38.267036f);
        instancePath.cubicTo(23.32936f, 36.423115f, 22.007238f, 33.309536f, 21.526749f, 30.583244f);
        instancePath.lineTo(21.509836f, 30.480856f);
        Path path7 = instancePath;
        path7.cubicTo(22.613081f, 30.576036f, 23.71635f, 30.6562f, 24.81964f, 30.72135f);
        path7.cubicTo(25.285961f, 32.71945f, 26.268627f, 34.944485f, 27.330875f, 36.2035f);
        instancePath.lineTo(28.294962f, 37.34617f);
        instancePath.cubicTo(31.217697f, 40.810295f, 30.200571f, 45.609734f, 26.135252f, 47.593567f);
        instancePath.lineTo(18.604624f, 51.270332f);
        Path path8 = instancePath;
        path8.cubicTo(22.402987f, 53.915638f, 27.02036f, 55.466667f, 32.0f, 55.466667f);
        path8.cubicTo(36.9792f, 55.466667f, 41.596203f, 53.91591f, 45.394375f, 51.27103f);
        instancePath.lineTo(37.865215f, 47.59744f);
        instancePath.cubicTo(33.79433f, 45.611713f, 32.788193f, 40.80777f, 35.7049f, 37.350315f);
        instancePath.lineTo(36.668983f, 36.20749f);
        Path path9 = instancePath;
        path9.cubicTo(37.727684f, 34.95251f, 38.712376f, 32.720802f, 39.180656f, 30.719244f);
        path9.cubicTo(40.2837f, 30.656153f, 41.386696f, 30.576008f, 42.489677f, 30.480856f);
        path9.cubicTo(42.024834f, 33.231907f, 40.685f, 36.409664f, 39.1149f, 38.270863f);
        instancePath.lineTo(38.150814f, 39.41369f);
        instancePath.cubicTo(36.578754f, 41.277203f, 37.069836f, 43.64906f, 39.26813f, 44.72136f);
        instancePath.lineTo(48.130356f, 49.04402f);
        Path path10 = instancePath;
        path10.cubicTo(52.648304f, 44.7668f, 55.466667f, 38.712532f, 55.466667f, 32.0f);
        path10.cubicTo(55.466667f, 19.039719f, 44.96028f, 8.533334f, 32.0f, 8.533334f);
        instancePath.close();
        instancePath.moveTo(31.999592f, 26.133333f);
        instancePath.cubicTo(37.33302f, 26.133333f, 42.66649f, 26.48889f, 48.0f, 27.2f);
        instancePath.lineTo(48.0f, 28.266666f);
        Path path11 = instancePath;
        path11.cubicTo(42.6663f, 28.977777f, 37.332832f, 29.333334f, 31.999592f, 29.333334f);
        path11.cubicTo(26.666353f, 29.333334f, 21.333155f, 28.977777f, 16.0f, 28.266666f);
        instancePath.lineTo(16.0f, 27.2f);
        instancePath.cubicTo(21.332968f, 26.48889f, 26.666164f, 26.133333f, 31.999592f, 26.133333f);
        instancePath.close();
        instancePath.moveTo(32.0f, 13.333333f);
        instancePath.cubicTo(37.891037f, 13.333333f, 42.666668f, 18.114614f, 42.666668f, 24.000553f);
        instancePath.lineTo(42.666805f, 25.001207f);
        instancePath.cubicTo(41.600166f, 24.907639f, 40.533512f, 24.828104f, 39.46684f, 24.762602f);
        instancePath.lineTo(39.466667f, 24.000553f);
        Path path12 = instancePath;
        path12.cubicTo(39.466667f, 19.87977f, 36.121574f, 16.533333f, 32.0f, 16.533333f);
        path12.cubicTo(27.88349f, 16.533333f, 24.533333f, 19.88054f, 24.533333f, 23.99888f);
        instancePath.lineTo(24.533508f, 24.76254f);
        instancePath.cubicTo(23.466885f, 24.828033f, 22.400288f, 24.90756f, 21.33372f, 25.001122f);
        instancePath.lineTo(21.333334f, 23.99888f);
        instancePath.cubicTo(21.333334f, 18.108461f, 26.120949f, 13.333333f, 32.0f, 13.333333f);
        instancePath.close();
        WeChatSVGRenderC2Java.setFillType(instancePath, 2);
        canvas.drawPath(instancePath, instancePaint4);
        canvas.restore();
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(0.0f, 0.0f);
        instancePath2.lineTo(64.0f, 0.0f);
        instancePath2.lineTo(64.0f, 64.0f);
        instancePath2.lineTo(0.0f, 64.0f);
        instancePath2.lineTo(0.0f, 0.0f);
        instancePath2.close();
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
