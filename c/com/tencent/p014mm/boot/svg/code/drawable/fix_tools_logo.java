package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.fix_tools_logo */
public class fix_tools_logo extends C24542c {
    private final int height = 60;
    private final int width = 60;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 60;
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-5592406);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 6.0f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(47.93003f, 28.93863f);
                Path path = instancePath;
                path.cubicTo(46.569485f, 28.93863f, 45.48105f, 27.860409f, 45.48105f, 26.512636f);
                path.cubicTo(45.48105f, 25.164862f, 46.569485f, 24.086643f, 47.93003f, 24.086643f);
                path.cubicTo(49.290573f, 24.086643f, 50.37901f, 25.164862f, 50.37901f, 26.512636f);
                path.cubicTo(50.37901f, 27.79302f, 49.290573f, 28.93863f, 47.93003f, 28.93863f);
                instancePath.moveTo(35.860058f, 28.93863f);
                Path path2 = instancePath;
                path2.cubicTo(34.499516f, 28.93863f, 33.41108f, 27.860409f, 33.41108f, 26.512636f);
                path2.cubicTo(33.41108f, 25.164862f, 34.499516f, 24.086643f, 35.860058f, 24.086643f);
                path2.cubicTo(37.220604f, 24.086643f, 38.309036f, 25.164862f, 38.309036f, 26.512636f);
                path2.cubicTo(38.309036f, 27.79302f, 37.220604f, 28.93863f, 35.860058f, 28.93863f);
                instancePath.moveTo(53.770905f, 42.55556f);
                Path path3 = instancePath;
                path3.cubicTo(57.588737f, 39.833344f, 60.0f, 35.78321f, 60.0f, 31.334707f);
                path3.cubicTo(60.0f, 23.101652f, 51.962456f, 16.462093f, 41.982506f, 16.462093f);
                path3.cubicTo(32.00256f, 16.462093f, 23.965015f, 23.101652f, 23.965015f, 31.334707f);
                path3.cubicTo(23.965015f, 39.56776f, 32.00256f, 46.207317f, 41.982506f, 46.207317f);
                path3.cubicTo(44.058872f, 46.207317f, 46.001278f, 45.94174f, 47.876705f, 45.410572f);
                path3.cubicTo(48.010666f, 45.344177f, 48.211605f, 45.344177f, 48.41254f, 45.344177f);
                path3.cubicTo(48.74744f, 45.344177f, 49.082336f, 45.476967f, 49.350254f, 45.60976f);
                instancePath.lineTo(53.302048f, 47.86721f);
                Path path4 = instancePath;
                path4.cubicTo(53.436005f, 47.933605f, 53.502987f, 48.0f, 53.636944f, 48.0f);
                path4.cubicTo(53.971844f, 48.0f, 54.23976f, 47.734417f, 54.23976f, 47.40244f);
                path4.cubicTo(54.23976f, 47.26965f, 54.172783f, 47.136856f, 54.172783f, 46.93767f);
                path4.cubicTo(54.172783f, 46.871273f, 53.636944f, 45.078594f, 53.369026f, 43.949867f);
                path4.cubicTo(53.302048f, 43.817078f, 53.302048f, 43.684288f, 53.302048f, 43.551495f);
                path4.cubicTo(53.23507f, 43.086727f, 53.436005f, 42.75475f, 53.770905f, 42.55556f);
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.save();
                Paint instancePaint5 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath2 = C24542c.instancePath(looper);
                instancePath2.moveTo(28.688047f, 14.902527f);
                Path path5 = instancePath2;
                path5.cubicTo(27.125906f, 14.902527f, 25.889214f, 13.677441f, 25.889214f, 12.129964f);
                path5.cubicTo(25.889214f, 10.582487f, 27.125906f, 9.357401f, 28.688047f, 9.357401f);
                path5.cubicTo(30.250187f, 9.357401f, 31.486881f, 10.582487f, 31.486881f, 12.129964f);
                path5.cubicTo(31.486881f, 13.612963f, 30.250187f, 14.902527f, 28.688047f, 14.902527f);
                instancePath2.moveTo(14.344024f, 14.902527f);
                Path path6 = instancePath2;
                path6.cubicTo(12.781883f, 14.902527f, 11.54519f, 13.677441f, 11.54519f, 12.129964f);
                path6.cubicTo(11.54519f, 10.582487f, 12.781883f, 9.357401f, 14.344024f, 9.357401f);
                path6.cubicTo(15.906163f, 9.357401f, 17.142857f, 10.582487f, 17.142857f, 12.129964f);
                path6.cubicTo(17.142857f, 13.612963f, 15.906163f, 14.902527f, 14.344024f, 14.902527f);
                instancePath2.moveTo(21.683867f, 0.0f);
                Path path7 = instancePath2;
                path7.cubicTo(9.734243f, 0.0f, 0.0f, 7.9528785f, 0.0f, 17.827703f);
                path7.cubicTo(0.0f, 23.195896f, 2.8867068f, 28.033897f, 7.518864f, 31.281322f);
                path7.cubicTo(7.8545275f, 31.54642f, 8.123058f, 31.944063f, 8.123058f, 32.474255f);
                path7.cubicTo(8.123058f, 32.606804f, 8.055925f, 32.805626f, 8.055925f, 32.93817f);
                path7.cubicTo(7.720262f, 34.263653f, 7.116068f, 36.450695f, 7.048935f, 36.516968f);
                path7.cubicTo(6.9818025f, 36.71579f, 6.9146695f, 36.84834f, 6.9146695f, 37.04716f);
                path7.cubicTo(6.9146695f, 37.444805f, 7.2503333f, 37.776173f, 7.6531296f, 37.776173f);
                path7.cubicTo(7.787395f, 37.776173f, 7.9216604f, 37.7099f, 8.055925f, 37.643627f);
                instancePath2.lineTo(12.822349f, 34.92639f);
                Path path8 = instancePath2;
                path8.cubicTo(13.158012f, 34.72757f, 13.560808f, 34.59502f, 13.963605f, 34.59502f);
                path8.cubicTo(14.165003f, 34.59502f, 14.366401f, 34.59502f, 14.567799f, 34.661297f);
                path8.cubicTo(16.783178f, 35.257763f, 19.199957f, 35.655407f, 21.616734f, 35.655407f);
                instancePath2.lineTo(22.825123f, 35.655407f);
                Path path9 = instancePath2;
                path9.cubicTo(22.355194f, 34.263653f, 22.086662f, 32.805626f, 22.086662f, 31.281322f);
                path9.cubicTo(22.086662f, 22.334333f, 30.948181f, 15.044195f, 41.82368f, 15.044195f);
                instancePath2.lineTo(43.03207f, 15.044195f);
                instancePath2.cubicTo(41.488018f, 6.4948506f, 32.492233f, 0.0f, 21.683867f, 0.0f);
                WeChatSVGRenderC2Java.setFillType(instancePath2, 2);
                canvas.drawPath(instancePath2, instancePaint5);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
