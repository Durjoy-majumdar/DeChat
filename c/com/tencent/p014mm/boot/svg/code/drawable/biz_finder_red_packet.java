package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.biz_finder_red_packet */
public class biz_finder_red_packet extends C24542c {
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
                instancePaint3.setColor(-372399);
                Path instancePath = C24542c.instancePath(looper);
                instancePath.moveTo(13.5f, 8.75149f);
                instancePath.lineTo(12.0311f, 8.75149f);
                Path path = instancePath;
                path.cubicTo(12.1352f, 8.54415f, 12.1938f, 8.30977f, 12.1938f, 8.06133f);
                path.cubicTo(12.1938f, 7.21422f, 11.5121f, 6.52993f, 10.6741f, 6.52993f);
                path.cubicTo(10.259f, 6.52993f, 9.86934f, 6.69916f, 9.58508f, 6.99323f);
                path.cubicTo(8.72588f, 7.85576f, 8.3398f, 8.24353f, 8.00001f, 8.58458f);
                instancePath.lineTo(6.3806f, 6.95894f);
                Path path2 = instancePath;
                path2.cubicTo(6.09366f, 6.68304f, 5.72113f, 6.52993f, 5.32607f, 6.52993f);
                path2.cubicTo(4.48806f, 6.52993f, 3.80619f, 7.21422f, 3.80619f, 8.06133f);
                path2.cubicTo(3.80619f, 8.30977f, 3.86495f, 8.54415f, 3.96891f, 8.75149f);
                instancePath.lineTo(2.50001f, 8.75149f);
                instancePath.lineTo(2.50001f, 2.96628f);
                Path path3 = instancePath;
                path3.cubicTo(2.50001f, 2.57865f, 2.76965f, 2.12287f, 3.11454f, 1.95118f);
                path3.cubicTo(3.11454f, 1.95118f, 3.14324f, 1.9352f, 3.23554f, 1.89586f);
                path3.cubicTo(4.52227f, 1.34706f, 6.18193f, 1.0f, 8.00001f, 1.0f);
                path3.cubicTo(9.81582f, 1.0f, 11.4782f, 1.33491f, 12.7595f, 1.89368f);
                path3.cubicTo(12.8369f, 1.92741f, 12.8815f, 1.94927f, 12.8815f, 1.94927f);
                path3.cubicTo(13.2231f, 2.12341f, 13.5f, 2.57879f, 13.5f, 2.96628f);
                instancePath.lineTo(13.5f, 8.75149f);
                instancePath.close();
                instancePath.moveTo(13.5f, 9.59145f);
                instancePath.lineTo(13.5f, 14.3f);
                instancePath.cubicTo(13.5f, 14.6875f, 13.1943f, 15.0f, 12.812f, 15.0f);
                instancePath.lineTo(3.18804f, 15.0f);
                instancePath.cubicTo(2.808f, 15.0f, 2.5f, 14.6873f, 2.5f, 14.3f);
                instancePath.lineTo(2.5f, 9.59145f);
                instancePath.lineTo(5.2614f, 9.59145f);
                instancePath.cubicTo(5.28287f, 9.59241f, 5.30446f, 9.59282f, 5.32606f, 9.59282f);
                instancePath.lineTo(6.99551f, 9.59282f);
                instancePath.cubicTo(6.41345f, 10.1719f, 5.51816f, 10.9309f, 4.31259f, 11.8659f);
                instancePath.lineTo(4.81241f, 12.534f);
                instancePath.cubicTo(6.06655f, 11.5614f, 6.99726f, 10.7707f, 7.60789f, 10.1579f);
                instancePath.lineTo(8.0f, 9.76423f);
                Path path4 = instancePath;
                path4.cubicTo(8.11617f, 9.88088f, 8.2467f, 10.0119f, 8.4007f, 10.1663f);
                path4.cubicTo(9.00932f, 10.7774f, 9.93721f, 11.5654f, 11.1877f, 12.5342f);
                instancePath.lineTo(11.6873f, 11.8657f);
                instancePath.cubicTo(10.4797f, 10.93f, 9.5844f, 10.1711f, 9.00449f, 9.59282f);
                instancePath.lineTo(10.6741f, 9.59282f);
                instancePath.cubicTo(10.6958f, 9.59282f, 10.7173f, 9.59241f, 10.7387f, 9.59145f);
                instancePath.lineTo(13.5f, 9.59145f);
                instancePath.close();
                instancePath.moveTo(10.7182f, 8.75143f);
                instancePath.lineTo(9.00887f, 8.75143f);
                instancePath.lineTo(10.1688f, 7.58691f);
                Path path5 = instancePath;
                path5.cubicTo(10.3036f, 7.44745f, 10.4821f, 7.36987f, 10.6742f, 7.36987f);
                path5.cubicTo(11.0592f, 7.36987f, 11.3688f, 7.68088f, 11.3688f, 8.06127f);
                path5.cubicTo(11.3688f, 8.42732f, 11.0825f, 8.72876f, 10.7182f, 8.75143f);
                instancePath.lineTo(10.7182f, 8.75143f);
                instancePath.close();
                instancePath.moveTo(5.28211f, 8.75143f);
                path5.cubicTo(4.91777f, 8.72876f, 4.63136f, 8.42718f, 4.63136f, 8.06127f);
                path5.cubicTo(4.63136f, 7.68088f, 4.94111f, 7.36987f, 5.32611f, 7.36987f);
                path5.cubicTo(5.50895f, 7.36987f, 5.67945f, 7.43994f, 5.80796f, 7.56341f);
                path5.cubicTo(6.35675f, 8.11426f, 6.71506f, 8.47417f, 6.99127f, 8.75143f);
                instancePath.lineTo(5.28211f, 8.75143f);
                instancePath.close();
                WeChatSVGRenderC2Java.setFillType(instancePath, 2);
                canvas.drawPath(instancePath, instancePaint3);
                canvas.restore();
                C24542c.done(looper);
            }
        }
        return i3;
    }
}
