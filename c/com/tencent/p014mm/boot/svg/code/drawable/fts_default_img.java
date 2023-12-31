package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fts_default_img */
public class fts_default_img extends C24542c {
    private final int height = 210;
    private final int width = 210;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 210;
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
        instancePaint3.setColor(-1118482);
        canvas.save();
        Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath = C24542c.instancePath(looper);
        instancePath.moveTo(0.0f, 0.0f);
        instancePath.lineTo(210.0f, 0.0f);
        instancePath.lineTo(210.0f, 210.0f);
        instancePath.lineTo(0.0f, 210.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.lineTo(0.0f, 0.0f);
        instancePath.close();
        instancePath.moveTo(51.375313f, 61.445953f);
        instancePath.cubicTo(49.097633f, 62.294743f, 49.047684f, 64.9909f, 49.037693f, 67.018005f);
        Path path = instancePath;
        path.cubicTo(49.067665f, 90.34475f, 49.067665f, 113.66151f, 49.047684f, 136.98825f);
        path.cubicTo(49.097633f, 140.20366f, 48.738f, 143.48898f, 49.447277f, 146.65446f);
        path.cubicTo(50.31639f, 148.91124f, 52.993664f, 148.94121f, 55.0216f, 148.96117f);
        path.cubicTo(86.3297f, 148.92123f, 117.637794f, 148.94121f, 148.95589f, 148.95119f);
        path.cubicTo(152.16261f, 148.90126f, 155.44926f, 149.26074f, 158.61604f, 148.56174f);
        path.cubicTo(160.9137f, 147.71295f, 160.94366f, 144.99683f, 160.96365f, 142.95973f);
        path.cubicTo(160.93369f, 119.65296f, 160.93369f, 96.336205f, 160.96365f, 73.029434f);
        path.cubicTo(160.89372f, 69.824005f, 161.26335f, 66.548676f, 160.56406f, 63.393177f);
        path.cubicTo(159.73491f, 61.126408f, 157.04764f, 61.056507f, 155.0297f, 61.046524f);
        path.cubicTo(124.04127f, 61.086468f, 93.05285f, 61.056507f, 62.064423f, 61.056507f);
        path.cubicTo(58.508045f, 61.136395f, 54.88174f, 60.69702f, 51.375313f, 61.445953f);
        path.lineTo(51.375313f, 61.445953f);
        path.close();
        WeChatSVGRenderC2Java.setFillType(path, 2);
        canvas.drawPath(path, instancePaint4);
        canvas.restore();
        canvas.save();
        Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
        Path instancePath2 = C24542c.instancePath(looper);
        instancePath2.moveTo(57.635704f, 69.08695f);
        Path path2 = instancePath2;
        path2.cubicTo(88.87957f, 68.97611f, 120.133415f, 68.966034f, 151.3673f, 69.08695f);
        path2.cubicTo(152.41542f, 73.55092f, 151.81648f, 78.14588f, 151.93628f, 82.68038f);
        path2.cubicTo(151.83646f, 95.47776f, 152.1459f, 108.27513f, 151.77657f, 121.06243f);
        path2.cubicTo(146.96521f, 114.80482f, 142.75278f, 107.32793f, 135.29617f, 103.93209f);
        path2.cubicTo(129.4966f, 101.31215f, 124.17615f, 106.35049f, 119.654274f, 109.38357f);
        path2.cubicTo(121.480995f, 115.4598f, 125.56366f, 120.38729f, 128.33867f, 126.0f);
        path2.cubicTo(124.50556f, 123.178535f, 121.85033f, 119.168015f, 118.67603f, 115.68149f);
        path2.cubicTo(111.83832f, 108.48674f, 106.98704f, 99.24644f, 98.45237f, 93.81511f);
        path2.cubicTo(94.87879f, 91.38663f, 90.14729f, 90.19758f, 86.144485f, 92.34391f);
        path2.cubicTo(74.57527f, 97.93647f, 65.3718f, 107.358154f, 57.246403f, 117.17284f);
        path2.cubicTo(56.807194f, 103.64994f, 57.22644f, 90.11697f, 57.0268f, 76.59407f);
        path2.cubicTo(56.93696f, 74.074905f, 57.056744f, 71.54566f, 57.635704f, 69.08695f);
        instancePath2.lineTo(57.635704f, 69.08695f);
        instancePath2.close();
        WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
        canvas.drawPath(instancePath2, instancePaint5);
        canvas.restore();
        canvas.save();
        Paint instancePaint6 = C24542c.instancePaint(instancePaint, looper);
        instancePaint6.setColor(-2763307);
        float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 49.0f, 0.0f, 1.0f, 61.0f, 0.0f, 0.0f, 1.0f);
        instanceMatrix.reset();
        instanceMatrix.setValues(matrixFloatArray);
        canvas.concat(instanceMatrix);
        canvas.save();
        Paint instancePaint7 = C24542c.instancePaint(instancePaint6, looper);
        Path instancePath3 = C24542c.instancePath(looper);
        instancePath3.moveTo(2.3753123f, 0.44595358f);
        Path path3 = instancePath3;
        path3.cubicTo(5.8817396f, -0.30297858f, 9.508045f, 0.13639496f, 13.064421f, 0.05650886f);
        path3.cubicTo(44.052845f, 0.05650886f, 75.041275f, 0.08646615f, 106.02969f, 0.0465231f);
        path3.cubicTo(108.04764f, 0.05650886f, 110.7349f, 0.1264092f, 111.56406f, 2.3931773f);
        path3.cubicTo(112.26334f, 5.548678f, 111.89372f, 8.824008f, 111.96365f, 12.029438f);
        path3.cubicTo(111.93368f, 35.33621f, 111.93368f, 58.65296f, 111.96365f, 81.95973f);
        path3.cubicTo(111.94367f, 83.996826f, 111.913704f, 86.71295f, 109.61604f, 87.561745f);
        path3.cubicTo(106.44927f, 88.26075f, 103.16262f, 87.90126f, 99.95589f, 87.95119f);
        path3.cubicTo(68.637794f, 87.9412f, 37.329697f, 87.92123f, 6.0215974f, 87.961174f);
        path3.cubicTo(3.9936635f, 87.9412f, 1.3163913f, 87.91125f, 0.44727695f, 85.654465f);
        path3.cubicTo(-0.26200035f, 82.488976f, 0.09763322f, 79.20366f, 0.047684114f, 75.98824f);
        path3.cubicTo(0.06766376f, 52.661503f, 0.06766376f, 29.34475f, 0.037694294f, 6.0180087f);
        path3.cubicTo(0.047684114f, 3.990899f, 0.09763322f, 1.2947434f, 2.3753123f, 0.44595358f);
        instancePath3.lineTo(2.3753123f, 0.44595358f);
        instancePath3.close();
        instancePath3.moveTo(8.026798f, 16.460844f);
        Path path4 = instancePath3;
        path4.cubicTo(8.226439f, 29.746494f, 7.807193f, 43.042046f, 8.246404f, 56.327698f);
        path4.cubicTo(16.371805f, 46.685204f, 25.653442f, 36.862114f, 37.222656f, 31.367676f);
        path4.cubicTo(41.225464f, 29.258999f, 46.28824f, 30.396353f, 49.861816f, 32.782227f);
        path4.cubicTo(58.39648f, 38.118267f, 62.838318f, 47.79399f, 69.67603f, 54.862514f);
        path4.cubicTo(72.85033f, 58.287876f, 75.50556f, 62.22803f, 79.33867f, 65.0f);
        path4.cubicTo(76.56366f, 59.485764f, 72.480995f, 54.644714f, 70.654274f, 48.675083f);
        path4.cubicTo(74.348145f, 45.72705f, 80.42649f, 40.03394f, 86.226074f, 42.60791f);
        path4.cubicTo(93.68268f, 45.94417f, 97.96521f, 54.001225f, 102.776566f, 60.149055f);
        path4.cubicTo(103.1459f, 47.586094f, 102.83646f, 35.013237f, 102.93627f, 22.440376f);
        path4.cubicTo(102.81649f, 17.985428f, 103.41541f, 13.471078f, 102.367294f, 9.085427f);
        path4.cubicTo(71.133415f, 8.966628f, 39.87957f, 8.976528f, 8.635704f, 9.085427f);
        path4.cubicTo(8.056745f, 11.500999f, 7.9369597f, 13.985872f, 8.026798f, 16.460844f);
        instancePath3.close();
        WeChatSVGRenderC2Java.setFillType(instancePath3, 2);
        canvas.drawPath(instancePath3, instancePaint7);
        canvas.restore();
        canvas.restore();
        C24542c.done(looper);
        return 0;
    }
}
