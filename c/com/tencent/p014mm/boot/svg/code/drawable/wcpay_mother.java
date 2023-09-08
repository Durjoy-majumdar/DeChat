package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.wcpay_mother */
public class wcpay_mother extends C24542c {
    private final int height = 48;
    private final int width = 48;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 48;
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
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, -293.0f, 0.0f, 1.0f, -143.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray2 = C24542c.setMatrixFloatArray(matrixFloatArray, 1.0f, 0.0f, 300.0f, 0.0f, 1.0f, 145.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray2);
            canvas.concat(instanceMatrix);
            canvas.save();
            float[] matrixFloatArray3 = C24542c.setMatrixFloatArray(matrixFloatArray2, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.799517f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray3);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(23.019123f, 1.6487558f);
            instancePath.lineTo(23.29213f, 1.8165311f);
            instancePath.lineTo(23.625f, 2.0354826f);
            instancePath.lineTo(23.715187f, 2.061052f);
            instancePath.cubicTo(24.366203f, 2.2521503f, 25.15958f, 2.6278105f, 25.971018f, 3.25831f);
            instancePath.lineTo(26.214867f, 3.4551756f);
            instancePath.lineTo(26.438711f, 3.649428f);
            instancePath.cubicTo(28.196762f, 5.2281213f, 29.268568f, 7.572654f, 29.34555f, 10.74222f);
            instancePath.lineTo(29.35f, 11.111604f);
            instancePath.lineTo(29.35f, 19.603693f);
            instancePath.cubicTo(29.35f, 22.158451f, 27.401445f, 24.279627f, 24.943455f, 24.395498f);
            instancePath.lineTo(24.731556f, 24.400482f);
            instancePath.lineTo(23.964575f, 24.401035f);
            instancePath.cubicTo(23.434572f, 25.061325f, 22.814665f, 25.645948f, 22.11999f, 26.133602f);
            instancePath.lineTo(22.11885f, 27.242f);
            instancePath.lineTo(22.404703f, 27.406551f);
            instancePath.cubicTo(23.015162f, 27.77264f, 23.581078f, 28.177221f, 24.102007f, 28.62028f);
            instancePath.lineTo(27.675152f, 29.624704f);
            instancePath.lineTo(28.321682f, 29.81585f);
            instancePath.lineTo(28.863226f, 29.986774f);
            instancePath.lineTo(29.186125f, 30.09596f);
            instancePath.cubicTo(31.385311f, 30.86183f, 32.290592f, 31.753017f, 32.688637f, 33.681843f);
            instancePath.lineTo(34.412853f, 42.04154f);
            Path path = instancePath;
            path.cubicTo(34.500637f, 42.47456f, 34.220764f, 42.89675f, 33.787746f, 42.984535f);
            path.cubicTo(33.390812f, 43.065002f, 33.00297f, 42.836536f, 32.873474f, 42.464367f);
            instancePath.lineTo(32.84475f, 42.35943f);
            instancePath.lineTo(31.121307f, 34.003525f);
            instancePath.cubicTo(30.847527f, 32.676853f, 30.363293f, 32.200157f, 28.659918f, 31.606955f);
            instancePath.lineTo(28.357613f, 31.50482f);
            instancePath.lineTo(27.842928f, 31.342638f);
            instancePath.lineTo(27.220642f, 31.15885f);
            instancePath.lineTo(25.065191f, 30.554255f);
            instancePath.cubicTo(25.249992f, 32.28954f, 24.429983f, 34.544422f, 22.594872f, 35.278816f);
            instancePath.lineTo(22.441843f, 35.32298f);
            instancePath.lineTo(17.399652f, 36.248264f);
            Path path2 = instancePath;
            path2.cubicTo(17.319902f, 36.27445f, 17.23431f, 36.28821f, 17.144823f, 36.28696f);
            path2.cubicTo(17.03676f, 36.29108f, 16.9349f, 36.27458f, 16.84168f, 36.240974f);
            instancePath.lineTo(12.295364f, 35.320194f);
            instancePath.lineTo(12.156775f, 35.278816f);
            instancePath.cubicTo(10.31147f, 34.540344f, 9.492577f, 32.264442f, 9.689629f, 30.525387f);
            instancePath.lineTo(6.0289235f, 31.577305f);
            instancePath.lineTo(5.6123304f, 31.73734f);
            instancePath.cubicTo(4.243143f, 32.28541f, 3.7848f, 32.73125f, 3.5290778f, 33.84081f);
            instancePath.lineTo(2.9987595f, 36.372227f);
            instancePath.lineTo(2.1848586f, 40.338207f);
            instancePath.lineTo(1.9028971f, 41.75088f);
            instancePath.lineTo(1.7854489f, 42.35237f);
            Path path3 = instancePath;
            path3.cubicTo(1.7015634f, 42.786163f, 1.2819033f, 43.069817f, 0.84811175f, 42.98593f);
            path3.cubicTo(0.41432032f, 42.902046f, 0.13066556f, 42.482388f, 0.2145511f, 42.048595f);
            instancePath.lineTo(0.5397557f, 40.402905f);
            instancePath.lineTo(1.0823597f, 37.738f);
            instancePath.lineTo(1.9263947f, 33.682854f);
            instancePath.cubicTo(2.3006654f, 31.836061f, 3.1095037f, 31.025042f, 5.059078f, 30.23966f);
            instancePath.lineTo(5.529551f, 30.058414f);
            instancePath.lineTo(10.716836f, 28.56355f);
            instancePath.cubicTo(11.336241f, 28.044497f, 12.018291f, 27.579048f, 12.762257f, 27.167229f);
            instancePath.lineTo(12.4958515f, 27.32f);
            instancePath.lineTo(12.498678f, 26.92315f);
            Path path4 = instancePath;
            path4.cubicTo(12.5007f, 26.726604f, 12.50394f, 26.540672f, 12.50872f, 26.357546f);
            path4.cubicTo(11.700446f, 25.83701f, 10.970969f, 25.178371f, 10.3534775f, 24.40124f);
            instancePath.lineTo(9.568443f, 24.400482f);
            instancePath.cubicTo(7.082518f, 24.400482f, 5.0649095f, 22.350273f, 4.9547386f, 19.821573f);
            instancePath.lineTo(4.95f, 19.603693f);
            instancePath.lineTo(4.95f, 12.671848f);
            Path path5 = instancePath;
            path5.cubicTo(4.95f, 9.157211f, 6.325306f, 5.866888f, 8.71334f, 3.4886868f);
            path5.cubicTo(12.613734f, -0.3922975f, 18.443535f, -1.0791742f, 23.019123f, 1.6487558f);
            instancePath.close();
            instancePath.moveTo(21.794851f, 29.115f);
            instancePath.lineTo(18.691647f, 34.383f);
            instancePath.lineTo(22.055851f, 33.767f);
            instancePath.lineTo(22.1602f, 33.719173f);
            instancePath.cubicTo(23.44505f, 33.037434f, 23.784876f, 30.720198f, 23.29475f, 30.055744f);
            instancePath.lineTo(23.285948f, 30.054651f);
            instancePath.cubicTo(23.234081f, 30.039726f, 23.183926f, 30.019611f, 23.136229f, 29.994652f);
            instancePath.lineTo(23.066622f, 29.953617f);
            instancePath.lineTo(21.794851f, 29.115f);
            instancePath.close();
            instancePath.moveTo(12.879851f, 29.074f);
            instancePath.lineTo(11.576851f, 29.934f);
            instancePath.lineTo(11.531179f, 29.973627f);
            instancePath.cubicTo(10.937023f, 30.499643f, 11.246446f, 33.005516f, 12.591448f, 33.719173f);
            instancePath.lineTo(12.751244f, 33.79335f);
            instancePath.lineTo(12.698f, 33.768f);
            instancePath.lineTo(15.659f, 34.368f);
            instancePath.lineTo(12.879851f, 29.074f);
            instancePath.close();
            instancePath.moveTo(20.260265f, 27.129118f);
            instancePath.cubicTo(18.161133f, 27.944408f, 15.998489f, 27.894356f, 14.097112f, 27.16488f);
            instancePath.lineTo(14.095588f, 27.842752f);
            instancePath.lineTo(14.088851f, 27.934f);
            instancePath.lineTo(17.171852f, 33.808f);
            instancePath.lineTo(20.553276f, 28.071943f);
            instancePath.cubicTo(20.542038f, 28.034369f, 20.533524f, 27.995834f, 20.52789f, 27.956627f);
            instancePath.lineTo(20.519754f, 27.842752f);
            instancePath.lineTo(20.52f, 27.02344f);
            instancePath.cubicTo(20.434164f, 27.059986f, 20.34758f, 27.095222f, 20.260265f, 27.129118f);
            instancePath.close();
            instancePath.moveTo(22.968498f, 8.737112f);
            instancePath.cubicTo(21.167128f, 9.91772f, 18.888115f, 10.469607f, 16.19922f, 9.932211f);
            instancePath.lineTo(15.86098f, 9.859329f);
            instancePath.lineTo(15.60852f, 9.806638f);
            Path path6 = instancePath;
            path6.cubicTo(13.772192f, 9.464785f, 12.265848f, 10.098558f, 11.022617f, 11.402806f);
            path6.cubicTo(10.731878f, 11.707814f, 10.474784f, 12.031693f, 10.25222f, 12.358925f);
            instancePath.lineTo(10.091786f, 12.604734f);
            instancePath.lineTo(9.958648f, 12.825407f);
            instancePath.lineTo(9.875f, 12.974f);
            instancePath.lineTo(9.87596f, 17.970634f);
            instancePath.lineTo(9.881502f, 18.827585f);
            instancePath.lineTo(9.905244f, 19.108372f);
            Path path7 = instancePath;
            path7.cubicTo(10.43877f, 24.340462f, 15.236116f, 27.364025f, 19.681105f, 25.637619f);
            path7.cubicTo(22.42543f, 24.572212f, 24.305449f, 21.875729f, 24.413664f, 18.794445f);
            instancePath.lineTo(24.418596f, 18.513302f);
            instancePath.lineTo(24.420149f, 12.734815f);
            instancePath.lineTo(24.424816f, 12.450826f);
            Path path8 = instancePath;
            path8.cubicTo(24.4164f, 11.280812f, 24.181705f, 10.00157f, 23.599499f, 8.921157f);
            path8.cubicTo(23.465897f, 8.673255f, 23.181978f, 8.5971775f, 22.968498f, 8.737112f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            canvas.restore();
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}