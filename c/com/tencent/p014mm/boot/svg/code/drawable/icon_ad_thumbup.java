package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icon_ad_thumbup */
public class icon_ad_thumbup extends C24542c {
    private final int height = 20;
    private final int width = 20;

    public int doCommand(int i, Object... objArr) {
        int i2 = 20;
        if (!(i == 0 || i == 1)) {
            i2 = 0;
            if (i == 2) {
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
                canvas.save();
                Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
                instancePaint3.setColor(-436207616);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(13.192f, 6.56351f);
                Path path = instancePath;
                path.cubicTo(13.192f, 4.89674f, 13.055f, 4.1039f, 12.5449f, 3.35241f);
                path.cubicTo(12.0637f, 2.64339f, 10.8492f, 2.22955f, 9.83251f, 2.70174f);
                path.cubicTo(9.07179f, 3.055f, 8.92614f, 3.5444f, 8.87743f, 4.91798f);
                path.cubicTo(8.86669f, 5.22085f, 8.86511f, 5.26283f, 8.85879f, 5.39625f);
                path.cubicTo(8.81113f, 6.40387f, 8.76662f, 6.74441f, 8.63554f, 7.09154f);
                path.cubicTo(8.40372f, 7.70454f, 8.0949f, 8.05325f, 7.57084f, 8.36051f);
                path.cubicTo(7.10324f, 8.63468f, 6.84875f, 8.7559f, 6.54244f, 8.82335f);
                path.cubicTo(6.10831f, 8.91889f, 5.74442f, 8.95539f, 5.35531f, 8.95539f);
                instancePath.lineTo(3.7931f, 8.95539f);
                instancePath.cubicTo(3.08073f, 8.95539f, 2.5f, 9.52604f, 2.5f, 10.2342f);
                instancePath.lineTo(2.5f, 16.3013f);
                Path path2 = instancePath;
                path2.cubicTo(2.5f, 17.0064f, 3.07431f, 17.5759f, 3.78344f, 17.5801f);
                path2.cubicTo(8.87411f, 17.6126f, 11.7232f, 17.6186f, 12.2797f, 17.5732f);
                path2.cubicTo(13.1731f, 17.5f, 14.3294f, 17.0658f, 14.9049f, 16.5918f);
                path2.cubicTo(16.8233f, 15.0127f, 17.2343f, 10.5932f, 16.4175f, 8.77316f);
                path2.cubicTo(16.1887f, 8.26326f, 15.7385f, 7.9226f, 15.1517f, 7.71075f);
                path2.cubicTo(14.6791f, 7.54016f, 14.2181f, 7.47935f, 13.8765f, 7.47375f);
                path2.cubicTo(13.799f, 7.47502f, 13.6642f, 7.45013f, 13.539f, 7.37792f);
                path2.cubicTo(13.3231f, 7.25343f, 13.192f, 7.0183f, 13.192f, 6.56351f);
                instancePath.close();
                instancePath.moveTo(10.2537f, 3.60871f);
                Path path3 = instancePath;
                path3.cubicTo(10.7702f, 3.3688f, 11.4776f, 3.56055f, 11.7175f, 3.91406f);
                path3.cubicTo(12.0765f, 4.4429f, 12.192f, 5.0327f, 12.192f, 6.56351f);
                path3.cubicTo(12.192f, 7.32007f, 12.461f, 7.91066f, 13.0394f, 8.24421f);
                path3.cubicTo(13.3074f, 8.39875f, 13.618f, 8.47812f, 13.8929f, 8.47362f);
                path3.cubicTo(14.1539f, 8.47843f, 14.4953f, 8.53699f, 14.8121f, 8.65135f);
                path3.cubicTo(15.1914f, 8.78827f, 15.4074f, 8.96489f, 15.5051f, 9.18259f);
                path3.cubicTo(16.2535f, 10.8501f, 15.6511f, 14.6823f, 14.2694f, 15.8198f);
                path3.cubicTo(13.8575f, 16.159f, 12.8944f, 16.5195f, 12.198f, 16.5765f);
                path3.cubicTo(11.7276f, 16.6149f, 9.27711f, 16.6151f, 3.78981f, 16.5801f);
                path3.cubicTo(3.62679f, 16.5792f, 3.5f, 16.453f, 3.5f, 16.3013f);
                instancePath.lineTo(3.5f, 10.2342f);
                instancePath.cubicTo(3.5f, 10.0825f, 3.62882f, 9.95539f, 3.7931f, 9.95539f);
                instancePath.lineTo(5.35531f, 9.95539f);
                Path path4 = instancePath;
                path4.cubicTo(5.83065f, 9.95539f, 6.26626f, 9.90805f, 6.75737f, 9.79998f);
                path4.cubicTo(7.17689f, 9.70761f, 7.50586f, 9.55784f, 8.07665f, 9.22316f);
                path4.cubicTo(8.80961f, 8.79342f, 9.26298f, 8.25946f, 9.57089f, 7.44527f);
                path4.cubicTo(9.75049f, 6.96962f, 9.80514f, 6.55414f, 9.85767f, 5.4435f);
                path4.cubicTo(9.86408f, 5.30814f, 9.86566f, 5.26765f, 9.8768f, 4.95342f);
                path4.cubicTo(9.91613f, 3.84447f, 9.95576f, 3.74707f, 10.2537f, 3.60871f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i2;
    }
}
