package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.game_comment_like_dark */
public class game_comment_like_dark extends C24542c {
    private final int height = 12;
    private final int width = 11;

    public int doCommand(int i, Object... objArr) {
        if (i == 0) {
            return 11;
        }
        if (i == 1) {
            return 12;
        }
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
            instancePaint3.setColor(-419430401);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(7.03533f, 1.31129f);
            Path path = instancePath;
            path.cubicTo(7.39243f, 1.83733f, 7.48831f, 2.39232f, 7.48831f, 3.55906f);
            path.cubicTo(7.48831f, 3.67052f, 7.47788f, 3.75267f, 7.4692f, 3.821f);
            path.cubicTo(7.45309f, 3.94783f, 7.44303f, 4.02702f, 7.517f, 4.15752f);
            path.cubicTo(7.75612f, 4.16143f, 8.96675f, 4.24271f, 9.29756f, 4.36213f);
            path.cubicTo(9.70838f, 4.51042f, 10.0235f, 4.74888f, 10.1836f, 5.10581f);
            path.cubicTo(10.7554f, 6.37982f, 10.0376f, 9.81825f, 8.69477f, 10.9236f);
            path.cubicTo(8.37451f, 11.1874f, 7.79272f, 11.2157f, 7.25342f, 11.2419f);
            path.cubicTo(7.11427f, 11.2487f, 6.97794f, 11.2553f, 6.84967f, 11.2658f);
            path.cubicTo(6.46015f, 11.2976f, 4.46578f, 11.2934f, 0.902313f, 11.2707f);
            path.cubicTo(0.405923f, 11.2677f, 0.00390625f, 10.8691f, 0.00390625f, 10.3755f);
            instancePath.lineTo(0.00390625f, 6.12855f);
            instancePath.cubicTo(0.00390625f, 5.63283f, 0.410414f, 5.23338f, 0.909074f, 5.23338f);
            instancePath.lineTo(2.00263f, 5.23338f);
            Path path2 = instancePath;
            path2.cubicTo(2.275f, 5.23338f, 2.52972f, 5.20782f, 2.83362f, 5.14094f);
            path2.cubicTo(3.04803f, 5.09373f, 3.22618f, 5.00888f, 3.55349f, 4.81696f);
            path2.cubicTo(3.92034f, 4.60188f, 4.13651f, 4.35778f, 4.29879f, 3.92868f);
            path2.cubicTo(4.39054f, 3.68569f, 4.42169f, 3.44731f, 4.45506f, 2.74197f);
            path2.cubicTo(4.45948f, 2.64858f, 4.46059f, 2.61919f, 4.46811f, 2.40718f);
            path2.cubicTo(4.50221f, 1.44568f, 4.60416f, 1.1031f, 5.13666f, 0.855816f);
            path2.cubicTo(5.84834f, 0.525282f, 6.69848f, 0.814971f, 7.03533f, 1.31129f);
            instancePath.close();
            instancePath.moveTo(6.45618f, 1.70445f);
            Path path3 = instancePath;
            path3.cubicTo(6.28824f, 1.457f, 5.7931f, 1.32277f, 5.43151f, 1.49071f);
            path3.cubicTo(5.22295f, 1.58756f, 5.19522f, 1.65574f, 5.16769f, 2.43201f);
            path3.cubicTo(5.15988f, 2.65196f, 5.15878f, 2.68031f, 5.15429f, 2.77506f);
            path3.cubicTo(5.11752f, 3.55251f, 5.07927f, 3.84335f, 4.95355f, 4.1763f);
            path3.cubicTo(4.73801f, 4.74623f, 4.42065f, 5.12001f, 3.90758f, 5.42082f);
            path3.cubicTo(3.62439f, 5.58687f, 3.42623f, 5.68789f, 3.23028f, 5.75567f);
            instancePath.lineTo(3.23028f, 10.5837f);
            Path path4 = instancePath;
            path4.cubicTo(5.46412f, 10.5937f, 6.53906f, 10.5889f, 6.79256f, 10.5682f);
            path4.cubicTo(6.93221f, 10.5567f, 7.08779f, 10.5562f, 7.2455f, 10.5556f);
            path4.cubicTo(7.63826f, 10.5541f, 8.04418f, 10.5526f, 8.2499f, 10.3832f);
            path4.cubicTo(9.21713f, 9.587f, 10.0689f, 6.55969f, 9.54502f, 5.39242f);
            path4.cubicTo(9.47664f, 5.24004f, 9.32543f, 5.1164f, 9.05991f, 5.02055f);
            path4.cubicTo(8.83816f, 4.94051f, 7.72418f, 4.89951f, 7.54145f, 4.89615f);
            path4.cubicTo(7.34901f, 4.8993f, 7.12852f, 4.84916f, 6.94402f, 4.73556f);
            path4.cubicTo(6.69075f, 4.57961f, 6.72039f, 4.31524f, 6.75763f, 3.9832f);
            instancePath.lineTo(6.75763f, 3.9832f);
            Path path5 = instancePath;
            path5.cubicTo(6.77238f, 3.8516f, 6.78833f, 3.70938f, 6.78833f, 3.55907f);
            path5.cubicTo(6.78833f, 2.4875f, 6.70748f, 2.07464f, 6.45618f, 1.70445f);
            instancePath.close();
            instancePath.moveTo(2.53028f, 10.5802f);
            instancePath.lineTo(2.53028f, 5.90263f);
            instancePath.cubicTo(2.35549f, 5.92364f, 2.18316f, 5.93339f, 2.00264f, 5.93339f);
            instancePath.lineTo(0.909091f, 5.93339f);
            instancePath.cubicTo(0.794097f, 5.93339f, 0.703924f, 6.02239f, 0.703924f, 6.12856f);
            instancePath.lineTo(0.703924f, 10.3755f);
            Path path6 = instancePath;
            path6.cubicTo(0.703924f, 10.4817f, 0.792674f, 10.57f, 0.906794f, 10.5707f);
            path6.cubicTo(1.4973f, 10.5745f, 2.03756f, 10.5777f, 2.53028f, 10.5802f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 2);
            canvas.drawPath(instancePath, instancePaint3);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
