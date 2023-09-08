package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.finder_icon_video_playlist_fill */
public class finder_icon_video_playlist_fill extends C24542c {
    private final int height = 16;
    private final int width = 16;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        int i3 = 16;
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
                instancePaint3.setColor(-352965);
                float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 2.0f, 0.0f, 1.0f, 1.333333f, 0.0f, 0.0f, 1.0f);
                instanceMatrix.reset();
                instanceMatrix.setValues(matrixFloatArray);
                canvas.concat(instanceMatrix);
                canvas.save();
                Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(1.5786515f, 2.001095f);
                instancePath.lineTo(10.290743f, 2.0f);
                Path path = instancePath;
                path.cubicTo(10.885089f, 2.0f, 11.100614f, 2.0618837f, 11.317897f, 2.1780884f);
                path.cubicTo(11.535181f, 2.2942932f, 11.705707f, 2.464819f, 11.821912f, 2.682103f);
                path.cubicTo(11.938116f, 2.899387f, 12.0f, 3.114911f, 12.0f, 3.709257f);
                instancePath.lineTo(12.0f, 11.624077f);
                Path path2 = instancePath;
                path2.cubicTo(12.0f, 12.218422f, 11.938116f, 12.433947f, 11.821912f, 12.651231f);
                path2.cubicTo(11.705707f, 12.868514f, 11.535181f, 13.039041f, 11.317897f, 13.155245f);
                path2.cubicTo(11.100614f, 13.27145f, 10.885089f, 13.333333f, 10.290743f, 13.333333f);
                instancePath.lineTo(1.7092568f, 13.333333f);
                Path path3 = instancePath;
                path3.cubicTo(1.114911f, 13.333333f, 0.8993868f, 13.27145f, 0.68210286f, 13.155245f);
                path3.cubicTo(0.46481892f, 13.039041f, 0.2942932f, 12.868514f, 0.17808847f, 12.651231f);
                path3.cubicTo(0.07082257f, 12.450661f, 0.009842002f, 12.251591f, 0.0010950856f, 11.754682f);
                instancePath.lineTo(0.0f, 3.709257f);
                Path path4 = instancePath;
                path4.cubicTo(0.0f, 3.114911f, 0.06188374f, 2.899387f, 0.17808847f, 2.682103f);
                path4.cubicTo(0.2942932f, 2.464819f, 0.46481892f, 2.2942932f, 0.68210286f, 2.1780884f);
                path4.cubicTo(0.88267267f, 2.0708225f, 1.081743f, 2.009842f, 1.5786515f, 2.001095f);
                instancePath.close();
                instancePath.moveTo(5.0f, 5.2895055f);
                instancePath.cubicTo(4.83636f, 5.2895055f, 4.700261f, 5.4074225f, 4.672037f, 5.562922f);
                instancePath.lineTo(4.6666665f, 5.622839f);
                instancePath.lineTo(4.6666665f, 9.710494f);
                Path path5 = instancePath;
                path5.cubicTo(4.6666665f, 9.776302f, 4.686146f, 9.840638f, 4.72265f, 9.895394f);
                path5.cubicTo(4.813421f, 10.031551f, 4.9870276f, 10.079384f, 5.132067f, 10.016612f);
                instancePath.lineTo(5.1849003f, 9.987844f);
                instancePath.lineTo(8.250642f, 7.944017f);
                Path path6 = instancePath;
                path6.cubicTo(8.287259f, 7.9196053f, 8.31868f, 7.888184f, 8.343092f, 7.851567f);
                path6.cubicTo(8.433863f, 7.71541f, 8.411244f, 7.5367603f, 8.297517f, 7.427021f);
                instancePath.lineTo(8.250642f, 7.3893166f);
                instancePath.lineTo(5.1849003f, 5.345489f);
                Path path7 = instancePath;
                path7.cubicTo(5.130144f, 5.308985f, 5.0658083f, 5.2895055f, 5.0f, 5.2895055f);
                instancePath.close();
                instancePath.moveTo(9.333333f, 0.0f);
                path7.cubicTo(10.036242f, 0.0f, 10.61211f, 0.54391855f, 10.66301f, 1.2338251f);
                instancePath.lineTo(10.666667f, 1.3333334f);
                instancePath.lineTo(1.3333334f, 1.3333334f);
                instancePath.cubicTo(1.3333334f, 0.5969537f, 1.930287f, 0.0f, 2.6666667f, 0.0f);
                instancePath.lineTo(9.333333f, 0.0f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint4);
                canvas.restore();
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
