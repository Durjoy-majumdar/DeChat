package com.tencent.p014mm.boot.svg.code.drawable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.os.Looper;
import com.tencent.p014mm.svg.WeChatSVGRenderC2Java;
import gi3.C24542c;

/* renamed from: com.tencent.mm.boot.svg.code.drawable.icons_outlined_pay_relative_cards */
public class icons_outlined_pay_relative_cards extends C24542c {
    private final int height = 72;
    private final int width = 72;

    public int doCommand(int i, Object... objArr) {
        if (i == 0 || i == 1) {
            return 72;
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
            C24542c.instancePaint(instancePaint2, looper).setStrokeWidth(1.0f);
            Paint instancePaint3 = C24542c.instancePaint(instancePaint, looper);
            instancePaint3.setColor(-16777216);
            canvas.save();
            Paint instancePaint4 = C24542c.instancePaint(instancePaint3, looper);
            Path instancePath = C24542c.instancePath(looper);
            instancePath.moveTo(56.592087f, 35.97888f);
            Path path = instancePath;
            path.cubicTo(61.70004f, 27.486708f, 62.72275f, 19.19929f, 58.74144f, 15.2179785f);
            path.cubicTo(55.46987f, 11.946408f, 49.079556f, 11.949425f, 41.70219f, 15.381715f);
            path.cubicTo(40.80085f, 15.801059f, 39.730225f, 15.410326f, 39.310883f, 14.508987f);
            path.cubicTo(38.891537f, 13.60765f, 39.282272f, 12.537025f, 40.18361f, 12.1176815f);
            path.cubicTo(48.78105f, 8.117754f, 56.728634f, 8.114002f, 61.287025f, 12.672394f);
            path.cubicTo(66.818085f, 18.203457f, 65.51732f, 28.549473f, 59.211063f, 38.59786f);
            instancePath.lineTo(62.896614f, 42.28341f);
            instancePath.cubicTo(64.18534f, 43.57214f, 64.18534f, 45.661583f, 62.896614f, 46.950314f);
            instancePath.lineTo(46.350315f, 63.496613f);
            instancePath.cubicTo(45.061584f, 64.78534f, 42.972137f, 64.78534f, 41.68341f, 63.496613f);
            instancePath.lineTo(36.71004f, 58.523243f);
            Path path2 = instancePath;
            path2.cubicTo(28.557037f, 62.122017f, 20.831083f, 62.160435f, 16.315035f, 57.644386f);
            path2.cubicTo(13.156818f, 54.486168f, 12.167264f, 49.664356f, 13.251567f, 44.057835f);
            path2.cubicTo(13.4403305f, 43.08181f, 14.38458f, 42.443607f, 15.360606f, 42.63237f);
            path2.cubicTo(16.336632f, 42.821133f, 16.974834f, 43.765385f, 16.786072f, 44.74141f);
            path2.cubicTo(15.9098015f, 49.272278f, 16.652359f, 52.89054f, 18.860619f, 55.0988f);
            path2.cubicTo(21.944517f, 58.182697f, 27.612057f, 58.264206f, 33.957127f, 55.770332f);
            instancePath.lineTo(8.166548f, 29.979752f);
            instancePath.cubicTo(6.8778176f, 28.691021f, 6.8778176f, 26.601576f, 8.166548f, 25.312847f);
            instancePath.lineTo(24.712847f, 8.766547f);
            instancePath.cubicTo(26.001577f, 7.4778175f, 28.09102f, 7.4778175f, 29.379751f, 8.766547f);
            instancePath.lineTo(56.592087f, 35.97888f);
            instancePath.lineTo(56.592087f, 35.97888f);
            instancePath.close();
            instancePath.moveTo(54.57062f, 39.048588f);
            instancePath.lineTo(27.046299f, 11.524264f);
            instancePath.lineTo(10.924264f, 27.6463f);
            instancePath.lineTo(37.44843f, 54.170464f);
            Path path3 = instancePath;
            path3.cubicTo(41.35158f, 52.131588f, 45.37395f, 49.199467f, 49.10803f, 45.46539f);
            path3.cubicTo(51.18134f, 43.392082f, 53.007412f, 41.229897f, 54.57062f, 39.048588f);
            instancePath.lineTo(54.57062f, 39.048588f);
            instancePath.close();
            instancePath.moveTo(57.14948f, 41.627445f);
            path3.cubicTo(55.54426f, 43.81279f, 53.705826f, 45.958763f, 51.653614f, 48.010975f);
            path3.cubicTo(47.999847f, 51.66474f, 44.048866f, 54.64086f, 40.107647f, 56.82968f);
            instancePath.lineTo(44.01686f, 60.738895f);
            instancePath.lineTo(60.138897f, 44.616863f);
            instancePath.lineTo(57.14948f, 41.627445f);
            instancePath.lineTo(57.14948f, 41.627445f);
            instancePath.close();
            WeChatSVGRenderC2Java.setFillType(instancePath, 1);
            canvas.drawPath(instancePath, instancePaint4);
            canvas.restore();
            C24542c.done(looper);
        }
        return 0;
    }
}
