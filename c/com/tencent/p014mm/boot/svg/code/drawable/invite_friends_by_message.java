package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.invite_friends_by_message */
public class invite_friends_by_message extends C24542c {
    private final int height = 108;
    private final int width = 108;

    public int doCommand(int i, Object... objArr) {
        int i2 = i;
        if (i2 == 0 || i2 == 1) {
            return 108;
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
            instancePaint3.setColor(-15028967);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(0.0f, 0.0f);
            instancePath.lineTo(108.0f, 0.0f);
            instancePath.lineTo(108.0f, 108.0f);
            instancePath.lineTo(0.0f, 108.0f);
            instancePath.lineTo(0.0f, 0.0f);
            instancePath.close();
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint, looper);
            instancePaint4.setColor(-1);
            float[] matrixFloatArray = C24542c.setMatrixFloatArray(instanceMatrixArray, 1.0f, 0.0f, 21.0f, 0.0f, 1.0f, 28.0f, 0.0f, 0.0f, 1.0f);
            instanceMatrix.reset();
            instanceMatrix.setValues(matrixFloatArray);
            canvas.concat(instanceMatrix);
            canvas.save();
            Paint instancePaint5 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath2 = C24542c.instancePath(looper);
            instancePath2.moveTo(0.87665254f, 40.186584f);
            instancePath2.cubicTo(0.87664306f, 43.112465f, 3.5488517f, 45.451363f, 6.220223f, 45.595936f);
            instancePath2.lineTo(14.445879f, 45.59904f);
            Path path = instancePath2;
            path.cubicTo(14.949696f, 45.59904f, 15.345015f, 45.979805f, 15.354844f, 46.453613f);
            path.cubicTo(15.354193f, 46.45173f, 15.354193f, 46.45173f, 15.353568f, 46.67424f);
            path.cubicTo(15.3516245f, 47.48045f, 15.35267f, 48.37504f, 15.3589115f, 49.221226f);
            path.cubicTo(15.364601f, 49.99255f, 15.374182f, 50.64234f, 15.388507f, 51.13632f);
            path.cubicTo(15.397058f, 51.431156f, 15.407271f, 51.67059f, 15.420083f, 51.85814f);
            path.cubicTo(15.428529f, 51.98177f, 15.438354f, 52.088585f, 15.451876f, 52.189358f);
            path.cubicTo(15.466083f, 52.29064f, 15.466083f, 52.29064f, 15.497457f, 52.4433f);
            path.cubicTo(15.53565f, 52.638466f, 15.53565f, 52.638466f, 15.819197f, 53.187637f);
            path.cubicTo(17.13255f, 54.20334f, 17.13255f, 54.20334f, 17.982939f, 54.08592f);
            path.cubicTo(18.439087f, 53.95687f, 18.439087f, 53.95687f, 18.627583f, 53.854057f);
            path.cubicTo(18.770927f, 53.775673f, 18.87991f, 53.69908f, 18.99534f, 53.607876f);
            path.cubicTo(19.109406f, 53.51775f, 19.23008f, 53.41098f, 19.375038f, 53.27543f);
            path.cubicTo(19.600636f, 53.06447f, 19.901455f, 52.767365f, 20.278923f, 52.384315f);
            path.cubicTo(20.923569f, 51.730137f, 21.786276f, 50.83074f, 22.81598f, 49.74272f);
            path.cubicTo(23.721895f, 48.784794f, 24.567696f, 47.883434f, 25.40901f, 46.982178f);
            path.cubicTo(25.703396f, 46.66682f, 25.97623f, 46.37396f, 26.220726f, 46.111065f);
            path.cubicTo(26.387348f, 45.931793f, 26.443598f, 45.871277f, 26.478994f, 45.833153f);
            path.cubicTo(26.647337f, 45.683655f, 26.868061f, 45.59919f, 27.095905f, 45.59919f);
            instancePath2.lineTo(58.663773f, 45.59919f);
            instancePath2.cubicTo(62.008965f, 45.66133f, 64.21177f, 42.940216f, 64.120995f, 40.124657f);
            instancePath2.lineTo(64.1221f, 6.2827587f);
            instancePath2.cubicTo(64.203636f, 3.6359596f, 61.691536f, 0.8764129f, 58.663612f, 0.87664306f);
            instancePath2.lineTo(6.031634f, 0.9366137f);
            instancePath2.cubicTo(3.0650446f, 1.0298303f, 0.8320851f, 3.362925f, 0.97887003f, 5.9532685f);
            instancePath2.lineTo(0.87665254f, 40.186584f);
            instancePath2.close();
            instancePath2.moveTo(19.60027f, 46.68448f);
            Path path2 = instancePath2;
            path2.cubicTo(19.600883f, 46.466084f, 19.600883f, 46.466084f, 19.601082f, 46.41845f);
            path2.cubicTo(19.54255f, 43.565197f, 17.245102f, 41.352325f, 14.445879f, 41.352325f);
            instancePath2.lineTo(6.4101787f, 41.352325f);
            instancePath2.cubicTo(5.8434377f, 41.29436f, 5.123357f, 40.65356f, 5.123357f, 40.192924f);
            instancePath2.lineTo(5.225786f, 5.891908f);
            instancePath2.lineTo(5.21884f, 5.713845f);
            instancePath2.cubicTo(5.20579f, 5.5530076f, 5.537754f, 5.2001553f, 6.1014423f, 5.1822567f);
            instancePath2.lineTo(58.66619f, 5.1233554f);
            instancePath2.cubicTo(59.232662f, 5.123314f, 59.887787f, 5.8429694f, 59.87637f, 6.2181654f);
            instancePath2.lineTo(59.875385f, 40.193073f);
            instancePath2.cubicTo(59.894394f, 40.816822f, 59.449318f, 41.366623f, 58.70298f, 41.352837f);
            instancePath2.lineTo(27.095905f, 41.352478f);
            Path path3 = instancePath2;
            path3.cubicTo(25.75011f, 41.352478f, 24.456951f, 41.877434f, 23.493828f, 42.811176f);
            path3.cubicTo(23.360342f, 42.950703f, 23.360342f, 42.950703f, 23.111008f, 43.218967f);
            path3.cubicTo(22.868242f, 43.480003f, 22.59719f, 43.770947f, 22.304676f, 44.0843f);
            path3.cubicTo(21.469137f, 44.97937f, 20.629341f, 45.87433f, 19.840115f, 46.70891f);
            path3.cubicTo(19.785852f, 46.766285f, 19.785852f, 46.766285f, 19.731583f, 46.823635f);
            path3.cubicTo(19.687311f, 46.870415f, 19.643358f, 46.916836f, 19.599728f, 46.96289f);
            path3.cubicTo(19.599867f, 46.86905f, 19.600048f, 46.776176f, 19.60027f, 46.68448f);
            instancePath2.close();
            WeChatSVGRenderC2Java.setFillType(instancePath2, 1);
            canvas.drawPath(instancePath2, instancePaint5);
            canvas.restore();
            canvas.save();
            Paint instancePaint6 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath3 = C24542c.instancePath(looper);
            instancePath3.moveTo(15.0f, 17.123358f);
            instancePath3.lineTo(39.0f, 17.123358f);
            Path path4 = instancePath3;
            path4.cubicTo(40.1727f, 17.123358f, 41.123356f, 16.172697f, 41.123356f, 15.0f);
            path4.cubicTo(41.123356f, 13.827302f, 40.1727f, 12.876643f, 39.0f, 12.876643f);
            instancePath3.lineTo(15.0f, 12.876643f);
            Path path5 = instancePath3;
            path5.cubicTo(13.827302f, 12.876643f, 12.876643f, 13.827302f, 12.876643f, 15.0f);
            path5.cubicTo(12.876643f, 16.172697f, 13.827302f, 17.123358f, 15.0f, 17.123358f);
            instancePath3.close();
            WeChatSVGRenderC2Java.setFillType(instancePath3, 1);
            canvas.drawPath(instancePath3, instancePaint6);
            canvas.restore();
            canvas.save();
            Paint instancePaint7 = C24542c.instancePaint(instancePaint4, looper);
            Path instancePath4 = C24542c.instancePath(looper);
            instancePath4.moveTo(15.0f, 30.123358f);
            instancePath4.lineTo(28.949892f, 30.123358f);
            Path path6 = instancePath4;
            path6.cubicTo(30.12259f, 30.123358f, 31.073248f, 29.172697f, 31.073248f, 28.0f);
            path6.cubicTo(31.073248f, 26.827303f, 30.12259f, 25.876642f, 28.949892f, 25.876642f);
            instancePath4.lineTo(15.0f, 25.876642f);
            Path path7 = instancePath4;
            path7.cubicTo(13.827302f, 25.876642f, 12.876643f, 26.827303f, 12.876643f, 28.0f);
            path7.cubicTo(12.876643f, 29.172697f, 13.827302f, 30.123358f, 15.0f, 30.123358f);
            instancePath4.close();
            WeChatSVGRenderC2Java.setFillType(instancePath4, 1);
            canvas.drawPath(instancePath4, instancePaint7);
            canvas.restore();
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}