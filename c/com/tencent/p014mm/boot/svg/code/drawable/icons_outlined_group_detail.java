package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_group_detail */
public class icons_outlined_group_detail extends C24542c {
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
            instancePath.moveTo(6.6f, 59.4f);
            instancePath.lineTo(56.4f, 59.4f);
            instancePath.lineTo(56.4f, 57.94639f);
            instancePath.cubicTo(56.4f, 57.25818f, 55.69404f, 56.13006f, 55.07943f, 55.83026f);
            instancePath.lineTo(38.09837f, 47.54712f);
            instancePath.cubicTo(33.518623f, 45.31318f, 32.38672f, 39.90874f, 35.66801f, 36.019104f);
            instancePath.lineTo(36.75261f, 34.733425f);
            instancePath.cubicTo(38.406586f, 32.772804f, 39.9f, 28.693172f, 39.9f, 26.130558f);
            instancePath.lineTo(39.9f, 21.000622f);
            Path path = instancePath;
            path.cubicTo(39.9f, 16.364742f, 36.13677f, 12.6f, 31.5f, 12.6f);
            path.cubicTo(26.868927f, 12.6f, 23.1f, 16.365608f, 23.1f, 20.998741f);
            instancePath.lineTo(23.1f, 26.127872f);
            instancePath.cubicTo(23.1f, 28.696991f, 24.58724f, 32.76145f, 26.247236f, 34.728935f);
            instancePath.lineTo(27.331833f, 36.01444f);
            instancePath.cubicTo(30.61991f, 39.91158f, 29.475643f, 45.31095f, 24.902159f, 47.54276f);
            instancePath.lineTo(7.9210987f, 55.82933f);
            instancePath.cubicTo(7.3110514f, 56.127026f, 6.6f, 57.26603f, 6.6f, 57.94639f);
            instancePath.lineTo(6.6f, 59.4f);
            instancePath.close();
            instancePath.moveTo(40.488285f, 13.051927f);
            Path path2 = instancePath;
            path2.cubicTo(41.84724f, 12.378793f, 43.379875f, 12.0f, 45.0f, 12.0f);
            path2.cubicTo(50.580982f, 12.0f, 55.105263f, 16.48245f, 55.105263f, 22.000519f);
            instancePath.lineTo(55.105263f, 26.275465f);
            instancePath.cubicTo(55.105263f, 29.12324f, 53.591827f, 33.20715f, 51.74043f, 35.378933f);
            instancePath.lineTo(50.827084f, 36.450333f);
            instancePath.cubicTo(49.337765f, 38.197376f, 49.803f, 40.420994f, 51.885597f, 41.426277f);
            instancePath.lineTo(66.18544f, 48.328896f);
            instancePath.cubicTo(67.739876f, 49.07923f, 69.0f, 51.062923f, 69.0f, 52.78866f);
            instancePath.lineTo(69.0f, 54.503906f);
            instancePath.cubicTo(69.0f, 55.88246f, 67.86082f, 57.0f, 66.47007f, 57.0f);
            instancePath.lineTo(59.902935f, 57.0f);
            instancePath.cubicTo(59.96636f, 57.3184f, 60.0f, 57.635876f, 60.0f, 57.94639f);
            instancePath.lineTo(60.0f, 60.004684f);
            instancePath.cubicTo(60.0f, 61.65895f, 58.647224f, 63.0f, 56.995712f, 63.0f);
            instancePath.lineTo(6.0042887f, 63.0f);
            instancePath.cubicTo(4.345066f, 63.0f, 3.0f, 61.667267f, 3.0f, 60.004684f);
            instancePath.lineTo(3.0f, 57.94639f);
            instancePath.cubicTo(3.0f, 55.891125f, 4.494453f, 53.495724f, 6.342293f, 52.593998f);
            instancePath.lineTo(23.323353f, 44.30743f);
            instancePath.cubicTo(25.78613f, 43.10562f, 26.358778f, 40.443787f, 24.580336f, 38.33592f);
            instancePath.lineTo(23.495739f, 37.050415f);
            instancePath.cubicTo(21.288954f, 34.434856f, 19.5f, 29.548489f, 19.5f, 26.127872f);
            instancePath.lineTo(19.5f, 20.998741f);
            Path path3 = instancePath;
            path3.cubicTo(19.5f, 14.37202f, 24.886068f, 9.0f, 31.5f, 9.0f);
            path3.cubicTo(35.077705f, 9.0f, 38.289722f, 10.567534f, 40.488262f, 13.051901f);
            instancePath.close();
            instancePath.moveTo(42.45947f, 16.10792f);
            instancePath.cubicTo(43.128166f, 17.602604f, 43.5f, 19.258608f, 43.5f, 21.000622f);
            instancePath.lineTo(43.5f, 26.130558f);
            instancePath.cubicTo(43.5f, 29.547888f, 41.702797f, 34.44858f, 39.50426f, 37.054718f);
            instancePath.lineTo(38.419662f, 38.340397f);
            instancePath.cubicTo(36.651096f, 40.43685f, 37.203564f, 43.105194f, 39.676647f, 44.31153f);
            instancePath.lineTo(56.657707f, 52.594673f);
            instancePath.cubicTo(57.07018f, 52.79587f, 57.4652f, 53.07097f, 57.82997f, 53.4f);
            instancePath.lineTo(65.4f, 53.4f);
            instancePath.lineTo(65.4f, 52.78866f);
            instancePath.cubicTo(65.4f, 52.45379f, 64.93892f, 51.72466f, 64.620476f, 51.570946f);
            instancePath.lineTo(50.32064f, 44.668327f);
            instancePath.cubicTo(46.11839f, 42.639877f, 45.064598f, 37.66082f, 48.08746f, 34.114857f);
            instancePath.lineTo(49.000805f, 33.043457f);
            instancePath.cubicTo(50.30037f, 31.519003f, 51.505264f, 28.261824f, 51.505264f, 26.275465f);
            instancePath.lineTo(51.505264f, 22.000519f);
            Path path4 = instancePath;
            path4.cubicTo(51.505264f, 18.477085f, 48.59906f, 15.6f, 45.0f, 15.6f);
            path4.cubicTo(44.098434f, 15.6f, 43.239876f, 15.781061f, 42.45947f, 16.107916f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
